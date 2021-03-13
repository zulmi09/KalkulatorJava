import java.util.Scanner;

public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Angka Pertama : ");
        int a = input.nextInt();

        System.out.print("Angka Kedua : ");
        int b = input.nextInt();

        int tambah = a + b ;
        int kurang = a - b ;
        int kali = a * b ;
        float bagi = (float) a / b ;

        System.out.println("\nPenjumlahan :"+tambah);
        System.out.println("\nPengurangan :"+kurang);
        System.out.println("\nPerkalian :"+kali);
        System.out.println("\nPembagian :"+bagi);
    }
}

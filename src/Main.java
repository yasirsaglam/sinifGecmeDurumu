import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat, fizik, kimya, turkce, muzik, ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz. (0-100) : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz. (0-100) : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz. (0-100) : ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz. (0-100) : ");
        turkce = input.nextInt();
        System.out.print("Müzik notunuzu giriniz. (0-100) : ");
        muzik = input.nextInt();
        if ((mat >= 0 && 100 >= mat) && (turkce >= 0 && 100 >= turkce) && (fizik >= 0 && 100 >= fizik) && (kimya >= 0 && 100 >= kimya) && (muzik >= 0 && 100 >= muzik)) {
            ort = (mat + fizik + kimya + turkce + muzik) / 5;
            if (ort >= 55.0) {
                System.out.println("Tebrikler sınıfı geçtiniz. Ortalamanız : " + ort);
            } else {
                System.out.println("Sınıfta kaldınız. Ortalamanız : " + ort);
            }
        } else {
            System.out.println("Girdiğiniz notların 0-100 arasında olduğunu kontrol ediniz.");
        }
    }
}

package vn;

/* loaded from: classes11.dex */
public abstract class a {
    public static int a(int i17, int i18) {
        switch (i17) {
            case 0:
            case 2:
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
                return 31;
            case 1:
                return ((i18 % 4 != 0 || i18 % 100 == 0) && i18 % 400 != 0) ? 28 : 29;
            case 3:
            case 5:
            case 8:
            case 10:
                return 30;
            default:
                throw new java.lang.IllegalArgumentException("Invalid Month");
        }
    }
}

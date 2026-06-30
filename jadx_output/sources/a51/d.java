package a51;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a51.d f1572a = new a51.d();

    public final boolean a(java.lang.String str, int i17, int i18) {
        int i19 = i18 + i17;
        while (true) {
            boolean z17 = true;
            if (i17 >= i19) {
                return true;
            }
            char charAt = str.charAt(i17);
            if (!('0' <= charAt && charAt < ':')) {
                if (!('a' <= charAt && charAt < 'g')) {
                    if (!('A' <= charAt && charAt < 'G')) {
                        z17 = false;
                    }
                }
            }
            if (!z17) {
                return false;
            }
            i17++;
        }
    }

    public final boolean b(java.lang.String str) {
        return str != null && str.length() == 55 && str.charAt(0) == '0' && str.charAt(1) == '0' && str.charAt(2) == '-' && str.charAt(35) == '-' && str.charAt(52) == '-' && a(str, 3, 32) && a(str, 36, 16) && a(str, 53, 2);
    }
}

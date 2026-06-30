package r26;

/* loaded from: classes13.dex */
public abstract class j {
    public static final boolean a(java.lang.String str) {
        for (int i17 = 0; i17 < str.length(); i17++) {
            char charAt = str.charAt(i17);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.i(charAt, 128) >= 0 || java.lang.Character.isLetter(charAt)) {
                return true;
            }
        }
        return false;
    }
}

package gf;

/* loaded from: classes5.dex */
public final class j2 {
    public j2(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final gf.k2 a(java.lang.String value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        int length = value.length();
        int length2 = value.length() - 1;
        if (length2 >= 0) {
            while (true) {
                int i17 = length2 - 1;
                if (java.lang.Character.isDigit(value.charAt(length2))) {
                    length = java.lang.Math.min(length2 + 1, value.length());
                    break;
                }
                if (i17 < 0) {
                    break;
                }
                length2 = i17;
            }
        }
        java.lang.String substring = value.substring(0, length);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        int[] iArr = {0, 0, 0};
        java.util.List e07 = r26.n0.e0(substring, new char[]{'.'}, false, 0, 6, null);
        for (int i18 = 0; i18 < 3; i18++) {
            iArr[i18] = java.lang.Integer.parseInt((java.lang.String) e07.get(i18));
        }
        return new gf.k2(iArr);
    }
}

package lo0;

/* loaded from: classes14.dex */
public final class q0 {
    public q0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final lo0.r0 a(java.lang.String semverString) {
        java.lang.String str;
        jz5.u b17;
        java.lang.String str2;
        jz5.u b18;
        java.lang.String str3;
        jz5.u b19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(semverString, "semverString");
        if (semverString.length() == 0) {
            return null;
        }
        r26.m d17 = lo0.r0.f401604d.d(semverString);
        if (d17 == null) {
            return null;
        }
        r26.q qVar = (r26.q) d17;
        r26.k e17 = ((r26.p) qVar.f450444c).e(1);
        if (e17 != null && (str = e17.f450433a) != null && (b17 = r26.q0.b(str, 10)) != null) {
            int i17 = b17.f384381d;
            r26.p pVar = (r26.p) qVar.f450444c;
            r26.k e18 = pVar.e(2);
            if (e18 != null && (str2 = e18.f450433a) != null && (b18 = r26.q0.b(str2, 10)) != null) {
                int i18 = b18.f384381d;
                r26.k e19 = pVar.e(3);
                if (e19 != null && (str3 = e19.f450433a) != null && (b19 = r26.q0.b(str3, 10)) != null) {
                    int i19 = b19.f384381d;
                    r26.k e27 = pVar.e(4);
                    java.lang.String str4 = e27 != null ? e27.f450433a : null;
                    r26.k e28 = pVar.e(5);
                    return new lo0.r0(i17, i18, i19, str4, e28 != null ? e28.f450433a : null, null);
                }
            }
        }
        return null;
    }
}

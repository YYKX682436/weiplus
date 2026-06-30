package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

/* loaded from: classes7.dex */
public abstract class q2 {
    public static final int a(int i17) {
        int i18 = 0;
        for (int i19 = 0; i19 < 32 && i17 != 0; i19++) {
            int i27 = i17 & 1;
            if (i27 > 0) {
                i18 += i27 * ((int) java.lang.Math.pow(10.0d, i19));
            }
            i17 /= 2;
        }
        return i18;
    }

    public static final java.lang.String b(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        be1.y E = be1.z.E(context);
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p2.f169664a[E.ordinal()] == 1 ? "offline" : E.f101073d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "let(...)");
        return str;
    }

    public static /* synthetic */ java.lang.String c(android.content.Context context, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = null;
        }
        return b(context);
    }
}

package com.tencent.mm.plugin.appbrand.report;

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
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        be1.y E = be1.z.E(context);
        java.lang.String str = com.tencent.mm.plugin.appbrand.report.p2.f88131a[E.ordinal()] == 1 ? "offline" : E.f19540d;
        kotlin.jvm.internal.o.f(str, "let(...)");
        return str;
    }

    public static /* synthetic */ java.lang.String c(android.content.Context context, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = null;
        }
        return b(context);
    }
}

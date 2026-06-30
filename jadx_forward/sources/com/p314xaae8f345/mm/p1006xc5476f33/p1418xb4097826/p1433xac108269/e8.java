package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes2.dex */
public final class e8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 f183664a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8();

    public final int a() {
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        if (d()) {
            return i18;
        }
        if (i18 >= i17) {
            i17 = i18;
        }
        return i17;
    }

    public final int b(android.content.Context context) {
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        int i17 = b17.x;
        int i18 = b17.y;
        if (d()) {
            return i18 - c17;
        }
        if (i18 >= i17) {
            i17 = i18;
        }
        return i17 - c17;
    }

    public final int c(android.content.Context context) {
        int i17;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(context);
        boolean d17 = d();
        int i18 = a17.f278668a;
        return (!d17 && i18 > (i17 = a17.f278669b)) ? i17 : i18;
    }

    public final boolean d() {
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return z17;
    }
}

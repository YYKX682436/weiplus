package l44;

/* loaded from: classes.dex */
public abstract class o5 {
    public static void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h hVar, java.lang.String str, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ScanJumpHelper", "jumpScanUI, jumpInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ScanJumpHelper", "jumpScanUI, desc=" + hVar.f247540a + ", gestureId=" + hVar.f247541b + ", uxinfo=" + str);
        b(hVar, "");
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196 c17265xca2bb196 = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.api.C17265xca2bb196();
        c17265xca2bb196.f240201m = 5;
        c17265xca2bb196.f240202n = 1;
        c17265xca2bb196.f240195d = true;
        c17265xca2bb196.f240196e = true;
        c17265xca2bb196.f240197f = true;
        c17265xca2bb196.f240198g = true;
        c17265xca2bb196.f240199h = true;
        c17265xca2bb196.f240209u = false;
        c17265xca2bb196.f240210v = true;
        c17265xca2bb196.f240208t = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 514);
        c17265xca2bb196.f240207s = hVar.f247540a;
        c17265xca2bb196.f240204p = za4.t0.k(hVar.f38332xfc43bd79);
        c17265xca2bb196.f240206r = za4.t0.k(hVar.f38333x1607d665);
        c17265xca2bb196.f240205q = za4.t0.k(hVar.f38334x5c2163b8);
        if (c17265xca2bb196.f240200i == null) {
            c17265xca2bb196.f240200i = new android.os.Bundle();
        }
        c17265xca2bb196.f240200i.putString("key_sns_ad_ux_info", str);
        java.lang.String valueOf = java.lang.String.valueOf(hVar.f247541b);
        if (c17265xca2bb196.f240200i == null) {
            c17265xca2bb196.f240200i = new android.os.Bundle();
        }
        c17265xca2bb196.f240200i.putString("key_gesture_id", valueOf);
        ((yz3.w) ((ry3.j) i95.n0.c(ry3.j.class))).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (i17 == 7) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1898, 8);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(1898, 9);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("jumpScanUI", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
    }

    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.h hVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("preloadScanRes", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
        if (hVar != null) {
            n74.v1.i(hVar.f38332xfc43bd79, str, "preloadScanRes bgImage");
            n74.v1.i(hVar.f38333x1607d665, str, "preloadScanRes descIcon");
            n74.v1.i(hVar.f38334x5c2163b8, str, "preloadScanRes succIcon");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("preloadScanRes", "com.tencent.mm.plugin.sns.ad.helper.ScanJumpHelper");
    }
}

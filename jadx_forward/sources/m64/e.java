package m64;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final m64.e f405926a = new m64.e();

    /* renamed from: b, reason: collision with root package name */
    public static final n64.a f405927b;

    static {
        n64.a aVar = new n64.a();
        aVar.e(m64.c.f405923d);
        f405927b = aVar;
    }

    public final boolean a(android.content.Context context, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        if (list == null || list.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
            return false;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            n64.f fVar = (n64.f) it.next();
            java.util.Objects.toString(fVar);
            if (fVar instanceof n64.c) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ad.p2088x5862d14.C17702x544f64e9 c17 = ((n64.c) fVar).c();
                if (c17 != null && c17.f244104b == 23) {
                    boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                    long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
                    q80.e0 e0Var = new q80.e0();
                    e0Var.f442208a = "wxalite0c45e912005759856ea55eb382e8c509";
                    e0Var.f442209b = "";
                    e0Var.f442211d = true;
                    q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
                    if (g0Var != null) {
                        ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).Rj(context, e0Var);
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdVangoghCanvasPreloader", "preloadLiteApp, cost=" + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46369x2e1760d, 114);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
                    return true;
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doPreloadClickInfoList", "com.tencent.mm.plugin.sns.ad.preload.AdVangoghCanvasPreloader");
        return false;
    }
}

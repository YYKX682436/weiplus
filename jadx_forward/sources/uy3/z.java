package uy3;

/* loaded from: classes8.dex */
public final class z {

    /* renamed from: b, reason: collision with root package name */
    public static volatile com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee f513536b;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f513538d;

    /* renamed from: a, reason: collision with root package name */
    public static final uy3.z f513535a = new uy3.z();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f513537c = new java.lang.Object();

    static {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoxWebViewPreloadManager", "init enablePreloadWebView enablePreload: true, enablePreloadAfterGet: true, enablePreloadFromFindTab: false");
        java.lang.System.currentTimeMillis();
        f513538d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        java.lang.System.currentTimeMillis();
    }

    public static final synchronized void a(long j17) {
        synchronized (uy3.z.class) {
            if (f513536b != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoxWebViewPreloadManager", "MultiWebView-Trace destroy 1 webView for ScannerWebView");
                com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = f513536b;
                if (c12962xa24d9bee != null) {
                    c12962xa24d9bee.mo52095x5cd39ffa();
                }
                f513536b = null;
            }
        }
    }

    public static final void b(int i17, long j17) {
        if (i17 == 1 || i17 == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BoxWebViewPreloadManager", "try preloadBoxWebView delay: %d", java.lang.Long.valueOf(j17));
            uy3.w wVar = uy3.w.f513532d;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = f513538d;
            if (n3Var != null) {
                n3Var.mo50297x7c4d7ca2(new uy3.y(wVar), j17);
            }
        }
    }
}

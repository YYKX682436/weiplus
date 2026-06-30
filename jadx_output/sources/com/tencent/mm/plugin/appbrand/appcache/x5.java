package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public abstract class x5 {

    /* renamed from: a, reason: collision with root package name */
    public static volatile boolean f76050a;

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.SparseLongArray f76051b = new android.util.SparseLongArray();

    /* renamed from: c, reason: collision with root package name */
    public static final long f76052c = java.util.concurrent.TimeUnit.SECONDS.toMillis(30);

    static {
        new java.util.concurrent.atomic.AtomicInteger(0);
    }

    public static void a(java.lang.String str) {
        long j17;
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.PkgNetworkOpt", "preConnectHost with EMPTY url");
            return;
        }
        android.util.SparseLongArray sparseLongArray = f76051b;
        synchronized (sparseLongArray) {
            j17 = sparseLongArray.get(str.hashCode(), 0L);
        }
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (java.lang.System.currentTimeMillis() - j17 < f76052c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PkgNetworkOpt", "preConnectHost, hit interval control, url:%s, lastPreConnectedTimestamp:%d", str, java.lang.Long.valueOf(j17));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.PkgNetworkOpt", "preConnectHost, task start, url:%s", str);
        if (((com.tencent.mm.plugin.appbrand.fc) i95.n0.c(com.tencent.mm.plugin.appbrand.fc.class)).deliveryInstalled()) {
            rc.c cVar = rc.b.f393906a;
            org.chromium.net.CronetEngine cronetEngine = cVar.f393907a;
            com.tencent.mm.plugin.appbrand.appcache.v5 v5Var = new com.tencent.mm.plugin.appbrand.appcache.v5();
            v5Var.addCompletionListener((org.chromium.net.apihelpers.CronetRequestCompletionListener<? super byte[]>) new com.tencent.mm.plugin.appbrand.appcache.w5(str));
            cronetEngine.newUrlRequestBuilder(str, v5Var, cVar.f393908b).setHttpMethod("HEAD").build().start();
        }
    }

    public static void b() {
        if (!(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_appbrand_weapp_core_pkg_download, 0) == 1)) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            if (f76050a) {
                return;
            }
            f76050a = true;
            ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.appbrand.appcache.u5());
            return;
        }
        java.lang.String url = com.tencent.mm.plugin.appbrand.config.AppBrandGlobalSystemConfig.b().f77220r;
        if (android.text.TextUtils.isEmpty(url)) {
            return;
        }
        com.tencent.mm.weapp_core.WeAppDownloader weAppDownloader = com.tencent.mm.plugin.appbrand.yf.f92429a;
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.appbrand.yf.f92429a.preConnect(url);
    }
}

package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes7.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.task.x0 f89216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.x6 f89217e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.v1 f89218f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f89219g;

    public y(com.tencent.mm.plugin.appbrand.task.x0 x0Var, com.tencent.mm.plugin.appbrand.service.x6 x6Var, com.tencent.luggage.sdk.jsapi.component.service.v1 v1Var, int i17) {
        this.f89216d = x0Var;
        this.f89217e = x6Var;
        this.f89218f = v1Var;
        this.f89219g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        try {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "preInit start");
            com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler appBrandPreloadProfiler = (com.tencent.mm.plugin.appbrand.task.AppBrandPreloadProfiler) com.tencent.mm.plugin.appbrand.task.r.f89164e.get(this.f89216d);
            appBrandPreloadProfiler.getClass();
            appBrandPreloadProfiler.f88983i = android.os.SystemClock.elapsedRealtime();
            ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
            com.tencent.mm.plugin.expansions.i0.f(true);
            com.tencent.mm.sdk.platformtools.u3.m(-2);
            try {
                com.tencent.mm.plugin.appbrand.appcache.e8.c(true);
                com.tencent.mm.plugin.appbrand.jsruntime.u1.a();
                com.tencent.mm.plugin.appbrand.jsruntime.u1.c();
                if (com.tencent.mm.plugin.appbrand.appcache.y7.f76065a.d() && (com.tencent.mm.plugin.appbrand.appcache.e8.b() instanceof com.tencent.mm.plugin.appbrand.appcache.AssetReader)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "skip preload runtime, not find commLib");
                    com.tencent.mm.plugin.appbrand.task.r.n(this.f89216d);
                } else if (this.f89216d == com.tencent.mm.plugin.appbrand.task.x0.WAGAME) {
                    com.tencent.mm.plugin.appbrand.task.r.a(this.f89217e, this.f89218f);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "[wagame] misc preload done");
                } else {
                    cf.d dVar = new cf.d(new com.tencent.mm.plugin.appbrand.task.s(this), 2);
                    if (this.f89219g >= 2) {
                        com.tencent.mm.plugin.appbrand.task.t tVar = new com.tencent.mm.plugin.appbrand.task.t(this, dVar);
                        boolean z18 = com.tencent.mm.plugin.appbrand.da.f77575a;
                        synchronized (com.tencent.mm.plugin.appbrand.da.class) {
                            z17 = com.tencent.mm.plugin.appbrand.da.f77576b;
                        }
                        if (z17) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "XWebPreloader preloaded, trigger preloadAppBrandRuntime");
                            com.tencent.mm.sdk.platformtools.u3.h(tVar);
                        } else {
                            com.tencent.mm.plugin.appbrand.da.c(new com.tencent.mm.plugin.appbrand.task.u(this, java.lang.System.currentTimeMillis(), tVar));
                        }
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "run: skip preload webView");
                        dVar.a();
                    }
                    com.tencent.mm.plugin.appbrand.task.w wVar = new com.tencent.mm.plugin.appbrand.task.w(this, dVar);
                    if (this.f89219g < 2) {
                        wVar.run();
                    } else {
                        ((ku5.t0) ku5.t0.f312615d).h(wVar, "MicroMsg.AppBrandProcessPreloader[applaunch][preload]_AppBrandServicePreloadWorker");
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandProcessPreloader[applaunch][preload]", "skip preload runtime, load CommLib get exception %s", android.util.Log.getStackTraceString(th6));
                com.tencent.mm.plugin.appbrand.task.r.n(this.f89216d);
            }
        } finally {
            try {
            } finally {
            }
        }
    }
}

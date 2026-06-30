package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class h3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final long f78260d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.i3 f78261e;

    public h3(com.tencent.mm.plugin.appbrand.i3 i3Var) {
        this.f78261e = i3Var;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f78260d = android.os.SystemClock.elapsedRealtime();
    }

    @Override // java.lang.Runnable
    public void run() {
        sj1.l.h(this.f78261e.f78330e.f74805p.f77278d, this.f78261e.f78330e.J1);
        sj1.l.h(this.f78261e.f78330e.f74805p.f77278d, this.f78261e.f78330e.f74805p.f77290s);
        if (this.f78261e.f78329d) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "PrepareAllDoneInitNotify.done() hash[%d] check2 dead appId[%s]", java.lang.Integer.valueOf(hashCode()), this.f78261e.f78330e.f74803n);
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f78261e.f78330e;
        appBrandRuntime.L1 = null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        appBrandRuntime.K("RuntimePrepareAllDoneInitNotify run() waited %dms", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f78260d));
        com.tencent.mm.plugin.appbrand.i3 i3Var = this.f78261e;
        i3Var.getClass();
        try {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = i3Var.f78330e;
            appBrandRuntime2.f74799h.dump(appBrandRuntime2.f74800i, "AppBrandRuntimeProfile|dump mUiHandler");
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime_$_RuntimePrepareAllDoneInitNotify", "dumpUiThreadInQueueMessages get exception:%s", th6);
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = this.f78261e.f78330e;
        sj1.l.i(appBrandRuntime3.f74805p.f77278d, "internal:prepare", "AppBrandRuntime#initRuntime");
        if (!appBrandRuntime3.L0()) {
            if (appBrandRuntime3.J0()) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntime", "initRuntime, mInitialized TRUE !!!  go check callee %s", com.tencent.mm.sdk.platformtools.z3.c(new java.lang.Throwable()));
            } else {
                appBrandRuntime3.K("initRuntime", new java.lang.Object[0]);
                new com.tencent.mm.plugin.appbrand.c2(appBrandRuntime3).run();
            }
        }
        sj1.l.g(this.f78261e.f78330e.f74803n);
    }
}

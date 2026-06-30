package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class r5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87754f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC f87755g;

    public r5(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC, java.lang.Runnable runnable, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2) {
        this.f87755g = appBrandRuntimeContainerWC;
        this.f87752d = runnable;
        this.f87753e = appBrandRuntime;
        this.f87754f = appBrandRuntime2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.q5 q5Var = new com.tencent.mm.plugin.appbrand.q5(this);
        com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC appBrandRuntimeContainerWC = this.f87755g;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f87753e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f87754f;
        android.util.SparseIntArray sparseIntArray = com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainerWC.C;
        appBrandRuntimeContainerWC.getClass();
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = appBrandRuntime == null ? "null" : appBrandRuntime.f74803n;
        objArr[1] = appBrandRuntime2.f74803n;
        objArr[2] = java.lang.Boolean.valueOf(appBrandRuntime2.S);
        objArr[3] = java.lang.Boolean.valueOf(appBrandRuntime2.R());
        objArr[4] = java.lang.Boolean.valueOf(appBrandRuntimeContainerWC.f74844w);
        objArr[5] = java.lang.Integer.valueOf(appBrandRuntimeContainerWC.getStackSize());
        com.tencent.mars.xlog.Log.i("Luggage.AppBrandRuntimeContainerLU[AppBrandSplashAd]", "onRuntimeClose entered, in.appId[%s], out.appId[%s], out.isFinishing[%b], out.canDoCloseAnimation[%b], mIsActivityPaused[%b], stackSize[%d]", objArr);
        ze.k kVar = new ze.k(appBrandRuntimeContainerWC, appBrandRuntime, appBrandRuntime2, q5Var);
        if (appBrandRuntimeContainerWC.f74844w) {
            appBrandRuntime2.f74817x1 = false;
        }
        if (!appBrandRuntime2.S) {
            if (appBrandRuntimeContainerWC.getStackSize() <= 1) {
                if (!(appBrandRuntimeContainerWC.A > 0)) {
                    appBrandRuntimeContainerWC.c0(true);
                    return;
                }
            }
            if (appBrandRuntime2.R()) {
                ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).l(appBrandRuntime, null, appBrandRuntime2, kVar);
                return;
            } else {
                kVar.run();
                return;
            }
        }
        if (!appBrandRuntimeContainerWC.n(appBrandRuntime2)) {
            kVar.run();
            return;
        }
        if (appBrandRuntimeContainerWC.getStackSize() <= 1) {
            if (!(appBrandRuntimeContainerWC.A > 0)) {
                appBrandRuntimeContainerWC.c0(false);
                return;
            }
        }
        if (appBrandRuntime2.R()) {
            ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).l(appBrandRuntime, null, appBrandRuntime2, kVar);
        } else {
            kVar.run();
        }
    }
}

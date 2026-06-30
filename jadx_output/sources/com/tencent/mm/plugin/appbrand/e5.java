package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class e5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f77990d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f77991e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.f5 f77992f;

    public e5(com.tencent.mm.plugin.appbrand.f5 f5Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Runnable runnable) {
        this.f77992f = f5Var;
        this.f77990d = appBrandRuntime;
        this.f77991e = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        com.tencent.mm.plugin.appbrand.f5 f5Var = this.f77992f;
        boolean z17 = f5Var.f78043e.f84226m.peekFirst() == f5Var.f78042d;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f77990d;
        if (appBrandRuntime2 != null) {
            appBrandRuntime2.n1(this.f77992f.f78042d.u0(), null);
        } else {
            this.f77992f.f78042d.k0(null);
        }
        this.f77991e.run();
        if (z17 && (appBrandRuntime = this.f77990d) != null) {
            appBrandRuntime.h0();
            if (this.f77992f.f78043e.f84221e) {
                this.f77990d.i0();
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = this.f77990d;
        objArr[1] = appBrandRuntime3 == null ? "null" : appBrandRuntime3.f74803n;
        objArr[2] = java.lang.Boolean.valueOf(this.f77992f.f78043e.f84221e);
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", objArr);
    }
}

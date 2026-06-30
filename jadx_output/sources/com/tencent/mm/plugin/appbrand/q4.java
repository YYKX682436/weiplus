package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class q4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87729d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f87730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f87731f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f87732g;

    public q4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2, java.lang.Runnable runnable) {
        this.f87732g = appBrandRuntimeContainer;
        this.f87729d = appBrandRuntime;
        this.f87730e = appBrandRuntime2;
        this.f87731f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        boolean z17 = (this.f87732g.f74839r.peekFirst() == this.f87729d) || this.f87732g.M(this.f87729d);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f87730e;
        if (appBrandRuntime2 != null) {
            appBrandRuntime2.n1(this.f87729d.u0(), null);
        } else {
            this.f87729d.k0(null);
        }
        this.f87731f.run();
        if (z17 && (appBrandRuntime = this.f87730e) != null) {
            appBrandRuntime.h0();
            if (this.f87732g.f74843v) {
                this.f87730e.i0();
            }
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(z17);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = this.f87730e;
        objArr[1] = appBrandRuntime3 == null ? "null" : appBrandRuntime3.f74803n;
        objArr[2] = java.lang.Boolean.valueOf(this.f87732g.f74843v);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "removeImpl closeTask.run(), outIsTopOfStackBefore[%b], below.appId[%s], mIsActivityResumed[%b]", objArr);
    }
}

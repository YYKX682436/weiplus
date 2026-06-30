package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class w4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f90943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f90944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f90945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer f90946g;

    public w4(com.tencent.mm.plugin.appbrand.AppBrandRuntimeContainer appBrandRuntimeContainer, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, java.lang.Object obj, java.lang.Runnable runnable) {
        this.f90946g = appBrandRuntimeContainer;
        this.f90943d = appBrandRuntime;
        this.f90944e = obj;
        this.f90945f = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!(this.f90946g.f74839r.peekFirst() == this.f90943d) && !this.f90946g.M(this.f90943d)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandRuntimeContainer", "close with appId(%s), not top of stack, ignore", this.f90943d.f74803n);
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime i17 = this.f90946g.i(this.f90943d);
        if (i17 != null) {
            i17.n1(this.f90943d.u0(), this.f90944e);
        } else {
            this.f90943d.k0(this.f90944e);
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f90943d.f74803n;
        objArr[1] = i17 == null ? "null" : i17.f74803n;
        objArr[2] = java.lang.Boolean.valueOf(this.f90946g.f74843v);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "close before run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", objArr);
        this.f90946g.R(i17, this.f90943d, new com.tencent.mm.plugin.appbrand.v4(this, i17));
    }
}

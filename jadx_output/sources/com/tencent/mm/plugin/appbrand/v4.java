package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class v4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f90643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.w4 f90644e;

    public v4(com.tencent.mm.plugin.appbrand.w4 w4Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f90644e = w4Var;
        this.f90643d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime;
        this.f90644e.f90943d.f74810s.setVisibility(8);
        com.tencent.mm.plugin.appbrand.w4 w4Var = this.f90644e;
        w4Var.f90946g.f74839r.remove(w4Var.f90943d);
        if (this.f90644e.f90943d.f74797f.size() >= 2) {
            com.tencent.mm.plugin.appbrand.w4 w4Var2 = this.f90644e;
            w4Var2.f90943d.A1(w4Var2.f90946g, com.tencent.mm.plugin.appbrand.PopPageStackType.Call_Runtime_Close);
        } else {
            com.tencent.mm.plugin.appbrand.w4 w4Var3 = this.f90644e;
            if (!w4Var3.f90946g.f74839r.contains(w4Var3.f90943d)) {
                com.tencent.mm.plugin.appbrand.w4 w4Var4 = this.f90644e;
                w4Var4.f90946g.f74840s.put(w4Var4.f90943d.f74803n, this.f90644e.f90943d);
            }
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f90643d;
        if (appBrandRuntime2 != null) {
            this.f90644e.f90946g.V(appBrandRuntime2, false);
            this.f90644e.f90946g.W(this.f90643d);
        }
        this.f90644e.f90943d.f0();
        com.tencent.mm.plugin.appbrand.w4 w4Var5 = this.f90644e;
        if (!w4Var5.f90946g.f74839r.contains(w4Var5.f90943d)) {
            this.f90644e.f90943d.d1();
        }
        if (this.f90644e.f90946g.f74843v && (appBrandRuntime = this.f90643d) != null) {
            appBrandRuntime.i0();
        }
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = this.f90644e.f90943d.f74803n;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime3 = this.f90643d;
        objArr[1] = appBrandRuntime3 == null ? "null" : appBrandRuntime3.f74803n;
        objArr[2] = java.lang.Boolean.valueOf(this.f90644e.f90946g.f74843v);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeContainer", "close run(), out.appId[%s], willAppear.appId[%s], mIsActivityResumed[%b]", objArr);
        java.lang.Runnable runnable = this.f90644e.f90945f;
        if (runnable != null) {
            runnable.run();
        }
    }
}

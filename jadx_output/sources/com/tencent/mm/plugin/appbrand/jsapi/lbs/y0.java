package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes7.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f81514d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 f81515e;

    public y0(com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f81515e = c1Var;
        this.f81514d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.c1 c1Var = this.f81515e;
        java.lang.Runnable runnable = c1Var.f81397d;
        if (runnable != null) {
            c1Var.f81396c.removeCallbacks(runnable);
            c1Var.f81397d = null;
        }
        if (c1Var.f81395b != null) {
            c1Var.f81394a = java.lang.System.currentTimeMillis();
        } else {
            c1Var.f81395b = mi1.c.a(this.f81514d).h(mi1.d.LBS);
            c1Var.f81394a = java.lang.System.currentTimeMillis();
        }
    }
}

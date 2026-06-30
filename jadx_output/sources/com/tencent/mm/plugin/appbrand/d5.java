package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class d5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.f5 f77566d;

    public d5(com.tencent.mm.plugin.appbrand.f5 f5Var) {
        this.f77566d = f5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl, cleanupOut.run(), appId[%s]", this.f77566d.f78042d.f74803n);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f77566d.f78042d;
        if (appBrandRuntime.V) {
            appBrandRuntime.f0();
        }
        this.f77566d.f78042d.d0();
        com.tencent.mm.plugin.appbrand.f5 f5Var = this.f77566d;
        f5Var.f78043e.f84224h.removeView(f5Var.f78042d.f74810s);
        com.tencent.mm.plugin.appbrand.f5 f5Var2 = this.f77566d;
        ((java.util.HashMap) f5Var2.f78043e.f84227n).remove(f5Var2.f78042d.f74803n);
        com.tencent.mm.plugin.appbrand.f5 f5Var3 = this.f77566d;
        f5Var3.f78043e.f84226m.remove(f5Var3.f78042d);
    }
}

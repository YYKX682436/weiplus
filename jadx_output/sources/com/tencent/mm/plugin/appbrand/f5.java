package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class f5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f78042d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.l5 f78043e;

    public f5(com.tencent.mm.plugin.appbrand.l5 l5Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f78043e = l5Var;
        this.f78042d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl entered appId[%s]", this.f78042d.f74803n);
        com.tencent.mm.plugin.appbrand.d5 d5Var = new com.tencent.mm.plugin.appbrand.d5(this);
        if (!this.f78043e.n(this.f78042d)) {
            com.tencent.mars.xlog.Log.i("Luggage.WXA.AppBrandRuntimeContainerViewImpl", "removeImpl appId[%s], not in runtime stack, just cleanup", this.f78042d.f74803n);
            d5Var.run();
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime i17 = this.f78043e.i(this.f78042d);
        com.tencent.mm.plugin.appbrand.e5 e5Var = new com.tencent.mm.plugin.appbrand.e5(this, i17, d5Var);
        com.tencent.mm.plugin.appbrand.l5 l5Var = this.f78043e;
        com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime = this.f78042d;
        ze.m mVar = (ze.m) l5Var;
        mVar.getClass();
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = i17 == null ? "null" : i17.f74803n;
        objArr[1] = appBrandRuntime.f74803n;
        com.tencent.mars.xlog.Log.i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "onRuntimeClose entered, in.appId[%s], out.appId[%s]", objArr);
        e5Var.run();
        if (mVar.getStackSize() > 1 || i17 != null) {
            if (appBrandRuntime.R()) {
                ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).l(i17, null, appBrandRuntime, null);
                return;
            }
            return;
        }
        android.app.Activity activity = mVar.getActivity();
        if (activity == null) {
            com.tencent.mars.xlog.Log.i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "closeActivity: fail");
        } else if (!activity.isFinishing()) {
            activity.moveTaskToBack(true);
            if (mVar.getStackSize() <= 0) {
                activity.overridePendingTransition(0, 0);
            } else {
                ((com.tencent.mm.plugin.appbrand.ui.u8) ((com.tencent.mm.plugin.appbrand.ui.dd) nd.f.a(com.tencent.mm.plugin.appbrand.ui.dd.class))).j(activity, null);
            }
        }
        com.tencent.mars.xlog.Log.i("Luggage.FULL.AppBrandRuntimeContainerViewImplLu", "onRuntimeClose: activity closed");
    }
}

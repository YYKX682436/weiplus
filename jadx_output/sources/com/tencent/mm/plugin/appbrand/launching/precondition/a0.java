package com.tencent.mm.plugin.appbrand.launching.precondition;

/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.plugin.appbrand.launching.a1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.precondition.d0 f84940a;

    public a0(com.tencent.mm.plugin.appbrand.launching.precondition.d0 d0Var) {
        this.f84940a = d0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.a1
    public boolean a(java.lang.String[] instanceIdHolder) {
        kotlin.jvm.internal.o.g(instanceIdHolder, "instanceIdHolder");
        com.tencent.mm.plugin.appbrand.task.h0 h0Var = com.tencent.mm.plugin.appbrand.task.u0.f89199h;
        com.tencent.mm.plugin.appbrand.task.u0 a17 = h0Var.a();
        com.tencent.mm.plugin.appbrand.launching.precondition.d0 d0Var = this.f84940a;
        com.tencent.luggage.sdk.processes.s d17 = a17.d(d0Var.f84950f);
        if (d17 == null) {
            instanceIdHolder[0] = d0Var.f84950f;
            return true;
        }
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        if (z65.c.a()) {
            iz5.a.a(2, d17.f47685b);
        }
        instanceIdHolder[0] = com.tencent.mm.plugin.appbrand.report.quality.u.f(d0Var.f84949e, d17.f47684a, true);
        com.tencent.luggage.sdk.processes.r.u(h0Var.a(), d17.f47684a, d17.f47685b, false, 4, null);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.p0
    /* renamed from: c */
    public void b(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPreRenderColdStartService.Loader", "run()-OnPreLaunchResultListener.onResult, result:" + i17 + " config:" + appBrandInitConfigWC);
        com.tencent.mm.plugin.appbrand.launching.precondition.d0 d0Var = this.f84940a;
        if (appBrandInitConfigWC == null) {
            l81.v0 v0Var = d0Var.f84952h;
            if (v0Var != null) {
                l81.v0.b(v0Var, -3, null, 2, null);
                return;
            }
            return;
        }
        d0Var.f84949e.b(appBrandInitConfigWC);
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = d0Var.f84949e;
        appBrandInitConfigWC.S = launchParcel.f84918u;
        appBrandInitConfigWC.V = launchParcel.f84920w;
        appBrandInitConfigWC.f77303p2 = launchParcel.G;
        appBrandInitConfigWC.f77311x2 = launchParcel.N;
        com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = launchParcel.f84914q;
        appBrandInitConfigWC.N1 = launchParamsOptional != null ? launchParamsOptional.f70419h : 0;
        appBrandInitConfigWC.H = launchParamsOptional != null ? launchParamsOptional.f70421m : null;
        com.tencent.mm.plugin.appbrand.launching.g0.a(appBrandInitConfigWC, appBrandStatObject);
        yz5.p pVar = d0Var.f84951g;
        if (pVar != null) {
            kotlin.jvm.internal.o.d(appBrandStatObject);
            pVar.invoke(appBrandInitConfigWC, appBrandStatObject);
        }
    }
}

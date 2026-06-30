package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public final class c9 implements com.tencent.mm.plugin.appbrand.launching.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel f77039a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.d9 f77040b;

    public c9(com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.d9 d9Var) {
        this.f77039a = launchParcel;
        this.f77040b = d9Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.o0
    public final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntimeWidgetImpl", "run()-OnPreLaunchResultListener.onResult, config:" + appBrandInitConfigWC);
        if (appBrandInitConfigWC != null) {
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = this.f77039a;
            launchParcel.b(appBrandInitConfigWC);
            appBrandInitConfigWC.S = launchParcel.f84918u;
            appBrandInitConfigWC.V = launchParcel.f84920w;
            appBrandInitConfigWC.f77303p2 = launchParcel.G;
            appBrandInitConfigWC.f77311x2 = launchParcel.N;
            com.tencent.mm.modelappbrand.LaunchParamsOptional launchParamsOptional = launchParcel.f84914q;
            appBrandInitConfigWC.N1 = launchParamsOptional != null ? launchParamsOptional.f70419h : 0;
            appBrandInitConfigWC.H = launchParamsOptional != null ? launchParamsOptional.f70421m : null;
            com.tencent.mm.plugin.appbrand.launching.g0.a(appBrandInitConfigWC, appBrandStatObject);
            com.tencent.mm.plugin.appbrand.d9 d9Var = this.f77040b;
            d9Var.getClass();
            appBrandInitConfigWC.f47269b2 = appBrandStatObject;
            d9Var.j(null, appBrandInitConfigWC);
        }
    }
}

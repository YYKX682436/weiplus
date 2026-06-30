package com.tencent.luggage.sdk.jsapi.component.service;

/* loaded from: classes7.dex */
public class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f47387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.luggage.sdk.jsapi.component.service.a0 f47388e;

    public b0(com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var, com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime) {
        this.f47388e = a0Var;
        this.f47387d = appBrandRuntime;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        com.tencent.luggage.sdk.jsapi.component.service.a0 a0Var = this.f47388e;
        com.tencent.mm.appbrand.commonjni.AppBrandCommonBindingJni appBrandCommonBindingJni = a0Var.f47362f.f47398a;
        java.lang.String N = a0Var.N();
        java.lang.String str2 = this.f47387d.E0().f305852r.f75372md5;
        if (this.f47388e.F() == null || ((com.tencent.luggage.sdk.jsapi.component.service.y) this.f47388e.F()).x() == null) {
            str = "";
        } else {
            str = org.chromium.base.BaseSwitches.V + ((com.tencent.luggage.sdk.jsapi.component.service.y) this.f47388e.F()).x().i();
        }
        appBrandCommonBindingJni.notifyRuntimeReady(N, str2, str);
    }
}

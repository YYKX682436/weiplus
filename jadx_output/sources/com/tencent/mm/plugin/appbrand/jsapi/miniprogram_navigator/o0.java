package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class o0 implements com.tencent.mm.plugin.appbrand.launching.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f82255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p0 f82256b;

    public o0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p0 p0Var, km5.b bVar) {
        this.f82256b = p0Var;
        this.f82255a = bVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.launching.o0
    public void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
        km5.b bVar = this.f82255a;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p0 p0Var = this.f82256b;
        if (appBrandInitConfigWC == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MiniProgramNavigatorWC", "onPreInitTaskResult, from(appId:%s, callbackId:%d) get null initConfig for to(appId:%s)", p0Var.f82257a.getAppId(), java.lang.Integer.valueOf(p0Var.f82259c.f82204a), p0Var.f82258b.f84902e);
            bVar.c(null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorWC", "onPreInitTaskResult, from(appId:%s, callbackId:%d) to(appId:%s) get initConfig:%s", p0Var.f82257a.getAppId(), java.lang.Integer.valueOf(p0Var.f82259c.f82204a), p0Var.f82258b.f84902e, appBrandInitConfigWC);
        java.lang.String optString = p0Var.f82260d.optString("adUxInfo", null);
        if (!android.text.TextUtils.isEmpty(optString)) {
            if (appBrandInitConfigWC.V == null) {
                appBrandInitConfigWC.V = new android.os.PersistableBundle();
            }
            appBrandInitConfigWC.V.putString("adUxInfo", optString);
            com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = p0Var.f82258b;
            appBrandInitConfigWC.H1 = launchParcel.V;
            appBrandInitConfigWC.I1 = launchParcel.W;
            appBrandInitConfigWC.J1 = ((com.tencent.mm.plugin.appbrand.o6) p0Var.f82257a.t3()).u0().J1;
        }
        bVar.c(appBrandInitConfigWC);
    }
}

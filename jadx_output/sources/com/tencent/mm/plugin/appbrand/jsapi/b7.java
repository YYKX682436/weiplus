package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask f79832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.c7 f79833e;

    public b7(com.tencent.mm.plugin.appbrand.jsapi.c7 c7Var, com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask jsApiLaunchApplication$LaunchApplicationTask) {
        this.f79833e = c7Var;
        this.f79832d = jsApiLaunchApplication$LaunchApplicationTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask jsApiLaunchApplication$LaunchApplicationTask = this.f79832d;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "callback task.success:%b", java.lang.Boolean.valueOf(jsApiLaunchApplication$LaunchApplicationTask.f78536q));
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).remove(jsApiLaunchApplication$LaunchApplicationTask);
        boolean z17 = jsApiLaunchApplication$LaunchApplicationTask.f78536q;
        com.tencent.mm.plugin.appbrand.jsapi.c7 c7Var = this.f79833e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var = c7Var.f80160g;
            d7Var.f80739a.a(d7Var.f80740b, d7Var.f80749k.o("ok"));
            com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var2 = c7Var.f80160g;
            d7Var2.f80749k.D(d7Var2.f80741c, ya.b.SUCCESS, "");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var3 = c7Var.f80160g;
        d7Var3.f80739a.a(d7Var3.f80740b, d7Var3.f80749k.o("fail:sdk launch fail"));
        com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var4 = c7Var.f80160g;
        d7Var4.f80749k.D(d7Var4.f80741c, "fail", "fail:sdk launch fail");
    }
}

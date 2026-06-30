package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class y0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask f78979d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 f78980e;

    public y0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 z0Var, com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask jsApiLaunchApplicationForNative$LaunchApplicationTask) {
        this.f78980e = z0Var;
        this.f78979d = jsApiLaunchApplicationForNative$LaunchApplicationTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask jsApiLaunchApplicationForNative$LaunchApplicationTask = this.f78979d;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "callback task.success:%b", java.lang.Boolean.valueOf(jsApiLaunchApplicationForNative$LaunchApplicationTask.f78884q));
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).remove(jsApiLaunchApplicationForNative$LaunchApplicationTask);
        boolean z17 = jsApiLaunchApplicationForNative$LaunchApplicationTask.f78884q;
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 z0Var = this.f78980e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var = z0Var.f78984g;
            a1Var.f78930a.a(a1Var.f78931b, a1Var.f78939j.o("ok"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var2 = z0Var.f78984g;
        a1Var2.f78930a.a(a1Var2.f78931b, a1Var2.f78939j.o("fail:sdk launch fail"));
    }
}

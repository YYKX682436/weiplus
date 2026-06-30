package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask f81601d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n7 f81602e;

    public m7(com.tencent.mm.plugin.appbrand.jsapi.n7 n7Var, com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask jsApiLaunchApplicationDirectly$LaunchApplicationTask) {
        this.f81602e = n7Var;
        this.f81601d = jsApiLaunchApplicationDirectly$LaunchApplicationTask;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask jsApiLaunchApplicationDirectly$LaunchApplicationTask = this.f81601d;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "callback task.success:%b", java.lang.Boolean.valueOf(jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78561q));
        ((java.util.HashSet) com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyTransparentUIProcessTask.f78363h).remove(jsApiLaunchApplicationDirectly$LaunchApplicationTask);
        boolean z17 = jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78561q;
        com.tencent.mm.plugin.appbrand.jsapi.n7 n7Var = this.f81602e;
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var = n7Var.f82380g;
            o7Var.f82448a.a(o7Var.f82449b, o7Var.f82460m.o("ok"));
            com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var2 = n7Var.f82380g;
            o7Var2.f82460m.E(o7Var2.f82457j, ya.b.SUCCESS, "");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var3 = n7Var.f82380g;
        o7Var3.f82448a.a(o7Var3.f82449b, o7Var3.f82460m.o("fail:sdk launch fail"));
        com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var4 = n7Var.f82380g;
        o7Var4.f82460m.E(o7Var4.f82457j, "fail", "fail:sdk launch fail");
    }
}

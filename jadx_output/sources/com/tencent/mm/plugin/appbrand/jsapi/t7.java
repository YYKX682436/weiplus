package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class t7 implements com.tencent.mm.plugin.appbrand.jsapi.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.r f83463a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask f83464b;

    public t7(com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask jsApiLaunchApplicationDirectly$LaunchApplicationTask, com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        this.f83464b = jsApiLaunchApplicationDirectly$LaunchApplicationTask;
        this.f83463a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v7
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.ipc.r rVar = this.f83463a;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplicationDirectly$LaunchApplicationTask jsApiLaunchApplicationDirectly$LaunchApplicationTask = this.f83464b;
        if (z17) {
            jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78561q = true;
            ((com.tencent.mm.plugin.appbrand.ipc.o) rVar).a();
        } else {
            jsApiLaunchApplicationDirectly$LaunchApplicationTask.f78561q = false;
            ((com.tencent.mm.plugin.appbrand.ipc.o) rVar).a();
        }
    }
}

package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class e7 implements com.tencent.mm.plugin.appbrand.jsapi.g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.r f80767a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask f80768b;

    public e7(com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask jsApiLaunchApplication$LaunchApplicationTask, com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        this.f80768b = jsApiLaunchApplication$LaunchApplicationTask;
        this.f80767a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.g7
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.ipc.r rVar = this.f80767a;
        com.tencent.mm.plugin.appbrand.jsapi.JsApiLaunchApplication$LaunchApplicationTask jsApiLaunchApplication$LaunchApplicationTask = this.f80768b;
        if (z17) {
            jsApiLaunchApplication$LaunchApplicationTask.f78536q = true;
            ((com.tencent.mm.plugin.appbrand.ipc.o) rVar).a();
        } else {
            jsApiLaunchApplication$LaunchApplicationTask.f78536q = false;
            ((com.tencent.mm.plugin.appbrand.ipc.o) rVar).a();
        }
    }
}

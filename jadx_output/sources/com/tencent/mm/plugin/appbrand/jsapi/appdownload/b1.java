package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class b1 implements com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.r f78940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask f78941b;

    public b1(com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask jsApiLaunchApplicationForNative$LaunchApplicationTask, com.tencent.mm.plugin.appbrand.ipc.r rVar) {
        this.f78941b = jsApiLaunchApplicationForNative$LaunchApplicationTask;
        this.f78940a = rVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.ipc.r rVar = this.f78940a;
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.JsApiLaunchApplicationForNative$LaunchApplicationTask jsApiLaunchApplicationForNative$LaunchApplicationTask = this.f78941b;
        if (z17) {
            jsApiLaunchApplicationForNative$LaunchApplicationTask.f78884q = true;
            ((com.tencent.mm.plugin.appbrand.ipc.o) rVar).a();
        } else {
            jsApiLaunchApplicationForNative$LaunchApplicationTask.f78884q = false;
            ((com.tencent.mm.plugin.appbrand.ipc.o) rVar).a();
        }
    }
}

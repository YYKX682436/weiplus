package com.tencent.mm.plugin.appbrand.jsapi.appdownload;

/* loaded from: classes15.dex */
public class w0 implements com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 f78974a;

    public w0(com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 z0Var) {
        this.f78974a = z0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.appdownload.d1
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationForNative", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.jsapi.appdownload.z0 z0Var = this.f78974a;
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var = z0Var.f78984g;
            a1Var.f78930a.a(a1Var.f78931b, a1Var.f78939j.o("ok"));
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.appdownload.a1 a1Var2 = z0Var.f78984g;
            a1Var2.f78930a.a(a1Var2.f78931b, a1Var2.f78939j.o("fail:scheme launch fail"));
        }
    }
}

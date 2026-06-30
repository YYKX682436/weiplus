package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class z6 implements com.tencent.mm.plugin.appbrand.jsapi.g7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.c7 f83952a;

    public z6(com.tencent.mm.plugin.appbrand.jsapi.c7 c7Var) {
        this.f83952a = c7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.g7
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplication", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.jsapi.c7 c7Var = this.f83952a;
        if (z17) {
            com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var = c7Var.f80160g;
            d7Var.f80739a.a(d7Var.f80740b, d7Var.f80749k.o("ok"));
            com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var2 = c7Var.f80160g;
            d7Var2.f80749k.D(d7Var2.f80741c, ya.b.SUCCESS, "");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var3 = c7Var.f80160g;
        d7Var3.f80739a.a(d7Var3.f80740b, d7Var3.f80749k.o("fail:scheme launch fail"));
        com.tencent.mm.plugin.appbrand.jsapi.d7 d7Var4 = c7Var.f80160g;
        d7Var4.f80749k.D(d7Var4.f80741c, "fail", "fail:scheme launch fail");
    }
}

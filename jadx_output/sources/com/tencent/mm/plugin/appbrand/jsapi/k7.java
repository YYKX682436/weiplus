package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes15.dex */
public class k7 implements com.tencent.mm.plugin.appbrand.jsapi.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.n7 f81347a;

    public k7(com.tencent.mm.plugin.appbrand.jsapi.n7 n7Var) {
        this.f81347a = n7Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.v7
    public void a(boolean z17, boolean z18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLaunchApplicationDirectly", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        com.tencent.mm.plugin.appbrand.jsapi.n7 n7Var = this.f81347a;
        com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var = n7Var.f82380g;
        com.tencent.mm.plugin.appbrand.jsapi.x7 x7Var = o7Var.f82460m;
        x7Var.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.p7(x7Var, o7Var.f82448a));
        com.tencent.mm.plugin.appbrand.jsapi.o7 o7Var2 = n7Var.f82380g;
        if (z17) {
            o7Var2.f82448a.a(o7Var2.f82449b, o7Var2.f82460m.o("ok"));
            o7Var2.f82460m.E(o7Var2.f82457j, ya.b.SUCCESS, "");
            return;
        }
        o7Var2.f82448a.a(o7Var2.f82449b, o7Var2.f82460m.o("fail:scheme launch fail"));
        o7Var2.f82460m.E(o7Var2.f82457j, "fail", "fail:scheme launch fail");
    }
}

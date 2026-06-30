package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public class i2 implements fl1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j2 f79587a;

    public i2(com.tencent.mm.plugin.appbrand.jsapi.auth.j2 j2Var) {
        this.f79587a = j2Var;
    }

    @Override // fl1.f
    public void a(int i17, java.util.ArrayList arrayList) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiLogin", "stev onRevMsg resultCode %d", java.lang.Integer.valueOf(i17));
        com.tencent.mm.plugin.appbrand.jsapi.auth.j2 j2Var = this.f79587a;
        if (i17 != 1 && i17 != 2) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask = j2Var.f79599e;
            jsApiLogin$LoginTask.f79356f.D(jsApiLogin$LoginTask.f79357g, jsApiLogin$LoginTask.f79359i, "fail auth cancel", jc1.f.f298922k);
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) j2Var.f79599e.f79358h).a();
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask2 = j2Var.f79599e;
        jsApiLogin$LoginTask2.f79362o = "loginConfirm";
        jsApiLogin$LoginTask2.f79361n = arrayList;
        jsApiLogin$LoginTask2.f79368u = i17;
        jsApiLogin$LoginTask2.d();
        if (i17 == 2) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiLogin$LoginTask jsApiLogin$LoginTask3 = j2Var.f79599e;
            jsApiLogin$LoginTask3.f79356f.D(jsApiLogin$LoginTask3.f79357g, jsApiLogin$LoginTask3.f79359i, "fail auth deny", jc1.f.f298921j);
            ((com.tencent.mm.plugin.appbrand.jsapi.auth.g2) j2Var.f79599e.f79358h).a();
        }
    }
}

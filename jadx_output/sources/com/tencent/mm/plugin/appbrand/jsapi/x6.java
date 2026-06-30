package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class x6 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f83907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.y6 f83908f;

    public x6(com.tencent.mm.plugin.appbrand.jsapi.y6 y6Var, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17) {
        this.f83908f = y6Var;
        this.f83906d = d0Var;
        this.f83907e = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        java.lang.String string = bundle.getString("ret", "fail");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiKindaRequestQueryCashier", "callback ret is：%s", string);
        java.lang.String o17 = this.f83908f.o(string);
        int i17 = this.f83907e;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83906d;
        d0Var.a(i17, o17);
        if (bundle.getInt("closeWindow", 0) == 1) {
            d0Var.t3().S();
        }
    }
}

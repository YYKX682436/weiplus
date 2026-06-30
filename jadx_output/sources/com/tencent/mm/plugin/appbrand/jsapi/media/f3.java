package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class f3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f81799e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f81800f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest f81801g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z3 f81802h;

    public f3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17, com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest) {
        this.f81802h = z3Var;
        this.f81798d = lVar;
        this.f81799e = jSONObject;
        this.f81800f = i17;
        this.f81801g = jsApiChooseMedia$ChooseRequest;
    }

    @Override // java.lang.Runnable
    public void run() {
        org.json.JSONObject jSONObject = this.f81799e;
        int i17 = this.f81800f;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseRequest jsApiChooseMedia$ChooseRequest = this.f81801g;
        com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var = this.f81802h;
        z3Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "showSelectMenu");
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = this.f81798d;
        android.content.Context f147807d = lVar.getF147807d();
        com.tencent.mm.ui.tools.s6 s6Var = new com.tencent.mm.ui.tools.s6(f147807d);
        com.tencent.mm.plugin.appbrand.jsapi.media.g3 g3Var = new com.tencent.mm.plugin.appbrand.jsapi.media.g3(z3Var, lVar, i17);
        s6Var.f210724h = g3Var;
        s6Var.f210721e.f211854d = g3Var;
        s6Var.a(null, new com.tencent.mm.plugin.appbrand.jsapi.media.h3(z3Var, f147807d), new com.tencent.mm.plugin.appbrand.jsapi.media.i3(z3Var, jsApiChooseMedia$ChooseRequest, lVar, jSONObject, i17), new com.tencent.mm.plugin.appbrand.jsapi.media.j3(z3Var, lVar, i17));
    }
}

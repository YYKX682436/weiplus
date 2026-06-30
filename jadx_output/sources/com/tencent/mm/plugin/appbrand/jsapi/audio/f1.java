package com.tencent.mm.plugin.appbrand.jsapi.audio;

/* loaded from: classes7.dex */
public class f1 extends com.tencent.mm.plugin.appbrand.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f79185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f79186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f79187f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.audio.k1 f79188g;

    public f1(com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var, java.lang.String str, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f79188g = k1Var;
        this.f79185d = str;
        this.f79186e = e9Var;
        this.f79187f = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void c() {
        java.lang.String str = this.f79185d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.JsApiOperateRecorder", "onDestroy, appId:%s", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "stop");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var = this.f79188g;
        if (k1Var.f79241g == null) {
            k1Var.f79241g = new com.tencent.mm.plugin.appbrand.jsapi.audio.j1(k1Var, this.f79186e, this.f79187f);
        }
        k1Var.f79241g.f79226n = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.audio.j1 j1Var = k1Var.f79241g;
        j1Var.f79225m = str;
        j1Var.f79230r = -1;
        java.lang.System.currentTimeMillis();
        j1Var.a();
        com.tencent.mm.plugin.appbrand.x0.e(str, this);
        com.tencent.mm.plugin.appbrand.jsapi.audio.k1.f79240n.remove(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.v0
    public void e(com.tencent.mm.plugin.appbrand.w0 w0Var) {
        java.lang.String str = this.f79185d;
        com.tencent.mars.xlog.Log.i("MicroMsg.Record.JsApiOperateRecorder", "onPause, appId:%s", str);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("operationType", "pause");
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Record.JsApiOperateRecorder", e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.plugin.appbrand.jsapi.audio.k1 k1Var = this.f79188g;
        if (k1Var.f79241g == null) {
            k1Var.f79241g = new com.tencent.mm.plugin.appbrand.jsapi.audio.j1(k1Var, this.f79186e, this.f79187f);
        }
        k1Var.f79241g.f79226n = jSONObject.toString();
        com.tencent.mm.plugin.appbrand.jsapi.audio.j1 j1Var = k1Var.f79241g;
        j1Var.f79225m = str;
        j1Var.f79230r = -1;
        j1Var.c();
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class l3 implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f81912a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81913b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.z3 f81914c;

    public l3(com.tencent.mm.plugin.appbrand.jsapi.media.z3 z3Var, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        this.f81914c = z3Var;
        this.f81912a = lVar;
        this.f81913b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        org.json.JSONArray jSONArray;
        com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult jsApiChooseMedia$ChooseResult = (com.tencent.mm.plugin.appbrand.jsapi.media.JsApiChooseMedia$ChooseResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.media.z3.f82166h = false;
        if (jsApiChooseMedia$ChooseResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult result is null");
            this.f81912a.a(this.f81913b, this.f81914c.o("fail"));
            return;
        }
        int i17 = jsApiChooseMedia$ChooseResult.f81647d;
        if (i17 != -1) {
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult");
                this.f81912a.a(this.f81913b, this.f81914c.o("fail"));
                return;
            } else {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult user cancel");
                this.f81912a.a(this.f81913b, this.f81914c.o("fail:cancel"));
                return;
            }
        }
        java.lang.String str = jsApiChooseMedia$ChooseResult.f81648e;
        try {
            jSONArray = new org.json.JSONArray(jsApiChooseMedia$ChooseResult.f81649f);
        } catch (org.json.JSONException unused) {
            jSONArray = null;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "parse:%s err", null);
        }
        if (jSONArray == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiChooseMedia", "chooseMedia fail, onReceiveResult localIds is null");
            this.f81912a.a(this.f81913b, this.f81914c.o("fail"));
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("type", str);
        hashMap.put("tempFiles", jSONArray);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChooseMedia", "chooseMedia ok, type:%s, localIds:%s", str, jSONArray);
        this.f81912a.a(this.f81913b, this.f81914c.p("ok", hashMap));
    }
}

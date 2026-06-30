package com.tencent.mm.plugin.appbrand.jsapi.game;

/* loaded from: classes7.dex */
public class a implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81251a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f81252b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.game.f f81253c;

    public a(com.tencent.mm.plugin.appbrand.jsapi.game.f fVar, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17) {
        this.f81253c = fVar;
        this.f81251a = e9Var;
        this.f81252b = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult openGameDetailResult = (com.tencent.mm.plugin.appbrand.jsapi.game.JsApiOpenGameDetail$OpenGameDetailTask.OpenGameDetailResult) appBrandProxyUIProcessTask$ProcessResult;
        if (openGameDetailResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenGameDetail", "onReceiveResult is null");
            com.tencent.mm.plugin.appbrand.e9 e9Var = this.f81251a;
            int i17 = this.f81252b;
            com.tencent.mm.plugin.appbrand.jsapi.game.f fVar = this.f81253c;
            fVar.getClass();
            str = android.text.TextUtils.isEmpty("fail") ? null : "fail";
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 8);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, fVar.u(str2, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenGameDetail", "onReceiveResult:%b", java.lang.Boolean.valueOf(openGameDetailResult.f81248d));
        if (openGameDetailResult.f81248d) {
            com.tencent.mm.plugin.appbrand.e9 e9Var2 = this.f81251a;
            int i18 = this.f81252b;
            com.tencent.mm.plugin.appbrand.jsapi.game.f fVar2 = this.f81253c;
            fVar2.getClass();
            android.text.TextUtils.isEmpty("ok");
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var2.a(i18, fVar2.u("ok", jSONObject2));
            return;
        }
        if (openGameDetailResult.f81250f.equals("showAlert")) {
            com.tencent.mm.plugin.appbrand.jsapi.game.f fVar3 = this.f81253c;
            android.content.Context f147807d = this.f81251a.getF147807d();
            java.lang.String str5 = openGameDetailResult.f81249e;
            fVar3.getClass();
            ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.appbrand.jsapi.game.b(fVar3, f147807d, str5));
        }
        com.tencent.mm.plugin.appbrand.e9 e9Var3 = this.f81251a;
        int i19 = this.f81252b;
        com.tencent.mm.plugin.appbrand.jsapi.game.f fVar4 = this.f81253c;
        java.lang.String str6 = "fail:" + openGameDetailResult.f81249e;
        fVar4.getClass();
        str = android.text.TextUtils.isEmpty(str6) ? null : str6;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 8);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        e9Var3.a(i19, fVar4.u(str2, jSONObject3));
    }
}

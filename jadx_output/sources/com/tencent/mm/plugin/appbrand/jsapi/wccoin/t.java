package com.tencent.mm.plugin.appbrand.jsapi.wccoin;

/* loaded from: classes7.dex */
public final class t implements com.tencent.mm.plugin.appbrand.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.d0 f83782a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f83783b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.wccoin.u f83784c;

    public t(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, int i17, com.tencent.mm.plugin.appbrand.jsapi.wccoin.u uVar) {
        this.f83782a = d0Var;
        this.f83783b = i17;
        this.f83784c = uVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.ipc.u
    public void onReceiveResult(com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask$ProcessResult appBrandProxyUIProcessTask$ProcessResult) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageResult enterWCCoinHomePageResult = (com.tencent.mm.plugin.appbrand.jsapi.wccoin.EnterWCCoinHomePageResult) appBrandProxyUIProcessTask$ProcessResult;
        com.tencent.mm.plugin.appbrand.jsapi.wccoin.u uVar = this.f83784c;
        int i17 = this.f83783b;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = this.f83782a;
        if (enterWCCoinHomePageResult == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiEnterWCCoinHomePage", "onReceiveResult get NULL result");
            uVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            d0Var.a(i17, uVar.u(str2, jSONObject));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiEnterWCCoinHomePage", "onReceiveResult resultCode:%s", enterWCCoinHomePageResult.f83755d);
        if (kotlin.jvm.internal.o.b(enterWCCoinHomePageResult.f83755d, "ok")) {
            uVar.getClass();
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 0);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            d0Var.a(i17, uVar.u(str2, jSONObject2));
            return;
        }
        java.lang.String str5 = "fail " + enterWCCoinHomePageResult.f83755d;
        uVar.getClass();
        str = android.text.TextUtils.isEmpty(str5) ? null : str5;
        str2 = str != null ? str : "";
        java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
        }
        d0Var.a(i17, uVar.u(str2, jSONObject3));
    }
}

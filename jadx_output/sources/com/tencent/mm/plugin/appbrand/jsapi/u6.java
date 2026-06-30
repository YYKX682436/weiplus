package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class u6 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1585;
    public static final java.lang.String NAME = "jumpToOfflinePay";

    /* renamed from: g, reason: collision with root package name */
    public final int f83501g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        this.f81338e = false;
        android.app.Activity r07 = (d0Var == null || (t37 = d0Var.t3()) == null) ? null : t37.r0();
        if (r07 == null || jSONObject == null) {
            if (d0Var != null) {
                d0Var.a(i17, o("fail:internal error invalid android context"));
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToOfflinePay", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.t6(this, d0Var, i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiJumpToOfflinePay", "json: %s", jSONObject.toString());
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = com.tencent.mm.plugin.appbrand.l.e(d0Var.getAppId());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToOfflinePay", "sysConfig is null, invoke fail!");
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(d0Var.getAppId());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToOfflinePay", "runtime is null, invoke fail!");
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        java.lang.String appId = d0Var.getAppId();
        if (appId == null) {
            appId = "";
        }
        intent.putExtra("appId", appId);
        java.lang.String optString = jSONObject.optString("timeStamp");
        if (optString == null) {
            optString = "";
        }
        intent.putExtra("timeStamp", optString);
        java.lang.String optString2 = jSONObject.optString("nonceStr");
        if (optString2 == null) {
            optString2 = "";
        }
        intent.putExtra("nonceStr", optString2);
        java.lang.String optString3 = jSONObject.optString("package");
        if (optString3 == null) {
            optString3 = "";
        }
        intent.putExtra("packageExt", optString3);
        java.lang.String optString4 = jSONObject.optString("signType");
        if (optString4 == null) {
            optString4 = "";
        }
        intent.putExtra("signtype", optString4);
        java.lang.String optString5 = jSONObject.optString("paySign");
        if (optString5 == null) {
            optString5 = "";
        }
        intent.putExtra("paySignature", optString5);
        java.lang.String str = e17.f305841d;
        if (str == null) {
            str = "";
        }
        intent.putExtra("wxapp_username", str);
        com.tencent.mm.plugin.appbrand.page.d5 x07 = b17.x0();
        java.lang.String currentUrl = x07 != null ? x07.getCurrentUrl() : null;
        if (currentUrl == null) {
            currentUrl = "";
        }
        intent.putExtra("wxapp_path", currentUrl);
        intent.putExtra("jsapiFuncName", "WAJumpToOfflinePay");
        java.lang.String optString6 = jSONObject.optString("queryStr");
        java.lang.String str2 = optString6 != null ? optString6 : "";
        if (str2.length() == 0) {
            d0Var.a(i17, o("fail:queryStr is null"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiJumpToOfflinePay", "queryStr.isEmpty()");
        } else {
            intent.putExtra("queryString", str2);
            ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
            intent.putExtra("key_from_scene", 7);
            j45.l.n(r07, "offline", ".ui.WalletOfflineEntranceUI", intent, this.f83501g);
        }
    }
}

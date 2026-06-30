package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class y9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 192;
    public static final java.lang.String NAME = "openSetting";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var.t3().E0() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSetting", "config is null!");
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        if (Z0 == null) {
            c0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSetting", "mmActivity is null, invoke fail!");
            return;
        }
        java.lang.String str = "";
        java.lang.String optString = c0Var.t3().u0().f47284z == 7 ? jSONObject.optString(dm.i4.COL_USERNAME) : "";
        boolean optBoolean = jSONObject.optBoolean("withSubscriptions", false);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            optString = c0Var.t3().u0().f47278x;
        }
        android.content.Intent putExtra = new android.content.Intent(c0Var.getF147807d(), (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.class).putExtra("key_username", optString);
        putExtra.putExtra("key_app_authorize_jsapi", true);
        java.lang.String appId = c0Var.getAppId();
        try {
            java.lang.String str2 = com.tencent.mm.plugin.appbrand.l.b(appId).u0().f47276v;
            if (str2 != null) {
                str = str2;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenSetting", "openSetting, get runtime by %s, e = %s", appId, e17);
            str = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenSetting", "appId:%s, sessionId:%s", appId, str);
        putExtra.putExtra("key_app_session_id", str);
        putExtra.setClass(Z0, com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.class);
        nf.g.a(Z0).j(putExtra, new com.tencent.mm.plugin.appbrand.jsapi.x9(this, optBoolean, c0Var, i17));
    }
}

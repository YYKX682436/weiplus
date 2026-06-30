package cb1;

/* loaded from: classes.dex */
public class o0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 402;
    public static final java.lang.String NAME = "openRealnameAuth";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = (com.tencent.mm.plugin.appbrand.page.v5) lVar;
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo data is null");
            v5Var.a(i17, o("fail:data is null"));
            return;
        }
        android.app.Activity r07 = v5Var.t3().r0();
        if (r07 == null) {
            v5Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenRealnameAuth", "mmActivity is null, invoke fail!");
            return;
        }
        java.lang.String optString = jSONObject.optString("categoryId", "");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenRealnameAuth", "category_id is null");
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 40003);
            v5Var.a(i17, p("fail:category_id is empty", hashMap));
            return;
        }
        java.lang.String appId = v5Var.getAppId();
        int optInt = jSONObject.optInt("authType", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenRealnameAuth", "getIDCardInfo category_id:%s, appId:%s, authType:%d", optString, appId, java.lang.Integer.valueOf(optInt));
        android.content.Intent intent = new android.content.Intent(r07, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardUI.class);
        intent.putExtra("intent_appid", appId);
        intent.putExtra("intent_category_id", optString);
        intent.putExtra("intent_auth_type", optInt);
        intent.putExtra("id_ui_theme", 1);
        nf.g.a(r07).j(intent, new cb1.n0(this, v5Var, i17));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(14943, appId, 1, "");
    }
}

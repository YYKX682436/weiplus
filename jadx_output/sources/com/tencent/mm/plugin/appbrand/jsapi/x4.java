package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class x4 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1273;
    public static final java.lang.String NAME = "choosePhoneNumberAreaCode";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiChoosePhoneNumberAreaCode", "choosePhoneNumberAreaCode data:%s", jSONObject);
        if (jSONObject == null) {
            if (e9Var != null) {
                str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
                str2 = str != null ? str : "";
                java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("errno", 101);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
                }
                e9Var.a(i17, u(str2, jSONObject2));
                return;
            }
            return;
        }
        android.content.Context context = e9Var != null ? e9Var.getContext() : null;
        if (context != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(context, "com.tencent.mm.ui.tools.CountryCodeUI");
            intent.putExtra("country_name", "");
            intent.putExtra("couttry_code", "");
            nf.e.f(new com.tencent.mm.plugin.appbrand.jsapi.w4(context, intent, e9Var, i17, this));
            return;
        }
        if (e9Var != null) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            e9Var.a(i17, u(str2, jSONObject3));
        }
    }
}

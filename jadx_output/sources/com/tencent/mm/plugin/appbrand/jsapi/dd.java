package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class dd extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1349;
    public static final java.lang.String NAME = "setNeedsAcceptPrivacy";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            return;
        }
        if (jSONObject == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = e9Var.getRuntime();
        runtime.F1 = jSONObject.optJSONArray("needPrivacyJsApis");
        runtime.G1 = jSONObject.optJSONArray("needPrivacyPipes");
        runtime.H1 = jSONObject.optJSONArray("needPrivacyAuths");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            jSONObject2.put("errno", 0);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        e9Var.a(i17, u(str, jSONObject2));
    }
}

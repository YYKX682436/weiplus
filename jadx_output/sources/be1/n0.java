package be1;

/* loaded from: classes.dex */
public final class n0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    private static final int CTRL_INDEX = 1063;
    private static final java.lang.String NAME = "openSystemSetting";

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f19486g = jz5.h.b(be1.m0.f19485d);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (lVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, env is null");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            java.lang.String u17 = u(str2, jSONObject2);
            kotlin.jvm.internal.o.f(u17, "makeReturnJson(...)");
            return u17;
        }
        android.content.Context context = lVar.getContext();
        if (context == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, context is null");
            str3 = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str3 != null ? str3 : "";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 4);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            java.lang.String u18 = u(str2, jSONObject3);
            kotlin.jvm.internal.o.f(u18, "makeReturnJson(...)");
            return u18;
        }
        if (jSONObject == null || !jSONObject.has("type")) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, data is illegal, data: " + jSONObject);
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 101);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            java.lang.String u19 = u(str2, jSONObject4);
            kotlin.jvm.internal.o.f(u19, "makeReturnJson(...)");
            return u19;
        }
        java.lang.String optString = jSONObject.optString("type");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, openType: " + optString);
        yz5.l lVar2 = (yz5.l) ((java.util.Map) ((jz5.n) f19486g).getValue()).get(optString);
        if (lVar2 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, openAction is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
            str2 = str != null ? str : "";
            java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            try {
                jSONObject5.put("errno", 101);
            } catch (java.lang.Exception e27) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
            }
            java.lang.String u27 = u(str2, jSONObject5);
            kotlin.jvm.internal.o.f(u27, "makeReturnJson(...)");
            return u27;
        }
        if (((java.lang.Boolean) lVar2.invoke(context)).booleanValue()) {
            str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
            str2 = str != null ? str : "";
            java.lang.String str8 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            try {
                jSONObject6.put("errno", 0);
            } catch (java.lang.Exception e28) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e28);
            }
            java.lang.String u28 = u(str2, jSONObject6);
            kotlin.jvm.internal.o.f(u28, "makeReturnJson(...)");
            return u28;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.JsApiOpenSystemSetting", "invoke, open fail");
        str = android.text.TextUtils.isEmpty(null) ? "fail:settings page not found" : null;
        str2 = str != null ? str : "";
        java.lang.String str9 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject7 = new org.json.JSONObject();
        try {
            jSONObject7.put("errno", 102101);
        } catch (java.lang.Exception e29) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e29);
        }
        java.lang.String u29 = u(str2, jSONObject7);
        kotlin.jvm.internal.o.f(u29, "makeReturnJson(...)");
        return u29;
    }
}

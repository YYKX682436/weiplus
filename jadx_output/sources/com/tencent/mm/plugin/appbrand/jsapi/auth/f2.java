package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class f2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1507;
    public static final java.lang.String NAME = "getPhoneNumberForFakeNative";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        if (e9Var == null) {
            com.tencent.mars.xlog.Log.w("JsApiGetPhoneNumberForFakeNative", "getPhoneNumberForFakeNative fail, env is null");
            return;
        }
        android.content.Context f147807d = e9Var.getF147807d();
        if (f147807d == null) {
            com.tencent.mars.xlog.Log.w("JsApiGetPhoneNumberForFakeNative", "getPhoneNumberForFakeNative fail, context is null");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 4);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            e9Var.a(i17, u(str2, jSONObject2));
            return;
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.w("JsApiGetPhoneNumberForFakeNative", "getPhoneNumberForFakeNative fail, data is null");
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
            return;
        }
        int optInt = jSONObject.optInt("businessId", -1);
        java.lang.String optString = jSONObject.optString("displayName", "");
        java.lang.String optString2 = jSONObject.optString("iconURL", "");
        java.lang.String optString3 = jSONObject.optString("usageDescription", "");
        kotlin.jvm.internal.o.d(optString);
        kotlin.jvm.internal.o.d(optString3);
        kotlin.jvm.internal.o.d(optString2);
        com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest jsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest = new com.tencent.mm.plugin.appbrand.jsapi.auth.JsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest(optInt, optString, optString3, optString2);
        com.tencent.mm.plugin.appbrand.jsapi.auth.e2 e2Var = new com.tencent.mm.plugin.appbrand.jsapi.auth.e2(e9Var, i17, this);
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, jsApiGetPhoneNumberForFakeNative$GetPhoneNumRequest, e2Var, null);
    }
}

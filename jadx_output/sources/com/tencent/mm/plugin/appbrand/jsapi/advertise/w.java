package com.tencent.mm.plugin.appbrand.jsapi.advertise;

/* loaded from: classes.dex */
public final class w extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1327;
    private static final java.lang.String NAME = "postMessageToMBBiz";

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f78777g = jz5.h.b(com.tencent.mm.plugin.appbrand.jsapi.advertise.v.f78776d);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPostMessageToMBBiz", "env is null");
            return;
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("bizName") : null;
        java.lang.String optString2 = jSONObject != null ? jSONObject.optString("eventName") : null;
        java.lang.String optString3 = jSONObject != null ? jSONObject.optString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE) : null;
        int length = optString3 != null ? optString3.length() : 0;
        boolean z17 = true;
        if ((optString3 == null || optString3.length() == 0) || length <= ((java.lang.Number) ((jz5.n) f78777g).getValue()).intValue()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPostMessageToMBBiz", "bizName: " + optString + ", eventName: " + optString2 + ", message: " + optString3);
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPostMessageToMBBiz", "bizName: " + optString + ", eventName: " + optString2 + ", message too long: " + length);
        }
        if (optString == null || optString.length() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPostMessageToMBBiz", "has no bizName");
            str3 = android.text.TextUtils.isEmpty("has no bizName") ? "fail:jsapi invalid request data" : "has no bizName";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 101);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            c0Var.a(i17, u(str3, jSONObject2));
            return;
        }
        if (optString2 != null && optString2.length() != 0) {
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPostMessageToMBBiz", "has no eventName");
            str3 = android.text.TextUtils.isEmpty("has no eventName") ? "fail:jsapi invalid request data" : "has no eventName";
            java.lang.String str5 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 101);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            c0Var.a(i17, u(str3, jSONObject3));
            return;
        }
        if (c0Var.t3() == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPostMessageToMBBiz", "env.runtime is not a AppBrandRuntimeWC");
            str = android.text.TextUtils.isEmpty(null) ? "fail:internal error" : null;
            str2 = str != null ? str : "";
            java.lang.String str6 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            try {
                jSONObject4.put("errno", 4);
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e19);
            }
            c0Var.a(i17, u(str2, jSONObject4));
            return;
        }
        c0Var.b2(optString, optString2, optString3);
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str7 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject5 = new org.json.JSONObject();
        try {
            jSONObject5.put("errno", 0);
        } catch (java.lang.Exception e27) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e27);
        }
        c0Var.a(i17, u(str2, jSONObject5));
    }
}

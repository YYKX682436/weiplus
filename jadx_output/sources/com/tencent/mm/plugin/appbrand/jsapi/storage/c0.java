package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class c0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 98;
    public static final java.lang.String NAME = "removeStorageSync";

    public final void B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, int i17) {
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.getAppId(), z0Var.f305853s, z0Var.f305855u).q(i17, lVar.getAppId(), str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid key" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800003);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str2, jSONObject2);
        }
        if (com.tencent.mm.plugin.appbrand.appstorage.a2.c(optInt)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800001);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            return u(str2, jSONObject3);
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(lVar.getAppId())) {
            return o("fail:appID is empty");
        }
        int i17 = ((k91.z0) lVar.b(k91.z0.class)).f305853s;
        if (k91.z0.a(i17)) {
            B(lVar, optString, optInt);
        } else if (i17 == 3) {
            B(lVar, optString, optInt);
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask jsApiRemoveStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask();
            jsApiRemoveStorageTask.f83362f = lVar.getAppId();
            jsApiRemoveStorageTask.f83363g = optInt;
            jsApiRemoveStorageTask.f83364h = optString;
            jsApiRemoveStorageTask.s();
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask jsApiRemoveStorageTask2 = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask();
            jsApiRemoveStorageTask2.f83362f = lVar.getAppId();
            jsApiRemoveStorageTask2.f83363g = optInt;
            jsApiRemoveStorageTask2.f83364h = optString;
            jsApiRemoveStorageTask2.s();
        }
        return o("ok");
    }
}

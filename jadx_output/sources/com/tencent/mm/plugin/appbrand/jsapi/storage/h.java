package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class h extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 18;
    public static final java.lang.String NAME = "clearStorage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        int i18 = ((k91.z0) lVar.b(k91.z0.class)).f305853s;
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.tencent.mm.plugin.appbrand.appstorage.a2.c(optInt)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800001);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (k91.z0.a(i18)) {
            s75.d.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.g(this, lVar, optInt), "JsApiClearStorage");
        } else if (i18 == 3) {
            s75.d.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.g(this, lVar, optInt), "JsApiClearStorage");
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask jsApiClearStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask();
            jsApiClearStorageTask.f83343f = lVar.getAppId();
            jsApiClearStorageTask.f83344g = optInt;
            jsApiClearStorageTask.d();
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask jsApiClearStorageTask2 = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask();
            jsApiClearStorageTask2.f83343f = lVar.getAppId();
            jsApiClearStorageTask2.f83344g = optInt;
            jsApiClearStorageTask2.d();
        }
        str = android.text.TextUtils.isEmpty(null) ? "ok" : null;
        str2 = str != null ? str : "";
        java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject3 = new org.json.JSONObject();
        try {
            jSONObject3.put("errno", 0);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
        }
        lVar.a(i17, u(str2, jSONObject3));
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 18;
    public static final java.lang.String NAME = "clearStorageSync";

    public final java.lang.String B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.getAppId(), z0Var.f305853s, z0Var.f305855u).k(i17, lVar.getAppId());
        return o("ok");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        int i17 = ((k91.z0) lVar.b(k91.z0.class)).f305853s;
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.tencent.mm.plugin.appbrand.appstorage.a2.c(optInt)) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800001);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str, jSONObject2);
        }
        if (k91.z0.a(i17)) {
            return B(lVar, optInt);
        }
        if (i17 != 3) {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask jsApiClearStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask();
            jsApiClearStorageTask.f83343f = lVar.getAppId();
            jsApiClearStorageTask.f83344g = optInt;
            jsApiClearStorageTask.s();
            return o("ok");
        }
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask jsApiClearStorageTask2 = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiClearStorageTask();
        jsApiClearStorageTask2.f83343f = lVar.getAppId();
        jsApiClearStorageTask2.f83344g = optInt;
        jsApiClearStorageTask2.s();
        o("ok");
        return B(lVar, optInt);
    }
}

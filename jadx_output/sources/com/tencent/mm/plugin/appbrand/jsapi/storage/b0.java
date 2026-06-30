package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class b0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 98;
    public static final java.lang.String NAME = "removeStorage";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
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
            lVar.a(i17, u(str2, jSONObject2));
            return;
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
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        int i18 = z0Var.f305853s;
        if (k91.z0.a(i18)) {
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.jsapi.storage.a0(this, lVar, optInt, optString), "JsApiRemoveStorage");
        } else if (i18 == 3) {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask jsApiRemoveStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask();
            jsApiRemoveStorageTask.f83362f = C(lVar);
            jsApiRemoveStorageTask.f83363g = optInt;
            jsApiRemoveStorageTask.f83364h = optString;
            jsApiRemoveStorageTask.d();
            ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.appbrand.jsapi.storage.a0(this, lVar, optInt, optString), "JsApiRemoveStorage");
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask jsApiRemoveStorageTask2 = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiRemoveStorageTask();
            jsApiRemoveStorageTask2.f83362f = C(lVar);
            jsApiRemoveStorageTask2.f83363g = optInt;
            jsApiRemoveStorageTask2.f83364h = optString;
            jsApiRemoveStorageTask2.d();
        }
        lVar.a(i17, o("ok"));
    }

    public java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return lVar.getAppId();
    }
}

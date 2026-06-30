package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class k0 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 16;
    public static final java.lang.String NAME = "setStorageSync";

    public final java.lang.String B(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String str4;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        try {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask jsApiSetStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask();
            jsApiSetStorageTask.f83365f = lVar.getAppId();
            jsApiSetStorageTask.f83366g = i17;
            jsApiSetStorageTask.C(str, str2, str3);
            if (jsApiSetStorageTask.s()) {
                str4 = jsApiSetStorageTask.f83376t;
            } else {
                com.tencent.mars.xlog.Log.e("Luggage.FULL.JsApiSetStorageSync", "invokeWithDB appId[%s] key[%s] execSync failed", lVar.getAppId(), str);
                str4 = "fail";
            }
            return str4;
        } finally {
            com.tencent.mm.plugin.appbrand.appstorage.y1.a(1, 1, com.tencent.mm.plugin.appbrand.appstorage.a2.b(str, str2), 1, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        }
    }

    public final java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        try {
            int i18 = z0Var.f305853s;
            java.lang.String str4 = z0Var.f305855u;
            return com.tencent.mm.plugin.appbrand.jsapi.storage.m0.d(((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.getAppId(), i18, str4).l(i17, lVar.getAppId(), str, str2, str3));
        } finally {
            com.tencent.mm.plugin.appbrand.appstorage.y1.a(2, 1, com.tencent.mm.plugin.appbrand.appstorage.a2.b(str, str2), 1, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String B;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String optString = jSONObject.optString("key");
        java.lang.String optString2 = jSONObject.optString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String optString3 = jSONObject.optString("dataType");
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
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (optString.length() + (optString2 != null ? optString2.length() : 0) > (z0Var instanceof com.tencent.luggage.sdk.config.AppBrandSysConfigLU ? ((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) z0Var).Y.f77211i : 1048576)) {
            return o("fail:entry size limit reached");
        }
        int i17 = z0Var.f305853s;
        if (k91.z0.a(i17)) {
            B = C(lVar, optString, optString2, optString3, optInt);
        } else if (i17 == 3) {
            java.lang.String C = C(lVar, optString, optString2, optString3, optInt);
            B(lVar, optString, optString2, optString3, optInt);
            B = C;
        } else {
            B = B(lVar, optString, optString2, optString3, optInt);
        }
        return o(B);
    }
}

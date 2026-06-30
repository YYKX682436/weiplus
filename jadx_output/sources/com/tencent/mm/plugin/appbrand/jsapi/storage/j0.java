package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class j0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 16;
    public static final java.lang.String NAME = "setStorage";

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.storage.i0 f83404g = new com.tencent.mm.plugin.appbrand.jsapi.storage.f0(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
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
        java.lang.String C = C(lVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(C)) {
            lVar.a(i17, o("fail:appID is empty"));
            return;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiSetStorage", "invoke with appId[%s] callbackId[%d], NULL sysConfig", lVar.getAppId(), java.lang.Integer.valueOf(i17));
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        if (optString.length() + (optString2 != null ? optString2.length() : 0) > ((com.tencent.luggage.sdk.config.AppBrandSysConfigLU) z0Var).Y.f77211i) {
            lVar.a(i17, o("fail:entry size limit reached"));
            return;
        }
        int i18 = z0Var.f305853s;
        boolean a17 = k91.z0.a(i18);
        com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var = this.f83404g;
        if (a17) {
            E(lVar, i17, optInt, optString, optString2, optString3, C, i0Var);
        } else if (i18 != 3) {
            D(lVar, i17, optInt, optString, optString2, optString3, C, i0Var);
        } else {
            E(lVar, i17, optInt, optString, optString2, optString3, C, i0Var);
            D(lVar, i17, optInt, optString, optString2, optString3, C, null);
        }
    }

    public java.lang.String C(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return lVar.getAppId();
    }

    public final void D(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var) {
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask jsApiSetStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiSetStorageTask();
        jsApiSetStorageTask.f83365f = str4;
        jsApiSetStorageTask.f83366g = i18;
        jsApiSetStorageTask.C(str, str2, str3);
        jsApiSetStorageTask.f83367h = new com.tencent.mm.plugin.appbrand.jsapi.storage.h0(this, i0Var, jsApiSetStorageTask, lVar, i17, str, str2, currentTimeMillis, z0Var);
        jsApiSetStorageTask.d();
    }

    public final void E(com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.tencent.mm.plugin.appbrand.jsapi.storage.i0 i0Var) {
        lVar.o(new com.tencent.mm.plugin.appbrand.jsapi.storage.g0(this, lVar, str4, i18, str, str2, str3, i0Var, i17, java.lang.System.currentTimeMillis()));
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class p extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 17;
    public static final java.lang.String NAME = "getStorage";

    public static void C(com.tencent.mm.plugin.appbrand.jsapi.storage.p pVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i17) {
        pVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("dataType", str3);
        lVar.a(i17, pVar.p(str, hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = jSONObject.optString("key");
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
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid key" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800003);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        java.lang.String D = D(lVar);
        if (com.tencent.mm.sdk.platformtools.t8.K0(D)) {
            lVar.a(i17, o("fail:appID is empty"));
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetStorage", "invoke with appId[%s] callbackId[%d], NULL sysConfig", lVar.getAppId(), java.lang.Integer.valueOf(i17));
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        if (z0Var.f305853s != 1) {
            s75.d.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.n(this, D, z0Var, optInt, optString, lVar, i17, currentTimeMillis2), "JsApiGetStorage");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask jsApiGetStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask();
        jsApiGetStorageTask.f83351f = D;
        jsApiGetStorageTask.f83358p = optString;
        jsApiGetStorageTask.f83352g = optInt;
        jsApiGetStorageTask.f83361s = "" + android.os.Process.myPid() + "" + super.hashCode();
        jsApiGetStorageTask.f83353h = new com.tencent.mm.plugin.appbrand.jsapi.storage.o(this, jsApiGetStorageTask, lVar, i17, optString, currentTimeMillis2, z0Var, currentTimeMillis);
        jsApiGetStorageTask.d();
    }

    public java.lang.String D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return lVar.getAppId();
    }
}

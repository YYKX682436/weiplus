package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class v extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 17;
    public static final java.lang.String NAME = "getStorageSync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        java.lang.String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            r8 = android.text.TextUtils.isEmpty(null) ? "fail:invalid key" : null;
            str2 = r8 != null ? r8 : "";
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
            r8 = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = r8 != null ? r8 : "";
            java.lang.String str4 = com.tencent.mm.sdk.platformtools.z.f193105a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800001);
            } catch (java.lang.Exception e18) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            return u(str2, jSONObject3);
        }
        java.lang.String appId = lVar.getAppId();
        if (com.tencent.mm.sdk.platformtools.t8.K0(appId)) {
            return o("fail:appID is empty");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        int i18 = z0Var.f305853s;
        java.lang.String str5 = z0Var.f305855u;
        if (i18 != 1) {
            java.lang.Object[] o17 = ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.getAppId(), i18, str5).o(optInt, appId, optString);
            i17 = 2;
            if (((com.tencent.mm.plugin.appbrand.appstorage.o1) o17[0]) == com.tencent.mm.plugin.appbrand.appstorage.o1.NONE) {
                r8 = (java.lang.String) o17[1];
                str = (java.lang.String) o17[2];
            } else {
                str = null;
            }
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask jsApiGetStorageTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageTask();
            jsApiGetStorageTask.f83351f = appId;
            jsApiGetStorageTask.f83352g = optInt;
            jsApiGetStorageTask.f83358p = optString;
            jsApiGetStorageTask.f83361s = "" + android.os.Process.myPid() + "" + hashCode();
            jsApiGetStorageTask.s();
            r8 = jsApiGetStorageTask.f83359q;
            str = jsApiGetStorageTask.f83360r;
            i17 = 1;
        }
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(i17, 2, com.tencent.mm.plugin.appbrand.appstorage.a2.b(optString, r8), 1, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        java.lang.String str6 = r8 == null ? "fail:data not found" : "ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        if (r8 == null) {
            r8 = "";
        }
        hashMap.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, r8);
        hashMap.put("dataType", str != null ? str : "");
        return p(str6, hashMap);
    }
}

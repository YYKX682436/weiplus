package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = 113;
    public static final java.lang.String NAME = "getStorageInfoSync";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        int i17;
        int i18;
        int i19;
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
        if (!lVar.isRunning() || android.text.TextUtils.isEmpty(lVar.getAppId())) {
            com.tencent.mars.xlog.Log.e("Luggage.FULL.JsApiGetStorageInfoSync", "invoke with storageId(%s) but service destroyed", java.lang.Integer.valueOf(optInt));
            return "fail:internal error";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        int i27 = z0Var.f305853s;
        java.lang.String str3 = z0Var.f305855u;
        if (i27 != 1) {
            java.lang.Object[] t17 = ((com.tencent.mm.plugin.appbrand.luggage.customize.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.getAppId(), i27, str3).t(optInt, lVar.getAppId());
            arrayList = (java.util.ArrayList) t17[0];
            i18 = (int) java.lang.Math.ceil(((java.lang.Integer) t17[1]).doubleValue() / 1000.0d);
            i17 = 2;
            i19 = (int) java.lang.Math.ceil(((java.lang.Integer) t17[2]).doubleValue() / 1000.0d);
        } else {
            com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask jsApiGetStorageInfoTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask();
            jsApiGetStorageInfoTask.f83345f = lVar.getAppId();
            jsApiGetStorageInfoTask.f83346g = optInt;
            jsApiGetStorageInfoTask.s();
            arrayList = jsApiGetStorageInfoTask.f83347h;
            int i28 = jsApiGetStorageInfoTask.f83348i;
            int i29 = jsApiGetStorageInfoTask.f83349m;
            i17 = 1;
            i18 = i28;
            i19 = i29;
        }
        com.tencent.mm.plugin.appbrand.appstorage.y1.a(i17, 3, i18 * 1000, arrayList != null ? arrayList.size() : 0, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        hashMap.put("keys", arrayList);
        hashMap.put("currentSize", java.lang.Integer.valueOf(i18));
        hashMap.put("limitSize", java.lang.Integer.valueOf(i19));
        return p("ok", hashMap);
    }
}

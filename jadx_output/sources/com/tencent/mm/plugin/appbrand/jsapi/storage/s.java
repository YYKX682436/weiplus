package com.tencent.mm.plugin.appbrand.jsapi.storage;

/* loaded from: classes7.dex */
public class s extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 113;
    public static final java.lang.String NAME = "getStorageInfo";

    public static void C(com.tencent.mm.plugin.appbrand.jsapi.storage.s sVar, java.util.List list, int i17, int i18, com.tencent.mm.plugin.appbrand.jsapi.l lVar, int i19) {
        sVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("keys", list);
        hashMap.put("currentSize", java.lang.Integer.valueOf(i17));
        hashMap.put("limitSize", java.lang.Integer.valueOf(i18));
        lVar.a(i19, sVar.p("ok", hashMap));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.tencent.mm.plugin.appbrand.appstorage.a2.c(optInt)) {
            lVar.a(i17, o("fail:nonexistent storage space"));
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(lVar);
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        int i18 = z0Var.f305853s;
        java.lang.String str = z0Var.f305855u;
        if (i18 != 1) {
            s75.d.b(new com.tencent.mm.plugin.appbrand.jsapi.storage.q(this, weakReference, i18, str, optInt, i17, currentTimeMillis, z0Var), "JsApiGetStorageInfo");
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask jsApiGetStorageInfoTask = new com.tencent.mm.plugin.appbrand.jsapi.storage.JsApiGetStorageInfoTask();
        jsApiGetStorageInfoTask.f83345f = D(lVar);
        jsApiGetStorageInfoTask.f83346g = optInt;
        jsApiGetStorageInfoTask.f83350n = new com.tencent.mm.plugin.appbrand.jsapi.storage.r(this, jsApiGetStorageInfoTask, weakReference, i17, currentTimeMillis, z0Var);
        jsApiGetStorageInfoTask.d();
    }

    public java.lang.String D(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        return lVar.getAppId();
    }
}

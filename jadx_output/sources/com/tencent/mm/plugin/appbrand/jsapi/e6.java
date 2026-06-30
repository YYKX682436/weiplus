package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class e6 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getPluginPermissionBytes";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle appRuntimeApiPermissionBundle;
        byte[] bArr;
        int ordinal;
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "invoke jsapi: %s", NAME);
        if (yVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:service is nil");
            return o("fail:service is nil");
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:data is nil");
            return o("fail:data is nil");
        }
        ze.n nVar = yVar.getRuntime() instanceof ze.n ? (ze.n) yVar.getRuntime() : null;
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:runtime is nil");
            return o("fail:runtime is nil");
        }
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPluginPermissionBytes", "invoke failed, NULL permissionController with appId:%s", nVar.f74803n);
            return o("fail:internal error");
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("pluginList"));
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            byte b17 = 0;
            int i17 = 0;
            while (i17 < jSONArray.length()) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i17);
                java.lang.String optString = optJSONObject.optString("pluginId");
                org.json.JSONArray optJSONArray = optJSONObject.optJSONArray("indexes");
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "pluginId:%s,indexes:%s", optString, optJSONArray);
                if (optJSONArray == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:indexes is nil");
                    return o("fail:indexes is nil");
                }
                int i18 = gVar.f408248b;
                if (i18 == -1) {
                    bArr = new byte[1];
                    bArr[b17] = 1;
                } else if (i18 == -2) {
                    bArr = new byte[1];
                    bArr[b17] = b17;
                } else {
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
                        synchronized (gVar.f408253g) {
                            appRuntimeApiPermissionBundle = (com.tencent.mm.plugin.appbrand.permission.AppRuntimeApiPermissionBundle) gVar.f408254h.get(optString);
                        }
                        if (appRuntimeApiPermissionBundle != null) {
                            boolean z17 = yVar instanceof com.tencent.mm.plugin.appbrand.e9;
                            byte[] bArr2 = appRuntimeApiPermissionBundle.f87393d;
                            if (z17 && ((ordinal = gVar.f408247a.c().ordinal()) == 1 || ordinal == 2 || ordinal == 3)) {
                                bArr = appRuntimeApiPermissionBundle.f87394e;
                            }
                            bArr = bArr2;
                        }
                    }
                    bArr = null;
                }
                if (bArr != null && bArr.length > 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "pluginId:%s ctrlBytes:%d", optString, java.lang.Integer.valueOf(bArr.length));
                    org.json.JSONArray jSONArray2 = new org.json.JSONArray();
                    if (optJSONArray.length() == 0) {
                        for (int i19 = 0; i19 < bArr.length; i19++) {
                            jSONArray2.put(gVar.c(bArr, i19));
                        }
                    } else {
                        for (int i27 = 0; i27 < optJSONArray.length(); i27++) {
                            jSONArray2.put(gVar.c(bArr, optJSONArray.optInt(i27, -1)));
                        }
                    }
                    hashMap2.put(optString, jSONArray2);
                    i17++;
                    b17 = 0;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:pluginId:%s ctrlBytes is empty", optString);
                i17++;
                b17 = 0;
            }
            hashMap.put("pluginPermissionMap", hashMap2);
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "invoke JsApiGetPluginPermissionBytes ok");
            return p("ok", hashMap);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPluginPermissionBytes", "parse pluginList error:%s", e17);
            return o("fail:parse pluginList error");
        }
    }
}

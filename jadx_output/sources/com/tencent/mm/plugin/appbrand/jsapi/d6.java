package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class d6 extends com.tencent.mm.plugin.appbrand.jsapi.a1 {
    public static final int CTRL_INDEX = -2;
    public static final java.lang.String NAME = "getPermissionBytes";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.a1
    public java.lang.String z(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.y yVar = (com.tencent.mm.plugin.appbrand.y) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "invoke jsapi: %s", NAME);
        if (yVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:service is nil");
            return o("fail:service is nil");
        }
        if (jSONObject == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:data is nil");
            return o("fail:data is nil");
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("indexes");
        if (optJSONArray == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:indexes is nil");
            return o("fail:indexes is nil");
        }
        ze.n nVar = yVar.getRuntime() instanceof ze.n ? (ze.n) yVar.getRuntime() : null;
        if (nVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:runtime is nil");
            return o("fail:runtime is nil");
        }
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiGetPermissionBytes", "invoke failed, NULL permissionController with appId:%s", nVar.f74803n);
            return o("fail:internal error");
        }
        byte[] g17 = gVar.g(yVar, yVar.getAppId(), null);
        if (g17 == null || g17.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:ctrlBytes is empty");
            return o("fail:ctrlBytes is empty");
        }
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        int i17 = 0;
        if (optJSONArray.length() == 0) {
            while (i17 < g17.length) {
                jSONArray.put(gVar.c(g17, i17));
                i17++;
            }
        } else {
            while (i17 < optJSONArray.length()) {
                jSONArray.put(gVar.c(g17, optJSONArray.optInt(i17, -1)));
                i17++;
            }
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("permissionBytes", jSONArray);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiGetPermissionBytes", "invoke getPermissionBytes ok");
        return p("ok", hashMap);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class d6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34107x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34108x24728b = "getPermissionBytes";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "invoke jsapi: %s", f34108x24728b);
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:service is nil");
            return o("fail:service is nil");
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:data is nil");
            return o("fail:data is nil");
        }
        org.json.JSONArray optJSONArray = jSONObject.optJSONArray("indexes");
        if (optJSONArray == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:indexes is nil");
            return o("fail:indexes is nil");
        }
        ze.n nVar = yVar.mo32091x9a3f0ba2() instanceof ze.n ? (ze.n) yVar.mo32091x9a3f0ba2() : null;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:runtime is nil");
            return o("fail:runtime is nil");
        }
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPermissionBytes", "invoke failed, NULL permissionController with appId:%s", nVar.f156336n);
            return o("fail:internal error");
        }
        byte[] g17 = gVar.g(yVar, yVar.mo48798x74292566(), null);
        if (g17 == null || g17.length <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "fail:ctrlBytes is empty");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPermissionBytes", "invoke getPermissionBytes ok");
        return p("ok", hashMap);
    }
}

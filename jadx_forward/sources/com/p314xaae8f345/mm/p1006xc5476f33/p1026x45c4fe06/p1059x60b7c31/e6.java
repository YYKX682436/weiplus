package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class e6 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34115x366c91de = -2;

    /* renamed from: NAME */
    public static final java.lang.String f34116x24728b = "getPluginPermissionBytes";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54 c12540xf7cdfd54;
        byte[] bArr;
        int ordinal;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) lVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "invoke jsapi: %s", f34116x24728b);
        if (yVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:service is nil");
            return o("fail:service is nil");
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:data is nil");
            return o("fail:data is nil");
        }
        ze.n nVar = yVar.mo32091x9a3f0ba2() instanceof ze.n ? (ze.n) yVar.mo32091x9a3f0ba2() : null;
        if (nVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:runtime is nil");
            return o("fail:runtime is nil");
        }
        si1.g gVar = nVar.X1;
        if (gVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPluginPermissionBytes", "invoke failed, NULL permissionController with appId:%s", nVar.f156336n);
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "pluginId:%s,indexes:%s", optString, optJSONArray);
                if (optJSONArray == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:indexes is nil");
                    return o("fail:indexes is nil");
                }
                int i18 = gVar.f489781b;
                if (i18 == -1) {
                    bArr = new byte[1];
                    bArr[b17] = 1;
                } else if (i18 == -2) {
                    bArr = new byte[1];
                    bArr[b17] = b17;
                } else {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
                        synchronized (gVar.f489786g) {
                            c12540xf7cdfd54 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1174xe125c5cf.C12540xf7cdfd54) gVar.f489787h.get(optString);
                        }
                        if (c12540xf7cdfd54 != null) {
                            boolean z17 = yVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9;
                            byte[] bArr2 = c12540xf7cdfd54.f168926d;
                            if (z17 && ((ordinal = gVar.f489780a.c().ordinal()) == 1 || ordinal == 2 || ordinal == 3)) {
                                bArr = c12540xf7cdfd54.f168927e;
                            }
                            bArr = bArr2;
                        }
                    }
                    bArr = null;
                }
                if (bArr != null && bArr.length > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "pluginId:%s ctrlBytes:%d", optString, java.lang.Integer.valueOf(bArr.length));
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "fail:pluginId:%s ctrlBytes is empty", optString);
                i17++;
                b17 = 0;
            }
            hashMap.put("pluginPermissionMap", hashMap2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPluginPermissionBytes", "invoke JsApiGetPluginPermissionBytes ok");
            return p("ok", hashMap);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPluginPermissionBytes", "parse pluginList error:%s", e17);
            return o("fail:parse pluginList error");
        }
    }
}

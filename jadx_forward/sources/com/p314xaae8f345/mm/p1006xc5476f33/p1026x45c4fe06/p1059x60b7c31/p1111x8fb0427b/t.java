package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34869x366c91de = 113;

    /* renamed from: NAME */
    public static final java.lang.String f34870x24728b = "getStorageInfoSync";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.util.ArrayList arrayList;
        int i17;
        int i18;
        int i19;
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800001);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str, jSONObject2);
        }
        if (!lVar.mo50262x39e05d35() || android.text.TextUtils.isEmpty(lVar.mo48798x74292566())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.JsApiGetStorageInfoSync", "invoke with storageId(%s) but service destroyed", java.lang.Integer.valueOf(optInt));
            return "fail:internal error";
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        int i27 = z0Var.f387386s;
        java.lang.String str3 = z0Var.f387388u;
        if (i27 != 1) {
            java.lang.Object[] t17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), i27, str3).t(optInt, lVar.mo48798x74292566());
            arrayList = (java.util.ArrayList) t17[0];
            i18 = (int) java.lang.Math.ceil(((java.lang.Integer) t17[1]).doubleValue() / 1000.0d);
            i17 = 2;
            i19 = (int) java.lang.Math.ceil(((java.lang.Integer) t17[2]).doubleValue() / 1000.0d);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89 c12244xe6b9ea89 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12244xe6b9ea89();
            c12244xe6b9ea89.f164878f = lVar.mo48798x74292566();
            c12244xe6b9ea89.f164879g = optInt;
            c12244xe6b9ea89.s();
            arrayList = c12244xe6b9ea89.f164880h;
            int i28 = c12244xe6b9ea89.f164881i;
            int i29 = c12244xe6b9ea89.f164882m;
            i17 = 1;
            i18 = i28;
            i19 = i29;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(i17, 3, i18 * 1000, arrayList != null ? arrayList.size() : 0, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        hashMap.put("keys", arrayList);
        hashMap.put("currentSize", java.lang.Integer.valueOf(i18));
        hashMap.put("limitSize", java.lang.Integer.valueOf(i19));
        return p("ok", hashMap);
    }
}

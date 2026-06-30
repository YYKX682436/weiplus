package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class v extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34871x366c91de = 17;

    /* renamed from: NAME */
    public static final java.lang.String f34872x24728b = "getStorageSync";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        int i17;
        java.lang.String str2;
        java.lang.String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            r8 = android.text.TextUtils.isEmpty(null) ? "fail:invalid key" : null;
            str2 = r8 != null ? r8 : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800003);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            return u(str2, jSONObject2);
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            r8 = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = r8 != null ? r8 : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800001);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            return u(str2, jSONObject3);
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(mo48798x74292566)) {
            return o("fail:appID is empty");
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        int i18 = z0Var.f387386s;
        java.lang.String str5 = z0Var.f387388u;
        if (i18 != 1) {
            java.lang.Object[] o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), i18, str5).o(optInt, mo48798x74292566, optString);
            i17 = 2;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1) o17[0]) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.o1.NONE) {
                r8 = (java.lang.String) o17[1];
                str = (java.lang.String) o17[2];
            } else {
                str = null;
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb c12245x458323bb = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb();
            c12245x458323bb.f164884f = mo48798x74292566;
            c12245x458323bb.f164885g = optInt;
            c12245x458323bb.f164891p = optString;
            c12245x458323bb.f164894s = "" + android.os.Process.myPid() + "" + hashCode();
            c12245x458323bb.s();
            r8 = c12245x458323bb.f164892q;
            str = c12245x458323bb.f164893r;
            i17 = 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(i17, 2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(optString, r8), 1, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        java.lang.String str6 = r8 == null ? "fail:data not found" : "ok";
        java.util.HashMap hashMap = new java.util.HashMap();
        if (r8 == null) {
            r8 = "";
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, r8);
        hashMap.put("dataType", str != null ? str : "");
        return p(str6, hashMap);
    }
}

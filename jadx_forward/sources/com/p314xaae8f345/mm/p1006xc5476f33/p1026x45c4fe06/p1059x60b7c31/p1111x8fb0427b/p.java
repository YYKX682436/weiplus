package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class p extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34865x366c91de = 17;

    /* renamed from: NAME */
    public static final java.lang.String f34866x24728b = "getStorage";

    public static void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.p pVar, java.lang.String str, java.lang.String str2, java.lang.String str3, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        pVar.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, str2);
        if (str3 == null) {
            str3 = "";
        }
        hashMap.put("dataType", str3);
        lVar.a(i17, pVar.p(str, hashMap));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String str;
        java.lang.String str2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.c(optInt)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = str != null ? str : "";
            java.lang.String str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put("errno", 800001);
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
            }
            lVar.a(i17, u(str2, jSONObject2));
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid key" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800003);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        java.lang.String D = D(lVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(D)) {
            lVar.a(i17, o("fail:appID is empty"));
            return;
        }
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetStorage", "invoke with appId[%s] callbackId[%d], NULL sysConfig", lVar.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        if (z0Var.f387386s != 1) {
            s75.d.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.n(this, D, z0Var, optInt, optString, lVar, i17, currentTimeMillis2), "JsApiGetStorage");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb c12245x458323bb = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12245x458323bb();
        c12245x458323bb.f164884f = D;
        c12245x458323bb.f164891p = optString;
        c12245x458323bb.f164885g = optInt;
        c12245x458323bb.f164894s = "" + android.os.Process.myPid() + "" + super.hashCode();
        c12245x458323bb.f164886h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.o(this, c12245x458323bb, lVar, i17, optString, currentTimeMillis2, z0Var, currentTimeMillis);
        c12245x458323bb.d();
    }

    public java.lang.String D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        return lVar.mo48798x74292566();
    }
}

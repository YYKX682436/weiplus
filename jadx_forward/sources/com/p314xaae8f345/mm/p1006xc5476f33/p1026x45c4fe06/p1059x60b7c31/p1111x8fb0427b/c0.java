package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34841x366c91de = 98;

    /* renamed from: NAME */
    public static final java.lang.String f34842x24728b = "removeStorageSync";

    public final void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, int i17) {
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), z0Var.f387386s, z0Var.f387388u).q(i17, lVar.mo48798x74292566(), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String optString = jSONObject.optString("key");
        int optInt = jSONObject.optInt("storageId", 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            str = android.text.TextUtils.isEmpty(null) ? "fail:invalid key" : null;
            str2 = str != null ? str : "";
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
            str = android.text.TextUtils.isEmpty(null) ? "fail:nonexistent storage space" : null;
            str2 = str != null ? str : "";
            java.lang.String str4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3.put("errno", 800001);
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e18);
            }
            return u(str2, jSONObject3);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(lVar.mo48798x74292566())) {
            return o("fail:appID is empty");
        }
        int i17 = ((k91.z0) lVar.b(k91.z0.class)).f387386s;
        if (k91.z0.a(i17)) {
            B(lVar, optString, optInt);
        } else if (i17 == 3) {
            B(lVar, optString, optInt);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12246x39f3978b c12246x39f3978b = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12246x39f3978b();
            c12246x39f3978b.f164895f = lVar.mo48798x74292566();
            c12246x39f3978b.f164896g = optInt;
            c12246x39f3978b.f164897h = optString;
            c12246x39f3978b.s();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12246x39f3978b c12246x39f3978b2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12246x39f3978b();
            c12246x39f3978b2.f164895f = lVar.mo48798x74292566();
            c12246x39f3978b2.f164896g = optInt;
            c12246x39f3978b2.f164897h = optString;
            c12246x39f3978b2.s();
        }
        return o("ok");
    }
}

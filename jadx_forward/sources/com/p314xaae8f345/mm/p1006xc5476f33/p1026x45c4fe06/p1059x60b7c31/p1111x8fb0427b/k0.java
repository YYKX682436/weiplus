package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class k0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1 {

    /* renamed from: CTRL_INDEX */
    public static final int f34859x366c91de = 16;

    /* renamed from: NAME */
    public static final java.lang.String f34860x24728b = "setStorageSync";

    public final java.lang.String B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        java.lang.String str4;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12247xdbe8972f c12247xdbe8972f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12247xdbe8972f();
            c12247xdbe8972f.f164898f = lVar.mo48798x74292566();
            c12247xdbe8972f.f164899g = i17;
            c12247xdbe8972f.C(str, str2, str3);
            if (c12247xdbe8972f.s()) {
                str4 = c12247xdbe8972f.f164909t;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.JsApiSetStorageSync", "invokeWithDB appId[%s] key[%s] execSync failed", lVar.mo48798x74292566(), str);
                str4 = "fail";
            }
            return str4;
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(1, 1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(str, str2), 1, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        }
    }

    public final java.lang.String C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        try {
            int i18 = z0Var.f387386s;
            java.lang.String str4 = z0Var.f387388u;
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.m0.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1146x600e8c43.b) ((oe.a) nd.f.a(oe.a.class))).b(lVar.mo48798x74292566(), i18, str4).l(i17, lVar.mo48798x74292566(), str, str2, str3));
        } finally {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.y1.a(2, 1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.a2.b(str, str2), 1, java.lang.System.currentTimeMillis() - currentTimeMillis, z0Var);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.a1
    public java.lang.String z(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject) {
        java.lang.String B;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String optString = jSONObject.optString("key");
        java.lang.String optString2 = jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306);
        java.lang.String optString3 = jSONObject.optString("dataType");
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
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (optString.length() + (optString2 != null ? optString2.length() : 0) > (z0Var instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052 ? ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) z0Var).Y.f158744i : 1048576)) {
            return o("fail:entry size limit reached");
        }
        int i17 = z0Var.f387386s;
        if (k91.z0.a(i17)) {
            B = C(lVar, optString, optString2, optString3, optInt);
        } else if (i17 == 3) {
            java.lang.String C = C(lVar, optString, optString2, optString3, optInt);
            B(lVar, optString, optString2, optString3, optInt);
            B = C;
        } else {
            B = B(lVar, optString, optString2, optString3, optInt);
        }
        return o(B);
    }
}

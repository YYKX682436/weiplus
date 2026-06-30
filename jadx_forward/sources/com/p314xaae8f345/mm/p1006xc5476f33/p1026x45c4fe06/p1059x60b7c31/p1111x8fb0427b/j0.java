package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b;

/* loaded from: classes7.dex */
public class j0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34855x366c91de = 16;

    /* renamed from: NAME */
    public static final java.lang.String f34856x24728b = "setStorage";

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.i0 f164937g = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.f0(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
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
            lVar.a(i17, u(str2, jSONObject2));
            return;
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
            lVar.a(i17, u(str2, jSONObject3));
            return;
        }
        java.lang.String C = C(lVar);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(C)) {
            lVar.a(i17, o("fail:appID is empty"));
            return;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiSetStorage", "invoke with appId[%s] callbackId[%d], NULL sysConfig", lVar.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            lVar.a(i17, o("fail:internal error"));
            return;
        }
        if (optString.length() + (optString2 != null ? optString2.length() : 0) > ((com.p314xaae8f345.p425x1ea3c036.sdk.p434xaf3f8342.C3899xf952a052) z0Var).Y.f158744i) {
            lVar.a(i17, o("fail:entry size limit reached"));
            return;
        }
        int i18 = z0Var.f387386s;
        boolean a17 = k91.z0.a(i18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.i0 i0Var = this.f164937g;
        if (a17) {
            E(lVar, i17, optInt, optString, optString2, optString3, C, i0Var);
        } else if (i18 != 3) {
            D(lVar, i17, optInt, optString, optString2, optString3, C, i0Var);
        } else {
            E(lVar, i17, optInt, optString, optString2, optString3, C, i0Var);
            D(lVar, i17, optInt, optString, optString2, optString3, C, null);
        }
    }

    public java.lang.String C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar) {
        return lVar.mo48798x74292566();
    }

    public final void D(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.i0 i0Var) {
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12247xdbe8972f c12247xdbe8972f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.C12247xdbe8972f();
        c12247xdbe8972f.f164898f = str4;
        c12247xdbe8972f.f164899g = i18;
        c12247xdbe8972f.C(str, str2, str3);
        c12247xdbe8972f.f164900h = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.h0(this, i0Var, c12247xdbe8972f, lVar, i17, str, str2, currentTimeMillis, z0Var);
        c12247xdbe8972f.d();
    }

    public final void E(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.i0 i0Var) {
        lVar.o(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.g0(this, lVar, str4, i18, str, str2, str3, i0Var, i17, java.lang.System.currentTimeMillis()));
    }
}

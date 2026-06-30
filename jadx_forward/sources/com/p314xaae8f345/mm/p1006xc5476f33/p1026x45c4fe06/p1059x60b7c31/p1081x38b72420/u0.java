package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public final class u0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34063x366c91de = 1213;

    /* renamed from: NAME */
    public static final java.lang.String f34064x24728b = "updateAppContact";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        java.lang.String optString2 = jSONObject.optString("appId");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            return;
        }
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274605b, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.C12069x1a552632(optString2, optString, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.r0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.t0(e9Var, i17, this));
    }
}

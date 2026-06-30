package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.p1077x334da3bc;

/* loaded from: classes7.dex */
public final class i extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.i0 {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.i0, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1076x556423d0.m
    public void C(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, int i17) {
        if (jSONObject2 == null) {
            jSONObject2 = new org.json.JSONObject();
        }
        java.lang.String optString = jSONObject != null ? jSONObject.optString("appId", "") : null;
        jSONObject2.put("appId", optString != null ? optString : "");
        super.C(lVar, jSONObject, jSONObject2, i17);
    }
}

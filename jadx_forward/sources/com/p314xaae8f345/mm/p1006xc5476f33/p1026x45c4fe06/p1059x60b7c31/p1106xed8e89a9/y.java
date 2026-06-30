package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9;

/* loaded from: classes7.dex */
public class y extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34707x366c91de = 1190;

    /* renamed from: NAME */
    private static final java.lang.String f34708x24728b = "shareSpecificWxapp";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        if (optString == null) {
            return;
        }
        boolean has = jSONObject.has("commentScore");
        int optInt = jSONObject.optInt("commentScore", -1);
        int optInt2 = jSONObject.optInt("certificationImageType", 0);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(dm.i4.f66875xa013b0d5, optString);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.w.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1106xed8e89a9.s(this, optString, has, optInt, optInt2, e9Var, i17));
    }
}

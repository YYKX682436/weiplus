package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35028x366c91de = 435;

    /* renamed from: NAME */
    public static final java.lang.String f35029x24728b = "adDataReport";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 d17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.d(lVar.mo48798x74292566());
        if (d17 != null) {
            optString = d17.f169323f + "," + d17.f169324g + "," + d17.f169321d + "," + d17.f169322e + "," + jSONObject.optString("adInfo");
        } else {
            optString = jSONObject.optString("adInfo");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1184x633fb29.f.a(15175, optString + "," + wo.w0.g(false), new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y1(this, lVar, i17));
    }
}

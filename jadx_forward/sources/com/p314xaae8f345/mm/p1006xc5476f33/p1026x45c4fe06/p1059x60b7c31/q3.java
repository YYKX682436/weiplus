package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public class q3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe {

    /* renamed from: CTRL_INDEX */
    public static final int f34709x366c91de = 324;

    /* renamed from: NAME */
    public static final java.lang.String f34710x24728b = "addWeRunData";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xe, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject != null) {
            C(this, lVar, i17, jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54499xf5c94a0), true);
        } else {
            lVar.a(i17, o("fail:data is null"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiAddWeRunData", "data is null");
        }
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class o8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34570x366c91de = 865;

    /* renamed from: NAME */
    public static final java.lang.String f34571x24728b = "private_onWebPageUrlExposed";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject != null ? jSONObject.optString("urlList") : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11926x3855843f(this, lVar, i17, optString, jSONObject != null ? jSONObject.optInt("bizType") : 0).d();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOnWebPageUrlExposed", "fail:urlList is null");
        if (lVar != null) {
            lVar.a(i17, o("fail:urlList is null"));
        }
    }
}

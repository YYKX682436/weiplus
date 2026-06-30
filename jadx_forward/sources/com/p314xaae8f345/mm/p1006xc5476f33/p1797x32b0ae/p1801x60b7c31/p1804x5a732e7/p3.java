package com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7;

/* loaded from: classes7.dex */
public class p3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.util.HashMap f225251h = new java.util.HashMap();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig A(org.json.JSONObject jSONObject) {
        if (!jSONObject.has("shareProductItem")) {
            return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig.f158922f;
        }
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject("shareProductItem");
        r45.br2 br2Var = new r45.br2();
        br2Var.set(5, optJSONObject.optString("appId"));
        br2Var.set(6, optJSONObject.optString("pagePath"));
        br2Var.set(7, optJSONObject.optString("productId"));
        br2Var.set(8, optJSONObject.optString("coverUrl"));
        br2Var.set(9, optJSONObject.optString("productTitle"));
        br2Var.set(10, java.lang.Integer.valueOf(optJSONObject.optInt("marketPrice")));
        br2Var.set(11, java.lang.Integer.valueOf(optJSONObject.optInt("sellingPrice")));
        br2Var.set(1, optJSONObject.optString("finderUsername"));
        br2Var.set(12, optJSONObject.optString("platformHeadImg"));
        br2Var.set(13, optJSONObject.optString("platformName"));
        br2Var.set(17, optJSONObject.optString("ecSource"));
        br2Var.set(28, optJSONObject.optString("entranceGMsgID", ""));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppJsApiNavigateToMiniProgramForFinderProductShare", "fillTraceInfoToShareObject " + br2Var.m75945x2fec8307(28));
        java.lang.String valueOf = java.lang.String.valueOf(optJSONObject.hashCode());
        f225251h.put(valueOf, br2Var);
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.ShareActionConfig(true, valueOf);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3
    public l81.e1 B(boolean z17) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.o3(this, z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.p1801x60b7c31.p1804x5a732e7.h3, jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        super.a(str, jSONObject, z17);
    }
}

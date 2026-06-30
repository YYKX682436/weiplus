package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public final class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.a {

    /* renamed from: CTRL_INDEX */
    public static final int f34676x366c91de = 84;

    /* renamed from: NAME */
    public static final java.lang.String f34677x24728b = "showDatePickerView";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.a, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /* renamed from: C */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, org.json.JSONObject jSONObject, int i17) {
        java.lang.String optString = jSONObject.optString("mode");
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37645x68f5f8be.equals(optString)) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.e().g(this, tVar, jSONObject, i17, this.f164241g);
        } else if ("time".equals(optString)) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.k0().g(this, tVar, jSONObject, i17, this.f164241g);
        } else {
            tVar.a(i17, o("fail:invalid data"));
        }
    }
}

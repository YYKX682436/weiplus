package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe;

/* loaded from: classes.dex */
public final class s extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34755x366c91de = 869;

    /* renamed from: NAME */
    private static final java.lang.String f34756x24728b = "scanItem";

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f164508g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f164509h = "";

    /* renamed from: i, reason: collision with root package name */
    public int f164510i;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        if (jSONObject != null) {
            jSONObject.toString();
        }
        if (c0Var == null) {
            return;
        }
        this.f164508g = c0Var;
        java.lang.String optString = jSONObject != null ? jSONObject.optString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306) : null;
        if (optString == null) {
            optString = "";
        }
        this.f164509h = optString;
        this.f164510i = i17;
        if (!(optString.length() == 0)) {
            new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1108x71e6f5fe.C12231x535c323a(this).d();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiScanItem", "scanItem data is empty");
            c0Var.a(i17, o("fail:invalid data"));
        }
    }
}

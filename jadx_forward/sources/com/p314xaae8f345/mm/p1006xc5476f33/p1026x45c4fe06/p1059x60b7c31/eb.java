package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public final class eb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f34121x366c91de = 678;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f34122x24728b = "predownloadMiniProgramPackage";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (jSONObject == null || lVar == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.JsApiPredownloadMiniProgramPackage", "invoke with appId:" + lVar.mo48798x74292566() + ", data:" + jSONObject + ", callbackId:" + i17);
        java.lang.String optString = jSONObject.optString(dm.i4.f66875xa013b0d5);
        java.lang.String optString2 = jSONObject.optString("appId");
        boolean z17 = true;
        if (optString == null || optString.length() == 0) {
            if (optString2 != null && optString2.length() != 0) {
                z17 = false;
            }
            if (z17) {
                lVar.a(i17, o("fail:invalid data"));
                return;
            }
        }
        java.lang.String optString3 = jSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        java.lang.String optString4 = jSONObject.optString("moduleName");
        int optInt = jSONObject.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q6 q6Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.q6();
        q6Var.f170284a = optString;
        q6Var.f170285b = optString2;
        q6Var.f170287d = optString3;
        q6Var.f170288e = optString4;
        q6Var.f170286c = optInt;
        q6Var.f170289f = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.cb(optString2, optString4, optInt, lVar, i17, this);
        d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.db(lVar, q6Var));
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.s6.class)).a4(q6Var);
    }
}

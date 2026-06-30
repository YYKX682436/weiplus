package gd1;

/* loaded from: classes7.dex */
public final class u extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f69813x366c91de = 814;

    /* renamed from: NAME */
    public static final java.lang.String f69814x24728b = "NFCSetTimeout";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        if (lVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "invoke, env is null");
            return;
        }
        if (jSONObject == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "invoke, data is null");
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1 t1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t1.class);
        if (t1Var != null && !((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k5) t1Var).a()) {
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13019, "fail:user is not authorized", kz5.c1.i(new jz5.l("errCode", 13019))));
            return;
        }
        hd1.w a17 = hd1.w.f361968c.a(lVar);
        lVar.mo48798x74292566();
        jSONObject.toString();
        try {
            java.lang.String string = jSONObject.getString("tech");
            try {
                int i18 = jSONObject.getInt("timeout");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                gd1.t tVar = new gd1.t(lVar, i17, this);
                ((ku5.t0) ku5.t0.f394148d).h(new hd1.r(a17, tVar, string, i18), "NFC-IO");
            } catch (java.lang.Exception unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "parse timeout failed");
                lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
            }
        } catch (java.lang.Exception unused2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.JsApiNFCSetTimeout", "parse tech failed");
            lVar.a(i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.nfc.v.a(this, 13011, "fail:invalid parameter", kz5.c1.i(new jz5.l("errCode", 13011))));
        }
    }
}

package nd1;

/* loaded from: classes7.dex */
public final class w0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f72983x366c91de = 772;

    /* renamed from: NAME */
    public static final java.lang.String f72984x24728b = "setNavigateBackConfirmDialog";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (e9Var == null || jSONObject == null) {
            return;
        }
        boolean optBoolean = jSONObject.optBoolean("enable", false);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = jSONObject.optString("content");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("JsApiSetNavigateBackConfirmDialog", "[invoke] enable=" + optBoolean + "  content=" + ((java.lang.String) h0Var.f391656d));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) h0Var.f391656d)) {
            h0Var.f391656d = e9Var.getF229340d().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gp_);
        }
        e9Var.m(new nd1.v0(e9Var, e9Var.mo32091x9a3f0ba2().x0().m52169xfdaa7672(), optBoolean, i17, this, h0Var));
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class yc extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    @java.lang.Deprecated
    public static final int f35026x366c91de = 990;

    /* renamed from: NAME */
    @java.lang.Deprecated
    public static final java.lang.String f35027x24728b = "sendRedCoverAppMsg";

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f165477g = "MicroMsg.JsApiSendRedCoverAppMsg";

    /* renamed from: h, reason: collision with root package name */
    public final int f165478h = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d0Var);
        android.app.Activity r07 = d0Var.t3().r0();
        java.lang.String str = this.f165477g;
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "mmActivity is null, invoke fail!");
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = jSONObject != null ? jSONObject.optString("receiveuri") : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "receive uri: " + ((java.lang.String) h0Var.f391656d));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Select_Conv_Type", 3);
        intent.putExtra("select_is_ret", false);
        intent.putExtra("mutil_select_is_ret", false);
        intent.putExtra("scene_from", 12);
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.xc(this, d0Var, i17, h0Var));
        j45.l.v(r07, ".ui.transmit.SelectConversationUI", intent, this.f165478h);
    }
}

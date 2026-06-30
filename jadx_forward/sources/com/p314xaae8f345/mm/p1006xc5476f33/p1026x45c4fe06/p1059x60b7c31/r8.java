package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class r8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34719x366c91de = 62;

    /* renamed from: NAME */
    public static final java.lang.String f34720x24728b = "openAddress";

    /* renamed from: g, reason: collision with root package name */
    public final int f164431g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.content.Intent intent = new android.content.Intent();
        C(intent, d0Var, jSONObject);
        intent.putExtra("req_app_id", d0Var.mo48798x74292566());
        intent.putExtra("launch_from_appbrand", true);
        intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = d0Var.t3();
        if ((t37 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) && (u07 = (o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) t37).u0()) != null && u07.L1.c()) {
            if (!o6Var.H2.g()) {
                intent.putExtra("content_view_height", u07.L1.f158890d);
                intent.putExtra("click_empty_close", u07.L1.f158892f);
            }
            if (u07.L1.f158894h) {
                intent.putExtra("force_light_mode", true);
            }
        }
        android.app.Activity r07 = t37.r0();
        if (r07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenAddress", "invoke appId:%s, callbackId:%d, context == null", d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
            d0Var.a(i17, o("fail:internal error invalid android context"));
        } else {
            nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q8(this, d0Var, i17));
            intent.putExtra("enter_scene_address", 2);
            j45.l.o(r07, "address", ".ui.WalletSelectAddrUI", intent, this.f164431g, false);
        }
    }

    public void C(android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, org.json.JSONObject jSONObject) {
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public final class r9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    private static final int f34721x366c91de = 1458;

    /* renamed from: NAME */
    private static final java.lang.String f34722x24728b = "openMyAddress";

    /* renamed from: g, reason: collision with root package name */
    public final int f164432g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject data, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 u07;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (d0Var == null) {
            return;
        }
        int optInt = data.optInt("selectedAddressId", -1);
        java.lang.String optString = data.optString("from", "select");
        android.content.Intent intent = new android.content.Intent();
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
        intent.putExtra("req_app_id", d0Var.mo48798x74292566());
        intent.putExtra("enter_scene_address", 2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenMyAddress", "invoke from: " + optString);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "select")) {
            intent.putExtra("pageTitle", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3w));
            intent.putExtra("init_addr_id", optInt);
            intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
            intent.putExtra("KEY_ITEM_SHOW_COPY", false);
            intent.putExtra("item_selectable", true);
            android.app.Activity r07 = d0Var.t3().r0();
            nf.g a17 = nf.g.a(r07);
            if (a17 != null) {
                a17.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.q9(this, d0Var, i17));
            }
            j45.l.o(r07, "address", ".ui.WalletSelectAddrUI", intent, this.f164432g, false);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "manage")) {
            intent.putExtra("pageTitle", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n3v));
            intent.putExtra("KEY_ITEM_SHOW_COPY", true);
            intent.putExtra("KEY_ITEM_SHOW_EDIT", false);
            android.app.Activity r08 = d0Var.t3().r0();
            if (r08 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenMyAddress", "invoke appId:%s, callbackId:%d, context == null", d0Var.mo48798x74292566(), java.lang.Integer.valueOf(i17));
                d0Var.a(i17, o("fail:internal error invalid android context"));
            } else {
                nf.g a18 = nf.g.a(r08);
                if (a18 != null) {
                    a18.f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p9(this, d0Var, i17));
                }
                j45.l.o(r08, "address", ".ui.WalletSelectAddrUI", intent, this.f164432g, false);
            }
        }
    }
}

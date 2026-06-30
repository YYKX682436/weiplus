package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class c0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34604x366c91de = 1249;

    /* renamed from: NAME */
    public static final java.lang.String f34605x24728b = "openHKOfflinePayView";

    /* renamed from: g, reason: collision with root package name */
    public final int f164122g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) lVar;
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "start openHKOfflinePayView", new java.lang.Object[0]);
        if (c0Var == null || jSONObject == null) {
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Z0, "getPageContext(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_hk", 1);
        intent.putExtra("appId", c0Var.mo48798x74292566());
        java.lang.String string = jSONObject.getString("timeStamp");
        if (!(string == null || string.length() == 0)) {
            intent.putExtra("timeStamp", string);
        }
        java.lang.String string2 = jSONObject.getString("nonceStr");
        if (!(string2 == null || string2.length() == 0)) {
            intent.putExtra("nonceStr", string2);
        }
        java.lang.String string3 = jSONObject.getString("package");
        if (!(string3 == null || string3.length() == 0)) {
            intent.putExtra("packageExt", string3);
        }
        java.lang.String string4 = jSONObject.getString("signType");
        if (!(string4 == null || string4.length() == 0)) {
            intent.putExtra("signtype", string4);
        }
        java.lang.String string5 = jSONObject.getString("paySign");
        if (!(string5 == null || string5.length() == 0)) {
            intent.putExtra("paySignature", string5);
        }
        intent.putExtra("source_type", 2);
        intent.putExtra("intent_jump_ui", f34605x24728b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(c0Var.mo48798x74292566());
        java.lang.String str = e17 != null ? e17.f387374d : "";
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(c0Var.mo48798x74292566());
        java.lang.String m52170xad58292c = b17 != null ? b17.x0().m52170xad58292c() : "";
        if (!(str == null || str.length() == 0)) {
            intent.putExtra("wxapp_username", str);
        }
        if (!(m52170xad58292c == null || m52170xad58292c.length() == 0)) {
            intent.putExtra("wxapp_path", m52170xad58292c);
        }
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.b0(this, c0Var, i17));
        j45.l.n(Z0, "wallet", ".ui.WalletJsApiAdapterUI", intent, this.f164122g);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class w9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34940x366c91de = 403;

    /* renamed from: NAME */
    public static final java.lang.String f34941x24728b = "openOfflinePayView";

    /* renamed from: g, reason: collision with root package name */
    public final int f165256g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenOfflinePayView", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v9(this, d0Var, i17));
        jSONObject.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(d0Var.mo48798x74292566());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenOfflinePayView", "sysConfig is null, invoke fail!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(d0Var.mo48798x74292566());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenOfflinePayView", "runtime is null, invoke fail!");
            return;
        }
        java.lang.String m52170xad58292c = b17.x0().m52170xad58292c();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", d0Var.mo48798x74292566());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("wxapp_username", e17.f387374d);
        intent.putExtra("wxapp_path", m52170xad58292c);
        ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
        intent.putExtra("key_from_scene", 7);
        j45.l.n(r07, "offline", ".ui.WalletOfflineEntranceUI", intent, this.f165256g);
    }
}

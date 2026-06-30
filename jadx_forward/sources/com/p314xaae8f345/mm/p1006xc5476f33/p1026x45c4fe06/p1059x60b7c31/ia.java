package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class ia extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34362x366c91de = 618;

    /* renamed from: NAME */
    public static final java.lang.String f34363x24728b = "openWCPayLQTDepositPlan";

    /* renamed from: g, reason: collision with root package name */
    public final int f162845g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ha(this, r07, d0Var, i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11813xf952a195 e17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.e(d0Var.mo48798x74292566());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "sysConfig is null, invoke fail!");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.l.b(d0Var.mo48798x74292566());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "runtime is null, invoke fail!");
            return;
        }
        java.lang.String m52170xad58292c = b17.x0().m52170xad58292c();
        java.lang.String optString = jSONObject.optString("routURL");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.mo48798x74292566());
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("packageExt", jSONObject.optString("package"));
        bundle.putString("signtype", jSONObject.optString("signType"));
        bundle.putString("paySignature", jSONObject.optString("paySign"));
        bundle.putString("pay_channel", jSONObject.optString("pay_channel"));
        bundle.putString("routeURL", jSONObject.optString("routURL"));
        bundle.putString("wxapp_username", e17.f387374d);
        bundle.putInt("jsapi_scene", 21);
        bundle.putString("command_word", f34363x24728b);
        bundle.putString("wxapp_path", m52170xad58292c);
        bundle.putInt("source_type", 2);
        if (android.text.TextUtils.isEmpty(optString)) {
            j45.l.n(r07, "wallet", ".ui.WalletJsApiAdapterUI", new android.content.Intent().putExtras(bundle), this.f162845g);
        } else if ("LQTFixedDepositPlanList".equals(optString)) {
            ((h45.q) i95.n0.c(h45.q.class)).mo24818x58c4fdf9(r07, bundle);
            d0Var.a(i17, o("ok"));
        } else {
            d0Var.a(i17, o("fail:auth denied"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "routURL auth failed!");
        }
    }
}

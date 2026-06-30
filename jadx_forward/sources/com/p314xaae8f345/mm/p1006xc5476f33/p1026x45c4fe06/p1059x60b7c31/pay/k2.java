package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes.dex */
public final class k2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34622x366c91de = 285;

    /* renamed from: NAME */
    public static final java.lang.String f34623x24728b = "requestVirtualPayment";

    /* renamed from: g, reason: collision with root package name */
    public boolean f164156g = false;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) lVar;
        if (jSONObject == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        android.app.Activity Z0 = e9Var.Z0();
        if (Z0 == null) {
            e9Var.a(i17, o("fail:internal error invalid android context"));
            return;
        }
        if (this.f164156g) {
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("errCode", 2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestVirtualPayment", "errCode: %d, errMsg: an order is being paid", 2);
            e9Var.a(i17, p("fail an order is being paid", hashMap));
            return;
        }
        this.f164156g = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i2 i2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.i2(this, e9Var, i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 V0 = e9Var.V0();
        if (V0 != null) {
            ce.g gVar = (ce.g) V0.B1(ce.g.class);
            if (gVar != null) {
                ((ce.o) gVar).V(true, true, null);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestVirtualPayment", "hy: associated page view is null!!");
        }
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestVirtualPayment", "iap payment start ... data : " + jSONObject);
        intent.putExtra("key_appid", e9Var.mo48798x74292566());
        intent.putExtra("key_product_id", jSONObject.optString("priceLevel"));
        intent.putExtra("key_price", jSONObject.optString("priceLevel"));
        intent.putExtra("key_currency_type", jSONObject.optString("currencyType", "CNY"));
        intent.putExtra("key_desc", jSONObject.optString("desc"));
        intent.putExtra("key_count", jSONObject.optInt("count", 1));
        intent.putExtra("key_is_mini_program", true);
        intent.putExtra("key_busiid", jSONObject.optString("outTradeNo"));
        intent.putExtra("key_virtual_pay_sign", jSONObject.optString("virtualPaySign"));
        intent.putExtra("key_attach", jSONObject.optString("attach"));
        intent.putExtra("key_extInfo", jSONObject.optString("extInfo"));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6) e9Var.t3();
        if (o6Var != null && o6Var.l2() != null) {
            intent.putExtra("key_wxAppScene", o6Var.l2().f169323f);
            intent.putExtra("key_wxAppRawScene", o6Var.l2().f169326i);
        }
        if (V0 != null && V0.k2()) {
            intent.putExtra("key_request_fullscreen", true);
        }
        nf.g.a(Z0).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.j2(this, i2Var));
        j45.l.n(Z0, "wallet_index", ".ui.WalletIapUI", intent, hashCode() & 65535);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public boolean z() {
        return true;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class za extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f35036x366c91de = 1050;

    /* renamed from: NAME */
    public static final java.lang.String f35037x24728b = "phoneBindCardEntry";

    /* renamed from: g, reason: collision with root package name */
    public final int f165486g = cf.b.a(this);

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPhoneBindCardEntry", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ya(this, d0Var, i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPhoneBindCardEntry", "get data: %s", jSONObject.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, d0Var.mo48798x74292566());
        bundle.putString("nonce_str", jSONObject.optString("noncestr"));
        bundle.putString("timeStamp", jSONObject.optString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("paySign", jSONObject.optString("paysign"));
        bundle.putString("signType", jSONObject.optString("signtype"));
        bundle.putString("jsapiName", f35037x24728b);
        bundle.putInt("jsapi_type", 1);
        j45.l.n(r07, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new android.content.Intent().putExtras(bundle), this.f165486g);
    }
}

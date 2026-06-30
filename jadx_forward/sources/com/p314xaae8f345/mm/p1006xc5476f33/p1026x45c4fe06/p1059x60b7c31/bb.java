package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes.dex */
public class bb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f33890x366c91de = 829;

    /* renamed from: NAME */
    public static final java.lang.String f33891x24728b = "phoneBindCardVerifySms";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0) lVar;
        if (d0Var.t3().r0() == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiPhoneBindCardVerifySms", "mmActivity is null, invoke fail!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPhoneBindCardVerifySms", "get data: %s", jSONObject.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, d0Var.mo48798x74292566());
        bundle.putString("nonce_str", jSONObject.optString("noncestr"));
        bundle.putString("timeStamp", jSONObject.optString(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("signType", jSONObject.optString("signtype"));
        bundle.putString("paySign", jSONObject.optString("paysign"));
        bundle.putString("sessionid", jSONObject.optString("sessionid"));
        bundle.putString("jsapiName", f33891x24728b);
        bundle.putInt("jsapi_type", 1);
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, bundle, com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3170x59c587e3.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ab(this, d0Var, i17));
    }
}

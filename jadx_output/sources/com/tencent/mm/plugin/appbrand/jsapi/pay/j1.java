package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class j1 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 820;
    public static final java.lang.String NAME = "requestFacetoFacePayment";

    /* renamed from: g, reason: collision with root package name */
    public final int f82614g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        if (c0Var == null) {
            return;
        }
        if (c0Var.t3() == null) {
            c0Var.a(i17, o("fail:internal error"));
            return;
        }
        if (jSONObject == null) {
            c0Var.a(i17, o("fail:invalid data"));
            return;
        }
        java.lang.String optString = jSONObject.optString("confirm_token");
        if (android.text.TextUtils.isEmpty(optString)) {
            c0Var.a(i17, o("fail:confirm_token is empty"));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_app_id", c0Var.t3().f74803n);
        intent.putExtra("key_confirm_id", optString);
        nf.g.a(c0Var.getF147807d()).f(new com.tencent.mm.plugin.appbrand.jsapi.pay.i1(this, new java.lang.ref.WeakReference(c0Var), i17));
        j45.l.n(c0Var.getF147807d(), "remittance", ".ui.F2FAppBrandRemittanceUI", intent, this.f82614g);
    }
}

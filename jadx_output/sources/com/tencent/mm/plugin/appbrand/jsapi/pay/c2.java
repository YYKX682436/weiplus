package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes7.dex */
public final class c2 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 976;
    public static final java.lang.String NAME = "requestPersonalPay";

    /* renamed from: g, reason: collision with root package name */
    public final int f82590g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u08;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject2;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        com.tencent.mars.xlog.Log.i("JsApiRequestPersonalPay", "[invoke JsApiRequestPersonalPay]");
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
        java.lang.String optString = jSONObject.optString("out_prepay_id");
        if (android.text.TextUtils.isEmpty(optString)) {
            c0Var.a(i17, o("fail: out_prepay_id is empty"));
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 t37 = c0Var.t3();
        int i18 = (t37 == null || (u08 = t37.u0()) == null || (appBrandStatObject2 = u08.f47269b2) == null) ? 1000 : appBrandStatObject2.f87790f;
        com.tencent.mm.plugin.appbrand.o6 t38 = c0Var.t3();
        int a17 = com.tencent.mm.pluginsdk.wallet.WalletJsapiData.a(i18, (t38 == null || (u07 = t38.u0()) == null || (appBrandStatObject = u07.f47269b2) == null) ? 0 : appBrandStatObject.f87793i);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_app_id", c0Var.t3().f74803n);
        intent.putExtra("out_prepay_id", optString);
        intent.putExtra("payChannel", a17);
        nf.g.a(c0Var.getF147807d()).f(new com.tencent.mm.plugin.appbrand.jsapi.pay.b2(this, new java.lang.ref.WeakReference(c0Var), i17));
        j45.l.n(c0Var.getF147807d(), "remittance", ".ui.PersonalPayRemittanceUI", intent, this.f82590g);
    }
}

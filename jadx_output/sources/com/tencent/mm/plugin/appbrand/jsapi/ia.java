package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class ia extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 618;
    public static final java.lang.String NAME = "openWCPayLQTDepositPlan";

    /* renamed from: g, reason: collision with root package name */
    public final int f81312g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.ha(this, r07, d0Var, i17));
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = com.tencent.mm.plugin.appbrand.l.e(d0Var.getAppId());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "sysConfig is null, invoke fail!");
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(d0Var.getAppId());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "runtime is null, invoke fail!");
            return;
        }
        java.lang.String currentUrl = b17.x0().getCurrentUrl();
        java.lang.String optString = jSONObject.optString("routURL");
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("appId", d0Var.getAppId());
        bundle.putString("timeStamp", jSONObject.optString("timeStamp"));
        bundle.putString("nonceStr", jSONObject.optString("nonceStr"));
        bundle.putString("packageExt", jSONObject.optString("package"));
        bundle.putString("signtype", jSONObject.optString("signType"));
        bundle.putString("paySignature", jSONObject.optString("paySign"));
        bundle.putString("pay_channel", jSONObject.optString("pay_channel"));
        bundle.putString("routeURL", jSONObject.optString("routURL"));
        bundle.putString("wxapp_username", e17.f305841d);
        bundle.putInt("jsapi_scene", 21);
        bundle.putString("command_word", NAME);
        bundle.putString("wxapp_path", currentUrl);
        bundle.putInt("source_type", 2);
        if (android.text.TextUtils.isEmpty(optString)) {
            j45.l.n(r07, "wallet", ".ui.WalletJsApiAdapterUI", new android.content.Intent().putExtras(bundle), this.f81312g);
        } else if ("LQTFixedDepositPlanList".equals(optString)) {
            ((h45.q) i95.n0.c(h45.q.class)).startLqtFixedDepositPlanListUseCase(r07, bundle);
            d0Var.a(i17, o("ok"));
        } else {
            d0Var.a(i17, o("fail:auth denied"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDepositPlan", "routURL auth failed!");
        }
    }
}

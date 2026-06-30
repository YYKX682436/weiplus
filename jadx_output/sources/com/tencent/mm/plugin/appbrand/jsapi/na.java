package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class na extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 616;
    public static final java.lang.String NAME = "openWCPayLQTDetail";

    /* renamed from: g, reason: collision with root package name */
    public final int f82382g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDetail", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.la(this, jSONObject.optInt("auto_jump_charge_setting"), jSONObject.optInt("show_open_toast"), r07, d0Var, i17));
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = com.tencent.mm.plugin.appbrand.l.e(d0Var.getAppId());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDetail", "sysConfig is null, invoke fail!");
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(d0Var.getAppId());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenWCPayLQTDetail", "runtime is null, invoke fail!");
            return;
        }
        java.lang.String currentUrl = b17.x0().getCurrentUrl();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("appId", d0Var.getAppId());
        intent.putExtra("timeStamp", jSONObject.optString("timeStamp"));
        intent.putExtra("nonceStr", jSONObject.optString("nonceStr"));
        intent.putExtra("packageExt", jSONObject.optString("package"));
        intent.putExtra("signtype", jSONObject.optString("signType"));
        intent.putExtra("paySignature", jSONObject.optString("paySign"));
        intent.putExtra("pay_channel", jSONObject.optString("pay_channel"));
        intent.putExtra("wxapp_username", e17.f305841d);
        intent.putExtra("jsapi_scene", 19);
        intent.putExtra("command_word", NAME);
        intent.putExtra("wxapp_path", currentUrl);
        intent.putExtra("source_type", 2);
        j45.l.n(r07, "wallet", ".ui.WalletJsApiAdapterUI", intent, this.f82382g);
    }
}

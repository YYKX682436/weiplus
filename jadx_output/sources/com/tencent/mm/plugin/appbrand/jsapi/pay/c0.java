package com.tencent.mm.plugin.appbrand.jsapi.pay;

/* loaded from: classes.dex */
public final class c0 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1249;
    public static final java.lang.String NAME = "openHKOfflinePayView";

    /* renamed from: g, reason: collision with root package name */
    public final int f82589g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = (com.tencent.mm.plugin.appbrand.service.c0) lVar;
        rk0.c.c("MicroMsg.JsApiOpenHKOfflinePay", "start openHKOfflinePayView", new java.lang.Object[0]);
        if (c0Var == null || jSONObject == null) {
            return;
        }
        android.app.Activity Z0 = c0Var.Z0();
        kotlin.jvm.internal.o.f(Z0, "getPageContext(...)");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("from_hk", 1);
        intent.putExtra("appId", c0Var.getAppId());
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
        intent.putExtra("intent_jump_ui", NAME);
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = com.tencent.mm.plugin.appbrand.l.e(c0Var.getAppId());
        java.lang.String str = e17 != null ? e17.f305841d : "";
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(c0Var.getAppId());
        java.lang.String currentUrl = b17 != null ? b17.x0().getCurrentUrl() : "";
        if (!(str == null || str.length() == 0)) {
            intent.putExtra("wxapp_username", str);
        }
        if (!(currentUrl == null || currentUrl.length() == 0)) {
            intent.putExtra("wxapp_path", currentUrl);
        }
        nf.g.a(Z0).f(new com.tencent.mm.plugin.appbrand.jsapi.pay.b0(this, c0Var, i17));
        j45.l.n(Z0, "wallet", ".ui.WalletJsApiAdapterUI", intent, this.f82589g);
    }
}

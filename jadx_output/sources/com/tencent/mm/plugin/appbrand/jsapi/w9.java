package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class w9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 403;
    public static final java.lang.String NAME = "openOfflinePayView";

    /* renamed from: g, reason: collision with root package name */
    public final int f83723g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenOfflinePayView", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.v9(this, d0Var, i17));
        jSONObject.toString();
        com.tencent.mm.plugin.appbrand.config.AppBrandSysConfigWC e17 = com.tencent.mm.plugin.appbrand.l.e(d0Var.getAppId());
        if (e17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenOfflinePayView", "sysConfig is null, invoke fail!");
            return;
        }
        com.tencent.mm.plugin.appbrand.o6 b17 = com.tencent.mm.plugin.appbrand.l.b(d0Var.getAppId());
        if (b17 == null) {
            d0Var.a(i17, o("fail"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenOfflinePayView", "runtime is null, invoke fail!");
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
        intent.putExtra("wxapp_username", e17.f305841d);
        intent.putExtra("wxapp_path", currentUrl);
        ((ng0.q) ((og0.o) i95.n0.c(og0.o.class))).getClass();
        intent.putExtra("key_from_scene", 7);
        j45.l.n(r07, "offline", ".ui.WalletOfflineEntranceUI", intent, this.f83723g);
    }
}

package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class za extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1050;
    public static final java.lang.String NAME = "phoneBindCardEntry";

    /* renamed from: g, reason: collision with root package name */
    public final int f83953g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.app.Activity r07 = d0Var.t3().r0();
        if (r07 == null) {
            d0Var.a(i17, o("fail:internal error invalid android context"));
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiPhoneBindCardEntry", "mmActivity is null, invoke fail!");
            return;
        }
        nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.ya(this, d0Var, i17));
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiPhoneBindCardEntry", "get data: %s", jSONObject.toString());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_APPID, d0Var.getAppId());
        bundle.putString("nonce_str", jSONObject.optString("noncestr"));
        bundle.putString("timeStamp", jSONObject.optString(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP));
        bundle.putString("package", jSONObject.optString("package"));
        bundle.putString("paySign", jSONObject.optString("paysign"));
        bundle.putString("signType", jSONObject.optString("signtype"));
        bundle.putString("jsapiName", NAME);
        bundle.putInt("jsapi_type", 1);
        j45.l.n(r07, "wallet", ".ui.WXPayJsApiKindaEntranceUI", new android.content.Intent().putExtras(bundle), this.f83953g);
    }
}

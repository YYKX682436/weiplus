package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public class r8 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 62;
    public static final java.lang.String NAME = "openAddress";

    /* renamed from: g, reason: collision with root package name */
    public final int f82898g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        android.content.Intent intent = new android.content.Intent();
        C(intent, d0Var, jSONObject);
        intent.putExtra("req_app_id", d0Var.getAppId());
        intent.putExtra("launch_from_appbrand", true);
        intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = d0Var.t3();
        if ((t37 instanceof com.tencent.mm.plugin.appbrand.o6) && (u07 = (o6Var = (com.tencent.mm.plugin.appbrand.o6) t37).u0()) != null && u07.L1.c()) {
            if (!o6Var.H2.g()) {
                intent.putExtra("content_view_height", u07.L1.f77357d);
                intent.putExtra("click_empty_close", u07.L1.f77359f);
            }
            if (u07.L1.f77361h) {
                intent.putExtra("force_light_mode", true);
            }
        }
        android.app.Activity r07 = t37.r0();
        if (r07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenAddress", "invoke appId:%s, callbackId:%d, context == null", d0Var.getAppId(), java.lang.Integer.valueOf(i17));
            d0Var.a(i17, o("fail:internal error invalid android context"));
        } else {
            nf.g.a(r07).f(new com.tencent.mm.plugin.appbrand.jsapi.q8(this, d0Var, i17));
            intent.putExtra("enter_scene_address", 2);
            j45.l.o(r07, "address", ".ui.WalletSelectAddrUI", intent, this.f82898g, false);
        }
    }

    public void C(android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject) {
    }
}

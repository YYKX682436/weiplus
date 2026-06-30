package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes.dex */
public final class r9 extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 1458;
    private static final java.lang.String NAME = "openMyAddress";

    /* renamed from: g, reason: collision with root package name */
    public final int f82899g = cf.b.a(this);

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject data, int i17) {
        com.tencent.mm.plugin.appbrand.o6 o6Var;
        com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC u07;
        com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var = (com.tencent.mm.plugin.appbrand.jsapi.d0) lVar;
        kotlin.jvm.internal.o.g(data, "data");
        if (d0Var == null) {
            return;
        }
        int optInt = data.optInt("selectedAddressId", -1);
        java.lang.String optString = data.optString("from", "select");
        android.content.Intent intent = new android.content.Intent();
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
        intent.putExtra("req_app_id", d0Var.getAppId());
        intent.putExtra("enter_scene_address", 2);
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenMyAddress", "invoke from: " + optString);
        if (kotlin.jvm.internal.o.b(optString, "select")) {
            intent.putExtra("pageTitle", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n3w));
            intent.putExtra("init_addr_id", optInt);
            intent.putExtra("KEY_ITEM_SHOW_EDIT", true);
            intent.putExtra("KEY_ITEM_SHOW_COPY", false);
            intent.putExtra("item_selectable", true);
            android.app.Activity r07 = d0Var.t3().r0();
            nf.g a17 = nf.g.a(r07);
            if (a17 != null) {
                a17.f(new com.tencent.mm.plugin.appbrand.jsapi.q9(this, d0Var, i17));
            }
            j45.l.o(r07, "address", ".ui.WalletSelectAddrUI", intent, this.f82899g, false);
            return;
        }
        if (kotlin.jvm.internal.o.b(optString, "manage")) {
            intent.putExtra("pageTitle", com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n3v));
            intent.putExtra("KEY_ITEM_SHOW_COPY", true);
            intent.putExtra("KEY_ITEM_SHOW_EDIT", false);
            android.app.Activity r08 = d0Var.t3().r0();
            if (r08 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiOpenMyAddress", "invoke appId:%s, callbackId:%d, context == null", d0Var.getAppId(), java.lang.Integer.valueOf(i17));
                d0Var.a(i17, o("fail:internal error invalid android context"));
            } else {
                nf.g a18 = nf.g.a(r08);
                if (a18 != null) {
                    a18.f(new com.tencent.mm.plugin.appbrand.jsapi.p9(this, d0Var, i17));
                }
                j45.l.o(r08, "address", ".ui.WalletSelectAddrUI", intent, this.f82899g, false);
            }
        }
    }
}

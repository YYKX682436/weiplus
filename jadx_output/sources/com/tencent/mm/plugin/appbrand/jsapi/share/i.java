package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class i extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 203;
    public static final java.lang.String NAME = "hideShareMenu";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiHideShareMenu", "invoke");
        com.tencent.mm.plugin.appbrand.page.v5 V0 = e9Var.V0();
        if (V0 != null) {
            V0.n1(3, true);
        }
        e9Var.a(i17, o("ok"));
    }
}

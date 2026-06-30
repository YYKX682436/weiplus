package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public class fa extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 201;
    public static final java.lang.String NAME = "openUrl";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString("url");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            e9Var.a(i17, o("fail"));
            return;
        }
        java.lang.String optString2 = jSONObject.optString("pageOrientation");
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiOpenUrl", "pageOrientation:%s", optString2);
        android.content.Context f147807d = e9Var.getF147807d();
        if (f147807d == null) {
            e9Var.a(i17, o("fail"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.q1 q1Var = new com.tencent.mm.plugin.appbrand.jsapi.q1();
        q1Var.f82850c = e9Var;
        ((com.tencent.mm.plugin.appbrand.jsapi.r1) e9Var.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class)).N(f147807d, optString, optString2, q1Var);
        e9Var.a(i17, o("ok"));
    }
}

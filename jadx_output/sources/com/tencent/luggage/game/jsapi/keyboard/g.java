package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 70;
    private static final java.lang.String NAME = "hideKeyboard";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.luggage.game.jsapi.keyboard.f(this, e9Var));
        e9Var.a(i17, o("ok"));
    }
}

package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 463;
    private static final java.lang.String NAME = "updateKeyboard";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.luggage.game.jsapi.keyboard.s(this, (com.tencent.mm.plugin.appbrand.e9) lVar, jSONObject.optString("value"), i17));
    }
}

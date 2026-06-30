package com.tencent.luggage.game.jsapi.keyboard;

/* loaded from: classes7.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.f {
    static final int CTRL_INDEX = 1;
    static final java.lang.String NAME = "showKeyboard";

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.luggage.game.jsapi.keyboard.e f47251g = new com.tencent.luggage.game.jsapi.keyboard.e();

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.luggage.game.jsapi.keyboard.c f47252h = new com.tencent.luggage.game.jsapi.keyboard.c();

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.luggage.game.jsapi.keyboard.d f47253i = new com.tencent.luggage.game.jsapi.keyboard.d();

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.luggage.game.jsapi.keyboard.u f47254m = new com.tencent.luggage.game.jsapi.keyboard.u();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.mm.plugin.appbrand.e9 e9Var = (com.tencent.mm.plugin.appbrand.e9) lVar;
        java.lang.String optString = jSONObject.optString("defaultValue");
        int optInt = jSONObject.optInt("maxLength", 140);
        if (optInt <= 0) {
            optInt = Integer.MAX_VALUE;
        }
        int i18 = optInt;
        boolean optBoolean = jSONObject.optBoolean("multiple", false);
        boolean optBoolean2 = jSONObject.optBoolean("confirmHold", false);
        pl1.c cVar = (pl1.c) pl1.e.a(jSONObject.optString("confirmType"), pl1.c.class);
        java.lang.String optString2 = jSONObject.optString("keyboardType");
        com.tencent.luggage.game.jsapi.keyboard.b.f47203d.getClass();
        com.tencent.luggage.game.jsapi.keyboard.b bVar = (com.tencent.luggage.game.jsapi.keyboard.b) pl1.e.a(optString2, com.tencent.luggage.game.jsapi.keyboard.b.class);
        if (bVar == null) {
            bVar = com.tencent.luggage.game.jsapi.keyboard.b.f47204e;
        }
        boolean optBoolean3 = jSONObject.optBoolean("showStoreEmoticon", false);
        boolean optBoolean4 = jSONObject.optBoolean("showStoreEmoticonPlus", false);
        boolean optBoolean5 = jSONObject.optBoolean("showEmoticonFirst", false);
        java.lang.String optString3 = jSONObject.optString("keyboardAppearance", "default");
        com.tencent.mars.xlog.Log.i("MicroMsg.WAGameJsApiShowKeyboard", "defaultValue :%s,finalMaxLength(%d),multiple(%b),confirmHold(%b),showStoreEmoticon(%b),showEmoticonFirst(%b),keyboardAppearance(%s),showStoreEmoticonPlus(%b).", optString, java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(optBoolean), java.lang.Boolean.valueOf(optBoolean2), java.lang.Boolean.valueOf(optBoolean3), java.lang.Boolean.valueOf(optBoolean5), optString3, java.lang.Boolean.valueOf(optBoolean4));
        e9Var.m(new com.tencent.luggage.game.jsapi.keyboard.i(this, e9Var, optString, i18, optBoolean, optBoolean2, cVar, bVar, optBoolean3, optBoolean4, optBoolean5, optString3.equalsIgnoreCase("dark"), i17));
    }
}

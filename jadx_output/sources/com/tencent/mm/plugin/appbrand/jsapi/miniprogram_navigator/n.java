package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class n extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 252;
    public static final java.lang.String NAME = "navigateBackMiniProgram";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public void A(com.tencent.mm.plugin.appbrand.jsapi.d0 d0Var, org.json.JSONObject jSONObject, int i17) {
        d0Var.m(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.m(this, d0Var, jSONObject.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA), jSONObject.optJSONObject("privateExtraData"), i17));
    }
}

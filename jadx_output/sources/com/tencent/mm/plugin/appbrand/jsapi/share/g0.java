package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class g0 extends com.tencent.mm.plugin.appbrand.jsapi.share.e0 {
    public static final int CTRL_INDEX = 773;
    public static final java.lang.String NAME = "shareAppMessageToSpecificContactForFakeNativeDirectly";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.e0, com.tencent.mm.plugin.appbrand.jsapi.share.l
    /* renamed from: N */
    public com.tencent.mm.plugin.appbrand.jsapi.share.d0 F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.share.d0 F = super.F(c0Var, jSONObject);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(F.E) || !com.tencent.mm.sdk.platformtools.t8.K0(F.F)) {
            return F;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageToSpecificContactForFakeNativeDirectly", "openid and chatroom is null");
        throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("openid and chatroom is null");
    }
}

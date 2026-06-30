package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class f0 extends com.tencent.mm.plugin.appbrand.jsapi.share.c0 {
    public static final int CTRL_INDEX = 552;
    public static final java.lang.String NAME = "shareAppMessageToSpecificContactDirectly";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.share.l
    public com.tencent.mm.plugin.appbrand.jsapi.share.u F(com.tencent.mm.plugin.appbrand.service.c0 c0Var, org.json.JSONObject jSONObject) {
        com.tencent.mm.plugin.appbrand.jsapi.share.u F = super.F(c0Var, jSONObject);
        if (jSONObject.has("chatToolMode")) {
            F.M = jSONObject.optString("chatToolMode", "");
            boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
            java.lang.String chatToolMode = F.M;
            kotlin.jvm.internal.o.g(chatToolMode, "chatToolMode");
            if (kotlin.jvm.internal.o.b(chatToolMode, "allPage")) {
                j91.d dVar = (j91.d) c0Var.t3().K1(j91.d.class);
                if (dVar != null) {
                    com.tencent.mm.plugin.appbrand.jsapi.chattool.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.chattool.t) dVar;
                    if (tVar.o(jSONObject)) {
                        F.F = tVar.d();
                    }
                }
                F.M = jSONObject.optString("chatToolMode", "");
            } else {
                F.M = optBoolean ? "subpackage" : "";
            }
        } else {
            F.M = jSONObject.optBoolean("useForChatTool", false) ? "subpackage" : "";
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(F.E) || !com.tencent.mm.sdk.platformtools.t8.K0(F.F)) {
            return F;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageToSpecificContactDirectly", "openid and chatroom is null");
        throw new com.tencent.mm.plugin.appbrand.jsapi.share.t("openid and chatroom is null");
    }
}

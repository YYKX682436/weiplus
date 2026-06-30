package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf;

/* loaded from: classes7.dex */
public class f0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.c0 {

    /* renamed from: CTRL_INDEX */
    public static final int f34795x366c91de = 552;

    /* renamed from: NAME */
    public static final java.lang.String f34796x24728b = "shareAppMessageToSpecificContactDirectly";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u F(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, org.json.JSONObject jSONObject) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.u F = super.F(c0Var, jSONObject);
        if (jSONObject.has("chatToolMode")) {
            F.M = jSONObject.optString("chatToolMode", "");
            boolean optBoolean = jSONObject.optBoolean("useForChatTool", false);
            java.lang.String chatToolMode = F.M;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatToolMode, "chatToolMode");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(chatToolMode, "allPage")) {
                j91.d dVar = (j91.d) c0Var.t3().K1(j91.d.class);
                if (dVar != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t tVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.t) dVar;
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
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(F.E) || !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(F.F)) {
            return F;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiShareAppMessageToSpecificContactDirectly", "openid and chatroom is null");
        throw new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.t("openid and chatroom is null");
    }
}

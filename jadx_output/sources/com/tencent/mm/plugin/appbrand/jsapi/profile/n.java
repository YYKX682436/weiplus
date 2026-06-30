package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class n extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 1191;
    public static final java.lang.String NAME = "operateWxappCGI";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject jSONObject2;
        if (lVar == null) {
            return;
        }
        org.json.JSONObject jSONObject3 = jSONObject != null ? jSONObject.getJSONObject("cgiInfo") : null;
        if (jSONObject3 == null) {
            return;
        }
        int optInt = jSONObject3.optInt("uiCgi");
        if (optInt != 2921) {
            com.tencent.mars.xlog.Log.i("MicroMsg.operateWxappCGI", "No match cgi to perform, cgiId: %d", java.lang.Integer.valueOf(optInt));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.operateWxappCGI", "perform handleGetProfileInfo, cgiId: %d", java.lang.Integer.valueOf(optInt));
        java.lang.String optString = (jSONObject == null || (jSONObject2 = jSONObject.getJSONObject("cgiInfo")) == null) ? null : jSONObject2.optString("uri");
        org.json.JSONObject jSONObject4 = jSONObject != null ? jSONObject.getJSONObject("reqData") : null;
        r45.rl3 rl3Var = new r45.rl3();
        rl3Var.f384973d = jSONObject4 != null ? jSONObject4.optString(dm.i4.COL_USERNAME) : null;
        rl3Var.f384974e = com.tencent.mm.sdk.platformtools.m2.f(lVar.getContext());
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70667d = 2921;
        lVar2.f70666c = optString;
        lVar2.f70665b = new com.tencent.mm.protocal.protobuf.GetProfileInfoResponse();
        lVar2.f70664a = rl3Var;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar2.a(), new com.tencent.mm.plugin.appbrand.jsapi.profile.m(lVar, i17, this));
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class q extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 508;
    private static final java.lang.String NAME = "profile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 122);
        java.lang.String optString2 = data.optString("profileReportInfo");
        java.lang.String optString3 = data.optString("tabType");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        if (((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() || !com.tencent.mm.storage.z3.F3(optString)) {
            com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest profileRequest = new com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest();
            profileRequest.d(optString);
            profileRequest.c(optInt);
            com.tencent.mm.plugin.appbrand.jsapi.profile.p pVar = new com.tencent.mm.plugin.appbrand.jsapi.profile.p(env, i17, this, optString2, optInt, optString3, optString);
            android.content.Context f147807d = env.getF147807d();
            java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
            com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(f147807d, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, profileRequest, pVar, null);
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.profile.b.a(env.getF147807d(), com.tencent.mm.R.string.n7b);
        com.tencent.mars.xlog.Log.w("MicroMsg.JsApiProfile", "open profile fail, is photo account");
        java.lang.String str = android.text.TextUtils.isEmpty(null) ? "fail:jsapi invalid request data" : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = com.tencent.mm.sdk.platformtools.z.f193105a;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errno", 101);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandJsApi", "makeReturnJson with JSONObject, put errno, e=%s", e17);
        }
        env.a(i17, u(str, jSONObject));
    }
}

package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class e extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 560;
    private static final java.lang.String NAME = "openBizProfile";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l env, org.json.JSONObject data, int i17) {
        kotlin.jvm.internal.o.g(env, "env");
        kotlin.jvm.internal.o.g(data, "data");
        java.lang.String optString = data.optString(dm.i4.COL_USERNAME);
        int optInt = data.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 122);
        java.lang.String optString2 = data.optString("profileReportInfo");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            env.a(i17, o("fail:invalid data"));
            return;
        }
        if (!((ox.g) ((tk.o) i95.n0.c(tk.o.class))).Ui() && com.tencent.mm.storage.z3.F3(optString)) {
            com.tencent.mm.plugin.appbrand.jsapi.profile.b.a(env.getContext(), com.tencent.mm.R.string.n7b);
            com.tencent.mars.xlog.Log.w("MicroMsg.JsApiOpenBizProfile", "openOfficialAccountChat fail, is photo account");
            env.a(i17, o("fail:invalid data"));
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest profileRequest = new com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest();
        profileRequest.d(optString);
        profileRequest.c(optInt);
        com.tencent.mm.plugin.appbrand.jsapi.profile.d dVar = new com.tencent.mm.plugin.appbrand.jsapi.profile.d(env, i17, this, optString2, optInt, optString);
        android.content.Context context = env.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, profileRequest, dVar, null);
    }
}

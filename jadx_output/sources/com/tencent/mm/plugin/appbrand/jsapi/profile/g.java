package com.tencent.mm.plugin.appbrand.jsapi.profile;

/* loaded from: classes7.dex */
public final class g extends com.tencent.mm.plugin.appbrand.jsapi.f {
    private static final int CTRL_INDEX = 559;
    private static final java.lang.String NAME = "openUserProfile";

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
        com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest profileRequest = new com.tencent.mm.plugin.appbrand.jsapi.profile.ProfileRequest();
        profileRequest.d(optString);
        profileRequest.c(optInt);
        com.tencent.mm.plugin.appbrand.jsapi.profile.f fVar = new com.tencent.mm.plugin.appbrand.jsapi.profile.f(env, i17, this, optString2, optString);
        android.content.Context context = env.getContext();
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, profileRequest, fVar, null);
    }
}

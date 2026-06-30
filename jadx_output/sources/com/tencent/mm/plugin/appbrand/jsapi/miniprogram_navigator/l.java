package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.plugin.appbrand.jsapi.f {
    public static final int CTRL_INDEX = 166;
    public static final java.lang.String NAME = "launchMiniProgram";

    @Override // com.tencent.mm.plugin.appbrand.jsapi.f
    public void A(com.tencent.mm.plugin.appbrand.jsapi.l lVar, org.json.JSONObject jSONObject, int i17) {
        com.tencent.luggage.sdk.jsapi.component.service.y yVar = (com.tencent.luggage.sdk.jsapi.component.service.y) lVar;
        java.lang.String optString = jSONObject.optString("appId", null);
        java.lang.String optString2 = jSONObject.optString(dm.i4.COL_USERNAME);
        boolean z17 = !com.tencent.mm.sdk.platformtools.t8.K0(optString2) && yVar.t3().u0().f47284z == 7;
        if (!z17 && com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            yVar.a(i17, o("fail:invalid data"));
            return;
        }
        if (!z17 && optString.equals(yVar.getAppId())) {
            yVar.a(i17, o("fail target appId is the same as the caller appId"));
            return;
        }
        java.lang.String optString3 = jSONObject.optString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, null);
        java.lang.String optString4 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, null);
        java.lang.String optString5 = jSONObject.optString("privateExtraData", null);
        int optInt = jSONObject.optInt(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, -1);
        java.lang.String optString6 = jSONObject.optString("sceneNote", null);
        int i18 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.a(jSONObject.optString("envVersion"), com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b.RELEASE).f82194d;
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
        if (z17) {
            launchParcel.f84901d = optString2;
        } else {
            launchParcel.f84902e = optString;
        }
        launchParcel.f84904g = i18;
        launchParcel.f84906i = optString3;
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        if (optInt != -1) {
            appBrandStatObject.f87790f = optInt;
        } else {
            appBrandStatObject.f87790f = 1037;
        }
        if (android.text.TextUtils.isEmpty(optString6)) {
            appBrandStatObject.f87791g = yVar.getAppId() + ":" + yVar.t3().u0().f47276v;
        } else {
            appBrandStatObject.f87791g = optString6;
        }
        if (jSONObject.has("preScene")) {
            appBrandStatObject.f87788d = jSONObject.optInt("preScene", 0);
            appBrandStatObject.f87789e = jSONObject.optString("preSceneNote");
        }
        launchParcel.f84900J = jSONObject.optBoolean("noRelaunchIfPathUnchanged", false);
        com.tencent.luggage.sdk.jsapi.component.b V0 = yVar.V0();
        java.lang.String Y1 = V0 != null ? V0.Y1() : "";
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77323e = yVar.getAppId();
        appBrandLaunchReferrer.f77324f = optString4;
        appBrandLaunchReferrer.f77325g = optString5;
        appBrandLaunchReferrer.f77322d = 1;
        appBrandLaunchReferrer.f77327i = Y1;
        launchParcel.f84910o = appBrandStatObject;
        launchParcel.f84911p = appBrandLaunchReferrer;
        launchParcel.B = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.k(this, yVar, i17);
        if (C(yVar, jSONObject, i17)) {
            com.tencent.mm.plugin.appbrand.x0.g(yVar.getAppId(), com.tencent.mm.plugin.appbrand.w0.LAUNCH_MINI_PROGRAM);
            ((com.tencent.mm.plugin.appbrand.launching.a) com.tencent.mm.plugin.appbrand.launching.precondition.x.f85032a).a(yVar.getContext(), launchParcel);
        }
    }

    public boolean C(com.tencent.luggage.sdk.jsapi.component.service.y yVar, org.json.JSONObject jSONObject, int i17) {
        return true;
    }
}

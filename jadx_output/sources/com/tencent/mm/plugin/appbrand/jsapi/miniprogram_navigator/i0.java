package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class i0 implements com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 f82236a = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0();

    public void a(java.lang.String str, java.lang.String str2) {
    }

    public int b(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        return 0;
    }

    public final void c(com.tencent.mm.plugin.appbrand.y yVar, java.lang.String str, int i17, java.lang.String str2, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar, org.json.JSONObject jSONObject, com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar) {
        com.tencent.mm.plugin.appbrand.keylogger.w.j(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, str);
        com.tencent.mm.plugin.appbrand.keylogger.w.a(com.tencent.mm.plugin.appbrand.step.KSProcessWeAppLaunch.class, str, java.lang.String.format("Network:%s", com.tencent.mars.comm.NetStatusUtil.getNetTypeString(yVar.t3().f74795d)));
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s) sourceType:%d, callbackId:%d", yVar.getAppId(), str, java.lang.Integer.valueOf(dVar.f82210g), java.lang.Integer.valueOf(dVar.f82204a));
        java.lang.String appId = yVar.getAppId();
        org.json.JSONObject optJSONObject = jSONObject.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA);
        org.json.JSONObject optJSONObject2 = jSONObject.optJSONObject("privateExtraData");
        boolean z17 = optJSONObject2 != null && optJSONObject2.optBoolean("isDirectGame", false);
        com.tencent.mm.plugin.appbrand.page.v5 V0 = yVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) yVar : ((com.tencent.mm.plugin.appbrand.e9) yVar).V0();
        java.lang.String Y1 = V0 != null ? V0.Y1() : "";
        ze.n nVar = (ze.n) yVar.t3();
        java.lang.String str3 = yVar.getAppId() + ":" + nVar.u0().f47276v + ":" + (nVar.u0().f47284z + 1000);
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject l27 = nVar.l2();
        com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject = new com.tencent.mm.plugin.appbrand.report.AppBrandStatObject();
        int i18 = dVar.f82205b;
        appBrandStatObject.f87790f = i18 != 0 ? i18 : 1037;
        appBrandStatObject.f87793i = l27.f87793i;
        if (i18 != 0 && !com.tencent.mm.sdk.platformtools.t8.K0(dVar.f82206c)) {
            str3 = java.lang.String.format("%s:%s", str3, dVar.f82206c);
        }
        appBrandStatObject.f87791g = str3;
        appBrandStatObject.f87788d = dVar.f82207d;
        appBrandStatObject.f87789e = dVar.f82208e;
        appBrandStatObject.f87794m = dVar.f82211h;
        com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer appBrandLaunchReferrer = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer();
        appBrandLaunchReferrer.f77323e = yVar.getAppId();
        appBrandLaunchReferrer.f77324f = optJSONObject == null ? "{}" : optJSONObject.toString();
        appBrandLaunchReferrer.f77325g = optJSONObject2 != null ? optJSONObject2.toString() : "{}";
        appBrandLaunchReferrer.f77322d = 1;
        appBrandLaunchReferrer.f77327i = Y1;
        appBrandLaunchReferrer.f77329n = dVar.f82210g;
        appBrandLaunchReferrer.f77328m = dVar.f82209f;
        java.lang.String str4 = dVar.f82212i;
        appBrandLaunchReferrer.f77330o = str4;
        if (!android.text.TextUtils.isEmpty(str4)) {
            com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs openBusinessViewExtraArgs = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchReferrer.OpenBusinessViewExtraArgs();
            appBrandLaunchReferrer.f77331p = openBusinessViewExtraArgs;
            openBusinessViewExtraArgs.f77336d = dVar.f82214k;
            openBusinessViewExtraArgs.f77337e = dVar.f82215l;
        }
        org.json.JSONObject a17 = ik1.t.a(jSONObject.optJSONObject("externalFileRefs"), yVar.getFileSystem());
        if (a17 != null) {
            appBrandLaunchReferrer.f77335t = a17.toString();
        }
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
        launchParcel.f84901d = null;
        launchParcel.f84902e = str;
        launchParcel.f84903f = 0;
        launchParcel.f84904g = i17;
        if (jSONObject.has("devuin")) {
            launchParcel.f84905h = kk.v.b(jSONObject.optString("devuin"));
        }
        launchParcel.f84906i = str2;
        launchParcel.f84910o = appBrandStatObject;
        launchParcel.f84911p = appBrandLaunchReferrer;
        launchParcel.f84914q = null;
        launchParcel.d();
        launchParcel.H = halfScreenConfig == null ? com.tencent.mm.plugin.appbrand.config.HalfScreenConfig.Y : halfScreenConfig;
        launchParcel.V = nVar.u0().H1;
        launchParcel.W = nVar.u0().I1;
        launchParcel.F = b(halfScreenConfig);
        launchParcel.f84900J = dVar.f82213j;
        launchParcel.f84926y1 = z17;
        if (nVar.N0()) {
            launchParcel.A1 = new com.tencent.mm.plugin.appbrand.config.AppBrandAssistantParams(true, nVar.u0().f(), 0.0d, 0.0d);
        }
        ik1.b0 b0Var = new ik1.b0();
        ((km5.q) ((km5.q) km5.u.d()).f(nVar).h(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h0(this, b0Var, nVar, appId, str, yVar, launchParcel)).h(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d0(this, yVar, dVar, launchParcel, jSONObject)).h(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.c0(this, b0Var, yVar, gVar, str, launchParcel))).s(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.b0(this, gVar, nVar, b0Var));
    }

    public km5.d d(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, org.json.JSONObject jSONObject) {
        return km5.u.e(null);
    }

    public boolean e(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.f fVar) {
        return false;
    }
}

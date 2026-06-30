package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class w extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s {
    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a
    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h C() {
        return com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0.f82261b;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    public com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g E(com.tencent.mm.plugin.appbrand.y yVar, org.json.JSONObject jSONObject, int i17) {
        return new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.x(this, new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.u(this, yVar, i17, jSONObject), yVar, jSONObject);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    public void F(final com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, int i17, java.lang.String str, final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v vVar) {
        if (!(appBrandRuntime instanceof com.tencent.mm.plugin.appbrand.o6)) {
            super.F(appBrandRuntime, i17, str, vVar);
            return;
        }
        final com.tencent.mm.plugin.appbrand.o6 o6Var = (com.tencent.mm.plugin.appbrand.o6) appBrandRuntime;
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel a17 = k91.h0.a(o6Var.u0());
        final wg1.b bVar = wg1.b.f445718n;
        a17.f84904g = i17;
        a17.f84906i = str;
        a17.d();
        a17.M = new com.tencent.mm.plugin.appbrand.launching.report.AppBrandRuntimeReloadReportBundle(o6Var.u0().f77298k2.f88134d, bVar.h());
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(o6Var.f74795d, a17, new com.tencent.mm.plugin.appbrand.launching.o0(o6Var, appBrandRuntime, bVar) { // from class: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w$$a

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f82276b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.tencent.mm.plugin.appbrand.AppBrandRuntime f82277c;

            @Override // com.tencent.mm.plugin.appbrand.launching.o0
            public final void a(com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, com.tencent.mm.plugin.appbrand.report.AppBrandStatObject appBrandStatObject) {
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v vVar2 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.v.this;
                com.tencent.mm.plugin.appbrand.o6 o6Var2 = this.f82276b;
                com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime2 = this.f82277c;
                wg1.b bVar2 = wg1.b.f445718n;
                com.tencent.mars.xlog.Log.i("MicroMsg.JsApiNavigateToMiniProgramWC", "handleRestartToTargetVersionType AppBrandPreInitTask callback %s", appBrandInitConfigWC);
                if (appBrandInitConfigWC != null) {
                    vVar2.getClass();
                    if (o6Var2.S || o6Var2.L0()) {
                        return;
                    }
                    appBrandInitConfigWC.f47269b2 = appBrandStatObject;
                    appBrandInitConfigWC.f77291t = true;
                    appBrandRuntime2.z1(appBrandInitConfigWC, bVar2.h());
                    return;
                }
                com.tencent.mars.xlog.Log.e("MicroMsg.JsApiNavigateToMiniProgramWC", "showRestartPromptForAttrAsyncUpdated preInitTask callback with null config, appId:%s", o6Var2.f74803n);
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.t tVar = (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.t) vVar2;
                tVar.getClass();
                java.lang.String str2 = android.text.TextUtils.isEmpty("get attrs failed") ? "fail" : "fail:get attrs failed";
                com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s sVar = tVar.f82270d;
                sVar.f81338e = false;
                tVar.f82267a.a(tVar.f82268b, sVar.o(str2));
                sVar.H(tVar.f82269c, "fail", str2);
            }
        }).G(true).I();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ff A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:15:0x0094, B:17:0x00bd, B:31:0x00ff, B:33:0x0111, B:34:0x0114, B:36:0x011a, B:37:0x011d, B:41:0x00f4, B:42:0x00f7, B:43:0x00fa, B:44:0x00d1, B:47:0x00d9, B:50:0x00e1), top: B:14:0x0094 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fa A[Catch: Exception -> 0x0129, TryCatch #0 {Exception -> 0x0129, blocks: (B:15:0x0094, B:17:0x00bd, B:31:0x00ff, B:33:0x0111, B:34:0x0114, B:36:0x011a, B:37:0x011d, B:41:0x00f4, B:42:0x00f7, B:43:0x00fa, B:44:0x00d1, B:47:0x00d9, B:50:0x00e1), top: B:14:0x0094 }] */
    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void H(org.json.JSONObject r26, java.lang.String r27, java.lang.String r28) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.w.H(org.json.JSONObject, java.lang.String, java.lang.String):void");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.s
    public boolean I(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, org.json.JSONObject jSONObject) {
        return (((com.tencent.mm.plugin.appbrand.o6) appBrandRuntime).e3() && jSONObject.optBoolean("forceUseEnvVersion", false)) ? false : true;
    }
}

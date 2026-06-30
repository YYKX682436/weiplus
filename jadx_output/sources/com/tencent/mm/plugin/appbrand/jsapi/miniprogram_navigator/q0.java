package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class q0 extends com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 {

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0 f82261b = new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.q0();

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0
    public void a(java.lang.String sessionId, java.lang.String appId) {
        com.tencent.mm.plugin.appbrand.wxassistant.u0 u0Var = (com.tencent.mm.plugin.appbrand.wxassistant.u0) ((com.tencent.mm.plugin.appbrand.service.u5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.u5.class));
        u0Var.getClass();
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(appId, "appId");
        com.tencent.mm.plugin.appbrand.wxassistant.w2 Di = u0Var.Di();
        Di.getClass();
        java.lang.String b17 = Di.b(sessionId);
        java.lang.String a17 = Di.a(sessionId);
        com.tencent.mm.plugin.appbrand.wxassistant.v2 v2Var = com.tencent.mm.plugin.appbrand.wxassistant.w2.f92328a;
        int i17 = com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).getInt(b17, -1) + 1;
        com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).putInt(b17, i17);
        com.tencent.mm.plugin.appbrand.wxassistant.v2.a(v2Var).putString(a17 + i17, appId);
        u0Var.Ri().putString(appId, "");
        long g17 = u0Var.Ri().g();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandWxAssistantService", "pushAppId: sessionId:" + sessionId + " appId:" + appId + " count:" + g17);
        if (g17 == 1) {
            com.tencent.mm.plugin.appbrand.wxassistant.n.f92236a.getClass();
            com.tencent.mm.plugin.appbrand.wxassistant.c3.f92150a.getClass();
            if (com.tencent.mm.plugin.appbrand.wxassistant.c3.f92155f) {
                ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.plugin.appbrand.wxassistant.j.f92213d);
            }
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0
    public int b(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        if (halfScreenConfig != null && halfScreenConfig.c()) {
            return halfScreenConfig.D == k91.x2.f305817e ? 3 : 2;
        }
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0
    public km5.d d(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.d dVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, org.json.JSONObject jSONObject) {
        if (yVar.t3() == null || yVar.t3().S || yVar.t3().L0()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig but component not working, targetAppId:%s, callbackId:%d", launchParcel.f84902e, java.lang.Integer.valueOf(dVar.f82204a));
            return pq5.h.b(null);
        }
        com.tencent.mm.plugin.appbrand.launching.g5 g5Var = com.tencent.mm.plugin.appbrand.launching.g5.f84619a;
        if (g5Var.d(launchParcel.f84902e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig %s->%s, force versionType=1", yVar.getAppId(), launchParcel.f84902e);
            launchParcel.f84904g = 1;
        }
        if (g5Var.e()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigatorWC", "prepareInitConfig %s->%s, force versionType=2", yVar.getAppId(), launchParcel.f84902e);
            launchParcel.f84904g = 2;
        }
        com.tencent.mm.plugin.appbrand.m6.a(yVar.getAppId()).f85711d = launchParcel.f84902e;
        com.tencent.mm.plugin.appbrand.m6.a(yVar.getAppId()).f85712e = launchParcel.f84906i;
        java.lang.String optString = jSONObject.optString("adUxInfo", null);
        if (!android.text.TextUtils.isEmpty(optString)) {
            if (launchParcel.f84920w == null) {
                launchParcel.f84920w = new android.os.PersistableBundle();
            }
            launchParcel.f84920w.putString("adUxInfo", optString);
        }
        qp3.a.c("AppBrandRuntime", "navigateToMiniProgram", optString, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        java.lang.String optString2 = jSONObject.optString("commonUxInfo");
        if (!android.text.TextUtils.isEmpty(optString2)) {
            if (launchParcel.f84920w == null) {
                launchParcel.f84920w = new android.os.PersistableBundle();
            }
            launchParcel.f84920w.putString("commonUxInfo", optString2);
        }
        qp3.a.d("AppBrandRuntime", "navigateToMiniProgram", optString2, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
        if (k01.j.f303039a.b(launchParcel.f84901d, launchParcel.f84902e) && launchParcel.F != 1) {
            new oa1.d();
            launchParcel.S = oa1.d.class.getName();
        }
        return pq5.h.a().h(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.p0(this, yVar, launchParcel, dVar, jSONObject));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0
    public boolean e(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.f fVar) {
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e eVar = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e.PROCEED;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g0 g0Var = (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g0) fVar;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h0 h0Var = g0Var.f82228b;
        com.tencent.mars.xlog.Log.i("MicroMsg.MiniProgramNavigator", "navigateTo fromAppID(%s) targetAppID(%s), navigation performOverride(%s)", h0Var.f82231c, h0Var.f82232d, eVar);
        g0Var.f82227a.c(java.lang.Boolean.TRUE);
        return true;
    }
}

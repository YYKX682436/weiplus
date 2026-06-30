package com.tencent.mm.plugin.appbrand.launching.teenmode;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.launching.teenmode.l f85202a = new com.tencent.mm.plugin.appbrand.launching.teenmode.l();

    public final void a(android.content.Context context, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC appBrandInitConfigWC, final yz5.q qVar) {
        if (appBrandInitConfigWC == null) {
            qVar.invoke(1, "", java.lang.Boolean.FALSE);
            return;
        }
        android.app.Activity a17 = q75.a.a(context);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandTeenModeTempAuthMgr", "doJumpToSendAuthorizationReqUI requires Activity context, but got ".concat(context.getClass().getSimpleName()));
            java.lang.String appId = appBrandInitConfigWC.f77278d;
            kotlin.jvm.internal.o.f(appId, "appId");
            qVar.invoke(1, "weapp_".concat(appId), java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String r17 = c01.z1.r();
        ot0.q qVar2 = new ot0.q();
        qVar2.f348666i = 33;
        qVar2.f348654f = appBrandInitConfigWC.f77279e;
        qVar2.f348734z = appBrandInitConfigWC.f77280f;
        qVar2.f348677k2 = appBrandInitConfigWC.f77278d;
        qVar2.f348673j2 = appBrandInitConfigWC.f47278x;
        qVar2.A2 = appBrandInitConfigWC.L;
        qVar2.f348737z2 = appBrandInitConfigWC.f77281g;
        java.lang.String str = "<fromusr>" + r17 + "</fromusr><type>49</type><content>" + com.tencent.mm.sdk.platformtools.t8.p(ot0.q.u(qVar2, null, null)) + "</content>";
        kotlin.jvm.internal.o.f(str, "toString(...)");
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        java.lang.String appId2 = appBrandInitConfigWC.f77278d;
        kotlin.jvm.internal.o.f(appId2, "appId");
        c0Var.Od(a17, 0, 1, "weapp_".concat(appId2), a17.getString(com.tencent.mm.R.string.a5_), a17.getString(com.tencent.mm.R.string.a59, appBrandInitConfigWC.f77279e), str, !appBrandInitConfigWC.g(), new uh4.a0(qVar) { // from class: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$sam$com_tencent_mm_plugin_teenmode_api_ITeenModeService_AuthorizationReqResultCallback$0
            private final /* synthetic */ yz5.q function;

            {
                kotlin.jvm.internal.o.g(qVar, "function");
                this.function = qVar;
            }

            @Override // uh4.a0
            public final /* synthetic */ void onResult(int i17, java.lang.String str2, boolean z17) {
                this.function.invoke(java.lang.Integer.valueOf(i17), str2, java.lang.Boolean.valueOf(z17));
            }
        });
    }

    public final void b(android.content.Context context, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC config, final yz5.p afterCheckAuthCallback) {
        kotlin.jvm.internal.o.g(config, "config");
        kotlin.jvm.internal.o.g(afterCheckAuthCallback, "afterCheckAuthCallback");
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "jumpToSendAuthorizationReqUI appId:" + config.f77278d + " isMMProcess:" + com.tencent.mm.sdk.platformtools.x2.n() + ' ');
        if (com.tencent.mm.sdk.platformtools.x2.n() && context != null) {
            a(context, config, new com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$1(afterCheckAuthCallback));
            return;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        }
        com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest appBrandTeenModeTempAuthMgr$IPCGoAuthRequest = new com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthRequest();
        appBrandTeenModeTempAuthMgr$IPCGoAuthRequest.setInitConfig(config);
        com.tencent.mm.plugin.appbrand.ipc.u uVar = new com.tencent.mm.plugin.appbrand.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3
            @Override // com.tencent.mm.plugin.appbrand.ipc.u
            public void onReceiveResult(com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$IPCGoAuthResult appBrandTeenModeTempAuthMgr$IPCGoAuthResult) {
                java.lang.String w17;
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got");
                if (appBrandTeenModeTempAuthMgr$IPCGoAuthResult == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got result null");
                    return;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got bizKey:" + appBrandTeenModeTempAuthMgr$IPCGoAuthResult.getBizKey() + " canGoOn:" + appBrandTeenModeTempAuthMgr$IPCGoAuthResult.getCanGoOn());
                yz5.p pVar = yz5.p.this;
                java.lang.String bizKey = appBrandTeenModeTempAuthMgr$IPCGoAuthResult.getBizKey();
                java.lang.String str = "";
                if (bizKey != null && (w17 = r26.i0.w(bizKey, "weapp_", "", false)) != null) {
                    str = w17;
                }
                pVar.invoke(str, java.lang.Boolean.valueOf(appBrandTeenModeTempAuthMgr$IPCGoAuthResult.getCanGoOn()));
            }
        };
        java.util.Map map = com.tencent.mm.plugin.appbrand.ipc.d.f78400a;
        com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.W6(context, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.class, appBrandTeenModeTempAuthMgr$IPCGoAuthRequest, uVar, null);
    }
}

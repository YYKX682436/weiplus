package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.l f166735a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.l();

    public final void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, final yz5.q qVar) {
        if (c11809xbc286be4 == null) {
            qVar.mo147xb9724478(1, "", java.lang.Boolean.FALSE);
            return;
        }
        android.app.Activity a17 = q75.a.a(context);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandTeenModeTempAuthMgr", "doJumpToSendAuthorizationReqUI requires Activity context, but got ".concat(context.getClass().getSimpleName()));
            java.lang.String appId = c11809xbc286be4.f158811d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId, "appId");
            qVar.mo147xb9724478(1, "weapp_".concat(appId), java.lang.Boolean.FALSE);
            return;
        }
        java.lang.String r17 = c01.z1.r();
        ot0.q qVar2 = new ot0.q();
        qVar2.f430199i = 33;
        qVar2.f430187f = c11809xbc286be4.f158812e;
        qVar2.f430267z = c11809xbc286be4.f158813f;
        qVar2.f430210k2 = c11809xbc286be4.f158811d;
        qVar2.f430206j2 = c11809xbc286be4.f128811x;
        qVar2.A2 = c11809xbc286be4.L;
        qVar2.f430270z2 = c11809xbc286be4.f158814g;
        java.lang.String str = "<fromusr>" + r17 + "</fromusr><type>49</type><content>" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(ot0.q.u(qVar2, null, null)) + "</content>";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        uh4.c0 c0Var = (uh4.c0) i95.n0.c(uh4.c0.class);
        java.lang.String appId2 = c11809xbc286be4.f158811d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appId2, "appId");
        c0Var.Od(a17, 0, 1, "weapp_".concat(appId2), a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a5_), a17.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a59, c11809xbc286be4.f158812e), str, !c11809xbc286be4.g(), new uh4.a0(qVar) { // from class: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$sam$com_tencent_mm_plugin_teenmode_api_ITeenModeService_AuthorizationReqResultCallback$0

            /* renamed from: function */
            private final /* synthetic */ yz5.q f35076x524f73d8;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qVar, "function");
                this.f35076x524f73d8 = qVar;
            }

            @Override // uh4.a0
            /* renamed from: onResult */
            public final /* synthetic */ void mo51826x57429edc(int i17, java.lang.String str2, boolean z17) {
                this.f35076x524f73d8.mo147xb9724478(java.lang.Integer.valueOf(i17), str2, java.lang.Boolean.valueOf(z17));
            }
        });
    }

    public final void b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 config, final yz5.p afterCheckAuthCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(afterCheckAuthCallback, "afterCheckAuthCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "jumpToSendAuthorizationReqUI appId:" + config.f158811d + " isMMProcess:" + com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() + ' ');
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() && context != null) {
            a(context, config, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12381x7384d202(afterCheckAuthCallback));
            return;
        }
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12377x3b384b4e c12377x3b384b4e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12377x3b384b4e();
        c12377x3b384b4e.m51816x103ece74(config);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u uVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u() { // from class: com.tencent.mm.plugin.appbrand.launching.teenmode.AppBrandTeenModeTempAuthMgr$jumpToSendAuthorizationReqUI$3
            @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
            /* renamed from: onReceiveResult, reason: merged with bridge method [inline-methods] */
            public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1142xa3787f7d.C12378x7586db7e c12378x7586db7e) {
                java.lang.String w17;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got");
                if (c12378x7586db7e == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got result null");
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTeenModeTempAuthMgr", "IProcessResultReceiver got bizKey:" + c12378x7586db7e.getBizKey() + " canGoOn:" + c12378x7586db7e.getCanGoOn());
                yz5.p pVar = yz5.p.this;
                java.lang.String bizKey = c12378x7586db7e.getBizKey();
                java.lang.String str = "";
                if (bizKey != null && (w17 = r26.i0.w(bizKey, "weapp_", "", false)) != null) {
                    str = w17;
                }
                pVar.mo149xb9724478(str, java.lang.Boolean.valueOf(c12378x7586db7e.getCanGoOn()));
            }
        };
        java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.d.f159933a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.W6(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.ActivityC11883xd41f5bb9.class, c12377x3b384b4e, uVar, null);
    }
}

package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public final class e1 extends kj1.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo f89673b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI f89674c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89675d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f89676e;

    public e1(com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo, java.lang.String shortLink, com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI, java.lang.String str, int i17, com.tencent.mm.pluginsdk.ui.span.l1 l1Var) {
        this.f89673b = wxaShortLinkInfo;
        this.f89674c = appBrandCheckWxaShortLinkUI;
        this.f89675d = str;
        this.f89676e = i17;
        if (wxaShortLinkInfo != null) {
            kj1.w wVar = kj1.w.f308379a;
            kotlin.jvm.internal.o.g(shortLink, "shortLink");
            kj1.w.f308380b.put(shortLink, wxaShortLinkInfo);
        }
    }

    @Override // kj1.m
    public kj1.v a() {
        return kj1.w.f308379a;
    }

    @Override // kj1.m
    public void b(android.content.Context ctx, com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams params, yz5.l launchResultCallback) {
        int i17;
        java.lang.String str;
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(launchResultCallback, "launchResultCallback");
        com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = this.f89674c;
        java.lang.String stringExtra = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("prescene_for_report");
        java.lang.String stringExtra2 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE);
        java.lang.String stringExtra3 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("presceneNote_for_report");
        try {
            i17 = java.lang.Integer.parseInt(stringExtra);
        } catch (java.lang.Exception unused) {
            i17 = 0;
        }
        java.lang.String stringExtra4 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("use_chat_tool");
        boolean parseBoolean = stringExtra4 != null ? java.lang.Boolean.parseBoolean(stringExtra4) : false;
        java.lang.String stringExtra5 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("weapp_source_username");
        java.lang.String stringExtra6 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("talkerUsername");
        boolean z17 = stringExtra6 == null || stringExtra6.length() == 0;
        int i18 = this.f89676e;
        java.lang.String str2 = this.f89675d;
        if (!z17) {
            str = stringExtra2 + ':' + str2 + ':' + str2 + "::" + i18 + ':' + stringExtra6;
        } else if (i17 == 3) {
            str = stringExtra2 + ':' + str2 + "::5";
        } else {
            str = stringExtra2 + ':' + str2;
        }
        l81.b1 b1Var = new l81.b1();
        java.lang.String str3 = params.f88865d;
        b1Var.f317014b = str3;
        java.lang.String str4 = params.f88870i;
        b1Var.f317012a = str4;
        b1Var.f317022f = params.f88866e;
        b1Var.f317018d = params.f88867f;
        b1Var.f317016c = params.f88868g;
        b1Var.P = params.f88869h;
        b1Var.f317032k = ae1.h.CTRL_INDEX;
        b1Var.f317035m = i17;
        b1Var.f317034l = str;
        b1Var.f317036n = stringExtra3;
        b1Var.Q = i18;
        if (parseBoolean) {
            b1Var.f317017c0 = new com.tencent.mm.plugin.appbrand.config.AppBrandLaunchModeParams("subpackage");
            b1Var.f317015b0 = stringExtra5;
        }
        b1Var.f317043u = stringExtra6;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "launchWxa  appId=" + b1Var.f317014b + " \nenterPath=" + b1Var.f317022f + " \nversion=" + b1Var.f317018d + " \nversionType=" + b1Var.f317016c + " \nshortLink=" + b1Var.P + " \nscene=" + b1Var.f317032k + " \nsceneNote=" + b1Var.f317034l + " \npresceneNote=" + b1Var.f317036n + " \nprescene=" + i17 + '\n');
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(ctx, b1Var);
        launchResultCallback.invoke(java.lang.Boolean.TRUE);
        int i19 = com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI.f89329g;
        appBrandCheckWxaShortLinkUI.getClass();
        if (!(str4.length() > 0)) {
            str4 = null;
        }
        if (str4 != null) {
            str3 = str4;
        }
        java.lang.String stringExtra7 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE);
        if (stringExtra7 == null) {
            stringExtra7 = "";
        }
        com.tencent.mm.pluginsdk.ui.span.l1 valueOf = com.tencent.mm.pluginsdk.ui.span.l1.valueOf(stringExtra7);
        java.lang.String stringExtra8 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("talkerUsername");
        java.lang.String stringExtra9 = appBrandCheckWxaShortLinkUI.getIntent().getStringExtra("senderUsername");
        if (valueOf == com.tencent.mm.pluginsdk.ui.span.l1.f191254h) {
            com.tencent.mm.plugin.wallet_core.utils.v0.f180993a.a(str3, new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(stringExtra9, null));
        } else if (valueOf == com.tencent.mm.pluginsdk.ui.span.l1.f191252f || valueOf == com.tencent.mm.pluginsdk.ui.span.l1.f191253g) {
            com.tencent.mm.plugin.wallet_core.utils.v0.f180993a.a(str3, new com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo(stringExtra8, stringExtra9, 0, (java.lang.String) null, "", (java.lang.String) null, 0L, 96, (kotlin.jvm.internal.i) null));
        }
    }

    @Override // kj1.m
    public void c(android.app.Activity ctx, java.lang.String url, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(url, "url");
        super.c(ctx, url, z17);
        com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = this.f89673b;
        kotlin.jvm.internal.o.d(wxaShortLinkInfo);
        this.f89674c.T6(1, wxaShortLinkInfo);
    }

    @Override // kj1.m
    public boolean d(android.app.Activity ctx, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        return true;
    }

    @Override // kj1.m
    public void e(android.app.Activity ctx, java.lang.String url) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(url, "url");
        super.e(ctx, url);
        com.tencent.mm.plugin.appbrand.shortlink.cgi.WxaShortLinkInfo wxaShortLinkInfo = this.f89673b;
        kotlin.jvm.internal.o.d(wxaShortLinkInfo);
        this.f89674c.T6(2, wxaShortLinkInfo);
    }
}

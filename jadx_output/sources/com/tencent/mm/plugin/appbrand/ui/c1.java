package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public final class c1 extends kj1.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.span.l1 f89615b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f89616c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI f89618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f89619f;

    public c1(com.tencent.mm.pluginsdk.ui.span.l1 l1Var, int i17, java.lang.String str, com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI, java.lang.ref.WeakReference weakReference) {
        this.f89615b = l1Var;
        this.f89616c = i17;
        this.f89617d = str;
        this.f89618e = appBrandCheckWxaShortLinkUI;
        this.f89619f = weakReference;
    }

    @Override // kj1.m
    public kj1.v a() {
        return kj1.w.f308379a;
    }

    @Override // kj1.m
    public void b(android.content.Context ctx, com.tencent.mm.plugin.appbrand.shortlink.AbsWxaShortLinkLauncher$WxaShortLinkLaunchParams params, yz5.l launchResultCallback) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(params, "params");
        kotlin.jvm.internal.o.g(launchResultCallback, "launchResultCallback");
        l81.b1 b1Var = new l81.b1();
        b1Var.f317014b = params.f88865d;
        b1Var.f317022f = params.f88866e;
        b1Var.f317018d = params.f88867f;
        b1Var.f317016c = params.f88868g;
        b1Var.P = params.f88869h;
        com.tencent.mm.pluginsdk.ui.span.l1 l1Var = this.f89615b;
        b1Var.f317032k = l1Var.f191264d;
        b1Var.f317035m = l1Var.f191265e;
        b1Var.Q = this.f89616c;
        b1Var.f317034l = this.f89617d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "launchWxa  appId=" + b1Var.f317014b + " \nenterPath=" + b1Var.f317022f + " \nversion=" + b1Var.f317018d + " \nversionType=" + b1Var.f317016c + " \nshortLink=" + b1Var.P + " \nscene=" + b1Var.f317032k + " \nprescene=" + b1Var.f317035m + '\n');
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).bj(ctx, b1Var);
        launchResultCallback.invoke(java.lang.Boolean.TRUE);
    }

    @Override // kj1.m
    public boolean d(android.app.Activity ctx, boolean z17) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI) this.f89619f.get();
        if (appBrandCheckWxaShortLinkUI == null) {
            return false;
        }
        if (appBrandCheckWxaShortLinkUI.f89332f.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "CgiCheckWxaShortLink  callback , timeout, ignore cgi result");
            return false;
        }
        com.tencent.mm.plugin.appbrand.ui.AppBrandCheckWxaShortLinkUI appBrandCheckWxaShortLinkUI2 = this.f89618e;
        java.lang.Runnable runnable = appBrandCheckWxaShortLinkUI2.f89331e;
        if (runnable != null) {
            com.tencent.mm.sdk.platformtools.u3.l(runnable);
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var = appBrandCheckWxaShortLinkUI2.f89330d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "CgiCheckWxaShortLink  CGI fail , go to fail H5 page");
            android.content.Intent intent = new android.content.Intent();
            java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/mp/waerrpage?appid=wx40f8626ddf43d362&type=tips&title=%s&msg=%s#wechat_redirect", java.util.Arrays.copyOf(new java.lang.Object[]{fp.s0.b(ctx.getString(com.tencent.mm.R.string.f490661a50), com.tencent.mapsdk.internal.rv.f51270c), fp.s0.b(ctx.getString(com.tencent.mm.R.string.a4z), com.tencent.mapsdk.internal.rv.f51270c)}, 2));
            kotlin.jvm.internal.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            intent.putExtra("forceHideShare", true);
            j45.l.j(appBrandCheckWxaShortLinkUI2.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        return true;
    }

    public lj1.a f() {
        return this.f89618e.U6(this.f89615b);
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes9.dex */
public final class c1 extends kj1.m {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 f171148b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f171149c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c f171151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f171152f;

    public c1(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 l1Var, int i17, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c, java.lang.ref.WeakReference weakReference) {
        this.f171148b = l1Var;
        this.f171149c = i17;
        this.f171150d = str;
        this.f171151e = activityC12639x67ea3d2c;
        this.f171152f = weakReference;
    }

    @Override // kj1.m
    public kj1.v a() {
        return kj1.w.f389912a;
    }

    @Override // kj1.m
    public void b(android.content.Context ctx, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1190x87299676.C12590x3a54364b params, yz5.l launchResultCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(launchResultCallback, "launchResultCallback");
        l81.b1 b1Var = new l81.b1();
        b1Var.f398547b = params.f170398d;
        b1Var.f398555f = params.f170399e;
        b1Var.f398551d = params.f170400f;
        b1Var.f398549c = params.f170401g;
        b1Var.P = params.f170402h;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.l1 l1Var = this.f171148b;
        b1Var.f398565k = l1Var.f272797d;
        b1Var.f398568m = l1Var.f272798e;
        b1Var.Q = this.f171149c;
        b1Var.f398567l = this.f171150d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "launchWxa  appId=" + b1Var.f398547b + " \nenterPath=" + b1Var.f398555f + " \nversion=" + b1Var.f398551d + " \nversionType=" + b1Var.f398549c + " \nshortLink=" + b1Var.P + " \nscene=" + b1Var.f398565k + " \nprescene=" + b1Var.f398568m + '\n');
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.xc) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.h6.class))).bj(ctx, b1Var);
        launchResultCallback.mo146xb9724478(java.lang.Boolean.TRUE);
    }

    @Override // kj1.m
    public boolean d(android.app.Activity ctx, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctx, "ctx");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c) this.f171152f.get();
        if (activityC12639x67ea3d2c == null) {
            return false;
        }
        if (activityC12639x67ea3d2c.f170865f.get()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "CgiCheckWxaShortLink  callback , timeout, ignore cgi result");
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12639x67ea3d2c activityC12639x67ea3d2c2 = this.f171151e;
        java.lang.Runnable runnable = activityC12639x67ea3d2c2.f170864e;
        if (runnable != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(runnable);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC12639x67ea3d2c2.f170863d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandCheckWxaShortLinkUI", "CgiCheckWxaShortLink  CGI fail , go to fail H5 page");
            android.content.Intent intent = new android.content.Intent();
            java.lang.String format = java.lang.String.format("https://mp.weixin.qq.com/mp/waerrpage?appid=wx40f8626ddf43d362&type=tips&title=%s&msg=%s#wechat_redirect", java.util.Arrays.copyOf(new java.lang.Object[]{fp.s0.b(ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572194a50), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), fp.s0.b(ctx.getString(com.p314xaae8f345.mm.R.C30867xcad56011.a4z), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c)}, 2));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            intent.putExtra("forceHideShare", true);
            j45.l.j(activityC12639x67ea3d2c2.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        return true;
    }

    public lj1.a f() {
        return this.f171151e.U6(this.f171148b);
    }
}

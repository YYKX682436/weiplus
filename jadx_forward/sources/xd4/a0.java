package xd4;

/* loaded from: classes4.dex */
public final class a0 implements xd4.f {

    /* renamed from: a, reason: collision with root package name */
    public final n34.v3 f535158a = new n34.v3();

    @Override // xd4.f
    public int a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        this.f535158a.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getVideoVideoMoveMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoVideoMoveMargin", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getVideoMoveMargin", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        return 0;
    }

    @Override // xd4.f
    public void b(android.app.Activity context, android.view.ViewStub stub, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.C17983xb14a9c8d onlineView, r45.jj4 jj4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stub, "stub");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onlineView, "onlineView");
        stub.setLayoutResource(com.p314xaae8f345.mm.R.C30864xbddafb2a.epl);
        stub.inflate();
        n34.v3 v3Var = this.f535158a;
        v3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        android.view.WindowInsets rootWindowInsets = context.getWindow().getDecorView().getRootWindowInsets();
        if (rootWindowInsets != null) {
            rootWindowInsets.getSystemWindowInsetBottom();
        }
        v3Var.f416289h = jj4Var;
        v3Var.f416287f = onlineView;
        v3Var.f416286e = context;
        android.view.KeyEvent.Callback m70640x4ee17f0a = onlineView.m70640x4ee17f0a();
        v3Var.f416288g = m70640x4ee17f0a instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4) m70640x4ee17f0a : null;
        android.app.Activity activity = v3Var.f416286e;
        v3Var.f416283b = activity != null ? (android.widget.ImageView) activity.findViewById(com.p314xaae8f345.mm.R.id.gzz) : null;
        android.app.Activity activity2 = v3Var.f416286e;
        v3Var.f416282a = activity2 != null ? (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46) activity2.findViewById(com.p314xaae8f345.mm.R.id.ncv) : null;
        android.app.Activity activity3 = v3Var.f416286e;
        v3Var.f416284c = activity3 != null ? activity3.findViewById(com.p314xaae8f345.mm.R.id.n_0) : null;
        android.app.Activity activity4 = v3Var.f416286e;
        if (activity4 != null) {
        }
        android.app.Activity activity5 = v3Var.f416286e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7 c22610x2e037bd7 = activity5 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22610x2e037bd7) activity5.findViewById(com.p314xaae8f345.mm.R.id.u4v) : null;
        if (c22610x2e037bd7 != null) {
            c22610x2e037bd7.m81280xaada124f(new n34.p3(v3Var));
        }
        android.app.Activity activity6 = v3Var.f416286e;
        android.widget.TextView textView = activity6 != null ? (android.widget.TextView) activity6.findViewById(com.p314xaae8f345.mm.R.id.u2b) : null;
        android.app.Activity activity7 = v3Var.f416286e;
        android.widget.TextView textView2 = activity7 != null ? (android.widget.TextView) activity7.findViewById(com.p314xaae8f345.mm.R.id.u2c) : null;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = v3Var.f416282a;
        if (c19718xcf23ab46 != null) {
            c19718xcf23ab46.m75679x5e005feb(textView);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab462 = v3Var.f416282a;
        if (c19718xcf23ab462 != null) {
            c19718xcf23ab462.m75680x10e11636(textView2);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab463 = v3Var.f416282a;
        if (c19718xcf23ab463 != null) {
            c19718xcf23ab463.m75694x30a01e54(new n34.q3(v3Var));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab464 = v3Var.f416282a;
        if (c19718xcf23ab464 != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46.i(c19718xcf23ab464, onlineView.m70639x52ad18a9(), false, 2, null);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab465 = v3Var.f416282a;
        if (c19718xcf23ab465 != null) {
            c19718xcf23ab465.m75693x7805eb2(new n34.r3(onlineView));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab466 = v3Var.f416282a;
        if (c19718xcf23ab466 != null) {
            c19718xcf23ab466.m75677xaa87fdc3(new n34.s3(v3Var, onlineView));
        }
        onlineView.m70646xe061e62c(new n34.t3(v3Var));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        if (jj4Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
            return;
        }
        int b17 = a06.d.b(jj4Var.R) * 1000;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_show_seekbar_duration, 16000);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsVideoConfig", "getSnsVideoShowSeekBarDurationMs: " + Ni);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSnsVideoShowSeekBarDurationMs", "com.tencent.mm.plugin.sns.ui.SnsVideoPlayConfig");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showSeekBarIfLessThanLimit", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(Ni);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f4 f4Var = v3Var.f416288g;
        objArr[1] = f4Var != null ? java.lang.Integer.valueOf(f4Var.mo69286x51e8b0a()) : null;
        objArr[2] = java.lang.Integer.valueOf(b17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsOnlineSeekBarHelper", "showSeekBarIfLessThanLimit limit:%d current:%d total:%d", objArr);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab467 = v3Var.f416282a;
        if (c19718xcf23ab467 != null) {
            c19718xcf23ab467.m75689x457bdbf5(b17);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab468 = v3Var.f416282a;
        if (c19718xcf23ab468 != null) {
            c19718xcf23ab468.setVisibility(0);
        }
        android.widget.ImageView imageView = v3Var.f416283b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab469 = v3Var.f416282a;
        if (c19718xcf23ab469 != null) {
            c19718xcf23ab469.m75692x95acfdd2(new n34.u3(v3Var));
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab4610 = v3Var.f416282a;
        if (c19718xcf23ab4610 != null) {
            c19718xcf23ab4610.m75681xdabc0b80(ca4.z0.g0() || b17 >= Ni);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab4611 = v3Var.f416282a;
        if (c19718xcf23ab4611 != null) {
            c19718xcf23ab4611.f();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab4612 = v3Var.f416282a;
        if (c19718xcf23ab4612 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v3Var.f416288g);
            c19718xcf23ab4612.mo75675x8d365359(!android.text.TextUtils.isEmpty(r11.getF256131m()));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSeekBarIfLessThanLimit", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    public void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSeekBarVisible", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        n34.v3 v3Var = this.f535158a;
        v3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("changeSeekBarVisible", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = v3Var.f416282a;
        if (c19718xcf23ab46 != null) {
            c19718xcf23ab46.m75681xdabc0b80(i17 == 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSeekBarVisible", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("changeSeekBarVisible", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    public void d(x25.b bVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReporter", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        n34.v3 v3Var = this.f535158a;
        v3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setReporter", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = v3Var.f416282a;
        if (c19718xcf23ab46 != null) {
            c19718xcf23ab46.m75687x5d1e8363(bVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReporter", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setReporter", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    /* renamed from: destroy */
    public void mo175368x5cd39ffa() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroy", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        n34.v3 v3Var = this.f535158a;
        v3Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("destroy", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = v3Var.f416282a;
        if (c19718xcf23ab46 != null) {
            c19718xcf23ab46.isSeekBarActive = false;
            wu5.c cVar = c19718xcf23ab46.hideTask;
            if (cVar != null) {
                cVar.cancel(false);
            }
        }
        v3Var.f416287f = null;
        v3Var.f416286e = null;
        v3Var.f416282a = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroy", "com.tencent.mm.plugin.sns.SnsOnlineSeekBarHelper");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("destroy", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }

    @Override // xd4.f
    /* renamed from: onConfigurationChanged */
    public void mo175369x50e1c15d(android.content.res.Configuration configuration) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
        this.f535158a.b(configuration);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onConfigurationChanged", "com.tencent.mm.plugin.sns.ui.video.SnsLegacyVideoSeekBar");
    }
}

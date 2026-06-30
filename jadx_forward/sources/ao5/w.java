package ao5;

/* loaded from: classes11.dex */
public final class w implements hq4.a, pi0.o0, pi0.w0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a f94115d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f94116e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f94117f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 f94118g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 f94119h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 f94120i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f94121m;

    public w(com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a videoActivity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoActivity, "videoActivity");
        this.f94115d = videoActivity;
        this.f94116e = "MicroMsg.ILinkVoipVideoActivityProxy-" + hashCode();
        this.f94117f = jz5.h.b(new ao5.u(this));
    }

    @Override // pi0.o0
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 F5() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9 = this.f94120i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10715x7014d3f9);
        return c10715x7014d3f9;
    }

    @Override // pi0.o0
    public bj0.t P1() {
        return null;
    }

    @Override // pi0.o0
    public android.view.ViewGroup S2() {
        return (android.widget.FrameLayout) ((jz5.n) this.f94117f).mo141623x754a37bb();
    }

    @Override // pi0.o0
    public com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 S3() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f94119h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c10716x931597c6);
        return c10716x931597c6;
    }

    @Override // pi0.o0
    public void S5(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab m78735x28280f95 = this.f94115d.m78735x28280f95();
        if (m78735x28280f95 != null) {
            m78735x28280f95.m81450x8e764904(z17);
        }
    }

    @Override // hq4.a
    /* renamed from: dealContentView */
    public void mo8717x2105eeb2(android.view.View view) {
        this.f94115d.setContentView(view);
    }

    @Override // hq4.a
    /* renamed from: finish */
    public void mo8718xb4098c93() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, "finish: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a context = this.f94115d;
        context.U6();
        context.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559486g5);
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f94118g;
        if (c10717xfba6b263 != null) {
            c10717xfba6b263.b();
        }
        if (this.f94121m) {
            ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("KEY_NEED_ANIM", true);
            i0Var.Yj(context, intent);
        }
    }

    @Override // pi0.o0
    /* renamed from: getActivity */
    public p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo8719x19263085() {
        return this.f94115d;
    }

    @Override // hq4.a
    /* renamed from: getForceOrientation */
    public int mo8720x663c095b() {
        return 1;
    }

    @Override // hq4.a
    /* renamed from: getLayoutId */
    public int mo8721x2ee31f5b() {
        return -1;
    }

    @Override // hq4.a
    /* renamed from: importUIComponents */
    public void mo8722xa59964ef(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
    }

    @Override // hq4.a
    /* renamed from: onActivityResult */
    public void mo8723x9d4787cb(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f94118g;
        if (c10717xfba6b263 == null || c10717xfba6b263.f149668m == null || c10717xfba6b263.f149670o == null) {
            return;
        }
        c10717xfba6b263.f149666h.m137423x1983fc75().mo137487x9d4787cb(i17, i18, intent);
    }

    @Override // hq4.a
    /* renamed from: onBackPressed */
    public boolean mo8724xbdc3c5dc() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f94118g;
        if (c10717xfba6b263 == null) {
            return true;
        }
        c10717xfba6b263.f149666h.m137435x8a0ad399().m138190x262dda78();
        return true;
    }

    @Override // hq4.a
    /* renamed from: onConfigurationChanged */
    public void mo8725x50e1c15d(android.content.res.Configuration configuration) {
        ((jp5.o) i95.n0.c(jp5.o.class)).ug(configuration);
    }

    @Override // hq4.a
    /* renamed from: onCreate */
    public void mo8726x3e5a77bb(android.os.Bundle bundle) {
        java.lang.String str;
        android.view.WindowInsetsController insetsController;
        com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.ui.ActivityC18916xbd02f08a activityC18916xbd02f08a = this.f94115d;
        activityC18916xbd02f08a.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559485g4, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
        this.f94120i = (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9) activityC18916xbd02f08a.getIntent().getParcelableExtra("page_info");
        this.f94119h = (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6) activityC18916xbd02f08a.getIntent().getParcelableExtra("page_style");
        this.f94121m = activityC18916xbd02f08a.getIntent().getBooleanExtra("EXTRA_VOIP_FROM_FINDER", false);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onCreate ");
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9 = this.f94120i;
        sb6.append(c10715x7014d3f9 != null ? c10715x7014d3f9.f149646d : null);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str2 = this.f94116e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb7);
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4 m137465x9cf0d20b = io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4.m137465x9cf0d20b();
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f92 = this.f94120i;
        if (c10715x7014d3f92 == null || (str = c10715x7014d3f92.f149646d) == null) {
            str = "";
        }
        if (m137465x9cf0d20b.get(str) == null) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("launch with cached engine id ");
            com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f93 = this.f94120i;
            sb8.append(c10715x7014d3f93 != null ? c10715x7014d3f93.f149646d : null);
            sb8.append(", but it has been destroyed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, sb8.toString());
            activityC18916xbd02f08a.V6(bundle);
            mo8718xb4098c93();
            return;
        }
        activityC18916xbd02f08a.setTheme(com.p314xaae8f345.mm.R.C30868x68b1db1.f575903l9);
        activityC18916xbd02f08a.mo2550x7c2abd06(1);
        activityC18916xbd02f08a.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        activityC18916xbd02f08a.V6(bundle);
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263(this);
        this.f94118g = c10717xfba6b263;
        c10717xfba6b263.f();
        activityC18916xbd02f08a.getWindow().getDecorView().setSystemUiVisibility(1280);
        activityC18916xbd02f08a.getWindow().setStatusBarColor(0);
        activityC18916xbd02f08a.getWindow().addFlags(Integer.MIN_VALUE);
        activityC18916xbd02f08a.getWindow().setNavigationBarColor(0);
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = activityC18916xbd02f08a.mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.w(new android.graphics.drawable.ColorDrawable(0));
            mo2533x106ab264.o();
        }
        if (android.os.Build.VERSION.SDK_INT >= 30 && (insetsController = activityC18916xbd02f08a.getWindow().getInsetsController()) != null) {
            insetsController.setSystemBarsBehavior(2);
        }
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = this.f94119h;
        if ((c10716x931597c6 != null ? c10716x931597c6.f149656m : null) != null) {
            java.lang.Integer num = c10716x931597c6 != null ? c10716x931597c6.f149656m : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            int intValue = num.intValue();
            if (fp.h.c(21)) {
                activityC18916xbd02f08a.getWindow().setNavigationBarColor(intValue);
            }
        }
    }

    @Override // hq4.a
    /* renamed from: onDestroy */
    public void mo8727xac79a11b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onDestroy: ");
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9 = this.f94120i;
        sb6.append(c10715x7014d3f9 != null ? c10715x7014d3f9.f149646d : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, sb6.toString());
        this.f94118g = null;
    }

    @Override // hq4.a
    /* renamed from: onKeyDown */
    public boolean mo8728x1f03f0c2(int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // hq4.a
    /* renamed from: onNewIntent */
    public void mo8729xc944513d(android.content.Intent intent) {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f9;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, "onNewIntent: " + intent);
        if (intent == null || (c10715x7014d3f9 = (com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9) intent.getParcelableExtra("page_info")) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, "pageInfo: " + c10715x7014d3f9 + "， " + c10715x7014d3f9.f149646d);
        java.lang.String str = c10715x7014d3f9.f149646d;
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10715x7014d3f9 c10715x7014d3f92 = this.f94120i;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c10715x7014d3f92 != null ? c10715x7014d3f92.f149646d : null)) {
            return;
        }
        mo8718xb4098c93();
        ((ku5.t0) ku5.t0.f394148d).B(new ao5.v(this, intent));
    }

    @Override // hq4.a
    /* renamed from: onPause */
    public void mo8730xb01dfb57() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, "onPause: ");
    }

    @Override // hq4.a
    /* renamed from: onPostResume */
    public void mo8731x2517b42c() {
    }

    @Override // hq4.a
    /* renamed from: onRequestPermissionsResult */
    public void mo8732x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f94118g;
        if (c10717xfba6b263 == null || c10717xfba6b263.f149668m == null || c10717xfba6b263.f149670o == null) {
            return;
        }
        c10717xfba6b263.f149666h.m137423x1983fc75().mo137491x953457f1(i17, permissions, grantResults);
    }

    @Override // hq4.a
    /* renamed from: onResume */
    public void mo8733x57429eec() {
        java.lang.String str = this.f94116e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onResume: ");
        boolean ie6 = ((jp5.o) i95.n0.c(jp5.o.class)).ie();
        if (!ie6 || this.f94118g != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onResume, flutterViewEngine is not null or isInVoip " + ie6);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onResume, reattach FlutterViewEngine");
        jz5.g gVar = this.f94117f;
        ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).removeAllViews();
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263(this);
        this.f94118g = c10717xfba6b263;
        c10717xfba6b263.f();
        ((android.widget.FrameLayout) ((jz5.n) gVar).mo141623x754a37bb()).requestApplyInsets();
    }

    @Override // hq4.a
    /* renamed from: onStart */
    public void mo8734xb05099c3() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, "onStart: ");
    }

    @Override // hq4.a
    /* renamed from: onStop */
    public void mo8735xc39f8281() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94116e, "onStop: ");
    }

    @Override // hq4.a
    /* renamed from: onSwipeBackFinish */
    public void mo8736xe4dc1f55() {
    }

    @Override // hq4.a
    /* renamed from: onTrimMemory */
    public void mo8737x29685b02(int i17) {
    }

    @Override // hq4.a
    /* renamed from: onUserLeaveHint */
    public boolean mo8738xb1e9ab4() {
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f94118g;
        if (c10717xfba6b263 == null) {
            return false;
        }
        c10717xfba6b263.h();
        return false;
    }

    @Override // pi0.o0
    public void pop() {
        this.f94115d.finish();
    }

    @Override // hq4.a
    /* renamed from: provideCustomActivityContentView */
    public android.view.View mo8739xa334195d() {
        return (android.widget.FrameLayout) ((jz5.n) this.f94117f).mo141623x754a37bb();
    }

    @Override // pi0.w0
    public void u3(pi0.w0 host) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10717xfba6b263 c10717xfba6b263 = this.f94118g;
        if (c10717xfba6b263 != null) {
            c10717xfba6b263.m45647xac79a11b();
        }
        this.f94118g = null;
    }

    @Override // pi0.o0
    public p012xc85e97e9.p093xedfae76a.o y6() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4 = this.f94115d.mo273xed6858b4();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo273xed6858b4, "getLifecycle(...)");
        return mo273xed6858b4;
    }
}

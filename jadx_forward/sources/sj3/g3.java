package sj3;

/* loaded from: classes14.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 f490053a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f490054b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f490055c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f490056d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f490057e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f490058f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f490059g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f490060h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f490061i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f490062j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f490063k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f490064l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f490065m;

    /* renamed from: n, reason: collision with root package name */
    public final tj3.x f490066n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f490067o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f490068p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f490069q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f490070r;

    /* renamed from: s, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f490071s;

    /* renamed from: t, reason: collision with root package name */
    public wj3.a f490072t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f490073u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f490074v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f490075w;

    /* renamed from: x, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.k0 f490076x;

    public g3(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 mainUI) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainUI, "mainUI");
        this.f490053a = mainUI;
        this.f490054b = jz5.h.b(new sj3.f3(this));
        this.f490055c = jz5.h.b(new sj3.d2(this));
        this.f490056d = jz5.h.b(new sj3.z1(this));
        this.f490057e = jz5.h.b(new sj3.r2(this));
        this.f490058f = jz5.h.b(new sj3.y1(this));
        this.f490059g = jz5.h.b(new sj3.d3(this));
        this.f490060h = jz5.h.b(new sj3.e3(this));
        this.f490061i = jz5.h.b(new sj3.o2(this));
        this.f490062j = jz5.h.b(new sj3.a3(this));
        this.f490063k = jz5.h.b(new sj3.p2(this));
        this.f490064l = jz5.h.b(new sj3.q2(this));
        this.f490065m = jz5.h.b(new sj3.f2(this));
        this.f490066n = new tj3.x(this);
        this.f490067o = jz5.h.b(new sj3.z2(this));
        this.f490068p = jz5.h.b(new sj3.c3(this));
        this.f490069q = jz5.h.b(new sj3.a2(this));
        this.f490070r = "";
        this.f490071s = new sj3.b3(this);
        this.f490073u = true;
        this.f490075w = jz5.h.b(new sj3.y2(this));
        this.f490076x = new sj3.b2(this);
    }

    public static final void a(sj3.g3 g3Var) {
        g3Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "onMiniMultitalkClicked");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.f231674a++;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().C(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.u0.a(8);
    }

    public final void b() {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l().f231796n.mo3195x754a37bb(), java.lang.Boolean.TRUE)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490053a;
            db5.t7.m(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibf));
        }
        l().O6(java.lang.Boolean.FALSE);
    }

    public final void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "dismissView viewShowing: " + this.f490074v);
        this.f490074v = false;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) ((jz5.n) this.f490055c).mo141623x754a37bb();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
            d().m67099x8e9940de(sj3.g2.f490052d);
            d().m67098x19b15f83(null);
        }
        e().f489944y = null;
        m();
        l().f231800r.mo522xb5bdeb7a(this.f490071s);
        l().f231796n.mo522xb5bdeb7a(this.f490076x);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8 d() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8) ((jz5.n) this.f490056d).mo141623x754a37bb();
    }

    public final sj3.a1 e() {
        return (sj3.a1) ((jz5.n) this.f490065m).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f f() {
        return (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) ((jz5.n) this.f490061i).mo141623x754a37bb();
    }

    public final android.view.View g() {
        return (android.view.View) ((jz5.n) this.f490063k).mo141623x754a37bb();
    }

    public final android.view.View h() {
        return (android.view.View) ((jz5.n) this.f490057e).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a i() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a) ((jz5.n) this.f490062j).mo141623x754a37bb();
    }

    public final android.view.View j() {
        return (android.view.View) ((jz5.n) this.f490059g).mo141623x754a37bb();
    }

    public final android.view.View k() {
        return (android.view.View) ((jz5.n) this.f490060h).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0 l() {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b0) ((jz5.n) this.f490054b).mo141623x754a37bb();
    }

    public final void m() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "hidePageElement: ");
        if (this.f490073u) {
            this.f490073u = false;
            android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(150L);
            android.view.View k17 = k();
            if (k17 != null) {
                k17.setAnimation(alphaAnimation);
            }
            android.view.View k18 = k();
            if (k18 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(k18, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                k18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(k18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View j17 = j();
            if (j17 != null) {
                j17.setAnimation(alphaAnimation);
            }
            android.view.View j18 = j();
            if (j18 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(j18, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                j18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(j18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "hidePageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            sj3.a1 e17 = e();
            e17.getClass();
            android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(1.0f, 0.0f);
            alphaAnimation2.setDuration(150L);
            android.view.View view = e17.f489939t;
            if (view != null) {
                view.setAnimation(alphaAnimation2);
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "hidePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "hidePanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public final void n() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "inflateView viewShowing: " + this.f490074v);
        this.f490074v = true;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490053a;
        android.view.View findViewById = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.nyf);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.widget.FrameLayout) ((jz5.n) this.f490055c).mo141623x754a37bb()).setVisibility(0);
        android.view.View view = (android.view.View) ((jz5.n) this.f490058f).mo141623x754a37bb();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        d().m67098x19b15f83(this.f490066n);
        d().m67099x8e9940de(new sj3.i2(e()));
        e().h(false, false);
        l().f231798p.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, new sj3.j2(this));
        android.view.View findViewById2 = serviceConnectionC16581x3d1d6bd2.findViewById(com.p314xaae8f345.mm.R.id.nyg);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(8);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(findViewById2, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "inflateView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        f().setOnClickListener(new sj3.k2(this));
        if (com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.eg.d(serviceConnectionC16581x3d1d6bd2.getTaskId())) {
            jz5.g gVar = this.f490069q;
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            f().setVisibility(8);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar).mo141623x754a37bb()).setOnClickListener(new sj3.n2(this));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274648k) {
            android.view.View h17 = h();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(0);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(h17, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h().setBackground(com.p314xaae8f345.mm.ui.uk.e(serviceConnectionC16581x3d1d6bd2, com.p314xaae8f345.mm.R.raw.f80026x8e7f448e, serviceConnectionC16581x3d1d6bd2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an)));
            if (zj3.j.a()) {
                android.view.View g17 = g();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                arrayList5.add(8);
                java.util.Collections.reverse(arrayList5);
                yj0.a.d(g17, arrayList5.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                g17.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                yj0.a.f(g17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().k((rj3.a) ((jz5.n) this.f490064l).mo141623x754a37bb());
            }
            h().setOnClickListener(new sj3.c2(this));
        } else {
            android.view.View h18 = h();
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(h18, arrayList6.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h18.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(h18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View g18 = g();
            java.util.ArrayList arrayList7 = new java.util.ArrayList();
            arrayList7.add(8);
            java.util.Collections.reverse(arrayList7);
            yj0.a.d(g18, arrayList7.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            g18.setVisibility(((java.lang.Integer) arrayList7.get(0)).intValue());
            yj0.a.f(g18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "checkScreenProjector", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        q();
        p012xc85e97e9.p093xedfae76a.g0 g0Var = l().f231796n;
        p012xc85e97e9.p093xedfae76a.k0 k0Var = this.f490076x;
        g0Var.mo522xb5bdeb7a(k0Var);
        l().f231796n.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, k0Var);
        l().f231800r.mo7806x9d92d11c(serviceConnectionC16581x3d1d6bd2, this.f490071s);
    }

    public final void o(int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 R;
        try {
            R = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.R("com.tecent.wx.voip.voipHasShownChangeToCelluarTipHistoryMultiTalk");
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.MT.MultiTalkNewTalkingUILogic", e17.toString(), new java.lang.Object[0]);
        }
        if (R.getBoolean("voipHasShownChangeToCelluarTipHistory", false)) {
            return;
        }
        R.G("voipHasShownChangeToCelluarTipHistory", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkChangeMobileNet: " + i17);
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490053a;
        java.lang.Object systemService = serviceConnectionC16581x3d1d6bd2.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
        if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
            db5.t7.n(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_y));
            return;
        }
        sj3.a1 e18 = e();
        e18.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "showNetWorkChangeMobileNet: " + i17);
        e18.g(1, i17, com.p314xaae8f345.mm.R.C30867xcad56011.k_y);
    }

    public final void p(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkCostMax: " + i17);
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1883xc140dd72.i4.INSTANCE.t()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showNetWorkCostMax: real show " + i17);
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490053a;
            java.lang.Object systemService = serviceConnectionC16581x3d1d6bd2.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            ((android.view.WindowManager) systemService).getDefaultDisplay().getMetrics(displayMetrics);
            if (displayMetrics.heightPixels / displayMetrics.density <= 540.0f) {
                db5.t7.n(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.k_x));
                return;
            }
            sj3.a1 e17 = e();
            e17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ControlPanelLogic", "showNetWorkCostMax: " + i17);
            e17.g(2, i17, com.p314xaae8f345.mm.R.C30867xcad56011.k_x);
        }
    }

    public final void q() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkNewTalkingUILogic", "showPageElement: ");
        if (this.f490073u) {
            return;
        }
        this.f490073u = true;
        android.view.animation.AlphaAnimation alphaAnimation = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration(150L);
        k().setAnimation(alphaAnimation);
        android.view.View k17 = k();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(k17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        k17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(k17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j().setAnimation(alphaAnimation);
        android.view.View j17 = j();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(j17, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        j17.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(j17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "showPageElement", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        sj3.a1 e17 = e();
        e17.getClass();
        android.view.animation.AlphaAnimation alphaAnimation2 = new android.view.animation.AlphaAnimation(0.0f, 1.0f);
        alphaAnimation2.setDuration(150L);
        android.view.View view = e17.f489939t;
        if (view != null) {
            view.setAnimation(alphaAnimation2);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "showPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic", "showPanel", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final void r(boolean z17) {
        jz5.g gVar = this.f490069q;
        jz5.g gVar2 = this.f490058f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2 serviceConnectionC16581x3d1d6bd2 = this.f490053a;
        if (z17) {
            f().setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f79636xc84bf7ff, -1));
            f().m82034x7541828(-1);
            k().getLayoutParams().height = i65.a.b(serviceConnectionC16581x3d1d6bd2, 52) + com.p314xaae8f345.mm.ui.bk.p(serviceConnectionC16581x3d1d6bd2);
            k().setBackgroundColor(serviceConnectionC16581x3d1d6bd2.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560403jg));
            android.view.View h17 = h();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(h17, arrayList.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(h17, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(8);
            f().setVisibility(0);
            return;
        }
        f().setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f80186x29194b54, -1));
        f().m82034x7541828(-1);
        k().getLayoutParams().height = i65.a.a(serviceConnectionC16581x3d1d6bd2, serviceConnectionC16581x3d1d6bd2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.a5n));
        k().setBackground(serviceConnectionC16581x3d1d6bd2.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.aqk));
        android.view.View h18 = h();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(h18, arrayList3.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        h18.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(h18, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = (android.view.View) ((jz5.n) gVar2).mo141623x754a37bb();
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(view2, arrayList4.toArray(), "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/multitalk/ui/widget/MultiTalkNewTalkingUILogic", "switchTopControlStyle", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.eg.d(serviceConnectionC16581x3d1d6bd2.getTaskId())) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) ((jz5.n) gVar).mo141623x754a37bb()).setVisibility(0);
            f().setVisibility(8);
        }
    }
}

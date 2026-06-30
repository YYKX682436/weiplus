package ns4;

/* loaded from: classes8.dex */
public final class s implements js4.k {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f421169a;

    /* renamed from: b, reason: collision with root package name */
    public final js4.n f421170b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f421171c;

    /* renamed from: d, reason: collision with root package name */
    public ns4.v f421172d;

    /* renamed from: e, reason: collision with root package name */
    public final ms4.h f421173e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f421174f;

    /* renamed from: g, reason: collision with root package name */
    public ns4.d f421175g;

    /* renamed from: h, reason: collision with root package name */
    public ns4.d f421176h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f421177i;

    /* renamed from: j, reason: collision with root package name */
    public android.widget.TextView f421178j;

    /* renamed from: k, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f421179k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f421180l;

    /* renamed from: m, reason: collision with root package name */
    public js4.j f421181m;

    /* renamed from: n, reason: collision with root package name */
    public js4.e f421182n;

    public s(final p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context, js4.n params) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f421169a = context;
        this.f421170b = params;
        this.f421174f = false;
        ms4.i iVar = new ms4.i(params);
        if (params.f383088m) {
            this.f421173e = (ms4.h) iVar.a(ms4.h.class);
        } else {
            p012xc85e97e9.p093xedfae76a.c1 a17 = p012xc85e97e9.p093xedfae76a.k1.a(context, iVar).a(ms4.h.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            this.f421173e = (ms4.h) a17;
        }
        ms4.h hVar = this.f421173e;
        hVar.getClass();
        hVar.f412569o = os4.h.d(params.f383076a);
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        hVar.f412571q = uuid;
        int i17 = params.f383076a;
        if (i17 != 0 && ((i17 != 1 && i17 != 2) || (uuid = params.f383078c) == null)) {
            uuid = "";
        }
        hVar.f412570p = uuid;
        ms4.h hVar2 = this.f421173e;
        hVar2.f412563f.m7809x1ff8439(context);
        hVar2.f412564g.m7809x1ff8439(context);
        hVar2.f412562e.m7809x1ff8439(context);
        hVar2.f412565h.m7809x1ff8439(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = params.f383084i;
        this.f421171c = y1Var == null ? new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(context, 0, false, true) : y1Var;
        r45.js3 js3Var = null;
        if (context.getResources().getConfiguration().orientation == 2) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2 = this.f421171c;
            if (y1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                throw null;
            }
            y1Var2.m(java.lang.Boolean.TRUE);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = this.f421171c;
        if (y1Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
        y1Var3.p(false);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var4 = this.f421171c;
        if (y1Var4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
        y1Var4.o(new ns4.k(this));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var5 = this.f421171c;
        if (y1Var5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
        y1Var5.n(new ns4.l(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.i0 i0Var = new p012xc85e97e9.p103xe821e364.p104xd1075a44.i0(context, 0);
        i0Var.d(context.getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.bb8, null));
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f569787o8, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f421177i = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.gyf);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f421178j = (android.widget.TextView) findViewById;
        android.view.View view = this.f421177i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.b4m);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View view2 = this.f421177i;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.pk9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById3;
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        os4.h.m(textView, 15);
        android.widget.TextView textView2 = this.f421178j;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("headerDesc");
            throw null;
        }
        os4.h.m(textView2, 10);
        if (params.f383084i != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80016xebd25a3f);
        } else {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        }
        int i18 = params.f383076a;
        if (i18 == 2 || i18 == 4 || i18 == 8 || i18 == 10 || i18 == 12 || i18 == 14 || i18 == 16 || i18 == 18 || i18 == 20) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f575212l91);
        }
        c22699x3dcdb352.setOnClickListener(new ns4.j(this));
        android.view.View view3 = this.f421177i;
        if (view3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById4 = view3.findViewById(com.p314xaae8f345.mm.R.id.avc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById4;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context) { // from class: com.tencent.mm.plugin.wallet.wecoin.ui.BuyGoodsBottomDialog$initCustomView$layoutManager$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: canScrollHorizontally */
            public boolean mo2416xc6ea780e() {
                return false;
            }
        };
        c1162x665295de.Q(0);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.N(i0Var);
        ns4.d dVar = new ns4.d(this);
        this.f421175g = dVar;
        c1163xf1deaba4.mo7960x6cab2c8d(dVar);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context) { // from class: com.tencent.mm.plugin.wallet.wecoin.ui.BuyGoodsBottomDialog$initCustomView$secondLayoutManager$1
            @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
            /* renamed from: canScrollHorizontally */
            public boolean mo2416xc6ea780e() {
                return false;
            }
        };
        c1162x665295de2.Q(0);
        android.view.View view4 = this.f421177i;
        if (view4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        android.view.View findViewById5 = view4.findViewById(com.p314xaae8f345.mm.R.id.avg);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById5, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById5;
        c1163xf1deaba42.mo7967x900dcbe1(c1162x665295de2);
        c1163xf1deaba42.N(i0Var);
        ns4.d dVar2 = new ns4.d(this);
        this.f421176h = dVar2;
        c1163xf1deaba42.mo7960x6cab2c8d(dVar2);
        android.view.View view5 = this.f421177i;
        if (view5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        dy1.a.i(view5, "buy_coin_view");
        android.view.View view6 = this.f421177i;
        if (view6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        dy1.a.k(view6, kz5.c1.l(new jz5.l("coin_report_session_id", js4.r.f383100c), new jz5.l("coin_business_id", java.lang.Integer.valueOf(js4.r.f383098a))));
        android.view.View view7 = this.f421177i;
        if (view7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        dy1.a.l(view7, 32, 25955);
        c(java.lang.Boolean.TRUE);
        ms4.h hVar3 = this.f421173e;
        hVar3.f412562e.mo7806x9d92d11c(context, new ns4.e(this));
        hVar3.f412563f.mo7806x9d92d11c(context, new ns4.f(this));
        hVar3.f412564g.mo7806x9d92d11c(context, new ns4.g(this));
        hVar3.f412565h.mo7806x9d92d11c(context, new ns4.h(this));
        ms4.h hVar4 = this.f421173e;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RechargeProductsDialogViewModel", "getCacheData, isCacheDataLoaded: %s", java.lang.Boolean.valueOf(hVar4.f412568n));
        if (!hVar4.f412568n) {
            hVar4.f412568n = true;
            int a18 = js4.s.a(hVar4.f412561d.f383076a);
            java.lang.String str = (java.lang.String) gm0.j1.u().c().p(a18 + "USERINFO_WECOIN_PRICE_LIST_RESPONSE_STRING_SYNC", "");
            if (!(str == null || str.length() == 0)) {
                r45.js3 js3Var2 = new r45.js3();
                byte[] bytes = str.getBytes(r26.c.f450400c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                try {
                    js3Var2.mo11468x92b714fd(bytes);
                    js3Var = js3Var2;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                }
            }
            p012xc85e97e9.p093xedfae76a.j0 j0Var = hVar4.f412565h;
            if (js3Var != null) {
                j0Var.mo7808x76db6cb1(js3Var);
            }
            r45.js3 js3Var3 = (r45.js3) j0Var.mo3195x754a37bb();
            if (js3Var3 != null) {
                hVar4.f412567m = js3Var3.f459621g;
            }
            long i19 = os4.h.i();
            if (i19 > 0) {
                hVar4.f412563f.mo7808x76db6cb1(java.lang.Long.valueOf(i19));
            }
        }
        js4.n nVar = this.f421170b;
        int i27 = nVar.f383076a;
        int i28 = nVar.f383077b;
        int i29 = (int) nVar.f383086k;
        hVar4.N6(8, 1, 0, "");
        ks4.g gVar = new ks4.g(i28 >= 1 ? i28 : js4.s.a(i27), i27, java.lang.Integer.valueOf(i29));
        hVar4.f412566i = gVar;
        pq5.g l17 = gVar.l();
        if (l17 != null) {
            l17.h(new ms4.g(hVar4, i28));
        }
        new ks4.e().l().h(new ms4.f(hVar4));
    }

    public static final void a(ns4.s sVar, r45.ja7 info) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0;
        android.view.View view = sVar.f421177i;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
        boolean isChecked = ((android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.lmb)).isChecked();
        ms4.h hVar = sVar.f421173e;
        if (isChecked) {
            sVar.f421180l = true;
            js4.j jVar = sVar.f421181m;
            if (jVar != null) {
                jVar.a(sVar, java.lang.Boolean.FALSE);
            }
            js4.e eVar = sVar.f421182n;
            if (eVar != null && (Y0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk) eVar).f196740a.Y0()) != null) {
                Y0.m57637x66268092();
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = sVar.f421171c;
            if (y1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
                throw null;
            }
            y1Var.q();
            ((q30.k) ((r30.p) i95.n0.c(r30.p.class))).Ai();
            int i17 = sVar.f421170b.f383076a;
            hVar.getClass();
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context = sVar.f421169a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            js4.n nVar = new js4.n();
            nVar.f383081f = info.f459212d;
            nVar.f383080e = hVar.f412567m;
            nVar.f383076a = i17;
            java.lang.String str = hVar.f412570p;
            if (str == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSceneSessionID");
                throw null;
            }
            nVar.f383078c = str;
            js4.n nVar2 = hVar.f412561d;
            nVar.f383079d = nVar2.f383079d;
            nVar.f383077b = nVar2.f383077b;
            nVar.f383086k = nVar2.f383086k;
            nVar.f383087l = (r45.js3) hVar.f412565h.mo3195x754a37bb();
            nVar.f383083h = info.f459213e;
            ms4.j0.f412579e.c(context, nVar);
        } else {
            sVar.b();
        }
        hVar.O6(5);
    }

    public final void b() {
        android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(this.f421169a, com.p314xaae8f345.mm.R.C30854x2dc211.f559270y);
        android.view.View view = this.f421177i;
        if (view != null) {
            ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.lmc)).startAnimation(loadAnimation);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCustomView");
            throw null;
        }
    }

    public final void c(java.lang.Boolean bool) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        if (bool == null) {
            return;
        }
        if (bool.booleanValue()) {
            p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f421169a;
            u3Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(activityC1102x9ee2d9f, activityC1102x9ee2d9f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ggc), true, 3, new ns4.n(this));
        } else {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = this.f421179k;
            if (u3Var2 != null) {
                u3Var2.dismiss();
            }
            u3Var = null;
        }
        this.f421179k = u3Var;
    }

    public void d() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f421171c;
        if (y1Var != null) {
            y1Var.q();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
    }
}

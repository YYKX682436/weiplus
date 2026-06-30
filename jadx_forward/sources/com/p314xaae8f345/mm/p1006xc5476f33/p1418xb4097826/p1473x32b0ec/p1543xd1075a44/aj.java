package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class aj extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8 implements android.view.View.OnClickListener {
    public final android.widget.TextView A;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15321x88112586 B;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15320x1248eea5 C;
    public final bm2.w2 D;
    public final android.view.View E;
    public final android.widget.TextView F;
    public final android.view.View G;
    public final jz5.g H;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14362xd06b9581 I;

    /* renamed from: J, reason: collision with root package name */
    public final com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff f199301J;
    public final jz5.g K;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f199302h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f199303i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 f199304m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f199305n;

    /* renamed from: o, reason: collision with root package name */
    public final int f199306o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f199307p;

    /* renamed from: q, reason: collision with root package name */
    public final android.view.View f199308q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c f199309r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f199310s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f199311t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f199312u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f199313v;

    /* renamed from: w, reason: collision with root package name */
    public final p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 f199314w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ProgressBar f199315x;

    /* renamed from: y, reason: collision with root package name */
    public final android.widget.TextView f199316y;

    /* renamed from: z, reason: collision with root package name */
    public final android.widget.TextView f199317z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aj(android.content.Context context) {
        super(context);
        float m58105x1a7dbbfd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        this.f199305n = z17;
        if (z17) {
            float m58105x1a7dbbfd2 = m58105x1a7dbbfd();
            float m58107x754ccc10 = m58107x754ccc10();
            m58105x1a7dbbfd = (m58105x1a7dbbfd2 > m58107x754ccc10 ? m58107x754ccc10 : m58105x1a7dbbfd2) - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        } else {
            m58105x1a7dbbfd = m58105x1a7dbbfd() * (ae2.in.f85221a.h0() / 100.0f);
        }
        this.f199306o = (int) m58105x1a7dbbfd;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aqp, (android.view.ViewGroup) this, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f199307p = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565834dr5);
        this.f199308q = findViewById;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c) inflate.findViewById(com.p314xaae8f345.mm.R.id.dr6);
        this.f199309r = c22613xe7040d9c;
        android.view.View findViewById2 = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dr9);
        this.f199310s = findViewById2;
        android.view.View findViewById3 = c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565831dr2);
        this.f199311t = findViewById3;
        this.f199312u = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565833dr4);
        this.f199313v = (android.widget.ImageView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f565832dr3);
        android.widget.ImageView imageView = (android.widget.ImageView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dr7);
        this.f199314w = (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dra);
        this.f199315x = (android.widget.ProgressBar) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dr_);
        this.f199316y = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dsk);
        this.f199317z = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.drp);
        this.A = (android.widget.TextView) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.dsp);
        this.B = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15321x88112586(context);
        this.C = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15320x1248eea5(context);
        bm2.w2 w2Var = new bm2.w2();
        this.D = w2Var;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qle);
        this.E = findViewById4;
        this.F = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.qpz);
        android.view.View findViewById5 = inflate.findViewById(com.p314xaae8f345.mm.R.id.qqc);
        this.G = findViewById5;
        this.H = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.vi.f201602d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14362xd06b9581 c14362xd06b9581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14362xd06b9581) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.ecx);
        c14362xd06b9581.m8315x6cab2c8d(w2Var);
        c14362xd06b9581.m8289xa5a25773(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.zi(c14362xd06b9581));
        this.I = c14362xd06b9581;
        this.f199301J = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff) c22613xe7040d9c.findViewById(com.p314xaae8f345.mm.R.id.f566001ed0);
        this.K = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ui.f201507d);
        findViewById.setOnClickListener(this);
        findViewById2.setOnClickListener(this);
        findViewById3.setOnClickListener(this);
        imageView.setOnClickListener(this);
        findViewById5.setOnClickListener(this);
        findViewById4.setOnClickListener(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansTaskWidget", "init isLand:" + z17);
    }

    /* renamed from: getMmkv */
    private final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m57953xfb829b81() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.K).mo141623x754a37bb();
    }

    /* renamed from: getNotifyMmkv */
    private final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 m57954xa8ce29ea() {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.H).mo141623x754a37bb();
    }

    /* renamed from: setTitle */
    private final void m57955x53bfe316(gk2.e eVar) {
        java.lang.String str;
        ya2.g gVar = ya2.h.f542017a;
        if (eVar == null || (str = ((mm2.c1) eVar.a(mm2.c1.class)).f410385o) == null) {
            str = "";
        }
        ya2.b2 b17 = gVar.b(str);
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        mn2.n nVar = new mn2.n(b17 != null ? b17.m176700xe5e0d2a0() : "", null, 2, null);
        android.widget.ImageView titleIcon = this.f199313v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(titleIcon, "titleIcon");
        a17.c(nVar, titleIcon, g1Var.h(mn2.f1.f411490h));
        this.f199312u.setText("");
        android.view.ViewParent parent = this.f199312u.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) parent;
        int measuredWidth = viewGroup.getMeasuredWidth();
        int childCount = viewGroup.getChildCount();
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            android.view.View childAt = viewGroup.getChildAt(i18);
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, this.f199312u)) {
                int measuredWidth2 = i17 + childAt.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                i17 = measuredWidth2 + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
            }
        }
        int i19 = measuredWidth - i17;
        if (i19 > 0) {
            this.f199312u.setMaxWidth(i19);
        } else {
            this.f199312u.setMaxWidth((int) (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x - com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561202c6)));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansTaskWidget", "setTitle parentWidth:" + measuredWidth + ",sibleWidth:" + i17 + ",titleTvMaxWidth:" + i19 + ",set maxWidth:" + this.f199312u.getMaxWidth());
        android.widget.TextView textView = this.f199312u;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = this.f199307p.getContext();
        android.content.Context context2 = this.f199307p.getContext();
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = b17 != null ? b17.w0() : "";
        java.lang.String string = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ddp, objArr);
        float textSize = this.f199312u.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n8
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l basePlugin) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(basePlugin, "basePlugin");
        super.a(basePlugin);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22613xe7040d9c c22613xe7040d9c = this.f199309r;
        c22613xe7040d9c.getLayoutParams().height = this.f199306o;
        c22613xe7040d9c.m81307xf9cef5a7(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.ti(this));
    }

    public final void b() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f199304m;
        if (y1Var != null) {
            y1Var.q();
        }
        this.f199304m = null;
        this.f199309r.setTranslationY(0.0f);
    }

    public final void c(boolean z17) {
        java.lang.String str;
        gk2.e S0;
        r45.nw1 nw1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a = m58104xb7f4f95a();
        m57955x53bfe316(m58104xb7f4f95a != null ? m58104xb7f4f95a.S0() : null);
        this.f199314w.setVisibility(8);
        this.f199315x.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a2 = m58104xb7f4f95a();
        long m75942xfb822ef2 = (m58104xb7f4f95a2 == null || (nw1Var = ((mm2.e1) m58104xb7f4f95a2.P0(mm2.e1.class)).f410521r) == null) ? 0L : nw1Var.m75942xfb822ef2(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a3 = m58104xb7f4f95a();
        long j17 = m58104xb7f4f95a3 != null ? ((mm2.e1) m58104xb7f4f95a3.P0(mm2.e1.class)).f410516m : 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a4 = m58104xb7f4f95a();
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(m58104xb7f4f95a4 != null ? ((mm2.e1) m58104xb7f4f95a4.P0(mm2.e1.class)).f410518o : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a5 = m58104xb7f4f95a();
        if (m58104xb7f4f95a5 == null || (S0 = m58104xb7f4f95a5.S0()) == null || (str = ((mm2.c1) S0.a(mm2.c1.class)).f410385o) == null) {
            str = "";
        }
        java.lang.String str2 = str;
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pq5.g h17 = new ke2.p(str2, b17, m75942xfb822ef2, j17, xy2.c.e(context), null).l().h(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.si(this, z17));
        if (getContext() != null && (getContext() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            android.content.Context context2 = getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
            h17.f((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context2);
        }
        android.view.View view = this.f199307p;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1(view.getContext());
        this.f199309r.m81308x2c770903(true);
        zl2.r4.f555483a.Q2(view);
        if (this.f199305n) {
            this.f199308q.getLayoutParams().height = 0;
        }
        y1Var.l(view, new android.widget.FrameLayout.LayoutParams(-1, -1));
        y1Var.a();
        y1Var.s();
        this.f199304m = y1Var;
    }

    /* renamed from: getBottomSheet */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 m57956xb4dbbcbe() {
        return this.f199304m;
    }

    /* renamed from: getFansGroupClickListener */
    public final yz5.a m57957x56eb80f3() {
        return this.f199303i;
    }

    /* renamed from: getHelpIconClickListener */
    public final yz5.a m57958x11c8336c() {
        return this.f199302h;
    }

    /* renamed from: getWasNotifySettingGuideShown */
    public final boolean m57959xc0810469() {
        return m57953xfb829b81().getBoolean("wasNotifySettingGuideShown", false);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l m58104xb7f4f95a;
        gk2.e S0;
        yg2.b bVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        boolean z17 = false;
        if ((valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565834dr5) || (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dr9)) {
            b();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.f565831dr2) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - qd2.h.f443300a < 500) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
                z17 = true;
            }
            qd2.h.f443300a = currentTimeMillis;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveFansTaskWidget", "fast click fans_group!");
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ml2.r0.Lj((ml2.r0) c17, ml2.j4.f409155r, null, null, 6, null);
            yz5.a aVar = this.f199303i;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.dr7) {
            yz5.a aVar2 = this.f199302h;
            if (aVar2 != null) {
                aVar2.mo152xb9724478();
            }
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.qle && (m58104xb7f4f95a = m58104xb7f4f95a()) != null && (S0 = m58104xb7f4f95a.S0()) != null && (bVar = S0.f354008i) != null) {
            p3325xe03a0797.p3326xc267989b.l.d(bVar, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wi(this, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveFansTaskWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    /* renamed from: setBottomSheet */
    public final void m57960x4b413032(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var) {
        this.f199304m = y1Var;
    }

    /* renamed from: setFansGroupClickListener */
    public final void m57961x892f1cff(yz5.a aVar) {
        this.f199303i = aVar;
    }

    /* renamed from: setHelpIconClickListener */
    public final void m57962xe1dae5e0(yz5.a aVar) {
        this.f199302h = aVar;
    }

    /* renamed from: setWasNotifySettingGuideShown */
    public final void m57963xb03fba75(boolean z17) {
        m57953xfb829b81().putBoolean("wasNotifySettingGuideShown", z17);
    }
}

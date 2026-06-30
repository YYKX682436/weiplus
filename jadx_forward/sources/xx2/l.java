package xx2;

/* loaded from: classes3.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f539512a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f539513b;

    /* renamed from: c, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f539514c;

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f539515d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 f539516e;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 f539517f;

    /* renamed from: g, reason: collision with root package name */
    public final xx2.d f539518g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.ViewGroup f539519h;

    /* renamed from: i, reason: collision with root package name */
    public int f539520i;

    /* renamed from: j, reason: collision with root package name */
    public int f539521j;

    /* renamed from: k, reason: collision with root package name */
    public int f539522k;

    /* renamed from: l, reason: collision with root package name */
    public int f539523l;

    /* renamed from: m, reason: collision with root package name */
    public int f539524m;

    /* renamed from: n, reason: collision with root package name */
    public float f539525n;

    public l(xx2.d config, android.view.ViewGroup parent, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f539512a = "Finder.FinderSideBar";
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4.L;
        this.f539520i = 0;
        this.f539518g = config;
        this.f539519h = parent;
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f539513b = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i17, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a787 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) inflate;
        if (i18 >= 0) {
            parent.addView(c1073x7e08a787, i18, new android.view.ViewGroup.LayoutParams(-1, -1));
        } else {
            parent.addView(c1073x7e08a787, new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        android.view.View findViewById = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.mwc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7872 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById;
        this.f539514c = c1073x7e08a7872;
        android.view.View findViewById2 = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.mwb);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f539515d = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById2;
        android.view.View findViewById3 = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.mw9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4) findViewById3;
        this.f539516e = c15432x61ce4af4;
        android.view.View findViewById4 = c1073x7e08a787.findViewById(com.p314xaae8f345.mm.R.id.mw_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 c1073x7e08a7873 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787) findViewById4;
        this.f539517f = c1073x7e08a7873;
        c1073x7e08a7873.setLayoutParams(new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams((int) ((com.p314xaae8f345.mm.ui.bh.a(context).f278668a * 0.2f) + i65.a.b(context, 24)), 0));
        pl2.l lVar = (pl2.l) config;
        android.view.ViewGroup.LayoutParams layoutParams = c1073x7e08a7872.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) ((p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams)).height = i65.a.b(c1073x7e08a7872.getContext(), 64) + com.p314xaae8f345.mm.ui.bl.h(c1073x7e08a7872.getContext());
        lVar.f438165b = (android.widget.TextView) c1073x7e08a7872.findViewById(com.p314xaae8f345.mm.R.id.i8g);
        lVar.f438167d = (android.widget.ImageView) c1073x7e08a7872.findViewById(com.p314xaae8f345.mm.R.id.ihk);
        android.widget.TextView textView = (android.widget.TextView) c1073x7e08a7872.findViewById(com.p314xaae8f345.mm.R.id.f565515t15);
        lVar.f438166c = textView;
        pl2.s sVar = lVar.f438173j;
        if (textView != null) {
            textView.setOnClickListener(new pl2.c(sVar));
        }
        android.widget.TextView textView2 = lVar.f438165b;
        if (textView2 != null) {
            textView2.setAlpha(0.0f);
        }
        android.view.ViewParent parent2 = sVar.f438179a.getParent();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.View view = sVar.f438179a;
        ((android.view.ViewGroup) parent2).removeView(view);
        c15432x61ce4af4.addView(view, 0, new p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams(-1, -1));
        lVar.f438172i = c15432x61ce4af4;
        android.view.View findViewById5 = c15432x61ce4af4.findViewById(com.p314xaae8f345.mm.R.id.f567178ih1);
        lVar.f438170g = findViewById5;
        if (findViewById5 != null) {
            findViewById5.setOnClickListener(new pl2.b(sVar));
        }
        lVar.f438168e = c1073x7e08a7873.findViewById(com.p314xaae8f345.mm.R.id.f568459mw5);
        lVar.f438169f = c1073x7e08a7873.findViewById(com.p314xaae8f345.mm.R.id.f568458mw4);
        android.view.View view2 = lVar.f438168e;
        if (view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = lVar.f438169f;
        if (view3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/sidebar/FinderLiveSideBar$FinderLiveSideBarConfig", "hideSideBarMask", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById6 = c1073x7e08a7873.findViewById(com.p314xaae8f345.mm.R.id.uar);
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById6;
        c22851x22587864.D(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15319xfa30dea0(c22851x22587864.getContext(), null));
        c22851x22587864.m82945xba09cf09(new pl2.d(sVar));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById6, "apply(...)");
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x225878642 = (com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864) findViewById6;
        sVar.f438186h = c22851x225878642;
        android.view.View findViewById7 = c22851x225878642.findViewById(com.p314xaae8f345.mm.R.id.i_n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById7, "findViewById(...)");
        sVar.f438187i = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) findViewById7;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c17 = sVar.c();
        android.content.Context context2 = c1073x7e08a7873.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        c17.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8(context2));
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c18 = sVar.c();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(new in5.s() { // from class: com.tencent.mm.plugin.finder.live.sidebar.FinderLiveSideBar$FinderLiveSideBarConfig$buildSideBar$2
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == pl2.a.class.hashCode()) {
                    return new pl2.y();
                }
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(null);
                throw new jz5.d();
            }
        }, sVar.f438189k, true);
        c22848x6ddd90cf.f374638o = new pl2.e(sVar);
        c22848x6ddd90cf.F = new pl2.g(lVar, sVar);
        c22848x6ddd90cf.mo8164xbbdced85(true);
        c18.mo7960x6cab2c8d(c22848x6ddd90cf);
        sVar.c().N(new pl2.h(sVar));
        ym5.a1.g(sVar.c(), new pl2.i(sVar));
        if (!(((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f85300h8).mo141623x754a37bb()).r()).intValue() == 1)) {
            c15432x61ce4af4.m62894x71eb6f8a(new xx2.b(this));
        }
        parent.post(new xx2.c(this));
    }

    public static final void a(xx2.l lVar) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4 = lVar.f539516e;
        float abs = java.lang.Math.abs((c15432x61ce4af4.getWidth() * c15432x61ce4af4.getScaleX()) - lVar.f539522k);
        float abs2 = java.lang.Math.abs(((c15432x61ce4af4.getWidth() * c15432x61ce4af4.getScaleX()) - lVar.f539522k) - lVar.f539521j);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f539512a, "determineDragMode distanceFromTarget:" + abs + ", " + abs2 + ", bodyRoot.width:" + (c15432x61ce4af4.getWidth() * c15432x61ce4af4.getScaleX()) + ", targetBodyWidth:" + lVar.f539522k + ", totalDistance:" + lVar.f539521j);
        if (abs > abs2) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4.L;
            i17 = 1;
        } else {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4.L;
            i17 = 2;
        }
        lVar.f539520i = i17;
        boolean z17 = i17 == 1;
        int i27 = lVar.f539521j;
        c15432x61ce4af4.D(z17, i27 / 2, i27);
    }

    public final void b(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f419;
        um2.x5 m129745xca56ce03;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f539512a, "dragging percent:" + f17);
        if (f17 == this.f539525n) {
            return;
        }
        int i17 = this.f539520i;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4.L;
        float f18 = i17 == 1 ? f17 : 1.0f - f17;
        int i19 = (int) ((this.f539521j * (1.0f - f18)) + this.f539522k);
        int i27 = (int) (this.f539523l * f18);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4 c15432x61ce4af4 = this.f539516e;
        if (c15432x61ce4af4.getWidth() == 0) {
            c15432x61ce4af4.setTranslationY(0.0f);
            c15432x61ce4af4.setScaleX(1.0f);
            c15432x61ce4af4.setScaleY(1.0f);
        } else {
            c15432x61ce4af4.setPivotX(0.0f);
            c15432x61ce4af4.setPivotY(0.0f);
            c15432x61ce4af4.setTranslationY(i27);
            float f19 = i19;
            float width = f19 / c15432x61ce4af4.getWidth();
            c15432x61ce4af4.setScaleX(width);
            c15432x61ce4af4.setScaleY(width);
            this.f539517f.setTranslationX(f19);
            this.f539514c.setTranslationY((-r3.getBottom()) * (1 - f18));
        }
        pl2.l lVar = (pl2.l) this.f539518g;
        android.widget.TextView textView = lVar.f438165b;
        if (textView != null) {
            textView.setAlpha(f18);
        }
        android.view.View view = lVar.f438172i;
        android.view.ViewGroup.LayoutParams layoutParams = view != null ? view.getLayoutParams() : null;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = layoutParams instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams : null;
        android.view.View view2 = lVar.f438172i;
        java.lang.Object parent = view2 != null ? view2.getParent() : null;
        android.view.View view3 = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.Integer valueOf = view3 != null ? java.lang.Integer.valueOf(view3.getHeight()) : null;
        int i28 = layoutParams2 != null ? ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).width : 0;
        int intValue = (valueOf == null || layoutParams2 == null) ? 0 : (valueOf.intValue() - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin) - ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin;
        pl2.m mVar = lVar.f438173j.f438184f;
        if (mVar != null) {
            vd2.l4 l4Var = (vd2.l4) mVar;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveViewCallback", "sidebar onDragProgress percent:" + f18 + ", width:" + i28 + ", height:" + intValue);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.C14167x40aca97c c14167x40aca97c = l4Var.f517337c;
            if (i28 > 0 && intValue > 0 && (c14353xe7c1f419 = c14167x40aca97c.f193028t.f517587e) != null && (m129745xca56ce03 = c14353xe7c1f419.m129745xca56ce03()) != null) {
                um2.x5.p(m129745xca56ce03, new jz5.l(java.lang.Integer.valueOf(i28), java.lang.Integer.valueOf(intValue)), false, 2, null);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14353xe7c1f419 c14353xe7c1f4192 = c14167x40aca97c.f193028t.f517587e;
            android.view.View findViewById = c14353xe7c1f4192 != null ? c14353xe7c1f4192.findViewById(com.p314xaae8f345.mm.R.id.fqc) : null;
            float f27 = l4Var.f517336b;
            float f28 = l4Var.f517335a;
            int i29 = (int) (((f27 - f28) * f18) + f28);
            android.view.ViewGroup.LayoutParams layoutParams3 = findViewById != null ? findViewById.getLayoutParams() : null;
            if (layoutParams3 instanceof android.widget.RelativeLayout.LayoutParams) {
                android.view.ViewGroup.LayoutParams layoutParams4 = findViewById != null ? findViewById.getLayoutParams() : null;
                android.widget.RelativeLayout.LayoutParams layoutParams5 = layoutParams4 instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams4 : null;
                if (layoutParams5 != null) {
                    layoutParams5.topMargin = i29;
                }
            } else if (layoutParams3 instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) {
                java.lang.Object layoutParams6 = findViewById != null ? findViewById.getLayoutParams() : null;
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams7 = layoutParams6 instanceof p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams ? (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams6 : null;
                if (layoutParams7 != null) {
                    layoutParams7.f92443u = i29;
                }
                if (findViewById != null) {
                    findViewById.requestLayout();
                }
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c14167x40aca97c.f193025q.getLayoutManager();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager;
            int i37 = c14167x40aca97c.f193028t.f517588f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            arrayList.add(java.lang.Integer.valueOf(i37));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c1162x665295de, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onDragProgress", "(FII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c1162x665295de.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c1162x665295de, "com/tencent/mm/plugin/finder/live/FinderLiveViewCallback$initView$3", "onDragProgress", "(FII)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        this.f539525n = f17;
    }

    public final void c(boolean z17) {
        int i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f539512a, "innerEnableDrag showing:" + z17);
        if (z17) {
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4.L;
            i17 = 2;
        } else {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1675x7c4a0b5c.C15432x61ce4af4.L;
            i17 = 1;
        }
        this.f539520i = i17;
        int i27 = this.f539521j;
        this.f539516e.D(!z17, i27 / 2, i27);
    }

    public final void d(android.view.View view, float f17, float f18, long j17, yz5.a aVar) {
        xx2.k kVar = new xx2.k(this, f17, f18);
        kVar.setDuration(((float) j17) * java.lang.Math.abs(f18 - f17));
        kVar.setAnimationListener(new xx2.j(aVar));
        kVar.setInterpolator(new android.view.animation.LinearInterpolator());
        view.startAnimation(kVar);
    }
}

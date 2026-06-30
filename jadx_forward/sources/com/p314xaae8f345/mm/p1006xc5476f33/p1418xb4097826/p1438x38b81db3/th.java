package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class th extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 f186146e;

    /* renamed from: f, reason: collision with root package name */
    public final r45.qt2 f186147f;

    /* renamed from: g, reason: collision with root package name */
    public final int f186148g;

    /* renamed from: m, reason: collision with root package name */
    public boolean f186151m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f186152n;

    /* renamed from: o, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f186153o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 f186154p;

    /* renamed from: r, reason: collision with root package name */
    public boolean f186156r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f186157s;

    /* renamed from: t, reason: collision with root package name */
    public long f186158t;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f186149h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public so2.i1 f186150i = new so2.i1();

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lh f186155q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lh(this);

    /* renamed from: u, reason: collision with root package name */
    public final in5.s f186159u = new in5.s() { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedLiveListConvert$itemConvertFactory$1
        @Override // in5.s
        /* renamed from: getItemConvert */
        public in5.r mo43555xf2bb75ea(int type) {
            if (type == 2004) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.uh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.this.f186148g);
            }
            if (type == 2005) {
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.vh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.this.f186148g);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.this);
            hc2.l.a("FinderFeedLiveListConvert", type);
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
        }
    };

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qh f186160v = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qh(this);

    public th(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var, r45.qt2 qt2Var, int i17) {
        this.f186146e = k8Var;
        this.f186147f = qt2Var;
        this.f186148g = i17;
    }

    public static final /* synthetic */ java.lang.String n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th thVar) {
        thVar.getClass();
        return "FinderFeedLiveListConvert";
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569382q;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        android.view.ViewTreeObserver viewTreeObserver;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.lh lhVar = this.f186155q;
        lhVar.f185462b = recyclerView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f186146e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
        if (pzVar != null && (abstractC15124x7bae6180 = pzVar.f190289h) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1 d1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class);
            d1Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DoubleClickTipUIC", "registActionBarLayoutChangeListener, actionBarLayoutChangeListener:" + lhVar + '!');
            d1Var.f215597n = lhVar;
            android.view.ViewGroup O6 = d1Var.O6();
            if (O6 != null && (viewTreeObserver = O6.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnPreDrawListener((android.view.ViewTreeObserver.OnPreDrawListener) ((jz5.n) d1Var.f215601r).mo141623x754a37bb());
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "[onAttachedToRecyclerView]");
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f7 A[LOOP:2: B:58:0x01c7->B:71:0x01f7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01fd A[EDGE_INSN: B:72:0x01fd->B:73:0x01fd BREAK  A[LOOP:2: B:58:0x01c7->B:71:0x01f7], SYNTHETIC] */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r21, in5.c r22, int r23, int r24, boolean r25, java.util.List r26) {
        /*
            Method dump skipped, instructions count: 1183
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p(holder);
        recyclerView.i(this.f186160v);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) holder.p(com.p314xaae8f345.mm.R.id.icm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22849x81a93d25);
        ym5.a1.g(c22849x81a93d25, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.sh(this));
    }

    @Override // in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        super.j(recyclerView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "[onDetachedFromRecyclerView]");
        recyclerView.V0(this.f186160v);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f186146e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
        if (pzVar == null || (abstractC15124x7bae6180 = pzVar.f190289h) == null) {
            return;
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1) pf5.z.f435481a.b(abstractC15124x7bae6180).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d1.class)).V6();
    }

    public final void o(in5.s0 s0Var, int i17) {
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.ian);
        if (p17 != null) {
            p17.setPadding(p17.getPaddingLeft(), i17, p17.getPaddingRight(), p17.getPaddingBottom());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "adjustLayoutPadding newHeight:" + i17);
        }
    }

    public final void p(in5.s0 s0Var) {
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) s0Var.p(com.p314xaae8f345.mm.R.id.icm);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = new com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf(this.f186159u, this.f186149h, false);
        this.f186152n = c22848x6ddd90cf;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View view = new android.view.View(context);
        view.setLayoutParams(new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 10.0f), 1));
        in5.n0.U(c22848x6ddd90cf, view, 1, false, 4, null);
        android.view.View view2 = new android.view.View(context);
        view2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 10.0f), 1));
        in5.n0.P(c22848x6ddd90cf, view2, 2, false, 4, null);
        c22848x6ddd90cf.f374638o = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.mh(c22848x6ddd90cf, this);
        this.f186153o = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false);
        this.f186154p = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.nh(this);
        c22849x81a93d25.mo7960x6cab2c8d(this.f186152n);
        c22849x81a93d25.mo7967x900dcbe1(this.f186153o);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 w2Var = this.f186154p;
        if (w2Var != null) {
            c22849x81a93d25.i(w2Var);
        }
        c22849x81a93d25.m7963x830bc99d(true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 k8Var = this.f186146e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = k8Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz) k8Var : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 = pzVar != null ? pzVar.f190289h : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae61802 = abstractC15124x7bae6180 instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 ? abstractC15124x7bae6180 : null;
        if (abstractC15124x7bae61802 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh) pf5.z.f435481a.b(abstractC15124x7bae61802).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qh.class)).f217246h = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFeedLiveListConvert", "[bindAdapter] tabType:" + this.f186148g + ",innderAdapter:" + this.f186152n);
    }

    public final java.lang.String q() {
        int i17 = this.f186148g;
        if (i17 == 1) {
            ml2.q1 q1Var = ml2.q1.f409345e;
            return "temp_9";
        }
        if (i17 == 3) {
            ml2.q1 q1Var2 = ml2.q1.f409345e;
        } else {
            if (i17 == 2) {
                ml2.q1 q1Var3 = ml2.q1.f409345e;
                return "temp_10";
            }
            ml2.q1 q1Var4 = ml2.q1.f409345e;
        }
        return "temp_1";
    }
}

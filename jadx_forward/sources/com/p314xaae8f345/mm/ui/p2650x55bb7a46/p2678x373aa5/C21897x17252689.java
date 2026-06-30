package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5;

/* renamed from: com.tencent.mm.ui.chatting.view.MMChattingListView */
/* loaded from: classes9.dex */
public class C21897x17252689 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c implements db5.j5, db5.k5, db5.l5, db5.o5, db5.m5 {
    public static final /* synthetic */ int L1 = 0;
    public int A1;
    public boolean B1;
    public boolean C1;
    public android.os.Bundle D1;
    public int E1;
    public int F1;
    public int G1;
    public boolean H1;
    public final java.lang.Runnable I1;
    public boolean J1;
    public boolean K1;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 T;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 U;
    public ke5.f0 V;
    public final android.graphics.Rect W;

    /* renamed from: l1, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc f284376l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.graphics.Paint f284377p0;

    /* renamed from: p1, reason: collision with root package name */
    public final android.graphics.Rect f284378p1;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f284379x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.graphics.Paint f284380x1;

    /* renamed from: y0, reason: collision with root package name */
    public boolean f284381y0;

    /* renamed from: y1, reason: collision with root package name */
    public float f284382y1;

    /* renamed from: z1, reason: collision with root package name */
    public android.animation.ValueAnimator f284383z1;

    public C21897x17252689(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.W = new android.graphics.Rect();
        this.f284378p1 = new android.graphics.Rect();
        this.f284382y1 = 0.0f;
        this.A1 = -1;
        this.B1 = false;
        this.C1 = false;
        this.F1 = -1;
        this.G1 = Integer.MIN_VALUE;
        this.H1 = false;
        this.I1 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.o0(this);
        this.J1 = false;
        this.K1 = false;
        m(context);
    }

    /* renamed from: setTopLoadViewRpt */
    private void m79867x3781d1b8(final android.view.View view) {
        if (!(view.getContext() instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "setTopLoadViewRpt getContext error");
            return;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f lifecycleOwner = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) getContext();
        boolean z17 = te5.d2.f500160a;
        te5.a2 a2Var = new te5.a2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        java.lang.Object tag = view.getTag(112828121);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(tag, bool)) {
            return;
        }
        te5.c2 c2Var = new te5.c2(view, -208931566, a2Var);
        final p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        h0Var.f391656d = new te5.b2(c2Var);
        view.getViewTreeObserver().addOnScrollChangedListener((android.view.ViewTreeObserver.OnScrollChangedListener) h0Var.f391656d);
        lifecycleOwner.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.ui.chatting.utils.TopLoadExpReportKt$onVisibilityChange$2
            @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
            /* renamed from: onDestroy */
            public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                view.getViewTreeObserver().removeOnScrollChangedListener((android.view.ViewTreeObserver.OnScrollChangedListener) h0Var.f391656d);
            }
        });
        view.setTag(112828121, bool);
    }

    @Override // db5.j5
    public boolean A5() {
        android.view.View m75885x6a486239 = m79872xcc101dd9().m75885x6a486239(m79872xcc101dd9().m75886x3d79f549() - 1);
        if (m75885x6a486239 == null) {
            return true;
        }
        return m75885x6a486239.getBottom() <= m79872xcc101dd9().m75888x1c4fb41d() - m79872xcc101dd9().m75890xc96f6de6() && m79872xcc101dd9().mo75762xe81a1f0f() == m79872xcc101dd9().s().mo8143x7444f759() - 1;
    }

    @Override // db5.k5
    public boolean E0() {
        android.view.View m75885x6a486239 = m79872xcc101dd9().m75885x6a486239(m79872xcc101dd9().mo75757x2ce24761());
        return m75885x6a486239 != null && m75885x6a486239.getTop() == 0;
    }

    @Override // db5.l5
    public boolean J6() {
        if (this.V.mo142542xf18228b2()) {
            return true;
        }
        this.E1 = m79870x9b948425();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[onBottomLoadData] mPreCount:" + this.E1);
        ke5.f0 f0Var = this.V;
        if (f0Var != null) {
            f0Var.a(hd5.n.ACTION_BOTTOM, false, this.D1);
            this.D1 = null;
            this.C1 = false;
        }
        return false;
    }

    @Override // db5.o5
    public boolean a() {
        android.os.Bundle bundle;
        if (this.V.mo142542xf18228b2()) {
            return true;
        }
        this.E1 = m79870x9b948425();
        this.G1 = Integer.MIN_VALUE;
        this.F1 = -1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[onTopLoadData] mPreCount:" + this.E1 + " isForceTopLoadDataForPosition:" + this.C1);
        if (this.V != null) {
            if (this.C1 && (bundle = this.D1) != null) {
                bundle.putInt("SCENE", 2);
            }
            this.V.a(this.C1 ? hd5.n.ACTION_POSITION : hd5.n.ACTION_TOP, false, this.D1);
        }
        this.D1 = null;
        this.C1 = false;
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c
    public void e(boolean z17, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[forceTopLoadData] start:" + z17 + " isForceTopLoadDataForPosition:" + this.C1);
        if (this.C1) {
            return;
        }
        f(z17, i17, false);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c
    public void g() {
        super.g();
        if (this.B1) {
            m79867x3781d1b8(getChildAt(0));
        }
    }

    /* renamed from: getBaseAdapter */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 m79868x1e705e08() {
        return this.U;
    }

    /* renamed from: getBottomSpace */
    public int m79869xb4df5065() {
        int m75888x1c4fb41d = this.T.m75888x1c4fb41d() - this.T.m75890xc96f6de6();
        if (this.T.m75886x3d79f549() <= 0) {
            return m75888x1c4fb41d;
        }
        android.view.View m75885x6a486239 = m79872xcc101dd9().m75885x6a486239(m79872xcc101dd9().m75886x3d79f549() - 1);
        if (m75885x6a486239 == null || this.T.mo75762xe81a1f0f() != ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19727x3bcc210a) this.T).s().mo8143x7444f759() - 1) {
            return 0;
        }
        return m75888x1c4fb41d - m75885x6a486239.getBottom();
    }

    /* renamed from: getCurCount */
    public int m79870x9b948425() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 u3Var = this.U;
        if (u3Var == null) {
            return 0;
        }
        return u3Var.mo8143x7444f759();
    }

    /* renamed from: getHeaderViewsCount */
    public int m79871x118cb524() {
        return this.T.mo75761x118cb524();
    }

    /* renamed from: getListView */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 m79872xcc101dd9() {
        return this.T;
    }

    /* renamed from: getPersistentHighLightIndex */
    public int m79873x8d5e708b() {
        return this.A1;
    }

    /* renamed from: getPreCount */
    public int m79874x2d2219a2() {
        return this.E1;
    }

    /* renamed from: getPreloadFirstVisitPos */
    public int m79875x408cc0c6() {
        return this.F1;
    }

    /* renamed from: getPreloadFirstVisitViewTop */
    public int m79876xe9ad55e2() {
        return this.G1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c
    public boolean h() {
        if (this.H1) {
            return true;
        }
        if (((sb5.z) ((ke5.a) this.V).f388574b.f542241c.a(sb5.z.class)) != null) {
            return ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) ((sb5.z) ((ke5.a) this.V).f388574b.f542241c.a(sb5.z.class))).R1;
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c
    public boolean i() {
        int i17;
        boolean z17 = this.V instanceof ke5.s;
        try {
            i17 = java.lang.Integer.parseInt(j62.e.g().f(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20032xb50b08b8()));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMChattingListView", e17, "", new java.lang.Object[0]);
            i17 = 0;
        }
        return ((i17 > 0) && z17) ? false : true;
    }

    public final int k(android.view.View view) {
        android.widget.TextView textView;
        if (view == null || (textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565229br1)) == null || textView.getVisibility() != 0) {
            return 0;
        }
        int height = textView.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return height > 0 ? height : i65.a.b(getContext(), 50);
    }

    public void l(boolean z17) {
        android.animation.ValueAnimator valueAnimator = this.f284383z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f284383z1 = null;
        }
        float f17 = this.f284382y1;
        android.graphics.Rect rect = this.f284378p1;
        if (f17 <= 0.0f) {
            rect.setEmpty();
            this.A1 = -1;
            return;
        }
        if (!z17) {
            this.f284382y1 = 0.0f;
            rect.setEmpty();
            this.A1 = -1;
            this.T.m75895x31e85dfb();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
        this.f284383z1 = ofFloat;
        ofFloat.setDuration(300L);
        this.f284383z1.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.f284383z1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$a
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.L1;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.this;
                c21897x17252689.getClass();
                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                c21897x17252689.f284382y1 = floatValue;
                c21897x17252689.f284380x1.setAlpha((int) (floatValue * 255.0f));
                c21897x17252689.T.m75895x31e85dfb();
            }
        });
        this.f284383z1.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.p0(this));
        this.f284383z1.start();
    }

    public final void m(android.content.Context context) {
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f284377p0 = paint;
        paint.setColor(-16777216);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f284380x1 = paint2;
        paint2.setColor(-16777216);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19742x29171954 c19742x29171954 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19742x29171954) android.view.LayoutInflater.from(this.f279077y).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570121xy, (android.view.ViewGroup) null);
        c19742x29171954.m75820x4ac79299(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.j0(this));
        c19742x29171954.m7964x8d4ad49c(null);
        c19742x29171954.setLayoutAnimation(null);
        c19742x29171954.setMotionEventSplittingEnabled(false);
        c19742x29171954.mo7967x900dcbe1(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8(getContext()));
        jz5.g gVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.m.f279968a;
        c19742x29171954.m7971xa810ec34(new in5.a(50));
        this.T = c19742x29171954;
        c19742x29171954.m75897x72de0fee(null);
        this.T.mo75772xbd989261(com.p314xaae8f345.mm.R.C30861xcebc809e.aoc);
        this.T.mo75766x340d102a(0);
        this.T.mo75767x150a9c57(null);
        this.T.m75906x812ec54f(0, 0, 0, i65.a.b(context, 6));
        this.T.m75898xa201ee64(false);
        this.T.m75907x9c95a84d(com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26306x4f373ca9.f52056x2bdcb432);
        this.T.m75901x684351d(com.p314xaae8f345.mm.R.id.f565216bp0);
        setOverScrollMode(2);
        addView(this.T.f(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        m79083x49531bcc(false);
        d(false);
        c(false);
        m79098x563f5e7a(true);
        m79090x3b8dba10(this);
        m79095x31e25658(this);
        m79092x66dea197(this);
        m79078x1c273745(this);
        m79079xcab5c565(this);
        m79085xcc8bf2ed(true);
        m79088x648e109b(false);
        m79082x1e1922a0(true);
        m79089x36833047(true);
        this.f284381y0 = false;
    }

    public void n() {
        int mo75757x2ce24761 = this.T.mo75757x2ce24761();
        android.view.View F = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19727x3bcc210a) this.T).F(mo75757x2ce24761);
        if (mo75757x2ce24761 < 0 || F == null) {
            return;
        }
        this.G1 = F.getTop();
        this.F1 = mo75757x2ce24761 - this.T.mo75761x118cb524();
        this.T.mo75761x118cb524();
    }

    public void o(int i17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5 c16564xb55e1d5, android.os.Bundle bundle) {
        this.f284381y0 = true;
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f284377p0.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            this.f284377p0.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[newStyle] setfalse" + this.f284381y0);
        int max = java.lang.Math.max(0, i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = this.T;
        if (v3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "null == listView index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        android.view.View F = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19727x3bcc210a) v3Var).F(max);
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", java.lang.Integer.valueOf(max), new android.graphics.Rect(F.getLeft(), F.getTop(), F.getRight(), F.getBottom()), java.lang.Integer.valueOf(this.T.mo75761x118cb524()));
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(com.p314xaae8f345.mm.ui.bk.C() ? android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.08f, 0.08f, 0.08f, 0.08f, 0.08f, 0.0f) : android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.1f, 0.1f, 0.1f, 0.1f, 0.1f, 0.0f));
        android.widget.TextView textView = (android.widget.TextView) F.findViewById(com.p314xaae8f345.mm.R.id.f565229br1);
        if (textView == null || textView.getVisibility() != 0) {
            this.f284379x0 = false;
        } else {
            this.f284379x0 = true;
        }
        F.clearAnimation();
        if (bundle != null) {
            android.os.Bundle bundle2 = bundle.getBundle("EXTRA_BUNDLE");
            if (bundle2 == null) {
                bundle2 = new android.os.Bundle();
            }
            int i18 = bundle2.getInt("locate_end", -1);
            int i19 = bundle2.getInt("locate_start", -1);
            r15.f fVar = (i19 == -1 || i18 == -1) ? null : new r15.f(i19, i18);
            if (fVar != null && (F.findViewById(com.p314xaae8f345.mm.R.id.bkl) instanceof com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039)) {
                final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039) F.findViewById(com.p314xaae8f345.mm.R.id.bkl);
                java.lang.CharSequence a17 = c22624x85d69039.a();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc hcVar = this.f284376l1;
                if (hcVar != null) {
                    hcVar.b();
                    this.f284376l1 = null;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.ec ecVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.ec(c22624x85d69039);
                ecVar.f282009d = true;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc hcVar2 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.hc(ecVar, null);
                this.f284376l1 = hcVar2;
                hcVar2.f283206e = fVar.f450177a;
                hcVar2.f283207f = fVar.f450178b;
                android.text.SpannableString spannableString = new android.text.SpannableString(a17);
                hcVar2.a(spannableString, getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77747x91fa628b));
                if (c22624x85d69039.isLongClickable()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] should locate high select text,disable long click first");
                    c22624x85d69039.setLongClickable(false);
                    c22624x85d69039.postDelayed(new java.lang.Runnable() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$b
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i27 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.L1;
                            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039.this.setLongClickable(true);
                        }
                    }, this.f284376l1.f283210i);
                }
                c22624x85d69039.c(spannableString, android.widget.TextView.BufferType.SPANNABLE, null);
            }
            if (!c16564xb55e1d5.m66993xb2c87fbf(com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g) && (F.findViewById(com.p314xaae8f345.mm.R.id.sr8) instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006)) {
                bundle2.getBoolean("is_from_mediagroup_tongue", false);
                int i27 = bundle2.getInt("is_from_mediagroup_unread_count", 0);
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006 c22100x47612006 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.C22100x47612006) F.findViewById(com.p314xaae8f345.mm.R.id.sr8);
                c22100x47612006.m80181xe076ab3b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2685x740fd51b.e1(i27));
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 f27 = pt0.f0.f2(c16564xb55e1d5.a(), c16564xb55e1d5.f231013d);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] msgInfo:%s", c16564xb55e1d5);
                c22100x47612006.D(f27);
            }
        }
        ofPropertyValuesHolder.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.m0(this, F));
        ofPropertyValuesHolder.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.n0(this));
        ofPropertyValuesHolder.setDuration(1150L);
        ofPropertyValuesHolder.start();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.GestureDetectorOnGestureListenerC21510x15ed9d8c, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
        if (this.J1) {
            this.J1 = false;
            this.K1 = true;
        }
    }

    public void p(boolean z17, long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[setInterruptTouch] interrupt:%s recoverDelayTimeMs:%s", java.lang.Boolean.valueOf(z17), java.lang.Long.valueOf(j17));
        this.H1 = z17;
        java.lang.Runnable runnable = this.I1;
        removeCallbacks(runnable);
        if (z17) {
            postDelayed(runnable, j17);
        }
    }

    public final void q() {
        if (com.p314xaae8f345.mm.ui.bk.C()) {
            this.f284380x1.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        } else {
            this.f284380x1.setColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560245f3));
        }
    }

    public void r(int i17, boolean z17) {
        if (this.T == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "[showPersistentHighLight] null == listView index:%s", java.lang.Integer.valueOf(i17));
            return;
        }
        int max = java.lang.Math.max(0, i17);
        final android.view.View F = ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19727x3bcc210a) this.T).F(max);
        if (F == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "[showPersistentHighLight] null == view index:%s", java.lang.Integer.valueOf(max));
            l(false);
            return;
        }
        this.A1 = max;
        q();
        float f17 = com.p314xaae8f345.mm.ui.bk.C() ? 0.08f : 0.1f;
        final int k17 = k(F);
        android.animation.ValueAnimator valueAnimator = this.f284383z1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f284383z1 = null;
        }
        if (!z17) {
            this.f284382y1 = f17;
            this.f284380x1.setAlpha((int) (f17 * 255.0f));
            s(F, k17);
            this.T.m75895x31e85dfb();
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, f17);
        this.f284383z1 = ofFloat;
        ofFloat.setDuration(300L);
        this.f284383z1.setInterpolator(new android.view.animation.DecelerateInterpolator());
        this.f284383z1.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.mm.ui.chatting.view.MMChattingListView$$c
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator2) {
                int i18 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.L1;
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 c21897x17252689 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689.this;
                c21897x17252689.getClass();
                float floatValue = ((java.lang.Float) valueAnimator2.getAnimatedValue()).floatValue();
                c21897x17252689.f284382y1 = floatValue;
                c21897x17252689.f284380x1.setAlpha((int) (floatValue * 255.0f));
                c21897x17252689.s(F, k17);
                c21897x17252689.T.m75895x31e85dfb();
            }
        });
        this.f284383z1.start();
    }

    public final void s(android.view.View view, int i17) {
        android.graphics.Rect rect = this.f284378p1;
        view.getGlobalVisibleRect(rect);
        rect.top = view.getTop() + i17;
        rect.bottom = view.getBottom();
    }

    /* renamed from: setAdapter */
    public void m79877x6cab2c8d(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.u3 u3Var) {
        this.U = u3Var;
        m79872xcc101dd9().k(this.U);
    }

    /* renamed from: setHighLightChild */
    public void m79878x4a9b59ea(int i17) {
        int max = java.lang.Math.max(0, i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var = this.T;
        if (v3Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "null == listView index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        android.view.View m75885x6a486239 = v3Var.m75885x6a486239(max);
        if (m75885x6a486239 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max));
            return;
        }
        if (m75885x6a486239.getBottom() - m75885x6a486239.getTop() <= 0) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.v3 v3Var2 = this.T;
            m75885x6a486239 = v3Var2.m75885x6a486239(v3Var2.mo75761x118cb524() + max);
        }
        if (m75885x6a486239 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMChattingListView", "null == view index:%s", java.lang.Integer.valueOf(max + this.T.mo75761x118cb524()));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", java.lang.Integer.valueOf(max), new android.graphics.Rect(m75885x6a486239.getLeft(), m75885x6a486239.getTop(), m75885x6a486239.getRight(), m75885x6a486239.getBottom()), java.lang.Integer.valueOf(this.T.mo75761x118cb524()));
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofFloat("alpha", 0.0f, 0.85f, 0.85f, 0.85f, 0.85f, 0.85f, 0.0f));
        ofPropertyValuesHolder.addUpdateListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.k0(this, m75885x6a486239));
        ofPropertyValuesHolder.addListener(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.l0(this));
        ofPropertyValuesHolder.setDuration(1600L);
        ofPropertyValuesHolder.start();
    }

    /* renamed from: setHighLightChildNew */
    public void m79879x14659756(int i17) {
        o(i17, com.p314xaae8f345.mm.p1006xc5476f33.msg.C16564xb55e1d5.f231012g, null);
    }

    /* renamed from: setLoadExecutor */
    public void m79880x5d86695b(ke5.f0 f0Var) {
        ke5.f0 f0Var2 = this.V;
        if (f0Var2 != null) {
            ((ke5.a) f0Var2).f388577e = null;
        }
        this.V = f0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMChattingListView", "initResetLoadStateListener");
        ((ke5.a) this.V).f388577e = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.i0(this);
    }

    public C21897x17252689(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.W = new android.graphics.Rect();
        this.f284378p1 = new android.graphics.Rect();
        this.f284382y1 = 0.0f;
        this.A1 = -1;
        this.B1 = false;
        this.C1 = false;
        this.F1 = -1;
        this.G1 = Integer.MIN_VALUE;
        this.H1 = false;
        this.I1 = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.o0(this);
        this.J1 = false;
        this.K1 = false;
        m(context);
    }
}

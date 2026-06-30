package oy2;

/* loaded from: classes8.dex */
public final class l extends android.widget.FrameLayout implements oy2.m {
    public int A;
    public int B;
    public int C;
    public int D;
    public com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a E;
    public oy2.n F;

    /* renamed from: d, reason: collision with root package name */
    public final oy2.p f431505d;

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f431506e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f431507f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca f431508g;

    /* renamed from: h, reason: collision with root package name */
    public final int f431509h;

    /* renamed from: i, reason: collision with root package name */
    public final int f431510i;

    /* renamed from: m, reason: collision with root package name */
    public final int f431511m;

    /* renamed from: n, reason: collision with root package name */
    public final int f431512n;

    /* renamed from: o, reason: collision with root package name */
    public final int f431513o;

    /* renamed from: p, reason: collision with root package name */
    public android.content.DialogInterface.OnDismissListener f431514p;

    /* renamed from: q, reason: collision with root package name */
    public final int f431515q;

    /* renamed from: r, reason: collision with root package name */
    public int f431516r;

    /* renamed from: s, reason: collision with root package name */
    public int f431517s;

    /* renamed from: t, reason: collision with root package name */
    public float f431518t;

    /* renamed from: u, reason: collision with root package name */
    public int f431519u;

    /* renamed from: v, reason: collision with root package name */
    public int f431520v;

    /* renamed from: w, reason: collision with root package name */
    public int f431521w;

    /* renamed from: x, reason: collision with root package name */
    public int f431522x;

    /* renamed from: y, reason: collision with root package name */
    public int f431523y;

    /* renamed from: z, reason: collision with root package name */
    public int f431524z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, oy2.p scConfig) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scConfig, "scConfig");
        this.f431505d = scConfig;
        this.f431506e = context;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8 e8Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e8.f183664a;
        int a17 = e8Var.a();
        this.f431509h = a17;
        int c17 = e8Var.c(null);
        this.f431510i = c17;
        int c18 = com.p314xaae8f345.mm.ui.bl.c(context);
        this.f431511m = c18;
        this.f431512n = com.p314xaae8f345.mm.ui.bl.h(context);
        int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        this.f431513o = dimension;
        int i17 = scConfig.f431525a;
        this.f431515q = i17;
        this.f431518t = scConfig.f431526b;
        this.D = 80;
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570314ae2, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f431507f = viewGroup;
        viewGroup.setOnClickListener(new oy2.j(this));
        if (i17 == 1) {
            this.f431516r = c17;
            this.f431521w = c17;
            int i18 = (int) (a17 * this.f431518t);
            this.f431519u = i18;
            this.f431517s = scConfig.f431527c ? a17 - dimension : i18;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderScrollDialog", "screenH=" + a17 + ", navH=" + c18);
            int i19 = this.f431517s;
            this.f431520v = i19;
            int i27 = i19 - this.f431519u;
            this.f431524z = i27;
            this.B = i27;
            this.C = i27;
            this.D = 80;
        } else if (i17 == 2) {
            this.f431516r = e8Var.c(null);
            int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
            this.f431522x = dimension2;
            this.f431523y = dimension2;
            this.f431521w = this.f431516r - (dimension2 + dimension2);
            int a18 = e8Var.a() - com.p314xaae8f345.mm.ui.bl.h(context);
            this.f431517s = a18;
            int i28 = (int) (this.f431521w * 1.6666666666666667d);
            this.f431520v = i28;
            if (i28 > a18) {
                this.f431520v = a18 - ((int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
            }
            int i29 = this.f431520v;
            int i37 = (this.f431517s - i29) - ((a17 - i29) / 2);
            this.f431524z = i37;
            if (i37 < 0) {
                this.f431524z = 0;
            }
            this.B = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
            this.D = 80;
        }
        if (i17 == 1) {
            android.view.View inflate2 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aeq, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate2, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            m157410x2a179d93((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) inflate2);
            m157386xf3cea287().m63428x14fc72a(this.B);
            m157386xf3cea287().m63429x5c433911(this.C);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca m157386xf3cea287 = m157386xf3cea287();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m157386xf3cea287, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) m157386xf3cea287).m63406x14354464(this.f431519u);
        } else if (i17 == 2) {
            android.view.View inflate3 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570315ae3, (android.view.ViewGroup) null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate3, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.CenterScrollFrameLayout");
            m157410x2a179d93((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15501xbb059f5) inflate3);
            m157386xf3cea287().m63428x14fc72a(this.B);
        }
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f431520v);
        layoutParams.leftMargin = this.f431522x;
        layoutParams.rightMargin = this.f431523y;
        layoutParams.topMargin = this.f431524z;
        layoutParams.bottomMargin = this.A;
        android.view.ViewGroup viewGroup2 = this.f431507f;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRootView");
            throw null;
        }
        viewGroup2.addView(m157386xf3cea287(), layoutParams);
        m157376xbba588e0(true);
    }

    /* renamed from: setCanceledOnTouchOutside */
    private final void m157376xbba588e0(boolean z17) {
        if (z17) {
            setOnClickListener(new oy2.k(this));
        }
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderScrollDialog", "animateDismiss");
        if (this.f431515q != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderScrollDialog", "tobe full_fill");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca m157386xf3cea287 = m157386xf3cea287();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m157386xf3cea287, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) m157386xf3cea287).m();
    }

    @Override // android.content.DialogInterface
    public void cancel() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca m157386xf3cea287 = m157386xf3cea287();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m157386xf3cea287, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ScrollFrameLayout");
        if (m157386xf3cea287.isAnimating) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderScrollDialog", "cancel return isAnimating.");
        }
    }

    @Override // android.content.DialogInterface
    public void dismiss() {
        android.view.Window window;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderScrollDialog", "dismiss");
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        android.view.KeyEvent.Callback decorView = (abstractActivityC21394xb3d2c0cf == null || (window = abstractActivityC21394xb3d2c0cf.getWindow()) == null) ? null : window.getDecorView();
        android.widget.FrameLayout frameLayout = decorView instanceof android.widget.FrameLayout ? (android.widget.FrameLayout) decorView : null;
        if (frameLayout != null) {
            frameLayout.removeView(this);
        }
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f431514p;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(this);
        }
    }

    @Override // oy2.m
    public android.content.Context g() {
        return this.f431506e;
    }

    /* renamed from: getBottomMargin */
    public final int m157377xdc02122f() {
        return this.A;
    }

    /* renamed from: getCurScrollHeightListener */
    public final oy2.n m157378x40616952() {
        return this.F;
    }

    /* renamed from: getDialogHeight */
    public final int m157379x64b8f705() {
        return this.f431517s;
    }

    /* renamed from: getDialogTopMargin */
    public final int m157380x781e84c5() {
        return this.f431513o;
    }

    /* renamed from: getDialogWidth */
    public final int m157381xdaca9428() {
        return this.f431516r;
    }

    /* renamed from: getDismissListener */
    public final android.content.DialogInterface.OnDismissListener m157382xcb2e8328() {
        return this.f431514p;
    }

    /* renamed from: getGravity */
    public final int m157383x4e85ae18() {
        return this.D;
    }

    /* renamed from: getLeftMargin */
    public final int m157384x6138688b() {
        return this.f431522x;
    }

    /* renamed from: getListener */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a m157385xcc17022a() {
        return this.E;
    }

    /* renamed from: getMContentView */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca m157386xf3cea287() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca = this.f431508g;
        if (abstractC15503x81b4b9ca != null) {
            return abstractC15503x81b4b9ca;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContentView");
        throw null;
    }

    /* renamed from: getNavigationBarHeight */
    public final int m157387x92c6830() {
        return this.f431511m;
    }

    /* renamed from: getPeekHeight */
    public final int m157388xe610f658() {
        return this.f431519u;
    }

    /* renamed from: getPeekRatio */
    public final float m157389x735200ba() {
        return this.f431518t;
    }

    /* renamed from: getRightMargin */
    public final int m157390xb61475b4() {
        return this.f431523y;
    }

    /* renamed from: getScConfig */
    public final oy2.p m157391x13aebf28() {
        return this.f431505d;
    }

    /* renamed from: getScreenHeight */
    public final int m157392xe946cf29() {
        return this.f431509h;
    }

    /* renamed from: getScreenWidth */
    public final int m157393xd6cf2784() {
        return this.f431510i;
    }

    /* renamed from: getScrollContainerHeight */
    public final int m157394x13d834c5() {
        return this.f431520v;
    }

    /* renamed from: getScrollContainerWidth */
    public final int m157395xcfec9e68() {
        return this.f431521w;
    }

    /* renamed from: getScrollDownLimit */
    public final int m157396xca792db6() {
        return this.B;
    }

    /* renamed from: getScrollUpLimit */
    public final int m157397xc96cd29d() {
        return this.C;
    }

    /* renamed from: getStatusBarHeight */
    public final int m157398xe5345112() {
        return this.f431512n;
    }

    /* renamed from: getStyle */
    public final int m157399x7528c3fb() {
        return this.f431515q;
    }

    /* renamed from: getTopMargin */
    public final int m157400xe6bd90ad() {
        return this.f431524z;
    }

    /* renamed from: getWindow */
    public final android.view.Window m157401x3622fee6() {
        android.content.Context context = getContext();
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf ? (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context : null;
        if (abstractActivityC21394xb3d2c0cf != null) {
            return abstractActivityC21394xb3d2c0cf.getWindow();
        }
        return null;
    }

    @Override // oy2.m
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca l() {
        return m157386xf3cea287();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setBackgroundColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, this.f431517s);
        layoutParams.gravity = 80;
        layoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.g(getContext());
        android.view.View view = this.f431507f;
        if (view != null) {
            addView(view, layoutParams);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mRootView");
            throw null;
        }
    }

    /* renamed from: setBottomMargin */
    public final void m157402x124b0d3b(int i17) {
        this.A = i17;
    }

    /* renamed from: setCurScrollHeightListener */
    public final void m157403x56914ec6(oy2.n nVar) {
        if (this.f431515q == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca m157386xf3cea287 = m157386xf3cea287();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136 c15502x550b5136 = m157386xf3cea287 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) m157386xf3cea287 : null;
            if (c15502x550b5136 != null) {
                c15502x550b5136.m63404x56914ec6(nVar);
            }
        }
        this.F = nVar;
    }

    /* renamed from: setDialogHeight */
    public final void m157404x9b01f211(int i17) {
        this.f431517s = i17;
    }

    /* renamed from: setDialogWidth */
    public final void m157405x7130079c(int i17) {
        this.f431516r = i17;
    }

    /* renamed from: setDismissListener */
    public final void m157406x2051c9c(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f431514p = onDismissListener;
    }

    /* renamed from: setGravity */
    public final void m157407xc1f6fb8c(int i17) {
        this.D = i17;
    }

    /* renamed from: setLeftMargin */
    public final void m157408x8f5cb697(int i17) {
        this.f431522x = i17;
    }

    /* renamed from: setListener */
    public final void m157409xc6cf6336(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar) {
        if (this.f431515q == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca m157386xf3cea287 = m157386xf3cea287();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m157386xf3cea287, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.webview.ad.ExpandableScrollFrameLayout");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.C15502x550b5136) m157386xf3cea287).m63405x3b2d5c7(aVar);
        }
        this.E = aVar;
    }

    /* renamed from: setMContentView */
    public final void m157410x2a179d93(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1683x48fb3bf9.ad.AbstractC15503x81b4b9ca abstractC15503x81b4b9ca) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(abstractC15503x81b4b9ca, "<set-?>");
        this.f431508g = abstractC15503x81b4b9ca;
    }

    /* renamed from: setOnDismissListener */
    public void m157411xc07e953d(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f431514p = onDismissListener;
    }

    /* renamed from: setPeekHeight */
    public final void m157412x14354464(int i17) {
        this.f431519u = i17;
    }

    /* renamed from: setPeekRatio */
    public final void m157413xcfa5c12e(float f17) {
        this.f431518t = f17;
    }

    /* renamed from: setRightMargin */
    public final void m157414x4c79e928(int i17) {
        this.f431523y = i17;
    }

    /* renamed from: setScrollContainerHeight */
    public final void m157415xe3eae739(int i17) {
        this.f431520v = i17;
    }

    /* renamed from: setScrollContainerWidth */
    public final void m157416x4a3fcd74(int i17) {
        this.f431521w = i17;
    }

    /* renamed from: setScrollDownLimit */
    public final void m157417x14fc72a(int i17) {
        this.B = i17;
    }

    /* renamed from: setScrollUpLimit */
    public final void m157418x5c433911(int i17) {
        this.C = i17;
    }

    /* renamed from: setTopMargin */
    public final void m157419x43115121(int i17) {
        this.f431524z = i17;
    }
}

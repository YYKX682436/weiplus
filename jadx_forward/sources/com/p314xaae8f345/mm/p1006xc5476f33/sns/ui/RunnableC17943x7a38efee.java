package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* renamed from: com.tencent.mm.plugin.sns.ui.AsyncTextView */
/* loaded from: classes4.dex */
public class RunnableC17943x7a38efee extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22880x7ae7913b implements java.lang.Runnable {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f247752w = 0;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f247753g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f247754h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f247755i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f247756m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f247757n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 f247758o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c1 f247759p;

    /* renamed from: q, reason: collision with root package name */
    public int f247760q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.p670x38b72420.s f247761r;

    /* renamed from: s, reason: collision with root package name */
    public int f247762s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f247763t;

    /* renamed from: u, reason: collision with root package name */
    public volatile java.lang.String f247764u;

    /* renamed from: v, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u0 f247765v;

    public RunnableC17943x7a38efee(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f247761r = null;
        this.f247762s = 0;
        this.f247763t = false;
        this.f247764u = null;
        this.f247765v = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u0();
        e(context);
    }

    public final xe0.u0 b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("createTimelineTextStatusStyle", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        int b17 = i65.a.b(this.f247753g, 4);
        xe0.r0 a17 = new xe0.r0().a().a();
        a17.f535306a = i65.a.b(this.f247753g, 20);
        a17.f535312g = true;
        a17.f535313h = xe0.p0.f535301e;
        a17.f535322q = new xe0.t0(b17, b17, b17, b17);
        a17.f535323r = new xe0.t0(b17, b17, b17, b17);
        xe0.u0 a18 = a17.a();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("createTimelineTextStatusStyle", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        return a18;
    }

    public final void e(android.content.Context context) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f247753g = context;
        this.f247762s = com.p314xaae8f345.mm.ui.zk.a(context, 14);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    @Override // android.widget.TextView, android.view.View
    public int getBaseline() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            int baseline = super.getBaseline();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return baseline;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getBaseline", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return -1;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            super.onDraw(canvas);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AsyncTextView", th6, "", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375, android.widget.TextView, android.view.View
    public void onMeasure(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            super.onMeasure(i17, i18);
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onMeasure", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    @Override // android.widget.TextView, android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        try {
            boolean onPreDraw = super.onPreDraw();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return onPreDraw;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPreDraw", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
            return true;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int length;
        int length2;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.C19721x7964f21b c19721x7964f21b;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        if (getTag() instanceof java.lang.String) {
            java.lang.String str = (java.lang.String) getTag();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(str, this.f247755i) && !this.f247756m && str.equals(this.f247755i) && !this.f247763t) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                return;
            }
        }
        com.p314xaae8f345.mm.p670x38b72420.s sVar = this.f247761r;
        if ((sVar != null && com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(sVar.d1()) && "3552365301".equals(this.f247761r.Q0())) || !this.f247756m || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f247765v.f252084a)) {
            length = 0;
            length2 = 0;
            z17 = false;
        } else {
            length = this.f247754h.length();
            java.lang.String str2 = " @" + this.f247765v.f252084a;
            this.f247754h += str2;
            length2 = str2.length() + length;
            z17 = true;
        }
        int i17 = this.f247760q == 10 ? 3 : 2;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1(this.f247753g, new ca4.h(this.f247756m, this.f247755i, this.f247757n, 1), this.f247758o, i17);
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0 f0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.f0(((ke0.e) ((le0.x) i95.n0.c(le0.x.class))).aj(getContext(), this.f247754h, getTextSize(), i17));
        f0Var.a(d1Var, this.f247754h, 33);
        if (this.f247761r != null && length != length2 && length2 > length && length >= 0) {
            j41.b0 b0Var = (j41.b0) i95.n0.c(j41.b0.class);
            android.content.Context context = this.f247753g;
            java.lang.String Q0 = this.f247761r.Q0();
            int i18 = this.f247762s;
            ((l41.q2) b0Var).getClass();
            if ("3552365301".equals(Q0)) {
                android.content.res.ColorStateList e17 = i65.a.e(context, com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880);
                c19721x7964f21b = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.C19721x7964f21b(null, 0, i18, e17, e17);
            } else {
                c19721x7964f21b = null;
            }
            f0Var.c(c19721x7964f21b, length, length2, 33);
            if (z17) {
                j41.b0 b0Var2 = (j41.b0) i95.n0.c(j41.b0.class);
                android.content.Context context2 = this.f247753g;
                int i19 = this.f247762s;
                ((l41.q2) b0Var2).getClass();
                android.content.res.ColorStateList e18 = i65.a.e(context2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77845x35e12880);
                f0Var.c(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.C19721x7964f21b(null, 0, i19, e18, e18), length, length2, 33);
            }
        }
        setText(f0Var, android.widget.TextView.BufferType.SPANNABLE);
        setTag(this.f247755i);
        this.f247764u = this.f247755i;
        if (this.f247756m && (c17933xe8d1b226 = this.f247765v.f252085b) != null && c17933xe8d1b226.m70421xaf68c82a()) {
            x84.c.a(this, x84.c.b(this.f247765v.f252085b), i65.a.b(this.f247753g, 24), i65.a.b(this.f247753g, 20), i65.a.b(this.f247753g, 4), false);
        } else {
            xe0.v0 v0Var = new xe0.v0();
            if ((this.f247753g instanceof android.app.Activity) && this.f247759p != null) {
                v0Var.f535356c = new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.sns.ui.AsyncTextView$$b
                    @Override // android.view.View.OnClickListener
                    public final void onClick(android.view.View view) {
                        int i27 = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee.f247752w;
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee runnableC17943x7a38efee = com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.RunnableC17943x7a38efee.this;
                        runnableC17943x7a38efee.getClass();
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        arrayList.add(view);
                        java.lang.Object[] array = arrayList.toArray();
                        arrayList.clear();
                        yj0.a.b("com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", runnableC17943x7a38efee, array);
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("lambda$run$2", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        arrayList2.add(view);
                        java.lang.Object[] array2 = arrayList2.toArray();
                        arrayList2.clear();
                        yj0.a.b("com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", runnableC17943x7a38efee, array2);
                        runnableC17943x7a38efee.f247759p.a(view, runnableC17943x7a38efee.f247755i);
                        yj0.a.h(runnableC17943x7a38efee, "com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("lambda$run$2", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
                        yj0.a.h(runnableC17943x7a38efee, "com/tencent/mm/plugin/sns/ui/AsyncTextView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    }
                };
            }
            v0Var.f535355b = b();
            v0Var.f535354a = false;
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).qj(this, this.f247755i, bi4.c.SNS_FEED, bi4.d.OUTLINED, v0Var);
        }
        this.f247763t = false;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("run", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    /* renamed from: setContactInfo */
    public void m70551x72a6a72c(com.p314xaae8f345.mm.p670x38b72420.s sVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContactInfo", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
        this.f247761r = sVar;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContactInfo", "com.tencent.mm.plugin.sns.ui.AsyncTextView");
    }

    public RunnableC17943x7a38efee(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f247761r = null;
        this.f247762s = 0;
        this.f247763t = false;
        this.f247764u = null;
        this.f247765v = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u0();
        e(context);
    }

    public RunnableC17943x7a38efee(android.content.Context context) {
        super(context);
        this.f247761r = null;
        this.f247762s = 0;
        this.f247763t = false;
        this.f247764u = null;
        this.f247765v = new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.u0();
        e(context);
    }
}

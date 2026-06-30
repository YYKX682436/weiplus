package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c;

/* renamed from: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView */
/* loaded from: classes8.dex */
public class C12767x7016a6fb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12769x6c13eef8 implements cl1.p0 {

    /* renamed from: h0, reason: collision with root package name */
    public static final int f172613h0 = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 100);
    public final cl1.k0 A2;
    public final int B2;
    public float C2;
    public float D2;
    public boolean E2;
    public boolean F2;
    public final android.view.animation.Interpolator G2;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 H2;

    /* renamed from: e2, reason: collision with root package name */
    public final int f172614e2;

    /* renamed from: f2, reason: collision with root package name */
    public cl1.o0 f172615f2;

    /* renamed from: g2, reason: collision with root package name */
    public cl1.y f172616g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.ArrayList f172617h2;

    /* renamed from: i2, reason: collision with root package name */
    public android.content.Context f172618i2;

    /* renamed from: j2, reason: collision with root package name */
    public cl1.x f172619j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f172620k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f172621l2;

    /* renamed from: m2, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f172622m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.widget.Toast f172623n2;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f172624o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f172625p2;

    /* renamed from: q2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f172626q2;

    /* renamed from: r2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f f172627r2;

    /* renamed from: s2, reason: collision with root package name */
    public int f172628s2;

    /* renamed from: t2, reason: collision with root package name */
    public int f172629t2;

    /* renamed from: u2, reason: collision with root package name */
    public int f172630u2;

    /* renamed from: v2, reason: collision with root package name */
    public int f172631v2;

    /* renamed from: w2, reason: collision with root package name */
    public boolean f172632w2;

    /* renamed from: x2, reason: collision with root package name */
    public final int f172633x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.view.View f172634y2;

    /* renamed from: z2, reason: collision with root package name */
    public java.lang.String f172635z2;

    public C12767x7016a6fb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f172614e2 = 4;
        this.f172617h2 = new java.util.ArrayList();
        this.f172619j2 = null;
        this.f172620k2 = true;
        this.f172621l2 = false;
        this.f172628s2 = 0;
        this.f172629t2 = -1;
        this.f172630u2 = -1;
        this.f172632w2 = false;
        this.f172633x2 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        this.f172635z2 = "";
        this.A2 = new cl1.m(this);
        this.B2 = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        this.C2 = 0.0f;
        this.D2 = 0.0f;
        this.E2 = false;
        this.F2 = false;
        this.G2 = new android.view.animation.DecelerateInterpolator();
        this.H2 = new cl1.n(this);
        j1(context);
    }

    public static void g1(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb c12767x7016a6fb, boolean z17) {
        android.widget.Toast toast = c12767x7016a6fb.f172623n2;
        if (toast != null) {
            toast.cancel();
        }
        c12767x7016a6fb.f172623n2 = dp.a.m125854x26a183b(c12767x7016a6fb.getContext(), "", 0);
        android.view.View inflate = android.view.View.inflate(c12767x7016a6fb.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.f569912rq, null);
        c12767x7016a6fb.f172623n2.setGravity(17, 0, 0);
        c12767x7016a6fb.f172623n2.setView(inflate);
        ((android.widget.TextView) c12767x7016a6fb.f172623n2.getView().findViewById(com.p314xaae8f345.mm.R.id.f568890oe3)).setText(z17 ? com.p314xaae8f345.mm.R.C30867xcad56011.f571863rz : com.p314xaae8f345.mm.R.C30867xcad56011.f571640l3);
        c12767x7016a6fb.f172623n2.show();
    }

    /* renamed from: getCollectionDataSize */
    private int m53362x1abd557f() {
        return (this.f172617h2.size() - (this.f172620k2 ? 1 : 0)) - 1;
    }

    private void j1(android.content.Context context) {
        this.f172618i2 = context;
        o1();
        n1();
        setVerticalFadingEdgeEnabled(false);
        setNestedScrollingEnabled(true);
        setBackgroundColor(getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        cl1.x xVar = new cl1.x(context, this.f172614e2, 1, false);
        this.f172619j2 = xVar;
        xVar.B = new cl1.p(this);
        mo7967x900dcbe1(this.f172619j2);
        setOverScrollMode(2);
        i(this.H2);
        cl1.u uVar = new cl1.u(this, null);
        this.f172626q2 = uVar;
        mo7960x6cab2c8d(uVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "DesktopView init %d", java.lang.Integer.valueOf(hashCode()));
        m1(i65.a.B(getContext()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (r0 != 3) goto L51;
     */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.AbstractGestureDetectorOnGestureListenerC12769x6c13eef8, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12767x7016a6fb.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: getRecyclerView */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m53363x4905e9fa() {
        return this;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // cl1.p0
    /* renamed from: getViewModel */
    public cl1.y mo15095xa0ab20ce() {
        return this.f172616g2;
    }

    public final void h1() {
        boolean c17 = this.f172616g2.c();
        java.util.ArrayList arrayList = this.f172617h2;
        if (c17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "add more footer");
            arrayList.add(new cl1.n0(6));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "add normal footer");
            arrayList.add(new cl1.n0(3));
        }
    }

    public final void i1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "checkTriggerLoadMore");
        if (this.f172616g2.c() && this.f172619j2.y() == this.f172617h2.size() - 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "start load more hasMore:%b isLoading:%b", java.lang.Boolean.valueOf(this.f172616g2.c()), java.lang.Boolean.valueOf(this.f172621l2));
            if (!this.f172616g2.c() || this.f172621l2) {
                return;
            }
            this.f172621l2 = true;
            this.f172616g2.b(new cl1.r(this));
        }
    }

    public final void k1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "notifyDataChanged");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f172626q2;
        if (f2Var != null) {
            f2Var.m8146xced61ae5();
        }
    }

    public void l1(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "reset");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = this.f172627r2;
        if (c12766x2cdb734f != null && c12766x2cdb734f.f172654y) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DragFeatureView", "resetIfNeeded trigger");
            c12766x2cdb734f.k(false);
        }
        this.f172629t2 = -1;
        this.f172630u2 = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "reset", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "reset", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        setTranslationY(0.0f);
        cl1.o0 o0Var = this.f172615f2;
        if (o0Var != null) {
            o0Var.n(z17, this.f172632w2);
        }
        this.f172632w2 = false;
    }

    public final void m1(int i17) {
        el1.c.f335272a.a(this, i65.a.b(getContext(), 37), i17, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561239d1), this.f172620k2 ? 1 : 0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
    }

    public final void n1() {
        cl1.n0 n0Var;
        boolean z17 = !this.f172624o2;
        this.f172620k2 = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "updateShowSearchStatus showSearch: %b", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f172620k2;
        java.util.ArrayList arrayList = this.f172617h2;
        if (!z18) {
            if (arrayList.size() <= 0 || (n0Var = (cl1.n0) arrayList.get(0)) == null || n0Var.f124422b != 4) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "remove search");
            arrayList.remove(0);
            k1();
            return;
        }
        if (arrayList.size() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "showSearch, dataListSize = 0");
            arrayList.add(0, new cl1.n0(4));
            k1();
            return;
        }
        cl1.n0 n0Var2 = (cl1.n0) arrayList.get(0);
        if (n0Var2 == null || n0Var2.f124422b != 4) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "showSearch, insert search");
            arrayList.add(0, new cl1.n0(4));
            k1();
        }
    }

    public final void o1() {
        this.f172624o2 = ((uh4.c0) i95.n0.c(uh4.c0.class)).mo168058x74219ae7();
        this.f172625p2 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", java.lang.Boolean.valueOf(this.f172624o2), java.lang.Integer.valueOf(this.f172625p2));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getSize(i18);
        if (size != this.f172628s2) {
            this.f172628s2 = size;
            m1(size);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1222x5ccf901c.C12766x2cdb734f c12766x2cdb734f = this.f172627r2;
        if (c12766x2cdb734f != null) {
            c12766x2cdb734f.mo15093xfd8913df(this.f172628s2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            if (w0(view).m8183xf806b362() >= this.f172619j2.y() - 4) {
                int y17 = this.f172619j2.y() + 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(y17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                i1();
            } else if (w0(view).m8183xf806b362() == this.f172619j2.w()) {
                int w17 = this.f172619j2.w() - 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Integer.valueOf(w17));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(this, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                a1(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
            }
        }
        return super.onRequestSendAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // cl1.p0
    /* renamed from: setCallback */
    public void mo15096x6c4ebec7(cl1.o0 o0Var) {
        this.f172615f2 = o0Var;
    }

    public C12767x7016a6fb(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f172614e2 = 4;
        this.f172617h2 = new java.util.ArrayList();
        this.f172619j2 = null;
        this.f172620k2 = true;
        this.f172621l2 = false;
        this.f172628s2 = 0;
        this.f172629t2 = -1;
        this.f172630u2 = -1;
        this.f172632w2 = false;
        this.f172633x2 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        this.f172635z2 = "";
        this.A2 = new cl1.m(this);
        this.B2 = android.view.ViewConfiguration.get(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getScaledTouchSlop();
        this.C2 = 0.0f;
        this.D2 = 0.0f;
        this.E2 = false;
        this.F2 = false;
        this.G2 = new android.view.animation.DecelerateInterpolator();
        this.H2 = new cl1.n(this);
        j1(context);
    }
}

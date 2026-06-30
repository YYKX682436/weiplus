package com.tencent.mm.plugin.appbrand.widget.desktop;

/* loaded from: classes8.dex */
public class AppBrandDesktopView extends com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView implements cl1.p0 {

    /* renamed from: h0, reason: collision with root package name */
    public static final int f91080h0 = i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 100);
    public final cl1.k0 A2;
    public final int B2;
    public float C2;
    public float D2;
    public boolean E2;
    public boolean F2;
    public final android.view.animation.Interpolator G2;
    public final androidx.recyclerview.widget.w2 H2;

    /* renamed from: e2, reason: collision with root package name */
    public final int f91081e2;

    /* renamed from: f2, reason: collision with root package name */
    public cl1.o0 f91082f2;

    /* renamed from: g2, reason: collision with root package name */
    public cl1.y f91083g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.ArrayList f91084h2;

    /* renamed from: i2, reason: collision with root package name */
    public android.content.Context f91085i2;

    /* renamed from: j2, reason: collision with root package name */
    public cl1.x f91086j2;

    /* renamed from: k2, reason: collision with root package name */
    public boolean f91087k2;

    /* renamed from: l2, reason: collision with root package name */
    public boolean f91088l2;

    /* renamed from: m2, reason: collision with root package name */
    public com.tencent.mm.ui.widget.ThreeDotsLoadingView f91089m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.widget.Toast f91090n2;

    /* renamed from: o2, reason: collision with root package name */
    public boolean f91091o2;

    /* renamed from: p2, reason: collision with root package name */
    public int f91092p2;

    /* renamed from: q2, reason: collision with root package name */
    public androidx.recyclerview.widget.f2 f91093q2;

    /* renamed from: r2, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView f91094r2;

    /* renamed from: s2, reason: collision with root package name */
    public int f91095s2;

    /* renamed from: t2, reason: collision with root package name */
    public int f91096t2;

    /* renamed from: u2, reason: collision with root package name */
    public int f91097u2;

    /* renamed from: v2, reason: collision with root package name */
    public int f91098v2;

    /* renamed from: w2, reason: collision with root package name */
    public boolean f91099w2;

    /* renamed from: x2, reason: collision with root package name */
    public final int f91100x2;

    /* renamed from: y2, reason: collision with root package name */
    public android.view.View f91101y2;

    /* renamed from: z2, reason: collision with root package name */
    public java.lang.String f91102z2;

    public AppBrandDesktopView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f91081e2 = 4;
        this.f91084h2 = new java.util.ArrayList();
        this.f91086j2 = null;
        this.f91087k2 = true;
        this.f91088l2 = false;
        this.f91095s2 = 0;
        this.f91096t2 = -1;
        this.f91097u2 = -1;
        this.f91099w2 = false;
        this.f91100x2 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479649bo);
        this.f91102z2 = "";
        this.A2 = new cl1.m(this);
        this.B2 = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        this.C2 = 0.0f;
        this.D2 = 0.0f;
        this.E2 = false;
        this.F2 = false;
        this.G2 = new android.view.animation.DecelerateInterpolator();
        this.H2 = new cl1.n(this);
        j1(context);
    }

    public static void g1(com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView appBrandDesktopView, boolean z17) {
        android.widget.Toast toast = appBrandDesktopView.f91090n2;
        if (toast != null) {
            toast.cancel();
        }
        appBrandDesktopView.f91090n2 = dp.a.makeText(appBrandDesktopView.getContext(), "", 0);
        android.view.View inflate = android.view.View.inflate(appBrandDesktopView.getContext(), com.tencent.mm.R.layout.f488379rq, null);
        appBrandDesktopView.f91090n2.setGravity(17, 0, 0);
        appBrandDesktopView.f91090n2.setView(inflate);
        ((android.widget.TextView) appBrandDesktopView.f91090n2.getView().findViewById(com.tencent.mm.R.id.f487357oe3)).setText(z17 ? com.tencent.mm.R.string.f490330rz : com.tencent.mm.R.string.f490107l3);
        appBrandDesktopView.f91090n2.show();
    }

    private int getCollectionDataSize() {
        return (this.f91084h2.size() - (this.f91087k2 ? 1 : 0)) - 1;
    }

    private void j1(android.content.Context context) {
        this.f91085i2 = context;
        o1();
        n1();
        setVerticalFadingEdgeEnabled(false);
        setNestedScrollingEnabled(true);
        setBackgroundColor(getContext().getResources().getColor(com.tencent.mm.R.color.a9e));
        cl1.x xVar = new cl1.x(context, this.f91081e2, 1, false);
        this.f91086j2 = xVar;
        xVar.B = new cl1.p(this);
        setLayoutManager(this.f91086j2);
        setOverScrollMode(2);
        i(this.H2);
        cl1.u uVar = new cl1.u(this, null);
        this.f91093q2 = uVar;
        setAdapter(uVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "DesktopView init %d", java.lang.Integer.valueOf(hashCode()));
        m1(i65.a.B(getContext()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0018, code lost:
    
        if (r0 != 3) goto L51;
     */
    @Override // com.tencent.mm.plugin.appbrand.widget.desktop.DragRecyclerView, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public androidx.recyclerview.widget.RecyclerView getRecyclerView() {
        return this;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 0.0f;
    }

    @Override // cl1.p0
    public cl1.y getViewModel() {
        return this.f91083g2;
    }

    public final void h1() {
        boolean c17 = this.f91083g2.c();
        java.util.ArrayList arrayList = this.f91084h2;
        if (c17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "add more footer");
            arrayList.add(new cl1.n0(6));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "add normal footer");
            arrayList.add(new cl1.n0(3));
        }
    }

    public final void i1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "checkTriggerLoadMore");
        if (this.f91083g2.c() && this.f91086j2.y() == this.f91084h2.size() - 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "start load more hasMore:%b isLoading:%b", java.lang.Boolean.valueOf(this.f91083g2.c()), java.lang.Boolean.valueOf(this.f91088l2));
            if (!this.f91083g2.c() || this.f91088l2) {
                return;
            }
            this.f91088l2 = true;
            this.f91083g2.b(new cl1.r(this));
        }
    }

    public final void k1() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "notifyDataChanged");
        androidx.recyclerview.widget.f2 f2Var = this.f91093q2;
        if (f2Var != null) {
            f2Var.notifyDataSetChanged();
        }
    }

    public void l1(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "reset");
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = this.f91094r2;
        if (appBrandDesktopDragView != null && appBrandDesktopDragView.f91121y) {
            com.tencent.mars.xlog.Log.i("MicroMsg.DragFeatureView", "resetIfNeeded trigger");
            appBrandDesktopDragView.k(false);
        }
        this.f91096t2 = -1;
        this.f91097u2 = -1;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "reset", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        a1(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "reset", "(Z)V", "Undefined", "scrollToPosition", "(I)V");
        setTranslationY(0.0f);
        cl1.o0 o0Var = this.f91082f2;
        if (o0Var != null) {
            o0Var.n(z17, this.f91099w2);
        }
        this.f91099w2 = false;
    }

    public final void m1(int i17) {
        el1.c.f253739a.a(this, i65.a.b(getContext(), 37), i17, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479706d1), this.f91087k2 ? 1 : 0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479714d7));
    }

    public final void n1() {
        cl1.n0 n0Var;
        boolean z17 = !this.f91091o2;
        this.f91087k2 = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "updateShowSearchStatus showSearch: %b", java.lang.Boolean.valueOf(z17));
        boolean z18 = this.f91087k2;
        java.util.ArrayList arrayList = this.f91084h2;
        if (!z18) {
            if (arrayList.size() <= 0 || (n0Var = (cl1.n0) arrayList.get(0)) == null || n0Var.f42889b != 4) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "remove search");
            arrayList.remove(0);
            k1();
            return;
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "showSearch, dataListSize = 0");
            arrayList.add(0, new cl1.n0(4));
            k1();
            return;
        }
        cl1.n0 n0Var2 = (cl1.n0) arrayList.get(0);
        if (n0Var2 == null || n0Var2.f42889b != 4) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "showSearch, insert search");
            arrayList.add(0, new cl1.n0(4));
            k1();
        }
    }

    public final void o1() {
        this.f91091o2 = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        this.f91092p2 = ((uh4.c0) i95.n0.c(uh4.c0.class)).hd();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "updateTeenModeStatus isTeenMode: %b, miniProgramOption: %d", java.lang.Boolean.valueOf(this.f91091o2), java.lang.Integer.valueOf(this.f91092p2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getSize(i18);
        if (size != this.f91095s2) {
            this.f91095s2 = size;
            m1(size);
        }
        com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView appBrandDesktopDragView = this.f91094r2;
        if (appBrandDesktopDragView != null) {
            appBrandDesktopDragView.setViewWidth(this.f91095s2);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onRequestSendAccessibilityEvent(android.view.View view, android.view.accessibility.AccessibilityEvent accessibilityEvent) {
        if (accessibilityEvent.getEventType() == 32768) {
            if (w0(view).getAdapterPosition() >= this.f91086j2.y() - 4) {
                int y17 = this.f91086j2.y() + 1;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(y17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(this, "com/tencent/mm/plugin/appbrand/widget/desktop/AppBrandDesktopView", "onRequestSendAccessibilityEvent", "(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z", "Undefined", "scrollToPosition", "(I)V");
                i1();
            } else if (w0(view).getAdapterPosition() == this.f91086j2.w()) {
                int w17 = this.f91086j2.w() - 1;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
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
    public void setCallback(cl1.o0 o0Var) {
        this.f91082f2 = o0Var;
    }

    public AppBrandDesktopView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f91081e2 = 4;
        this.f91084h2 = new java.util.ArrayList();
        this.f91086j2 = null;
        this.f91087k2 = true;
        this.f91088l2 = false;
        this.f91095s2 = 0;
        this.f91096t2 = -1;
        this.f91097u2 = -1;
        this.f91099w2 = false;
        this.f91100x2 = i65.a.f(getContext(), com.tencent.mm.R.dimen.f479649bo);
        this.f91102z2 = "";
        this.A2 = new cl1.m(this);
        this.B2 = android.view.ViewConfiguration.get(com.tencent.mm.sdk.platformtools.x2.f193071a).getScaledTouchSlop();
        this.C2 = 0.0f;
        this.D2 = 0.0f;
        this.E2 = false;
        this.F2 = false;
        this.G2 = new android.view.animation.DecelerateInterpolator();
        this.H2 = new cl1.n(this);
        j1(context);
    }
}

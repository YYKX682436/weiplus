package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public final class h1 extends android.widget.FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.LinkedList f91462u = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f91463d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f91464e;

    /* renamed from: f, reason: collision with root package name */
    public int f91465f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f91466g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f91467h;

    /* renamed from: i, reason: collision with root package name */
    public int f91468i;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f91469m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.q5 f91470n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.widget.input.w5 f91471o;

    /* renamed from: p, reason: collision with root package name */
    public ql1.a f91472p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.WeakHashMap f91473q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f91474r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f91475s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f91476t;

    public h1(android.content.Context context, android.view.View view) {
        super(new android.content.MutableContextWrapper(context));
        this.f91465f = -1;
        this.f91466g = false;
        this.f91468i = 0;
        this.f91469m = new int[2];
        this.f91473q = new java.util.WeakHashMap();
        this.f91474r = new com.tencent.mm.plugin.appbrand.widget.input.i1(this);
        this.f91475s = new com.tencent.mm.plugin.appbrand.widget.input.j1(this);
        this.f91476t = new java.util.HashSet();
        super.setId(com.tencent.mm.R.id.a0o);
        this.f91464e = view;
        android.app.Activity a17 = q75.a.a(context);
        if (a17 instanceof androidx.fragment.app.FragmentActivity) {
            this.f91470n = new com.tencent.mm.plugin.appbrand.widget.input.q5(a17);
        }
        if (a17 != null) {
            this.f91467h = new java.lang.ref.WeakReference(a17);
        }
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.h1 d(android.view.View view) {
        return (com.tencent.mm.plugin.appbrand.widget.input.h1) view.getRootView().findViewById(com.tencent.mm.R.id.a0o);
    }

    public static com.tencent.mm.plugin.appbrand.widget.input.l2 e(android.view.View view) {
        com.tencent.mm.plugin.appbrand.widget.input.h1 d17 = d(view);
        if (d17 == null) {
            return null;
        }
        if (d17.getOnLayoutListener() == null || !(d17.getOnLayoutListener() instanceof com.tencent.mm.plugin.appbrand.widget.input.l2)) {
            com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = new com.tencent.mm.plugin.appbrand.widget.input.l2();
            d17.setOnLayoutListener(l2Var);
            com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var = d17.f91470n;
            if (q5Var != null) {
                l2Var.f91529b = q5Var;
                q5Var.f91625a = new com.tencent.mm.plugin.appbrand.widget.input.h2(l2Var);
            }
        }
        return (com.tencent.mm.plugin.appbrand.widget.input.l2) d17.getOnLayoutListener();
    }

    public void a(android.view.View view, boolean z17) {
        android.view.View view2 = this.f91463d;
        if (view2 != view && view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f91463d = null;
        }
        this.f91463d = view;
        if (view.getParent() != this) {
            if (view.getParent() != null) {
                ((android.view.ViewGroup) view.getParent()).removeView(view);
            }
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 80;
            super.addView(view, layoutParams);
        } else {
            view.bringToFront();
        }
        java.util.WeakHashMap weakHashMap = this.f91473q;
        com.tencent.mm.plugin.appbrand.widget.input.m1 m1Var = (com.tencent.mm.plugin.appbrand.widget.input.m1) weakHashMap.get(this.f91463d);
        if (m1Var == null) {
            m1Var = new com.tencent.mm.plugin.appbrand.widget.input.m1(null);
            weakHashMap.put(this.f91463d, m1Var);
        }
        m1Var.f91542a = z17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (view == this.f91464e || view == this.f91463d) {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    public final void b() {
        com.tencent.mm.plugin.appbrand.widget.input.m1 m1Var;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.x0.c(this)) {
            boolean z17 = true;
            boolean z18 = false;
            boolean z19 = false;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt != null && childAt != this.f91464e && (m1Var = (com.tencent.mm.plugin.appbrand.widget.input.m1) this.f91473q.get(childAt)) != null) {
                    if (!z18 && m1Var.f91543b != 0 && childAt.getVisibility() == 0) {
                        this.f91463d = childAt;
                        post(this.f91474r);
                        z18 = true;
                    }
                    z19 |= m1Var.f91543b == 0;
                    z17 &= childAt.getVisibility() != 0;
                    m1Var.f91543b = childAt.getVisibility();
                }
            }
            if (z18 || (z19 && z17)) {
                post(this.f91475s);
            }
        }
    }

    public void c() {
        android.view.View view = this.f91463d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dismissAllPanels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dismissAllPanels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f91463d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        com.tencent.mm.plugin.appbrand.widget.input.m1 m1Var = (com.tencent.mm.plugin.appbrand.widget.input.m1) this.f91473q.get(this.f91463d);
        android.view.View view2 = this.f91463d;
        if (view2 != null && view2.isShown() && !com.tencent.mm.plugin.appbrand.widget.input.n.f91551d && motionEvent.getAction() == 0) {
            android.view.View view3 = this.f91463d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (m1Var != null && m1Var.f91542a && (view = this.f91463d) != null && view.isShown() && motionEvent.getAction() == 0) {
            float rawY = motionEvent.getRawY();
            android.view.View view4 = this.f91463d;
            int[] iArr = this.f91469m;
            view4.getLocationOnScreen(iArr);
            float f17 = iArr[1];
            float height = this.f91463d.getHeight() + f17;
            if (rawY < f17 || rawY > height) {
                android.view.View view5 = this.f91463d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view5, arrayList2.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view5.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view5, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean f(android.view.KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 && keyEvent.getAction() == 1) {
            android.view.View view = this.f91463d;
            if (view != null && view.isShown()) {
                android.view.View view2 = this.f91463d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "onKeyEventChanged", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "onKeyEventChanged", "(Landroid/view/KeyEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return true;
            }
            if (nf.o.a(getContext())) {
                return true;
            }
        }
        return dispatchKeyEvent(keyEvent);
    }

    public android.view.View getCurrentBottomPanel() {
        return this.f91463d;
    }

    public ql1.a getOnLayoutListener() {
        return this.f91472p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            if (this.f91471o == null) {
                this.f91471o = new com.tencent.mm.plugin.appbrand.widget.input.w5(new com.tencent.mm.plugin.appbrand.widget.input.k1(this));
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f91471o);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f91471o);
        }
        if (i17 >= 30) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandUIdRootFrameLayout", "attach input root layout above android Q");
            n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.appbrand.widget.input.h1$$a
                @Override // n3.k0
                public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                    com.tencent.mm.plugin.appbrand.widget.input.h1 h1Var = com.tencent.mm.plugin.appbrand.widget.input.h1.this;
                    h1Var.f91466g = true;
                    h1Var.b();
                    ql1.a aVar = h1Var.f91472p;
                    if (aVar != null) {
                        ((com.tencent.mm.plugin.appbrand.widget.input.l2) aVar).f(view, false, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                    h1Var.f91466g = false;
                    return g3Var;
                }
            };
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(this, k0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ql1.a aVar = this.f91472p;
        if (aVar != null) {
            com.tencent.mm.plugin.appbrand.widget.input.l2 l2Var = (com.tencent.mm.plugin.appbrand.widget.input.l2) aVar;
            com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var = l2Var.f91529b;
            if (q5Var != null) {
                q5Var.b();
                com.tencent.mm.plugin.appbrand.widget.input.q5 q5Var2 = l2Var.f91529b;
                if (q5Var2.f91631g != null) {
                    android.content.ComponentCallbacks2 componentCallbacks2 = q5Var2.f91630f;
                    if (componentCallbacks2 instanceof androidx.lifecycle.y) {
                        ((androidx.lifecycle.y) componentCallbacks2).mo133getLifecycle().c(q5Var2.f91631g);
                    }
                }
                l2Var.f91529b.f91625a = null;
            }
            l2Var.f91529b = null;
            l2Var.f91536i.clear();
        }
        this.f91472p = null;
        this.f91470n = null;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            this.f91471o.a();
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f91471o);
        }
        if (i17 >= 30) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.a1.u(this, null);
        }
        removeAllViews();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            super.onLayout(z17, i17, i18, i19, i27);
            return;
        }
        this.f91466g = true;
        b();
        super.onLayout(z17, i17, i18, i19, i27);
        ql1.a aVar = this.f91472p;
        if (aVar != null) {
            ((com.tencent.mm.plugin.appbrand.widget.input.l2) aVar).f(this, z17, i17, i18, i19, i27);
        }
        this.f91466g = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f91465f;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f91473q.remove(view);
        if (this.f91463d == view) {
            this.f91463d = null;
        }
    }

    public void setForceHeight(int i17) {
        boolean z17 = i17 != this.f91465f;
        this.f91465f = i17;
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.c(this) && !this.f91466g) {
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    public void setOnLayoutListener(ql1.a aVar) {
        this.f91472p = aVar;
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (view == this.f91464e || view == this.f91463d) {
            super.addView(view, i17);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, int i18) {
        if (view == this.f91464e || view == this.f91463d) {
            super.addView(view, i17, i18);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f91464e || view == this.f91463d) {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f91464e || view == this.f91463d) {
            super.addView(view, i17, layoutParams);
        }
    }
}

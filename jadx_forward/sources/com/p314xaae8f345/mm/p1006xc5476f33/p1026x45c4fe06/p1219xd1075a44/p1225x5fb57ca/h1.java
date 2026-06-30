package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca;

/* loaded from: classes7.dex */
public final class h1 extends android.widget.FrameLayout {

    /* renamed from: u, reason: collision with root package name */
    public static final java.util.LinkedList f172995u = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f172996d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f172997e;

    /* renamed from: f, reason: collision with root package name */
    public int f172998f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f172999g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.ref.WeakReference f173000h;

    /* renamed from: i, reason: collision with root package name */
    public int f173001i;

    /* renamed from: m, reason: collision with root package name */
    public final int[] f173002m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 f173003n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5 f173004o;

    /* renamed from: p, reason: collision with root package name */
    public ql1.a f173005p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.WeakHashMap f173006q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.Runnable f173007r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.Runnable f173008s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.Set f173009t;

    public h1(android.content.Context context, android.view.View view) {
        super(new android.content.MutableContextWrapper(context));
        this.f172998f = -1;
        this.f172999g = false;
        this.f173001i = 0;
        this.f173002m = new int[2];
        this.f173006q = new java.util.WeakHashMap();
        this.f173007r = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.i1(this);
        this.f173008s = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.j1(this);
        this.f173009t = new java.util.HashSet();
        super.setId(com.p314xaae8f345.mm.R.id.a0o);
        this.f172997e = view;
        android.app.Activity a17 = q75.a.a(context);
        if (a17 instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) {
            this.f173003n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5(a17);
        }
        if (a17 != null) {
            this.f173000h = new java.lang.ref.WeakReference(a17);
        }
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d(android.view.View view) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1) view.getRootView().findViewById(com.p314xaae8f345.mm.R.id.a0o);
    }

    public static com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 e(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 d17 = d(view);
        if (d17 == null) {
            return null;
        }
        if (d17.m53479xdaa76933() == null || !(d17.m53479xdaa76933() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2();
            d17.m53481x7ea3fe3f(l2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var = d17.f173003n;
            if (q5Var != null) {
                l2Var.f173062b = q5Var;
                q5Var.f173158a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h2(l2Var);
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) d17.m53479xdaa76933();
    }

    public void a(android.view.View view, boolean z17) {
        android.view.View view2 = this.f172996d;
        if (view2 != view && view2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "addBottomPanel", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f172996d = null;
        }
        this.f172996d = view;
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
        java.util.WeakHashMap weakHashMap = this.f173006q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1) weakHashMap.get(this.f172996d);
        if (m1Var == null) {
            m1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1(null);
            weakHashMap.put(this.f172996d, m1Var);
        }
        m1Var.f173075a = z17;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        if (view == this.f172997e || view == this.f172996d) {
            super.addView(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        return false;
    }

    public final void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1 m1Var;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.x0.c(this)) {
            boolean z17 = true;
            boolean z18 = false;
            boolean z19 = false;
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (childAt != null && childAt != this.f172997e && (m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1) this.f173006q.get(childAt)) != null) {
                    if (!z18 && m1Var.f173076b != 0 && childAt.getVisibility() == 0) {
                        this.f172996d = childAt;
                        post(this.f173007r);
                        z18 = true;
                    }
                    z19 |= m1Var.f173076b == 0;
                    z17 &= childAt.getVisibility() != 0;
                    m1Var.f173076b = childAt.getVisibility();
                }
            }
            if (z18 || (z19 && z17)) {
                post(this.f173008s);
            }
        }
    }

    public void c() {
        android.view.View view = this.f172996d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dismissAllPanels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dismissAllPanels", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f172996d = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1 m1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.m1) this.f173006q.get(this.f172996d);
        android.view.View view2 = this.f172996d;
        if (view2 != null && view2.isShown() && !com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.n.f173084d && motionEvent.getAction() == 0) {
            android.view.View view3 = this.f172996d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandInputRootFrameLayout", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (m1Var != null && m1Var.f173075a && (view = this.f172996d) != null && view.isShown() && motionEvent.getAction() == 0) {
            float rawY = motionEvent.getRawY();
            android.view.View view4 = this.f172996d;
            int[] iArr = this.f173002m;
            view4.getLocationOnScreen(iArr);
            float f17 = iArr[1];
            float height = this.f172996d.getHeight() + f17;
            if (rawY < f17 || rawY > height) {
                android.view.View view5 = this.f172996d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
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
            android.view.View view = this.f172996d;
            if (view != null && view.isShown()) {
                android.view.View view2 = this.f172996d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

    /* renamed from: getCurrentBottomPanel */
    public android.view.View m53478xbfa17956() {
        return this.f172996d;
    }

    /* renamed from: getOnLayoutListener */
    public ql1.a m53479xdaa76933() {
        return this.f173005p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            if (this.f173004o == null) {
                this.f173004o = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.w5(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.k1(this));
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f173004o);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f173004o);
        }
        if (i17 >= 30) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandUIdRootFrameLayout", "attach input root layout above android Q");
            n3.k0 k0Var = new n3.k0() { // from class: com.tencent.mm.plugin.appbrand.widget.input.h1$$a
                @Override // n3.k0
                public final n3.g3 a(android.view.View view, n3.g3 g3Var) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1 h1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.h1.this;
                    h1Var.f172999g = true;
                    h1Var.b();
                    ql1.a aVar = h1Var.f173005p;
                    if (aVar != null) {
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) aVar).f(view, false, view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                    }
                    h1Var.f172999g = false;
                    return g3Var;
                }
            };
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.a1.u(this, k0Var);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ql1.a aVar = this.f173005p;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2 l2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) aVar;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var = l2Var.f173062b;
            if (q5Var != null) {
                q5Var.b();
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.q5 q5Var2 = l2Var.f173062b;
                if (q5Var2.f173164g != null) {
                    android.content.ComponentCallbacks2 componentCallbacks2 = q5Var2.f173163f;
                    if (componentCallbacks2 instanceof p012xc85e97e9.p093xedfae76a.y) {
                        ((p012xc85e97e9.p093xedfae76a.y) componentCallbacks2).mo273xed6858b4().c(q5Var2.f173164g);
                    }
                }
                l2Var.f173062b.f173158a = null;
            }
            l2Var.f173062b = null;
            l2Var.f173069i.clear();
        }
        this.f173005p = null;
        this.f173003n = null;
        int i17 = android.os.Build.VERSION.SDK_INT;
        if (i17 >= 33) {
            this.f173004o.a();
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f173004o);
        }
        if (i17 >= 30) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
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
        this.f172999g = true;
        b();
        super.onLayout(z17, i17, i18, i19, i27);
        ql1.a aVar = this.f173005p;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2) aVar).f(this, z17, i17, i18, i19, i27);
        }
        this.f172999g = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int i19 = this.f172998f;
        if (i19 > 0) {
            i18 = android.view.View.MeasureSpec.makeMeasureSpec(i19, 1073741824);
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        this.f173006q.remove(view);
        if (this.f172996d == view) {
            this.f172996d = null;
        }
    }

    /* renamed from: setForceHeight */
    public void m53480x4133a630(int i17) {
        boolean z17 = i17 != this.f172998f;
        this.f172998f = i17;
        if (z17) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.c(this) && !this.f172999g) {
                requestLayout();
            }
        }
    }

    @Override // android.view.View
    public void setId(int i17) {
    }

    /* renamed from: setOnLayoutListener */
    public void m53481x7ea3fe3f(ql1.a aVar) {
        this.f173005p = aVar;
    }

    @Override // android.view.ViewGroup
    public boolean addViewInLayout(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams, boolean z17) {
        return false;
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17) {
        if (view == this.f172997e || view == this.f172996d) {
            super.addView(view, i17);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, int i18) {
        if (view == this.f172997e || view == this.f172996d) {
            super.addView(view, i17, i18);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f172997e || view == this.f172996d) {
            super.addView(view, layoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view, int i17, android.view.ViewGroup.LayoutParams layoutParams) {
        if (view == this.f172997e || view == this.f172996d) {
            super.addView(view, i17, layoutParams);
        }
    }
}

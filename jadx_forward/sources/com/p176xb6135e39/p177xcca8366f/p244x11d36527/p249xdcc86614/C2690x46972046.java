package com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614;

/* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior */
/* loaded from: classes14.dex */
public class C2690x46972046<V extends android.view.View> extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<V> {
    public android.view.VelocityTracker A;
    public int B;
    public int C;
    public boolean D;
    public java.util.Map E;
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k F;

    /* renamed from: d, reason: collision with root package name */
    public boolean f125967d;

    /* renamed from: e, reason: collision with root package name */
    public final float f125968e;

    /* renamed from: f, reason: collision with root package name */
    public int f125969f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f125970g;

    /* renamed from: h, reason: collision with root package name */
    public int f125971h;

    /* renamed from: i, reason: collision with root package name */
    public int f125972i;

    /* renamed from: m, reason: collision with root package name */
    public int f125973m;

    /* renamed from: n, reason: collision with root package name */
    public int f125974n;

    /* renamed from: o, reason: collision with root package name */
    public int f125975o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f125976p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f125977q;

    /* renamed from: r, reason: collision with root package name */
    public int f125978r;

    /* renamed from: s, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f125979s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f125980t;

    /* renamed from: u, reason: collision with root package name */
    public int f125981u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f125982v;

    /* renamed from: w, reason: collision with root package name */
    public int f125983w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.ref.WeakReference f125984x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.ref.WeakReference f125985y;

    /* renamed from: z, reason: collision with root package name */
    public y9.c f125986z;

    public C2690x46972046() {
        this.f125967d = true;
        this.f125978r = 4;
        this.F = new y9.b(this);
    }

    public static com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams).f92539a;
        if (behavior instanceof com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046) {
            return (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046) behavior;
        }
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final int B() {
        if (this.f125967d) {
            return this.f125973m;
        }
        return 0;
    }

    public final void C(int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        boolean z17 = true;
        if (i17 == -1) {
            if (!this.f125970g) {
                this.f125970g = true;
            }
            z17 = false;
        } else {
            if (this.f125970g || this.f125969f != i17) {
                this.f125970g = false;
                this.f125969f = java.lang.Math.max(0, i17);
                this.f125975o = this.f125983w - i17;
            }
            z17 = false;
        }
        if (!z17 || this.f125978r != 4 || (weakReference = this.f125984x) == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void D(int i17) {
        if (i17 == this.f125978r) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f125984x;
        if (weakReference == null) {
            if (i17 == 4 || i17 == 3 || i17 == 6 || (this.f125976p && i17 == 5)) {
                this.f125978r = i17;
                return;
            }
            return;
        }
        android.view.View view = (android.view.View) weakReference.get();
        if (view == null) {
            return;
        }
        android.view.ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested()) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(view)) {
                view.post(new y9.a(this, view, i17));
                return;
            }
        }
        G(view, i17);
    }

    public void E(int i17) {
        y9.c cVar;
        if (this.f125978r == i17) {
            return;
        }
        this.f125978r = i17;
        if (i17 == 6 || i17 == 3) {
            H(true);
        } else if (i17 == 5 || i17 == 4) {
            H(false);
        }
        android.view.View view = (android.view.View) this.f125984x.get();
        if (view == null || (cVar = this.f125986z) == null) {
            return;
        }
        cVar.b(view, i17);
    }

    public boolean F(android.view.View view, float f17) {
        if (this.f125977q) {
            return true;
        }
        return view.getTop() >= this.f125975o && java.lang.Math.abs((((float) view.getTop()) + (f17 * 0.1f)) - ((float) this.f125975o)) / ((float) this.f125969f) > 0.5f;
    }

    public void G(android.view.View view, int i17) {
        int i18;
        int i19;
        if (i17 == 4) {
            i18 = this.f125975o;
        } else if (i17 == 6) {
            i18 = this.f125974n;
            if (this.f125967d && i18 <= (i19 = this.f125973m)) {
                i17 = 3;
                i18 = i19;
            }
        } else if (i17 == 3) {
            i18 = B();
        } else {
            if (!this.f125976p || i17 != 5) {
                throw new java.lang.IllegalArgumentException("Illegal state argument: " + i17);
            }
            i18 = this.f125983w;
        }
        if (!this.f125979s.u(view, view.getLeft(), i18)) {
            E(i17);
            return;
        }
        E(2);
        y9.d dVar = new y9.d(this, view, i17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(view, dVar);
    }

    public final void H(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f125984x;
        if (weakReference == null) {
            return;
        }
        android.view.ViewParent parent = ((android.view.View) weakReference.get()).getParent();
        if (parent instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) {
            p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) parent;
            int childCount = c1081xa22a3e5a.getChildCount();
            if (z17) {
                if (this.E != null) {
                    return;
                } else {
                    this.E = new java.util.HashMap(childCount);
                }
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = c1081xa22a3e5a.getChildAt(i17);
                if (childAt != this.f125984x.get()) {
                    if (z17) {
                        this.E.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        n3.u0.s(childAt, 4);
                    } else {
                        java.util.Map map = this.E;
                        if (map != null && map.containsKey(childAt)) {
                            int intValue = ((java.lang.Integer) this.E.get(childAt)).intValue();
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                            n3.u0.s(childAt, intValue);
                        }
                    }
                }
            }
            if (z17) {
                return;
            }
            this.E = null;
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean e(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar;
        if (!view.isShown()) {
            this.f125980t = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.B = -1;
            android.view.VelocityTracker velocityTracker = this.A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A = null;
            }
        }
        if (this.A == null) {
            this.A = android.view.VelocityTracker.obtain();
        }
        this.A.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x17 = (int) motionEvent.getX();
            this.C = (int) motionEvent.getY();
            java.lang.ref.WeakReference weakReference = this.f125985y;
            android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view2 != null && c1081xa22a3e5a.q(view2, x17, this.C)) {
                this.B = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.D = true;
            }
            this.f125980t = this.B == -1 && !c1081xa22a3e5a.q(view, x17, this.C);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
            this.B = -1;
            if (this.f125980t) {
                this.f125980t = false;
                return false;
            }
        }
        if (!this.f125980t && (lVar = this.f125979s) != null && lVar.t(motionEvent)) {
            return true;
        }
        java.lang.ref.WeakReference weakReference2 = this.f125985y;
        android.view.View view3 = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f125980t || this.f125978r == 1 || c1081xa22a3e5a.q(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f125979s == null || java.lang.Math.abs(((float) this.C) - motionEvent.getY()) <= ((float) this.f125979s.f92654b)) ? false : true;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.u0.b(c1081xa22a3e5a) && !n3.u0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        c1081xa22a3e5a.s(view, i17);
        this.f125983w = c1081xa22a3e5a.getHeight();
        if (this.f125970g) {
            if (this.f125971h == 0) {
                this.f125971h = c1081xa22a3e5a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561810ta);
            }
            this.f125972i = java.lang.Math.max(this.f125971h, this.f125983w - ((c1081xa22a3e5a.getWidth() * 9) / 16));
        } else {
            this.f125972i = this.f125969f;
        }
        int max = java.lang.Math.max(0, this.f125983w - view.getHeight());
        this.f125973m = max;
        int i18 = this.f125983w;
        this.f125974n = i18 / 2;
        if (this.f125967d) {
            this.f125975o = java.lang.Math.max(i18 - this.f125972i, max);
        } else {
            this.f125975o = i18 - this.f125972i;
        }
        int i19 = this.f125978r;
        if (i19 == 3) {
            view.offsetTopAndBottom(B());
        } else if (i19 == 6) {
            view.offsetTopAndBottom(this.f125974n);
        } else if (this.f125976p && i19 == 5) {
            view.offsetTopAndBottom(this.f125983w);
        } else if (i19 == 4) {
            view.offsetTopAndBottom(this.f125975o);
        } else if (i19 == 1 || i19 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        if (this.f125979s == null) {
            this.f125979s = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(c1081xa22a3e5a.getContext(), c1081xa22a3e5a, this.F);
        }
        this.f125984x = new java.lang.ref.WeakReference(view);
        this.f125985y = new java.lang.ref.WeakReference(z(view));
        return true;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean j(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, float f17, float f18) {
        return view2 == this.f125985y.get() && this.f125978r != 3;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void l(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr, int i19) {
        if (i19 != 1 && view2 == ((android.view.View) this.f125985y.get())) {
            int top = view.getTop();
            int i27 = top - i18;
            if (i18 > 0) {
                if (i27 < B()) {
                    int B = top - B();
                    iArr[1] = B;
                    int i28 = -B;
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    view.offsetTopAndBottom(i28);
                    E(3);
                } else {
                    iArr[1] = i18;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                    view.offsetTopAndBottom(-i18);
                    E(1);
                }
            } else if (i18 < 0 && !view2.canScrollVertically(-1)) {
                int i29 = this.f125975o;
                if (i27 <= i29 || this.f125976p) {
                    iArr[1] = i18;
                    java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                    view.offsetTopAndBottom(-i18);
                    E(1);
                } else {
                    int i37 = top - i29;
                    iArr[1] = i37;
                    int i38 = -i37;
                    java.util.WeakHashMap weakHashMap4 = n3.l1.f415895a;
                    view.offsetTopAndBottom(i38);
                    E(4);
                }
            }
            y(view.getTop());
            this.f125981u = i18;
            this.f125982v = true;
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void r(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.os.Parcelable parcelable) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.SavedState savedState = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.SavedState) parcelable;
        android.os.Parcelable parcelable2 = savedState.f92645d;
        int i17 = savedState.f125987f;
        if (i17 == 1 || i17 == 2) {
            this.f125978r = 4;
        } else {
            this.f125978r = i17;
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public android.os.Parcelable s(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
        return new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.SavedState(android.view.View.BaseSavedState.EMPTY_STATE, this.f125978r);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        this.f125981u = 0;
        this.f125982v = false;
        return (i17 & 2) != 0;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void w(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17) {
        int i18;
        float yVelocity;
        int i19 = 3;
        if (view.getTop() == B()) {
            E(3);
            return;
        }
        if (view2 == this.f125985y.get() && this.f125982v) {
            if (this.f125981u > 0) {
                i18 = B();
            } else {
                if (this.f125976p) {
                    android.view.VelocityTracker velocityTracker = this.A;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f125968e);
                        yVelocity = this.A.getYVelocity(this.B);
                    }
                    if (F(view, yVelocity)) {
                        i18 = this.f125983w;
                        i19 = 5;
                    }
                }
                if (this.f125981u == 0) {
                    int top = view.getTop();
                    if (!this.f125967d) {
                        int i27 = this.f125974n;
                        if (top < i27) {
                            if (top < java.lang.Math.abs(top - this.f125975o)) {
                                i18 = 0;
                            } else {
                                i18 = this.f125974n;
                            }
                        } else if (java.lang.Math.abs(top - i27) < java.lang.Math.abs(top - this.f125975o)) {
                            i18 = this.f125974n;
                        } else {
                            i18 = this.f125975o;
                        }
                        i19 = 6;
                    } else if (java.lang.Math.abs(top - this.f125973m) < java.lang.Math.abs(top - this.f125975o)) {
                        i18 = this.f125973m;
                    } else {
                        i18 = this.f125975o;
                    }
                } else {
                    i18 = this.f125975o;
                }
                i19 = 4;
            }
            if (this.f125979s.u(view, view.getLeft(), i18)) {
                E(2);
                y9.d dVar = new y9.d(this, view, i19);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.u0.m(view, dVar);
            } else {
                E(i19);
            }
            this.f125982v = false;
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f125978r == 1 && actionMasked == 0) {
            return true;
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f125979s;
        if (lVar != null) {
            lVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.B = -1;
            android.view.VelocityTracker velocityTracker = this.A;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.A = null;
            }
        }
        if (this.A == null) {
            this.A = android.view.VelocityTracker.obtain();
        }
        this.A.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f125980t) {
            float abs = java.lang.Math.abs(this.C - motionEvent.getY());
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar2 = this.f125979s;
            if (abs > lVar2.f92654b) {
                lVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f125980t;
    }

    public void y(int i17) {
        y9.c cVar;
        android.view.View view = (android.view.View) this.f125984x.get();
        if (view == null || (cVar = this.f125986z) == null) {
            return;
        }
        if (i17 > this.f125975o) {
            cVar.a(view, (r2 - i17) / (this.f125983w - r2));
        } else {
            cVar.a(view, (r2 - i17) / (r2 - B()));
        }
    }

    public android.view.View z(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.a1.p(view)) {
            return view;
        }
        if (!(view instanceof android.view.ViewGroup)) {
            return null;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View z17 = z(viewGroup.getChildAt(i17));
            if (z17 != null) {
                return z17;
            }
        }
        return null;
    }

    /* renamed from: com.google.android.material.bottomsheet.BottomSheetBehavior$SavedState */
    /* loaded from: classes14.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.SavedState> f7859x681a0c0c = new com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.a();

        /* renamed from: f, reason: collision with root package name */
        public final int f125987f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f125987f = parcel.readInt();
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f125987f);
        }

        public SavedState(android.os.Parcelable parcelable, int i17) {
            super(parcelable);
            this.f125987f = i17;
        }
    }

    public C2690x46972046(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        this.f125967d = true;
        this.f125978r = 4;
        this.F = new y9.b(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515648e);
        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null && (i17 = peekValue.data) == -1) {
            C(i17);
        } else {
            C(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f125976p = obtainStyledAttributes.getBoolean(1, false);
        boolean z17 = obtainStyledAttributes.getBoolean(0, true);
        if (this.f125967d != z17) {
            this.f125967d = z17;
            if (this.f125984x != null) {
                if (z17) {
                    this.f125975o = java.lang.Math.max(this.f125983w - this.f125972i, this.f125973m);
                } else {
                    this.f125975o = this.f125983w - this.f125972i;
                }
            }
            E((this.f125967d && this.f125978r == 6) ? 3 : this.f125978r);
        }
        this.f125977q = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f125968e = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

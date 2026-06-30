package com.google.android.material.bottomsheet;

/* loaded from: classes14.dex */
public class BottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    public android.view.VelocityTracker A;
    public int B;
    public int C;
    public boolean D;
    public java.util.Map E;
    public final androidx.customview.widget.k F;

    /* renamed from: d, reason: collision with root package name */
    public boolean f44434d;

    /* renamed from: e, reason: collision with root package name */
    public final float f44435e;

    /* renamed from: f, reason: collision with root package name */
    public int f44436f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f44437g;

    /* renamed from: h, reason: collision with root package name */
    public int f44438h;

    /* renamed from: i, reason: collision with root package name */
    public int f44439i;

    /* renamed from: m, reason: collision with root package name */
    public int f44440m;

    /* renamed from: n, reason: collision with root package name */
    public int f44441n;

    /* renamed from: o, reason: collision with root package name */
    public int f44442o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f44443p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f44444q;

    /* renamed from: r, reason: collision with root package name */
    public int f44445r;

    /* renamed from: s, reason: collision with root package name */
    public androidx.customview.widget.l f44446s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f44447t;

    /* renamed from: u, reason: collision with root package name */
    public int f44448u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f44449v;

    /* renamed from: w, reason: collision with root package name */
    public int f44450w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.ref.WeakReference f44451x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.ref.WeakReference f44452y;

    /* renamed from: z, reason: collision with root package name */
    public y9.c f44453z;

    public BottomSheetBehavior() {
        this.f44434d = true;
        this.f44445r = 4;
        this.F = new y9.b(this);
    }

    public static com.google.android.material.bottomsheet.BottomSheetBehavior A(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f11006a;
        if (behavior instanceof com.google.android.material.bottomsheet.BottomSheetBehavior) {
            return (com.google.android.material.bottomsheet.BottomSheetBehavior) behavior;
        }
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final int B() {
        if (this.f44434d) {
            return this.f44440m;
        }
        return 0;
    }

    public final void C(int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        boolean z17 = true;
        if (i17 == -1) {
            if (!this.f44437g) {
                this.f44437g = true;
            }
            z17 = false;
        } else {
            if (this.f44437g || this.f44436f != i17) {
                this.f44437g = false;
                this.f44436f = java.lang.Math.max(0, i17);
                this.f44442o = this.f44450w - i17;
            }
            z17 = false;
        }
        if (!z17 || this.f44445r != 4 || (weakReference = this.f44451x) == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void D(int i17) {
        if (i17 == this.f44445r) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f44451x;
        if (weakReference == null) {
            if (i17 == 4 || i17 == 3 || i17 == 6 || (this.f44443p && i17 == 5)) {
                this.f44445r = i17;
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
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (n3.x0.b(view)) {
                view.post(new y9.a(this, view, i17));
                return;
            }
        }
        G(view, i17);
    }

    public void E(int i17) {
        y9.c cVar;
        if (this.f44445r == i17) {
            return;
        }
        this.f44445r = i17;
        if (i17 == 6 || i17 == 3) {
            H(true);
        } else if (i17 == 5 || i17 == 4) {
            H(false);
        }
        android.view.View view = (android.view.View) this.f44451x.get();
        if (view == null || (cVar = this.f44453z) == null) {
            return;
        }
        cVar.b(view, i17);
    }

    public boolean F(android.view.View view, float f17) {
        if (this.f44444q) {
            return true;
        }
        return view.getTop() >= this.f44442o && java.lang.Math.abs((((float) view.getTop()) + (f17 * 0.1f)) - ((float) this.f44442o)) / ((float) this.f44436f) > 0.5f;
    }

    public void G(android.view.View view, int i17) {
        int i18;
        int i19;
        if (i17 == 4) {
            i18 = this.f44442o;
        } else if (i17 == 6) {
            i18 = this.f44441n;
            if (this.f44434d && i18 <= (i19 = this.f44440m)) {
                i17 = 3;
                i18 = i19;
            }
        } else if (i17 == 3) {
            i18 = B();
        } else {
            if (!this.f44443p || i17 != 5) {
                throw new java.lang.IllegalArgumentException("Illegal state argument: " + i17);
            }
            i18 = this.f44450w;
        }
        if (!this.f44446s.u(view, view.getLeft(), i18)) {
            E(i17);
            return;
        }
        E(2);
        y9.d dVar = new y9.d(this, view, i17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(view, dVar);
    }

    public final void H(boolean z17) {
        java.lang.ref.WeakReference weakReference = this.f44451x;
        if (weakReference == null) {
            return;
        }
        android.view.ViewParent parent = ((android.view.View) weakReference.get()).getParent();
        if (parent instanceof androidx.coordinatorlayout.widget.CoordinatorLayout) {
            androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout = (androidx.coordinatorlayout.widget.CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z17) {
                if (this.E != null) {
                    return;
                } else {
                    this.E = new java.util.HashMap(childCount);
                }
            }
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = coordinatorLayout.getChildAt(i17);
                if (childAt != this.f44451x.get()) {
                    if (z17) {
                        this.E.put(childAt, java.lang.Integer.valueOf(childAt.getImportantForAccessibility()));
                        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                        n3.u0.s(childAt, 4);
                    } else {
                        java.util.Map map = this.E;
                        if (map != null && map.containsKey(childAt)) {
                            int intValue = ((java.lang.Integer) this.E.get(childAt)).intValue();
                            java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
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

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        androidx.customview.widget.l lVar;
        if (!view.isShown()) {
            this.f44447t = true;
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
            java.lang.ref.WeakReference weakReference = this.f44452y;
            android.view.View view2 = weakReference != null ? (android.view.View) weakReference.get() : null;
            if (view2 != null && coordinatorLayout.q(view2, x17, this.C)) {
                this.B = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.D = true;
            }
            this.f44447t = this.B == -1 && !coordinatorLayout.q(view, x17, this.C);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.D = false;
            this.B = -1;
            if (this.f44447t) {
                this.f44447t = false;
                return false;
            }
        }
        if (!this.f44447t && (lVar = this.f44446s) != null && lVar.t(motionEvent)) {
            return true;
        }
        java.lang.ref.WeakReference weakReference2 = this.f44452y;
        android.view.View view3 = weakReference2 != null ? (android.view.View) weakReference2.get() : null;
        return (actionMasked != 2 || view3 == null || this.f44447t || this.f44445r == 1 || coordinatorLayout.q(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f44446s == null || java.lang.Math.abs(((float) this.C) - motionEvent.getY()) <= ((float) this.f44446s.f11121b)) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.u0.b(coordinatorLayout) && !n3.u0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.s(view, i17);
        this.f44450w = coordinatorLayout.getHeight();
        if (this.f44437g) {
            if (this.f44438h == 0) {
                this.f44438h = coordinatorLayout.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480277ta);
            }
            this.f44439i = java.lang.Math.max(this.f44438h, this.f44450w - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            this.f44439i = this.f44436f;
        }
        int max = java.lang.Math.max(0, this.f44450w - view.getHeight());
        this.f44440m = max;
        int i18 = this.f44450w;
        this.f44441n = i18 / 2;
        if (this.f44434d) {
            this.f44442o = java.lang.Math.max(i18 - this.f44439i, max);
        } else {
            this.f44442o = i18 - this.f44439i;
        }
        int i19 = this.f44445r;
        if (i19 == 3) {
            view.offsetTopAndBottom(B());
        } else if (i19 == 6) {
            view.offsetTopAndBottom(this.f44441n);
        } else if (this.f44443p && i19 == 5) {
            view.offsetTopAndBottom(this.f44450w);
        } else if (i19 == 4) {
            view.offsetTopAndBottom(this.f44442o);
        } else if (i19 == 1 || i19 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        if (this.f44446s == null) {
            this.f44446s = new androidx.customview.widget.l(coordinatorLayout.getContext(), coordinatorLayout, this.F);
        }
        this.f44451x = new java.lang.ref.WeakReference(view);
        this.f44452y = new java.lang.ref.WeakReference(z(view));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f17, float f18) {
        return view2 == this.f44452y.get() && this.f44445r != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void l(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr, int i19) {
        if (i19 != 1 && view2 == ((android.view.View) this.f44452y.get())) {
            int top = view.getTop();
            int i27 = top - i18;
            if (i18 > 0) {
                if (i27 < B()) {
                    int B = top - B();
                    iArr[1] = B;
                    int i28 = -B;
                    java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                    view.offsetTopAndBottom(i28);
                    E(3);
                } else {
                    iArr[1] = i18;
                    java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                    view.offsetTopAndBottom(-i18);
                    E(1);
                }
            } else if (i18 < 0 && !view2.canScrollVertically(-1)) {
                int i29 = this.f44442o;
                if (i27 <= i29 || this.f44443p) {
                    iArr[1] = i18;
                    java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                    view.offsetTopAndBottom(-i18);
                    E(1);
                } else {
                    int i37 = top - i29;
                    iArr[1] = i37;
                    int i38 = -i37;
                    java.util.WeakHashMap weakHashMap4 = n3.l1.f334362a;
                    view.offsetTopAndBottom(i38);
                    E(4);
                }
            }
            y(view.getTop());
            this.f44448u = i18;
            this.f44449v = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void r(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState savedState = (com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState) parcelable;
        android.os.Parcelable parcelable2 = savedState.f11112d;
        int i17 = savedState.f44454f;
        if (i17 == 1 || i17 == 2) {
            this.f44445r = 4;
        } else {
            this.f44445r = i17;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable s(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return new com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState(android.view.View.BaseSavedState.EMPTY_STATE, this.f44445r);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean u(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        this.f44448u = 0;
        this.f44449v = false;
        return (i17 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void w(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i17) {
        int i18;
        float yVelocity;
        int i19 = 3;
        if (view.getTop() == B()) {
            E(3);
            return;
        }
        if (view2 == this.f44452y.get() && this.f44449v) {
            if (this.f44448u > 0) {
                i18 = B();
            } else {
                if (this.f44443p) {
                    android.view.VelocityTracker velocityTracker = this.A;
                    if (velocityTracker == null) {
                        yVelocity = 0.0f;
                    } else {
                        velocityTracker.computeCurrentVelocity(1000, this.f44435e);
                        yVelocity = this.A.getYVelocity(this.B);
                    }
                    if (F(view, yVelocity)) {
                        i18 = this.f44450w;
                        i19 = 5;
                    }
                }
                if (this.f44448u == 0) {
                    int top = view.getTop();
                    if (!this.f44434d) {
                        int i27 = this.f44441n;
                        if (top < i27) {
                            if (top < java.lang.Math.abs(top - this.f44442o)) {
                                i18 = 0;
                            } else {
                                i18 = this.f44441n;
                            }
                        } else if (java.lang.Math.abs(top - i27) < java.lang.Math.abs(top - this.f44442o)) {
                            i18 = this.f44441n;
                        } else {
                            i18 = this.f44442o;
                        }
                        i19 = 6;
                    } else if (java.lang.Math.abs(top - this.f44440m) < java.lang.Math.abs(top - this.f44442o)) {
                        i18 = this.f44440m;
                    } else {
                        i18 = this.f44442o;
                    }
                } else {
                    i18 = this.f44442o;
                }
                i19 = 4;
            }
            if (this.f44446s.u(view, view.getLeft(), i18)) {
                E(2);
                y9.d dVar = new y9.d(this, view, i19);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.m(view, dVar);
            } else {
                E(i19);
            }
            this.f44449v = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f44445r == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.l lVar = this.f44446s;
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
        if (actionMasked == 2 && !this.f44447t) {
            float abs = java.lang.Math.abs(this.C - motionEvent.getY());
            androidx.customview.widget.l lVar2 = this.f44446s;
            if (abs > lVar2.f11121b) {
                lVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f44447t;
    }

    public void y(int i17) {
        y9.c cVar;
        android.view.View view = (android.view.View) this.f44451x.get();
        if (view == null || (cVar = this.f44453z) == null) {
            return;
        }
        if (i17 > this.f44442o) {
            cVar.a(view, (r2 - i17) / (this.f44450w - r2));
        } else {
            cVar.a(view, (r2 - i17) / (r2 - B()));
        }
    }

    public android.view.View z(android.view.View view) {
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
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

    /* loaded from: classes14.dex */
    public static class SavedState extends androidx.customview.view.AbsSavedState {
        public static final android.os.Parcelable.Creator<com.google.android.material.bottomsheet.BottomSheetBehavior.SavedState> CREATOR = new com.google.android.material.bottomsheet.a();

        /* renamed from: f, reason: collision with root package name */
        public final int f44454f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f44454f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeInt(this.f44454f);
        }

        public SavedState(android.os.Parcelable parcelable, int i17) {
            super(parcelable);
            this.f44454f = i17;
        }
    }

    public BottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        this.f44434d = true;
        this.f44445r = 4;
        this.F = new y9.b(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434115e);
        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null && (i17 = peekValue.data) == -1) {
            C(i17);
        } else {
            C(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f44443p = obtainStyledAttributes.getBoolean(1, false);
        boolean z17 = obtainStyledAttributes.getBoolean(0, true);
        if (this.f44434d != z17) {
            this.f44434d = z17;
            if (this.f44451x != null) {
                if (z17) {
                    this.f44442o = java.lang.Math.max(this.f44450w - this.f44439i, this.f44440m);
                } else {
                    this.f44442o = this.f44450w - this.f44439i;
                }
            }
            E((this.f44434d && this.f44445r == 6) ? 3 : this.f44445r);
        }
        this.f44444q = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f44435e = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

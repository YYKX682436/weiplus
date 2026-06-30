package android.support.design.widget;

/* loaded from: classes14.dex */
public class MMBottomSheetBehavior<V extends android.view.View> extends androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior<V> {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public final androidx.customview.widget.k F;
    public c.d G;

    /* renamed from: d, reason: collision with root package name */
    public final float f8883d;

    /* renamed from: e, reason: collision with root package name */
    public int f8884e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8885f;

    /* renamed from: g, reason: collision with root package name */
    public int f8886g;

    /* renamed from: h, reason: collision with root package name */
    public int f8887h;

    /* renamed from: i, reason: collision with root package name */
    public int f8888i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8889m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f8890n;

    /* renamed from: o, reason: collision with root package name */
    public int f8891o;

    /* renamed from: p, reason: collision with root package name */
    public androidx.customview.widget.l f8892p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f8893q;

    /* renamed from: r, reason: collision with root package name */
    public int f8894r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f8895s;

    /* renamed from: t, reason: collision with root package name */
    public int f8896t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.ref.WeakReference f8897u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.ref.WeakReference f8898v;

    /* renamed from: w, reason: collision with root package name */
    public c.c f8899w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.VelocityTracker f8900x;

    /* renamed from: y, reason: collision with root package name */
    public int f8901y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f8902z;

    public MMBottomSheetBehavior() {
        this.f8891o = 4;
        this.E = false;
        this.F = new c.b(this);
    }

    public static android.support.design.widget.MMBottomSheetBehavior A(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof androidx.coordinatorlayout.widget.c)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior behavior = ((androidx.coordinatorlayout.widget.c) layoutParams).f11006a;
        if (behavior instanceof android.support.design.widget.MMBottomSheetBehavior) {
            return (android.support.design.widget.MMBottomSheetBehavior) behavior;
        }
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void B(int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        boolean z17 = true;
        if (i17 == -1) {
            if (!this.f8885f) {
                this.f8885f = true;
            }
            z17 = false;
        } else {
            if (this.f8885f || this.f8884e != i17) {
                this.f8885f = false;
                this.f8884e = java.lang.Math.max(0, i17);
                this.f8888i = this.f8896t - i17;
            }
            z17 = false;
        }
        if (!z17 || this.f8891o != 4 || (weakReference = this.f8897u) == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void C(int i17) {
        if (i17 == this.f8891o) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f8897u;
        if (weakReference == null) {
            if (i17 == 4 || i17 == 3 || (this.f8889m && i17 == 5)) {
                this.f8891o = i17;
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
                view.post(new c.a(this, view, i17));
                return;
            }
        }
        F(view, i17);
    }

    public void D(int i17) {
        c.c cVar;
        if (this.f8891o == i17) {
            return;
        }
        this.f8891o = i17;
        android.view.View view = (android.view.View) this.f8897u.get();
        if (view == null || (cVar = this.f8899w) == null) {
            return;
        }
        cVar.b(view, i17);
    }

    public boolean E(android.view.View view, float f17) {
        if (this.f8890n) {
            return true;
        }
        return view.getTop() >= this.f8888i && java.lang.Math.abs((((float) view.getTop()) + (f17 * 0.1f)) - ((float) this.f8888i)) / ((float) this.f8884e) > 0.5f;
    }

    public void F(android.view.View view, int i17) {
        int i18;
        if (i17 == 4) {
            i18 = this.f8888i;
        } else if (i17 == 3) {
            i18 = this.f8887h;
        } else {
            if (!this.f8889m || i17 != 5) {
                throw new java.lang.IllegalArgumentException("Illegal state argument: " + i17);
            }
            i18 = this.f8896t;
        }
        if (!this.f8892p.u(view, view.getLeft(), i18)) {
            D(i17);
            return;
        }
        D(2);
        c.e eVar = new c.e(this, view, i17);
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.m(view, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        if (r0 != 3) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(androidx.coordinatorlayout.widget.CoordinatorLayout r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.design.widget.MMBottomSheetBehavior.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean g(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i17) {
        int i18;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        if (n3.u0.b(coordinatorLayout) && !n3.u0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        coordinatorLayout.s(view, i17);
        this.f8896t = coordinatorLayout.getHeight();
        if (this.f8885f) {
            if (this.f8886g == 0) {
                this.f8886g = coordinatorLayout.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f480277ta);
            }
            i18 = java.lang.Math.max(this.f8886g, this.f8896t - ((coordinatorLayout.getWidth() * 9) / 16));
        } else {
            i18 = this.f8884e;
        }
        int max = java.lang.Math.max(0, this.f8896t - view.getHeight());
        this.f8887h = max;
        int max2 = java.lang.Math.max(this.f8896t - i18, max);
        this.f8888i = max2;
        int i19 = this.f8891o;
        if (i19 == 3) {
            view.offsetTopAndBottom(this.f8887h);
        } else if (this.f8889m && i19 == 5) {
            view.offsetTopAndBottom(this.f8896t);
        } else if (i19 == 4) {
            view.offsetTopAndBottom(max2);
        } else if (i19 == 1 || i19 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        if (this.f8892p == null) {
            this.f8892p = new androidx.customview.widget.l(coordinatorLayout.getContext(), coordinatorLayout, this.F);
        }
        this.f8897u = new java.lang.ref.WeakReference(view);
        this.f8898v = new java.lang.ref.WeakReference(z(view));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, float f17, float f18) {
        return view2 == this.f8898v.get() && this.f8891o != 3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void k(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr) {
        if (view2 != ((android.view.View) this.f8898v.get())) {
            return;
        }
        int top = view.getTop();
        int i19 = top - i18;
        if (i18 > 0) {
            int i27 = this.f8887h;
            if (i19 < i27) {
                int i28 = top - i27;
                iArr[1] = i28;
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                view.offsetTopAndBottom(-i28);
                D(3);
            } else {
                iArr[1] = i18;
                java.util.WeakHashMap weakHashMap2 = n3.l1.f334362a;
                view.offsetTopAndBottom(-i18);
                D(1);
            }
        } else if (i18 < 0 && !view2.canScrollVertically(-1)) {
            int i29 = this.f8888i;
            if (i19 <= i29 || this.f8889m) {
                iArr[1] = i18;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f334362a;
                view.offsetTopAndBottom(-i18);
                D(1);
            } else {
                int i37 = top - i29;
                iArr[1] = i37;
                java.util.WeakHashMap weakHashMap4 = n3.l1.f334362a;
                view.offsetTopAndBottom(-i37);
                D(4);
            }
        }
        y(view.getTop());
        this.f8894r = i18;
        this.f8895s = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void r(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.os.Parcelable parcelable) {
        android.support.design.widget.MMBottomSheetBehavior.SavedState savedState = (android.support.design.widget.MMBottomSheetBehavior.SavedState) parcelable;
        android.os.Parcelable parcelable2 = savedState.f11112d;
        int i17 = savedState.f8903f;
        if (i17 == 1 || i17 == 2) {
            this.f8891o = 4;
        } else {
            this.f8891o = i17;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public android.os.Parcelable s(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view) {
        return new android.support.design.widget.MMBottomSheetBehavior.SavedState(android.view.View.BaseSavedState.EMPTY_STATE, this.f8891o);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean t(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        this.f8894r = 0;
        this.f8895s = false;
        return (i17 & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void v(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.View view2) {
        int i17;
        int i18 = 3;
        if (view.getTop() == this.f8887h) {
            D(3);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f8898v;
        if (weakReference != null && view2 == weakReference.get() && this.f8895s) {
            if (this.f8894r > 0) {
                i17 = this.f8887h;
            } else {
                if (this.f8889m) {
                    this.f8900x.computeCurrentVelocity(1000, this.f8883d);
                    if (E(view, this.f8900x.getYVelocity(this.f8901y))) {
                        i17 = this.f8896t;
                        i18 = 5;
                    }
                }
                if (this.f8894r == 0) {
                    int top = view.getTop();
                    if (java.lang.Math.abs(top - this.f8887h) < java.lang.Math.abs(top - this.f8888i)) {
                        i17 = this.f8887h;
                    } else {
                        i17 = this.f8888i;
                    }
                } else {
                    i17 = this.f8888i;
                }
                i18 = 4;
            }
            if (this.f8892p.u(view, view.getLeft(), i17)) {
                D(2);
                c.e eVar = new c.e(this, view, i18);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.u0.m(view, eVar);
            } else {
                D(i18);
            }
            this.f8895s = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean x(androidx.coordinatorlayout.widget.CoordinatorLayout coordinatorLayout, android.view.View view, android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        motionEvent.getRawX();
        motionEvent.getRawY();
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f8891o == 1 && actionMasked == 0) {
            return true;
        }
        androidx.customview.widget.l lVar = this.f8892p;
        if (lVar != null) {
            lVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f8901y = -1;
            android.view.VelocityTracker velocityTracker = this.f8900x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f8900x = null;
            }
        }
        if (this.f8900x == null) {
            this.f8900x = android.view.VelocityTracker.obtain();
        }
        this.f8900x.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f8893q) {
            float abs = java.lang.Math.abs(this.C - motionEvent.getY());
            androidx.customview.widget.l lVar2 = this.f8892p;
            if (abs > lVar2.f11121b) {
                lVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f8893q;
    }

    public void y(int i17) {
        c.c cVar;
        android.view.View view = (android.view.View) this.f8897u.get();
        if (view == null || (cVar = this.f8899w) == null) {
            return;
        }
        if (i17 > this.f8888i) {
            cVar.a(view, (r2 - i17) / (this.f8896t - r2));
        } else {
            cVar.a(view, (r2 - i17) / (r2 - this.f8887h));
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
        public static final android.os.Parcelable.Creator<android.support.design.widget.MMBottomSheetBehavior.SavedState> CREATOR = new android.support.design.widget.a();

        /* renamed from: f, reason: collision with root package name */
        public final int f8903f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8903f = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f11112d, i17);
            parcel.writeInt(this.f8903f);
        }

        public SavedState(android.os.Parcelable parcelable, int i17) {
            super(parcelable);
            this.f8903f = i17;
        }
    }

    public MMBottomSheetBehavior(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        this.f8891o = 4;
        this.E = false;
        this.F = new c.b(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f434115e);
        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null && (i17 = peekValue.data) == -1) {
            B(i17);
        } else {
            B(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f8889m = obtainStyledAttributes.getBoolean(1, false);
        this.f8890n = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f8883d = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

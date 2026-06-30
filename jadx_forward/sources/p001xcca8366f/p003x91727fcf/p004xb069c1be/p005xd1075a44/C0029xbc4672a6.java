package p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44;

/* renamed from: android.support.design.widget.MMBottomSheetBehavior */
/* loaded from: classes14.dex */
public class C0029xbc4672a6<V extends android.view.View> extends p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior<V> {
    public boolean A;
    public int B;
    public int C;
    public boolean D;
    public boolean E;
    public final p012xc85e97e9.p080xa1c8a596.p082xd1075a44.k F;
    public c.d G;

    /* renamed from: d, reason: collision with root package name */
    public final float f90416d;

    /* renamed from: e, reason: collision with root package name */
    public int f90417e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90418f;

    /* renamed from: g, reason: collision with root package name */
    public int f90419g;

    /* renamed from: h, reason: collision with root package name */
    public int f90420h;

    /* renamed from: i, reason: collision with root package name */
    public int f90421i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f90422m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f90423n;

    /* renamed from: o, reason: collision with root package name */
    public int f90424o;

    /* renamed from: p, reason: collision with root package name */
    public p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l f90425p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f90426q;

    /* renamed from: r, reason: collision with root package name */
    public int f90427r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f90428s;

    /* renamed from: t, reason: collision with root package name */
    public int f90429t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.ref.WeakReference f90430u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.ref.WeakReference f90431v;

    /* renamed from: w, reason: collision with root package name */
    public c.c f90432w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.VelocityTracker f90433x;

    /* renamed from: y, reason: collision with root package name */
    public int f90434y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f90435z;

    public C0029xbc4672a6() {
        this.f90424o = 4;
        this.E = false;
        this.F = new c.b(this);
    }

    public static p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 A(android.view.View view) {
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof p012xc85e97e9.p073xee01125a.p074xd1075a44.c)) {
            throw new java.lang.IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior behavior = ((p012xc85e97e9.p073xee01125a.p074xd1075a44.c) layoutParams).f92539a;
        if (behavior instanceof p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6) {
            return (p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6) behavior;
        }
        throw new java.lang.IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    public final void B(int i17) {
        java.lang.ref.WeakReference weakReference;
        android.view.View view;
        boolean z17 = true;
        if (i17 == -1) {
            if (!this.f90418f) {
                this.f90418f = true;
            }
            z17 = false;
        } else {
            if (this.f90418f || this.f90417e != i17) {
                this.f90418f = false;
                this.f90417e = java.lang.Math.max(0, i17);
                this.f90421i = this.f90429t - i17;
            }
            z17 = false;
        }
        if (!z17 || this.f90424o != 4 || (weakReference = this.f90430u) == null || (view = (android.view.View) weakReference.get()) == null) {
            return;
        }
        view.requestLayout();
    }

    public final void C(int i17) {
        if (i17 == this.f90424o) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f90430u;
        if (weakReference == null) {
            if (i17 == 4 || i17 == 3 || (this.f90422m && i17 == 5)) {
                this.f90424o = i17;
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
                view.post(new c.a(this, view, i17));
                return;
            }
        }
        F(view, i17);
    }

    public void D(int i17) {
        c.c cVar;
        if (this.f90424o == i17) {
            return;
        }
        this.f90424o = i17;
        android.view.View view = (android.view.View) this.f90430u.get();
        if (view == null || (cVar = this.f90432w) == null) {
            return;
        }
        cVar.b(view, i17);
    }

    public boolean E(android.view.View view, float f17) {
        if (this.f90423n) {
            return true;
        }
        return view.getTop() >= this.f90421i && java.lang.Math.abs((((float) view.getTop()) + (f17 * 0.1f)) - ((float) this.f90421i)) / ((float) this.f90417e) > 0.5f;
    }

    public void F(android.view.View view, int i17) {
        int i18;
        if (i17 == 4) {
            i18 = this.f90421i;
        } else if (i17 == 3) {
            i18 = this.f90420h;
        } else {
            if (!this.f90422m || i17 != 5) {
                throw new java.lang.IllegalArgumentException("Illegal state argument: " + i17);
            }
            i18 = this.f90429t;
        }
        if (!this.f90425p.u(view, view.getLeft(), i18)) {
            D(i17);
            return;
        }
        D(2);
        c.e eVar = new c.e(this, view, i17);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(view, eVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d5, code lost:
    
        if (r0 != 3) goto L94;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean e(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a r12, android.view.View r13, android.view.MotionEvent r14) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6.e(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        int i18;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        if (n3.u0.b(c1081xa22a3e5a) && !n3.u0.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int top = view.getTop();
        c1081xa22a3e5a.s(view, i17);
        this.f90429t = c1081xa22a3e5a.getHeight();
        if (this.f90418f) {
            if (this.f90419g == 0) {
                this.f90419g = c1081xa22a3e5a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561810ta);
            }
            i18 = java.lang.Math.max(this.f90419g, this.f90429t - ((c1081xa22a3e5a.getWidth() * 9) / 16));
        } else {
            i18 = this.f90417e;
        }
        int max = java.lang.Math.max(0, this.f90429t - view.getHeight());
        this.f90420h = max;
        int max2 = java.lang.Math.max(this.f90429t - i18, max);
        this.f90421i = max2;
        int i19 = this.f90424o;
        if (i19 == 3) {
            view.offsetTopAndBottom(this.f90420h);
        } else if (this.f90422m && i19 == 5) {
            view.offsetTopAndBottom(this.f90429t);
        } else if (i19 == 4) {
            view.offsetTopAndBottom(max2);
        } else if (i19 == 1 || i19 == 2) {
            view.offsetTopAndBottom(top - view.getTop());
        }
        if (this.f90425p == null) {
            this.f90425p = new p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l(c1081xa22a3e5a.getContext(), c1081xa22a3e5a, this.F);
        }
        this.f90430u = new java.lang.ref.WeakReference(view);
        this.f90431v = new java.lang.ref.WeakReference(z(view));
        return true;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean j(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, float f17, float f18) {
        return view2 == this.f90431v.get() && this.f90424o != 3;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void k(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr) {
        if (view2 != ((android.view.View) this.f90431v.get())) {
            return;
        }
        int top = view.getTop();
        int i19 = top - i18;
        if (i18 > 0) {
            int i27 = this.f90420h;
            if (i19 < i27) {
                int i28 = top - i27;
                iArr[1] = i28;
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                view.offsetTopAndBottom(-i28);
                D(3);
            } else {
                iArr[1] = i18;
                java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
                view.offsetTopAndBottom(-i18);
                D(1);
            }
        } else if (i18 < 0 && !view2.canScrollVertically(-1)) {
            int i29 = this.f90421i;
            if (i19 <= i29 || this.f90422m) {
                iArr[1] = i18;
                java.util.WeakHashMap weakHashMap3 = n3.l1.f415895a;
                view.offsetTopAndBottom(-i18);
                D(1);
            } else {
                int i37 = top - i29;
                iArr[1] = i37;
                java.util.WeakHashMap weakHashMap4 = n3.l1.f415895a;
                view.offsetTopAndBottom(-i37);
                D(4);
            }
        }
        y(view.getTop());
        this.f90427r = i18;
        this.f90428s = true;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void r(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.os.Parcelable parcelable) {
        p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6.SavedState savedState = (p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6.SavedState) parcelable;
        android.os.Parcelable parcelable2 = savedState.f92645d;
        int i17 = savedState.f90436f;
        if (i17 == 1 || i17 == 2) {
            this.f90424o = 4;
        } else {
            this.f90424o = i17;
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public android.os.Parcelable s(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view) {
        return new p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6.SavedState(android.view.View.BaseSavedState.EMPTY_STATE, this.f90424o);
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean t(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17) {
        this.f90427r = 0;
        this.f90428s = false;
        return (i17 & 2) != 0;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void v(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2) {
        int i17;
        int i18 = 3;
        if (view.getTop() == this.f90420h) {
            D(3);
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f90431v;
        if (weakReference != null && view2 == weakReference.get() && this.f90428s) {
            if (this.f90427r > 0) {
                i17 = this.f90420h;
            } else {
                if (this.f90422m) {
                    this.f90433x.computeCurrentVelocity(1000, this.f90416d);
                    if (E(view, this.f90433x.getYVelocity(this.f90434y))) {
                        i17 = this.f90429t;
                        i18 = 5;
                    }
                }
                if (this.f90427r == 0) {
                    int top = view.getTop();
                    if (java.lang.Math.abs(top - this.f90420h) < java.lang.Math.abs(top - this.f90421i)) {
                        i17 = this.f90420h;
                    } else {
                        i17 = this.f90421i;
                    }
                } else {
                    i17 = this.f90421i;
                }
                i18 = 4;
            }
            if (this.f90425p.u(view, view.getLeft(), i17)) {
                D(2);
                c.e eVar = new c.e(this, view, i18);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.u0.m(view, eVar);
            } else {
                D(i18);
            }
            this.f90428s = false;
        }
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        motionEvent.getX();
        motionEvent.getY();
        motionEvent.getRawX();
        motionEvent.getRawY();
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f90424o == 1 && actionMasked == 0) {
            return true;
        }
        p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar = this.f90425p;
        if (lVar != null) {
            lVar.m(motionEvent);
        }
        if (actionMasked == 0) {
            this.f90434y = -1;
            android.view.VelocityTracker velocityTracker = this.f90433x;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f90433x = null;
            }
        }
        if (this.f90433x == null) {
            this.f90433x = android.view.VelocityTracker.obtain();
        }
        this.f90433x.addMovement(motionEvent);
        if (actionMasked == 2 && !this.f90426q) {
            float abs = java.lang.Math.abs(this.C - motionEvent.getY());
            p012xc85e97e9.p080xa1c8a596.p082xd1075a44.l lVar2 = this.f90425p;
            if (abs > lVar2.f92654b) {
                lVar2.c(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.f90426q;
    }

    public void y(int i17) {
        c.c cVar;
        android.view.View view = (android.view.View) this.f90430u.get();
        if (view == null || (cVar = this.f90432w) == null) {
            return;
        }
        if (i17 > this.f90421i) {
            cVar.a(view, (r2 - i17) / (this.f90429t - r2));
        } else {
            cVar.a(view, (r2 - i17) / (r2 - this.f90420h));
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

    /* renamed from: android.support.design.widget.MMBottomSheetBehavior$SavedState */
    /* loaded from: classes14.dex */
    public static class SavedState extends p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6.SavedState> f62x681a0c0c = new p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.a();

        /* renamed from: f, reason: collision with root package name */
        public final int f90436f;

        public SavedState(android.os.Parcel parcel, java.lang.ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f90436f = parcel.readInt();
        }

        @Override // p012xc85e97e9.p080xa1c8a596.p081x373aa5.AbstractC1096x35cc803c, android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeParcelable(this.f92645d, i17);
            parcel.writeInt(this.f90436f);
        }

        public SavedState(android.os.Parcelable parcelable, int i17) {
            super(parcelable);
            this.f90436f = i17;
        }
    }

    public C0029xbc4672a6(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        int i17;
        this.f90424o = 4;
        this.E = false;
        this.F = new c.b(this);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v9.a.f515648e);
        android.util.TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null && (i17 = peekValue.data) == -1) {
            B(i17);
        } else {
            B(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f90422m = obtainStyledAttributes.getBoolean(1, false);
        this.f90423n = obtainStyledAttributes.getBoolean(3, false);
        obtainStyledAttributes.recycle();
        this.f90416d = android.view.ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

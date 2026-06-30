package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout */
/* loaded from: classes15.dex */
public class C0074x22961cbd extends android.view.ViewGroup implements p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0, n3.i0 {
    public static final int[] H = {com.p314xaae8f345.mm.R.C30857x2dd9f1.f559595m, android.R.attr.windowContentOverlay};
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h A;
    public android.widget.OverScroller B;
    public android.view.ViewPropertyAnimator C;
    public final android.animation.AnimatorListenerAdapter D;
    public final java.lang.Runnable E;
    public final java.lang.Runnable F;
    public final n3.j0 G;

    /* renamed from: d, reason: collision with root package name */
    public int f90848d;

    /* renamed from: e, reason: collision with root package name */
    public int f90849e;

    /* renamed from: f, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de f90850f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 f90851g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 f90852h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f90853i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f90854m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f90855n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f90856o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f90857p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f90858q;

    /* renamed from: r, reason: collision with root package name */
    public int f90859r;

    /* renamed from: s, reason: collision with root package name */
    public int f90860s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Rect f90861t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f90862u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f90863v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f90864w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f90865x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Rect f90866y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f90867z;

    /* renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams */
    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public C0074x22961cbd(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90849e = 0;
        this.f90861t = new android.graphics.Rect();
        this.f90862u = new android.graphics.Rect();
        this.f90863v = new android.graphics.Rect();
        this.f90864w = new android.graphics.Rect();
        this.f90865x = new android.graphics.Rect();
        this.f90866y = new android.graphics.Rect();
        this.f90867z = new android.graphics.Rect();
        this.D = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e(this);
        this.E = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f(this);
        this.F = new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.g(this);
        c(context);
        this.G = new n3.j0(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.View r3, android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    public void b() {
        removeCallbacks(this.E);
        removeCallbacks(this.F);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.C;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(android.content.Context context) {
        android.content.res.TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(H);
        this.f90848d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f90853i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f90854m = context.getApplicationInfo().targetSdkVersion < 19;
        this.B = new android.widget.OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams;
    }

    public void d(int i17) {
        e();
        if (i17 == 2) {
            this.f90852h.getClass();
        } else if (i17 == 5) {
            this.f90852h.getClass();
        } else {
            if (i17 != 109) {
                return;
            }
            m2617x57fa0451(true);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.f90853i == null || this.f90854m) {
            return;
        }
        int bottom = this.f90851g.getVisibility() == 0 ? (int) (this.f90851g.getBottom() + this.f90851g.getTranslationY() + 0.5f) : 0;
        this.f90853i.setBounds(0, bottom, getWidth(), this.f90853i.getIntrinsicHeight() + bottom);
        this.f90853i.draw(canvas);
    }

    public void e() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0 m2829x9ce6c05d;
        if (this.f90850f == null) {
            this.f90850f = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0094x735be4de) findViewById(com.p314xaae8f345.mm.R.id.f563966eg);
            this.f90851g = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324) findViewById(com.p314xaae8f345.mm.R.id.f563968ei);
            android.view.KeyEvent.Callback findViewById = findViewById(com.p314xaae8f345.mm.R.id.f563965ef);
            if (findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0) {
                m2829x9ce6c05d = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.x0) findViewById;
            } else {
                if (!(findViewById instanceof p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b)) {
                    throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                m2829x9ce6c05d = ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0102x1f44235b) findViewById).m2829x9ce6c05d();
            }
            this.f90852h = m2829x9ce6c05d;
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        e();
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.g(this);
        boolean a17 = a(this.f90851g, rect, true, true, false, true);
        android.graphics.Rect rect2 = this.f90864w;
        rect2.set(rect);
        java.lang.reflect.Method method = p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h3.f91137a;
        android.graphics.Rect rect3 = this.f90861t;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (java.lang.Exception unused) {
            }
        }
        android.graphics.Rect rect4 = this.f90865x;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            a17 = true;
        }
        android.graphics.Rect rect5 = this.f90862u;
        if (!rect5.equals(rect3)) {
            rect5.set(rect3);
            a17 = true;
        }
        if (a17) {
            requestLayout();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams(getContext(), attributeSet);
    }

    /* renamed from: getActionBarHideOffset */
    public int m2608x9975271c() {
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0072x2565c324 c0072x2565c324 = this.f90851g;
        if (c0072x2565c324 != null) {
            return -((int) c0072x2565c324.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.G;
        return j0Var.f415879b | j0Var.f415878a;
    }

    /* renamed from: getTitle */
    public java.lang.CharSequence m2609x7531c8a2() {
        e();
        return ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90852h).f91280a.m2824x7531c8a2();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.y0.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        getPaddingRight();
        int paddingTop = getPaddingTop();
        getPaddingBottom();
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            if (childAt.getVisibility() != 8) {
                p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i29 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i37 = ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i29, i37, measuredWidth + i29, measuredHeight + i37);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        int measuredHeight;
        e();
        measureChildWithMargins(this.f90851g, i17, 0, i18, 0);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams layoutParams = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams) this.f90851g.getLayoutParams();
        int max = java.lang.Math.max(0, this.f90851g.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = java.lang.Math.max(0, this.f90851g.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, this.f90851g.getMeasuredState());
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = (n3.u0.g(this) & 256) != 0;
        if (z17) {
            measuredHeight = this.f90848d;
            if (this.f90856o && this.f90851g.m2592x2b29f6e2() != null) {
                measuredHeight += this.f90848d;
            }
        } else {
            measuredHeight = this.f90851g.getVisibility() != 8 ? this.f90851g.getMeasuredHeight() : 0;
        }
        android.graphics.Rect rect = this.f90861t;
        android.graphics.Rect rect2 = this.f90863v;
        rect2.set(rect);
        android.graphics.Rect rect3 = this.f90864w;
        android.graphics.Rect rect4 = this.f90866y;
        rect4.set(rect3);
        if (this.f90855n || z17) {
            rect4.top += measuredHeight;
            rect4.bottom += 0;
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        a(this.f90850f, this.f90863v, true, true, true, true);
        android.graphics.Rect rect5 = this.f90867z;
        if (!rect5.equals(rect4)) {
            rect5.set(rect4);
            this.f90850f.a(rect4);
        }
        measureChildWithMargins(this.f90850f, i17, 0, i18, 0);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams layoutParams2 = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams) this.f90850f.getLayoutParams();
        int max3 = java.lang.Math.max(max, this.f90850f.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = java.lang.Math.max(max2, this.f90850f.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.f90850f.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i17, combineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i18, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f17, float f18, boolean z17) {
        if (!this.f90857p || !z17) {
            return false;
        }
        this.B.fling(0, 0, 0, (int) f18, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.B.getFinalY() > this.f90851g.getHeight()) {
            b();
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.g) this.F).run();
        } else {
            b();
            ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.f) this.E).run();
        }
        this.f90858q = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f17, float f18) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i17, int i18, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
        int i28 = this.f90859r + i18;
        this.f90859r = i28;
        m2610xe7b9e690(i28);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i17) {
        this.G.a(view, view2, i17, 0);
        this.f90859r = m2608x9975271c();
        b();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h hVar = this.A;
        if (hVar != null) {
            hVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i17) {
        if ((i17 & 2) == 0 || this.f90851g.getVisibility() != 0) {
            return false;
        }
        return this.f90857p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        if (this.f90857p && !this.f90858q) {
            if (this.f90859r <= this.f90851g.getHeight()) {
                b();
                postDelayed(this.E, 600L);
            } else {
                b();
                postDelayed(this.F, 600L);
            }
        }
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h hVar = this.A;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i17) {
        super.onWindowSystemUiVisibilityChanged(i17);
        e();
        int i18 = this.f90860s ^ i17;
        this.f90860s = i17;
        boolean z17 = (i17 & 4) == 0;
        boolean z18 = (i17 & 256) != 0;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h hVar = this.A;
        if (hVar != null) {
            hVar.f(!z18);
            if (z17 || !z18) {
                this.A.a();
            } else {
                this.A.c();
            }
        }
        if ((i18 & 256) == 0 || this.A == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.y0.c(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        this.f90849e = i17;
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h hVar = this.A;
        if (hVar != null) {
            hVar.e(i17);
        }
    }

    /* renamed from: setActionBarHideOffset */
    public void m2610xe7b9e690(int i17) {
        b();
        this.f90851g.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i17, this.f90851g.getHeight())));
    }

    /* renamed from: setActionBarVisibilityCallback */
    public void m2611x7b5a9c92(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.h hVar) {
        this.A = hVar;
        if (getWindowToken() != null) {
            this.A.e(this.f90849e);
            int i17 = this.f90860s;
            if (i17 != 0) {
                onWindowSystemUiVisibilityChanged(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                n3.y0.c(this);
            }
        }
    }

    /* renamed from: setHasNonEmbeddedTabs */
    public void m2612xa246e29d(boolean z17) {
        this.f90856o = z17;
    }

    /* renamed from: setHideOnContentScrollEnabled */
    public void m2613x986bde1e(boolean z17) {
        if (z17 != this.f90857p) {
            this.f90857p = z17;
            if (z17) {
                return;
            }
            b();
            m2610xe7b9e690(0);
        }
    }

    /* renamed from: setIcon */
    public void m2614x764b6bfb(int i17) {
        e();
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90852h).e(i17);
    }

    /* renamed from: setLogo */
    public void m2616x764cf52d(int i17) {
        e();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90852h;
        z2Var.f91285f = i17 != 0 ? k.a.a(z2Var.a(), i17) : null;
        z2Var.h();
    }

    /* renamed from: setOverlayMode */
    public void m2617x57fa0451(boolean z17) {
        this.f90855n = z17;
        this.f90854m = z17 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    /* renamed from: setShowingForActionMode */
    public void m2618x3f7b065f(boolean z17) {
    }

    /* renamed from: setUiOptions */
    public void m2619xd3227328(int i17) {
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0
    /* renamed from: setWindowCallback */
    public void mo2620xd14da557(android.view.Window.Callback callback) {
        e();
        ((p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90852h).f91291l = callback;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.p019xd1075a44.w0
    /* renamed from: setWindowTitle */
    public void mo2621xe1bd0686(java.lang.CharSequence charSequence) {
        e();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90852h;
        if (z2Var.f91287h) {
            return;
        }
        z2Var.f91288i = charSequence;
        if ((z2Var.f91281b & 8) != 0) {
            z2Var.f91280a.mo2849x53bfe316(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0074x22961cbd.LayoutParams(layoutParams);
    }

    /* renamed from: setIcon */
    public void m2615x764b6bfb(android.graphics.drawable.Drawable drawable) {
        e();
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2 z2Var = (p012xc85e97e9.p016x746ad0e3.p019xd1075a44.z2) this.f90852h;
        z2Var.f91284e = drawable;
        z2Var.h();
    }
}

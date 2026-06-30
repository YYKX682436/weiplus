package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class ActionBarOverlayLayout extends android.view.ViewGroup implements androidx.appcompat.widget.w0, n3.i0 {
    public static final int[] H = {com.tencent.mm.R.attr.f478062m, android.R.attr.windowContentOverlay};
    public androidx.appcompat.widget.h A;
    public android.widget.OverScroller B;
    public android.view.ViewPropertyAnimator C;
    public final android.animation.AnimatorListenerAdapter D;
    public final java.lang.Runnable E;
    public final java.lang.Runnable F;
    public final n3.j0 G;

    /* renamed from: d, reason: collision with root package name */
    public int f9315d;

    /* renamed from: e, reason: collision with root package name */
    public int f9316e;

    /* renamed from: f, reason: collision with root package name */
    public androidx.appcompat.widget.ContentFrameLayout f9317f;

    /* renamed from: g, reason: collision with root package name */
    public androidx.appcompat.widget.ActionBarContainer f9318g;

    /* renamed from: h, reason: collision with root package name */
    public androidx.appcompat.widget.x0 f9319h;

    /* renamed from: i, reason: collision with root package name */
    public android.graphics.drawable.Drawable f9320i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9321m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f9322n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f9323o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9324p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f9325q;

    /* renamed from: r, reason: collision with root package name */
    public int f9326r;

    /* renamed from: s, reason: collision with root package name */
    public int f9327s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Rect f9328t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Rect f9329u;

    /* renamed from: v, reason: collision with root package name */
    public final android.graphics.Rect f9330v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f9331w;

    /* renamed from: x, reason: collision with root package name */
    public final android.graphics.Rect f9332x;

    /* renamed from: y, reason: collision with root package name */
    public final android.graphics.Rect f9333y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f9334z;

    /* loaded from: classes15.dex */
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams {
        public LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public ActionBarOverlayLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9316e = 0;
        this.f9328t = new android.graphics.Rect();
        this.f9329u = new android.graphics.Rect();
        this.f9330v = new android.graphics.Rect();
        this.f9331w = new android.graphics.Rect();
        this.f9332x = new android.graphics.Rect();
        this.f9333y = new android.graphics.Rect();
        this.f9334z = new android.graphics.Rect();
        this.D = new androidx.appcompat.widget.e(this);
        this.E = new androidx.appcompat.widget.f(this);
        this.F = new androidx.appcompat.widget.g(this);
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
            androidx.appcompat.widget.ActionBarOverlayLayout$LayoutParams r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.a(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
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
        this.f9315d = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        android.graphics.drawable.Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f9320i = drawable;
        setWillNotDraw(drawable == null);
        obtainStyledAttributes.recycle();
        this.f9321m = context.getApplicationInfo().targetSdkVersion < 19;
        this.B = new android.widget.OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams;
    }

    public void d(int i17) {
        e();
        if (i17 == 2) {
            this.f9319h.getClass();
        } else if (i17 == 5) {
            this.f9319h.getClass();
        } else {
            if (i17 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
        if (this.f9320i == null || this.f9321m) {
            return;
        }
        int bottom = this.f9318g.getVisibility() == 0 ? (int) (this.f9318g.getBottom() + this.f9318g.getTranslationY() + 0.5f) : 0;
        this.f9320i.setBounds(0, bottom, getWidth(), this.f9320i.getIntrinsicHeight() + bottom);
        this.f9320i.draw(canvas);
    }

    public void e() {
        androidx.appcompat.widget.x0 wrapper;
        if (this.f9317f == null) {
            this.f9317f = (androidx.appcompat.widget.ContentFrameLayout) findViewById(com.tencent.mm.R.id.f482433eg);
            this.f9318g = (androidx.appcompat.widget.ActionBarContainer) findViewById(com.tencent.mm.R.id.f482435ei);
            android.view.KeyEvent.Callback findViewById = findViewById(com.tencent.mm.R.id.f482432ef);
            if (findViewById instanceof androidx.appcompat.widget.x0) {
                wrapper = (androidx.appcompat.widget.x0) findViewById;
            } else {
                if (!(findViewById instanceof androidx.appcompat.widget.Toolbar)) {
                    throw new java.lang.IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
                }
                wrapper = ((androidx.appcompat.widget.Toolbar) findViewById).getWrapper();
            }
            this.f9319h = wrapper;
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(android.graphics.Rect rect) {
        e();
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.u0.g(this);
        boolean a17 = a(this.f9318g, rect, true, true, false, true);
        android.graphics.Rect rect2 = this.f9331w;
        rect2.set(rect);
        java.lang.reflect.Method method = androidx.appcompat.widget.h3.f9604a;
        android.graphics.Rect rect3 = this.f9328t;
        if (method != null) {
            try {
                method.invoke(this, rect2, rect3);
            } catch (java.lang.Exception unused) {
            }
        }
        android.graphics.Rect rect4 = this.f9332x;
        if (!rect4.equals(rect2)) {
            rect4.set(rect2);
            a17 = true;
        }
        android.graphics.Rect rect5 = this.f9329u;
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
        return new androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.util.AttributeSet attributeSet) {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        androidx.appcompat.widget.ActionBarContainer actionBarContainer = this.f9318g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.G;
        return j0Var.f334346b | j0Var.f334345a;
    }

    public java.lang.CharSequence getTitle() {
        e();
        return ((androidx.appcompat.widget.z2) this.f9319h).f9747a.getTitle();
    }

    @Override // android.view.View
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
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
                androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) childAt.getLayoutParams();
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
        measureChildWithMargins(this.f9318g, i17, 0, i18, 0);
        androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) this.f9318g.getLayoutParams();
        int max = java.lang.Math.max(0, this.f9318g.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int max2 = java.lang.Math.max(0, this.f9318g.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int combineMeasuredStates = android.view.View.combineMeasuredStates(0, this.f9318g.getMeasuredState());
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        boolean z17 = (n3.u0.g(this) & 256) != 0;
        if (z17) {
            measuredHeight = this.f9315d;
            if (this.f9323o && this.f9318g.getTabContainer() != null) {
                measuredHeight += this.f9315d;
            }
        } else {
            measuredHeight = this.f9318g.getVisibility() != 8 ? this.f9318g.getMeasuredHeight() : 0;
        }
        android.graphics.Rect rect = this.f9328t;
        android.graphics.Rect rect2 = this.f9330v;
        rect2.set(rect);
        android.graphics.Rect rect3 = this.f9331w;
        android.graphics.Rect rect4 = this.f9333y;
        rect4.set(rect3);
        if (this.f9322n || z17) {
            rect4.top += measuredHeight;
            rect4.bottom += 0;
        } else {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
        }
        a(this.f9317f, this.f9330v, true, true, true, true);
        android.graphics.Rect rect5 = this.f9334z;
        if (!rect5.equals(rect4)) {
            rect5.set(rect4);
            this.f9317f.a(rect4);
        }
        measureChildWithMargins(this.f9317f, i17, 0, i18, 0);
        androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams layoutParams2 = (androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams) this.f9317f.getLayoutParams();
        int max3 = java.lang.Math.max(max, this.f9317f.getMeasuredWidth() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int max4 = java.lang.Math.max(max2, this.f9317f.getMeasuredHeight() + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int combineMeasuredStates2 = android.view.View.combineMeasuredStates(combineMeasuredStates, this.f9317f.getMeasuredState());
        setMeasuredDimension(android.view.View.resolveSizeAndState(java.lang.Math.max(max3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i17, combineMeasuredStates2), android.view.View.resolveSizeAndState(java.lang.Math.max(max4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i18, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f17, float f18, boolean z17) {
        if (!this.f9324p || !z17) {
            return false;
        }
        this.B.fling(0, 0, 0, (int) f18, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.B.getFinalY() > this.f9318g.getHeight()) {
            b();
            ((androidx.appcompat.widget.g) this.F).run();
        } else {
            b();
            ((androidx.appcompat.widget.f) this.E).run();
        }
        this.f9325q = true;
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
        int i28 = this.f9326r + i18;
        this.f9326r = i28;
        setActionBarHideOffset(i28);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i17) {
        this.G.a(view, view2, i17, 0);
        this.f9326r = getActionBarHideOffset();
        b();
        androidx.appcompat.widget.h hVar = this.A;
        if (hVar != null) {
            hVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i17) {
        if ((i17 & 2) == 0 || this.f9318g.getVisibility() != 0) {
            return false;
        }
        return this.f9324p;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        if (this.f9324p && !this.f9325q) {
            if (this.f9326r <= this.f9318g.getHeight()) {
                b();
                postDelayed(this.E, 600L);
            } else {
                b();
                postDelayed(this.F, 600L);
            }
        }
        androidx.appcompat.widget.h hVar = this.A;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i17) {
        super.onWindowSystemUiVisibilityChanged(i17);
        e();
        int i18 = this.f9327s ^ i17;
        this.f9327s = i17;
        boolean z17 = (i17 & 4) == 0;
        boolean z18 = (i17 & 256) != 0;
        androidx.appcompat.widget.h hVar = this.A;
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
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        n3.y0.c(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i17) {
        super.onWindowVisibilityChanged(i17);
        this.f9316e = i17;
        androidx.appcompat.widget.h hVar = this.A;
        if (hVar != null) {
            hVar.e(i17);
        }
    }

    public void setActionBarHideOffset(int i17) {
        b();
        this.f9318g.setTranslationY(-java.lang.Math.max(0, java.lang.Math.min(i17, this.f9318g.getHeight())));
    }

    public void setActionBarVisibilityCallback(androidx.appcompat.widget.h hVar) {
        this.A = hVar;
        if (getWindowToken() != null) {
            this.A.e(this.f9316e);
            int i17 = this.f9327s;
            if (i17 != 0) {
                onWindowSystemUiVisibilityChanged(i17);
                java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
                n3.y0.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z17) {
        this.f9323o = z17;
    }

    public void setHideOnContentScrollEnabled(boolean z17) {
        if (z17 != this.f9324p) {
            this.f9324p = z17;
            if (z17) {
                return;
            }
            b();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i17) {
        e();
        ((androidx.appcompat.widget.z2) this.f9319h).e(i17);
    }

    public void setLogo(int i17) {
        e();
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9319h;
        z2Var.f9752f = i17 != 0 ? k.a.a(z2Var.a(), i17) : null;
        z2Var.h();
    }

    public void setOverlayMode(boolean z17) {
        this.f9322n = z17;
        this.f9321m = z17 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z17) {
    }

    public void setUiOptions(int i17) {
    }

    @Override // androidx.appcompat.widget.w0
    public void setWindowCallback(android.view.Window.Callback callback) {
        e();
        ((androidx.appcompat.widget.z2) this.f9319h).f9758l = callback;
    }

    @Override // androidx.appcompat.widget.w0
    public void setWindowTitle(java.lang.CharSequence charSequence) {
        e();
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9319h;
        if (z2Var.f9754h) {
            return;
        }
        z2Var.f9755i = charSequence;
        if ((z2Var.f9748b & 8) != 0) {
            z2Var.f9747a.setTitle(charSequence);
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new androidx.appcompat.widget.ActionBarOverlayLayout.LayoutParams(layoutParams);
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        e();
        androidx.appcompat.widget.z2 z2Var = (androidx.appcompat.widget.z2) this.f9319h;
        z2Var.f9751e = drawable;
        z2Var.h();
    }
}

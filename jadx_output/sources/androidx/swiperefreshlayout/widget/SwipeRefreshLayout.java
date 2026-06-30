package androidx.swiperefreshlayout.widget;

/* loaded from: classes15.dex */
public class SwipeRefreshLayout extends android.view.ViewGroup implements n3.i0, n3.e0 {
    public static final int[] N = {android.R.attr.enabled};
    public final int A;
    public final int B;
    public int C;
    public s4.e D;
    public android.view.animation.Animation E;
    public android.view.animation.Animation F;
    public android.view.animation.Animation G;
    public android.view.animation.Animation H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public int f12353J;
    public final android.view.animation.Animation.AnimationListener K;
    public final android.view.animation.Animation L;
    public final android.view.animation.Animation M;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f12354d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f12355e;

    /* renamed from: f, reason: collision with root package name */
    public final int f12356f;

    /* renamed from: g, reason: collision with root package name */
    public float f12357g;

    /* renamed from: h, reason: collision with root package name */
    public float f12358h;

    /* renamed from: i, reason: collision with root package name */
    public final n3.j0 f12359i;

    /* renamed from: m, reason: collision with root package name */
    public final n3.f0 f12360m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f12361n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f12362o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f12363p;

    /* renamed from: q, reason: collision with root package name */
    public final int f12364q;

    /* renamed from: r, reason: collision with root package name */
    public int f12365r;

    /* renamed from: s, reason: collision with root package name */
    public float f12366s;

    /* renamed from: t, reason: collision with root package name */
    public float f12367t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f12368u;

    /* renamed from: v, reason: collision with root package name */
    public int f12369v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f12370w;

    /* renamed from: x, reason: collision with root package name */
    public s4.a f12371x;

    /* renamed from: y, reason: collision with root package name */
    public int f12372y;

    /* renamed from: z, reason: collision with root package name */
    public int f12373z;

    public SwipeRefreshLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12355e = false;
        this.f12357g = -1.0f;
        this.f12361n = new int[2];
        this.f12362o = new int[2];
        this.f12369v = -1;
        this.f12372y = -1;
        this.K = new s4.f(this);
        this.L = new s4.k(this);
        this.M = new s4.l(this);
        this.f12356f = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f12364q = getResources().getInteger(android.R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f12370w = new android.view.animation.DecelerateInterpolator(2.0f);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f12353J = (int) (displayMetrics.density * 40.0f);
        this.f12371x = new s4.a(getContext(), -328966);
        s4.e eVar = new s4.e(getContext());
        this.D = eVar;
        eVar.c(1);
        this.f12371x.setImageDrawable(this.D);
        this.f12371x.setVisibility(8);
        addView(this.f12371x);
        setChildrenDrawingOrderEnabled(true);
        int i17 = (int) (displayMetrics.density * 64.0f);
        this.B = i17;
        this.f12357g = i17;
        this.f12359i = new n3.j0(this);
        this.f12360m = new n3.f0(this);
        setNestedScrollingEnabled(true);
        int i18 = -this.f12353J;
        this.f12365r = i18;
        this.A = i18;
        e(1.0f);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    private void setColorViewAlpha(int i17) {
        this.f12371x.getBackground().setAlpha(i17);
        this.D.setAlpha(i17);
    }

    public boolean a() {
        android.view.View view = this.f12354d;
        return view instanceof android.widget.ListView ? androidx.core.widget.l.a((android.widget.ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f12354d == null) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (!childAt.equals(this.f12371x)) {
                    this.f12354d = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f17) {
        if (f17 > this.f12357g) {
            g(true, true);
            return;
        }
        this.f12355e = false;
        s4.e eVar = this.D;
        s4.d dVar = eVar.f402875d;
        dVar.f402855e = 0.0f;
        dVar.f402856f = 0.0f;
        eVar.invalidateSelf();
        s4.j jVar = new s4.j(this);
        this.f12373z = this.f12365r;
        android.view.animation.Animation animation = this.M;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.f12370w);
        s4.a aVar = this.f12371x;
        aVar.f402846d = jVar;
        aVar.clearAnimation();
        this.f12371x.startAnimation(animation);
        s4.e eVar2 = this.D;
        s4.d dVar2 = eVar2.f402875d;
        if (dVar2.f402864n) {
            dVar2.f402864n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void d(float f17) {
        s4.e eVar = this.D;
        s4.d dVar = eVar.f402875d;
        if (!dVar.f402864n) {
            dVar.f402864n = true;
        }
        eVar.invalidateSelf();
        float min = java.lang.Math.min(1.0f, java.lang.Math.abs(f17 / this.f12357g));
        float max = (((float) java.lang.Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = java.lang.Math.abs(f17) - this.f12357g;
        int i17 = this.C;
        if (i17 <= 0) {
            i17 = this.B;
        }
        float f18 = i17;
        double max2 = java.lang.Math.max(0.0f, java.lang.Math.min(abs, f18 * 2.0f) / f18) / 4.0f;
        float pow = ((float) (max2 - java.lang.Math.pow(max2, 2.0d))) * 2.0f;
        int i18 = this.A + ((int) ((f18 * min) + (f18 * pow * 2.0f)));
        if (this.f12371x.getVisibility() != 0) {
            this.f12371x.setVisibility(0);
        }
        this.f12371x.setScaleX(1.0f);
        this.f12371x.setScaleY(1.0f);
        if (f17 < this.f12357g) {
            if (this.D.f402875d.f402870t > 76) {
                android.view.animation.Animation animation = this.G;
                if (!((animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true)) {
                    s4.i iVar = new s4.i(this, this.D.f402875d.f402870t, 76);
                    iVar.setDuration(300L);
                    s4.a aVar = this.f12371x;
                    aVar.f402846d = null;
                    aVar.clearAnimation();
                    this.f12371x.startAnimation(iVar);
                    this.G = iVar;
                }
            }
        } else if (this.D.f402875d.f402870t < 255) {
            android.view.animation.Animation animation2 = this.H;
            if (!((animation2 == null || !animation2.hasStarted() || animation2.hasEnded()) ? false : true)) {
                s4.i iVar2 = new s4.i(this, this.D.f402875d.f402870t, 255);
                iVar2.setDuration(300L);
                s4.a aVar2 = this.f12371x;
                aVar2.f402846d = null;
                aVar2.clearAnimation();
                this.f12371x.startAnimation(iVar2);
                this.H = iVar2;
            }
        }
        s4.e eVar2 = this.D;
        float min2 = java.lang.Math.min(0.8f, max * 0.8f);
        s4.d dVar2 = eVar2.f402875d;
        dVar2.f402855e = 0.0f;
        dVar2.f402856f = min2;
        eVar2.invalidateSelf();
        s4.e eVar3 = this.D;
        float min3 = java.lang.Math.min(1.0f, max);
        s4.d dVar3 = eVar3.f402875d;
        if (min3 != dVar3.f402866p) {
            dVar3.f402866p = min3;
        }
        eVar3.invalidateSelf();
        s4.e eVar4 = this.D;
        eVar4.f402875d.f402857g = (((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f;
        eVar4.invalidateSelf();
        setTargetOffsetTopAndBottom(i18 - this.f12365r);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f12360m.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f12360m.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.f12360m.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.f12360m.e(i17, i18, i19, i27, iArr);
    }

    public void e(float f17) {
        setTargetOffsetTopAndBottom((this.f12373z + ((int) ((this.A - r0) * f17))) - this.f12371x.getTop());
    }

    public void f() {
        this.f12371x.clearAnimation();
        this.D.stop();
        this.f12371x.setVisibility(8);
        setColorViewAlpha(255);
        setTargetOffsetTopAndBottom(this.A - this.f12365r);
        this.f12365r = this.f12371x.getTop();
    }

    public final void g(boolean z17, boolean z18) {
        if (this.f12355e != z17) {
            this.I = z18;
            b();
            this.f12355e = z17;
            android.view.animation.Animation.AnimationListener animationListener = this.K;
            if (!z17) {
                s4.h hVar = new s4.h(this);
                this.F = hVar;
                hVar.setDuration(150L);
                s4.a aVar = this.f12371x;
                aVar.f402846d = animationListener;
                aVar.clearAnimation();
                this.f12371x.startAnimation(this.F);
                return;
            }
            this.f12373z = this.f12365r;
            android.view.animation.Animation animation = this.L;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f12370w);
            if (animationListener != null) {
                this.f12371x.f402846d = animationListener;
            }
            this.f12371x.clearAnimation();
            this.f12371x.startAnimation(animation);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        int i19 = this.f12372y;
        return i19 < 0 ? i18 : i18 == i17 + (-1) ? i19 : i18 >= i19 ? i18 + 1 : i18;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.f12359i;
        return j0Var.f334346b | j0Var.f334345a;
    }

    public int getProgressCircleDiameter() {
        return this.f12353J;
    }

    public int getProgressViewEndOffset() {
        return this.B;
    }

    public int getProgressViewStartOffset() {
        return this.A;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f12360m.h(0);
    }

    public final void i(float f17) {
        float f18 = this.f12367t;
        float f19 = f17 - f18;
        int i17 = this.f12356f;
        if (f19 <= i17 || this.f12368u) {
            return;
        }
        this.f12366s = f18 + i17;
        this.f12368u = true;
        this.D.setAlpha(76);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f12360m.f334334d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int findPointerIndex;
        b();
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f12355e || this.f12363p) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i17 = this.f12369v;
                    if (i17 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i17)) < 0) {
                        return false;
                    }
                    i(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f12369v) {
                            this.f12369v = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.f12368u = false;
            this.f12369v = -1;
        } else {
            setTargetOffsetTopAndBottom(this.A - this.f12371x.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f12369v = pointerId;
            this.f12368u = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f12367t = motionEvent.getY(findPointerIndex2);
        }
        return this.f12368u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f12354d == null) {
            b();
        }
        android.view.View view = this.f12354d;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f12371x.getMeasuredWidth();
        int measuredHeight2 = this.f12371x.getMeasuredHeight();
        int i28 = measuredWidth / 2;
        int i29 = measuredWidth2 / 2;
        int i37 = this.f12365r;
        this.f12371x.layout(i28 - i29, i37, i28 + i29, measuredHeight2 + i37);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f12354d == null) {
            b();
        }
        android.view.View view = this.f12354d;
        if (view == null) {
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f12371x.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f12353J, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f12353J, 1073741824));
        this.f12372y = -1;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            if (getChildAt(i19) == this.f12371x) {
                this.f12372y = i19;
                return;
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(android.view.View view, float f17, float f18, boolean z17) {
        return dispatchNestedFling(f17, f18, z17);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(android.view.View view, float f17, float f18) {
        return dispatchNestedPreFling(f17, f18);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(android.view.View view, int i17, int i18, int[] iArr) {
        if (i18 > 0) {
            float f17 = this.f12358h;
            if (f17 > 0.0f) {
                float f18 = i18;
                if (f18 > f17) {
                    iArr[1] = i18 - ((int) f17);
                    this.f12358h = 0.0f;
                } else {
                    this.f12358h = f17 - f18;
                    iArr[1] = i18;
                }
                d(this.f12358h);
            }
        }
        int i19 = i17 - iArr[0];
        int i27 = i18 - iArr[1];
        int[] iArr2 = this.f12361n;
        if (dispatchNestedPreScroll(i19, i27, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
        dispatchNestedScroll(i17, i18, i19, i27, this.f12362o);
        if (i27 + this.f12362o[1] >= 0 || a()) {
            return;
        }
        float abs = this.f12358h + java.lang.Math.abs(r11);
        this.f12358h = abs;
        d(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i17) {
        this.f12359i.a(view, view2, i17, 0);
        startNestedScroll(i17 & 2);
        this.f12358h = 0.0f;
        this.f12363p = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i17) {
        return (!isEnabled() || this.f12355e || (i17 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        this.f12359i.b(view, 0);
        this.f12363p = false;
        float f17 = this.f12358h;
        if (f17 > 0.0f) {
            c(f17);
            this.f12358h = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f12355e || this.f12363p) {
            return false;
        }
        if (actionMasked == 0) {
            this.f12369v = motionEvent.getPointerId(0);
            this.f12368u = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f12369v);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f12368u) {
                    float y17 = (motionEvent.getY(findPointerIndex) - this.f12366s) * 0.5f;
                    this.f12368u = false;
                    c(y17);
                }
                this.f12369v = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f12369v);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y18 = motionEvent.getY(findPointerIndex2);
                i(y18);
                if (this.f12368u) {
                    float f17 = (y18 - this.f12366s) * 0.5f;
                    if (f17 <= 0.0f) {
                        return false;
                    }
                    d(f17);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.f12369v = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f12369v) {
                        this.f12369v = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        android.view.View view = this.f12354d;
        if (view != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            if (!n3.a1.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    public void setAnimationProgress(float f17) {
        this.f12371x.setScaleX(f17);
        this.f12371x.setScaleY(f17);
    }

    @java.lang.Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        b();
        s4.e eVar = this.D;
        s4.d dVar = eVar.f402875d;
        dVar.f402859i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    public void setColorSchemeResources(int... iArr) {
        android.content.Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            iArr2[i17] = b3.l.getColor(context, iArr[i17]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i17) {
        this.f12357g = i17;
    }

    @Override // android.view.View
    public void setEnabled(boolean z17) {
        super.setEnabled(z17);
        if (z17) {
            return;
        }
        f();
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z17) {
        this.f12360m.i(z17);
    }

    public void setOnChildScrollUpCallback(s4.m mVar) {
    }

    public void setOnRefreshListener(s4.n nVar) {
    }

    @java.lang.Deprecated
    public void setProgressBackgroundColor(int i17) {
        setProgressBackgroundColorSchemeResource(i17);
    }

    public void setProgressBackgroundColorSchemeColor(int i17) {
        this.f12371x.setBackgroundColor(i17);
    }

    public void setProgressBackgroundColorSchemeResource(int i17) {
        setProgressBackgroundColorSchemeColor(b3.l.getColor(getContext(), i17));
    }

    public void setRefreshing(boolean z17) {
        if (!z17 || this.f12355e == z17) {
            g(z17, false);
            return;
        }
        this.f12355e = z17;
        setTargetOffsetTopAndBottom((this.B + this.A) - this.f12365r);
        this.I = false;
        android.view.animation.Animation.AnimationListener animationListener = this.K;
        this.f12371x.setVisibility(0);
        this.D.setAlpha(255);
        s4.g gVar = new s4.g(this);
        this.E = gVar;
        gVar.setDuration(this.f12364q);
        if (animationListener != null) {
            this.f12371x.f402846d = animationListener;
        }
        this.f12371x.clearAnimation();
        this.f12371x.startAnimation(this.E);
    }

    public void setSize(int i17) {
        if (i17 == 0 || i17 == 1) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i17 == 0) {
                this.f12353J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f12353J = (int) (displayMetrics.density * 40.0f);
            }
            this.f12371x.setImageDrawable(null);
            this.D.c(i17);
            this.f12371x.setImageDrawable(this.D);
        }
    }

    public void setSlingshotDistance(int i17) {
        this.C = i17;
    }

    public void setTargetOffsetTopAndBottom(int i17) {
        this.f12371x.bringToFront();
        s4.a aVar = this.f12371x;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        aVar.offsetTopAndBottom(i17);
        this.f12365r = this.f12371x.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.f12360m.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f12360m.k(0);
    }
}

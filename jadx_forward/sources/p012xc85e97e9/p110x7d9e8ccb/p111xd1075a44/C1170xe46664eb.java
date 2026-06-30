package p012xc85e97e9.p110x7d9e8ccb.p111xd1075a44;

/* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout */
/* loaded from: classes15.dex */
public class C1170xe46664eb extends android.view.ViewGroup implements n3.i0, n3.e0 {
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
    public int f93886J;
    public final android.view.animation.Animation.AnimationListener K;
    public final android.view.animation.Animation L;
    public final android.view.animation.Animation M;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f93887d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f93888e;

    /* renamed from: f, reason: collision with root package name */
    public final int f93889f;

    /* renamed from: g, reason: collision with root package name */
    public float f93890g;

    /* renamed from: h, reason: collision with root package name */
    public float f93891h;

    /* renamed from: i, reason: collision with root package name */
    public final n3.j0 f93892i;

    /* renamed from: m, reason: collision with root package name */
    public final n3.f0 f93893m;

    /* renamed from: n, reason: collision with root package name */
    public final int[] f93894n;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f93895o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f93896p;

    /* renamed from: q, reason: collision with root package name */
    public final int f93897q;

    /* renamed from: r, reason: collision with root package name */
    public int f93898r;

    /* renamed from: s, reason: collision with root package name */
    public float f93899s;

    /* renamed from: t, reason: collision with root package name */
    public float f93900t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f93901u;

    /* renamed from: v, reason: collision with root package name */
    public int f93902v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f93903w;

    /* renamed from: x, reason: collision with root package name */
    public s4.a f93904x;

    /* renamed from: y, reason: collision with root package name */
    public int f93905y;

    /* renamed from: z, reason: collision with root package name */
    public int f93906z;

    public C1170xe46664eb(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f93888e = false;
        this.f93890g = -1.0f;
        this.f93894n = new int[2];
        this.f93895o = new int[2];
        this.f93902v = -1;
        this.f93905y = -1;
        this.K = new s4.f(this);
        this.L = new s4.k(this);
        this.M = new s4.l(this);
        this.f93889f = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
        this.f93897q = getResources().getInteger(android.R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.f93903w = new android.view.animation.DecelerateInterpolator(2.0f);
        android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f93886J = (int) (displayMetrics.density * 40.0f);
        this.f93904x = new s4.a(getContext(), -328966);
        s4.e eVar = new s4.e(getContext());
        this.D = eVar;
        eVar.c(1);
        this.f93904x.setImageDrawable(this.D);
        this.f93904x.setVisibility(8);
        addView(this.f93904x);
        setChildrenDrawingOrderEnabled(true);
        int i17 = (int) (displayMetrics.density * 64.0f);
        this.B = i17;
        this.f93890g = i17;
        this.f93892i = new n3.j0(this);
        this.f93893m = new n3.f0(this);
        setNestedScrollingEnabled(true);
        int i18 = -this.f93886J;
        this.f93898r = i18;
        this.A = i18;
        e(1.0f);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, N);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }

    /* renamed from: setColorViewAlpha */
    private void m8240x28f82a98(int i17) {
        this.f93904x.getBackground().setAlpha(i17);
        this.D.setAlpha(i17);
    }

    public boolean a() {
        android.view.View view = this.f93887d;
        return view instanceof android.widget.ListView ? p012xc85e97e9.p075x2eaf9f.p079xd1075a44.l.a((android.widget.ListView) view, -1) : view.canScrollVertically(-1);
    }

    public final void b() {
        if (this.f93887d == null) {
            for (int i17 = 0; i17 < getChildCount(); i17++) {
                android.view.View childAt = getChildAt(i17);
                if (!childAt.equals(this.f93904x)) {
                    this.f93887d = childAt;
                    return;
                }
            }
        }
    }

    public final void c(float f17) {
        if (f17 > this.f93890g) {
            g(true, true);
            return;
        }
        this.f93888e = false;
        s4.e eVar = this.D;
        s4.d dVar = eVar.f484408d;
        dVar.f484388e = 0.0f;
        dVar.f484389f = 0.0f;
        eVar.invalidateSelf();
        s4.j jVar = new s4.j(this);
        this.f93906z = this.f93898r;
        android.view.animation.Animation animation = this.M;
        animation.reset();
        animation.setDuration(200L);
        animation.setInterpolator(this.f93903w);
        s4.a aVar = this.f93904x;
        aVar.f484379d = jVar;
        aVar.clearAnimation();
        this.f93904x.startAnimation(animation);
        s4.e eVar2 = this.D;
        s4.d dVar2 = eVar2.f484408d;
        if (dVar2.f484397n) {
            dVar2.f484397n = false;
        }
        eVar2.invalidateSelf();
    }

    public final void d(float f17) {
        s4.e eVar = this.D;
        s4.d dVar = eVar.f484408d;
        if (!dVar.f484397n) {
            dVar.f484397n = true;
        }
        eVar.invalidateSelf();
        float min = java.lang.Math.min(1.0f, java.lang.Math.abs(f17 / this.f93890g));
        float max = (((float) java.lang.Math.max(min - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = java.lang.Math.abs(f17) - this.f93890g;
        int i17 = this.C;
        if (i17 <= 0) {
            i17 = this.B;
        }
        float f18 = i17;
        double max2 = java.lang.Math.max(0.0f, java.lang.Math.min(abs, f18 * 2.0f) / f18) / 4.0f;
        float pow = ((float) (max2 - java.lang.Math.pow(max2, 2.0d))) * 2.0f;
        int i18 = this.A + ((int) ((f18 * min) + (f18 * pow * 2.0f)));
        if (this.f93904x.getVisibility() != 0) {
            this.f93904x.setVisibility(0);
        }
        this.f93904x.setScaleX(1.0f);
        this.f93904x.setScaleY(1.0f);
        if (f17 < this.f93890g) {
            if (this.D.f484408d.f484403t > 76) {
                android.view.animation.Animation animation = this.G;
                if (!((animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true)) {
                    s4.i iVar = new s4.i(this, this.D.f484408d.f484403t, 76);
                    iVar.setDuration(300L);
                    s4.a aVar = this.f93904x;
                    aVar.f484379d = null;
                    aVar.clearAnimation();
                    this.f93904x.startAnimation(iVar);
                    this.G = iVar;
                }
            }
        } else if (this.D.f484408d.f484403t < 255) {
            android.view.animation.Animation animation2 = this.H;
            if (!((animation2 == null || !animation2.hasStarted() || animation2.hasEnded()) ? false : true)) {
                s4.i iVar2 = new s4.i(this, this.D.f484408d.f484403t, 255);
                iVar2.setDuration(300L);
                s4.a aVar2 = this.f93904x;
                aVar2.f484379d = null;
                aVar2.clearAnimation();
                this.f93904x.startAnimation(iVar2);
                this.H = iVar2;
            }
        }
        s4.e eVar2 = this.D;
        float min2 = java.lang.Math.min(0.8f, max * 0.8f);
        s4.d dVar2 = eVar2.f484408d;
        dVar2.f484388e = 0.0f;
        dVar2.f484389f = min2;
        eVar2.invalidateSelf();
        s4.e eVar3 = this.D;
        float min3 = java.lang.Math.min(1.0f, max);
        s4.d dVar3 = eVar3.f484408d;
        if (min3 != dVar3.f484399p) {
            dVar3.f484399p = min3;
        }
        eVar3.invalidateSelf();
        s4.e eVar4 = this.D;
        eVar4.f484408d.f484390g = (((max * 0.4f) - 0.25f) + (pow * 2.0f)) * 0.5f;
        eVar4.invalidateSelf();
        m8257x53592b33(i18 - this.f93898r);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f17, float f18, boolean z17) {
        return this.f93893m.a(f17, f18, z17);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f17, float f18) {
        return this.f93893m.b(f17, f18);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i17, int i18, int[] iArr, int[] iArr2) {
        return this.f93893m.c(i17, i18, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i17, int i18, int i19, int i27, int[] iArr) {
        return this.f93893m.e(i17, i18, i19, i27, iArr);
    }

    public void e(float f17) {
        m8257x53592b33((this.f93906z + ((int) ((this.A - r0) * f17))) - this.f93904x.getTop());
    }

    public void f() {
        this.f93904x.clearAnimation();
        this.D.stop();
        this.f93904x.setVisibility(8);
        m8240x28f82a98(255);
        m8257x53592b33(this.A - this.f93898r);
        this.f93898r = this.f93904x.getTop();
    }

    public final void g(boolean z17, boolean z18) {
        if (this.f93888e != z17) {
            this.I = z18;
            b();
            this.f93888e = z17;
            android.view.animation.Animation.AnimationListener animationListener = this.K;
            if (!z17) {
                s4.h hVar = new s4.h(this);
                this.F = hVar;
                hVar.setDuration(150L);
                s4.a aVar = this.f93904x;
                aVar.f484379d = animationListener;
                aVar.clearAnimation();
                this.f93904x.startAnimation(this.F);
                return;
            }
            this.f93906z = this.f93898r;
            android.view.animation.Animation animation = this.L;
            animation.reset();
            animation.setDuration(200L);
            animation.setInterpolator(this.f93903w);
            if (animationListener != null) {
                this.f93904x.f484379d = animationListener;
            }
            this.f93904x.clearAnimation();
            this.f93904x.startAnimation(animation);
        }
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i17, int i18) {
        int i19 = this.f93905y;
        return i19 < 0 ? i18 : i18 == i17 + (-1) ? i19 : i18 >= i19 ? i18 + 1 : i18;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        n3.j0 j0Var = this.f93892i;
        return j0Var.f415879b | j0Var.f415878a;
    }

    /* renamed from: getProgressCircleDiameter */
    public int m8241x937f1800() {
        return this.f93886J;
    }

    /* renamed from: getProgressViewEndOffset */
    public int m8242x1a9c8946() {
        return this.B;
    }

    /* renamed from: getProgressViewStartOffset */
    public int m8243xf776a58d() {
        return this.A;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f93893m.h(0);
    }

    public final void i(float f17) {
        float f18 = this.f93900t;
        float f19 = f17 - f18;
        int i17 = this.f93889f;
        if (f19 <= i17 || this.f93901u) {
            return;
        }
        this.f93899s = f18 + i17;
        this.f93901u = true;
        this.D.setAlpha(76);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f93893m.f415867d;
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
        if (!isEnabled() || a() || this.f93888e || this.f93896p) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i17 = this.f93902v;
                    if (i17 == -1 || (findPointerIndex = motionEvent.findPointerIndex(i17)) < 0) {
                        return false;
                    }
                    i(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        int actionIndex = motionEvent.getActionIndex();
                        if (motionEvent.getPointerId(actionIndex) == this.f93902v) {
                            this.f93902v = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        }
                    }
                }
            }
            this.f93901u = false;
            this.f93902v = -1;
        } else {
            m8257x53592b33(this.A - this.f93904x.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f93902v = pointerId;
            this.f93901u = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f93900t = motionEvent.getY(findPointerIndex2);
        }
        return this.f93901u;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() == 0) {
            return;
        }
        if (this.f93887d == null) {
            b();
        }
        android.view.View view = this.f93887d;
        if (view == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
        int measuredWidth2 = this.f93904x.getMeasuredWidth();
        int measuredHeight2 = this.f93904x.getMeasuredHeight();
        int i28 = measuredWidth / 2;
        int i29 = measuredWidth2 / 2;
        int i37 = this.f93898r;
        this.f93904x.layout(i28 - i29, i37, i28 + i29, measuredHeight2 + i37);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        if (this.f93887d == null) {
            b();
        }
        android.view.View view = this.f93887d;
        if (view == null) {
            return;
        }
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), android.view.View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
        this.f93904x.measure(android.view.View.MeasureSpec.makeMeasureSpec(this.f93886J, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(this.f93886J, 1073741824));
        this.f93905y = -1;
        for (int i19 = 0; i19 < getChildCount(); i19++) {
            if (getChildAt(i19) == this.f93904x) {
                this.f93905y = i19;
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
            float f17 = this.f93891h;
            if (f17 > 0.0f) {
                float f18 = i18;
                if (f18 > f17) {
                    iArr[1] = i18 - ((int) f17);
                    this.f93891h = 0.0f;
                } else {
                    this.f93891h = f17 - f18;
                    iArr[1] = i18;
                }
                d(this.f93891h);
            }
        }
        int i19 = i17 - iArr[0];
        int i27 = i18 - iArr[1];
        int[] iArr2 = this.f93894n;
        if (dispatchNestedPreScroll(i19, i27, iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(android.view.View view, int i17, int i18, int i19, int i27) {
        dispatchNestedScroll(i17, i18, i19, i27, this.f93895o);
        if (i27 + this.f93895o[1] >= 0 || a()) {
            return;
        }
        float abs = this.f93891h + java.lang.Math.abs(r11);
        this.f93891h = abs;
        d(abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(android.view.View view, android.view.View view2, int i17) {
        this.f93892i.a(view, view2, i17, 0);
        startNestedScroll(i17 & 2);
        this.f93891h = 0.0f;
        this.f93896p = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(android.view.View view, android.view.View view2, int i17) {
        return (!isEnabled() || this.f93888e || (i17 & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(android.view.View view) {
        this.f93892i.b(view, 0);
        this.f93896p = false;
        float f17 = this.f93891h;
        if (f17 > 0.0f) {
            c(f17);
            this.f93891h = 0.0f;
        }
        stopNestedScroll();
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || a() || this.f93888e || this.f93896p) {
            return false;
        }
        if (actionMasked == 0) {
            this.f93902v = motionEvent.getPointerId(0);
            this.f93901u = false;
        } else {
            if (actionMasked == 1) {
                int findPointerIndex = motionEvent.findPointerIndex(this.f93902v);
                if (findPointerIndex < 0) {
                    return false;
                }
                if (this.f93901u) {
                    float y17 = (motionEvent.getY(findPointerIndex) - this.f93899s) * 0.5f;
                    this.f93901u = false;
                    c(y17);
                }
                this.f93902v = -1;
                return false;
            }
            if (actionMasked == 2) {
                int findPointerIndex2 = motionEvent.findPointerIndex(this.f93902v);
                if (findPointerIndex2 < 0) {
                    return false;
                }
                float y18 = motionEvent.getY(findPointerIndex2);
                i(y18);
                if (this.f93901u) {
                    float f17 = (y18 - this.f93899s) * 0.5f;
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
                    this.f93902v = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    int actionIndex2 = motionEvent.getActionIndex();
                    if (motionEvent.getPointerId(actionIndex2) == this.f93902v) {
                        this.f93902v = motionEvent.getPointerId(actionIndex2 == 0 ? 1 : 0);
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z17) {
        android.view.View view = this.f93887d;
        if (view != null) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (!n3.a1.p(view)) {
                return;
            }
        }
        super.requestDisallowInterceptTouchEvent(z17);
    }

    /* renamed from: setAnimationProgress */
    public void m8244x9a3118f(float f17) {
        this.f93904x.setScaleX(f17);
        this.f93904x.setScaleY(f17);
    }

    @java.lang.Deprecated
    /* renamed from: setColorScheme */
    public void m8245xa9d2b526(int... iArr) {
        m8247x738e939f(iArr);
    }

    /* renamed from: setColorSchemeColors */
    public void m8246x9f076a36(int... iArr) {
        b();
        s4.e eVar = this.D;
        s4.d dVar = eVar.f484408d;
        dVar.f484392i = iArr;
        dVar.a(0);
        dVar.a(0);
        eVar.invalidateSelf();
    }

    /* renamed from: setColorSchemeResources */
    public void m8247x738e939f(int... iArr) {
        android.content.Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i17 = 0; i17 < iArr.length; i17++) {
            iArr2[i17] = b3.l.m9702x7444d5ad(context, iArr[i17]);
        }
        m8246x9f076a36(iArr2);
    }

    /* renamed from: setDistanceToTriggerSync */
    public void m8248x6bc095c1(int i17) {
        this.f93890g = i17;
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
        this.f93893m.i(z17);
    }

    /* renamed from: setOnChildScrollUpCallback */
    public void m8249xf4c6f088(s4.m mVar) {
    }

    /* renamed from: setOnRefreshListener */
    public void m8250x7a54948e(s4.n nVar) {
    }

    @java.lang.Deprecated
    /* renamed from: setProgressBackgroundColor */
    public void m8251xb16dfa26(int i17) {
        m8253x92c6f499(i17);
    }

    /* renamed from: setProgressBackgroundColorSchemeColor */
    public void m8252xe4c5c2b8(int i17) {
        this.f93904x.setBackgroundColor(i17);
    }

    /* renamed from: setProgressBackgroundColorSchemeResource */
    public void m8253x92c6f499(int i17) {
        m8252xe4c5c2b8(b3.l.m9702x7444d5ad(getContext(), i17));
    }

    /* renamed from: setRefreshing */
    public void m8254x9365929(boolean z17) {
        if (!z17 || this.f93888e == z17) {
            g(z17, false);
            return;
        }
        this.f93888e = z17;
        m8257x53592b33((this.B + this.A) - this.f93898r);
        this.I = false;
        android.view.animation.Animation.AnimationListener animationListener = this.K;
        this.f93904x.setVisibility(0);
        this.D.setAlpha(255);
        s4.g gVar = new s4.g(this);
        this.E = gVar;
        gVar.setDuration(this.f93897q);
        if (animationListener != null) {
            this.f93904x.f484379d = animationListener;
        }
        this.f93904x.clearAnimation();
        this.f93904x.startAnimation(this.E);
    }

    /* renamed from: setSize */
    public void m8255x76500f83(int i17) {
        if (i17 == 0 || i17 == 1) {
            android.util.DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i17 == 0) {
                this.f93886J = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f93886J = (int) (displayMetrics.density * 40.0f);
            }
            this.f93904x.setImageDrawable(null);
            this.D.c(i17);
            this.f93904x.setImageDrawable(this.D);
        }
    }

    /* renamed from: setSlingshotDistance */
    public void m8256x9541ee36(int i17) {
        this.C = i17;
    }

    /* renamed from: setTargetOffsetTopAndBottom */
    public void m8257x53592b33(int i17) {
        this.f93904x.bringToFront();
        s4.a aVar = this.f93904x;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        aVar.offsetTopAndBottom(i17);
        this.f93898r = this.f93904x.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i17) {
        return this.f93893m.j(i17, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f93893m.k(0);
    }
}

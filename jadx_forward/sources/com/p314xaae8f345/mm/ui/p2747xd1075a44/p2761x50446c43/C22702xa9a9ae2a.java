package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43;

/* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView */
/* loaded from: classes11.dex */
public class C22702xa9a9ae2a extends android.widget.ListView implements android.widget.AdapterView.OnItemLongClickListener, android.widget.AdapterView.OnItemClickListener, android.widget.AdapterView.OnItemSelectedListener, xn5.a0 {

    /* renamed from: y1, reason: collision with root package name */
    public static final /* synthetic */ int f293679y1 = 0;
    public int A;
    public int B;
    public boolean C;
    public float D;
    public float E;
    public android.view.View F;
    public android.view.View G;
    public float H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f293680J;
    public boolean K;
    public boolean L;
    public boolean M;
    public float N;
    public int P;
    public int Q;
    public boolean R;
    public float S;
    public int T;
    public int U;
    public int V;
    public boolean W;

    /* renamed from: d, reason: collision with root package name */
    public ql5.m f293681d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f293682e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f293683f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f293684g;

    /* renamed from: h, reason: collision with root package name */
    public final float f293685h;

    /* renamed from: i, reason: collision with root package name */
    public final float f293686i;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemClickListener f293687l1;

    /* renamed from: m, reason: collision with root package name */
    public int f293688m;

    /* renamed from: n, reason: collision with root package name */
    public int f293689n;

    /* renamed from: o, reason: collision with root package name */
    public int f293690o;

    /* renamed from: p, reason: collision with root package name */
    public float f293691p;

    /* renamed from: p0, reason: collision with root package name */
    public long f293692p0;

    /* renamed from: p1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemLongClickListener f293693p1;

    /* renamed from: q, reason: collision with root package name */
    public float f293694q;

    /* renamed from: r, reason: collision with root package name */
    public android.os.Vibrator f293695r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f293696s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.View f293697t;

    /* renamed from: u, reason: collision with root package name */
    public float f293698u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f293699v;

    /* renamed from: w, reason: collision with root package name */
    public final android.graphics.Rect f293700w;

    /* renamed from: x, reason: collision with root package name */
    public int f293701x;

    /* renamed from: x0, reason: collision with root package name */
    public long f293702x0;

    /* renamed from: x1, reason: collision with root package name */
    public android.widget.AdapterView.OnItemSelectedListener f293703x1;

    /* renamed from: y, reason: collision with root package name */
    public int f293704y;

    /* renamed from: y0, reason: collision with root package name */
    public ql5.n f293705y0;

    /* renamed from: z, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.IPullDownCallback f293706z;

    /* renamed from: com.tencent.mm.ui.widget.listview.PullDownListView$IPullDownCallback */
    /* loaded from: classes11.dex */
    public interface IPullDownCallback {
        void b(int i17);

        void e();

        void j(int i17);

        /* renamed from: onPostClose */
        void mo14951x73fef619();

        /* renamed from: onPostOpen */
        void mo14952xd2370609(boolean z17);

        /* renamed from: onPreClose */
        void mo14953x56608c14();

        /* renamed from: onPreOpen */
        void mo14954x3c9d44ae();

        void p();

        void q(int i17);
    }

    public C22702xa9a9ae2a(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293682e = false;
        this.f293683f = false;
        this.f293684g = true;
        this.f293685h = 0.05f;
        this.f293686i = 0.05f;
        this.f293688m = 0;
        this.f293689n = 0;
        this.f293690o = 0;
        this.f293691p = 0.0f;
        this.f293694q = 0.0f;
        this.f293696s = true;
        this.f293700w = new android.graphics.Rect();
        this.f293701x = 0;
        this.f293704y = 0;
        this.C = false;
        this.H = 0.0f;
        this.I = false;
        this.f293680J = true;
        this.K = false;
        this.L = false;
        this.M = false;
        this.N = 0.0f;
        this.P = 0;
        this.Q = 0;
        this.R = false;
        this.S = 0.0f;
        this.T = -1;
        this.U = 0;
        this.V = 0;
        this.W = false;
        this.f293692p0 = 0L;
        this.f293702x0 = 0L;
        this.f293705y0 = null;
        super.setOnItemClickListener(this);
        super.setOnItemLongClickListener(this);
        super.setOnItemSelectedListener(this);
        com.p314xaae8f345.mm.ui.bl.b(context);
        this.f293690o = com.p314xaae8f345.mm.ui.bl.b(context).y;
        this.f293695r = (android.os.Vibrator) getContext().getSystemService("vibrator");
        post(new ql5.j(this));
    }

    public final boolean b(android.view.MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (this.f293699v == null) {
            return false;
        }
        if (motionEvent.getActionMasked() == 1 && this.f293702x0 < 200) {
            return false;
        }
        if (this.E < this.f293699v.getRight()) {
            if (rawX <= this.f293699v.getLeft() || rawX >= this.f293699v.getRight() || rawY <= this.f293699v.getTop() - (this.f293699v.getHeight() / 2) || rawY >= this.f293699v.getBottom() + this.f293704y) {
                return false;
            }
        } else if (rawX <= this.f293699v.getLeft() || rawX >= this.f293699v.getRight() || rawY <= this.f293699v.getTop() || rawY >= this.f293699v.getBottom() + this.f293704y) {
            return false;
        }
        return true;
    }

    public final int c() {
        if (this.f293689n == 0) {
            this.f293689n = (int) ((this.f293690o - this.Q) * (1.0f - this.f293686i));
        }
        return this.f293689n;
    }

    public final android.animation.ValueAnimator d(int i17, int i18) {
        com.p314xaae8f345.mm.ui.yk.a("MicroMsg.PullDownListView", "startStoryGalleryOpenAnim start:%s, end:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(i17, i18);
        ofInt.addUpdateListener(new ql5.l(this));
        return ofInt;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void f() {
        android.view.View view = this.f293699v;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/listview/PullDownListView", "hideMuteViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/listview/PullDownListView", "hideMuteViewVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final int g() {
        if (this.f293688m == 0) {
            this.f293688m = (int) (this.f293690o * this.f293685h);
        }
        return this.f293688m;
    }

    public void h() {
        this.f293701x = 0;
        com.p314xaae8f345.mm.ui.yk.a("MicroMsg.PullDownListView", "startAnimation %s %s %s %s", java.lang.Integer.valueOf(this.f293697t.getLeft()), java.lang.Integer.valueOf(this.f293697t.getTop()), java.lang.Integer.valueOf(this.f293697t.getRight()), java.lang.Integer.valueOf(this.f293697t.getBottom()));
    }

    public final void i() {
        android.view.View view = this.f293699v;
        if (view != null) {
            view.setTranslationX(this.f293691p);
            this.f293699v.setTranslationY(this.f293694q);
            android.view.View view2 = this.f293699v;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/ui/widget/listview/PullDownListView", "resetMuteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/widget/listview/PullDownListView", "resetMuteView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final int j(int i17) {
        float f17 = i17;
        int abs = (int) java.lang.Math.abs((f17 / this.f293690o) * this.P);
        com.p314xaae8f345.mm.ui.yk.a("MicroMsg.PullDownListView", "offset:%s,  ((float) offset / screenHeight):%s,  Math.abs(mCoordinationAnimThreshold):%s,  result:%s", java.lang.Integer.valueOf(i17), java.lang.Float.valueOf(f17 / this.f293690o), java.lang.Integer.valueOf(java.lang.Math.abs(this.P)), java.lang.Integer.valueOf(abs));
        return abs;
    }

    public final void k(int i17, int i18, boolean z17) {
        android.graphics.Rect rect = this.f293700w;
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "story_cat animation: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom), java.lang.Integer.valueOf(getLeft()), java.lang.Integer.valueOf(getTop()), java.lang.Integer.valueOf(getRight()), java.lang.Integer.valueOf(getBottom()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()), java.lang.Boolean.valueOf(z17));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(android.animation.ObjectAnimator.ofFloat(this, "translationY", i17, i18));
        if (this.F != null && i17 > g() && i17 < c()) {
            int height = this.F.getHeight();
            android.animation.ObjectAnimator ofFloat = i18 != 0 ? android.animation.ObjectAnimator.ofFloat(this.F, "translationY", 0.0f, height) : android.animation.ObjectAnimator.ofFloat(this.F, "translationY", height, 0.0f);
            ofFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: ql5.h$$a
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                    int i19 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.f293679y1;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a c22702xa9a9ae2a = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.this;
                    c22702xa9a9ae2a.getClass();
                    float floatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
                    ql5.m mVar = c22702xa9a9ae2a.f293681d;
                    if (mVar != null) {
                        mVar.a(floatValue);
                    }
                }
            });
            arrayList.add(ofFloat);
        }
        if (this.G != null) {
            if (i18 >= getBottom()) {
                arrayList.add(d(((android.view.ViewGroup.MarginLayoutParams) this.G.getLayoutParams()).topMargin, 0));
            } else {
                arrayList.add(d(((android.view.ViewGroup.MarginLayoutParams) this.G.getLayoutParams()).topMargin, this.P));
            }
        }
        animatorSet.addListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.a(this, i17, i18, z17));
        animatorSet.playTogether(arrayList);
        animatorSet.setDuration(300L);
        animatorSet.start();
        h();
    }

    public final void l(int i17, int i18, boolean z17) {
        android.graphics.Rect rect = this.f293700w;
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "story_cat startAnimationImmediately: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", java.lang.Integer.valueOf(rect.left), java.lang.Integer.valueOf(rect.top), java.lang.Integer.valueOf(rect.right), java.lang.Integer.valueOf(rect.bottom), java.lang.Integer.valueOf(getLeft()), java.lang.Integer.valueOf(getTop()), java.lang.Integer.valueOf(getRight()), java.lang.Integer.valueOf(getBottom()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()), java.lang.Boolean.valueOf(z17));
        float f17 = i18;
        setTranslationY(f17);
        if (this.F != null && i17 > g() && i17 < c()) {
            if (i18 != 0) {
                this.F.setTranslationY(f17);
            } else {
                this.F.setTranslationY(i18 - this.f293704y);
            }
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "onImmeStart start:%s, openLimitPx():%s, closeLimitPx():%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()));
        this.K = true;
        if (i18 == 0) {
            this.f293680J = true;
        } else {
            this.f293680J = false;
        }
        if (this.f293706z != null && i17 > g() && i17 < c()) {
            if (this.f293680J) {
                this.f293706z.mo14953x56608c14();
            } else {
                this.f293706z.mo14954x3c9d44ae();
            }
        }
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "onImmeEnd start:%s, openLimitPx():%s, closeLimitPx():%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(g()), java.lang.Integer.valueOf(c()));
        this.I = false;
        this.K = false;
        this.L = false;
        this.M = false;
        if (this.f293706z != null && i17 > g() && i17 < c()) {
            if (this.f293680J) {
                this.f293706z.mo14951x73fef619();
            } else {
                this.f293706z.mo14952xd2370609(z17);
            }
        }
        h();
    }

    public final void m() {
        android.view.View view = this.f293699v;
        if (view != null) {
            float translationX = view.getTranslationX();
            float translationY = this.f293699v.getTranslationY();
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f293699v, "translationX", translationX, this.f293691p);
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(this.f293699v, "translationY", translationY, this.f293694q);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.addListener(new ql5.k(this));
            animatorSet.start();
        }
    }

    public void n() {
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "switchNormalStatus", new java.lang.Object[0]);
        if (this.f293680J) {
            return;
        }
        if (this.f293683f) {
            k((int) (this.A * (1.0f - this.f293686i)), 0, false);
        } else {
            k(c() - 1, 0, false);
        }
    }

    public void o() {
        setSelectionFromTop(0, 0);
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "switchPullDownStatus", new java.lang.Object[0]);
        if (this.f293680J) {
            if (!this.f293683f) {
                k(g() + 1, this.f293697t.getBottom() + this.f293704y, false);
            } else {
                k(g() + 1, this.A, false);
            }
        }
    }

    @Override // android.widget.ListView, android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f293697t = this;
        getTranslationY();
        com.p314xaae8f345.mm.ui.yk.a("MicroMsg.PullDownListView", "onFinishInflate %s %s %s %s", java.lang.Integer.valueOf(this.f293697t.getLeft()), java.lang.Integer.valueOf(this.f293697t.getTop()), java.lang.Integer.valueOf(this.f293697t.getRight()), java.lang.Integer.valueOf(this.f293697t.getBottom()));
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f293680J || !this.f293683f || motionEvent.getRawY() <= this.B) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "onItemClick isMove:%s isVisible:%s mIsNeedHover:%s position:%s mItemClickListener:%s isAnima:%s", java.lang.Boolean.valueOf(this.I), java.lang.Boolean.valueOf(this.f293680J), java.lang.Boolean.valueOf(this.f293683f), java.lang.Integer.valueOf(i17), this.f293687l1, java.lang.Boolean.valueOf(this.K));
        android.widget.AdapterView.OnItemClickListener onItemClickListener = this.f293687l1;
        if (onItemClickListener == null || this.I || !this.f293680J || this.K) {
            return;
        }
        this.C = true;
        onItemClickListener.onItemClick(adapterView, view, i17, j17);
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener = this.f293693p1;
        if (onItemLongClickListener == null) {
            return false;
        }
        if (!this.f293680J && !this.f293683f) {
            return false;
        }
        this.C = true;
        return onItemLongClickListener.onItemLongClick(adapterView, view, i17, j17);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(adapterView);
        arrayList.add(view);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Long.valueOf(j17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/listview/PullDownListView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", this, array);
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f293703x1;
        if (onItemSelectedListener != null && !this.I && this.f293680J && !this.K) {
            this.C = true;
            onItemSelectedListener.onItemSelected(adapterView, view, i17, j17);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/listview/PullDownListView", "android/widget/AdapterView$OnItemSelectedListener", "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V");
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        super.onLayout(z17, i17, i18, i19, i27);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
        android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener = this.f293703x1;
        if (onItemSelectedListener != null) {
            onItemSelectedListener.onNothingSelected(adapterView);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0613  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x061b  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0622 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0623 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.widget.AbsListView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r21) {
        /*
            Method dump skipped, instructions count: 1650
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2761x50446c43.C22702xa9a9ae2a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setMuteView */
    public void m82042xaa55eae0(android.view.View view) {
        if (view != null) {
            post(new ql5.i(this, view));
        } else {
            this.f293691p = 0.0f;
            this.f293694q = 0.0f;
        }
        this.f293699v = view;
    }

    /* renamed from: setNavigationBarHeight */
    public void m82043x577127a4(int i17) {
        com.p314xaae8f345.mm.ui.yk.c("MicroMsg.PullDownListView", "setNavigationBarHeight=%s", java.lang.Integer.valueOf(i17));
        this.f293704y = i17;
    }

    @Override // android.widget.AdapterView
    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onItemClickListener) {
        this.f293687l1 = onItemClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onItemLongClickListener) {
        this.f293693p1 = onItemLongClickListener;
    }

    @Override // android.widget.AdapterView
    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f293703x1 = onItemSelectedListener;
    }

    /* renamed from: setOnTabViewTranslationListener */
    public void m82044x46daff0c(ql5.m mVar) {
        this.f293681d = mVar;
    }

    /* renamed from: setSupportOverscroll */
    public void m82045x1ceed8e(boolean z17) {
        this.f293682e = z17;
    }

    /* renamed from: setTabView */
    public void m82046x54a52518(android.view.View view) {
        this.F = view;
    }

    /* renamed from: setTranslationListener */
    public void m82047x681476c3(ql5.n nVar) {
        this.f293705y0 = nVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f17) {
        super.setTranslationY(f17);
        ql5.n nVar = this.f293705y0;
        if (nVar != null) {
            nVar.a(f17);
        }
    }
}

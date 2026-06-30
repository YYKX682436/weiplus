package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes8.dex */
public abstract class w1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f264176d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f264177e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f264178f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f264179g;

    /* renamed from: h, reason: collision with root package name */
    public final int f264180h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f264181i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f264182m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f264183n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f264184o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f264185p;

    /* renamed from: q, reason: collision with root package name */
    public int f264186q;

    /* renamed from: r, reason: collision with root package name */
    public int f264187r;

    /* renamed from: s, reason: collision with root package name */
    public int f264188s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f264189t;

    public w1(android.content.Context context) {
        super(context);
        this.f264181i = true;
        this.f264182m = false;
        this.f264183n = false;
        this.f264184o = false;
        this.f264185p = false;
        this.f264189t = null;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f264180h = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public final boolean a() {
        this.f264178f.getScrollY();
        this.f264178f.getTop();
        android.view.View view = this.f264178f;
        return view instanceof com.p314xaae8f345.p3210x3857dc.C27816xac2547f9 ? ((com.p314xaae8f345.p3210x3857dc.C27816xac2547f9) view).mo120162x95a6d12e() == 0 : view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 ? ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).mo7951xfd37656d()).w() == 0 && this.f264178f.getScrollY() == 0 : view.getScrollY() == 0;
    }

    public void b() {
        c(0);
        this.f264184o = false;
        this.f264183n = false;
        this.f264185p = false;
    }

    public final void c(int i17) {
        int translationY = (int) this.f264179g.getTranslationY();
        if (translationY == i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", java.lang.Integer.valueOf(translationY), java.lang.Integer.valueOf(i17));
        android.animation.ObjectAnimator objectAnimator = this.f264189t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        long abs = (java.lang.Math.abs(translationY - i17) / m74242xb80254d6()) * 250.0f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f264179g, "translationY", translationY, i17);
        ofFloat.setDuration(java.lang.Math.min(abs, 250L));
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.v1(this));
        this.f264189t = ofFloat;
    }

    public void d(int i17) {
    }

    public void e() {
    }

    public void f(android.view.View view, android.view.View view2) {
        removeAllViews();
        this.f264176d = view;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f264177e = frameLayout;
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f264177e.addView(view);
        this.f264178f = view2;
        android.widget.FrameLayout frameLayout2 = new android.widget.FrameLayout(getContext());
        this.f264179g = frameLayout2;
        frameLayout2.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f264179g.addView(view2);
        addView(this.f264177e);
        addView(this.f264179g);
    }

    /* renamed from: getMaxOverScrollDistance */
    public int m74240x934ee2a4() {
        return getHeight();
    }

    /* renamed from: getOpenHeight */
    public int m74241xef6afc07() {
        return this.f264176d.getHeight();
    }

    /* renamed from: getStayHeight */
    public int m74242xb80254d6() {
        return this.f264176d.getHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f264181i) {
            return this.f264185p;
        }
        int action = motionEvent.getAction();
        if (action != 3 && action != 1) {
            if (this.f264184o) {
                return true;
            }
            if (action != 0) {
                if (action == 2 && a()) {
                    int x17 = (int) motionEvent.getX();
                    int y17 = (int) motionEvent.getY();
                    int i17 = x17 - this.f264186q;
                    int i18 = y17 - this.f264187r;
                    if (java.lang.Math.abs(i18) > this.f264180h && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && i18 > 0) {
                        this.f264184o = true;
                        return true;
                    }
                }
            } else if (a()) {
                this.f264186q = (int) motionEvent.getX();
                this.f264187r = (int) motionEvent.getY();
                this.f264188s = (int) motionEvent.getY();
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f264181i) {
            if (this.f264185p) {
                b();
            }
            return this.f264185p;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f264188s = (int) motionEvent.getY();
            return true;
        }
        if (action != 1) {
            if (action == 2) {
                int y17 = (((int) motionEvent.getY()) - this.f264188s) >> 1;
                int m74240x934ee2a4 = m74240x934ee2a4();
                if (y17 > m74240x934ee2a4) {
                    y17 = m74240x934ee2a4;
                }
                if (this.f264183n) {
                    y17 += m74242xb80254d6();
                }
                int max = java.lang.Math.max(y17, 0);
                this.f264179g.setTranslationY(java.lang.Math.min(m74240x934ee2a4(), max));
                d(max);
                return true;
            }
            if (action != 3) {
                return false;
            }
        }
        if (this.f264179g.getTranslationY() <= m74241xef6afc07() || !this.f264182m) {
            b();
        } else {
            c(m74242xb80254d6());
            if (!this.f264183n) {
                e();
            }
            this.f264184o = true;
            this.f264183n = true;
            this.f264185p = true;
        }
        return true;
    }

    /* renamed from: setNeedStay */
    public void m74243xaa2b6691(boolean z17) {
        this.f264182m = z17;
    }

    /* renamed from: setPullDownBackgroundColor */
    public void m74244x3940e08c(int i17) {
        this.f264177e.setBackgroundColor(i17);
    }

    /* renamed from: setPullDownEnabled */
    public void m74245x8e3d1bf8(boolean z17) {
        this.f264181i = !z17;
    }
}

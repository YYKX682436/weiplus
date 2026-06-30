package com.tencent.mm.plugin.appbrand.page;

/* loaded from: classes7.dex */
public abstract class o8 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f86956d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f86957e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f86958f;

    /* renamed from: g, reason: collision with root package name */
    public final int f86959g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f86960h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f86961i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f86962m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f86963n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f86964o;

    /* renamed from: p, reason: collision with root package name */
    public int f86965p;

    /* renamed from: q, reason: collision with root package name */
    public int f86966q;

    /* renamed from: r, reason: collision with root package name */
    public int f86967r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f86968s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f86969t;

    public o8(android.content.Context context) {
        super(context);
        this.f86960h = true;
        this.f86961i = false;
        this.f86962m = false;
        this.f86963n = false;
        this.f86964o = false;
        this.f86968s = false;
        this.f86969t = null;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f86959g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    private int getMaxOverScrollDistance() {
        return getHeight();
    }

    public final void a() {
        c();
        b(0);
        if (this.f86962m) {
            com.tencent.mm.plugin.appbrand.page.p8 p8Var = (com.tencent.mm.plugin.appbrand.page.p8) this;
            android.widget.ImageView imageView = p8Var.D;
            if (imageView == null || imageView.getDrawable() == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPullDownWebView", "stopLoadingAnimation but drawable is null, try protect");
            } else {
                ((android.graphics.drawable.AnimationDrawable) p8Var.D.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) p8Var.D.getDrawable()).selectDrawable(0);
                ((android.graphics.drawable.AnimationDrawable) p8Var.E.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) p8Var.E.getDrawable()).selectDrawable(0);
                ((android.graphics.drawable.AnimationDrawable) p8Var.F.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) p8Var.F.getDrawable()).selectDrawable(0);
            }
        }
        this.f86963n = false;
        this.f86962m = false;
        this.f86964o = false;
    }

    public final void b(int i17) {
        int translationY = (int) this.f86958f.getTranslationY();
        if (translationY == i17) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", java.lang.Integer.valueOf(translationY), java.lang.Integer.valueOf(i17));
        android.animation.ObjectAnimator objectAnimator = this.f86969t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        long abs = (java.lang.Math.abs(translationY - i17) / getStayHeight()) * 250.0f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f86958f, "translationY", translationY, i17);
        ofFloat.setDuration(java.lang.Math.min(abs, 250L));
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
        ofFloat.addUpdateListener(new com.tencent.mm.plugin.appbrand.page.n8(this));
        this.f86969t = ofFloat;
    }

    public abstract void c();

    public final void d() {
        if (this.f86957e == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            this.f86957e = frameLayout;
            frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            addView(this.f86957e, getChildCount() > 0 ? 0 : -1);
        }
    }

    public abstract void e(int i17);

    public final void f() {
        c();
        b(getStayHeight());
        if (!this.f86962m) {
            com.tencent.mm.plugin.appbrand.page.p8 p8Var = (com.tencent.mm.plugin.appbrand.page.p8) this;
            if (p8Var.A == null) {
                p8Var.c();
            }
            android.widget.ImageView imageView = p8Var.D;
            if (imageView == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandPullDownWebView", "startLoadingAnimation, mLoading0 is null");
            } else {
                if (imageView.getDrawable() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandPullDownWebView", "startLoadingAnimation but drawable is null, try protect");
                    p8Var.j();
                    p8Var.B.setTextColor(-16777216);
                    p8Var.B.setAlpha(0.2f);
                }
                ((android.graphics.drawable.AnimationDrawable) p8Var.D.getDrawable()).start();
                ((android.graphics.drawable.AnimationDrawable) p8Var.E.getDrawable()).start();
                ((android.graphics.drawable.AnimationDrawable) p8Var.F.getDrawable()).start();
            }
            com.tencent.mm.plugin.appbrand.page.q8 q8Var = p8Var.f87001u;
            if (q8Var != null) {
                com.tencent.mm.plugin.appbrand.page.a aVar = ((com.tencent.mm.plugin.appbrand.page.a$$a) q8Var).f86386a;
                if (aVar.F() != null) {
                    ((com.tencent.luggage.sdk.jsapi.component.b) aVar.F()).d("onPullDownRefresh", null, new int[]{((com.tencent.luggage.sdk.jsapi.component.b) aVar.F()).getComponentId()});
                }
            }
            p8Var.H = java.lang.System.currentTimeMillis();
        }
        this.f86963n = true;
        this.f86962m = true;
        this.f86964o = true;
    }

    public int getOpenHeight() {
        return this.f86956d.getHeight();
    }

    public int getPullDownBackgroundColor() {
        android.widget.FrameLayout frameLayout = this.f86957e;
        if (frameLayout == null) {
            return 0;
        }
        android.graphics.drawable.Drawable background = frameLayout.getBackground();
        if (background instanceof android.graphics.drawable.ColorDrawable) {
            return ((android.graphics.drawable.ColorDrawable) background).getColor();
        }
        return 0;
    }

    public int getStayHeight() {
        android.view.View view = this.f86956d;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f86960h) {
            return this.f86964o;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f86963n = false;
            this.f86968s = false;
            return false;
        }
        if (action == 2 && this.f86963n) {
            return true;
        }
        if (action != 0) {
            if (action == 2 && ((com.tencent.mm.plugin.appbrand.page.p8) this).f87006z.p0()) {
                if (!this.f86968s) {
                    this.f86965p = (int) motionEvent.getX();
                    this.f86966q = (int) motionEvent.getY();
                    this.f86967r = (int) motionEvent.getY();
                    this.f86963n = false;
                    this.f86968s = true;
                    return false;
                }
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int i17 = x17 - this.f86965p;
                int i18 = y17 - this.f86966q;
                if (java.lang.Math.abs(i18) > this.f86959g && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && i18 > 0) {
                    this.f86965p = x17;
                    this.f86966q = y17;
                    this.f86963n = true;
                    this.f86968s = false;
                    return true;
                }
            }
        } else if (((com.tencent.mm.plugin.appbrand.page.p8) this).f87006z.p0()) {
            this.f86965p = (int) motionEvent.getX();
            this.f86966q = (int) motionEvent.getY();
            this.f86967r = (int) motionEvent.getY();
            this.f86963n = false;
            this.f86968s = true;
        }
        return this.f86963n || this.f86964o;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0029, code lost:
    
        if (r0 != 3) goto L55;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.f86960h
            if (r0 == 0) goto Le
            boolean r5 = r4.f86964o
            if (r5 == 0) goto Lb
            r4.a()
        Lb:
            boolean r5 = r4.f86964o
            return r5
        Le:
            int r0 = r5.getAction()
            r1 = 0
            if (r0 != 0) goto L1c
            int r0 = r5.getEdgeFlags()
            if (r0 == 0) goto L1c
            return r1
        L1c:
            int r0 = r5.getAction()
            r2 = 1
            if (r0 == 0) goto La5
            if (r0 == r2) goto L80
            r3 = 2
            if (r0 == r3) goto L2d
            r5 = 3
            if (r0 == r5) goto L80
            goto Lb5
        L2d:
            boolean r0 = r4.f86963n
            if (r0 != 0) goto L35
            boolean r0 = r4.f86964o
            if (r0 == 0) goto Lb5
        L35:
            boolean r0 = r4.f86968s
            if (r0 != 0) goto L51
            float r0 = r5.getY()
            int r0 = (int) r0
            r4.f86966q = r0
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.f86965p = r0
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f86967r = r5
            r4.f86968s = r2
            return r2
        L51:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f86967r
            int r5 = r5 - r0
            int r5 = r5 >> r2
            int r0 = r4.getMaxOverScrollDistance()
            if (r5 <= r0) goto L61
            r5 = r0
        L61:
            boolean r0 = r4.f86962m
            if (r0 == 0) goto L6a
            int r0 = r4.getStayHeight()
            int r5 = r5 + r0
        L6a:
            int r5 = java.lang.Math.max(r5, r1)
            int r0 = r4.getMaxOverScrollDistance()
            int r0 = java.lang.Math.min(r0, r5)
            android.widget.FrameLayout r1 = r4.f86958f
            float r0 = (float) r0
            r1.setTranslationY(r0)
            r4.e(r5)
            return r2
        L80:
            r4.f86968s = r1
            android.widget.FrameLayout r5 = r4.f86958f
            float r5 = r5.getTranslationY()
            int r0 = r4.getOpenHeight()
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L99
            boolean r5 = r4.f86961i
            if (r5 == 0) goto L99
            r4.f()
            return r2
        L99:
            boolean r5 = r4.f86963n
            if (r5 != 0) goto La1
            boolean r5 = r4.f86964o
            if (r5 == 0) goto Lb5
        La1:
            r4.a()
            return r2
        La5:
            r0 = r4
            com.tencent.mm.plugin.appbrand.page.p8 r0 = (com.tencent.mm.plugin.appbrand.page.p8) r0
            com.tencent.mm.plugin.appbrand.page.fb r0 = r0.f87006z
            boolean r0 = r0.p0()
            if (r0 != 0) goto Lb6
            boolean r0 = r4.f86964o
            if (r0 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r1
        Lb6:
            float r0 = r5.getY()
            int r0 = (int) r0
            r4.f86966q = r0
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.f86965p = r0
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f86967r = r5
            r4.f86968s = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.page.o8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setBackgroundView(android.view.View view) {
        this.f86956d = view;
        d();
        this.f86957e.addView(view);
    }

    public final void setContentView(android.view.View view) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f86958f = frameLayout;
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f86958f.addView(view);
        addView(this.f86958f);
    }

    public void setNeedStay(boolean z17) {
        this.f86961i = z17;
    }

    public void setPullDownBackgroundColor(int i17) {
        if (this.f86957e == null) {
            if (i17 == 0) {
                return;
            } else {
                d();
            }
        }
        this.f86957e.setBackgroundColor(i17);
    }

    public void setPullDownEnabled(boolean z17) {
        this.f86960h = !z17;
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class o8 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f168489d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.FrameLayout f168490e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.FrameLayout f168491f;

    /* renamed from: g, reason: collision with root package name */
    public final int f168492g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f168493h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f168494i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f168495m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f168496n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f168497o;

    /* renamed from: p, reason: collision with root package name */
    public int f168498p;

    /* renamed from: q, reason: collision with root package name */
    public int f168499q;

    /* renamed from: r, reason: collision with root package name */
    public int f168500r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f168501s;

    /* renamed from: t, reason: collision with root package name */
    public android.animation.ObjectAnimator f168502t;

    public o8(android.content.Context context) {
        super(context);
        this.f168493h = true;
        this.f168494i = false;
        this.f168495m = false;
        this.f168496n = false;
        this.f168497o = false;
        this.f168501s = false;
        this.f168502t = null;
        setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f168492g = android.view.ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: getMaxOverScrollDistance */
    private int m52198x934ee2a4() {
        return getHeight();
    }

    public final void a() {
        c();
        b(0);
        if (this.f168495m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8) this;
            android.widget.ImageView imageView = p8Var.D;
            if (imageView == null || imageView.getDrawable() == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPullDownWebView", "stopLoadingAnimation but drawable is null, try protect");
            } else {
                ((android.graphics.drawable.AnimationDrawable) p8Var.D.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) p8Var.D.getDrawable()).selectDrawable(0);
                ((android.graphics.drawable.AnimationDrawable) p8Var.E.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) p8Var.E.getDrawable()).selectDrawable(0);
                ((android.graphics.drawable.AnimationDrawable) p8Var.F.getDrawable()).stop();
                ((android.graphics.drawable.AnimationDrawable) p8Var.F.getDrawable()).selectDrawable(0);
            }
        }
        this.f168496n = false;
        this.f168495m = false;
        this.f168497o = false;
    }

    public final void b(int i17) {
        int translationY = (int) this.f168491f.getTranslationY();
        if (translationY == i17) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPullDownView", "fastScrollTo from = %s, to = %s", java.lang.Integer.valueOf(translationY), java.lang.Integer.valueOf(i17));
        android.animation.ObjectAnimator objectAnimator = this.f168502t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
        long abs = (java.lang.Math.abs(translationY - i17) / mo52201xb80254d6()) * 250.0f;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f168491f, "translationY", translationY, i17);
        ofFloat.setDuration(java.lang.Math.min(abs, 250L));
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.start();
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n8(this));
        this.f168502t = ofFloat;
    }

    public abstract void c();

    public final void d() {
        if (this.f168490e == null) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            this.f168490e = frameLayout;
            frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
            addView(this.f168490e, getChildCount() > 0 ? 0 : -1);
        }
    }

    public abstract void e(int i17);

    public final void f() {
        c();
        b(mo52201xb80254d6());
        if (!this.f168495m) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8 p8Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8) this;
            if (p8Var.A == null) {
                p8Var.c();
            }
            android.widget.ImageView imageView = p8Var.D;
            if (imageView == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandPullDownWebView", "startLoadingAnimation, mLoading0 is null");
            } else {
                if (imageView.getDrawable() == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandPullDownWebView", "startLoadingAnimation but drawable is null, try protect");
                    p8Var.j();
                    p8Var.B.setTextColor(-16777216);
                    p8Var.B.setAlpha(0.2f);
                }
                ((android.graphics.drawable.AnimationDrawable) p8Var.D.getDrawable()).start();
                ((android.graphics.drawable.AnimationDrawable) p8Var.E.getDrawable()).start();
                ((android.graphics.drawable.AnimationDrawable) p8Var.F.getDrawable()).start();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.q8 q8Var = p8Var.f168534u;
            if (q8Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.C12500x2ca3e0) q8Var).f167919a;
                if (aVar.F() != null) {
                    ((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) aVar.F()).d("onPullDownRefresh", null, new int[]{((com.p314xaae8f345.p425x1ea3c036.sdk.p437x60b7c31.p438xac8f1cfd.b) aVar.F()).mo50260x9f1221c2()});
                }
            }
            p8Var.H = java.lang.System.currentTimeMillis();
        }
        this.f168496n = true;
        this.f168495m = true;
        this.f168497o = true;
    }

    /* renamed from: getOpenHeight */
    public int m52199xef6afc07() {
        return this.f168489d.getHeight();
    }

    /* renamed from: getPullDownBackgroundColor */
    public int m52200x2310fb18() {
        android.widget.FrameLayout frameLayout = this.f168490e;
        if (frameLayout == null) {
            return 0;
        }
        android.graphics.drawable.Drawable background = frameLayout.getBackground();
        if (background instanceof android.graphics.drawable.ColorDrawable) {
            return ((android.graphics.drawable.ColorDrawable) background).getColor();
        }
        return 0;
    }

    /* renamed from: getStayHeight */
    public int mo52201xb80254d6() {
        android.view.View view = this.f168489d;
        if (view == null) {
            return 0;
        }
        return view.getHeight();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        if (this.f168493h) {
            return this.f168497o;
        }
        int action = motionEvent.getAction();
        if (action == 3 || action == 1) {
            this.f168496n = false;
            this.f168501s = false;
            return false;
        }
        if (action == 2 && this.f168496n) {
            return true;
        }
        if (action != 0) {
            if (action == 2 && ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8) this).f168539z.p0()) {
                if (!this.f168501s) {
                    this.f168498p = (int) motionEvent.getX();
                    this.f168499q = (int) motionEvent.getY();
                    this.f168500r = (int) motionEvent.getY();
                    this.f168496n = false;
                    this.f168501s = true;
                    return false;
                }
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                int i17 = x17 - this.f168498p;
                int i18 = y17 - this.f168499q;
                if (java.lang.Math.abs(i18) > this.f168492g && java.lang.Math.abs(i18) > java.lang.Math.abs(i17) && i18 > 0) {
                    this.f168498p = x17;
                    this.f168499q = y17;
                    this.f168496n = true;
                    this.f168501s = false;
                    return true;
                }
            }
        } else if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8) this).f168539z.p0()) {
            this.f168498p = (int) motionEvent.getX();
            this.f168499q = (int) motionEvent.getY();
            this.f168500r = (int) motionEvent.getY();
            this.f168496n = false;
            this.f168501s = true;
        }
        return this.f168496n || this.f168497o;
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
            boolean r0 = r4.f168493h
            if (r0 == 0) goto Le
            boolean r5 = r4.f168497o
            if (r5 == 0) goto Lb
            r4.a()
        Lb:
            boolean r5 = r4.f168497o
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
            boolean r0 = r4.f168496n
            if (r0 != 0) goto L35
            boolean r0 = r4.f168497o
            if (r0 == 0) goto Lb5
        L35:
            boolean r0 = r4.f168501s
            if (r0 != 0) goto L51
            float r0 = r5.getY()
            int r0 = (int) r0
            r4.f168499q = r0
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.f168498p = r0
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f168500r = r5
            r4.f168501s = r2
            return r2
        L51:
            float r5 = r5.getY()
            int r5 = (int) r5
            int r0 = r4.f168500r
            int r5 = r5 - r0
            int r5 = r5 >> r2
            int r0 = r4.m52198x934ee2a4()
            if (r5 <= r0) goto L61
            r5 = r0
        L61:
            boolean r0 = r4.f168495m
            if (r0 == 0) goto L6a
            int r0 = r4.mo52201xb80254d6()
            int r5 = r5 + r0
        L6a:
            int r5 = java.lang.Math.max(r5, r1)
            int r0 = r4.m52198x934ee2a4()
            int r0 = java.lang.Math.min(r0, r5)
            android.widget.FrameLayout r1 = r4.f168491f
            float r0 = (float) r0
            r1.setTranslationY(r0)
            r4.e(r5)
            return r2
        L80:
            r4.f168501s = r1
            android.widget.FrameLayout r5 = r4.f168491f
            float r5 = r5.getTranslationY()
            int r0 = r4.m52199xef6afc07()
            float r0 = (float) r0
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 <= 0) goto L99
            boolean r5 = r4.f168494i
            if (r5 == 0) goto L99
            r4.f()
            return r2
        L99:
            boolean r5 = r4.f168496n
            if (r5 != 0) goto La1
            boolean r5 = r4.f168497o
            if (r5 == 0) goto Lb5
        La1:
            r4.a()
            return r2
        La5:
            r0 = r4
            com.tencent.mm.plugin.appbrand.page.p8 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p8) r0
            com.tencent.mm.plugin.appbrand.page.fb r0 = r0.f168539z
            boolean r0 = r0.p0()
            if (r0 != 0) goto Lb6
            boolean r0 = r4.f168497o
            if (r0 == 0) goto Lb5
            goto Lb6
        Lb5:
            return r1
        Lb6:
            float r0 = r5.getY()
            int r0 = (int) r0
            r4.f168499q = r0
            float r0 = r5.getX()
            int r0 = (int) r0
            r4.f168498p = r0
            float r5 = r5.getY()
            int r5 = (int) r5
            r4.f168500r = r5
            r4.f168501s = r2
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.o8.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setBackgroundView */
    public final void m52202xba4f1f5(android.view.View view) {
        this.f168489d = view;
        d();
        this.f168490e.addView(view);
    }

    /* renamed from: setContentView */
    public final void m52203x590ab8fc(android.view.View view) {
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
        this.f168491f = frameLayout;
        frameLayout.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f168491f.addView(view);
        addView(this.f168491f);
    }

    /* renamed from: setNeedStay */
    public void m52204xaa2b6691(boolean z17) {
        this.f168494i = z17;
    }

    /* renamed from: setPullDownBackgroundColor */
    public void m52205x3940e08c(int i17) {
        if (this.f168490e == null) {
            if (i17 == 0) {
                return;
            } else {
                d();
            }
        }
        this.f168490e.setBackgroundColor(i17);
    }

    /* renamed from: setPullDownEnabled */
    public void m52206x8e3d1bf8(boolean z17) {
        this.f168493h = !z17;
    }
}

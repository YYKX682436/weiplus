package com.p314xaae8f345.mm.ui.p2747xd1075a44;

/* renamed from: com.tencent.mm.ui.widget.SwipeBackLayout */
/* loaded from: classes15.dex */
public class C22649x858f5ab extends android.widget.FrameLayout implements xn5.a0 {

    /* renamed from: J, reason: collision with root package name */
    public static final /* synthetic */ int f292958J = 0;
    public al5.e3 A;
    public al5.h3 B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public al5.f3 I;

    /* renamed from: d, reason: collision with root package name */
    public final float f292959d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f292960e;

    /* renamed from: f, reason: collision with root package name */
    public int f292961f;

    /* renamed from: g, reason: collision with root package name */
    public int f292962g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f292963h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f292964i;

    /* renamed from: m, reason: collision with root package name */
    public ii5.c f292965m;

    /* renamed from: n, reason: collision with root package name */
    public float f292966n;

    /* renamed from: o, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f292967o;

    /* renamed from: p, reason: collision with root package name */
    public float f292968p;

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.Rect f292969q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f292970r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f292971s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f292972t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f292973u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f292974v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f292975w;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f292976x;

    /* renamed from: y, reason: collision with root package name */
    public al5.g3 f292977y;

    /* renamed from: z, reason: collision with root package name */
    public android.graphics.drawable.Drawable f292978z;

    public C22649x858f5ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean a() {
        if (!this.f292974v) {
            return false;
        }
        if (java.lang.Float.compare(this.f292964i.getLeft(), 1.0E-5f) > 0) {
            return true;
        }
        this.f292974v = false;
        return false;
    }

    public boolean b(android.view.MotionEvent motionEvent) {
        try {
            ii5.c cVar = this.f292965m;
            if (cVar.f373163a == 1) {
                cVar.l(motionEvent);
                return true;
            }
            boolean r17 = cVar.r(motionEvent);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "handleTouchEvent intercept=" + r17);
            return r17;
        } catch (java.lang.ArrayIndexOutOfBoundsException | java.lang.IllegalArgumentException | java.lang.IllegalStateException | java.lang.NullPointerException unused) {
            return false;
        }
    }

    public void c() {
        ii5.c cVar = new ii5.c(getContext(), this, new al5.n3(this, null), android.view.animation.AnimationUtils.loadInterpolator(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559355cg));
        this.f292965m = cVar;
        cVar.f373181s = 1;
        float f17 = getResources().getDisplayMetrics().density;
        ii5.c cVar2 = this.f292965m;
        cVar2.f373177o = 100.0f * f17;
        cVar2.f373176n = f17 * 300.0f;
        this.f292961f = 0;
        this.f292962g = 0;
        java.util.LinkedList linkedList = al5.a3.f87397a;
        this.C = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20047x9fb82942()) == 1;
        this.D = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2518x55bb7a46.C20048xae20e14e()) == 1;
        this.E = j62.e.g().i("clicfg_chatting_ui_swipe_back_finish_protect", 1, true, true) == 1;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f292968p = java.lang.Math.max(0.0f, 1.0f - this.f292966n);
        ii5.c cVar = this.f292965m;
        if (cVar.f373163a == 2) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s sVar = cVar.f373182t;
            boolean computeScrollOffset = sVar.f92637a.computeScrollOffset();
            android.widget.OverScroller overScroller = sVar.f92637a;
            int currX = overScroller.getCurrX();
            int b17 = sVar.b();
            int left = currX - cVar.f373184v.getLeft();
            int top = b17 - cVar.f373184v.getTop();
            if (left != 0) {
                cVar.f373184v.offsetLeftAndRight(left);
            }
            if (top != 0) {
                cVar.f373184v.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                cVar.k(cVar.f373184v, currX, b17, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && b17 == overScroller.getFinalY()) {
                sVar.a();
                computeScrollOffset = sVar.c();
            }
            if (!computeScrollOffset) {
                cVar.f373186x.post(cVar.f373188z);
            }
        }
        if (cVar.f373163a == 2) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    public void d(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "ashutest::markTranslucent %B", java.lang.Boolean.valueOf(z17));
        this.f292972t = z17;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(final android.view.MotionEvent motionEvent) {
        motionEvent.getAction();
        int i17 = this.f292965m.f373163a;
        if (!this.f292963h) {
            if (this.f292965m.f373163a == 1 && motionEvent.getAction() == 3) {
                ((ku5.t0) ku5.t0.f394148d).B(new java.lang.Runnable() { // from class: al5.b3$$a
                    @Override // java.lang.Runnable
                    public final void run() {
                        android.view.MotionEvent motionEvent2 = motionEvent;
                        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab.f292958J;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab c22649x858f5ab = com.p314xaae8f345.mm.ui.p2747xd1075a44.C22649x858f5ab.this;
                        c22649x858f5ab.getClass();
                        try {
                            c22649x858f5ab.f292965m.l(motionEvent2);
                        } catch (java.lang.Throwable th6) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SwipeBackLayout", th6, "", new java.lang.Object[0]);
                        }
                    }
                });
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        al5.g3 g3Var = this.f292977y;
        if (g3Var != null && g3Var.mo2163xd71108fe()) {
            if (!this.f292977y.d0()) {
                this.f292977y.a(motionEvent);
            } else {
                if (this.f292977y.e() == 1) {
                    this.f292977y.a(motionEvent);
                    return true;
                }
                if (this.f292977y.d(motionEvent)) {
                    motionEvent.setAction(3);
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
            }
        }
        if (motionEvent.getAction() == 0) {
            this.G = false;
        }
        if (!this.G && !a()) {
            if (this.F && this.E) {
                return super.dispatchTouchEvent(motionEvent);
            }
            try {
                ii5.c cVar = this.f292965m;
                if (cVar.f373163a == 1) {
                    cVar.l(motionEvent);
                    return true;
                }
                if (!cVar.r(motionEvent)) {
                    super.dispatchTouchEvent(motionEvent);
                    return true;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("changelcai", "shouldInterceptTouchEvent %s", motionEvent);
                motionEvent.setAction(3);
                super.dispatchTouchEvent(motionEvent);
                return true;
            } catch (java.lang.ArrayIndexOutOfBoundsException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SwipeBackLayout", e17, "got an ArrayIndexOutOfBoundsException", new java.lang.Object[0]);
                return false;
            } catch (java.lang.IllegalArgumentException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SwipeBackLayout", e18, "got an IllegalArgumentException", new java.lang.Object[0]);
                return false;
            } catch (java.lang.IllegalStateException e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SwipeBackLayout", e19, "got an IllegalStateException", new java.lang.Object[0]);
                return false;
            } catch (java.lang.NullPointerException e27) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SwipeBackLayout", e27, "got an NullPointerException", new java.lang.Object[0]);
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        boolean z17 = java.lang.Float.compare(this.f292968p, 0.0f) > 0 && (view == this.f292964i) && this.f292965m.f373163a != 0;
        if (this.f292965m.f373187y && z17) {
            canvas.drawColor(((int) (this.f292968p * 153.0f)) << 24);
        }
        boolean drawChild = super.drawChild(canvas, view, j17);
        if (!this.f292965m.f373187y && z17) {
            android.graphics.Rect rect = this.f292969q;
            view.getHitRect(rect);
            int i17 = rect.left;
            android.graphics.drawable.Drawable drawable = this.f292967o;
            drawable.setBounds(i17 - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            drawable.setAlpha((int) (this.f292968p * 255.0f));
            drawable.draw(canvas);
        }
        return drawChild;
    }

    public final void e(float f17) {
        if (this.f292965m.f373187y) {
            return;
        }
        al5.a3.b(f17);
    }

    /* renamed from: getSwipeBackListener */
    public al5.g3 m81443x5b966a5f() {
        return this.f292977y;
    }

    /* renamed from: getTargetContentView */
    public android.view.View m81444x1eccc7b7() {
        return this.f292964i;
    }

    @Override // android.view.View, xn5.a0
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f292964i = this;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f292960e = true;
        if (this.f292976x != null) {
            super.onLayout(z17, i17, i18, i19, i27);
        }
        android.view.View view = this.f292964i;
        if (view != null) {
            int i28 = this.f292961f;
            view.layout(i28, this.f292962g, view.getMeasuredWidth() + i28, this.f292962g + this.f292964i.getMeasuredHeight());
        }
        this.f292960e = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f292960e) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: setAutoResetToNoTranslucent */
    public void m81445xc09d199f(boolean z17) {
        this.D = z17;
    }

    /* renamed from: setContentView */
    public void m81446x590ab8fc(android.view.View view) {
        this.f292964i = view;
    }

    /* renamed from: setDragListener */
    public void m81447x71eb6f8a(al5.e3 e3Var) {
        this.A = e3Var;
    }

    /* renamed from: setEdgeSize */
    public void m81448xd1d239e0(int i17) {
        this.f292965m.f373178p = i17;
    }

    /* renamed from: setEdgeSizeAndInitEdgeTouched */
    public void m81449xa390ef9a(int i17) {
        float[] fArr;
        float[] fArr2;
        ii5.c cVar = this.f292965m;
        cVar.f373178p = i17;
        int[] iArr = cVar.f373171i;
        if (iArr == null || (fArr = cVar.f373166d) == null || (fArr2 = cVar.f373167e) == null) {
            return;
        }
        int i18 = cVar.f373170h;
        if ((iArr[i18] & cVar.f373181s) == 0) {
            iArr[i18] = cVar.j((int) fArr[i18], (int) fArr2[i18]);
        }
    }

    /* renamed from: setEnableGesture */
    public void m81450x8e764904(boolean z17) {
        this.f292963h = z17;
    }

    /* renamed from: setFloatView */
    public void m81451xdde974df(android.view.View view) {
        this.f292976x = view;
    }

    /* renamed from: setLikeIOSAnim */
    public void m81452x86e3665(boolean z17) {
        this.C = z17;
    }

    /* renamed from: setNeedChangeWindowBackground */
    public void m81453x79889b46(boolean z17) {
        this.H = z17;
    }

    /* renamed from: setNeedRequestActivityTranslucent */
    public void m81454x4335bff3(boolean z17) {
        this.f292970r = z17;
        if (z17) {
            this.f292971s = false;
        }
    }

    /* renamed from: setOnceDisEnableGesture */
    public void m81455x782e547b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", java.lang.Boolean.valueOf(z17));
        this.G = z17;
    }

    /* renamed from: setSwipeBackListener */
    public void m81456x372c76d3(al5.g3 g3Var) {
        this.f292977y = g3Var;
    }

    /* renamed from: setSwipeGestureDelegate */
    public void m81457xeb590ed6(al5.f3 f3Var) {
        this.I = f3Var;
    }

    /* renamed from: setTryCaptureViewInterceptor */
    public void m81458xe4f81b73(al5.h3 h3Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SwipeBackLayout", "[setTryCaptureViewInterceptor] interceptor=%s", h3Var);
        this.B = h3Var;
    }

    /* renamed from: setVerticalSwipe */
    public void m81459xd474422(boolean z17) {
        this.f292965m.f373187y = z17;
    }

    public C22649x858f5ab(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f292959d = 0.3f;
        this.f292963h = true;
        this.f292969q = new android.graphics.Rect();
        this.f292970r = true;
        this.f292971s = false;
        this.f292972t = false;
        this.f292973u = false;
        this.f292974v = false;
        this.f292975w = false;
        this.f292976x = null;
        this.C = false;
        this.D = false;
        this.E = false;
        this.F = false;
        this.H = true;
        this.I = null;
        this.f292967o = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.brk);
        setFocusable(true);
        setDescendantFocusability(262144);
        c();
    }
}

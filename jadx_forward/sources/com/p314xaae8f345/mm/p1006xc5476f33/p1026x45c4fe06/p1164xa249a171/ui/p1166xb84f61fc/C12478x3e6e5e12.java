package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc;

/* renamed from: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView */
/* loaded from: classes8.dex */
public class C12478x3e6e5e12 extends android.widget.RelativeLayout implements im5.a {
    public static final int F = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561264dn);
    public static final int G = com.p314xaae8f345.mm.ui.zk.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
    public float A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f167806d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f167807e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f167808f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 f167809g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.VelocityTracker f167810h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f167811i;

    /* renamed from: m, reason: collision with root package name */
    public fi1.t f167812m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f167813n;

    /* renamed from: o, reason: collision with root package name */
    public int f167814o;

    /* renamed from: p, reason: collision with root package name */
    public int f167815p;

    /* renamed from: q, reason: collision with root package name */
    public int f167816q;

    /* renamed from: r, reason: collision with root package name */
    public float f167817r;

    /* renamed from: s, reason: collision with root package name */
    public float f167818s;

    /* renamed from: t, reason: collision with root package name */
    public float f167819t;

    /* renamed from: u, reason: collision with root package name */
    public float f167820u;

    /* renamed from: v, reason: collision with root package name */
    public float f167821v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f167822w;

    /* renamed from: x, reason: collision with root package name */
    public int f167823x;

    /* renamed from: y, reason: collision with root package name */
    public float f167824y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f167825z;

    public C12478x3e6e5e12(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12 c12478x3e6e5e12) {
        android.content.Context context = c12478x3e6e5e12.getContext();
        android.graphics.Point b17 = com.p314xaae8f345.mm.ui.bl.b(context);
        android.util.Size size = new android.util.Size(b17.x, b17.y);
        int c17 = com.p314xaae8f345.mm.ui.bl.c(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "ScreenInfo#<init>, navigationBarHeight: " + c17);
        int height = size.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        c12478x3e6e5e12.getWindowVisibleDisplayFrame(rect);
        rect.toString();
        int width = rect.width();
        int height2 = rect.height();
        if (!c12478x3e6e5e12.f167811i ? width > height2 : width <= height2) {
            width = height2;
            height2 = width;
        }
        android.util.Size size2 = new android.util.Size(width, height2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "calculateWindowSizeWorkaround, windowSize: " + size2);
        int min = java.lang.Math.min(size2.getHeight(), height);
        c12478x3e6e5e12.f167815p = java.lang.Math.max(0, c12478x3e6e5e12.m52080x130b0d78() - (height - (c17 + min)));
        float f17 = min;
        c12478x3e6e5e12.A = f17;
        android.widget.LinearLayout linearLayout = c12478x3e6e5e12.f167806d;
        linearLayout.setTranslationY(f17);
        c12478x3e6e5e12.c();
        c12478x3e6e5e12.f167814o = linearLayout.getMeasuredHeight();
        int measuredHeight = c12478x3e6e5e12.f167807e.getMeasuredHeight();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = c12478x3e6e5e12.f167809g;
        if (c22633x83752a59 != null) {
            int i17 = c12478x3e6e5e12.f167814o - measuredHeight;
            if (c22633x83752a59.getMeasuredHeight() != i17) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c12478x3e6e5e12.f167809g.getLayoutParams();
                layoutParams.height = i17;
                c12478x3e6e5e12.f167809g.setLayoutParams(layoutParams);
            }
            int i18 = min - (height / 2);
            c12478x3e6e5e12.f167816q = i18;
            c12478x3e6e5e12.f167816q = java.lang.Math.max(0, i18);
        }
    }

    /* renamed from: getFullScreenTopRemainPx */
    private int m52080x130b0d78() {
        return this.f167811i ? G : F;
    }

    public final void b(float f17, float f18, long j17, boolean z17) {
        if (f18 == f17) {
            this.C = z17;
            this.A = f18;
            return;
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, f18);
        ofFloat.setDuration(j17);
        ofFloat.setInterpolator(new android.view.animation.DecelerateInterpolator());
        ofFloat.addUpdateListener(new fi1.h(this));
        ofFloat.addListener(new fi1.i(this, z17));
        ofFloat.start();
    }

    public final void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12479xe0723f03 c12479xe0723f03;
        if (this.f167809g == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "dispatchContentVisibleHeightChange, contentArea is null");
            return;
        }
        int max = java.lang.Math.max(0, (int) (r0.getHeight() - this.f167806d.getTranslationY()));
        fi1.t tVar = this.f167812m;
        if (tVar != null) {
            fi1.e eVar = (fi1.e) tVar;
            java.lang.Integer num = eVar.f344313a;
            if (num != null && max == num.intValue()) {
                return;
            }
            ei1.a aVar = eVar.f344314b.f344317g;
            if (aVar != null && (c12479xe0723f03 = ((zh1.g) aVar).f554417a.f554451m) != null) {
                c12479xe0723f03.m52092xebf95006(ik1.w.d(max));
            }
            eVar.f344313a = java.lang.Integer.valueOf(max);
        }
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "dead");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59 = this.f167809g;
        if (c22633x83752a59 != null) {
            c22633x83752a59.mo52095x5cd39ffa();
        }
    }

    /* renamed from: hide */
    public void m52081x30dd42() {
        android.widget.LinearLayout linearLayout = this.f167806d;
        linearLayout.getTranslationY();
        this.D = false;
        linearLayout.animate().translationY(this.f167814o).setDuration(this.C ? 300L : 200L).setInterpolator(new android.view.animation.AccelerateInterpolator()).setUpdateListener(new fi1.r(this)).setListener(new fi1.q(this)).start();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        int intValue;
        boolean z17;
        motionEvent.getAction();
        boolean onInterceptTouchEvent = super.onInterceptTouchEvent(motionEvent);
        if (onInterceptTouchEvent) {
            return true;
        }
        android.view.VelocityTracker velocityTracker = this.f167810h;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        java.util.LinkedList linkedList = this.f167822w;
        if (actionMasked == 0) {
            linkedList.addFirst(0);
            this.f167817r = motionEvent.getX();
            this.f167818s = motionEvent.getY();
            return onInterceptTouchEvent;
        }
        if (actionMasked == 1) {
            linkedList.clear();
            this.f167823x = -1;
            this.f167824y = 0.0f;
            this.f167825z = false;
        } else {
            if (actionMasked != 2) {
                return onInterceptTouchEvent;
            }
            if (linkedList.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, empty activePointerIds");
                intValue = 0;
            } else {
                intValue = ((java.lang.Integer) linkedList.getFirst()).intValue();
            }
            int findPointerIndex = motionEvent.findPointerIndex(intValue);
            if (findPointerIndex < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, invalid pointerIndex");
                findPointerIndex = 0;
            }
            if (motionEvent.getY(findPointerIndex) >= this.f167806d.getTranslationY()) {
                float abs = java.lang.Math.abs(motionEvent.getX(findPointerIndex) - this.f167817r);
                float y17 = motionEvent.getY(findPointerIndex) - this.f167818s;
                float abs2 = java.lang.Math.abs(y17);
                velocityTracker.computeCurrentVelocity(1000);
                float abs3 = java.lang.Math.abs(velocityTracker.getXVelocity());
                float abs4 = java.lang.Math.abs(velocityTracker.getYVelocity());
                if (abs2 < 5.0f || abs2 <= abs || abs4 <= 0.0f || abs4 <= abs3 || !this.D) {
                    return onInterceptTouchEvent;
                }
                if (this.C) {
                    if (0.0f <= y17) {
                        z17 = this.B;
                    }
                } else {
                    if (0.0f > y17) {
                        return true;
                    }
                    z17 = this.B;
                }
                return z17;
            }
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        int intValue;
        motionEvent.getAction();
        int actionMasked = motionEvent.getActionMasked();
        int i17 = 0;
        if (actionMasked == 0) {
            this.f167822w.addFirst(0);
            this.f167819t = motionEvent.getX();
            this.f167820u = motionEvent.getY();
            return true;
        }
        if (actionMasked == 1) {
            boolean z17 = this.C;
            if (!this.E) {
                if (z17) {
                    float f17 = this.f167821v;
                    if ((0.0f < f17 && ((float) this.f167814o) * 0.15f <= java.lang.Math.abs(f17)) && this.f167813n) {
                        m52081x30dd42();
                    } else {
                        b(this.f167806d.getTranslationY(), this.f167815p, 200L, true);
                    }
                } else {
                    float f18 = this.f167821v;
                    if ((0.0f < f18 && ((float) this.f167814o) * 0.15f <= java.lang.Math.abs(f18)) && this.f167813n) {
                        m52081x30dd42();
                    } else {
                        float f19 = this.f167821v;
                        if (0.0f > f19 && ((float) this.f167814o) * 0.05f <= java.lang.Math.abs(f19)) {
                            b(this.f167806d.getTranslationY(), this.f167815p, 200L, true);
                        } else {
                            b(this.f167806d.getTranslationY(), this.f167816q, 200L, false);
                        }
                    }
                }
            }
            this.f167819t = 0.0f;
            this.f167820u = 0.0f;
            this.f167822w.clear();
            this.f167823x = -1;
            this.f167824y = 0.0f;
            this.f167825z = false;
        } else if (actionMasked == 2) {
            if (this.f167822w.isEmpty()) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, active pointerId not exist");
                intValue = 0;
            } else {
                intValue = ((java.lang.Integer) this.f167822w.getFirst()).intValue();
            }
            int findPointerIndex = motionEvent.findPointerIndex(intValue);
            if (findPointerIndex < 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, pointerIndex is illegal");
            } else {
                i17 = findPointerIndex;
            }
            if (0.0f == this.f167819t && 0.0f == this.f167820u) {
                this.f167822w.addFirst(0);
                this.f167819t = motionEvent.getX(i17);
                this.f167820u = motionEvent.getY(i17);
            } else {
                int i18 = this.f167823x;
                if (-1 != i18 && i18 != intValue) {
                    this.f167824y = this.f167821v;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, active pointerId changed, disMoveFromDownExceptCurPointerId: " + this.f167824y);
                }
                float x17 = motionEvent.getX(i17) - this.f167819t;
                float y17 = (motionEvent.getY(i17) - this.f167820u) + this.f167824y;
                if (java.lang.Math.abs(y17) > java.lang.Math.abs(x17)) {
                    if (this.f167825z && 0.0f > y17) {
                        ((ku5.t0) ku5.t0.f394148d).B(new fi1.s(this, motionEvent));
                    } else if (this.f167813n || 0.0f >= y17) {
                        if (!this.E) {
                            float f27 = 0.68f * y17;
                            this.f167821v = f27;
                            this.f167806d.setTranslationY(java.lang.Math.min(this.f167814o, java.lang.Math.max(this.f167815p, this.A + f27)));
                            c();
                        }
                        if (this.f167815p >= this.f167806d.getTranslationY()) {
                            this.f167825z = true;
                        }
                    }
                }
                this.f167821v = y17;
                this.f167823x = intValue;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            this.f167822w.addFirst(java.lang.Integer.valueOf(pointerId));
            this.f167819t = motionEvent.getX(actionIndex);
            this.f167820u = motionEvent.getY(actionIndex);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, pointer down, pointerId: %d, x: %f, y: %f", java.lang.Integer.valueOf(pointerId), java.lang.Float.valueOf(this.f167819t), java.lang.Float.valueOf(this.f167820u));
        } else if (actionMasked == 6) {
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f167822w.remove(java.lang.Integer.valueOf(pointerId2));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, pointer up, pointerId: %d", java.lang.Integer.valueOf(pointerId2));
        }
        return super.onTouchEvent(motionEvent);
    }

    /* renamed from: setAllowScroll2Hide */
    public void m52082xd0978360(boolean z17) {
        this.f167813n = z17;
    }

    /* renamed from: setContentView */
    public void m52083x590ab8fc(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22633x83752a59 c22633x83752a59) {
        this.f167808f.addView(c22633x83752a59, -1, -1);
        c22633x83752a59.D0(new fi1.m(this));
        this.f167809g = c22633x83752a59;
    }

    /* renamed from: setListener */
    public void m52084xc6cf6336(fi1.t tVar) {
        this.f167812m = tVar;
    }

    /* renamed from: setTitleView */
    public void m52085xdc7516db(android.view.View view) {
        this.f167807e.addView(view, -1, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x007d, code lost:
    
        if (2 == getContext().getResources().getConfiguration().orientation) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C12478x3e6e5e12(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f167810h = r4
            r4 = 0
            r2.f167812m = r4
            r4 = 1
            r2.f167813n = r4
            r5 = 0
            r2.f167814o = r5
            r2.f167815p = r5
            r2.f167816q = r5
            r0 = 0
            r2.f167817r = r0
            r2.f167818s = r0
            r2.f167819t = r0
            r2.f167820u = r0
            r2.f167821v = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2.f167822w = r1
            r1 = -1
            r2.f167823x = r1
            r2.f167824y = r0
            r2.f167825z = r5
            r2.A = r0
            r2.B = r4
            r2.C = r5
            r2.D = r5
            r2.E = r5
            android.view.LayoutInflater r3 = android.view.LayoutInflater.from(r3)
            r0 = 2131498715(0x7f0c16db, float:1.862106E38)
            r3.inflate(r0, r2, r4)
            r3 = 2131316038(0x7f094d46, float:1.8250546E38)
            android.view.View r3 = r2.findViewById(r3)
            r0 = 2131316035(0x7f094d43, float:1.825054E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f167806d = r0
            r0 = 2131316039(0x7f094d47, float:1.8250548E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f167807e = r0
            r0 = 2131316036(0x7f094d44, float:1.8250542E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.f167808f = r0
            r2.setFitsSystemWindows(r4)
            android.content.Context r0 = r2.getContext()     // Catch: java.lang.Exception -> L80
            android.content.res.Resources r0 = r0.getResources()     // Catch: java.lang.Exception -> L80
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch: java.lang.Exception -> L80
            int r0 = r0.orientation     // Catch: java.lang.Exception -> L80
            r1 = 2
            if (r1 != r0) goto L94
            goto L95
        L80:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isLandscape fail since "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r0 = "MicroMsg.AppBrand.HybridOpenMaterialView"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r4)
        L94:
            r4 = r5
        L95:
            r2.f167811i = r4
            fi1.j r4 = new fi1.j
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout r3 = r2.f167807e
            fi1.k r4 = new fi1.k
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            fi1.l r4 = new fi1.l
            r4.<init>(r2)
            r3.addOnGlobalLayoutListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.ui.p1166xb84f61fc.C12478x3e6e5e12.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

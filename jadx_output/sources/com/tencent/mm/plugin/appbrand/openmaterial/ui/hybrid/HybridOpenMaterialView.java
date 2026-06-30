package com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid;

/* loaded from: classes8.dex */
public class HybridOpenMaterialView extends android.widget.RelativeLayout implements im5.a {
    public static final int F = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479731dn);
    public static final int G = com.tencent.mm.ui.zk.e(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479704cz);
    public float A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f86273d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f86274e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.FrameLayout f86275f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMWebView f86276g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.VelocityTracker f86277h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f86278i;

    /* renamed from: m, reason: collision with root package name */
    public fi1.t f86279m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f86280n;

    /* renamed from: o, reason: collision with root package name */
    public int f86281o;

    /* renamed from: p, reason: collision with root package name */
    public int f86282p;

    /* renamed from: q, reason: collision with root package name */
    public int f86283q;

    /* renamed from: r, reason: collision with root package name */
    public float f86284r;

    /* renamed from: s, reason: collision with root package name */
    public float f86285s;

    /* renamed from: t, reason: collision with root package name */
    public float f86286t;

    /* renamed from: u, reason: collision with root package name */
    public float f86287u;

    /* renamed from: v, reason: collision with root package name */
    public float f86288v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.LinkedList f86289w;

    /* renamed from: x, reason: collision with root package name */
    public int f86290x;

    /* renamed from: y, reason: collision with root package name */
    public float f86291y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f86292z;

    public HybridOpenMaterialView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void a(com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView hybridOpenMaterialView) {
        android.content.Context context = hybridOpenMaterialView.getContext();
        android.graphics.Point b17 = com.tencent.mm.ui.bl.b(context);
        android.util.Size size = new android.util.Size(b17.x, b17.y);
        int c17 = com.tencent.mm.ui.bl.c(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "ScreenInfo#<init>, navigationBarHeight: " + c17);
        int height = size.getHeight();
        android.graphics.Rect rect = new android.graphics.Rect();
        hybridOpenMaterialView.getWindowVisibleDisplayFrame(rect);
        rect.toString();
        int width = rect.width();
        int height2 = rect.height();
        if (!hybridOpenMaterialView.f86278i ? width > height2 : width <= height2) {
            width = height2;
            height2 = width;
        }
        android.util.Size size2 = new android.util.Size(width, height2);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "calculateWindowSizeWorkaround, windowSize: " + size2);
        int min = java.lang.Math.min(size2.getHeight(), height);
        hybridOpenMaterialView.f86282p = java.lang.Math.max(0, hybridOpenMaterialView.getFullScreenTopRemainPx() - (height - (c17 + min)));
        float f17 = min;
        hybridOpenMaterialView.A = f17;
        android.widget.LinearLayout linearLayout = hybridOpenMaterialView.f86273d;
        linearLayout.setTranslationY(f17);
        hybridOpenMaterialView.c();
        hybridOpenMaterialView.f86281o = linearLayout.getMeasuredHeight();
        int measuredHeight = hybridOpenMaterialView.f86274e.getMeasuredHeight();
        com.tencent.mm.ui.widget.MMWebView mMWebView = hybridOpenMaterialView.f86276g;
        if (mMWebView != null) {
            int i17 = hybridOpenMaterialView.f86281o - measuredHeight;
            if (mMWebView.getMeasuredHeight() != i17) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) hybridOpenMaterialView.f86276g.getLayoutParams();
                layoutParams.height = i17;
                hybridOpenMaterialView.f86276g.setLayoutParams(layoutParams);
            }
            int i18 = min - (height / 2);
            hybridOpenMaterialView.f86283q = i18;
            hybridOpenMaterialView.f86283q = java.lang.Math.max(0, i18);
        }
    }

    private int getFullScreenTopRemainPx() {
        return this.f86278i ? G : F;
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
        com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.OpenMaterialJsBridge openMaterialJsBridge;
        if (this.f86276g == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "dispatchContentVisibleHeightChange, contentArea is null");
            return;
        }
        int max = java.lang.Math.max(0, (int) (r0.getHeight() - this.f86273d.getTranslationY()));
        fi1.t tVar = this.f86279m;
        if (tVar != null) {
            fi1.e eVar = (fi1.e) tVar;
            java.lang.Integer num = eVar.f262780a;
            if (num != null && max == num.intValue()) {
                return;
            }
            ei1.a aVar = eVar.f262781b.f262784g;
            if (aVar != null && (openMaterialJsBridge = ((zh1.g) aVar).f472884a.f472918m) != null) {
                openMaterialJsBridge.onWindowHeightChange(ik1.w.d(max));
            }
            eVar.f262780a = java.lang.Integer.valueOf(max);
        }
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "dead");
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f86276g;
        if (mMWebView != null) {
            mMWebView.destroy();
        }
    }

    public void hide() {
        android.widget.LinearLayout linearLayout = this.f86273d;
        linearLayout.getTranslationY();
        this.D = false;
        linearLayout.animate().translationY(this.f86281o).setDuration(this.C ? 300L : 200L).setInterpolator(new android.view.animation.AccelerateInterpolator()).setUpdateListener(new fi1.r(this)).setListener(new fi1.q(this)).start();
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
        android.view.VelocityTracker velocityTracker = this.f86277h;
        velocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        java.util.LinkedList linkedList = this.f86289w;
        if (actionMasked == 0) {
            linkedList.addFirst(0);
            this.f86284r = motionEvent.getX();
            this.f86285s = motionEvent.getY();
            return onInterceptTouchEvent;
        }
        if (actionMasked == 1) {
            linkedList.clear();
            this.f86290x = -1;
            this.f86291y = 0.0f;
            this.f86292z = false;
        } else {
            if (actionMasked != 2) {
                return onInterceptTouchEvent;
            }
            if (linkedList.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, empty activePointerIds");
                intValue = 0;
            } else {
                intValue = ((java.lang.Integer) linkedList.getFirst()).intValue();
            }
            int findPointerIndex = motionEvent.findPointerIndex(intValue);
            if (findPointerIndex < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onInterceptTouchEvent, move, invalid pointerIndex");
                findPointerIndex = 0;
            }
            if (motionEvent.getY(findPointerIndex) >= this.f86273d.getTranslationY()) {
                float abs = java.lang.Math.abs(motionEvent.getX(findPointerIndex) - this.f86284r);
                float y17 = motionEvent.getY(findPointerIndex) - this.f86285s;
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
            this.f86289w.addFirst(0);
            this.f86286t = motionEvent.getX();
            this.f86287u = motionEvent.getY();
            return true;
        }
        if (actionMasked == 1) {
            boolean z17 = this.C;
            if (!this.E) {
                if (z17) {
                    float f17 = this.f86288v;
                    if ((0.0f < f17 && ((float) this.f86281o) * 0.15f <= java.lang.Math.abs(f17)) && this.f86280n) {
                        hide();
                    } else {
                        b(this.f86273d.getTranslationY(), this.f86282p, 200L, true);
                    }
                } else {
                    float f18 = this.f86288v;
                    if ((0.0f < f18 && ((float) this.f86281o) * 0.15f <= java.lang.Math.abs(f18)) && this.f86280n) {
                        hide();
                    } else {
                        float f19 = this.f86288v;
                        if (0.0f > f19 && ((float) this.f86281o) * 0.05f <= java.lang.Math.abs(f19)) {
                            b(this.f86273d.getTranslationY(), this.f86282p, 200L, true);
                        } else {
                            b(this.f86273d.getTranslationY(), this.f86283q, 200L, false);
                        }
                    }
                }
            }
            this.f86286t = 0.0f;
            this.f86287u = 0.0f;
            this.f86289w.clear();
            this.f86290x = -1;
            this.f86291y = 0.0f;
            this.f86292z = false;
        } else if (actionMasked == 2) {
            if (this.f86289w.isEmpty()) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, active pointerId not exist");
                intValue = 0;
            } else {
                intValue = ((java.lang.Integer) this.f86289w.getFirst()).intValue();
            }
            int findPointerIndex = motionEvent.findPointerIndex(intValue);
            if (findPointerIndex < 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, pointerIndex is illegal");
            } else {
                i17 = findPointerIndex;
            }
            if (0.0f == this.f86286t && 0.0f == this.f86287u) {
                this.f86289w.addFirst(0);
                this.f86286t = motionEvent.getX(i17);
                this.f86287u = motionEvent.getY(i17);
            } else {
                int i18 = this.f86290x;
                if (-1 != i18 && i18 != intValue) {
                    this.f86291y = this.f86288v;
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, move, active pointerId changed, disMoveFromDownExceptCurPointerId: " + this.f86291y);
                }
                float x17 = motionEvent.getX(i17) - this.f86286t;
                float y17 = (motionEvent.getY(i17) - this.f86287u) + this.f86291y;
                if (java.lang.Math.abs(y17) > java.lang.Math.abs(x17)) {
                    if (this.f86292z && 0.0f > y17) {
                        ((ku5.t0) ku5.t0.f312615d).B(new fi1.s(this, motionEvent));
                    } else if (this.f86280n || 0.0f >= y17) {
                        if (!this.E) {
                            float f27 = 0.68f * y17;
                            this.f86288v = f27;
                            this.f86273d.setTranslationY(java.lang.Math.min(this.f86281o, java.lang.Math.max(this.f86282p, this.A + f27)));
                            c();
                        }
                        if (this.f86282p >= this.f86273d.getTranslationY()) {
                            this.f86292z = true;
                        }
                    }
                }
                this.f86288v = y17;
                this.f86290x = intValue;
            }
        } else if (actionMasked == 5) {
            int actionIndex = motionEvent.getActionIndex();
            int pointerId = motionEvent.getPointerId(actionIndex);
            this.f86289w.addFirst(java.lang.Integer.valueOf(pointerId));
            this.f86286t = motionEvent.getX(actionIndex);
            this.f86287u = motionEvent.getY(actionIndex);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, pointer down, pointerId: %d, x: %f, y: %f", java.lang.Integer.valueOf(pointerId), java.lang.Float.valueOf(this.f86286t), java.lang.Float.valueOf(this.f86287u));
        } else if (actionMasked == 6) {
            int pointerId2 = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f86289w.remove(java.lang.Integer.valueOf(pointerId2));
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.HybridOpenMaterialView", "onTouchEvent, pointer up, pointerId: %d", java.lang.Integer.valueOf(pointerId2));
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAllowScroll2Hide(boolean z17) {
        this.f86280n = z17;
    }

    public void setContentView(com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f86275f.addView(mMWebView, -1, -1);
        mMWebView.D0(new fi1.m(this));
        this.f86276g = mMWebView;
    }

    public void setListener(fi1.t tVar) {
        this.f86279m = tVar;
    }

    public void setTitleView(android.view.View view) {
        this.f86274e.addView(view, -1, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x007d, code lost:
    
        if (2 == getContext().getResources().getConfiguration().orientation) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public HybridOpenMaterialView(android.content.Context r3, android.util.AttributeSet r4, int r5) {
        /*
            r2 = this;
            r2.<init>(r3, r4, r5)
            android.view.VelocityTracker r4 = android.view.VelocityTracker.obtain()
            r2.f86277h = r4
            r4 = 0
            r2.f86279m = r4
            r4 = 1
            r2.f86280n = r4
            r5 = 0
            r2.f86281o = r5
            r2.f86282p = r5
            r2.f86283q = r5
            r0 = 0
            r2.f86284r = r0
            r2.f86285s = r0
            r2.f86286t = r0
            r2.f86287u = r0
            r2.f86288v = r0
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            r2.f86289w = r1
            r1 = -1
            r2.f86290x = r1
            r2.f86291y = r0
            r2.f86292z = r5
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
            r2.f86273d = r0
            r0 = 2131316039(0x7f094d47, float:1.8250548E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r2.f86274e = r0
            r0 = 2131316036(0x7f094d44, float:1.8250542E38)
            android.view.View r0 = r2.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r2.f86275f = r0
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
            com.tencent.mars.xlog.Log.w(r0, r4)
        L94:
            r4 = r5
        L95:
            r2.f86278i = r4
            fi1.j r4 = new fi1.j
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.widget.LinearLayout r3 = r2.f86274e
            fi1.k r4 = new fi1.k
            r4.<init>(r2)
            r3.setOnClickListener(r4)
            android.view.ViewTreeObserver r3 = r2.getViewTreeObserver()
            fi1.l r4 = new fi1.l
            r4.<init>(r2)
            r3.addOnGlobalLayoutListener(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.openmaterial.ui.hybrid.HybridOpenMaterialView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

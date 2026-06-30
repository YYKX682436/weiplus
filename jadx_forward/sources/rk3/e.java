package rk3;

/* loaded from: classes14.dex */
public class e extends android.widget.FrameLayout {
    public static final int P = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 36);
    public static final int Q;
    public static final float[] R;
    public boolean A;
    public float B;
    public boolean C;
    public android.view.View D;
    public int E;
    public int F;
    public android.view.View G;
    public android.view.View H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f478028J;
    public float K;
    public int L;
    public int M;
    public rk3.c N;

    /* renamed from: d, reason: collision with root package name */
    public ek3.d f478029d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f478030e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f478031f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f478032g;

    /* renamed from: h, reason: collision with root package name */
    public android.os.Vibrator f478033h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View.OnClickListener f478034i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f478035m;

    /* renamed from: n, reason: collision with root package name */
    public int f478036n;

    /* renamed from: o, reason: collision with root package name */
    public int f478037o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f478038p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f478039q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f478040r;

    /* renamed from: s, reason: collision with root package name */
    public int f478041s;

    /* renamed from: t, reason: collision with root package name */
    public final android.graphics.Paint f478042t;

    /* renamed from: u, reason: collision with root package name */
    public final android.graphics.Path f478043u;

    /* renamed from: v, reason: collision with root package name */
    public float f478044v;

    /* renamed from: w, reason: collision with root package name */
    public float f478045w;

    /* renamed from: x, reason: collision with root package name */
    public float f478046x;

    /* renamed from: y, reason: collision with root package name */
    public float f478047y;

    /* renamed from: z, reason: collision with root package name */
    public final android.graphics.Rect f478048z;

    static {
        int a17 = com.p314xaae8f345.mm.ui.zk.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16);
        Q = a17;
        float f17 = a17;
        R = new float[]{f17, f17, 0.0f, 0.0f, 0.0f, 0.0f, f17, f17};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f478030e = true;
        this.f478035m = new java.util.concurrent.CopyOnWriteArrayList();
        this.f478036n = 1;
        this.f478037o = 1;
        this.f478039q = false;
        this.f478040r = true;
        this.f478041s = (int) 2566914048L;
        this.f478042t = new android.graphics.Paint();
        this.f478043u = new android.graphics.Path();
        this.f478048z = new android.graphics.Rect();
        this.A = true;
        this.E = -1;
        this.F = -1;
        this.K = 1.0f;
        this.L = -1;
        this.M = -1;
        this.N = rk3.c.f478022e;
    }

    public static final void a(rk3.e eVar, int i17) {
        eVar.getClass();
        eVar.m162564x764a3ecc(rk3.c.f478025h);
        float e17 = eVar.e(i17);
        eVar.B = e17;
        if (eVar.f478036n == 1) {
            if (e17 <= 0.1f) {
                eVar.f478031f = false;
            }
            if (!eVar.f478031f) {
                if ((eVar.getWidth() - eVar.F) * eVar.B > eVar.getWidth() * 0.25f) {
                    android.os.Vibrator vibrator = eVar.f478033h;
                    if (vibrator != null) {
                        vibrator.vibrate(10L);
                    }
                    eVar.f478031f = true;
                    synchronized (eVar.f478035m) {
                        java.util.Iterator it = eVar.f478035m.iterator();
                        while (it.hasNext()) {
                            ((rk3.b) it.next()).H();
                        }
                    }
                }
            }
        }
        eVar.c();
        android.view.View view = eVar.D;
        synchronized (eVar.f478035m) {
            java.util.Iterator it6 = eVar.f478035m.iterator();
            while (it6.hasNext()) {
                ((rk3.b) it6.next()).J5(view, eVar.B);
            }
        }
    }

    /* renamed from: getPanelState */
    private final rk3.c m162563x3afa24e3() {
        return this.N;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setPanelStateInternal */
    public final void m162564x764a3ecc(rk3.c newState) {
        rk3.c previousState = this.N;
        if (previousState == newState) {
            return;
        }
        this.N = newState;
        if (newState == rk3.c.f478021d) {
            this.f478036n = 0;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskViewGroup", "setPanelStateInternal, EXPANDED!");
        } else if (newState == rk3.c.f478022e) {
            this.f478036n = 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskViewGroup", "setPanelStateInternal, COLLAPSED!");
        }
        int i17 = this.f478036n;
        if (i17 != this.f478037o) {
            this.f478037o = i17;
            synchronized (this.f478035m) {
                java.util.Iterator it = this.f478035m.iterator();
                while (it.hasNext()) {
                    ((rk3.b) it.next()).p(this, i17);
                }
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previousState, "previousState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newState, "newState");
        synchronized (this.f478035m) {
            java.util.Iterator it6 = this.f478035m.iterator();
            while (it6.hasNext()) {
                ((rk3.b) it6.next()).t1(this, previousState, newState);
            }
        }
        sendAccessibilityEvent(32);
    }

    public final void c() {
        if (this.M > 0) {
            int m162567x7b2a852d = m162567x7b2a852d();
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            this.H.setTranslationX(m162567x7b2a852d);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        android.view.View view;
        android.view.View view2;
        ek3.d dVar = this.f478029d;
        if (dVar != null) {
            if (dVar != null) {
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                if (dVar.f335119a == 2) {
                    android.widget.OverScroller overScroller = dVar.f335135q;
                    boolean computeScrollOffset = overScroller.computeScrollOffset();
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    android.view.View view3 = dVar.f335137s;
                    int left = currX - (view3 != null ? view3.getLeft() : 0);
                    android.view.View view4 = dVar.f335137s;
                    int top = currY - (view4 != null ? view4.getTop() : 0);
                    if (left != 0 && (view2 = dVar.f335137s) != null) {
                        view2.offsetLeftAndRight(left);
                    }
                    if (top != 0 && (view = dVar.f335137s) != null) {
                        view.offsetTopAndBottom(top);
                    }
                    if (left != 0 || top != 0) {
                        dVar.f335136r.e(dVar.f335137s, currX, currY, left, top);
                    }
                    if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                        overScroller.abortAnimation();
                        computeScrollOffset = overScroller.isFinished();
                    }
                    if (!computeScrollOffset) {
                        dVar.f335139u.post(dVar.f335141w);
                    }
                }
                r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.valueOf(dVar.f335119a == 2));
            }
            if (r1) {
                if (isEnabled()) {
                    java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                    n3.u0.k(this);
                } else {
                    ek3.d dVar2 = this.f478029d;
                    if (dVar2 != null) {
                        dVar2.a();
                    }
                }
            }
        }
    }

    public final int d(float f17) {
        android.view.View view = this.D;
        int i17 = (int) (f17 * this.I);
        return this.f478038p ? ((getMeasuredWidth() - getPaddingRight()) - (this.F + this.f478028J)) - i17 : (getPaddingLeft() - (view != null ? view.getMeasuredWidth() : 0)) + this.F + this.f478028J + i17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0018, code lost:
    
        if (r1.f335135q.isFinished() == true) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001c, code lost:
    
        if (r2 == false) goto L11;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            java.lang.String r0 = "ev"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            int r0 = r5.getActionMasked()
            boolean r1 = r4.f478030e
            if (r1 != 0) goto L1e
            ek3.d r1 = r4.f478029d
            if (r1 == 0) goto L1b
            android.widget.OverScroller r1 = r1.f335135q
            boolean r1 = r1.isFinished()
            r2 = 1
            if (r1 != r2) goto L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            if (r2 != 0) goto L24
        L1e:
            boolean r1 = r4.C
            if (r1 == 0) goto L30
            if (r0 == 0) goto L30
        L24:
            ek3.d r0 = r4.f478029d
            if (r0 == 0) goto L2b
            r0.a()
        L2b:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        L30:
            float r1 = r5.getX()
            float r2 = r5.getY()
            if (r0 == 0) goto L60
            r3 = 2
            if (r0 == r3) goto L3e
            goto L64
        L3e:
            float r0 = r4.f478044v
            float r0 = r1 - r0
            float r3 = r4.f478045w
            float r3 = r2 - r3
            r4.f478044v = r1
            r4.f478045w = r2
            float r1 = java.lang.Math.abs(r3)
            float r0 = java.lang.Math.abs(r0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5b
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        L5b:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        L60:
            r4.f478044v = r1
            r4.f478045w = r2
        L64:
            boolean r5 = super.dispatchTouchEvent(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: rk3.e.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View child, long j17) {
        int i17;
        boolean drawChild;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        int save = canvas.save();
        android.view.View view = this.D;
        boolean z17 = this.f478040r;
        android.graphics.Rect rect = this.f478048z;
        if (view == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, child)) {
            canvas.getClipBounds(rect);
            int i19 = 0;
            if (this.f478039q) {
                if (this.f478038p) {
                    int i27 = rect.right;
                    android.view.View view2 = this.H;
                    rect.right = java.lang.Math.min(i27, view2 != null ? view2.getRight() : i27);
                } else {
                    int i28 = rect.left;
                    android.view.View view3 = this.H;
                    rect.left = java.lang.Math.max(i28, view3 != null ? view3.getLeft() : i28);
                }
            } else if (this.f478038p) {
                int i29 = rect.left;
                android.view.View view4 = this.H;
                rect.right = java.lang.Math.max(i29, view4 != null ? view4.getTop() : 0);
            } else {
                int i37 = rect.left;
                android.view.View view5 = this.H;
                rect.left = java.lang.Math.min(i37, view5 != null ? view5.getBottom() : getHeight());
            }
            if (z17 && this.B > 0.0f) {
                float width = 0.5f - (P / getWidth());
                float f17 = this.B;
                if (f17 >= width) {
                    float f18 = (f17 - width) / (1 - width);
                    int i38 = Q;
                    float f19 = i38 * f18;
                    if (f19 < 0.0f) {
                        f19 = 0.0f;
                    } else if (f19 > i38) {
                        f19 = i38;
                    }
                    float[] fArr = R;
                    fArr[0] = f19;
                    fArr[1] = f19;
                    fArr[6] = f19;
                    fArr[7] = f19;
                    int i39 = (int) (f18 * 255);
                    if (i39 >= 0) {
                        i19 = 216;
                        if (i39 <= 216) {
                            i19 = i39;
                        }
                    }
                    android.graphics.Path path = this.f478043u;
                    path.reset();
                    android.graphics.RectF rectF = new android.graphics.RectF(rect);
                    rectF.left = this.B * this.I;
                    path.addRoundRect(rectF, fArr, android.graphics.Path.Direction.CW);
                    path.close();
                    canvas.clipPath(path);
                    i17 = i19;
                    i19 = 1;
                    drawChild = super.drawChild(canvas, child, j17);
                    i18 = this.f478041s;
                    if (i18 != 0 && this.B > 0.0f && i19 != 0) {
                        android.graphics.Paint paint = this.f478042t;
                        paint.setColor((i18 & 16777215) | (i17 << 24));
                        android.graphics.Rect rect2 = new android.graphics.Rect(rect);
                        rect2.left = (int) (this.B * this.I);
                        canvas.drawRect(rect2, paint);
                    }
                }
            }
            i17 = 0;
            drawChild = super.drawChild(canvas, child, j17);
            i18 = this.f478041s;
            if (i18 != 0) {
                android.graphics.Paint paint2 = this.f478042t;
                paint2.setColor((i18 & 16777215) | (i17 << 24));
                android.graphics.Rect rect22 = new android.graphics.Rect(rect);
                rect22.left = (int) (this.B * this.I);
                canvas.drawRect(rect22, paint2);
            }
        } else {
            canvas.getClipBounds(rect);
            if (this.f478039q) {
                if (this.f478038p) {
                    int i47 = rect.right;
                    android.view.View view6 = this.D;
                    rect.right = java.lang.Math.max(i47, view6 != null ? view6.getRight() : i47);
                    rect.left -= getWidth();
                } else {
                    int i48 = rect.left;
                    android.view.View view7 = this.D;
                    rect.left = java.lang.Math.min(i48, view7 != null ? view7.getLeft() : i48);
                    rect.right = rect.left + getWidth();
                }
            } else if (this.f478038p) {
                int i49 = rect.right;
                android.view.View view8 = this.D;
                rect.right = java.lang.Math.min(i49, view8 != null ? view8.getRight() : i49);
            } else {
                int i57 = rect.left;
                android.view.View view9 = this.D;
                rect.left = java.lang.Math.max(i57, view9 != null ? view9.getLeft() : i57);
            }
            if (z17) {
                canvas.clipRect(rect);
            }
            drawChild = super.drawChild(canvas, child, j17);
        }
        canvas.restoreToCount(save);
        return drawChild;
    }

    public final float e(int i17) {
        int d17 = d(0.0f);
        return (this.f478038p ? d17 - i17 : i17 - d17) / this.I;
    }

    public boolean f() {
        return m162563x3afa24e3() == rk3.c.f478023f;
    }

    public boolean g(android.view.View view, int i17, int i18) {
        int i19;
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i27 = iArr2[0] + i17;
        int i28 = iArr2[1] + i18;
        int i29 = iArr[0];
        return i27 >= i29 && i27 < i29 + view.getWidth() && i28 >= (i19 = iArr[1]) && i28 < i19 + view.getHeight();
    }

    /* renamed from: getCanSlide */
    public boolean m162565x73a46d37() {
        return this.f478030e;
    }

    /* renamed from: getCurItem */
    public int m162566x80e68d3d() {
        return this.f478036n;
    }

    /* renamed from: getCurrentParallaxOffset */
    public int m162567x7b2a852d() {
        int max = (int) (this.M * java.lang.Math.max(this.B, 0.0f));
        return this.f478038p ? -max : max;
    }

    /* renamed from: getMDragHelper */
    public final ek3.d m162568x4ec4b119() {
        return this.f478029d;
    }

    /* renamed from: getPanelWidth */
    public int m162569x3b2d8e18() {
        return this.E;
    }

    /* renamed from: getShadowWidth */
    public int m162570x7c2bbf50() {
        return this.L;
    }

    public void h() {
        int childCount = getChildCount();
        for (int i17 = 0; i17 < childCount; i17++) {
            android.view.View childAt = getChildAt(i17);
            if (childAt.getVisibility() == 4) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(childAt, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setAllChildrenVisible", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
    }

    public void i(int i17, boolean z17) {
        this.K = 1.0f;
        this.f478032g = false;
        if (i17 == 0) {
            if (z17) {
                j(rk3.c.f478021d, false);
            } else {
                j(rk3.c.f478021d, true);
            }
        } else if (z17) {
            j(rk3.c.f478022e, false);
        } else {
            j(rk3.c.f478022e, true);
        }
        if (z17) {
            return;
        }
        this.f478036n = i17;
    }

    public void j(rk3.c cVar, boolean z17) {
        rk3.c cVar2;
        if (!((cVar == null || cVar == rk3.c.f478025h) ? false : true)) {
            throw new java.lang.IllegalArgumentException("Panel state cannot be null or DRAGGING.".toString());
        }
        if (isEnabled()) {
            if ((!this.A && this.D == null) || cVar == (cVar2 = this.N) || cVar2 == rk3.c.f478025h) {
                return;
            }
            ek3.d dVar = this.f478029d;
            if ((dVar != null && dVar.f335119a == 2) && dVar != null) {
                dVar.a();
            }
            if (this.A) {
                m162564x764a3ecc(cVar);
                return;
            }
            if (this.N == rk3.c.f478024g) {
                android.view.View view = this.D;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setPanelState", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$PanelState;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "setPanelState", "(Lcom/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout$PanelState;JZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                requestLayout();
            }
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                k(1.0f, 0, 0L, z17);
                return;
            }
            if (ordinal == 1) {
                k(0.0f, 0, 250L, z17);
            } else if (ordinal == 2) {
                k(this.K, 0, 0L, z17);
            } else {
                if (ordinal != 3) {
                    return;
                }
                k(e(d(0.0f) + (this.f478038p ? this.F + this.f478028J : -(this.F + this.f478028J))), 0, 0L, z17);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(float r10, int r11, long r12, boolean r14) {
        /*
            r9 = this;
            boolean r11 = r9.isEnabled()
            r0 = 0
            if (r11 == 0) goto L3c
            android.view.View r11 = r9.D
            if (r11 != 0) goto Lc
            goto L3c
        Lc:
            int r2 = r9.d(r10)
            ek3.d r1 = r9.f478029d
            r10 = 1
            if (r1 == 0) goto L30
            android.view.View r11 = r9.D
            if (r11 == 0) goto L1e
            int r3 = r11.getTop()
            goto L1f
        L1e:
            r3 = r0
        L1f:
            r1.f335137s = r11
            r11 = -1
            r1.f335121c = r11
            r4 = 0
            r5 = 0
            r6 = r12
            r8 = r14
            boolean r11 = r1.i(r2, r3, r4, r5, r6, r8)
            if (r11 != r10) goto L30
            r11 = r10
            goto L31
        L30:
            r11 = r0
        L31:
            if (r11 == 0) goto L3c
            r9.h()
            java.util.WeakHashMap r11 = n3.l1.f415895a
            n3.u0.k(r9)
            return r10
        L3c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: rk3.e.k(float, int, long, boolean):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [jz5.f0] */
    public void l() {
        int i17;
        int i18;
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        if (getChildCount() == 0) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int width = getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        android.view.View view = this.D;
        if (view != null) {
            r6 = view != null ? view.getBackground() : null;
            if (r6 != null && r6.getOpacity() == -1) {
                i28 = view.getLeft();
                i29 = view.getRight();
                i37 = view.getTop();
                i17 = view.getBottom();
            } else {
                i17 = 0;
                i28 = 0;
                i29 = 0;
                i37 = 0;
            }
            int i38 = i29;
            i18 = i28;
            r6 = jz5.f0.f384359a;
            i27 = i37;
            i19 = i38;
        } else {
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i27 = 0;
        }
        if (r6 == null) {
            i17 = 0;
            i18 = 0;
            i19 = 0;
            i27 = 0;
        }
        android.view.View childAt = getChildAt(0);
        int i39 = (java.lang.Math.max(paddingLeft, childAt.getLeft()) < i18 || java.lang.Math.max(paddingTop, childAt.getTop()) < i27 || java.lang.Math.min(width, childAt.getRight()) > i19 || java.lang.Math.min(height, childAt.getBottom()) > i17) ? 0 : 4;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i39));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(childAt, arrayList.toArray(), "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "updateObscuredViewVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        childAt.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(childAt, "com/tencent/mm/plugin/multitask/ui/base/MultiTaskPanelLayout", "updateObscuredViewVisibility", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        if (r0 != 3) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk3.e.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        float f17;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.A) {
            int ordinal = this.N.ordinal();
            if (ordinal == 0) {
                f17 = 1.0f;
            } else if (ordinal != 2) {
                f17 = 0.0f;
                if (ordinal == 3) {
                    f17 = e(d(0.0f) + (this.f478038p ? this.F + this.f478028J : -(this.F + this.f478028J)));
                }
            } else {
                f17 = this.K;
            }
            this.B = f17;
        }
        for (int i28 = 0; i28 < childCount; i28++) {
            android.view.View childAt = getChildAt(i28);
            android.view.ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            if (childAt.getVisibility() != 8 || (i28 != 0 && !this.A)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int d17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt, this.D) ? d(this.B) : paddingLeft;
                int i29 = layoutParams2.topMargin + paddingTop;
                childAt.layout(d17, i29, measuredWidth + d17, childAt.getMeasuredHeight() + i29);
            }
        }
        if (this.A) {
            l();
        }
        c();
        this.A = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        int makeMeasureSpec;
        android.view.View.MeasureSpec.getMode(i17);
        int size = android.view.View.MeasureSpec.getSize(i17);
        android.view.View.MeasureSpec.getMode(i18);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        this.H = getChildAt(0);
        android.view.View childAt = getChildAt(1);
        this.D = childAt;
        if (this.G == null) {
            m162574x4468c07b(childAt);
        }
        int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            android.view.View childAt2 = getChildAt(i19);
            android.view.ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
            if (childAt2.getVisibility() != 8 || i19 != 0) {
                int i27 = (paddingTop - layoutParams2.topMargin) - layoutParams2.bottomMargin;
                int i28 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt2, this.H) ? ((this.f478039q || this.N == rk3.c.f478024g) ? paddingLeft : paddingLeft - this.E) - (layoutParams2.leftMargin + layoutParams2.rightMargin) : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt2, this.D) ? (paddingLeft - layoutParams2.leftMargin) + this.f478028J : paddingLeft;
                int i29 = layoutParams2.height;
                int makeMeasureSpec2 = i29 != -2 ? i29 != -1 ? android.view.View.MeasureSpec.makeMeasureSpec(i29, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(i27, 1073741824) : android.view.View.MeasureSpec.makeMeasureSpec(i27, Integer.MIN_VALUE);
                int i37 = layoutParams2.width;
                if (i37 == -2) {
                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i28, Integer.MIN_VALUE);
                } else {
                    if (i37 != -1) {
                        i28 = i37;
                    }
                    makeMeasureSpec = android.view.View.MeasureSpec.makeMeasureSpec(i28, 1073741824);
                }
                childAt2.measure(makeMeasureSpec, makeMeasureSpec2);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt2, this.D)) {
                    int measuredWidth = childAt2.getMeasuredWidth() - (this.F + this.f478028J);
                    this.I = measuredWidth;
                    this.M = measuredWidth;
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public void onSizeChanged(int i17, int i18, int i19, int i27) {
        super.onSizeChanged(i17, i18, i19, i27);
        if (i18 == i27 && i17 == i19) {
            return;
        }
        this.A = true;
        synchronized (this.f478035m) {
            java.util.Iterator it = this.f478035m.iterator();
            while (it.hasNext()) {
                ((rk3.b) it.next()).E1(i17, i18);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        if (!this.f478030e) {
            ek3.d dVar = this.f478029d;
            if (dVar != null && dVar.f335135q.isFinished()) {
                ek3.d dVar2 = this.f478029d;
                if (dVar2 != null) {
                    dVar2.a();
                }
                return super.onTouchEvent(ev6);
            }
        }
        try {
            int actionMasked = ev6.getActionMasked();
            if (actionMasked == 1 || actionMasked == 3) {
                float x17 = ev6.getX();
                float y17 = ev6.getY();
                float abs = java.lang.Math.abs(x17 - this.f478046x);
                float abs2 = java.lang.Math.abs(y17 - this.f478047y);
                ek3.d dVar3 = this.f478029d;
                float scaledTouchSlop = dVar3 != null ? dVar3.f335120b : android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
                if (abs2 <= scaledTouchSlop && abs <= scaledTouchSlop && this.f478036n == 0 && this.B > 0.0f && g(this.H, (int) this.f478046x, (int) this.f478047y) && this.f478034i != null && m162563x3afa24e3() != rk3.c.f478025h) {
                    android.view.View.OnClickListener onClickListener = this.f478034i;
                    if (onClickListener != null) {
                        onClickListener.onClick(this);
                    }
                    return true;
                }
                if (abs2 <= scaledTouchSlop && abs <= scaledTouchSlop && this.B > 0.0f && this.N == rk3.c.f478023f) {
                    android.view.View.OnClickListener onClickListener2 = this.f478034i;
                    if (onClickListener2 != null) {
                        onClickListener2.onClick(this);
                    }
                    return true;
                }
            }
            ek3.d dVar4 = this.f478029d;
            if (dVar4 != null) {
                dVar4.j(ev6);
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MultiTaskViewGroup", e17, "get a Exception", new java.lang.Object[0]);
            return false;
        }
    }

    /* renamed from: setAnchorPoint */
    public void m162571x135ac619(float f17) {
        this.K = f17;
        this.f478032g = true;
    }

    /* renamed from: setCanSlide */
    public void m162572x6e5cce43(boolean z17) {
        this.f478030e = z17;
    }

    /* renamed from: setCoveredFadeColor */
    public void m162573x8c88ecd3(int i17) {
        this.f478041s = i17;
        requestLayout();
    }

    /* renamed from: setDragView */
    public void m162574x4468c07b(android.view.View view) {
        this.G = view;
    }

    /* renamed from: setExtraSlideRange */
    public void m162575x10e5f97a(int i17) {
        this.f478028J = i17;
    }

    /* renamed from: setFadeOnClickListener */
    public void m162576xdeaa00df(android.view.View.OnClickListener listener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.f478034i = listener;
    }

    /* renamed from: setMDragHelper */
    public final void m162577xe52a248d(ek3.d dVar) {
        this.f478029d = dVar;
    }

    /* renamed from: setNeedAnchor */
    public void m162578xade0f4ed(boolean z17) {
        this.f478032g = z17;
    }

    /* renamed from: setOverlayed */
    public void m162579x2eb5aead(boolean z17) {
        this.f478039q = z17;
    }

    /* renamed from: setPanelExpose */
    public void m162580xa30b3126(int i17) {
        this.F = i17;
    }

    /* renamed from: setPanelWidth */
    public void m162581x6951dc24(int i17) {
        if (m162569x3b2d8e18() == i17) {
            return;
        }
        this.E = i17;
        if (!this.A) {
            requestLayout();
        }
        if (m162563x3afa24e3() == rk3.c.f478022e) {
            k(0.0f, 0, 0L, false);
            invalidate();
        }
    }

    /* renamed from: setParallaxOffset */
    public void m162582xfb3e60c(int i17) {
        this.M = i17;
        if (this.A) {
            return;
        }
        requestLayout();
    }

    /* renamed from: setShadowWidth */
    public void m162583x129132c4(int i17) {
        this.L = i17;
        if (this.A) {
            return;
        }
        invalidate();
    }

    /* renamed from: setSlideLeft */
    public void m162584x2c444316(boolean z17) {
        this.f478038p = z17;
    }
}

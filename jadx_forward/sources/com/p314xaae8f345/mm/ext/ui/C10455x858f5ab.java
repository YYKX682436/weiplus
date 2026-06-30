package com.p314xaae8f345.mm.ext.ui;

/* renamed from: com.tencent.mm.ext.ui.SwipeBackLayout */
/* loaded from: classes15.dex */
public class C10455x858f5ab extends android.widget.FrameLayout {
    public android.graphics.drawable.Drawable A;
    public final android.os.Handler B;
    public boolean C;
    public boolean D;
    public es.m E;

    /* renamed from: d, reason: collision with root package name */
    public final float f146493d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f146494e;

    /* renamed from: f, reason: collision with root package name */
    public int f146495f;

    /* renamed from: g, reason: collision with root package name */
    public int f146496g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f146497h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f146498i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f146499m;

    /* renamed from: n, reason: collision with root package name */
    public es.x f146500n;

    /* renamed from: o, reason: collision with root package name */
    public float f146501o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f146502p;

    /* renamed from: q, reason: collision with root package name */
    public float f146503q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f146504r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f146505s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f146506t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f146507u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f146508v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f146509w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f146510x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f146511y;

    /* renamed from: z, reason: collision with root package name */
    public es.n f146512z;

    public C10455x858f5ab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559355cg);
        es.x xVar = new es.x(getContext(), this, new es.t(this, null), loadInterpolator);
        this.f146500n = xVar;
        xVar.f337835q = 1;
        float f17 = getResources().getDisplayMetrics().density;
        es.x xVar2 = this.f146500n;
        xVar2.f337833o = 100.0f * f17;
        xVar2.f337832n = f17 * 300.0f;
        this.f146495f = 0;
        this.f146496g = 0;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f146503q = java.lang.Math.max(0.0f, 1.0f - this.f146501o);
        es.x xVar = this.f146500n;
        if (xVar.f337819a == 2) {
            p012xc85e97e9.p075x2eaf9f.p079xd1075a44.s sVar = xVar.f337836r;
            boolean computeScrollOffset = sVar.f92637a.computeScrollOffset();
            android.widget.OverScroller overScroller = sVar.f92637a;
            int currX = overScroller.getCurrX();
            int b17 = sVar.b();
            int left = currX - xVar.f337838t.getLeft();
            int top = b17 - xVar.f337838t.getTop();
            if (left != 0) {
                xVar.f337838t.offsetLeftAndRight(left);
            }
            if (top != 0) {
                xVar.f337838t.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                xVar.f337837s.a(xVar.f337838t, currX, b17, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && b17 == overScroller.getFinalY()) {
                sVar.a();
                computeScrollOffset = sVar.c();
            }
            if (!computeScrollOffset) {
                xVar.f337840v.post(xVar.f337841w);
            }
        }
        if (xVar.f337819a == 2) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.k(this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.SwipeBackLayout"
            boolean r1 = r6.f146498i
            if (r1 == 0) goto Lb
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        Lb:
            boolean r1 = r6.f146497h
            if (r1 != 0) goto L14
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L14:
            es.n r1 = r6.f146512z
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L3d
            pa3.q r1 = (pa3.q) r1
            if (r7 == 0) goto L26
            int r4 = r7.getAction()
            if (r4 != 0) goto L26
            r4 = r3
            goto L27
        L26:
            r4 = r2
        L27:
            pa3.r r1 = r1.f434531a
            if (r4 == 0) goto L33
            android.graphics.Bitmap r4 = r1.mo2158x12501425()
            r5 = 0
            r1.s(r5, r4)
        L33:
            al5.g3 r1 = r1.f87118g
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r1)
            ak3.h r1 = (ak3.h) r1
            r1.a(r7)
        L3d:
            int r1 = r7.getAction()
            if (r1 != 0) goto L45
            r6.C = r2
        L45:
            boolean r1 = r6.C
            if (r1 == 0) goto L4e
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L4e:
            boolean r1 = r6.f146509w
            if (r1 != 0) goto L54
        L52:
            r1 = r2
            goto L68
        L54:
            android.view.View r1 = r6.f146499m
            int r1 = r1.getLeft()
            float r1 = (float) r1
            r4 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = java.lang.Float.compare(r1, r4)
            if (r1 > 0) goto L67
            r6.f146509w = r2
            goto L52
        L67:
            r1 = r3
        L68:
            if (r1 == 0) goto L6f
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L6f:
            es.x r1 = r6.f146500n     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            int r4 = r1.f337819a     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            if (r4 != r3) goto L79
            r1.h(r7)     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            return r3
        L79:
            boolean r1 = r1.n(r7)     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            if (r1 == 0) goto L93
            java.lang.String r1 = "changelcai"
            java.lang.String r4 = "shouldInterceptTouchEvent %s"
            java.lang.Object[] r5 = new java.lang.Object[]{r7}     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            kd.c.c(r1, r4, r5)     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            r1 = 3
            r7.setAction(r1)     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            super.dispatchTouchEvent(r7)     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            return r3
        L93:
            super.dispatchTouchEvent(r7)     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            return r3
        L97:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "got an IllegalStateException: %s"
            kd.c.b(r0, r1, r7)
            return r2
        La6:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "got an ArrayIndexOutOfBoundsException: %s"
            kd.c.b(r0, r1, r7)
            return r2
        Lb5:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "got an IllegalArgumentException: %s"
            kd.c.b(r0, r1, r7)
            return r2
        Lc4:
            r7 = move-exception
            java.lang.String r7 = r7.toString()
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.String r1 = "got an NullPointerException: %s"
            kd.c.b(r0, r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ext.ui.C10455x858f5ab.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        boolean z17 = view == this.f146499m;
        boolean drawChild = super.drawChild(canvas, view, j17);
        if (java.lang.Float.compare(this.f146503q, 0.0f) > 0 && z17 && this.f146500n.f337819a != 0) {
            android.graphics.Rect rect = this.f146504r;
            view.getHitRect(rect);
            int i17 = rect.left;
            android.graphics.drawable.Drawable drawable = this.f146502p;
            drawable.setBounds(i17 - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            drawable.setAlpha((int) (this.f146503q * 255.0f));
            drawable.draw(canvas);
            kd.c.c("MicroMsg.SwipeBackLayout", "shadow left:%d top:%d right:%d bootom:%d", java.lang.Integer.valueOf(drawable.getBounds().left), java.lang.Integer.valueOf(drawable.getBounds().top), java.lang.Integer.valueOf(drawable.getBounds().right), java.lang.Integer.valueOf(drawable.getBounds().bottom));
        }
        return drawChild;
    }

    /* renamed from: getTargetContentView */
    public android.view.View m43746x1eccc7b7() {
        return this.f146499m;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f146499m = this;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f146494e = true;
        android.view.View view = this.f146499m;
        if (view != null) {
            int i28 = this.f146495f;
            view.layout(i28, this.f146496g, view.getMeasuredWidth() + i28, this.f146496g + this.f146499m.getMeasuredHeight());
        }
        this.f146494e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View view;
        if (this.f146511y && (view = this.f146499m) != null) {
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f146494e) {
            return;
        }
        super.requestLayout();
    }

    /* renamed from: setContentView */
    public void m43747x590ab8fc(android.view.View view) {
        this.f146499m = view;
    }

    /* renamed from: setEdgeSizeAndInitEdgeTouched */
    public void m43748xa390ef9a(int i17) {
        float[] fArr;
        float[] fArr2;
        es.x xVar = this.f146500n;
        xVar.f337834p = i17;
        int[] iArr = xVar.f337827i;
        if (iArr == null || (fArr = xVar.f337822d) == null || (fArr2 = xVar.f337823e) == null) {
            return;
        }
        int i18 = xVar.f337826h;
        if ((iArr[i18] & xVar.f337835q) == 0) {
            iArr[i18] = xVar.g((int) fArr[i18], (int) fArr2[i18]);
        }
    }

    /* renamed from: setEnableGesture */
    public void m43749x8e764904(boolean z17) {
        this.f146497h = z17;
    }

    /* renamed from: setForceDisEnable */
    public void m43750xbf325608(boolean z17) {
        this.f146498i = z17;
    }

    /* renamed from: setFullscreen */
    public void m43751x22f481bd(boolean z17) {
        this.f146511y = z17;
    }

    /* renamed from: setNeedChangeWindowBackground */
    public void m43752x79889b46(boolean z17) {
        this.D = z17;
    }

    /* renamed from: setNeedRequestActivityTranslucent */
    public void m43753x4335bff3(boolean z17) {
        this.f146505s = z17;
        if (z17) {
            this.f146506t = false;
        }
    }

    /* renamed from: setOnceDisEnableGesture */
    public void m43754x782e547b(boolean z17) {
        kd.c.c("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", java.lang.Boolean.valueOf(z17));
        this.C = z17;
    }

    /* renamed from: setSwipeBackListener */
    public void m43755x372c76d3(es.n nVar) {
        this.f146512z = nVar;
    }

    /* renamed from: setSwipeGestureDelegate */
    public void m43756xeb590ed6(es.m mVar) {
        this.E = mVar;
    }

    public C10455x858f5ab(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f146493d = 0.3f;
        this.f146497h = true;
        this.f146498i = false;
        this.f146504r = new android.graphics.Rect();
        this.f146505s = true;
        this.f146506t = false;
        this.f146507u = false;
        this.f146508v = false;
        this.f146509w = false;
        this.f146510x = false;
        this.f146511y = false;
        this.B = new android.os.Handler(android.os.Looper.getMainLooper());
        this.D = true;
        this.E = null;
        this.f146502p = getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.brk);
        setFocusable(true);
        setDescendantFocusability(262144);
        a();
    }
}

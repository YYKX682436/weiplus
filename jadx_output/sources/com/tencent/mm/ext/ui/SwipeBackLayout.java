package com.tencent.mm.ext.ui;

/* loaded from: classes15.dex */
public class SwipeBackLayout extends android.widget.FrameLayout {
    public android.graphics.drawable.Drawable A;
    public final android.os.Handler B;
    public boolean C;
    public boolean D;
    public es.m E;

    /* renamed from: d, reason: collision with root package name */
    public final float f64960d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f64961e;

    /* renamed from: f, reason: collision with root package name */
    public int f64962f;

    /* renamed from: g, reason: collision with root package name */
    public int f64963g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f64964h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f64965i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f64966m;

    /* renamed from: n, reason: collision with root package name */
    public es.x f64967n;

    /* renamed from: o, reason: collision with root package name */
    public float f64968o;

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f64969p;

    /* renamed from: q, reason: collision with root package name */
    public float f64970q;

    /* renamed from: r, reason: collision with root package name */
    public final android.graphics.Rect f64971r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f64972s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f64973t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f64974u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f64975v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f64976w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f64977x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f64978y;

    /* renamed from: z, reason: collision with root package name */
    public es.n f64979z;

    public SwipeBackLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void a() {
        android.view.animation.Interpolator loadInterpolator = android.view.animation.AnimationUtils.loadInterpolator(getContext(), com.tencent.mm.R.anim.f477822cg);
        es.x xVar = new es.x(getContext(), this, new es.t(this, null), loadInterpolator);
        this.f64967n = xVar;
        xVar.f256302q = 1;
        float f17 = getResources().getDisplayMetrics().density;
        es.x xVar2 = this.f64967n;
        xVar2.f256300o = 100.0f * f17;
        xVar2.f256299n = f17 * 300.0f;
        this.f64962f = 0;
        this.f64963g = 0;
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f64970q = java.lang.Math.max(0.0f, 1.0f - this.f64968o);
        es.x xVar = this.f64967n;
        if (xVar.f256286a == 2) {
            androidx.core.widget.s sVar = xVar.f256303r;
            boolean computeScrollOffset = sVar.f11104a.computeScrollOffset();
            android.widget.OverScroller overScroller = sVar.f11104a;
            int currX = overScroller.getCurrX();
            int b17 = sVar.b();
            int left = currX - xVar.f256305t.getLeft();
            int top = b17 - xVar.f256305t.getTop();
            if (left != 0) {
                xVar.f256305t.offsetLeftAndRight(left);
            }
            if (top != 0) {
                xVar.f256305t.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                xVar.f256304s.a(xVar.f256305t, currX, b17, left, top);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && b17 == overScroller.getFinalY()) {
                sVar.a();
                computeScrollOffset = sVar.c();
            }
            if (!computeScrollOffset) {
                xVar.f256307v.post(xVar.f256308w);
            }
        }
        if (xVar.f256286a == 2) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
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
            boolean r1 = r6.f64965i
            if (r1 == 0) goto Lb
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        Lb:
            boolean r1 = r6.f64964h
            if (r1 != 0) goto L14
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L14:
            es.n r1 = r6.f64979z
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
            pa3.r r1 = r1.f352998a
            if (r4 == 0) goto L33
            android.graphics.Bitmap r4 = r1.getBitmap()
            r5 = 0
            r1.s(r5, r4)
        L33:
            al5.g3 r1 = r1.f5585g
            kotlin.jvm.internal.o.d(r1)
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
            boolean r1 = r6.f64976w
            if (r1 != 0) goto L54
        L52:
            r1 = r2
            goto L68
        L54:
            android.view.View r1 = r6.f64966m
            int r1 = r1.getLeft()
            float r1 = (float) r1
            r4 = 1008981770(0x3c23d70a, float:0.01)
            int r1 = java.lang.Float.compare(r1, r4)
            if (r1 > 0) goto L67
            r6.f64976w = r2
            goto L52
        L67:
            r1 = r3
        L68:
            if (r1 == 0) goto L6f
            boolean r7 = super.dispatchTouchEvent(r7)
            return r7
        L6f:
            es.x r1 = r6.f64967n     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
            int r4 = r1.f256286a     // Catch: java.lang.IllegalStateException -> L97 java.lang.ArrayIndexOutOfBoundsException -> La6 java.lang.IllegalArgumentException -> Lb5 java.lang.NullPointerException -> Lc4
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ext.ui.SwipeBackLayout.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(android.graphics.Canvas canvas, android.view.View view, long j17) {
        boolean z17 = view == this.f64966m;
        boolean drawChild = super.drawChild(canvas, view, j17);
        if (java.lang.Float.compare(this.f64970q, 0.0f) > 0 && z17 && this.f64967n.f256286a != 0) {
            android.graphics.Rect rect = this.f64971r;
            view.getHitRect(rect);
            int i17 = rect.left;
            android.graphics.drawable.Drawable drawable = this.f64969p;
            drawable.setBounds(i17 - drawable.getIntrinsicWidth(), rect.top, rect.left, rect.bottom);
            drawable.setAlpha((int) (this.f64970q * 255.0f));
            drawable.draw(canvas);
            kd.c.c("MicroMsg.SwipeBackLayout", "shadow left:%d top:%d right:%d bootom:%d", java.lang.Integer.valueOf(drawable.getBounds().left), java.lang.Integer.valueOf(drawable.getBounds().top), java.lang.Integer.valueOf(drawable.getBounds().right), java.lang.Integer.valueOf(drawable.getBounds().bottom));
        }
        return drawChild;
    }

    public android.view.View getTargetContentView() {
        return this.f64966m;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f64966m = this;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        this.f64961e = true;
        android.view.View view = this.f64966m;
        if (view != null) {
            int i28 = this.f64962f;
            view.layout(i28, this.f64963g, view.getMeasuredWidth() + i28, this.f64963g + this.f64966m.getMeasuredHeight());
        }
        this.f64961e = false;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        android.view.View view;
        if (this.f64978y && (view = this.f64966m) != null) {
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        }
        super.onMeasure(i17, i18);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f64961e) {
            return;
        }
        super.requestLayout();
    }

    public void setContentView(android.view.View view) {
        this.f64966m = view;
    }

    public void setEdgeSizeAndInitEdgeTouched(int i17) {
        float[] fArr;
        float[] fArr2;
        es.x xVar = this.f64967n;
        xVar.f256301p = i17;
        int[] iArr = xVar.f256294i;
        if (iArr == null || (fArr = xVar.f256289d) == null || (fArr2 = xVar.f256290e) == null) {
            return;
        }
        int i18 = xVar.f256293h;
        if ((iArr[i18] & xVar.f256302q) == 0) {
            iArr[i18] = xVar.g((int) fArr[i18], (int) fArr2[i18]);
        }
    }

    public void setEnableGesture(boolean z17) {
        this.f64964h = z17;
    }

    public void setForceDisEnable(boolean z17) {
        this.f64965i = z17;
    }

    public void setFullscreen(boolean z17) {
        this.f64978y = z17;
    }

    public void setNeedChangeWindowBackground(boolean z17) {
        this.D = z17;
    }

    public void setNeedRequestActivityTranslucent(boolean z17) {
        this.f64972s = z17;
        if (z17) {
            this.f64973t = false;
        }
    }

    public void setOnceDisEnableGesture(boolean z17) {
        kd.c.c("MicroMsg.SwipeBackLayout", "[setOnceDisEnableGesture] enable:%s", java.lang.Boolean.valueOf(z17));
        this.C = z17;
    }

    public void setSwipeBackListener(es.n nVar) {
        this.f64979z = nVar;
    }

    public void setSwipeGestureDelegate(es.m mVar) {
        this.E = mVar;
    }

    public SwipeBackLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f64960d = 0.3f;
        this.f64964h = true;
        this.f64965i = false;
        this.f64971r = new android.graphics.Rect();
        this.f64972s = true;
        this.f64973t = false;
        this.f64974u = false;
        this.f64975v = false;
        this.f64976w = false;
        this.f64977x = false;
        this.f64978y = false;
        this.B = new android.os.Handler(android.os.Looper.getMainLooper());
        this.D = true;
        this.E = null;
        this.f64969p = getResources().getDrawable(com.tencent.mm.R.drawable.brk);
        setFocusable(true);
        setDescendantFocusability(262144);
        a();
    }
}

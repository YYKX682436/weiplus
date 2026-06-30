package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMFlipper */
/* loaded from: classes15.dex */
public class C21489xc8bb7d0 extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Scroller f278875d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.VelocityTracker f278876e;

    /* renamed from: f, reason: collision with root package name */
    public int f278877f;

    /* renamed from: g, reason: collision with root package name */
    public int f278878g;

    /* renamed from: h, reason: collision with root package name */
    public int f278879h;

    /* renamed from: i, reason: collision with root package name */
    public int f278880i;

    /* renamed from: m, reason: collision with root package name */
    public int f278881m;

    /* renamed from: n, reason: collision with root package name */
    public float f278882n;

    /* renamed from: o, reason: collision with root package name */
    public float f278883o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f278884p;

    /* renamed from: q, reason: collision with root package name */
    public db5.z1 f278885q;

    /* renamed from: r, reason: collision with root package name */
    public db5.x1 f278886r;

    /* renamed from: s, reason: collision with root package name */
    public db5.y1 f278887s;

    /* renamed from: t, reason: collision with root package name */
    public android.view.animation.Interpolator f278888t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f278889u;

    public C21489xc8bb7d0(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        b(context);
    }

    public void a(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        this.f278884p = false;
        if (!this.f278875d.isFinished()) {
            this.f278875d.abortAnimation();
        }
        this.f278878g = this.f278877f;
        this.f278877f = max;
        scrollTo(max * getWidth(), 0);
    }

    public final void b(android.content.Context context) {
        this.f278888t = m78924xdde4db3d();
        this.f278875d = new android.widget.Scroller(context, this.f278888t);
        this.f278878g = -1;
        this.f278877f = 0;
        this.f278879h = 0;
        this.f278881m = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    public void c(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        if (getScrollX() != getWidth() * max) {
            this.f278875d.startScroll(getScrollX(), 0, (getWidth() * max) - getScrollX(), 0, i65.a.c(getContext(), (int) (java.lang.Math.abs(r6) * 1.3f)));
            int i18 = this.f278877f;
            if (i18 != max) {
                this.f278884p = true;
                this.f278879h += max - i18;
            }
            this.f278878g = i18;
            this.f278877f = max;
            invalidate();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f278875d.getCurrX();
        if (this.f278875d.computeScrollOffset()) {
            scrollTo(this.f278875d.getCurrX(), this.f278875d.getCurrY());
            postInvalidate();
            return;
        }
        if (this.f278884p) {
            this.f278884p = false;
            db5.z1 z1Var = this.f278885q;
            if (z1Var != null) {
                z1Var.a(this.f278878g, this.f278879h, true);
                return;
            }
            return;
        }
        db5.x1 x1Var = this.f278886r;
        if (x1Var == null || this.f278882n != 0.0f || this.f278878g == this.f278877f) {
            return;
        }
        int i17 = this.f278879h;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h hVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h) x1Var;
        hVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppPanel", "viewpage reshow %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19664x489a3083 c19664x489a3083 = hVar.f271870a;
        int s17 = c19664x489a3083.s(15);
        if (i17 == s17 && c19664x489a3083.C.A.f272299a) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).Di(s17 + 1);
        }
    }

    /* renamed from: getCurScreen */
    public int m78923xf19ef016() {
        return this.f278877f;
    }

    /* renamed from: getInterpolator */
    public android.view.animation.Interpolator m78924xdde4db3d() {
        return new db5.a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0031, code lost:
    
        if (r0 != 3) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            boolean r0 = r5.f278889u
            if (r0 != 0) goto L9
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L9:
            int r0 = r5.getChildCount()
            r1 = 1
            if (r0 != r1) goto L15
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        L15:
            int r0 = r6.getAction()
            r2 = 2
            if (r0 != r2) goto L21
            int r3 = r5.f278880i
            if (r3 == 0) goto L21
            return r1
        L21:
            float r3 = r6.getX()
            float r6 = r6.getY()
            r4 = 0
            if (r0 == 0) goto L58
            if (r0 == r1) goto L55
            if (r0 == r2) goto L34
            r6 = 3
            if (r0 == r6) goto L55
            goto L65
        L34:
            float r0 = r5.f278882n
            float r0 = r0 - r3
            float r0 = java.lang.Math.abs(r0)
            int r0 = (int) r0
            float r2 = r5.f278883o
            float r2 = r2 - r6
            float r6 = java.lang.Math.abs(r2)
            int r6 = (int) r6
            int r2 = r5.f278881m
            if (r0 <= r2) goto L4c
            if (r6 >= r2) goto L4c
            r6 = r1
            goto L4d
        L4c:
            r6 = r4
        L4d:
            if (r6 == 0) goto L52
            r5.f278880i = r1
            goto L65
        L52:
            r5.f278880i = r4
            goto L65
        L55:
            r5.f278880i = r4
            goto L65
        L58:
            r5.f278882n = r3
            r5.f278883o = r6
            android.widget.Scroller r6 = r5.f278875d
            boolean r6 = r6.isFinished()
            r6 = r6 ^ r1
            r5.f278880i = r6
        L65:
            int r6 = r5.f278880i
            if (r6 == 0) goto L6a
            goto L6b
        L6a:
            r1 = r4
        L6b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        android.os.SystemClock.elapsedRealtime();
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth() + i28;
                childAt.layout(i28, 0, measuredWidth, childAt.getMeasuredHeight());
                i28 = measuredWidth;
            }
        }
        android.os.SystemClock.elapsedRealtime();
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        super.onMeasure(i17, i18);
        int size = android.view.View.MeasureSpec.getSize(i17);
        int size2 = android.view.View.MeasureSpec.getSize(i18);
        db5.y1 y1Var = this.f278887s;
        if (y1Var != null) {
            y1Var.a(size, size2);
        }
        int childCount = getChildCount();
        for (int i19 = 0; i19 < childCount; i19++) {
            getChildAt(i19).measure(i17, i18);
        }
        scrollTo(this.f278877f * size, 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMFlipper", "flipper onMeasure:" + size + "," + android.view.View.MeasureSpec.getSize(i18) + " childCount:" + childCount + ", use " + (android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        if (r0 != 3) goto L38;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            int r0 = r4.getChildCount()
            r1 = 1
            if (r0 != r1) goto Lc
            boolean r5 = super.onTouchEvent(r5)
            return r5
        Lc:
            android.view.VelocityTracker r0 = r4.f278876e
            if (r0 != 0) goto L16
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r4.f278876e = r0
        L16:
            android.view.VelocityTracker r0 = r4.f278876e
            r0.addMovement(r5)
            int r0 = r5.getAction()
            float r2 = r5.getX()
            r5.getY()
            if (r0 == 0) goto L8a
            r5 = 0
            if (r0 == r1) goto L3c
            r3 = 2
            if (r0 == r3) goto L32
            r2 = 3
            if (r0 == r2) goto L3c
            goto L99
        L32:
            float r0 = r4.f278882n
            float r0 = r0 - r2
            int r0 = (int) r0
            r4.f278882n = r2
            r4.scrollBy(r0, r5)
            goto L99
        L3c:
            android.view.VelocityTracker r0 = r4.f278876e
            r2 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r2)
            float r0 = r0.getXVelocity()
            int r0 = (int) r0
            r2 = 600(0x258, float:8.41E-43)
            if (r0 <= r2) goto L55
            int r2 = r4.f278877f
            if (r2 <= 0) goto L55
            int r2 = r2 - r1
            r4.c(r2)
            goto L78
        L55:
            r2 = -600(0xfffffffffffffda8, float:NaN)
            if (r0 >= r2) goto L69
            int r0 = r4.f278877f
            int r2 = r4.getChildCount()
            int r2 = r2 - r1
            if (r0 >= r2) goto L69
            int r0 = r4.f278877f
            int r0 = r0 + r1
            r4.c(r0)
            goto L78
        L69:
            int r0 = r4.getWidth()
            int r2 = r4.getScrollX()
            int r3 = r0 / 2
            int r2 = r2 + r3
            int r2 = r2 / r0
            r4.c(r2)
        L78:
            android.view.VelocityTracker r0 = r4.f278876e
            if (r0 == 0) goto L82
            r0.recycle()
            r0 = 0
            r4.f278876e = r0
        L82:
            r4.f278880i = r5
            r5 = 0
            r4.f278882n = r5
            r4.f278883o = r5
            goto L99
        L8a:
            android.widget.Scroller r5 = r4.f278875d
            boolean r5 = r5.isFinished()
            if (r5 != 0) goto L97
            android.widget.Scroller r5 = r4.f278875d
            r5.abortAnimation()
        L97:
            r4.f278882n = r2
        L99:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21489xc8bb7d0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: setOnFlipperViewShowedListener */
    public void m78925x9d0cba04(db5.x1 x1Var) {
        this.f278886r = x1Var;
    }

    /* renamed from: setOnMeasureListener */
    public void m78926xb5627411(db5.y1 y1Var) {
        this.f278887s = y1Var;
    }

    /* renamed from: setOnScreenChangedListener */
    public void m78927xe7c66a1b(db5.z1 z1Var) {
        this.f278885q = z1Var;
    }

    /* renamed from: setScrollEnable */
    public void m78928x52f47832(boolean z17) {
        this.f278889u = z17;
    }

    /* renamed from: setToScreen */
    public void m78929xbb95149(int i17) {
        int max = java.lang.Math.max(0, java.lang.Math.min(i17, getChildCount() - 1));
        this.f278884p = false;
        if (!this.f278875d.isFinished()) {
            this.f278875d.abortAnimation();
        }
        db5.z1 z1Var = this.f278885q;
        if (z1Var != null) {
            z1Var.a(this.f278878g, max, false);
        }
        this.f278878g = this.f278877f;
        this.f278877f = max;
        this.f278879h = max;
        scrollTo(max * getWidth(), 0);
    }

    public C21489xc8bb7d0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f278880i = 0;
        this.f278884p = false;
        this.f278889u = true;
        b(context);
    }
}

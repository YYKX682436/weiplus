package com.p314xaae8f345.mm.ui.p2642x2e06d1;

/* renamed from: com.tencent.mm.ui.base.MMSlideDelView */
/* loaded from: classes15.dex */
public class C21514xd47fe41f extends android.view.ViewGroup {

    /* renamed from: d, reason: collision with root package name */
    public float f279088d;

    /* renamed from: e, reason: collision with root package name */
    public float f279089e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.Scroller f279090f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.VelocityTracker f279091g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f279092h;

    /* renamed from: i, reason: collision with root package name */
    public int f279093i;

    /* renamed from: m, reason: collision with root package name */
    public db5.f6 f279094m;

    /* renamed from: n, reason: collision with root package name */
    public db5.b6 f279095n;

    /* renamed from: o, reason: collision with root package name */
    public db5.c6 f279096o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f279097p;

    /* renamed from: q, reason: collision with root package name */
    public db5.a6 f279098q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f279099r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Runnable f279100s;

    /* renamed from: t, reason: collision with root package name */
    public final int f279101t;

    /* renamed from: u, reason: collision with root package name */
    public final long f279102u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f279103v;

    /* renamed from: w, reason: collision with root package name */
    public db5.z5 f279104w;

    /* renamed from: x, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f279105x;

    /* renamed from: y, reason: collision with root package name */
    public long f279106y;

    public C21514xd47fe41f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f279092h = false;
        this.f279097p = false;
        this.f279099r = true;
        this.f279103v = false;
        this.f279104w = null;
        this.f279105x = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3();
        this.f279090f = new android.widget.Scroller(context, new android.view.animation.LinearInterpolator());
        this.f279101t = android.view.ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f279102u = android.view.ViewConfiguration.getLongPressTimeout();
    }

    /* renamed from: getItemStatusCallBack */
    public static db5.c6 m79111x6b320260() {
        return new db5.x5();
    }

    public void b() {
        setPressed(false);
        if (this.f279097p) {
            d();
            return;
        }
        android.view.VelocityTracker velocityTracker = this.f279091g;
        velocityTracker.computeCurrentVelocity(1000);
        int xVelocity = (int) velocityTracker.getXVelocity();
        android.widget.Scroller scroller = this.f279090f;
        if (xVelocity < -600) {
            int scrollX = getScrollX();
            int width = getChildAt(1).getWidth() - scrollX;
            this.f279096o.d(this, true);
            this.f279097p = true;
            scroller.startScroll(scrollX, 0, width, 0, 100);
            invalidate();
        } else if (xVelocity > 600) {
            d();
        } else {
            int scrollX2 = getScrollX();
            int width2 = getChildAt(1).getWidth();
            int i17 = width2 - scrollX2;
            if (scrollX2 > width2 / 2) {
                this.f279096o.d(this, true);
                this.f279097p = true;
                scroller.startScroll(scrollX2, 0, i17, 0, 100);
            } else {
                this.f279097p = false;
                this.f279096o.d(this, false);
                scroller.startScroll(scrollX2, 0, -scrollX2, 0, 100);
            }
            invalidate();
        }
        android.view.VelocityTracker velocityTracker2 = this.f279091g;
        if (velocityTracker2 != null) {
            velocityTracker2.recycle();
            this.f279091g = null;
        }
        this.f279092h = false;
        android.view.ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // android.view.View
    public void buildDrawingCache() {
    }

    public void c() {
        this.f279096o.d(this, false);
        this.f279097p = false;
        scrollTo(0, 0);
        invalidate();
    }

    @Override // android.view.View
    public void computeScroll() {
        android.widget.Scroller scroller = this.f279090f;
        if (scroller.computeScrollOffset()) {
            scrollTo(scroller.getCurrX(), scroller.getCurrY());
            postInvalidate();
        }
    }

    public void d() {
        int scrollX = getScrollX();
        this.f279096o.d(this, false);
        this.f279097p = false;
        this.f279090f.startScroll(scrollX, 0, -scrollX, 0, 100);
        invalidate();
    }

    @Override // android.view.View
    public android.graphics.Bitmap getDrawingCache() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z17, int i17, int i18, int i19, int i27) {
        if (getChildCount() < 2) {
            return;
        }
        int childCount = getChildCount();
        int i28 = 0;
        for (int i29 = 0; i29 < childCount; i29++) {
            android.view.View childAt = getChildAt(i29);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth() + i28;
                childAt.layout(i28, 0, measuredWidth, i27 - i18);
                i28 = measuredWidth;
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        if (getChildCount() < 2) {
            return;
        }
        int size = android.view.View.MeasureSpec.getSize(i17);
        try {
            getChildAt(0).measure(i17, i18);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
        }
        int max = java.lang.Math.max(0, getChildAt(0).getMeasuredHeight());
        android.view.ViewGroup.LayoutParams layoutParams = getChildAt(1).getLayoutParams();
        android.view.View childAt = getChildAt(1);
        if (childAt != null && childAt.getVisibility() != 8) {
            try {
                childAt.measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824), android.view.View.MeasureSpec.makeMeasureSpec(max, 1073741824));
            } catch (java.lang.ArrayIndexOutOfBoundsException unused2) {
            }
            max = java.lang.Math.max(max, childAt.getMeasuredHeight());
        }
        setMeasuredDimension(android.view.View.resolveSize(size, i17), android.view.View.resolveSize(max, i18));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00b0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r19) {
        /*
            Method dump skipped, instructions count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2642x2e06d1.C21514xd47fe41f.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        this.f279103v = false;
        super.onWindowFocusChanged(z17);
    }

    /* renamed from: setEnable */
    public void m79112xae17c85(boolean z17) {
        this.f279099r = z17;
    }

    /* renamed from: setGetViewPositionCallback */
    public void m79113xa7358307(db5.b6 b6Var) {
        this.f279095n = b6Var;
    }

    /* renamed from: setItemStatusCallBack */
    public void m79114x25d846c(db5.c6 c6Var) {
        this.f279096o = c6Var;
    }

    /* renamed from: setOnDelViewShowCallback */
    public void m79115x7a3c0031(db5.d6 d6Var) {
    }

    /* renamed from: setPerformItemClickListener */
    public void m79116x616bb32a(db5.f6 f6Var) {
        this.f279094m = f6Var;
    }

    /* renamed from: setView */
    public void m79117x76516a27(android.view.View view) {
        if (getChildCount() == 2) {
            removeViewAt(0);
        }
        addView(view, 0, new android.view.ViewGroup.LayoutParams(-1, -2));
    }

    @Override // android.view.View
    public void buildDrawingCache(boolean z17) {
    }

    @Override // android.view.View
    public android.graphics.Bitmap getDrawingCache(boolean z17) {
        return null;
    }
}

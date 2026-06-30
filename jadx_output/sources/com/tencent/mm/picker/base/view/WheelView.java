package com.tencent.mm.picker.base.view;

/* loaded from: classes15.dex */
public class WheelView extends android.view.View {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f72377x0 = 0;
    public boolean A;
    public boolean B;
    public int C;
    public float D;
    public float E;
    public float F;
    public int G;
    public int H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public final int f72378J;
    public int K;
    public int L;
    public int M;
    public float N;
    public long P;
    public int Q;
    public int R;
    public int S;
    public final android.content.Context T;
    public final android.view.accessibility.AccessibilityManager U;
    public boolean V;
    public final java.lang.Runnable W;

    /* renamed from: d, reason: collision with root package name */
    public int f72379d;

    /* renamed from: e, reason: collision with root package name */
    public int f72380e;

    /* renamed from: f, reason: collision with root package name */
    public int f72381f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Handler f72382g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f72383h;

    /* renamed from: i, reason: collision with root package name */
    public q51.b f72384i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f72385m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f72386n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f72387o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f72388p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.graphics.Rect f72389p0;

    /* renamed from: q, reason: collision with root package name */
    public final r51.b f72390q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f72391r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f72392s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f72393t;

    /* renamed from: u, reason: collision with root package name */
    public p51.b f72394u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f72395v;

    /* renamed from: w, reason: collision with root package name */
    public final int f72396w;

    /* renamed from: x, reason: collision with root package name */
    public final int f72397x;

    /* renamed from: y, reason: collision with root package name */
    public float f72398y;

    /* renamed from: z, reason: collision with root package name */
    public int f72399z;

    public WheelView(android.content.Context context) {
        this(context, null);
        this.T = context;
    }

    public void a() {
        java.util.concurrent.Future future = this.f72391r;
        if (future == null || future.isCancelled()) {
            return;
        }
        this.f72391r.cancel(true);
        this.f72391r = null;
    }

    public final java.lang.String b(int i17) {
        if (this.A) {
            int itemsCount = this.f72394u.getItemsCount();
            if (itemsCount == 0) {
                i17 = itemsCount;
            } else {
                i17 %= itemsCount;
                if (i17 < 0) {
                    i17 += itemsCount;
                }
            }
        }
        return this.f72394u.a(i17);
    }

    public final boolean c() {
        return this.f72392s.measureText(this.f72386n) <= ((float) ((this.L - getPaddingLeft()) - getPaddingRight()));
    }

    public final void d() {
        if (this.f72394u == null) {
            return;
        }
        float paddingBottom = this.f72379d + getPaddingBottom() + getPaddingTop();
        this.f72398y = paddingBottom;
        this.K = (int) (paddingBottom * this.f72378J);
        this.L = android.view.View.MeasureSpec.getSize(this.Q);
        int i17 = this.K;
        float f17 = this.f72398y;
        this.D = (i17 - f17) / 2.0f;
        this.E = (i17 + f17) / 2.0f;
        if (this.G == -1) {
            if (this.A) {
                this.G = (this.f72394u.getItemsCount() + 1) / 2;
            } else {
                this.G = 0;
            }
        }
        this.I = this.G;
    }

    public com.tencent.mm.picker.base.view.WheelView e(int i17) {
        this.f72380e = i17;
        this.f72392s.setColor(i17);
        this.f72381f = (int) ((((i17 >> 24) & 255) / 255.0f) * 255.0f);
        return this;
    }

    public void f(s51.b bVar) {
        a();
        if (bVar == s51.b.FLING || bVar == s51.b.DAGGLE) {
            float f17 = this.F;
            float f18 = this.f72398y;
            int i17 = (int) (((f17 % f18) + f18) % f18);
            this.M = i17;
            if (i17 > f18 / 2.0f) {
                this.M = (int) (f18 - i17);
            } else {
                this.M = -i17;
            }
        }
        this.f72391r = this.f72390q.a(new r51.e(this, this.M), 0L, 10L);
    }

    public final p51.b getAdapter() {
        return this.f72394u;
    }

    public final int getCurrentItem() {
        int i17;
        p51.b bVar = this.f72394u;
        if (bVar == null) {
            return 0;
        }
        if (this.B && this.H == 0) {
            return -1;
        }
        return (!this.A || ((i17 = this.H) >= 0 && i17 < bVar.getItemsCount())) ? java.lang.Math.max(0, java.lang.Math.min(this.H, this.f72394u.getItemsCount() - 1)) : java.lang.Math.max(0, java.lang.Math.min(java.lang.Math.abs(java.lang.Math.abs(this.H) - this.f72394u.getItemsCount()), this.f72394u.getItemsCount() - 1));
    }

    @Override // android.view.View
    public android.os.Handler getHandler() {
        return this.f72382g;
    }

    public int getInitPosition() {
        return this.G;
    }

    public float getItemHeight() {
        return this.f72398y;
    }

    public int getItemsCount() {
        p51.b bVar = this.f72394u;
        if (bVar != null) {
            return bVar.getItemsCount();
        }
        return 0;
    }

    public java.lang.String getLabel() {
        return this.f72395v;
    }

    public float getTotalScrollY() {
        return this.F;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.W);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r23) {
        /*
            Method dump skipped, instructions count: 918
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.picker.base.view.WheelView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setClassName(android.widget.ScrollView.class.getName());
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setFocusable(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getResources().getText(com.tencent.mm.R.string.f489916me3));
        }
        accessibilityNodeInfo.removeAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
        accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_ACCESSIBILITY_FOCUS);
        accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    @Override // android.view.View
    public void onMeasure(int i17, int i18) {
        this.Q = i17;
        d();
        setMeasuredDimension(this.L, this.K);
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        android.view.GestureDetector gestureDetector = this.f72383h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/picker/base/view/WheelView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean z17 = false;
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/picker/base/view/WheelView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        float f17 = (-this.G) * this.f72398y;
        float itemsCount = ((this.f72394u.getItemsCount() - 1) - this.G) * this.f72398y;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.P = java.lang.System.currentTimeMillis();
            a();
            this.N = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.N - motionEvent.getRawY();
            this.N = motionEvent.getRawY();
            float f18 = this.F + rawY;
            this.F = f18;
            if (!this.A) {
                float f19 = this.f72398y;
                if ((f18 - (f19 * 0.25f) < f17 && rawY < 0.0f) || ((f19 * 0.25f) + f18 > itemsCount && rawY > 0.0f)) {
                    this.F = f18 - rawY;
                    z17 = true;
                }
            }
        } else if (!onTouchEvent) {
            if (java.lang.System.currentTimeMillis() - this.P > 120) {
                f(s51.b.DAGGLE);
            } else {
                int y17 = (int) (motionEvent.getY() - (this.K / 2.0f));
                int i17 = (int) (y17 > 0 ? y17 + (this.f72398y / 2.0f) : y17 - (this.f72398y / 2.0f));
                float f27 = this.f72398y;
                if (f27 != 0.0f) {
                    this.M = (int) (((int) (i17 / f27)) * f27);
                    f(s51.b.CLICK);
                }
            }
        }
        if (!z17 && motionEvent.getAction() != 0) {
            invalidate();
        }
        return true;
    }

    public final void setAdapter(p51.b bVar) {
        p51.b bVar2 = this.f72394u;
        java.lang.Runnable runnable = this.f72385m;
        boolean z17 = !(bVar2 == null || bVar.getItemsCount() == this.f72394u.getItemsCount()) || (android.os.Build.VERSION.SDK_INT >= 29 && getHandler() != null && getHandler().hasCallbacks(runnable));
        this.f72394u = bVar;
        removeCallbacks(runnable);
        d();
        invalidate();
        if (z17) {
            post(runnable);
        }
    }

    public final void setCurrentItem(int i17) {
        this.H = i17;
        this.G = i17;
        this.F = 0.0f;
        invalidate();
    }

    public final void setCyclic(boolean z17) {
        this.A = z17;
    }

    public void setDividerColor(int i17) {
        if (i17 != 0) {
            this.f72399z = i17;
            this.f72393t.setColor(i17);
        }
    }

    public void setDividerHeight(float f17) {
        this.f72393t.setStrokeWidth(f17);
    }

    public void setGravity(int i17) {
        this.R = i17;
    }

    public void setIsOptions(boolean z17) {
        this.f72387o = z17;
    }

    public void setLabel(java.lang.String str) {
        this.f72395v = str;
    }

    public void setLongTermMonthDay(boolean z17) {
    }

    public final void setOnItemSelectedListener(q51.b bVar) {
        this.f72384i = bVar;
    }

    public void setTotalScrollY(float f17) {
        this.F = f17;
    }

    public WheelView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f72379d = 0;
        this.f72380e = android.graphics.Color.rgb(255, 255, 255);
        this.f72385m = new s51.a$$a(this);
        this.f72386n = "";
        this.f72387o = false;
        this.f72388p = true;
        if (u51.a.f424779p == null) {
            u51.a.f424779p = new r51.a();
        }
        this.f72390q = u51.a.f424779p;
        this.f72378J = 5;
        this.M = 0;
        this.N = 0.0f;
        this.P = 0L;
        this.R = 17;
        this.S = 0;
        this.V = false;
        this.W = new java.lang.Runnable() { // from class: s51.a$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.tencent.mm.picker.base.view.WheelView.f72377x0;
                com.tencent.mm.picker.base.view.WheelView wheelView = com.tencent.mm.picker.base.view.WheelView.this;
                wheelView.announceForAccessibility(wheelView.getContentDescription());
            }
        };
        this.f72389p0 = new android.graphics.Rect();
        this.T = context;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7h);
        this.f72396w = dimensionPixelSize;
        this.f72397x = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a7g);
        this.R = 17;
        this.f72399z = -2763307;
        this.U = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.f72382g = new r51.d(this);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, new q51.a(this));
        this.f72383h = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A = true;
        this.F = 0.0f;
        this.G = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f72392s = paint;
        paint.setColor(this.f72380e);
        this.f72392s.setAntiAlias(true);
        this.f72392s.setTextSize(dimensionPixelSize);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f72393t = paint2;
        paint2.setColor(this.f72399z);
        this.f72393t.setAntiAlias(true);
        setLayerType(2, null);
    }
}

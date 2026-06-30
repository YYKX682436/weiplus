package com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5;

/* renamed from: com.tencent.mm.picker.base.view.WheelView */
/* loaded from: classes15.dex */
public class C11323x28056480 extends android.view.View {

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ int f153910x0 = 0;
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
    public final int f153911J;
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
    public int f153912d;

    /* renamed from: e, reason: collision with root package name */
    public int f153913e;

    /* renamed from: f, reason: collision with root package name */
    public int f153914f;

    /* renamed from: g, reason: collision with root package name */
    public android.os.Handler f153915g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.GestureDetector f153916h;

    /* renamed from: i, reason: collision with root package name */
    public q51.b f153917i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Runnable f153918m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f153919n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f153920o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f153921p;

    /* renamed from: p0, reason: collision with root package name */
    public final android.graphics.Rect f153922p0;

    /* renamed from: q, reason: collision with root package name */
    public final r51.b f153923q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.concurrent.Future f153924r;

    /* renamed from: s, reason: collision with root package name */
    public android.graphics.Paint f153925s;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Paint f153926t;

    /* renamed from: u, reason: collision with root package name */
    public p51.b f153927u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f153928v;

    /* renamed from: w, reason: collision with root package name */
    public final int f153929w;

    /* renamed from: x, reason: collision with root package name */
    public final int f153930x;

    /* renamed from: y, reason: collision with root package name */
    public float f153931y;

    /* renamed from: z, reason: collision with root package name */
    public int f153932z;

    public C11323x28056480(android.content.Context context) {
        this(context, null);
        this.T = context;
    }

    public void a() {
        java.util.concurrent.Future future = this.f153924r;
        if (future == null || future.isCancelled()) {
            return;
        }
        this.f153924r.cancel(true);
        this.f153924r = null;
    }

    public final java.lang.String b(int i17) {
        if (this.A) {
            int mo145524x99620925 = this.f153927u.mo145524x99620925();
            if (mo145524x99620925 == 0) {
                i17 = mo145524x99620925;
            } else {
                i17 %= mo145524x99620925;
                if (i17 < 0) {
                    i17 += mo145524x99620925;
                }
            }
        }
        return this.f153927u.a(i17);
    }

    public final boolean c() {
        return this.f153925s.measureText(this.f153919n) <= ((float) ((this.L - getPaddingLeft()) - getPaddingRight()));
    }

    public final void d() {
        if (this.f153927u == null) {
            return;
        }
        float paddingBottom = this.f153912d + getPaddingBottom() + getPaddingTop();
        this.f153931y = paddingBottom;
        this.K = (int) (paddingBottom * this.f153911J);
        this.L = android.view.View.MeasureSpec.getSize(this.Q);
        int i17 = this.K;
        float f17 = this.f153931y;
        this.D = (i17 - f17) / 2.0f;
        this.E = (i17 + f17) / 2.0f;
        if (this.G == -1) {
            if (this.A) {
                this.G = (this.f153927u.mo145524x99620925() + 1) / 2;
            } else {
                this.G = 0;
            }
        }
        this.I = this.G;
    }

    public com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 e(int i17) {
        this.f153913e = i17;
        this.f153925s.setColor(i17);
        this.f153914f = (int) ((((i17 >> 24) & 255) / 255.0f) * 255.0f);
        return this;
    }

    public void f(s51.b bVar) {
        a();
        if (bVar == s51.b.FLING || bVar == s51.b.DAGGLE) {
            float f17 = this.F;
            float f18 = this.f153931y;
            int i17 = (int) (((f17 % f18) + f18) % f18);
            this.M = i17;
            if (i17 > f18 / 2.0f) {
                this.M = (int) (f18 - i17);
            } else {
                this.M = -i17;
            }
        }
        this.f153924r = this.f153923q.a(new r51.e(this, this.M), 0L, 10L);
    }

    /* renamed from: getAdapter */
    public final p51.b m48588xf939df19() {
        return this.f153927u;
    }

    /* renamed from: getCurrentItem */
    public final int m48589xfda78ef6() {
        int i17;
        p51.b bVar = this.f153927u;
        if (bVar == null) {
            return 0;
        }
        if (this.B && this.H == 0) {
            return -1;
        }
        return (!this.A || ((i17 = this.H) >= 0 && i17 < bVar.mo145524x99620925())) ? java.lang.Math.max(0, java.lang.Math.min(this.H, this.f153927u.mo145524x99620925() - 1)) : java.lang.Math.max(0, java.lang.Math.min(java.lang.Math.abs(java.lang.Math.abs(this.H) - this.f153927u.mo145524x99620925()), this.f153927u.mo145524x99620925() - 1));
    }

    @Override // android.view.View
    public android.os.Handler getHandler() {
        return this.f153915g;
    }

    /* renamed from: getInitPosition */
    public int m48590x14a2e4cf() {
        return this.G;
    }

    /* renamed from: getItemHeight */
    public float m48591x51ddd610() {
        return this.f153931y;
    }

    /* renamed from: getItemsCount */
    public int m48592x99620925() {
        p51.b bVar = this.f153927u;
        if (bVar != null) {
            return bVar.mo145524x99620925();
        }
        return 0;
    }

    /* renamed from: getLabel */
    public java.lang.String m48593x74bd253e() {
        return this.f153928v;
    }

    /* renamed from: getTotalScrollY */
    public float m48594xf4decdbe() {
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
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(android.view.accessibility.AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
        accessibilityNodeInfo.setClassName(android.widget.ScrollView.class.getName());
        accessibilityNodeInfo.setScrollable(true);
        accessibilityNodeInfo.setFocusable(true);
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getResources().getText(com.p314xaae8f345.mm.R.C30867xcad56011.f571449me3));
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
        android.view.GestureDetector gestureDetector = this.f153916h;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/picker/base/view/WheelView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        boolean z17 = false;
        boolean onTouchEvent = gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0));
        yj0.a.g(gestureDetector, onTouchEvent, "com/tencent/mm/picker/base/view/WheelView", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        float f17 = (-this.G) * this.f153931y;
        float mo145524x99620925 = ((this.f153927u.mo145524x99620925() - 1) - this.G) * this.f153931y;
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
                float f19 = this.f153931y;
                if ((f18 - (f19 * 0.25f) < f17 && rawY < 0.0f) || ((f19 * 0.25f) + f18 > mo145524x99620925 && rawY > 0.0f)) {
                    this.F = f18 - rawY;
                    z17 = true;
                }
            }
        } else if (!onTouchEvent) {
            if (java.lang.System.currentTimeMillis() - this.P > 120) {
                f(s51.b.DAGGLE);
            } else {
                int y17 = (int) (motionEvent.getY() - (this.K / 2.0f));
                int i17 = (int) (y17 > 0 ? y17 + (this.f153931y / 2.0f) : y17 - (this.f153931y / 2.0f));
                float f27 = this.f153931y;
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

    /* renamed from: setAdapter */
    public final void m48595x6cab2c8d(p51.b bVar) {
        p51.b bVar2 = this.f153927u;
        java.lang.Runnable runnable = this.f153918m;
        boolean z17 = !(bVar2 == null || bVar.mo145524x99620925() == this.f153927u.mo145524x99620925()) || (android.os.Build.VERSION.SDK_INT >= 29 && getHandler() != null && getHandler().hasCallbacks(runnable));
        this.f153927u = bVar;
        removeCallbacks(runnable);
        d();
        invalidate();
        if (z17) {
            post(runnable);
        }
    }

    /* renamed from: setCurrentItem */
    public final void m48596x940d026a(int i17) {
        this.H = i17;
        this.G = i17;
        this.F = 0.0f;
        invalidate();
    }

    /* renamed from: setCyclic */
    public final void m48597x813dbbb(boolean z17) {
        this.A = z17;
    }

    /* renamed from: setDividerColor */
    public void m48598x4d90c14c(int i17) {
        if (i17 != 0) {
            this.f153932z = i17;
            this.f153926t.setColor(i17);
        }
    }

    /* renamed from: setDividerHeight */
    public void m48599x6c813c5e(float f17) {
        this.f153926t.setStrokeWidth(f17);
    }

    /* renamed from: setGravity */
    public void m48600xc1f6fb8c(int i17) {
        this.R = i17;
    }

    /* renamed from: setIsOptions */
    public void m48601xeeb8ffd2(boolean z17) {
        this.f153920o = z17;
    }

    /* renamed from: setLabel */
    public void m48602x534b3fb2(java.lang.String str) {
        this.f153928v = str;
    }

    /* renamed from: setLongTermMonthDay */
    public void m48603x8eb892a6(boolean z17) {
    }

    /* renamed from: setOnItemSelectedListener */
    public final void m48604x88423923(q51.b bVar) {
        this.f153917i = bVar;
    }

    /* renamed from: setTotalScrollY */
    public void m48605x2b27c8ca(float f17) {
        this.F = f17;
    }

    public C11323x28056480(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f153912d = 0;
        this.f153913e = android.graphics.Color.rgb(255, 255, 255);
        this.f153918m = new s51.RunnableC30179x2ca3e0(this);
        this.f153919n = "";
        this.f153920o = false;
        this.f153921p = true;
        if (u51.a.f506312p == null) {
            u51.a.f506312p = new r51.a();
        }
        this.f153923q = u51.a.f506312p;
        this.f153911J = 5;
        this.M = 0;
        this.N = 0.0f;
        this.P = 0L;
        this.R = 17;
        this.S = 0;
        this.V = false;
        this.W = new java.lang.Runnable() { // from class: s51.a$$b
            @Override // java.lang.Runnable
            public final void run() {
                int i17 = com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480.f153910x0;
                com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480 c11323x28056480 = com.p314xaae8f345.mm.p1001xc515088e.p1002x2e06d1.p1003x373aa5.C11323x28056480.this;
                c11323x28056480.announceForAccessibility(c11323x28056480.getContentDescription());
            }
        };
        this.f153922p0 = new android.graphics.Rect();
        this.T = context;
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7h);
        this.f153929w = dimensionPixelSize;
        this.f153930x = getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.a7g);
        this.R = 17;
        this.f153932z = -2763307;
        this.U = (android.view.accessibility.AccessibilityManager) context.getSystemService("accessibility");
        this.f153915g = new r51.d(this);
        android.view.GestureDetector gestureDetector = new android.view.GestureDetector(context, new q51.a(this));
        this.f153916h = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.A = true;
        this.F = 0.0f;
        this.G = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f153925s = paint;
        paint.setColor(this.f153913e);
        this.f153925s.setAntiAlias(true);
        this.f153925s.setTextSize(dimensionPixelSize);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f153926t = paint2;
        paint2.setColor(this.f153932z);
        this.f153926t.setAntiAlias(true);
        setLayerType(2, null);
    }
}

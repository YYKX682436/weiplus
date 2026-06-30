package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class v extends com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.d1 implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.j1 {
    public static final int[] C = {android.R.attr.state_pressed};
    public static final int[] D = new int[0];
    public int A;
    public final java.lang.Runnable B;

    /* renamed from: a, reason: collision with root package name */
    public final int f296193a;

    /* renamed from: b, reason: collision with root package name */
    public final int f296194b;

    /* renamed from: c, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f296195c;

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f296196d;

    /* renamed from: e, reason: collision with root package name */
    public final int f296197e;

    /* renamed from: f, reason: collision with root package name */
    public final int f296198f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.drawable.StateListDrawable f296199g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f296200h;

    /* renamed from: i, reason: collision with root package name */
    public final int f296201i;

    /* renamed from: j, reason: collision with root package name */
    public final int f296202j;

    /* renamed from: k, reason: collision with root package name */
    public int f296203k;

    /* renamed from: l, reason: collision with root package name */
    public int f296204l;

    /* renamed from: m, reason: collision with root package name */
    public float f296205m;

    /* renamed from: n, reason: collision with root package name */
    public int f296206n;

    /* renamed from: o, reason: collision with root package name */
    public int f296207o;

    /* renamed from: p, reason: collision with root package name */
    public float f296208p;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296211s;

    /* renamed from: z, reason: collision with root package name */
    public final android.animation.ValueAnimator f296218z;

    /* renamed from: q, reason: collision with root package name */
    public int f296209q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f296210r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f296212t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f296213u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f296214v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f296215w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f296216x = new int[2];

    /* renamed from: y, reason: collision with root package name */
    public final int[] f296217y = new int[2];

    public v(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4, android.graphics.drawable.StateListDrawable stateListDrawable, android.graphics.drawable.Drawable drawable, android.graphics.drawable.StateListDrawable stateListDrawable2, android.graphics.drawable.Drawable drawable2, int i17, int i18, int i19) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba42;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba43;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f296218z = ofFloat;
        this.A = 0;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r rVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r(this);
        this.B = rVar;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s sVar = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s(this);
        this.f296195c = stateListDrawable;
        this.f296196d = drawable;
        this.f296199g = stateListDrawable2;
        this.f296200h = drawable2;
        this.f296197e = java.lang.Math.max(i17, stateListDrawable.getIntrinsicWidth());
        this.f296198f = java.lang.Math.max(i17, drawable.getIntrinsicWidth());
        this.f296201i = java.lang.Math.max(i17, stateListDrawable2.getIntrinsicWidth());
        this.f296202j = java.lang.Math.max(i17, drawable2.getIntrinsicWidth());
        this.f296193a = i18;
        this.f296194b = i19;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t(this));
        ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u(this));
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba44 = this.f296211s;
        if (c22949xf1deaba44 == c22949xf1deaba4) {
            return;
        }
        if (c22949xf1deaba44 != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = c22949xf1deaba44.f295946t;
            if (g1Var != null) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0 e0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) g1Var;
                if (e0Var.f296034v == null && (c22949xf1deaba43 = e0Var.f296055b) != null) {
                    c22949xf1deaba43.i("Cannot remove item decoration during a scroll  or layout");
                }
            }
            java.util.ArrayList arrayList = c22949xf1deaba44.f295948v;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                c22949xf1deaba44.setWillNotDraw(c22949xf1deaba44.getOverScrollMode() == 2);
            }
            c22949xf1deaba44.N();
            c22949xf1deaba44.requestLayout();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba45 = this.f296211s;
            c22949xf1deaba45.f295949w.remove(this);
            if (c22949xf1deaba45.f295950x == this) {
                c22949xf1deaba45.f295950x = null;
            }
            java.util.List list = this.f296211s.H1;
            if (list != null) {
                ((java.util.ArrayList) list).remove(sVar);
            }
            this.f296211s.removeCallbacks(rVar);
        }
        this.f296211s = c22949xf1deaba4;
        if (c22949xf1deaba4 != null) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var2 = c22949xf1deaba4.f295946t;
            if (g1Var2 != null) {
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0 e0Var2 = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) g1Var2;
                if (e0Var2.f296034v == null && (c22949xf1deaba42 = e0Var2.f296055b) != null) {
                    c22949xf1deaba42.i("Cannot add item decoration during a scroll  or layout");
                }
            }
            java.util.ArrayList arrayList2 = c22949xf1deaba4.f295948v;
            if (arrayList2.isEmpty()) {
                c22949xf1deaba4.setWillNotDraw(false);
            }
            arrayList2.add(this);
            c22949xf1deaba4.N();
            c22949xf1deaba4.requestLayout();
            this.f296211s.f295949w.add(this);
            this.f296211s.h(sVar);
        }
    }

    public boolean a(float f17, float f18) {
        if (f18 >= this.f296210r - this.f296201i) {
            int i17 = this.f296207o;
            int i18 = this.f296206n;
            if (f17 >= i17 - (i18 / 2) && f17 <= i17 + (i18 / 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean b(float f17, float f18) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296211s;
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        boolean z17 = n3.v0.d(c22949xf1deaba4) == 1;
        int i17 = this.f296197e;
        if (z17) {
            if (f17 > i17) {
                return false;
            }
        } else if (f17 < this.f296209q - i17) {
            return false;
        }
        int i18 = this.f296204l;
        int i19 = this.f296203k / 2;
        return f18 >= ((float) (i18 - i19)) && f18 <= ((float) (i18 + i19));
    }

    public void c(int i17) {
        java.lang.Runnable runnable = this.B;
        android.graphics.drawable.StateListDrawable stateListDrawable = this.f296195c;
        if (i17 == 2 && this.f296214v != 2) {
            stateListDrawable.setState(C);
            this.f296211s.removeCallbacks(runnable);
        }
        if (i17 == 0) {
            this.f296211s.invalidate();
        } else {
            d();
        }
        if (this.f296214v == 2 && i17 != 2) {
            stateListDrawable.setState(D);
            this.f296211s.removeCallbacks(runnable);
            this.f296211s.postDelayed(runnable, 1200);
        } else if (i17 == 1) {
            this.f296211s.removeCallbacks(runnable);
            this.f296211s.postDelayed(runnable, 1500);
        }
        this.f296214v = i17;
    }

    public void d() {
        int i17 = this.A;
        android.animation.ValueAnimator valueAnimator = this.f296218z;
        if (i17 != 0) {
            if (i17 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.A = 1;
        valueAnimator.setFloatValues(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}

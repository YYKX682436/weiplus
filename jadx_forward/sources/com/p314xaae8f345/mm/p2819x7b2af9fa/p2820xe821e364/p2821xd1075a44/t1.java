package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public abstract class t1 {

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296170b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 f296171c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f296172d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f296173e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f296174f;

    /* renamed from: a, reason: collision with root package name */
    public int f296169a = -1;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r1 f296175g = new com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r1(0, 0);

    public void a(int i17, int i18) {
        java.lang.Object obj;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296170b;
        if (this.f296169a == -1 || c22949xf1deaba4 == null) {
            c();
        }
        if (this.f296172d && this.f296174f == null && (obj = this.f296171c) != null) {
            android.graphics.PointF I = obj instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s1 ? ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s1) obj)).I(this.f296169a) : null;
            if (I != null) {
                float f17 = I.x;
                if (f17 != 0.0f || I.y != 0.0f) {
                    c22949xf1deaba4.a0((int) java.lang.Math.signum(f17), (int) java.lang.Math.signum(I.y), null);
                }
            }
        }
        this.f296172d = false;
        android.view.View view = this.f296174f;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r1 r1Var = this.f296175g;
        if (view != null) {
            this.f296170b.getClass();
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.y1 K = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.K(view);
            if ((K != null ? K.e() : -1) == this.f296169a) {
                b(this.f296174f, c22949xf1deaba4.F1, r1Var);
                r1Var.a(c22949xf1deaba4);
                c();
            } else {
                this.f296174f = null;
            }
        }
        if (this.f296173e) {
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var = c22949xf1deaba4.F1;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0 f0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0) this;
            if (f0Var.f296170b.f295946t.h() == 0) {
                f0Var.c();
            } else {
                int i19 = f0Var.f296049n;
                int i27 = i19 - i17;
                if (i19 * i27 <= 0) {
                    i27 = 0;
                }
                f0Var.f296049n = i27;
                int i28 = f0Var.f296050o;
                int i29 = i28 - i18;
                if (i28 * i29 <= 0) {
                    i29 = 0;
                }
                f0Var.f296050o = i29;
                if (i27 == 0 && i29 == 0) {
                    int i37 = f0Var.f296169a;
                    java.lang.Object obj2 = f0Var.f296171c;
                    android.graphics.PointF I2 = obj2 instanceof com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s1 ? ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e0) ((com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.s1) obj2)).I(i37) : null;
                    if (I2 != null) {
                        if (I2.x != 0.0f || I2.y != 0.0f) {
                            float f18 = I2.y;
                            float sqrt = (float) java.lang.Math.sqrt((r9 * r9) + (f18 * f18));
                            float f19 = I2.x / sqrt;
                            I2.x = f19;
                            float f27 = I2.y / sqrt;
                            I2.y = f27;
                            f0Var.f296045j = I2;
                            f0Var.f296049n = (int) (f19 * 10000.0f);
                            f0Var.f296050o = (int) (f27 * 10000.0f);
                            int f28 = f0Var.f(10000);
                            int i38 = (int) (f0Var.f296049n * 1.2f);
                            int i39 = (int) (f0Var.f296050o * 1.2f);
                            android.view.animation.LinearInterpolator linearInterpolator = f0Var.f296043h;
                            r1Var.f296157a = i38;
                            r1Var.f296158b = i39;
                            r1Var.f296159c = (int) (f28 * 1.2f);
                            r1Var.f296161e = linearInterpolator;
                            r1Var.f296162f = true;
                        }
                    }
                    r1Var.f296160d = f0Var.f296169a;
                    f0Var.c();
                }
            }
            boolean z17 = r1Var.f296160d >= 0;
            r1Var.a(c22949xf1deaba4);
            if (z17 && this.f296173e) {
                this.f296172d = true;
                c22949xf1deaba4.C1.b();
            }
        }
    }

    public abstract void b(android.view.View view, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.u1 u1Var, com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.r1 r1Var);

    public final void c() {
        if (this.f296173e) {
            this.f296173e = false;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0 f0Var = (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.f0) this;
            f0Var.f296050o = 0;
            f0Var.f296049n = 0;
            f0Var.f296045j = null;
            this.f296170b.F1.f296179a = -1;
            this.f296174f = null;
            this.f296169a = -1;
            this.f296172d = false;
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.g1 g1Var = this.f296171c;
            if (g1Var.f296058e == this) {
                g1Var.f296058e = null;
            }
            this.f296171c = null;
            this.f296170b = null;
        }
    }
}

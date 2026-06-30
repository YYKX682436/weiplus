package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class x1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public int f296223d;

    /* renamed from: e, reason: collision with root package name */
    public int f296224e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.OverScroller f296225f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.animation.Interpolator f296226g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f296227h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f296228i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296229m;

    public x1(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296229m = c22949xf1deaba4;
        android.view.animation.Interpolator interpolator = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295927g2;
        this.f296226g = interpolator;
        this.f296227h = false;
        this.f296228i = false;
        this.f296225f = new android.widget.OverScroller(c22949xf1deaba4.getContext(), interpolator);
    }

    public void a(int i17, int i18) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296229m;
        c22949xf1deaba4.m83621xeaaee002(2);
        this.f296224e = 0;
        this.f296223d = 0;
        android.view.animation.Interpolator interpolator = this.f296226g;
        android.view.animation.Interpolator interpolator2 = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295927g2;
        if (interpolator != interpolator2) {
            this.f296226g = interpolator2;
            this.f296225f = new android.widget.OverScroller(c22949xf1deaba4.getContext(), interpolator2);
        }
        this.f296225f.fling(0, 0, i17, i18, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        b();
    }

    public void b() {
        if (this.f296227h) {
            this.f296228i = true;
            return;
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296229m;
        c22949xf1deaba4.removeCallbacks(this);
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.u0.m(c22949xf1deaba4, this);
    }

    public void c(int i17, int i18, int i19, android.view.animation.Interpolator interpolator) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296229m;
        if (i19 == Integer.MIN_VALUE) {
            int abs = java.lang.Math.abs(i17);
            int abs2 = java.lang.Math.abs(i18);
            boolean z17 = abs > abs2;
            int width = z17 ? c22949xf1deaba4.getWidth() : c22949xf1deaba4.getHeight();
            if (!z17) {
                abs = abs2;
            }
            i19 = java.lang.Math.min((int) (((abs / width) + 1.0f) * 300.0f), 2000);
        }
        int i27 = i19;
        if (interpolator == null) {
            interpolator = com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295927g2;
        }
        if (this.f296226g != interpolator) {
            this.f296226g = interpolator;
            this.f296225f = new android.widget.OverScroller(c22949xf1deaba4.getContext(), interpolator);
        }
        this.f296224e = 0;
        this.f296223d = 0;
        c22949xf1deaba4.m83621xeaaee002(2);
        this.f296225f.startScroll(0, 0, i17, i18, i27);
        b();
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        int i19;
        int i27;
        boolean awakenScrollBars;
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296229m;
        if (c22949xf1deaba4.f295946t == null) {
            c22949xf1deaba4.removeCallbacks(this);
            this.f296225f.abortAnimation();
            return;
        }
        this.f296228i = false;
        this.f296227h = true;
        c22949xf1deaba4.n();
        android.widget.OverScroller overScroller = this.f296225f;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i28 = currX - this.f296223d;
            int i29 = currY - this.f296224e;
            this.f296223d = currX;
            this.f296224e = currY;
            int m17 = c22949xf1deaba4.m(i28, c22949xf1deaba4.N, c22949xf1deaba4.Q, c22949xf1deaba4.getWidth());
            int m18 = c22949xf1deaba4.m(i29, c22949xf1deaba4.P, c22949xf1deaba4.R, c22949xf1deaba4.getHeight());
            int[] iArr = c22949xf1deaba4.R1;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean u17 = c22949xf1deaba4.u(m17, m18, iArr, null, 1);
            int[] iArr2 = c22949xf1deaba4.R1;
            if (u17) {
                m17 -= iArr2[0];
                m18 -= iArr2[1];
            }
            if (c22949xf1deaba4.getOverScrollMode() != 2) {
                c22949xf1deaba4.l(m17, m18);
            }
            if (c22949xf1deaba4.f295945s != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                c22949xf1deaba4.a0(m17, m18, iArr2);
                int i37 = iArr2[0];
                int i38 = iArr2[1];
                int i39 = m17 - i37;
                int i47 = m18 - i38;
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1 t1Var = c22949xf1deaba4.f295946t.f296058e;
                if (t1Var != null && !t1Var.f296172d && t1Var.f296173e) {
                    int b17 = c22949xf1deaba4.F1.b();
                    if (b17 == 0) {
                        t1Var.c();
                    } else if (t1Var.f296169a >= b17) {
                        t1Var.f296169a = b17 - 1;
                        t1Var.a(i37, i38);
                    } else {
                        t1Var.a(i37, i38);
                    }
                }
                i27 = i37;
                i17 = i39;
                i18 = i47;
                i19 = i38;
            } else {
                i17 = m17;
                i18 = m18;
                i19 = 0;
                i27 = 0;
            }
            if (!c22949xf1deaba4.f295948v.isEmpty()) {
                c22949xf1deaba4.invalidate();
            }
            int[] iArr3 = c22949xf1deaba4.R1;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i48 = i19;
            c22949xf1deaba4.v(i27, i19, i17, i18, null, 1, iArr3);
            int i49 = i17 - iArr2[0];
            int i57 = i18 - iArr2[1];
            if (i27 != 0 || i48 != 0) {
                c22949xf1deaba4.w(i27, i48);
            }
            awakenScrollBars = c22949xf1deaba4.awakenScrollBars();
            if (!awakenScrollBars) {
                c22949xf1deaba4.invalidate();
            }
            boolean z17 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i49 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i57 != 0));
            com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1 t1Var2 = c22949xf1deaba4.f295946t.f296058e;
            if ((t1Var2 != null && t1Var2.f296172d) || !z17) {
                b();
                com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.z zVar = c22949xf1deaba4.D1;
                if (zVar != null) {
                    zVar.a(c22949xf1deaba4, i27, i48);
                }
            } else {
                if (c22949xf1deaba4.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i58 = i49 < 0 ? -currVelocity : i49 > 0 ? currVelocity : 0;
                    if (i57 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i57 <= 0) {
                        currVelocity = 0;
                    }
                    if (i58 < 0) {
                        c22949xf1deaba4.y();
                        if (c22949xf1deaba4.N.isFinished()) {
                            c22949xf1deaba4.N.onAbsorb(-i58);
                        }
                    } else if (i58 > 0) {
                        c22949xf1deaba4.z();
                        if (c22949xf1deaba4.Q.isFinished()) {
                            c22949xf1deaba4.Q.onAbsorb(i58);
                        }
                    }
                    if (currVelocity < 0) {
                        c22949xf1deaba4.A();
                        if (c22949xf1deaba4.P.isFinished()) {
                            c22949xf1deaba4.P.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        c22949xf1deaba4.x();
                        if (c22949xf1deaba4.R.isFinished()) {
                            c22949xf1deaba4.R.onAbsorb(currVelocity);
                        }
                    }
                    if (i58 != 0 || currVelocity != 0) {
                        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
                        n3.u0.k(c22949xf1deaba4);
                    }
                }
                if (com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4.f295925e2) {
                    com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.x xVar = c22949xf1deaba4.E1;
                    int[] iArr4 = xVar.f296221c;
                    if (iArr4 != null) {
                        java.util.Arrays.fill(iArr4, -1);
                    }
                    xVar.f296222d = 0;
                }
            }
        }
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.t1 t1Var3 = c22949xf1deaba4.f295946t.f296058e;
        if (t1Var3 != null && t1Var3.f296172d) {
            t1Var3.a(0, 0);
        }
        this.f296227h = false;
        if (!this.f296228i) {
            c22949xf1deaba4.m83621xeaaee002(0);
            c22949xf1deaba4.p(1);
        } else {
            c22949xf1deaba4.removeCallbacks(this);
            java.util.WeakHashMap weakHashMap2 = n3.l1.f415895a;
            n3.u0.m(c22949xf1deaba4, this);
        }
    }
}

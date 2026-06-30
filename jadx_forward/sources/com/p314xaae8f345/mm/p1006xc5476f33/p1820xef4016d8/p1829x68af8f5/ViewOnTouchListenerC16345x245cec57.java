package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* renamed from: com.tencent.mm.plugin.luckymoney.story.EnvelopeStoryBehavior */
/* loaded from: classes15.dex */
public class ViewOnTouchListenerC16345x245cec57 extends com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.Behavior implements android.view.View.OnTouchListener {
    public float A;
    public float B;
    public final android.os.Vibrator C;
    public boolean D;
    public final int E;
    public boolean F;
    public boolean G;
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.g H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f227330J;
    public boolean K;
    public boolean L;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227331x;

    /* renamed from: y, reason: collision with root package name */
    public int f227332y;

    /* renamed from: z, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f227333z;

    public ViewOnTouchListenerC16345x245cec57() {
        this.f227332y = 0;
        this.C = (android.os.Vibrator) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
        this.E = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 300);
        this.F = false;
        this.G = false;
        this.I = false;
        this.f227330J = false;
        this.K = false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior
    /* renamed from: J */
    public boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, int i17) {
        this.f227331x = (com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c) c2678xa407981c;
        this.f227333z = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) c1081xa22a3e5a.findViewById(com.p314xaae8f345.mm.R.id.izx);
        this.f227332y = (int) (c1081xa22a3e5a.getHeight() / 10.0f);
        if (c1081xa22a3e5a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16350x7d7c911b) {
            ((java.util.ArrayList) ((com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16350x7d7c911b) c1081xa22a3e5a).D).add(this);
        }
        super.g(c1081xa22a3e5a, c2678xa407981c, i17);
        return true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior
    /* renamed from: K */
    public void l(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, int i17, int i18, int[] iArr, int i19) {
        super.l(c1081xa22a3e5a, c2678xa407981c, view, i17, i18, iArr, i19);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    /* renamed from: L */
    public void o(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, int i17, int i18, int i19, int i27, int i28) {
        int i29;
        if (i28 == 1 && this.K) {
            if (i18 == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EnvelopeStoryBehavior", "stop verticalRecyclerView scroll!");
                this.f227333z.f1();
                return;
            }
            return;
        }
        int m19973xa8f0dc02 = (this.f227331x.m19973xa8f0dc02() - java.lang.Math.abs(y())) + java.lang.Math.abs(i27);
        float m19973xa8f0dc022 = this.f227331x.m19973xa8f0dc02();
        float f17 = 0.0f;
        if (m19973xa8f0dc022 != 0.0f) {
            float f18 = m19973xa8f0dc02;
            if (f18 <= m19973xa8f0dc022) {
                f17 = (m19973xa8f0dc022 - f18) / m19973xa8f0dc022;
            }
        } else {
            f17 = 0.7f;
        }
        if (m19973xa8f0dc02 > 0) {
            double d17 = 1.0f - f17;
            i29 = (int) (i27 * ((float) (((float) (d17 * 0.2d * d17)) + 0.8d)));
        } else {
            i29 = i27;
        }
        super.o(c1081xa22a3e5a, c2678xa407981c, view, i17, i18, i19, i29, i28);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior
    /* renamed from: M */
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c, android.view.View view, android.view.View view2, int i17, int i18) {
        return super.u(c1081xa22a3e5a, c2678xa407981c, view, view2, i17, i18);
    }

    public void P() {
        if (this.f227331x == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.EnvelopeStoryBehavior", "[animateToMiddle] appBarLayout == null");
            return;
        }
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setInterpolator(new android.view.animation.DecelerateInterpolator());
        valueAnimator.setDuration(200L);
        valueAnimator.setIntValues(y(), -(this.f227331x.m19973xa8f0dc02() - this.E));
        valueAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.i0(this));
        valueAnimator.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.j0(this));
        valueAnimator.start();
    }

    public final void Q() {
        if ((this.K && y() + this.f227331x.m19973xa8f0dc02() <= this.f227332y) || (this.f227330J && java.lang.Math.abs(y()) >= this.f227332y)) {
            this.f227331x.d(false, true, true);
            return;
        }
        if (this.f227331x.m19973xa8f0dc02() - java.lang.Math.abs(y()) == this.E) {
            return;
        }
        this.f227331x.d(true, true, true);
    }

    public final void R() {
        int y17 = y();
        int m19973xa8f0dc02 = this.f227331x.m19973xa8f0dc02();
        boolean z17 = this.L;
        int i17 = this.E;
        if (z17) {
            if (m19973xa8f0dc02 - java.lang.Math.abs(y17) < i17) {
                this.f227331x.d(false, true, true);
                return;
            } else if (this.G) {
                P();
                return;
            } else {
                Q();
                return;
            }
        }
        if (this.K) {
            if (y() + this.f227331x.m19973xa8f0dc02() <= this.f227332y) {
                this.f227331x.d(false, true, true);
                return;
            } else {
                P();
                return;
            }
        }
        if (!this.f227330J || java.lang.Math.abs(y()) < this.f227332y) {
            Q();
        } else if (m19973xa8f0dc02 - java.lang.Math.abs(y17) >= i17 || this.I) {
            P();
        } else {
            this.f227331x.d(false, true, true);
        }
    }

    public final boolean S() {
        return java.lang.Math.abs(y()) <= 0;
    }

    public final boolean T() {
        return this.f227331x.m19973xa8f0dc02() == java.lang.Math.abs(y());
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2682x7f47f62a, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public /* bridge */ /* synthetic */ boolean g(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, int i17) {
        g(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view, i17);
        return true;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public /* bridge */ /* synthetic */ boolean i(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, float f17, float f18, boolean z17) {
        return false;
    }

    @Override // p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean j(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, float f17, float f18) {
        return (S() || T()) ? false : true;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public void l(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, int i17, int i18, int[] iArr, int i19) {
        super.l(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view, view2, i17, i18, iArr, i19);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int action = motionEvent.getAction();
        int i17 = this.E;
        boolean z17 = true;
        if (action == 0) {
            this.A = motionEvent.getX();
            this.B = motionEvent.getY();
            this.D = false;
            this.f227330J = S();
            this.K = T();
            if (!(this.f227331x.m19973xa8f0dc02() - java.lang.Math.abs(y()) == i17) && (this.K || this.f227330J)) {
                z17 = false;
            }
            this.L = z17;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.F) {
                R();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227331x;
                if (c16344xea85a40c != null && this.G) {
                    c16344xea85a40c.d(false, true, true);
                } else if (!S() && !T()) {
                    Q();
                }
            }
        } else if (motionEvent.getAction() == 2) {
            float y17 = motionEvent.getY() - this.B;
            if (this.f227331x != null && !this.G && y17 > 0.0f && y() != 0 && y() + this.f227331x.m19973xa8f0dc02() >= this.f227332y && this.L && !this.D && y() + i17 >= this.f227332y) {
                this.D = true;
                this.C.vibrate(10L);
            }
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/luckymoney/story/EnvelopeStoryBehavior", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c.BaseBehavior, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean u(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.View view2, android.view.View view3, int i17, int i18) {
        return super.u(c1081xa22a3e5a, (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view, view2, view3, i17, i18);
    }

    @Override // com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.AbstractC2680x7913e81f, p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a.Behavior
    public boolean x(p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a, android.view.View view, android.view.MotionEvent motionEvent) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c c2678xa407981c = (com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c) view;
        if (motionEvent.getAction() == 1) {
            motionEvent.setAction(3);
        }
        if (motionEvent.getActionMasked() == 2) {
            float y17 = motionEvent.getY();
            float x17 = motionEvent.getX();
            float f17 = y17 - this.B;
            if (f17 > 0.0f) {
                float m19973xa8f0dc02 = this.f227331x.m19973xa8f0dc02();
                double d17 = 1.0f - (m19973xa8f0dc02 != 0.0f ? f17 > m19973xa8f0dc02 ? 0.0f : (m19973xa8f0dc02 - f17) / m19973xa8f0dc02 : 0.5f);
                float f18 = (float) (((float) (d17 * 0.2d * d17)) + 0.3d);
                motionEvent.getY();
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                matrix.setTranslate(0.0f, (-f17) * f18);
                motionEvent.transform(matrix);
            } else {
                if (java.lang.Math.abs(f17) / java.lang.Math.abs(x17 - this.A) < 0.57d) {
                    return false;
                }
            }
        }
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (this.F) {
                R();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227331x;
                if (c16344xea85a40c != null && this.G) {
                    c16344xea85a40c.d(false, true, true);
                } else if (!S() && !T()) {
                    Q();
                }
            }
        }
        return super.x(c1081xa22a3e5a, c2678xa407981c, motionEvent);
    }

    public ViewOnTouchListenerC16345x245cec57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f227332y = 0;
        this.C = (android.os.Vibrator) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("vibrator");
        this.E = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 300);
        this.F = false;
        this.G = false;
        this.I = false;
        this.f227330J = false;
        this.K = false;
    }
}

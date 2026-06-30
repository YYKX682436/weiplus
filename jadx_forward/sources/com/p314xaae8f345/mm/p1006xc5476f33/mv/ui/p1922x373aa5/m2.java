package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class m2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f233432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 f233433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f233434f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f233435g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f233436h;

    public m2(int i17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3) {
        this.f233432d = i17;
        this.f233433e = c16692x9f29da01;
        this.f233434f = c0Var;
        this.f233435g = c0Var2;
        this.f233436h = c0Var3;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        android.animation.ValueAnimator m67315xc03dbeaf;
        android.animation.ValueAnimator m67315xc03dbeaf2;
        android.animation.ValueAnimator m67315xc03dbeaf3;
        android.animation.ValueAnimator m67315xc03dbeaf4;
        android.animation.ValueAnimator m67315xc03dbeaf5;
        android.animation.ValueAnimator m67315xc03dbeaf6;
        android.animation.ValueAnimator m67315xc03dbeaf7;
        android.animation.ValueAnimator m67315xc03dbeaf8;
        android.animation.ValueAnimator m67315xc03dbeaf9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        int i17 = this.f233432d;
        int i18 = i17 + org.p3343x72743996.net.InterfaceC29524x4f65168b.f74012x19a9deed;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = this.f233433e;
        if (intValue >= i18) {
            c16692x9f29da01.f233206n = 2;
            m67315xc03dbeaf7 = c16692x9f29da01.m67315xc03dbeaf();
            if (m67315xc03dbeaf7.isStarted()) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f233434f;
            if (c0Var.f391645d) {
                return;
            }
            c0Var.f391645d = true;
            m67315xc03dbeaf8 = c16692x9f29da01.m67315xc03dbeaf();
            m67315xc03dbeaf8.cancel();
            m67315xc03dbeaf9 = c16692x9f29da01.m67315xc03dbeaf();
            m67315xc03dbeaf9.start();
            return;
        }
        float f17 = intValue;
        float f18 = 300;
        if (f17 >= ((i17 * 2.0f) / 3.0f) - f18) {
            c16692x9f29da01.f233206n = 1;
            m67315xc03dbeaf4 = c16692x9f29da01.m67315xc03dbeaf();
            if (m67315xc03dbeaf4.isStarted()) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = this.f233435g;
            if (c0Var2.f391645d) {
                return;
            }
            c0Var2.f391645d = true;
            m67315xc03dbeaf5 = c16692x9f29da01.m67315xc03dbeaf();
            m67315xc03dbeaf5.cancel();
            m67315xc03dbeaf6 = c16692x9f29da01.m67315xc03dbeaf();
            m67315xc03dbeaf6.start();
            return;
        }
        if (f17 >= (i17 / 3.0f) - f18) {
            c16692x9f29da01.f233206n = 0;
            m67315xc03dbeaf = c16692x9f29da01.m67315xc03dbeaf();
            if (m67315xc03dbeaf.isStarted()) {
                return;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var3 = this.f233436h;
            if (c0Var3.f391645d) {
                return;
            }
            c0Var3.f391645d = true;
            m67315xc03dbeaf2 = c16692x9f29da01.m67315xc03dbeaf();
            m67315xc03dbeaf2.cancel();
            m67315xc03dbeaf3 = c16692x9f29da01.m67315xc03dbeaf();
            m67315xc03dbeaf3.start();
        }
    }
}

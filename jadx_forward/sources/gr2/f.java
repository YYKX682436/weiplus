package gr2;

/* loaded from: classes4.dex */
public final class f implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 f356298d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 c14570x6b1592c4) {
        this.f356298d = c14570x6b1592c4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        float animatedFraction = it.getAnimatedFraction();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 c14570x6b1592c4 = this.f356298d;
        c14570x6b1592c4.f203653h = animatedFraction <= 0.33f ? (android.graphics.RadialGradient) kz5.n0.a0(c14570x6b1592c4.f203654i, 0) : animatedFraction <= 0.66f ? (android.graphics.RadialGradient) kz5.n0.a0(c14570x6b1592c4.f203654i, 1) : (android.graphics.RadialGradient) kz5.n0.a0(c14570x6b1592c4.f203654i, 2);
        c14570x6b1592c4.f203659q = (c14570x6b1592c4.getHeight() - c14570x6b1592c4.f203655m) * animatedFraction;
        c14570x6b1592c4.invalidate();
    }
}

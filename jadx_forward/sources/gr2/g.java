package gr2;

/* loaded from: classes4.dex */
public final class g implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 f356302d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1594x884940b9.p1597x373aa5.C14570x6b1592c4 c14570x6b1592c4) {
        this.f356302d = c14570x6b1592c4;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f356302d.setAlpha(1.0f - it.getAnimatedFraction());
    }
}

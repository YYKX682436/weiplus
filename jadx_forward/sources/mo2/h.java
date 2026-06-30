package mo2;

/* loaded from: classes2.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 f411902d;

    public h(com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2) {
        this.f411902d = c22803x544dcce2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) animatedValue).intValue();
        com.p314xaae8f345.mm.p2776x373aa5.C22803x544dcce2 c22803x544dcce2 = this.f411902d;
        c22803x544dcce2.m82733x3ae760af(intValue);
        c22803x544dcce2.invalidate();
    }
}

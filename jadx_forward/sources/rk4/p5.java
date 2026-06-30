package rk4;

/* loaded from: classes14.dex */
public final class p5 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f f478429d;

    public p5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f) {
        this.f478429d = c18710x505d67f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            f17.floatValue();
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f.f256161p;
        this.f478429d.getClass();
    }
}

package ch5;

/* loaded from: classes14.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41615d;

    public p(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        this.f41615d = circleToSearchHalfScreen;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(this.f41615d);
        if (C0 != null) {
            C0.a(1.0f - floatValue);
        }
    }
}

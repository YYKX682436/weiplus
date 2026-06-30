package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes2.dex */
public final class x implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f69259d;

    public x(yz5.l lVar) {
        this.f69259d = lVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        if (f17 != null) {
            float floatValue = f17.floatValue();
            yz5.l lVar = this.f69259d;
            if (lVar != null) {
                lVar.invoke(java.lang.Float.valueOf(floatValue));
            }
        }
    }
}

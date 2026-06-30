package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class kt implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.mt f103858d;

    public kt(com.tencent.mm.plugin.finder.convert.mt mtVar) {
        this.f103858d = mtVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.convert.mt mtVar = this.f103858d;
        com.tencent.mm.view.RingProgressView t17 = mtVar.t();
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        t17.setProgress(((java.lang.Integer) animatedValue).intValue());
        mtVar.t().invalidate();
    }
}

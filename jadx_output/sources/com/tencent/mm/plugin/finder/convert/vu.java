package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vu implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.yu f104813d;

    public vu(com.tencent.mm.plugin.finder.convert.yu yuVar) {
        this.f104813d = yuVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.convert.yu yuVar = this.f104813d;
        com.tencent.mm.view.RingProgressView ringProgressView = yuVar.f105053q;
        java.lang.Object animatedValue = it.getAnimatedValue();
        kotlin.jvm.internal.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        ringProgressView.setProgress(((java.lang.Integer) animatedValue).intValue());
        yuVar.f105053q.invalidate();
    }
}

package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class y implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f233523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 f233524e;

    public y(long j17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var) {
        this.f233523d = j17;
        this.f233524e = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (animation.getCurrentPlayTime() > this.f233523d - 3000) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float floatValue = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0.f233289v * ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var = this.f233524e;
        a0Var.f233299n = floatValue;
        a0Var.f233297i = 2 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        a0Var.f233293e.invalidate();
    }
}

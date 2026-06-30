package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class z implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f233530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 f233531e;

    public z(long j17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var) {
        this.f233530d = j17;
        this.f233531e = a0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        long currentPlayTime = animation.getCurrentPlayTime();
        long j17 = this.f233530d;
        long j18 = j17 - 3000;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0 a0Var = this.f233531e;
        if (currentPlayTime > j18) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            a0Var.f(j17);
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        a0Var.f233300o = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.a0.f233289v * ((java.lang.Float) animatedValue).floatValue();
        int currentPlayTime2 = 1 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        a0Var.f233298m = currentPlayTime2;
        if (currentPlayTime2 < 0) {
            a0Var.f233298m = currentPlayTime2 + 3;
        }
        a0Var.f233293e.invalidate();
    }
}

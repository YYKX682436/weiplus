package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public final class p2 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f233454d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 f233455e;

    public p2(long j17, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01) {
        this.f233454d = j17;
        this.f233455e = c16692x9f29da01;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        long currentPlayTime = animation.getCurrentPlayTime();
        long j17 = this.f233454d;
        long j18 = j17 - 3000;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01 c16692x9f29da01 = this.f233455e;
        if (currentPlayTime > j18) {
            animation.cancel();
            animation.removeAllUpdateListeners();
            float f17 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01.f233196u;
            c16692x9f29da01.e(j17);
            return;
        }
        java.lang.Object animatedValue = animation.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        c16692x9f29da01.f233205m = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16692x9f29da01.f233196u * ((java.lang.Float) animatedValue).floatValue();
        int currentPlayTime2 = 1 - (((int) (((float) animation.getCurrentPlayTime()) / 400.0f)) % 3);
        c16692x9f29da01.f233203h = currentPlayTime2;
        if (currentPlayTime2 < 0) {
            c16692x9f29da01.f233203h = currentPlayTime2 + 3;
        }
        c16692x9f29da01.invalidate();
    }
}

package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2994xcf19e143.p2995xaf3f3382.p2996x6a710b1.p2997x42ab1b84;

/* renamed from: com.tencent.tencentmap.mapsdk.vector.compat.utils.animation.OverlayAnimator */
/* loaded from: classes13.dex */
public abstract class AbstractC26108xa6da3b37 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.Object f296957a;

    /* renamed from: b, reason: collision with root package name */
    public long f296958b;

    /* renamed from: c, reason: collision with root package name */
    public android.animation.AnimatorSet f296959c = new android.animation.AnimatorSet();

    public AbstractC26108xa6da3b37(java.lang.Object obj, long j17) {
        this.f296957a = obj;
        this.f296958b = java.lang.Math.max(0L, j17);
    }

    /* renamed from: addAnimatorListener */
    public void m100111xf551d77c(android.animation.Animator.AnimatorListener animatorListener) {
        this.f296959c.addListener(animatorListener);
    }

    /* renamed from: cancelAnimation */
    public void mo100098x5236b62a() {
        synchronized (this) {
            this.f296959c.cancel();
        }
    }

    /* renamed from: createSegmentAnimator */
    public abstract android.animation.ValueAnimator mo100099x657bca9e(int i17);

    /* renamed from: endAnimation */
    public void mo100101x2a2878e9() {
        synchronized (this) {
            this.f296959c.end();
        }
    }

    /* renamed from: getAnimatorSet */
    public android.animation.AnimatorSet m100112x1e7e22c5() {
        return this.f296959c;
    }

    /* renamed from: getDuration */
    public long m100113x51e8b0a() {
        return this.f296958b;
    }

    /* renamed from: getObject */
    public java.lang.Object m100114x2817c635() {
        return this.f296957a;
    }

    /* renamed from: setAnimatorSet */
    public void m100115xb4e39639(android.animation.AnimatorSet animatorSet) {
        this.f296959c = animatorSet;
    }

    /* renamed from: setDuration */
    public void m100116xffd6ec16(long j17) {
        this.f296958b = j17;
    }

    /* renamed from: setObject */
    public void m100117x1b4cfa41(java.lang.Object obj) {
        this.f296957a = obj;
    }

    /* renamed from: startAnimation */
    public void mo100105x2d8c4542() {
        synchronized (this) {
            if (!this.f296959c.isRunning()) {
                this.f296959c.start();
            }
        }
    }
}

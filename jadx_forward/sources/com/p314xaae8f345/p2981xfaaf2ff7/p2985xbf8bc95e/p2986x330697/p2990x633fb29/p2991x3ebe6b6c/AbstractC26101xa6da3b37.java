package com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c;

/* renamed from: com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator */
/* loaded from: classes13.dex */
public abstract class AbstractC26101xa6da3b37 {

    /* renamed from: mAnimatorListener */
    private android.animation.Animator.AnimatorListener f49846x14bf4748;

    /* renamed from: mAnimatorSet */
    private android.animation.AnimatorSet f49847xeeb4ed4e = new android.animation.AnimatorSet();

    /* renamed from: mDuration */
    private long f49848xae41f521;

    /* renamed from: mObject */
    private java.lang.Object f49849x126cca0c;

    public AbstractC26101xa6da3b37(java.lang.Object obj, long j17) {
        this.f49849x126cca0c = obj;
        this.f49848xae41f521 = j17;
    }

    /* renamed from: addAnimationListener */
    public void m100063x35617db7() {
        if (this.f49847xeeb4ed4e == null) {
            return;
        }
        if (this.f49846x14bf4748 == null) {
            this.f49846x14bf4748 = new android.animation.Animator.AnimatorListener() { // from class: com.tencent.tencentmap.mapsdk.maps.model.transform.OverlayAnimator.1
                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationCancel(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(android.animation.Animator animator) {
                    com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.p2991x3ebe6b6c.AbstractC26101xa6da3b37.this.mo99424x413de82d();
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationRepeat(android.animation.Animator animator) {
                }

                @Override // android.animation.Animator.AnimatorListener
                public final void onAnimationStart(android.animation.Animator animator) {
                }
            };
        }
        this.f49847xeeb4ed4e.addListener(this.f49846x14bf4748);
    }

    /* renamed from: addAnimatorListener */
    public void m100064xf551d77c(android.animation.Animator.AnimatorListener animatorListener) {
        this.f49847xeeb4ed4e.addListener(animatorListener);
    }

    /* renamed from: cancelAnimation */
    public void mo99421x5236b62a() {
        synchronized (this) {
            this.f49847xeeb4ed4e.cancel();
        }
    }

    /* renamed from: createSegmentAnimator */
    public abstract android.animation.ValueAnimator mo99422x657bca9e(int i17);

    /* renamed from: endAnimation */
    public void mo99423x2a2878e9() {
        synchronized (this) {
            this.f49847xeeb4ed4e.end();
        }
    }

    /* renamed from: getAnimatorSet */
    public android.animation.AnimatorSet m100065x1e7e22c5() {
        return this.f49847xeeb4ed4e;
    }

    /* renamed from: getDuration */
    public long m100066x51e8b0a() {
        return this.f49848xae41f521;
    }

    /* renamed from: getObject */
    public java.lang.Object m100067x2817c635() {
        return this.f49849x126cca0c;
    }

    /* renamed from: innerAnimationEnd */
    public void mo99424x413de82d() {
    }

    /* renamed from: removeAnimationListener */
    public void m100068x94c16034() {
        android.animation.AnimatorSet animatorSet = this.f49847xeeb4ed4e;
        if (animatorSet == null) {
            return;
        }
        animatorSet.removeListener(this.f49846x14bf4748);
        this.f49846x14bf4748 = null;
    }

    /* renamed from: setAnimatorSet */
    public void m100069xb4e39639(android.animation.AnimatorSet animatorSet) {
        this.f49847xeeb4ed4e = animatorSet;
    }

    /* renamed from: setDuration */
    public void m100070xffd6ec16(long j17) {
        this.f49848xae41f521 = j17;
    }

    /* renamed from: setObject */
    public void m100071x1b4cfa41(java.lang.Object obj) {
        this.f49849x126cca0c = obj;
    }

    /* renamed from: startAnimation */
    public void mo99426x2d8c4542() {
        synchronized (this) {
            if (!this.f49847xeeb4ed4e.isRunning()) {
                this.f49847xeeb4ed4e.start();
            }
        }
    }
}

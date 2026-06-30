package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class uv implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f196153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ObjectAnimator f196154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow f196155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f196156g;

    public uv(p3325xe03a0797.p3326xc267989b.q qVar, android.animation.ObjectAnimator objectAnimator, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ow owVar, yz5.a aVar) {
        this.f196153d = qVar;
        this.f196154e = objectAnimator;
        this.f196155f = owVar;
        this.f196156g = aVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3325xe03a0797.p3326xc267989b.q qVar = this.f196153d;
        if (((p3325xe03a0797.p3326xc267989b.r) qVar).n()) {
            android.animation.ObjectAnimator objectAnimator = this.f196154e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objectAnimator);
            objectAnimator.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.vv(this.f196155f, this.f196156g, qVar));
            objectAnimator.start();
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

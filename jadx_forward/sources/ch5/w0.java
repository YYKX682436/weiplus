package ch5;

/* loaded from: classes14.dex */
public final class w0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123163d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f123164e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f123165f;

    public w0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f123163d = c22421x5301a0d7;
        this.f123164e = valueAnimator;
        this.f123165f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        android.view.Window window;
        android.view.Window window2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = this.f123163d;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.C0(c22421x5301a0d7);
        if (C0 != null) {
            C0.c(true, false, 0);
        }
        android.app.Dialog m7393x15b1203e = c22421x5301a0d7.m7393x15b1203e();
        if (m7393x15b1203e != null && (window2 = m7393x15b1203e.getWindow()) != null) {
            window2.setWindowAnimations(0);
        }
        android.app.Dialog m7393x15b1203e2 = c22421x5301a0d7.m7393x15b1203e();
        if (m7393x15b1203e2 != null && (window = m7393x15b1203e2.getWindow()) != null) {
            window.setSoftInputMode(48);
        }
        android.animation.ValueAnimator valueAnimator = this.f123164e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f123165f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.C0(this.f123163d);
        if (C0 != null) {
            C0.c(true, true, 0);
        }
    }
}

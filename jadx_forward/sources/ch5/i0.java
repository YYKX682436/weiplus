package ch5;

/* loaded from: classes14.dex */
public final class i0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123115d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f123116e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f123117f;

    public i0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f123115d = c22421x5301a0d7;
        this.f123116e = valueAnimator;
        this.f123117f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = this.f123115d;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.C0(c22421x5301a0d7);
        if (C0 != null) {
            C0.c(false, false, 0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C02 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.C0(c22421x5301a0d7);
        if (C02 != null) {
            C02.b();
        }
        yz5.a aVar = c22421x5301a0d7.f290337e.f314153f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        android.animation.ValueAnimator valueAnimator = this.f123116e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f123117f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7.C0(this.f123115d);
        if (C0 != null) {
            C0.c(false, true, 0);
        }
    }
}

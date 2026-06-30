package ch5;

/* loaded from: classes14.dex */
public final class o extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 f123144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f123145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f123146f;

    public o(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f123144d = c22419xb3ed8ff2;
        this.f123145e = valueAnimator;
        this.f123146f = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2 = this.f123144d;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(c22419xb3ed8ff2);
        if (C0 != null) {
            C0.c(false, false, 0);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C02 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(c22419xb3ed8ff2);
        if (C02 != null) {
            C02.b();
        }
        yz5.a aVar = c22419xb3ed8ff2.f290337e.f314153f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        android.animation.ValueAnimator valueAnimator = this.f123145e;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f123146f);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(this.f123144d);
        if (C0 != null) {
            C0.c(false, true, 0);
        }
    }
}

package ch5;

/* loaded from: classes14.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c f123109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f123110f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f123111g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator.AnimatorUpdateListener f123112h;

    public h1(yz5.a aVar, com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c, yz5.a aVar2, android.animation.ValueAnimator valueAnimator, android.animation.ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f123108d = aVar;
        this.f123109e = c22426x8efb1b1c;
        this.f123110f = aVar2;
        this.f123111g = valueAnimator;
        this.f123112h = animatorUpdateListener;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c c22426x8efb1b1c = this.f123109e;
        yz5.p dragStatusBlock = c22426x8efb1b1c.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.mo149xb9724478("onHalfScreenHeightDidChange", com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22426x8efb1b1c.a(c22426x8efb1b1c));
        }
        yz5.a aVar = this.f123110f;
        if (aVar != null) {
        }
        android.animation.ValueAnimator valueAnimator = this.f123111g;
        valueAnimator.removeListener(this);
        valueAnimator.removeUpdateListener(this.f123112h);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        yz5.a aVar = this.f123108d;
        if (aVar != null) {
        }
    }
}

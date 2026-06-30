package qa5;

/* loaded from: classes5.dex */
public final class i extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public boolean f442654d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa5.l f442655e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f442656f;

    public i(qa5.l lVar, yz5.a aVar) {
        this.f442655e = lVar;
        this.f442656f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f442654d = true;
        super.onAnimationCancel(animation);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        qa5.l lVar = this.f442655e;
        qa5.f fVar = lVar.f442668k;
        if (fVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) fVar).U0(lVar.hashCode(), false, this.f442654d);
        }
        yz5.a aVar = this.f442656f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        qa5.l lVar = this.f442655e;
        qa5.f fVar = lVar.f442668k;
        if (fVar != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k) fVar).U0(lVar.hashCode(), true, this.f442654d);
        }
    }
}

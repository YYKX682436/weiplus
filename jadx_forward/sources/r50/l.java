package r50;

/* loaded from: classes3.dex */
public final class l extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f474134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f474135e;

    public l(android.animation.ValueAnimator valueAnimator, yz5.a aVar) {
        this.f474134d = valueAnimator;
        this.f474135e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        this.f474134d.removeListener(this);
        yz5.a aVar = this.f474135e;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}

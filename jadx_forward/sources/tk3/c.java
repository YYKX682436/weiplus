package tk3;

/* loaded from: classes8.dex */
public final class c extends qn5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.d f501444d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f501445e;

    public c(tk3.d dVar, float f17) {
        this.f501444d = dVar;
        this.f501445e = f17;
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f501444d.b(this.f501445e);
    }

    @Override // qn5.a, android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f501444d.b(this.f501445e);
    }
}

package wa2;

/* loaded from: classes3.dex */
public final class a0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewPropertyAnimator f525635d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f525636e;

    public a0(android.view.ViewPropertyAnimator animator, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f525635d = animator;
        this.f525636e = callback;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        this.f525636e.mo146xb9724478(p07);
        this.f525635d.setListener(null);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}

package r50;

/* loaded from: classes5.dex */
public final class n implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474138d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474139e;

    public n(r50.j0 j0Var, int i17) {
        this.f474138d = j0Var;
        this.f474139e = i17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        ((gl5.d1) ((jz5.n) this.f474138d.f474119e).mo141623x754a37bb()).h(this.f474139e);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

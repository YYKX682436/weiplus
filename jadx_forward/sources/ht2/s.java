package ht2;

/* loaded from: classes2.dex */
public final class s implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366433e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f366434f;

    public s(ht2.y0 y0Var, android.view.View view, android.view.View view2) {
        this.f366432d = y0Var;
        this.f366433e = view;
        this.f366434f = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f366432d.Ai(this.f366433e, this.f366434f);
    }
}

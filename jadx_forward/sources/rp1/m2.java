package rp1;

/* loaded from: classes14.dex */
public class m2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rp1.n2 f480016d;

    public m2(rp1.n2 n2Var) {
        this.f480016d = n2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f480016d.f480037x;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        rp1.n2 n2Var = this.f480016d;
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = n2Var.f480037x;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationEnd(animator);
        }
        n2Var.setVisibility(8);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.animation.AnimatorListenerAdapter animatorListenerAdapter = this.f480016d.f480037x;
        if (animatorListenerAdapter != null) {
            animatorListenerAdapter.onAnimationStart(animator);
        }
    }
}

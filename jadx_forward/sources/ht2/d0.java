package ht2;

/* loaded from: classes2.dex */
public final class d0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f366350d;

    public d0(android.widget.TextView textView) {
        this.f366350d = textView;
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
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator alpha;
        android.widget.TextView textView = this.f366350d;
        if (textView == null || (animate = textView.animate()) == null || (alpha = animate.alpha(0.0f)) == null) {
            return;
        }
        alpha.start();
    }
}

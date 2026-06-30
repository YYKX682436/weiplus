package ym5;

/* loaded from: classes3.dex */
public class s6 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator.AnimatorListener f545063d;

    public s6(android.animation.Animator.AnimatorListener animatorListener) {
        this.f545063d = animatorListener;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f545063d;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f545063d;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f545063d;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f545063d;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(animator);
        }
    }
}

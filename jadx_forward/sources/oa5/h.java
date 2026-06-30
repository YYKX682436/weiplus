package oa5;

/* loaded from: classes8.dex */
public class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f425412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa5.j f425413e;

    public h(oa5.j jVar, android.animation.ValueAnimator valueAnimator) {
        this.f425413e = jVar;
        this.f425412d = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        oa5.j jVar = this.f425413e;
        android.animation.Animator.AnimatorListener animatorListener = jVar.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(null);
        }
        jVar.f425417i = null;
        java.util.HashMap hashMap = jVar.f425389b;
        if (hashMap != null) {
            hashMap.remove(this.f425412d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        oa5.j jVar = this.f425413e;
        jVar.getClass();
        jVar.f425417i = null;
        android.animation.Animator.AnimatorListener animatorListener = jVar.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
        java.util.HashMap hashMap = jVar.f425389b;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f425412d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            jVar.f425389b.remove(valueAnimator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f425413e.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        oa5.j jVar = this.f425413e;
        android.animation.Animator.AnimatorListener animatorListener = jVar.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(null);
        }
        java.util.HashMap hashMap = jVar.f425388a;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f425412d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            jVar.f425388a.remove(valueAnimator);
        }
        jVar.getClass();
    }
}

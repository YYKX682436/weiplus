package oa5;

/* loaded from: classes8.dex */
public class k implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.animation.ValueAnimator f425418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oa5.m f425419e;

    public k(oa5.m mVar, android.animation.ValueAnimator valueAnimator) {
        this.f425419e = mVar;
        this.f425418d = valueAnimator;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        oa5.m mVar = this.f425419e;
        android.animation.Animator.AnimatorListener animatorListener = mVar.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationCancel(null);
        }
        java.util.HashMap hashMap = mVar.f425389b;
        if (hashMap != null) {
            hashMap.remove(this.f425418d);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        oa5.m mVar = this.f425419e;
        mVar.getClass();
        android.animation.Animator.AnimatorListener animatorListener = mVar.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationEnd(null);
        }
        java.util.HashMap hashMap = mVar.f425389b;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f425418d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            mVar.f425389b.remove(valueAnimator);
        }
        java.util.HashMap hashMap2 = mVar.f425389b;
        if (hashMap2 != null && hashMap2.isEmpty()) {
            mVar.f425416h = null;
        }
        mVar.f425392e = null;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        android.animation.Animator.AnimatorListener animatorListener = this.f425419e.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationRepeat(null);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        oa5.m mVar = this.f425419e;
        android.animation.Animator.AnimatorListener animatorListener = mVar.f425416h;
        if (animatorListener != null) {
            animatorListener.onAnimationStart(null);
        }
        java.util.HashMap hashMap = mVar.f425388a;
        if (hashMap != null) {
            android.animation.ValueAnimator valueAnimator = this.f425418d;
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(valueAnimator);
            if (runnable != null) {
                runnable.run();
            }
            mVar.f425388a.remove(valueAnimator);
        }
        mVar.getClass();
    }
}

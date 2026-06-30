package fl1;

/* loaded from: classes14.dex */
public class s1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f345398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fl1.u1 f345399e;

    public s1(fl1.u1 u1Var, java.lang.Runnable runnable) {
        this.f345399e = u1Var;
        this.f345398d = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f345399e.f345410c = null;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f345398d;
        if (runnable != null) {
            runnable.run();
        }
        this.f345399e.f345410c = null;
    }
}

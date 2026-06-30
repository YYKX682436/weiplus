package zl1;

/* loaded from: classes7.dex */
public class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f555100d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.animation.Animator f555101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zl1.t f555102f;

    public a(zl1.t tVar, java.lang.Runnable runnable, android.animation.Animator animator) {
        this.f555102f = tVar;
        this.f555100d = runnable;
        this.f555101e = animator;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        java.lang.Runnable runnable = this.f555100d;
        if (runnable != null) {
            this.f555102f.post(runnable);
        }
        this.f555101e.removeListener(this);
    }
}

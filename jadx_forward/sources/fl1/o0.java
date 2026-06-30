package fl1;

/* loaded from: classes7.dex */
public class o0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345369d;

    public o0(fl1.c1 c1Var) {
        this.f345369d = c1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        fl1.c1 c1Var = this.f345369d;
        c1Var.f345275n.setAlpha(0.0f);
        c1Var.f345275n.setVisibility(0);
    }
}

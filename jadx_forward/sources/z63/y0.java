package z63;

/* loaded from: classes5.dex */
public class y0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z63.z0 f551984d;

    public y0(z63.z0 z0Var) {
        this.f551984d = z0Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        int intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
        z63.f1 f1Var = this.f551984d.f551986d.f551898d;
        f1Var.f551917e.update(f1Var.f551926n, intValue, -1, -1);
    }
}

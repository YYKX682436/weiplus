package fl1;

/* loaded from: classes14.dex */
public class t1 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl1.u1 f345403d;

    public t1(fl1.u1 u1Var) {
        this.f345403d = u1Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        android.view.View view = this.f345403d.f345408a;
        if (view != null) {
            view.setBackgroundColor(((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}

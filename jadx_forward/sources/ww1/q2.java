package ww1;

/* loaded from: classes15.dex */
public class q2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ww1.b3 f531804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ww1.a3 f531805e;

    public q2(ww1.b3 b3Var, ww1.a3 a3Var) {
        this.f531804d = b3Var;
        this.f531805e = a3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        super.onAnimationEnd(animator);
        ww1.b3 b3Var = this.f531804d;
        android.view.ViewGroup.LayoutParams layoutParams = b3Var.f531670i.getLayoutParams();
        layoutParams.height = -2;
        b3Var.f531670i.setLayoutParams(layoutParams);
        ww1.a3 a3Var = this.f531805e;
        if (a3Var != null && a3Var.f531622a0 && b3Var.O.getVisibility() == 0) {
            b3Var.f531670i.postDelayed(new ww1.p2(this), 50L);
        }
    }
}

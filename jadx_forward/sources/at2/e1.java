package at2;

/* loaded from: classes3.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f95186d;

    public e1(at2.n1 n1Var) {
        this.f95186d = n1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        at2.n1 n1Var = this.f95186d;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(n1Var.x1(), "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(n1Var.w1(), "alpha", 1.0f, 0.0f);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(n1Var.v1(), "alpha", 0.0f, 1.0f);
        n1Var.v1().setVisibility(0);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3);
        animatorSet.addListener(new at2.d1(n1Var));
        animatorSet.start();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(n1Var.f95247p, "start title fade animator!");
    }
}

package fl1;

/* loaded from: classes7.dex */
public class x0 implements android.widget.RatingBar.OnRatingBarChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fl1.c1 f345423a;

    public x0(fl1.c1 c1Var) {
        this.f345423a = c1Var;
    }

    @Override // android.widget.RatingBar.OnRatingBarChangeListener
    public void onRatingChanged(android.widget.RatingBar ratingBar, float f17, boolean z17) {
        fl1.c1 c1Var = this.f345423a;
        if (c1Var.f345263b) {
            c1Var.k((int) f17);
            if (f17 < 1.0f) {
                c1Var.f345272k.setRating(1.0f);
                return;
            }
            return;
        }
        c1Var.f345263b = true;
        c1Var.k((int) f17);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(c1Var.f345271j, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new fl1.l0(c1Var));
        android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(c1Var.f345274m, "alpha", 1.0f, 0.0f);
        ofFloat2.addListener(new fl1.m0(c1Var));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.playTogether(ofFloat, ofFloat2);
        animatorSet.setDuration(200L);
        animatorSet.setInterpolator(new android.view.animation.AccelerateInterpolator());
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(c1Var.f345273l, "alpha", 0.0f, 1.0f);
        ofFloat3.addListener(new fl1.n0(c1Var));
        android.animation.ObjectAnimator ofFloat4 = android.animation.ObjectAnimator.ofFloat(c1Var.f345275n, "alpha", 0.0f, 1.0f);
        ofFloat4.addListener(new fl1.o0(c1Var));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setDuration(200L);
        animatorSet2.setInterpolator(new android.view.animation.AccelerateInterpolator());
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        animatorSet3.playSequentially(animatorSet, animatorSet2);
        animatorSet3.start();
    }
}

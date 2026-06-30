package ub3;

/* loaded from: classes15.dex */
public class h0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507639d;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507639d = c16332x7cb9791e;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507639d;
        ((java.util.ArrayList) c16332x7cb9791e.f226645d).remove(c16332x7cb9791e.f226654p);
        android.animation.ValueAnimator valueAnimator = c16332x7cb9791e.f226647f;
        if (valueAnimator != null) {
            valueAnimator.start();
        }
        c16332x7cb9791e.i(c16332x7cb9791e.f226657s);
        if (c16332x7cb9791e.f226660v <= 0) {
            c16332x7cb9791e.f226656r = null;
            c16332x7cb9791e.f226657s = 0;
        } else {
            int random = (int) (java.lang.Math.random() * c16332x7cb9791e.f226660v);
            c16332x7cb9791e.f226657s = random;
            c16332x7cb9791e.f226656r = (android.view.View) ((java.util.ArrayList) c16332x7cb9791e.f226645d).get(random);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

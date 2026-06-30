package ub3;

/* loaded from: classes15.dex */
public class i0 implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e f507645d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e) {
        this.f507645d = c16332x7cb9791e;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.f2f.ui.C16332x7cb9791e c16332x7cb9791e = this.f507645d;
        ub3.t0 t0Var = c16332x7cb9791e.f226651m;
        if (t0Var != null) {
            ((ub3.e) t0Var).a(valueAnimator, c16332x7cb9791e.f226654p);
        }
    }
}

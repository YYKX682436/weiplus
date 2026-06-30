package mi1;

/* loaded from: classes7.dex */
public final class g1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f408093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f408094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f408095f;

    public g1(mi1.q1 q1Var, android.widget.LinearLayout linearLayout, mi1.r1 r1Var) {
        this.f408093d = q1Var;
        this.f408094e = linearLayout;
        this.f408095f = r1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        mi1.q1 q1Var = this.f408093d;
        q1Var.f408196d.f156354z.l();
        this.f408094e.setVisibility(8);
        q1Var.f408196d.f156354z.d().f172570h = false;
        mi1.q1.b(q1Var);
        jz5.g gVar = mi1.q1.f408195h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleTipsAnimator", "animateShow-> onAnimationEnd ->reportCapsuleTipsMutation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = q1Var.f408196d;
        mi1.r1 r1Var = this.f408095f;
        if (r1Var != null) {
            i17 = r1Var.f408209e;
        } else {
            mi1.z0 z0Var = mi1.z0.f408272e;
            i17 = 0;
        }
        c11510xdd90c2f2.E1(false, i17);
    }
}

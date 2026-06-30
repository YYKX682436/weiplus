package mi1;

/* loaded from: classes7.dex */
public final class h1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f408097d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.q1 f408098e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mi1.r1 f408099f;

    public h1(android.widget.LinearLayout linearLayout, mi1.q1 q1Var, mi1.r1 r1Var) {
        this.f408097d = linearLayout;
        this.f408098e = q1Var;
        this.f408099f = r1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        mi1.t1 t1Var = mi1.t1.f408225a;
        mi1.q1 q1Var = this.f408098e;
        android.widget.TextView a17 = t1Var.a(q1Var.f408196d);
        mi1.r1 r1Var = this.f408099f;
        if (a17 != null) {
            a17.setText(r1Var.f408205a);
            t1Var.c(a17, r1Var.f408211g, false);
        }
        mi1.q1.b(q1Var);
        if (r1Var.f408210f) {
            this.f408097d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562305yj);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationStart(animation);
        this.f408097d.setVisibility(0);
        mi1.q1 q1Var = this.f408098e;
        q1Var.f408196d.f156354z.m();
        jz5.g gVar = mi1.q1.f408195h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CapsuleTipsAnimator", "animateShow-> onAnimationStart ->reportCapsuleTipsMutation");
        q1Var.f408196d.E1(true, this.f408099f.f408209e);
    }
}

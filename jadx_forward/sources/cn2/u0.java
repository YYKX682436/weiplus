package cn2;

/* loaded from: classes3.dex */
public final class u0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.y0 f125152d;

    public u0(cn2.y0 y0Var) {
        this.f125152d = y0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHotCommentWidget", "inAnim End");
        java.lang.Integer[] numArr = cn2.y0.f125173n;
        cn2.y0 y0Var = this.f125152d;
        y0Var.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.L1;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 1);
        gVar.h("hot_word", ((android.widget.TextView) ((jz5.n) y0Var.f125176c).mo141623x754a37bb()).getText());
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        cn2.y0.a(y0Var);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveHotCommentWidget", "inAnim Start");
        this.f125152d.f125174a.setVisibility(0);
    }
}

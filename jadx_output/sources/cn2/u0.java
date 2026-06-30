package cn2;

/* loaded from: classes3.dex */
public final class u0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.y0 f43619d;

    public u0(cn2.y0 y0Var) {
        this.f43619d = y0Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("FinderLiveHotCommentWidget", "inAnim End");
        java.lang.Integer[] numArr = cn2.y0.f43640n;
        cn2.y0 y0Var = this.f43619d;
        y0Var.getClass();
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0 r0Var = (ml2.r0) c17;
        ml2.b4 b4Var = ml2.b4.L1;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 1);
        gVar.h("hot_word", ((android.widget.TextView) ((jz5.n) y0Var.f43643c).getValue()).getText());
        ml2.r0.hj(r0Var, b4Var, gVar.toString(), 0L, null, null, null, null, null, 252, null);
        cn2.y0.a(y0Var);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        com.tencent.mars.xlog.Log.i("FinderLiveHotCommentWidget", "inAnim Start");
        this.f43619d.f43641a.setVisibility(0);
    }
}

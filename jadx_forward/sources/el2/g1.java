package el2;

/* loaded from: classes3.dex */
public final class g1 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i1 f335333d;

    public g1(el2.i1 i1Var) {
        this.f335333d = i1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        el2.i1 i1Var = this.f335333d;
        i1Var.n().setAlpha(0.0f);
        i1Var.n().setVisibility(0);
        p3325xe03a0797.p3326xc267989b.r2 r2Var = i1Var.f335360v;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        if (i1Var.n().f()) {
            return;
        }
        i1Var.f335360v = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.m(i1Var.f335347f, null, null, new el2.f1(i1Var.n(), null), 3, null);
    }
}

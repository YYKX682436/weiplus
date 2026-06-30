package m31;

/* loaded from: classes9.dex */
public final class l1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.p1 f404697d;

    public l1(m31.p1 p1Var) {
        this.f404697d = p1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        m31.p1 p1Var = this.f404697d;
        java.lang.Integer num = p1Var.G;
        if (num != null) {
            android.view.View findViewById = p1Var.f404726t.findViewById(num.intValue());
            if (findViewById != null) {
                ((android.widget.LinearLayout) p1Var.f404726t.findViewById(com.p314xaae8f345.mm.R.id.cg7)).removeView(findViewById);
            }
        }
        zk1.a.a(p1Var.f404716g);
    }
}

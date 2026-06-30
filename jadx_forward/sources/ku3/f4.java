package ku3;

/* loaded from: classes3.dex */
public final class f4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.m4 f393765d;

    public f4(ku3.m4 m4Var) {
        this.f393765d = m4Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        ku3.m4 m4Var = this.f393765d;
        zt3.a.U6(m4Var.f393851d, 12, 4, null, 4, null);
        zt3.a.U6(m4Var.f393851d, 16, 0, null, 4, null);
    }
}

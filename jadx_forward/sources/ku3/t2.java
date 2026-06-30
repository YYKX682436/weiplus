package ku3;

/* loaded from: classes3.dex */
public final class t2 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.e3 f393949d;

    public t2(ku3.e3 e3Var) {
        this.f393949d = e3Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        ku3.e3 e3Var = this.f393949d;
        zt3.a.U6(e3Var.f393737d, 13, 4, null, 4, null);
        zt3.a.U6(e3Var.f393737d, 16, 0, null, 4, null);
    }
}

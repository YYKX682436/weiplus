package ku3;

/* loaded from: classes3.dex */
public final class z4 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ku3.i5 f394038d;

    public z4(ku3.i5 i5Var) {
        this.f394038d = i5Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation, z17);
        ku3.i5 i5Var = this.f394038d;
        zt3.a.U6(i5Var.f393795d, 14, 4, null, 4, null);
        zt3.a.U6(i5Var.f393795d, 16, 0, null, 4, null);
    }
}

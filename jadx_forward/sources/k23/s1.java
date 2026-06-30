package k23;

/* loaded from: classes12.dex */
public final class s1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k23.j2 f385224d;

    public s1(k23.j2 j2Var) {
        this.f385224d = j2Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141815xa4d2fcce;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 m141815xa4d2fcce2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        k23.j2 j2Var = this.f385224d;
        m141815xa4d2fcce = j2Var.m141815xa4d2fcce();
        m141815xa4d2fcce.setVisibility(8);
        m141815xa4d2fcce2 = j2Var.m141815xa4d2fcce();
        m141815xa4d2fcce2.setAlpha(1.0f);
    }
}

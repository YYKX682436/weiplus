package xt2;

/* loaded from: classes3.dex */
public final class x3 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.z3 f538631d;

    public x3(xt2.z3 z3Var) {
        this.f538631d = z3Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f538631d.f538673d.setTranslationY(0.0f);
    }
}

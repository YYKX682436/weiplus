package gl5;

/* loaded from: classes5.dex */
public final class m0 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f354576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354577e;

    public m0(android.view.ViewPropertyAnimator viewPropertyAnimator, gl5.d1 d1Var) {
        this.f354576d = viewPropertyAnimator;
        this.f354577e = d1Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        android.view.ViewPropertyAnimator viewPropertyAnimator = this.f354576d;
        viewPropertyAnimator.setListener(null);
        viewPropertyAnimator.setUpdateListener(null);
        gl5.d1 d1Var = this.f354577e;
        android.view.View d17 = d1Var.d();
        d17.setOutlineProvider(new zl5.a(true, false, 0.0f));
        d17.setClipToOutline(true);
        gl5.d1.a(d1Var);
        java.lang.Object mo141623x754a37bb = ((jz5.n) d1Var.f354472p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22698xdfbd289f) mo141623x754a37bb).setVisibility(0);
    }
}

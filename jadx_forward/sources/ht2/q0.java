package ht2;

/* loaded from: classes.dex */
public final class q0 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f366428d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f366429e;

    public q0(android.view.ViewGroup viewGroup, android.widget.LinearLayout linearLayout) {
        this.f366428d = viewGroup;
        this.f366429e = linearLayout;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f366428d.removeView(this.f366429e);
    }
}

package sc2;

/* loaded from: classes2.dex */
public final class y2 extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.b3 f487913d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f487914e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487915f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487916g;

    public y2(sc2.b3 b3Var, float f17, android.view.View view, android.view.View view2) {
        this.f487913d = b3Var;
        this.f487914e = f17;
        this.f487915f = view;
        this.f487916g = view2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        sc2.b3 b3Var = this.f487913d;
        android.view.View view = b3Var.f487310x;
        if (view != null) {
            view.post(new sc2.x2(b3Var, this.f487914e, this.f487915f, this.f487916g));
        }
    }
}

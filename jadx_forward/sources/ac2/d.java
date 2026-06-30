package ac2;

/* loaded from: classes2.dex */
public final class d extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f84551d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac2.g f84552e;

    public d(android.view.ViewPropertyAnimator viewPropertyAnimator, ac2.g gVar) {
        this.f84551d = viewPropertyAnimator;
        this.f84552e = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator ani) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ani, "ani");
        this.f84551d.setListener(null);
        this.f84552e.f84561f = 100.0f;
    }
}

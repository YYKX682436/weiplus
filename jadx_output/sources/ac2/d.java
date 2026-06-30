package ac2;

/* loaded from: classes2.dex */
public final class d extends wa2.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewPropertyAnimator f3018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ac2.g f3019e;

    public d(android.view.ViewPropertyAnimator viewPropertyAnimator, ac2.g gVar) {
        this.f3018d = viewPropertyAnimator;
        this.f3019e = gVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator ani) {
        kotlin.jvm.internal.o.g(ani, "ani");
        this.f3018d.setListener(null);
        this.f3019e.f3028f = 100.0f;
    }
}

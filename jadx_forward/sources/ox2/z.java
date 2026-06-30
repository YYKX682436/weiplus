package ox2;

/* loaded from: classes5.dex */
public final class z implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f431253e;

    public z(yz5.a aVar, yz5.a aVar2) {
        this.f431252d = aVar;
        this.f431253e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f431253e.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f431252d.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

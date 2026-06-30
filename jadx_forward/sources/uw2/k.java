package uw2;

/* loaded from: classes2.dex */
public final class k implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513220d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513221e;

    public k(yz5.a aVar, yz5.a aVar2) {
        this.f513220d = aVar;
        this.f513221e = aVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f513221e.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f513220d.mo152xb9724478();
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
    }
}

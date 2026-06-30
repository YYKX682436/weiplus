package ht2;

/* loaded from: classes2.dex */
public final class e0 implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366354d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366355e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f366356f;

    public e0(yz5.l lVar, yz5.l lVar2, yz5.l lVar3) {
        this.f366354d = lVar;
        this.f366355e = lVar2;
        this.f366356f = lVar3;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        this.f366355e.mo146xb9724478(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        this.f366354d.mo146xb9724478(animator);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        this.f366356f.mo146xb9724478(animator);
    }
}

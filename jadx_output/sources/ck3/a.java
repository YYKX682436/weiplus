package ck3;

/* loaded from: classes3.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f42442d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f42443e;

    public a(yz5.l lVar, yz5.l lVar2) {
        this.f42442d = lVar;
        this.f42443e = lVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        yz5.l lVar = this.f42443e;
        if (lVar != null) {
            lVar.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
        yz5.l lVar = this.f42442d;
        if (lVar != null) {
            lVar.invoke(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        kotlin.jvm.internal.o.g(animator, "animator");
    }
}

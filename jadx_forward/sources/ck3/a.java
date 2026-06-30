package ck3;

/* loaded from: classes3.dex */
public final class a implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f123975d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.l f123976e;

    public a(yz5.l lVar, yz5.l lVar2) {
        this.f123975d = lVar;
        this.f123976e = lVar2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        yz5.l lVar = this.f123976e;
        if (lVar != null) {
            lVar.mo146xb9724478(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
        yz5.l lVar = this.f123975d;
        if (lVar != null) {
            lVar.mo146xb9724478(animator);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animator, "animator");
    }
}

package ys2;

/* loaded from: classes3.dex */
public final class g implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f546690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ys2.h f546691e;

    public g(ys2.h hVar) {
        this.f546691e = hVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        this.f546690d = true;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        boolean z17 = this.f546690d;
        ys2.h hVar = this.f546691e;
        if (z17) {
            java.lang.String str = hVar.f546692m;
        } else {
            animation.start();
            java.lang.String str2 = hVar.f546692m;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}

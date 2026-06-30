package ok;

/* loaded from: classes10.dex */
public final class h implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ok.i f427463d;

    public h(ok.i iVar) {
        this.f427463d = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ok.i iVar = this.f427463d;
        iVar.f427460a = true;
        iVar.f427461b = false;
        iVar.f427468g = 0.0f;
        iVar.f427469h = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ok.i iVar = this.f427463d;
        iVar.f427460a = true;
        iVar.f427461b = false;
        iVar.f427468g = 0.0f;
        iVar.f427469h = 0.0f;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ok.i iVar = this.f427463d;
        iVar.f427460a = false;
        iVar.f427468g = 0.0f;
        iVar.f427469h = 0.0f;
    }
}

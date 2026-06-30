package bp2;

/* loaded from: classes3.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f104580d;

    public d(bp2.i iVar) {
        this.f104580d = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        bp2.i iVar = this.f104580d;
        iVar.getClass();
        java.lang.Runnable runnable = iVar.f104599p;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = iVar.f104598o;
        if (runnable != null) {
            n3Var.mo50300x3fa464aa(runnable);
            iVar.f104599p = null;
        }
        bp2.h hVar = new bp2.h(iVar);
        iVar.f104599p = hVar;
        n3Var.mo50297x7c4d7ca2(hVar, 0L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        android.view.View view = this.f104580d.f104586c;
        if (view != null) {
            view.setTag(com.p314xaae8f345.mm.R.id.f567635k64, "loading");
        }
    }
}

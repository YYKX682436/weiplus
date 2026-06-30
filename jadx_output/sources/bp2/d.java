package bp2;

/* loaded from: classes3.dex */
public final class d implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f23047d;

    public d(bp2.i iVar) {
        this.f23047d = iVar;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        bp2.i iVar = this.f23047d;
        iVar.getClass();
        java.lang.Runnable runnable = iVar.f23066p;
        com.tencent.mm.sdk.platformtools.n3 n3Var = iVar.f23065o;
        if (runnable != null) {
            n3Var.removeCallbacks(runnable);
            iVar.f23066p = null;
        }
        bp2.h hVar = new bp2.h(iVar);
        iVar.f23066p = hVar;
        n3Var.postDelayed(hVar, 0L);
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        android.view.View view = this.f23047d.f23053c;
        if (view != null) {
            view.setTag(com.tencent.mm.R.id.f486102k64, "loading");
        }
    }
}

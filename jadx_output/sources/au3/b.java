package au3;

/* loaded from: classes10.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f14095d;

    public b(au3.l lVar) {
        this.f14095d = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        au3.l lVar = this.f14095d;
        lVar.f14114g.setVisibility(8);
        lVar.f14114g.setAlpha(1.0f);
    }
}

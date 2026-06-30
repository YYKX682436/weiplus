package au3;

/* loaded from: classes10.dex */
public final class a extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f95627d;

    public a(au3.l lVar) {
        this.f95627d = lVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        au3.l lVar = this.f95627d;
        lVar.f95647g.setVisibility(8);
        lVar.f95647g.setAlpha(1.0f);
    }
}

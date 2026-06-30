package ed5;

/* loaded from: classes5.dex */
public final class h extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed5.c f332894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewOverlay f332895e;

    public h(ed5.c cVar, android.view.ViewOverlay viewOverlay) {
        this.f332894d = cVar;
        this.f332895e = viewOverlay;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        ed5.c cVar = this.f332894d;
        if (cVar.f332883c) {
            this.f332895e.remove(cVar);
            cVar.f332883c = false;
        }
    }
}

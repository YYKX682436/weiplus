package ny;

/* loaded from: classes3.dex */
public final class d extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f422904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ny.g f422905e;

    public d(ny.a aVar, android.view.ViewGroup viewGroup, ny.g gVar) {
        this.f422904d = viewGroup;
        this.f422905e = gVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Animation cancelled");
        ny.g gVar = this.f422905e;
        android.view.ViewGroup viewGroup = this.f422904d;
        viewGroup.post(new ny.b(gVar, viewGroup));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Animation ended");
        ny.g gVar = this.f422905e;
        android.view.ViewGroup viewGroup = this.f422904d;
        viewGroup.post(new ny.c(gVar, viewGroup));
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BubbleFlyAnimationHelper", "Animation started");
    }
}

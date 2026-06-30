package pe2;

/* loaded from: classes3.dex */
public final class b extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pe2.h f435147d;

    public b(pe2.h hVar) {
        this.f435147d = hVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        super.onAnimationEnd(animation);
        pe2.h hVar = this.f435147d;
        hVar.f435163p.n();
        hVar.f435163p.setVisibility(8);
    }
}

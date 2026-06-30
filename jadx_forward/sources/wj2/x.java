package wj2;

/* loaded from: classes10.dex */
public final class x implements android.animation.Animator.AnimatorListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.y f528267d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f528268e;

    public x(wj2.y yVar, boolean z17) {
        this.f528267d = yVar;
        this.f528268e = z17;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        wj2.y yVar = this.f528267d;
        yVar.m174021x80f09de4().setVisibility(8);
        if (this.f528268e) {
            yVar.m151530xe347cf6c().setVisibility(0);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        wj2.y yVar = this.f528267d;
        yVar.m174021x80f09de4().setVisibility(8);
        if (this.f528268e) {
            yVar.m151530xe347cf6c().setVisibility(0);
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator p07) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
    }
}

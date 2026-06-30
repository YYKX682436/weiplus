package ec3;

/* loaded from: classes.dex */
public final class o1 extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f332604d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.RelativeLayout f332605e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f332606f;

    public o1(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.widget.RelativeLayout relativeLayout, yz5.a aVar) {
        this.f332604d = c0Var;
        this.f332605e = relativeLayout;
        this.f332606f = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if (!this.f332604d.f391645d) {
            this.f332605e.setVisibility(8);
        }
        yz5.a aVar = this.f332606f;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
    }
}

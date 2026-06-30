package p10;

/* loaded from: classes8.dex */
public final class r extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f432517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f432518f;

    public r(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3, float f17, float f18) {
        this.f432516d = c10541x905158a3;
        this.f432517e = f17;
        this.f432518f = f18;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3.G;
        this.f432516d.c(1, this.f432517e, this.f432518f);
    }
}

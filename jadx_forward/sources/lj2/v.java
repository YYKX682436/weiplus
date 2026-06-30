package lj2;

/* loaded from: classes10.dex */
public final class v extends android.animation.AnimatorListenerAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f400487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lj2.c0 f400488e;

    public v(yz5.a aVar, lj2.c0 c0Var) {
        this.f400487d = aVar;
        this.f400488e = c0Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(android.animation.Animator animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        yz5.a aVar = this.f400487d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        this.f400488e.b().a(8);
    }
}

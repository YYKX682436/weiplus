package uw2;

/* loaded from: classes2.dex */
public final class h implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f513206d;

    public h(yz5.a aVar) {
        this.f513206d = aVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        yz5.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(it.getAnimatedValue(), java.lang.Float.valueOf(0.0f)) || (aVar = this.f513206d) == null) {
            return;
        }
        aVar.mo152xb9724478();
    }
}

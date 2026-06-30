package eh5;

/* loaded from: classes10.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eh5.y f334499d;

    public m(eh5.y yVar) {
        this.f334499d = yVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 c22642x62f5b194 = this.f334499d.f334515n;
        if (c22642x62f5b194 != null) {
            c22642x62f5b194.invalidateOutline();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentContainer");
            throw null;
        }
    }
}

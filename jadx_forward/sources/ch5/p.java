package ch5;

/* loaded from: classes14.dex */
public final class p implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 f123148d;

    public p(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2 c22419xb3ed8ff2) {
        this.f123148d = c22419xb3ed8ff2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a C0 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22419xb3ed8ff2.C0(this.f123148d);
        if (C0 != null) {
            C0.a(1.0f - floatValue);
        }
    }
}

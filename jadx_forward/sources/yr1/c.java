package yr1;

/* loaded from: classes14.dex */
public final class c implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 f546170d;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 c12995x6d6be93) {
        this.f546170d = c12995x6d6be93;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        java.lang.Float f17 = animatedValue instanceof java.lang.Float ? (java.lang.Float) animatedValue : null;
        float floatValue = f17 != null ? f17.floatValue() : 0.0f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 c12995x6d6be93 = this.f546170d;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = c12995x6d6be93.f175609o;
        if (aVar != null) {
            aVar.a(floatValue);
        }
        if (floatValue == 1.0f) {
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar2 = c12995x6d6be93.f175609o;
            if (aVar2 != null) {
                aVar2.c(false, false, 0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar3 = c12995x6d6be93.f175609o;
            if (aVar3 != null) {
                aVar3.b();
            }
        }
    }
}

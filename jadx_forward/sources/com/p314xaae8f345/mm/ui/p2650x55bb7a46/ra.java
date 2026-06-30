package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public final class ra implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.db f284180d;

    public ra(com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar) {
        this.f284180d = dbVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object animatedValue = it.getAnimatedValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        int floatValue = (int) ((java.lang.Float) animatedValue).floatValue();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.db dbVar = this.f284180d;
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.ta) dbVar.f281958e).b(floatValue, dbVar.f281959f);
    }
}

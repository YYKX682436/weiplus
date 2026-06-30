package com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1;

/* loaded from: classes8.dex */
public final class e implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 f295118d;

    public e(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 c22822xceb63781) {
        this.f295118d = c22822xceb63781;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openDrawer] setUpdateListener height:");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781 c22822xceb63781 = this.f295118d;
        sb6.append(c22822xceb63781.getHeight());
        sb6.append(", translationY:");
        sb6.append(c22822xceb63781.getTranslationY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DrawerSquares", sb6.toString());
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a onOpenDrawerListener = c22822xceb63781.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.a((c22822xceb63781.getTranslationY() * 1.0f) / c22822xceb63781.getHeight());
        }
    }
}

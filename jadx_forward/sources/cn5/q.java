package cn5;

/* loaded from: classes8.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 f125226d;

    public q(com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2) {
        this.f125226d = c22824x40bb30c2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openDrawer] setUpdateListener height:");
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22824x40bb30c2 c22824x40bb30c2 = this.f125226d;
        sb6.append(c22824x40bb30c2.getHeight());
        sb6.append(", translationY:");
        sb6.append(c22824x40bb30c2.getTranslationY());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("DrawerSquares", sb6.toString());
        cn5.k onOpenDrawerListener = c22824x40bb30c2.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.a((c22824x40bb30c2.getTranslationY() * 1.0f) / c22824x40bb30c2.getHeight());
        }
    }
}

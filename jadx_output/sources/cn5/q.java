package cn5;

/* loaded from: classes8.dex */
public final class q implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares f43693d;

    public q(com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares) {
        this.f43693d = textStatusRecyclerViewDrawerSquares;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[openDrawer] setUpdateListener height:");
        com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = this.f43693d;
        sb6.append(textStatusRecyclerViewDrawerSquares.getHeight());
        sb6.append(", translationY:");
        sb6.append(textStatusRecyclerViewDrawerSquares.getTranslationY());
        com.tencent.mars.xlog.Log.i("DrawerSquares", sb6.toString());
        cn5.k onOpenDrawerListener = textStatusRecyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.a((textStatusRecyclerViewDrawerSquares.getTranslationY() * 1.0f) / textStatusRecyclerViewDrawerSquares.getHeight());
        }
    }
}

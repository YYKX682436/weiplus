package cn5;

/* loaded from: classes8.dex */
public final class m implements android.animation.ValueAnimator.AnimatorUpdateListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares f43689d;

    public m(com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares) {
        this.f43689d = textStatusRecyclerViewDrawerSquares;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(android.animation.ValueAnimator it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = this.f43689d;
        textStatusRecyclerViewDrawerSquares.getHeight();
        textStatusRecyclerViewDrawerSquares.getTranslationY();
        cn5.k onOpenDrawerListener = textStatusRecyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.a((textStatusRecyclerViewDrawerSquares.getTranslationY() * 1.0f) / textStatusRecyclerViewDrawerSquares.getHeight());
        }
    }
}

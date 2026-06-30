package cn5;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f43682d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares) {
        super(1);
        this.f43682d = recyclerViewDrawerSquares;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a it = (yz5.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f43682d;
        if (!recyclerViewDrawerSquares.isClosing) {
            recyclerViewDrawerSquares.clearAnimation();
            recyclerViewDrawerSquares.animate().cancel();
            recyclerViewDrawerSquares.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(0.0f).withEndAction(new cn5.e(it)).setUpdateListener(new com.tencent.mm.view.drawer.e(recyclerViewDrawerSquares)).setDuration(300L).start();
        }
        return jz5.f0.f302826a;
    }
}

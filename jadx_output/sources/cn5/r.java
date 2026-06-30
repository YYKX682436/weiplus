package cn5;

/* loaded from: classes8.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares f43694d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares) {
        super(1);
        this.f43694d = textStatusRecyclerViewDrawerSquares;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        yz5.a it = (yz5.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = this.f43694d;
        if (!textStatusRecyclerViewDrawerSquares.isClosing) {
            textStatusRecyclerViewDrawerSquares.clearAnimation();
            textStatusRecyclerViewDrawerSquares.animate().cancel();
            textStatusRecyclerViewDrawerSquares.animate().setInterpolator(new android.view.animation.DecelerateInterpolator(1.5f)).translationY(0.0f).withEndAction(new cn5.p(it)).setUpdateListener(new cn5.q(textStatusRecyclerViewDrawerSquares)).setDuration(300L).start();
        }
        return jz5.f0.f302826a;
    }
}

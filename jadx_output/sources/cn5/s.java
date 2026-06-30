package cn5;

/* loaded from: classes10.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares f43695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43696e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares, int i17) {
        super(0);
        this.f43695d = textStatusRecyclerViewDrawerSquares;
        this.f43696e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = this.f43695d;
        textStatusRecyclerViewDrawerSquares.setOpening(false);
        cn5.k onOpenDrawerListener = textStatusRecyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(true, false, this.f43696e);
        }
        return jz5.f0.f302826a;
    }
}

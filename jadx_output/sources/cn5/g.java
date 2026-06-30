package cn5;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.RecyclerViewDrawerSquares f43683d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43684e;

    public g(com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares, int i17) {
        this.f43683d = recyclerViewDrawerSquares;
        this.f43684e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.f213536u;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares recyclerViewDrawerSquares = this.f43683d;
        recyclerViewDrawerSquares.getClass();
        ((cn5.f) recyclerViewDrawerSquares.f213548r).invoke(new com.tencent.mm.view.drawer.d(recyclerViewDrawerSquares, this.f43684e));
    }
}

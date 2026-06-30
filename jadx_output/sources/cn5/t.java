package cn5;

/* loaded from: classes10.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares f43697d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43698e;

    public t(com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares, int i17) {
        this.f43697d = textStatusRecyclerViewDrawerSquares;
        this.f43698e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = this.f43697d;
        textStatusRecyclerViewDrawerSquares.f213577r.invoke(new cn5.s(textStatusRecyclerViewDrawerSquares, this.f43698e));
    }
}

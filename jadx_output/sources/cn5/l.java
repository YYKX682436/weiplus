package cn5;

/* loaded from: classes10.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares f43688d;

    public l(com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares) {
        this.f43688d = textStatusRecyclerViewDrawerSquares;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.view.drawer.TextStatusRecyclerViewDrawerSquares textStatusRecyclerViewDrawerSquares = this.f43688d;
        textStatusRecyclerViewDrawerSquares.setVisibility(8);
        textStatusRecyclerViewDrawerSquares.setClosing(false);
        cn5.k onOpenDrawerListener = textStatusRecyclerViewDrawerSquares.getOnOpenDrawerListener();
        if (onOpenDrawerListener != null) {
            onOpenDrawerListener.c(false, false, 0);
        }
        com.tencent.mm.ui.tools.f5 f5Var = textStatusRecyclerViewDrawerSquares.f213574o;
        if (f5Var != null) {
            f5Var.d();
        }
        textStatusRecyclerViewDrawerSquares.f213578s = false;
        com.tencent.mm.ui.tools.c5 keyboardHeightObserver = textStatusRecyclerViewDrawerSquares.getKeyboardHeightObserver();
        if (keyboardHeightObserver != null) {
            keyboardHeightObserver.w2(0, false);
        }
    }
}

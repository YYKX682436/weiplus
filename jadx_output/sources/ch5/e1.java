package ch5;

/* loaded from: classes14.dex */
public final class e1 extends ch5.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41562a;

    public e1(com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout) {
        this.f41562a = wSHalfScreenDraggableLayout;
    }

    public final void a() {
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41562a;
        if (wSHalfScreenDraggableLayout.f208849n) {
            return;
        }
        wSHalfScreenDraggableLayout.f208849n = true;
        ch5.d1 d1Var = new ch5.d1(wSHalfScreenDraggableLayout);
        android.view.View view = wSHalfScreenDraggableLayout.f208846h;
        if (view != null) {
            com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.e(wSHalfScreenDraggableLayout, (int) view.getTranslationY(), wSHalfScreenDraggableLayout.getMDialogHeight(), 0L, null, null, d1Var, 28, null);
        }
    }
}

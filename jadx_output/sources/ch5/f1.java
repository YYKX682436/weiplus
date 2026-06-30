package ch5;

/* loaded from: classes14.dex */
public final class f1 implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41565d;

    public f1(com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout) {
        this.f41565d = wSHalfScreenDraggableLayout;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41565d;
        wSHalfScreenDraggableLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        android.view.ViewParent parent = wSHalfScreenDraggableLayout.getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        viewGroup.setClipChildren(false);
    }
}

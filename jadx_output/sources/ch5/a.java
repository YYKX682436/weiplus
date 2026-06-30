package ch5;

/* loaded from: classes14.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout f41534d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout) {
        super(0);
        this.f41534d = circleToSearchDraggableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41534d;
        circleToSearchDraggableLayout.setCurVisiblePercent(1.0f);
        yz5.p dragStatusBlock = circleToSearchDraggableLayout.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.invoke("STATE_DID_CHANGE_HEIGHT", java.lang.String.valueOf(circleToSearchDraggableLayout.getCurVisiblePercent()));
        }
        yz5.a dragFullScreenListener = circleToSearchDraggableLayout.getDragFullScreenListener();
        if (dragFullScreenListener == null) {
            return null;
        }
        dragFullScreenListener.invoke();
        return jz5.f0.f302826a;
    }
}

package ch5;

/* loaded from: classes14.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout) {
        super(0);
        this.f41539d = wSHalfScreenDraggableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41539d;
        wSHalfScreenDraggableLayout.getClass();
        yz5.a dragFullScreenListener = wSHalfScreenDraggableLayout.getDragFullScreenListener();
        if (dragFullScreenListener != null) {
            dragFullScreenListener.invoke();
        }
        wSHalfScreenDraggableLayout.f208851p = false;
        return null;
    }
}

package ch5;

/* loaded from: classes14.dex */
public final class j1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41594d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout) {
        super(0);
        this.f41594d = wSHalfScreenDraggableLayout;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41594d;
        yz5.p dragStatusBlock = wSHalfScreenDraggableLayout.getDragStatusBlock();
        if (dragStatusBlock == null) {
            return null;
        }
        dragStatusBlock.invoke("onHalfScreenHeightWillChange", com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout.a(wSHalfScreenDraggableLayout));
        return jz5.f0.f302826a;
    }
}

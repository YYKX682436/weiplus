package ch5;

/* loaded from: classes14.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout f41597d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f41598e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout, int i17) {
        super(0);
        this.f41597d = wSHalfScreenDraggableLayout;
        this.f41598e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.a dragFullScreenListener;
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = this.f41597d;
        wSHalfScreenDraggableLayout.getClass();
        if (java.lang.Math.abs(this.f41598e - wSHalfScreenDraggableLayout.f208850o) >= 5 || (dragFullScreenListener = wSHalfScreenDraggableLayout.getDragFullScreenListener()) == null) {
            return null;
        }
        dragFullScreenListener.invoke();
        return null;
    }
}

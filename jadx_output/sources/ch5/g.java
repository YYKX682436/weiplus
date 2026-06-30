package ch5;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout f41566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f41567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f41568f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout, float f17, yz5.a aVar) {
        super(0);
        this.f41566d = circleToSearchDraggableLayout;
        this.f41567e = f17;
        this.f41568f = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchDraggableLayout circleToSearchDraggableLayout = this.f41566d;
        circleToSearchDraggableLayout.setCurVisiblePercent(this.f41567e);
        yz5.p dragStatusBlock = circleToSearchDraggableLayout.getDragStatusBlock();
        if (dragStatusBlock != null) {
            dragStatusBlock.invoke("STATE_DID_CHANGE_HEIGHT", java.lang.String.valueOf(circleToSearchDraggableLayout.getCurVisiblePercent()));
        }
        yz5.a aVar = this.f41568f;
        if (aVar == null) {
            return null;
        }
        aVar.invoke();
        return jz5.f0.f302826a;
    }
}

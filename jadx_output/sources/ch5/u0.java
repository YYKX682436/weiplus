package ch5;

/* loaded from: classes8.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41626d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(1);
        this.f41626d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41626d;
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = mPWebSearchHomeHalfScreen.P;
        if (wSHalfScreenDraggableLayout != null) {
            wSHalfScreenDraggableLayout.setDragFinishInterceptor(new ch5.t0(mPWebSearchHomeHalfScreen));
        }
        return jz5.f0.f302826a;
    }
}

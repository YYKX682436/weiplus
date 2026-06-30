package ch5;

/* loaded from: classes14.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41564d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(0);
        this.f41564d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41564d;
        com.tencent.mm.ui.halfscreen.custom.WSHalfScreenDraggableLayout wSHalfScreenDraggableLayout = mPWebSearchHomeHalfScreen.P;
        if (wSHalfScreenDraggableLayout != null) {
            wSHalfScreenDraggableLayout.setOnClickCallback(null);
        }
        android.view.View o07 = mPWebSearchHomeHalfScreen.o0();
        o07.setOutlineProvider(new zl5.a(true, true, 0.0f));
        o07.setClipToOutline(true);
        yz5.a aVar = (yz5.a) ((jz5.n) mPWebSearchHomeHalfScreen.f208839J).getValue();
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}

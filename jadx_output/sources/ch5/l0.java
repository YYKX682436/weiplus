package ch5;

/* loaded from: classes14.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41600d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(0);
        this.f41600d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object a17 = ok5.d.a(this.f41600d.getIntent(), "INTENT_KEY_HALFSCREEN_DRAWER_LISTENER");
        if (a17 instanceof com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) {
            return (com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a) a17;
        }
        return null;
    }
}

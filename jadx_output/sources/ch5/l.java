package ch5;

/* loaded from: classes14.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41599d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(1);
        this.f41599d = circleToSearchHalfScreen;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen = this.f41599d;
        circleToSearchHalfScreen.R = floatValue;
        com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(circleToSearchHalfScreen);
        if (C0 != null) {
            C0.a(1.0f - floatValue);
        }
        return jz5.f0.f302826a;
    }
}

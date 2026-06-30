package ch5;

/* loaded from: classes14.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41605d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41605d = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.U;
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen = this.f41605d;
        android.view.View o07 = circleToSearchHalfScreen.o0();
        o07.setOutlineProvider(new zl5.a(true, true, 0.0f));
        o07.setClipToOutline(true);
        yz5.a aVar = (yz5.a) ((jz5.n) circleToSearchHalfScreen.f208837J).getValue();
        if (aVar != null) {
            aVar.invoke();
        }
        return jz5.f0.f302826a;
    }
}

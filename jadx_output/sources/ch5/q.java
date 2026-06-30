package ch5;

/* loaded from: classes14.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen f41617d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen) {
        super(0);
        this.f41617d = circleToSearchHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen circleToSearchHalfScreen = this.f41617d;
        float f17 = circleToSearchHalfScreen.R;
        if (f17 <= 0.0f) {
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(circleToSearchHalfScreen);
            if (C0 != null) {
                C0.a(1.0f);
            }
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C02 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(circleToSearchHalfScreen);
            if (C02 != null) {
                C02.c(false, false, 0);
            }
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C03 = com.tencent.mm.ui.halfscreen.custom.CircleToSearchHalfScreen.C0(circleToSearchHalfScreen);
            if (C03 != null) {
                C03.b();
            }
            yz5.a aVar = circleToSearchHalfScreen.f208804e.f232620f;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
            ofFloat.setDuration(300L);
            ch5.p pVar = new ch5.p(circleToSearchHalfScreen);
            ch5.o oVar = new ch5.o(circleToSearchHalfScreen, ofFloat, pVar);
            ofFloat.addUpdateListener(pVar);
            ofFloat.addListener(oVar);
            ofFloat.start();
        }
        return jz5.f0.f302826a;
    }
}

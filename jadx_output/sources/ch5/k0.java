package ch5;

/* loaded from: classes14.dex */
public final class k0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41596d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(0);
        this.f41596d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41596d;
        float f17 = mPWebSearchHomeHalfScreen.Q;
        if (f17 <= 0.0f) {
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C0 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(mPWebSearchHomeHalfScreen);
            if (C0 != null) {
                C0.a(1.0f);
            }
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C02 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(mPWebSearchHomeHalfScreen);
            if (C02 != null) {
                C02.c(false, false, 0);
            }
            com.tencent.mm.view.drawer.RecyclerViewDrawerSquares.a C03 = com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen.C0(mPWebSearchHomeHalfScreen);
            if (C03 != null) {
                C03.b();
            }
            yz5.a aVar = mPWebSearchHomeHalfScreen.f208804e.f232620f;
            if (aVar != null) {
                aVar.invoke();
            }
        } else {
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(f17, 0.0f);
            ofFloat.setDuration(300L);
            ch5.j0 j0Var = new ch5.j0(mPWebSearchHomeHalfScreen);
            ch5.i0 i0Var = new ch5.i0(mPWebSearchHomeHalfScreen, ofFloat, j0Var);
            ofFloat.addUpdateListener(j0Var);
            ofFloat.addListener(i0Var);
            ofFloat.start();
        }
        return jz5.f0.f302826a;
    }
}

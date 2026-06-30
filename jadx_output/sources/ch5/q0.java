package ch5;

/* loaded from: classes3.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41618d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        super(1);
        this.f41618d = mPWebSearchHomeHalfScreen;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        kotlin.jvm.internal.o.g(e17, "e");
        float rawX = e17.getRawX();
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41618d;
        float abs = java.lang.Math.abs(rawX - mPWebSearchHomeHalfScreen.T);
        float abs2 = java.lang.Math.abs(e17.getRawY() - mPWebSearchHomeHalfScreen.U);
        mPWebSearchHomeHalfScreen.T = e17.getRawX();
        mPWebSearchHomeHalfScreen.U = e17.getRawY();
        return (e17.getAction() != 2 || abs < abs2) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
    }
}

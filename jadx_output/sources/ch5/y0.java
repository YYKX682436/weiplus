package ch5;

/* loaded from: classes14.dex */
public final class y0 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen f41638d;

    public y0(com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen) {
        this.f41638d = mPWebSearchHomeHalfScreen;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.halfscreen.custom.MPWebSearchHomeHalfScreen mPWebSearchHomeHalfScreen = this.f41638d;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, ((java.lang.Number) ((jz5.n) mPWebSearchHomeHalfScreen.G).getValue()).floatValue());
        ofFloat.setDuration(300L);
        ch5.x0 x0Var = new ch5.x0(mPWebSearchHomeHalfScreen);
        ch5.w0 w0Var = new ch5.w0(mPWebSearchHomeHalfScreen, ofFloat, x0Var);
        ofFloat.addUpdateListener(x0Var);
        ofFloat.addListener(w0Var);
        ofFloat.start();
    }
}

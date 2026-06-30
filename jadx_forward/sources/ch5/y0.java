package ch5;

/* loaded from: classes14.dex */
public final class y0 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123171d;

    public y0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7) {
        this.f123171d = c22421x5301a0d7;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = this.f123171d;
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, ((java.lang.Number) ((jz5.n) c22421x5301a0d7.G).mo141623x754a37bb()).floatValue());
        ofFloat.setDuration(300L);
        ch5.x0 x0Var = new ch5.x0(c22421x5301a0d7);
        ch5.w0 w0Var = new ch5.w0(c22421x5301a0d7, ofFloat, x0Var);
        ofFloat.addUpdateListener(x0Var);
        ofFloat.addListener(w0Var);
        ofFloat.start();
    }
}

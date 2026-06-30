package bh5;

/* loaded from: classes3.dex */
public final class h0 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public static final bh5.h0 f102470d = new bh5.h0();

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        bh5.g0 g0Var = bh5.g0.f102468d;
        bh5.f0 f0Var = new bh5.f0(ofFloat, g0Var);
        ofFloat.addUpdateListener(g0Var);
        ofFloat.addListener(f0Var);
        ofFloat.start();
    }
}

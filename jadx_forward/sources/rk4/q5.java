package rk4;

/* loaded from: classes14.dex */
public final class q5 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f f478468d;

    public q5(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.C18710x505d67f c18710x505d67f) {
        this.f478468d = c18710x505d67f;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(android.content.DialogInterface dialogInterface) {
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(300L);
        ofFloat.addUpdateListener(new rk4.p5(this.f478468d));
        ofFloat.start();
    }
}

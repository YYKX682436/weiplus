package bb2;

/* loaded from: classes10.dex */
public final class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 f100378d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7) {
        this.f100378d = c13682x42ec4fe7;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderBulletFastFollowBtn", "footerEnableAlphaLayout layout changed, re-calculate position");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7.C;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1434xadde6502.C13682x42ec4fe7 c13682x42ec4fe7 = this.f100378d;
        if (c13682x42ec4fe7.getVisibility() == 0) {
            c13682x42ec4fe7.k();
        }
    }
}

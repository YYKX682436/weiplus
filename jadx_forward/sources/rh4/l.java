package rh4;

/* loaded from: classes8.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rh4.m f477294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f477295e;

    public l(rh4.m mVar, int i17) {
        this.f477294d = mVar;
        this.f477295e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rh4.m mVar = this.f477294d;
        boolean E0 = mVar.m162446x4905e9fa().E0();
        int i17 = this.f477295e;
        if (E0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "isComputingLayout");
            if (mVar.f477299y < 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarSectionCommonUsedWeAppView", "notifyItemRangeChangedDelay");
                mVar.postDelayed(new rh4.l(mVar, i17), 300L);
            }
            mVar.f477299y++;
            return;
        }
        mVar.f477299y = 0;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = mVar.m162446x4905e9fa().mo7946xf939df19();
        if (mo7946xf939df19 != null) {
            mo7946xf939df19.m8151xc67946d3(0, i17);
        }
    }
}

package bj5;

/* loaded from: classes.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bj5.n f102726d;

    public k(bj5.n nVar) {
        this.f102726d = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        bj5.n nVar = this.f102726d;
        nVar.T6(6);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = nVar.P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.B3(new wi5.b());
        }
        int e17 = com.p314xaae8f345.mm.ui.zk.e(nVar.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = nVar.P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.t(e17));
    }
}

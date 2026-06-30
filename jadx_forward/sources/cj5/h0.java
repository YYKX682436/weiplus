package cj5;

/* loaded from: classes.dex */
public final class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.j0 f123664d;

    public h0(cj5.j0 j0Var) {
        this.f123664d = j0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f m67437x4bd5310;
        j75.f m67437x4bd53102;
        cj5.j0 j0Var = this.f123664d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = j0Var.P6();
        if (P6 != null && (m67437x4bd53102 = P6.m67437x4bd5310()) != null) {
            m67437x4bd53102.B3(new wi5.b());
        }
        int e17 = com.p314xaae8f345.mm.ui.zk.e(j0Var.m158354x19263085(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = j0Var.P6();
        if (P62 == null || (m67437x4bd5310 = P62.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new wi5.t(e17));
    }
}

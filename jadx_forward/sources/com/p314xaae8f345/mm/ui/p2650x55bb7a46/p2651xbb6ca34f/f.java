package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes5.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wf0.r1 f279939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k f279940e;

    public f(wf0.r1 r1Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.k kVar) {
        this.f279939d = r1Var;
        this.f279940e = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        java.lang.String str = this.f279939d.f527062a;
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(str);
        if (h17 != null) {
            long j17 = h17.f496549n;
            if (j17 > 0) {
                pt0.e0 e0Var = pt0.f0.f439742b1;
                com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(h17.f496553r, j17);
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.z0()) || e0Var.i()) {
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(n17.mo78013xfb85f7b0());
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "updateStatus, check revoke status msg type " + valueOf + ", status: " + h17.f496544i + ", info svrId: " + h17.f496537c + ", msgSvrId: " + java.lang.Long.valueOf(n17.I0()));
                    if (valueOf != null && 43 == valueOf.intValue()) {
                        return;
                    }
                    if ((valueOf != null && 62 == valueOf.intValue()) || h17.f496544i != 199) {
                        return;
                    }
                    if ((n17.I0() == h17.f496537c) || !t21.d3.s()) {
                        return;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterV3", "had uploaded after msg revoke, do revoke again, svrId: " + h17.f496537c);
                    n17.o1(h17.f496537c);
                    n17.m124850x7650bebc(43);
                    ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.e(this.f279940e, n17));
                }
            }
        }
    }
}

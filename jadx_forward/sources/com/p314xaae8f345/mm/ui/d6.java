package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class d6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21357x5e7365bb f289862d;

    public d6(com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb) {
        this.f289862d = c21357x5e7365bb;
    }

    @Override // java.lang.Runnable
    public void run() {
        int p17 = c01.z1.p();
        com.p314xaae8f345.mm.ui.C21357x5e7365bb c21357x5e7365bb = this.f289862d;
        c21357x5e7365bb.N = p17;
        c21357x5e7365bb.Q = c01.z1.n();
        c21357x5e7365bb.P = c01.z1.j();
        c21357x5e7365bb.R = c01.z1.h();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c21357x5e7365bb.D1();
        if (!c21357x5e7365bb.P1 && !c21357x5e7365bb.Q1) {
            if (c21357x5e7365bb.T0()) {
                c21357x5e7365bb.m1(true, null, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().I0("FinderEntrance"));
                gz2.c.e("finder");
            }
            if (c21357x5e7365bb.U0()) {
                ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).cj(ra0.b0.f474996f, ra0.b0.f474997g, true, 109);
                int s17 = ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().s();
                if (s17 > 0) {
                    ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).hj(s17, ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).wi().r().f465646d, true);
                }
            }
            rg5.o oVar = c21357x5e7365bb.M1;
            boolean e17 = oVar != null ? oVar.e() : true;
            c21357x5e7365bb.o1("onTabSwitchIn", java.lang.Boolean.TRUE);
            if (e17) {
                gz2.c.e("live");
            }
            if ((c21357x5e7365bb.Q & 32768) == 0) {
                gz2.c.e("sns");
            }
            c21357x5e7365bb.P1 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendsUI", "[updateStatus] cost:%sms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }
}

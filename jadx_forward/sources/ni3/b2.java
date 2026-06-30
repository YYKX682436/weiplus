package ni3;

/* loaded from: classes12.dex */
public class b2 implements ni3.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ni3.d2 f419074a;

    public b2(ni3.d2 d2Var) {
        this.f419074a = d2Var;
    }

    public void a(int i17, ni3.c1 c1Var) {
        ni3.d2 d2Var = this.f419074a;
        d2Var.f419096a.f419129u = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv callback errType[%d] lastScanTime[%d], result[%s][%s]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(d2Var.f419096a.f419129u), d2Var.f419096a.f419131w, c1Var);
        d2Var.f419096a.f419131w = null;
        if (i17 != 0 || c1Var.f419086j) {
            return;
        }
        gm0.j1.i();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WECHAT_FILE_SCAN_LAST_TIME_LONG, java.lang.Long.valueOf(d2Var.f419096a.f419129u));
        gm0.j1.i();
        gm0.j1.u().c().i(false);
        try {
            ni3.g2.wi(d2Var.f419096a, c1Var);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SubCoreBaseMonitor", e17, "doReportSDInfo err!", new java.lang.Object[0]);
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(418L, 6L, 1L, true);
        }
    }
}

package oy1;

/* loaded from: classes13.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final oy1.n0 f431442d = new oy1.n0();

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var;
        try {
            if (gm0.j1.h()) {
                gm0.y n17 = gm0.j1.n();
                int n18 = (n17 == null || (r1Var = n17.f354821b) == null) ? -100 : r1Var.n();
                if (n18 != 4 && n18 != 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "checkNetWorkStatus cur network status lost");
                    qy1.g gVar = qy1.g.f449258a;
                    qy1.g.f449259b.set(false);
                } else {
                    ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.CgiReportService");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CgiReportService", "checkNetWorkStatus cur network status active");
                    qy1.g gVar2 = qy1.g.f449258a;
                    qy1.g.f449259b.set(true);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}

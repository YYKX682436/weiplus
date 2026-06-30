package oy1;

/* loaded from: classes13.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oy1.l f431415d;

    public k(oy1.l lVar) {
        this.f431415d = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p944x882e457a.r1 r1Var;
        try {
            if (gm0.j1.h()) {
                gm0.y n17 = gm0.j1.n();
                int n18 = (n17 == null || (r1Var = n17.f354821b) == null) ? -100 : r1Var.n();
                if (n18 != 4 && n18 != 6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCgiReport", "checkNetWorkStatus cur network status lost");
                    this.f431415d.e(false);
                } else {
                    ((ku5.t0) ku5.t0.f394148d).A("MicroMsg.CgiReportService");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCgiReport", "checkNetWorkStatus cur network status active");
                    this.f431415d.e(true);
                }
            }
        } catch (java.lang.Exception unused) {
        }
    }
}

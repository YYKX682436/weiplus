package uj0;

/* loaded from: classes13.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e f509716d;

    public b(com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e) {
        this.f509716d = c10726x5870354e;
    }

    @Override // java.lang.Runnable
    public void run() {
        sj0.c cVar;
        sj0.b bVar;
        synchronized (this) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxBaseImageView", "reportPerformanceInfo threadId: %d", java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            sj0.g gVar = sj0.g.INSTANCE;
            synchronized (gVar.f489894h) {
                java.util.HashMap hashMap = gVar.f489891e;
                if (hashMap == null || (bVar = (sj0.b) hashMap.get(2)) == null || !(bVar instanceof sj0.c)) {
                    cVar = null;
                } else {
                    ((sj0.c) bVar).a();
                    cVar = (sj0.c) bVar;
                }
            }
            tj0.b.INSTANCE.b(null, cVar);
            com.p314xaae8f345.mm.p786x600aa8b.ui.C10726x5870354e c10726x5870354e = this.f509716d;
            c10726x5870354e.f149764w = true;
            c10726x5870354e.getClass();
            try {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = c10726x5870354e.f149766y;
                if (n3Var != null) {
                    n3Var.mo50299x35224f();
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxBaseImageView", e17, "quitReportThread exception", new java.lang.Object[0]);
            }
        }
    }
}

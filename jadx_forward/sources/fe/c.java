package fe;

/* loaded from: classes7.dex */
public class c extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe.g f342881d;

    public c(fe.g gVar) {
        this.f342881d = gVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: onCreate");
        fe.g gVar = this.f342881d;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: initStatis!");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = gVar.f342894i;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.size() > 0) {
            gVar.f342894i.clear();
        }
        synchronized (gVar.f342895j) {
            if (gVar.f342895j.size() > 0) {
                gVar.f342895j.clear();
            }
        }
        gVar.f342890e = false;
        gVar.f342886a = 0;
        gVar.f342887b = 0L;
        gVar.f342888c = 0L;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void c() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: onDestroy");
        fe.g gVar = this.f342881d;
        gVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: release!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(gVar.f342889d, gVar.f342896k);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.w0 w0Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: onPause");
        fe.g gVar = this.f342881d;
        if (gVar.f342890e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: hasReported!");
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new fe.e(gVar));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0
    public void g() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBNiReporter", "hy: onResume");
    }
}

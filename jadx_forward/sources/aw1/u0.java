package aw1;

/* loaded from: classes12.dex */
public final class u0 implements aw1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw1.f f96227a;

    public u0(bw1.f fVar) {
        this.f96227a = fVar;
    }

    @Override // aw1.o
    public void a(int i17, long j17) {
        if (i17 == 6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ReportCleanStatus", "Scan done");
            this.f96227a.a(java.lang.Boolean.TRUE);
        }
    }

    @Override // aw1.o
    public void b(int i17, int i18, int i19) {
    }

    @Override // aw1.o
    /* renamed from: onCancelled */
    public void mo9143x1a926632() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ReportCleanStatus", "Scan cancelled");
        this.f96227a.a(java.lang.Boolean.FALSE);
    }
}

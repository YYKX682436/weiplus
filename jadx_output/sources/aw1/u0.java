package aw1;

/* loaded from: classes12.dex */
public final class u0 implements aw1.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw1.f f14694a;

    public u0(bw1.f fVar) {
        this.f14694a = fVar;
    }

    @Override // aw1.o
    public void a(int i17, long j17) {
        if (i17 == 6) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportCleanStatus", "Scan done");
            this.f14694a.a(java.lang.Boolean.TRUE);
        }
    }

    @Override // aw1.o
    public void b(int i17, int i18, int i19) {
    }

    @Override // aw1.o
    public void onCancelled() {
        com.tencent.mars.xlog.Log.w("MicroMsg.ReportCleanStatus", "Scan cancelled");
        this.f14694a.a(java.lang.Boolean.FALSE);
    }
}

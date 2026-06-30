package bw1;

/* loaded from: classes12.dex */
public class q extends bw1.n {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw1.u f24838f;

    public q(bw1.u uVar) {
        this.f24838f = uVar;
    }

    @Override // bw1.n
    public java.lang.Object b(com.tencent.wcdb.support.CancellationSignal cancellationSignal, boolean z17) {
        java.lang.System.currentTimeMillis();
        this.f24838f.getClass();
        bw1.s sVar = new bw1.s();
        d95.f.q();
        try {
            try {
                mt1.b0 b0Var = mt1.b0.f331191a;
                b0Var.B(true, cancellationSignal);
                b0Var.t(new bw1.p(this, sVar), cancellationSignal);
            } catch (com.tencent.wcdb.database.SQLiteDatabaseCorruptException e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SubCoreClean", "doCalcResult, DB CorruptException: " + e17.getMessage());
            }
            return sVar;
        } finally {
            d95.f.w();
        }
    }
}

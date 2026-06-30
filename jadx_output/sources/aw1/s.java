package aw1;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f14669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long[] f14670e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14671f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aw1.o f14672g;

    public s(yv1.g1 g1Var, long[] jArr, com.tencent.wcdb.support.CancellationSignal cancellationSignal, aw1.o oVar) {
        this.f14669d = g1Var;
        this.f14670e = jArr;
        this.f14671f = cancellationSignal;
        this.f14672g = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j17;
        long j18;
        boolean z17;
        boolean z18;
        long j19;
        long j27;
        long j28;
        long j29;
        long j37;
        yv1.g1 g1Var = this.f14669d;
        if (g1Var.f466056o != null) {
            synchronized (g1Var) {
                if (g1Var.f466051j < 0) {
                    g1Var.f466051j = 0L;
                }
                if (g1Var.f466052k < 0) {
                    g1Var.f466052k = 0L;
                }
                j28 = g1Var.f466051j;
                j29 = g1Var.f466052k;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", "OriginalMedia phase cached, sent: " + j28 + ", received: " + j29);
            long[] jArr = this.f14670e;
            synchronized (jArr) {
                long j38 = 4 | jArr[0];
                jArr[0] = j38;
                j27 = j28 + j29;
                jArr[3] = j27;
                if ((j38 & 5) == 5) {
                    j37 = jArr[2];
                } else {
                    j27 = -1;
                    j37 = -1;
                }
                z18 = j38 == 7;
            }
            j19 = j37;
        } else {
            aw1.n b17 = aw1.v.b(this.f14671f);
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", "OriginalMedia phase loaded, sent: " + b17.f14610a + ", received: " + b17.f14611b);
            long[] jArr2 = this.f14670e;
            synchronized (jArr2) {
                long j39 = jArr2[0] | 4;
                jArr2[0] = j39;
                long j47 = b17.f14610a + b17.f14611b;
                jArr2[3] = j47;
                if ((j39 & 5) == 5) {
                    j17 = jArr2[2];
                    j18 = j47;
                } else {
                    j17 = -1;
                    j18 = -1;
                }
                z17 = j39 == 7;
            }
            yv1.g1 g1Var2 = this.f14669d;
            synchronized (g1Var2) {
                g1Var2.f466051j = b17.f14610a;
                g1Var2.f466052k = b17.f14611b;
                g1Var2.f466056o = b17.f14612c;
            }
            z18 = z17;
            j19 = j17;
            j27 = j18;
        }
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f14671f;
        if ((cancellationSignal != null && cancellationSignal.isCanceled()) || j19 < 0) {
            return;
        }
        this.f14672g.a(3, j27);
        this.f14672g.a(2, j19);
        if (z18) {
            this.f14672g.a(6, 0L);
        }
    }
}

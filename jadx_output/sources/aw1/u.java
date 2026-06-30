package aw1;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14690d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f14691e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long[] f14692f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aw1.o f14693g;

    public u(com.tencent.wcdb.support.CancellationSignal cancellationSignal, yv1.g1 g1Var, long[] jArr, aw1.o oVar) {
        this.f14690d = cancellationSignal;
        this.f14691e = g1Var;
        this.f14692f = jArr;
        this.f14693g = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        mt1.b0 b0Var = mt1.b0.f331191a;
        b0Var.B(true, this.f14690d);
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f14690d;
        aw1.t tVar = new aw1.t(cancellationSignal, this.f14693g);
        b0Var.t(tVar, cancellationSignal);
        if (tVar.f14679a) {
            return;
        }
        yv1.h1.f(0, this.f14690d);
        com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", "Done index upgrade and scan.");
        ((ku5.t0) ku5.t0.f312615d).a(new aw1.s(this.f14691e, this.f14692f, this.f14690d, this.f14693g));
        long j17 = this.f14691e.f466046e;
        if (j17 > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", "IndexDB phase cached, account: " + j17);
            long[] jArr = this.f14692f;
            synchronized (jArr) {
                long j18 = 2 | jArr[0];
                jArr[0] = j18;
                jArr[1] = j17;
                z17 = j18 == 7;
            }
        } else {
            long P1 = b0Var.n().P1() + aw1.v.a(this.f14690d)[1];
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", "IndexDB phase loaded, account: " + P1);
            long[] jArr2 = this.f14692f;
            synchronized (jArr2) {
                long j19 = 2 | jArr2[0];
                jArr2[0] = j19;
                long j27 = jArr2[1] + P1;
                jArr2[1] = j27;
                j17 = (j19 & 3) == 3 ? j27 : -1L;
                z17 = j19 == 7;
            }
            if (j17 >= 0) {
                yv1.g1 g1Var = this.f14691e;
                synchronized (g1Var) {
                    g1Var.f466046e = j17;
                }
            }
        }
        if (j17 >= 0) {
            com.tencent.wcdb.support.CancellationSignal cancellationSignal2 = this.f14690d;
            if (cancellationSignal2 != null && cancellationSignal2.isCanceled()) {
                this.f14693g.onCancelled();
                return;
            }
            this.f14693g.a(4, j17);
            if (z17) {
                this.f14693g.a(6, 0L);
            }
        }
    }
}

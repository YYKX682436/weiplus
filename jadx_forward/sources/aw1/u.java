package aw1;

/* loaded from: classes12.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f96224e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long[] f96225f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aw1.o f96226g;

    public u(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, yv1.g1 g1Var, long[] jArr, aw1.o oVar) {
        this.f96223d = c26987xeef691ab;
        this.f96224e = g1Var;
        this.f96225f = jArr;
        this.f96226g = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        mt1.b0 b0Var = mt1.b0.f412724a;
        b0Var.B(true, this.f96223d);
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f96223d;
        aw1.t tVar = new aw1.t(c26987xeef691ab, this.f96226g);
        b0Var.t(tVar, c26987xeef691ab);
        if (tVar.f96212a) {
            return;
        }
        yv1.h1.f(0, this.f96223d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", "Done index upgrade and scan.");
        ((ku5.t0) ku5.t0.f394148d).a(new aw1.s(this.f96224e, this.f96225f, this.f96223d, this.f96226g));
        long j17 = this.f96224e.f547579e;
        if (j17 > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", "IndexDB phase cached, account: " + j17);
            long[] jArr = this.f96225f;
            synchronized (jArr) {
                long j18 = 2 | jArr[0];
                jArr[0] = j18;
                jArr[1] = j17;
                z17 = j18 == 7;
            }
        } else {
            long P1 = b0Var.n().P1() + aw1.v.a(this.f96223d)[1];
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", "IndexDB phase loaded, account: " + P1);
            long[] jArr2 = this.f96225f;
            synchronized (jArr2) {
                long j19 = 2 | jArr2[0];
                jArr2[0] = j19;
                long j27 = jArr2[1] + P1;
                jArr2[1] = j27;
                j17 = (j19 & 3) == 3 ? j27 : -1L;
                z17 = j19 == 7;
            }
            if (j17 >= 0) {
                yv1.g1 g1Var = this.f96224e;
                synchronized (g1Var) {
                    g1Var.f547579e = j17;
                }
            }
        }
        if (j17 >= 0) {
            com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab2 = this.f96223d;
            if (c26987xeef691ab2 != null && c26987xeef691ab2.m108008xc9602be3()) {
                this.f96226g.mo9143x1a926632();
                return;
            }
            this.f96226g.a(4, j17);
            if (z17) {
                this.f96226g.a(6, 0L);
            }
        }
    }
}

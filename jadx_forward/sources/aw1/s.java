package aw1;

/* loaded from: classes12.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f96202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long[] f96203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96204f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ aw1.o f96205g;

    public s(yv1.g1 g1Var, long[] jArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, aw1.o oVar) {
        this.f96202d = g1Var;
        this.f96203e = jArr;
        this.f96204f = c26987xeef691ab;
        this.f96205g = oVar;
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
        yv1.g1 g1Var = this.f96202d;
        if (g1Var.f547589o != null) {
            synchronized (g1Var) {
                if (g1Var.f547584j < 0) {
                    g1Var.f547584j = 0L;
                }
                if (g1Var.f547585k < 0) {
                    g1Var.f547585k = 0L;
                }
                j28 = g1Var.f547584j;
                j29 = g1Var.f547585k;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", "OriginalMedia phase cached, sent: " + j28 + ", received: " + j29);
            long[] jArr = this.f96203e;
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
            aw1.n b17 = aw1.v.b(this.f96204f);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", "OriginalMedia phase loaded, sent: " + b17.f96143a + ", received: " + b17.f96144b);
            long[] jArr2 = this.f96203e;
            synchronized (jArr2) {
                long j39 = jArr2[0] | 4;
                jArr2[0] = j39;
                long j47 = b17.f96143a + b17.f96144b;
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
            yv1.g1 g1Var2 = this.f96202d;
            synchronized (g1Var2) {
                g1Var2.f547584j = b17.f96143a;
                g1Var2.f547585k = b17.f96144b;
                g1Var2.f547589o = b17.f96145c;
            }
            z18 = z17;
            j19 = j17;
            j27 = j18;
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f96204f;
        if ((c26987xeef691ab != null && c26987xeef691ab.m108008xc9602be3()) || j19 < 0) {
            return;
        }
        this.f96205g.a(3, j27);
        this.f96205g.a(2, j19);
        if (z18) {
            this.f96205g.a(6, 0L);
        }
    }
}

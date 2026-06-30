package aw1;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wcdb.support.CancellationSignal f14661d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f14662e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long[] f14663f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f14664g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aw1.o f14665h;

    public r(com.tencent.wcdb.support.CancellationSignal cancellationSignal, yv1.g1 g1Var, long[] jArr, boolean z17, aw1.o oVar) {
        this.f14661d = cancellationSignal;
        this.f14662e = g1Var;
        this.f14663f = jArr;
        this.f14664g = z17;
        this.f14665h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.vfs.y1 c17;
        long j17;
        long j18;
        long j19;
        boolean z17;
        long j27;
        long j28;
        long j29;
        long j37;
        long j38;
        long j39;
        boolean z18;
        boolean z19 = false;
        yv1.h1.f(0, this.f14661d);
        yv1.g1 g1Var = this.f14662e;
        if (g1Var.f466044c > 0) {
            c17 = new com.tencent.mm.vfs.y1();
            synchronized (g1Var) {
                if (g1Var.f466045d < 0) {
                    g1Var.f466045d = 0L;
                }
                if (g1Var.f466047f < 0) {
                    g1Var.f466047f = 0L;
                }
                if (g1Var.f466049h < 0) {
                    g1Var.f466049h = 0L;
                }
                c17.f213246a = g1Var.f466044c;
                c17.f213247b = g1Var.f466045d;
                c17.f213248c = g1Var.f466047f;
                c17.f213251f = g1Var.f466049h;
                kz5.v.o(g1Var.f466054m, c17.f213253h, 0, 0, 0, 14, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FastList phase cached, total: ");
            sb6.append(c17.f213246a);
            sb6.append(", cache: ");
            sb6.append(c17.f213247b);
            sb6.append(", otherAcc: ");
            sb6.append(c17.f213248c);
            sb6.append(", module: ");
            sb6.append(c17.f213251f);
            sb6.append(", spSize: ");
            java.lang.String arrays = java.util.Arrays.toString(c17.f213253h);
            kotlin.jvm.internal.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", sb6.toString());
            long[] jArr = this.f14663f;
            yv1.g1 g1Var2 = this.f14662e;
            synchronized (jArr) {
                long j47 = 1 | jArr[0];
                jArr[0] = j47;
                long j48 = jArr[1];
                long[] jArr2 = c17.f213253h;
                long j49 = j48 + jArr2[1];
                jArr[1] = j49;
                long j57 = j49 + jArr2[2];
                jArr[1] = j57;
                j38 = g1Var2.f466045d;
                jArr[2] = j38;
                if ((j47 & 5) == 5) {
                    j19 = jArr[3];
                } else {
                    j38 = -1;
                    j19 = -1;
                }
                j39 = (j47 & 3) == 3 ? j57 : -1L;
                z18 = j47 == 7;
            }
            j28 = j39;
            long j58 = j38;
            z17 = z18;
            j29 = j58;
        } else {
            if3.f0.c(true);
            aw1.b0.f14494i.b();
            com.tencent.mm.vfs.b2.i(java.lang.System.currentTimeMillis());
            c17 = com.tencent.mm.vfs.b2.c(kz5.p0.f313996d, this.f14661d, this.f14664g);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FastList phase loaded, total: ");
            sb7.append(c17.f213246a);
            sb7.append(", cache: ");
            sb7.append(c17.f213247b);
            sb7.append(", otherAcc: ");
            sb7.append(c17.f213248c);
            sb7.append(", module: ");
            sb7.append(c17.f213251f);
            sb7.append(", spSize: ");
            java.lang.String arrays2 = java.util.Arrays.toString(c17.f213253h);
            kotlin.jvm.internal.o.f(arrays2, "toString(...)");
            sb7.append(arrays2);
            com.tencent.mars.xlog.Log.i("MicroMsg.CleanCalcLogic", sb7.toString());
            long[] jArr3 = this.f14663f;
            synchronized (jArr3) {
                long j59 = jArr3[0] | 1;
                jArr3[0] = j59;
                long j66 = jArr3[1];
                long[] jArr4 = c17.f213253h;
                long j67 = j66 + jArr4[1];
                jArr3[1] = j67;
                j17 = j67 + jArr4[2];
                jArr3[1] = j17;
                j18 = c17.f213247b;
                jArr3[2] = j18;
                if ((j59 & 5) == 5) {
                    j19 = jArr3[3];
                } else {
                    j18 = -1;
                    j19 = -1;
                }
                if ((j59 & 3) != 3) {
                    j17 = -1;
                }
                z17 = j59 == 7;
            }
            yv1.g1 g1Var3 = this.f14662e;
            synchronized (g1Var3) {
                j27 = j18;
                g1Var3.f466044c = c17.f213246a;
                g1Var3.f466045d = c17.f213247b;
                if (j17 >= 0) {
                    g1Var3.f466046e = j17;
                }
                g1Var3.f466047f = c17.f213248c;
                g1Var3.f466048g = c17.f213249d;
                g1Var3.f466049h = c17.f213251f;
                g1Var3.f466050i = c17.f213252g;
                kz5.v.o(c17.f213250e, g1Var3.f466053l, 0, 0, 0, 14, null);
                kz5.v.o(c17.f213253h, g1Var3.f466054m, 0, 0, 0, 14, null);
                kz5.v.n(c17.f213254i, g1Var3.f466055n, 0, 0, 0, 14, null);
            }
            j28 = j17;
            j29 = j27;
        }
        com.tencent.wcdb.support.CancellationSignal cancellationSignal = this.f14661d;
        if (cancellationSignal != null && cancellationSignal.isCanceled()) {
            z19 = true;
        }
        if (z19) {
            this.f14665h.onCancelled();
            return;
        }
        this.f14665h.a(1, c17.f213246a);
        if (j29 >= 0) {
            this.f14665h.a(3, j19);
            this.f14665h.a(2, j29);
        }
        if (j28 >= 0) {
            this.f14665h.a(4, j28);
        }
        long j68 = c17.f213248c;
        long j69 = yv1.h1.e(c17.f213251f, this.f14662e.f466042a) ? c17.f213251f : 0L;
        if (aw1.v.e()) {
            j37 = 0;
            if (j69 >= 0) {
                this.f14665h.a(5, j69);
            }
            if (j68 >= 0) {
                this.f14665h.a(7, j68);
            }
        } else {
            j37 = 0;
            long j76 = j68 + j69;
            if (j76 >= 0) {
                this.f14665h.a(5, j76);
            }
        }
        if (z17) {
            this.f14665h.a(6, j37);
        }
    }
}

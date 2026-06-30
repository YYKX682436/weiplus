package aw1;

/* loaded from: classes12.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f96194d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yv1.g1 f96195e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long[] f96196f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f96197g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ aw1.o f96198h;

    public r(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab, yv1.g1 g1Var, long[] jArr, boolean z17, aw1.o oVar) {
        this.f96194d = c26987xeef691ab;
        this.f96195e = g1Var;
        this.f96196f = jArr;
        this.f96197g = z17;
        this.f96198h = oVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.vfs.y1 c17;
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
        yv1.h1.f(0, this.f96194d);
        yv1.g1 g1Var = this.f96195e;
        if (g1Var.f547577c > 0) {
            c17 = new com.p314xaae8f345.mm.vfs.y1();
            synchronized (g1Var) {
                if (g1Var.f547578d < 0) {
                    g1Var.f547578d = 0L;
                }
                if (g1Var.f547580f < 0) {
                    g1Var.f547580f = 0L;
                }
                if (g1Var.f547582h < 0) {
                    g1Var.f547582h = 0L;
                }
                c17.f294779a = g1Var.f547577c;
                c17.f294780b = g1Var.f547578d;
                c17.f294781c = g1Var.f547580f;
                c17.f294784f = g1Var.f547582h;
                kz5.v.o(g1Var.f547587m, c17.f294786h, 0, 0, 0, 14, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("FastList phase cached, total: ");
            sb6.append(c17.f294779a);
            sb6.append(", cache: ");
            sb6.append(c17.f294780b);
            sb6.append(", otherAcc: ");
            sb6.append(c17.f294781c);
            sb6.append(", module: ");
            sb6.append(c17.f294784f);
            sb6.append(", spSize: ");
            java.lang.String arrays = java.util.Arrays.toString(c17.f294786h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
            sb6.append(arrays);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", sb6.toString());
            long[] jArr = this.f96196f;
            yv1.g1 g1Var2 = this.f96195e;
            synchronized (jArr) {
                long j47 = 1 | jArr[0];
                jArr[0] = j47;
                long j48 = jArr[1];
                long[] jArr2 = c17.f294786h;
                long j49 = j48 + jArr2[1];
                jArr[1] = j49;
                long j57 = j49 + jArr2[2];
                jArr[1] = j57;
                j38 = g1Var2.f547578d;
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
            aw1.b0.f96027i.b();
            com.p314xaae8f345.mm.vfs.b2.i(java.lang.System.currentTimeMillis());
            c17 = com.p314xaae8f345.mm.vfs.b2.c(kz5.p0.f395529d, this.f96194d, this.f96197g);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("FastList phase loaded, total: ");
            sb7.append(c17.f294779a);
            sb7.append(", cache: ");
            sb7.append(c17.f294780b);
            sb7.append(", otherAcc: ");
            sb7.append(c17.f294781c);
            sb7.append(", module: ");
            sb7.append(c17.f294784f);
            sb7.append(", spSize: ");
            java.lang.String arrays2 = java.util.Arrays.toString(c17.f294786h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays2, "toString(...)");
            sb7.append(arrays2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CleanCalcLogic", sb7.toString());
            long[] jArr3 = this.f96196f;
            synchronized (jArr3) {
                long j59 = jArr3[0] | 1;
                jArr3[0] = j59;
                long j66 = jArr3[1];
                long[] jArr4 = c17.f294786h;
                long j67 = j66 + jArr4[1];
                jArr3[1] = j67;
                j17 = j67 + jArr4[2];
                jArr3[1] = j17;
                j18 = c17.f294780b;
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
            yv1.g1 g1Var3 = this.f96195e;
            synchronized (g1Var3) {
                j27 = j18;
                g1Var3.f547577c = c17.f294779a;
                g1Var3.f547578d = c17.f294780b;
                if (j17 >= 0) {
                    g1Var3.f547579e = j17;
                }
                g1Var3.f547580f = c17.f294781c;
                g1Var3.f547581g = c17.f294782d;
                g1Var3.f547582h = c17.f294784f;
                g1Var3.f547583i = c17.f294785g;
                kz5.v.o(c17.f294783e, g1Var3.f547586l, 0, 0, 0, 14, null);
                kz5.v.o(c17.f294786h, g1Var3.f547587m, 0, 0, 0, 14, null);
                kz5.v.n(c17.f294787i, g1Var3.f547588n, 0, 0, 0, 14, null);
            }
            j28 = j17;
            j29 = j27;
        }
        com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab = this.f96194d;
        if (c26987xeef691ab != null && c26987xeef691ab.m108008xc9602be3()) {
            z19 = true;
        }
        if (z19) {
            this.f96198h.mo9143x1a926632();
            return;
        }
        this.f96198h.a(1, c17.f294779a);
        if (j29 >= 0) {
            this.f96198h.a(3, j19);
            this.f96198h.a(2, j29);
        }
        if (j28 >= 0) {
            this.f96198h.a(4, j28);
        }
        long j68 = c17.f294781c;
        long j69 = yv1.h1.e(c17.f294784f, this.f96195e.f547575a) ? c17.f294784f : 0L;
        if (aw1.v.e()) {
            j37 = 0;
            if (j69 >= 0) {
                this.f96198h.a(5, j69);
            }
            if (j68 >= 0) {
                this.f96198h.a(7, j68);
            }
        } else {
            j37 = 0;
            long j76 = j68 + j69;
            if (j76 >= 0) {
                this.f96198h.a(5, j76);
            }
        }
        if (z17) {
            this.f96198h.a(6, j37);
        }
    }
}

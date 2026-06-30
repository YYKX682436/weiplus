package gr3;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a */
    public static final gr3.b f356380a = new gr3.b();

    public static /* synthetic */ void c(gr3.b bVar, java.lang.Long l17, java.lang.Long l18, long j17, long j18, long j19, java.lang.String str, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        bVar.b(l17, l18, j17, j18, (i27 & 16) != 0 ? 0L : j19, (i27 & 32) != 0 ? "" : str, i17, (i27 & 128) != 0 ? 0 : i18, (i27 & 256) != 0 ? 0 : i19);
    }

    public static void d(gr3.b bVar, yr3.f fVar, long j17, int i17, int i18, int i19, int i27, java.lang.Object obj) {
        gr3.b bVar2;
        wr3.n0 n0Var;
        r45.o5 o5Var;
        r45.o5 o5Var2;
        r45.s5 s5Var;
        r45.y5 y5Var;
        int i28 = (i27 & 8) != 0 ? 0 : i18;
        int i29 = (i27 & 16) != 0 ? 0 : i19;
        bVar.getClass();
        java.lang.Long valueOf = (fVar == null || (s5Var = fVar.f546335a) == null || (y5Var = s5Var.f467042d) == null) ? null : java.lang.Long.valueOf(y5Var.f472323d);
        java.lang.Long valueOf2 = (fVar == null || (o5Var2 = fVar.f546336b) == null) ? null : java.lang.Long.valueOf(o5Var2.f463449g);
        if (fVar != null) {
            n0Var = fVar.f546337c;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            n0Var = null;
        }
        bVar.b(valueOf, valueOf2, j17, bVar2.a(n0Var), 0L, (fVar == null || (o5Var = fVar.f546336b) == null) ? null : o5Var.f463450h, i17, i28, i29);
    }

    public final long a(wr3.n0 n0Var) {
        if (n0Var == wr3.n0.f530377h) {
            return 2L;
        }
        if (n0Var == wr3.n0.f530376g) {
            return 3L;
        }
        return (n0Var == wr3.n0.f530375f || n0Var == wr3.n0.f530378i || n0Var == wr3.n0.f530379m) ? 1L : 0L;
    }

    public final void b(java.lang.Long l17, java.lang.Long l18, long j17, long j18, long j19, java.lang.String str, int i17, int i18, int i19) {
        ((ku5.t0) ku5.t0.f394148d).k(new gr3.a(j19, str, j18, l17, l18, j17, i17, i18, i19), 100L);
    }
}

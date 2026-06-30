package g1;

/* loaded from: classes14.dex */
public abstract class h {
    public static void a(g1.i iVar, long j17, float f17, float f18, boolean z17, long j18, long j19, float f19, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        long j27;
        int i19;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        if ((i18 & 16) != 0) {
            int i27 = d1.e.f307159e;
            j27 = d1.e.f307156b;
        } else {
            j27 = j18;
        }
        long j28 = (i18 & 32) != 0 ? j(iVar, iVar.a(), j27) : j19;
        float f27 = (i18 & 64) != 0 ? 1.0f : f19;
        g1.j jVar2 = (i18 & 128) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i18 & 256) != 0 ? null : zVar;
        if ((i18 & 512) != 0) {
            int i28 = g1.i.J0;
            i19 = 3;
        } else {
            i19 = i17;
        }
        iVar.h(j17, f17, f18, z17, j27, j28, f27, jVar2, zVar2, i19);
    }

    public static /* synthetic */ void b(g1.i iVar, long j17, float f17, long j18, float f18, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        int i19;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        float c17 = (i18 & 2) != 0 ? d1.k.c(iVar.a()) / 2.0f : f17;
        long r17 = (i18 & 4) != 0 ? iVar.r() : j18;
        float f19 = (i18 & 8) != 0 ? 1.0f : f18;
        g1.j jVar2 = (i18 & 16) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i18 & 32) != 0 ? null : zVar;
        if ((i18 & 64) != 0) {
            int i27 = g1.i.J0;
            i19 = 3;
        } else {
            i19 = i17;
        }
        iVar.U(j17, c17, r17, f19, jVar2, zVar2, i19);
    }

    public static void c(g1.i iVar, e1.g0 g0Var, long j17, long j18, long j19, long j27, float f17, g1.j jVar, e1.z zVar, int i17, int i18, int i19, java.lang.Object obj) {
        long j28;
        long j29;
        long j37;
        int i27;
        int i28;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        if ((i19 & 2) != 0) {
            int i29 = p2.m.f432922c;
            j28 = p2.m.f432921b;
        } else {
            j28 = j17;
        }
        if ((i19 & 4) != 0) {
            e1.d dVar = (e1.d) g0Var;
            j29 = p2.r.a(dVar.b(), dVar.a());
        } else {
            j29 = j18;
        }
        if ((i19 & 8) != 0) {
            int i37 = p2.m.f432922c;
            j37 = p2.m.f432921b;
        } else {
            j37 = j19;
        }
        long j38 = (i19 & 16) != 0 ? j29 : j27;
        float f18 = (i19 & 32) != 0 ? 1.0f : f17;
        g1.j jVar2 = (i19 & 64) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i19 & 128) != 0 ? null : zVar;
        if ((i19 & 256) != 0) {
            int i38 = g1.i.J0;
            i27 = 3;
        } else {
            i27 = i17;
        }
        if ((i19 & 512) != 0) {
            int i39 = g1.i.J0;
            i28 = 1;
        } else {
            i28 = i18;
        }
        iVar.w(g0Var, j28, j29, j37, j38, f18, jVar2, zVar2, i27, i28);
    }

    public static void d(g1.i iVar, e1.g0 g0Var, long j17, float f17, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        long j18;
        int i19;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        if ((i18 & 2) != 0) {
            int i27 = d1.e.f307159e;
            j18 = d1.e.f307156b;
        } else {
            j18 = j17;
        }
        float f18 = (i18 & 4) != 0 ? 1.0f : f17;
        g1.j jVar2 = (i18 & 8) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i18 & 16) != 0 ? null : zVar;
        if ((i18 & 32) != 0) {
            int i28 = g1.i.J0;
            i19 = 3;
        } else {
            i19 = i17;
        }
        iVar.f(g0Var, j18, f18, jVar2, zVar2, i19);
    }

    public static /* synthetic */ void e(g1.i iVar, e1.r rVar, long j17, long j18, float f17, int i17, e1.q0 q0Var, float f18, e1.z zVar, int i18, int i19, java.lang.Object obj) {
        int i27;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        float f19 = (i19 & 8) != 0 ? 0.0f : f17;
        int i28 = (i19 & 16) != 0 ? 0 : i17;
        e1.q0 q0Var2 = (i19 & 32) != 0 ? null : q0Var;
        float f27 = (i19 & 64) != 0 ? 1.0f : f18;
        e1.z zVar2 = (i19 & 128) != 0 ? null : zVar;
        if ((i19 & 256) != 0) {
            int i29 = g1.i.J0;
            i27 = 3;
        } else {
            i27 = i18;
        }
        iVar.d(rVar, j17, j18, f19, i28, q0Var2, f27, zVar2, i27);
    }

    public static /* synthetic */ void f(g1.i iVar, e1.p0 p0Var, e1.r rVar, float f17, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i18 & 4) != 0) {
            f17 = 1.0f;
        }
        float f18 = f17;
        if ((i18 & 8) != 0) {
            jVar = g1.m.f349045a;
        }
        g1.j jVar2 = jVar;
        if ((i18 & 16) != 0) {
            zVar = null;
        }
        e1.z zVar2 = zVar;
        if ((i18 & 32) != 0) {
            int i19 = g1.i.J0;
            i17 = 3;
        }
        iVar.T(p0Var, rVar, f18, jVar2, zVar2, i17);
    }

    public static void g(g1.i iVar, e1.r rVar, long j17, long j18, float f17, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        long j19;
        int i19;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        if ((i18 & 2) != 0) {
            int i27 = d1.e.f307159e;
            j19 = d1.e.f307156b;
        } else {
            j19 = j17;
        }
        long j27 = (i18 & 4) != 0 ? j(iVar, iVar.a(), j19) : j18;
        float f18 = (i18 & 8) != 0 ? 1.0f : f17;
        g1.j jVar2 = (i18 & 16) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i18 & 32) != 0 ? null : zVar;
        if ((i18 & 64) != 0) {
            int i28 = g1.i.J0;
            i19 = 3;
        } else {
            i19 = i17;
        }
        iVar.q(rVar, j19, j27, f18, jVar2, zVar2, i19);
    }

    public static void h(g1.i iVar, long j17, long j18, long j19, float f17, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        long j27;
        int i19;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        if ((i18 & 2) != 0) {
            int i27 = d1.e.f307159e;
            j27 = d1.e.f307156b;
        } else {
            j27 = j18;
        }
        long j28 = (i18 & 4) != 0 ? j(iVar, iVar.a(), j27) : j19;
        float f18 = (i18 & 8) != 0 ? 1.0f : f17;
        g1.j jVar2 = (i18 & 16) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i18 & 32) != 0 ? null : zVar;
        if ((i18 & 64) != 0) {
            int i28 = g1.i.J0;
            i19 = 3;
        } else {
            i19 = i17;
        }
        iVar.A(j17, j27, j28, f18, jVar2, zVar2, i19);
    }

    public static void i(g1.i iVar, e1.r rVar, long j17, long j18, long j19, float f17, g1.j jVar, e1.z zVar, int i17, int i18, java.lang.Object obj) {
        long j27;
        long j28;
        int i19;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        if ((i18 & 2) != 0) {
            int i27 = d1.e.f307159e;
            j27 = d1.e.f307156b;
        } else {
            j27 = j17;
        }
        long j29 = (i18 & 4) != 0 ? j(iVar, iVar.a(), j27) : j18;
        if ((i18 & 8) != 0) {
            int i28 = d1.a.f307151b;
            j28 = d1.a.f307150a;
        } else {
            j28 = j19;
        }
        float f18 = (i18 & 16) != 0 ? 1.0f : f17;
        g1.j jVar2 = (i18 & 32) != 0 ? g1.m.f349045a : jVar;
        e1.z zVar2 = (i18 & 64) != 0 ? null : zVar;
        if ((i18 & 128) != 0) {
            int i29 = g1.i.J0;
            i19 = 3;
        } else {
            i19 = i17;
        }
        iVar.L(rVar, j27, j29, j28, f18, jVar2, zVar2, i19);
    }

    public static long j(g1.i iVar, long j17, long j18) {
        return d1.l.a(d1.k.d(j17) - d1.e.c(j18), d1.k.b(j17) - d1.e.d(j18));
    }
}

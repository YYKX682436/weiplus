package l0;

/* loaded from: classes14.dex */
public final class c3 {

    /* renamed from: a, reason: collision with root package name */
    public static final l0.c3 f395631a = new l0.c3();

    public final l0.b3 a(long j17, long j18, float f17, long j19, long j27, float f18, long j28, long j29, long j37, long j38, n0.o oVar, int i17, int i18, int i19) {
        long j39;
        long j47;
        long j48;
        long j49;
        long j57;
        long j58;
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(-1032127534);
        long j59 = (i19 & 1) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).j() : j17;
        long j66 = (i19 & 2) != 0 ? j59 : j18;
        float f19 = (i19 & 4) != 0 ? 0.54f : f17;
        long k17 = (i19 & 8) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).k() : j19;
        long f27 = (i19 & 16) != 0 ? ((l0.i) y0Var.i(l0.k.f395847a)).f() : j27;
        float f28 = (i19 & 32) != 0 ? 0.38f : f18;
        int i27 = i19 & 64;
        l0.l lVar = l0.l.f395877a;
        if (i27 != 0) {
            j39 = j59;
            j47 = e1.a0.d(e1.y.b(j59, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), ((l0.i) y0Var.i(l0.k.f395847a)).k());
        } else {
            j39 = j59;
            j47 = j28;
        }
        if ((i19 & 128) != 0) {
            j48 = j47;
            j49 = e1.a0.d(e1.y.b(j66, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), ((l0.i) y0Var.i(l0.k.f395847a)).k());
        } else {
            j48 = j47;
            j49 = j29;
        }
        if ((i19 & 256) != 0) {
            j57 = k17;
            j58 = e1.a0.d(e1.y.b(k17, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), ((l0.i) y0Var.i(l0.k.f395847a)).k());
        } else {
            j57 = k17;
            j58 = j37;
        }
        l0.x xVar = new l0.x(j39, e1.y.b(j66, f19, 0.0f, 0.0f, 0.0f, 14, null), j57, e1.y.b(f27, f28, 0.0f, 0.0f, 0.0f, 14, null), j48, e1.y.b(j49, f19, 0.0f, 0.0f, 0.0f, 14, null), j58, e1.y.b((i19 & 512) != 0 ? e1.a0.d(e1.y.b(f27, lVar.b(y0Var, 6), 0.0f, 0.0f, 0.0f, 14, null), ((l0.i) y0Var.i(l0.k.f395847a)).k()) : j38, f28, 0.0f, 0.0f, 0.0f, 14, null), null);
        y0Var.o(false);
        return xVar;
    }
}

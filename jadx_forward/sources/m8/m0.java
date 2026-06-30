package m8;

/* loaded from: classes15.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    public static final m8.m0 f406168a = new m8.j0();

    public abstract int a(java.lang.Object obj);

    public final int b(int i17, m8.k0 k0Var, m8.l0 l0Var, int i18) {
        int i19 = d(i17, k0Var, false).f406130c;
        if (g(i19, l0Var).f406159d != i17) {
            return i17 + 1;
        }
        if (i18 == 0) {
            i19 = i19 == i() - 1 ? -1 : i19 + 1;
        } else if (i18 != 1) {
            if (i18 != 2) {
                throw new java.lang.IllegalStateException();
            }
            i19 = i19 != i() - 1 ? i19 + 1 : 0;
        }
        if (i19 == -1) {
            return -1;
        }
        return g(i19, l0Var).f406158c;
    }

    public final m8.k0 c(int i17, m8.k0 k0Var) {
        return d(i17, k0Var, false);
    }

    public abstract m8.k0 d(int i17, m8.k0 k0Var, boolean z17);

    public abstract int e();

    public final android.util.Pair f(m8.l0 l0Var, m8.k0 k0Var, int i17, long j17, long j18) {
        t9.a.c(i17, 0, i());
        h(i17, l0Var, false, j18);
        if (j17 == -9223372036854775807L) {
            j17 = l0Var.f406160e;
            if (j17 == -9223372036854775807L) {
                return null;
            }
        }
        int i18 = l0Var.f406158c;
        long j19 = l0Var.f406162g + j17;
        long j27 = d(i18, k0Var, false).f406131d;
        while (j27 != -9223372036854775807L && j19 >= j27 && i18 < l0Var.f406159d) {
            j19 -= j27;
            i18++;
            j27 = d(i18, k0Var, false).f406131d;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(j19));
    }

    public final m8.l0 g(int i17, m8.l0 l0Var) {
        return h(i17, l0Var, false, 0L);
    }

    public abstract m8.l0 h(int i17, m8.l0 l0Var, boolean z17, long j17);

    public abstract int i();

    public final boolean j() {
        return i() == 0;
    }
}

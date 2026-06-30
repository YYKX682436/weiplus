package m8;

/* loaded from: classes15.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final m8.k0 f406207a = new m8.k0();

    /* renamed from: b, reason: collision with root package name */
    public final m8.l0 f406208b = new m8.l0();

    /* renamed from: c, reason: collision with root package name */
    public m8.m0 f406209c;

    /* renamed from: d, reason: collision with root package name */
    public int f406210d;

    public final m8.v a(d9.z zVar, long j17, long j18) {
        m8.m0 m0Var = this.f406209c;
        int i17 = zVar.f308960a;
        m8.k0 k0Var = this.f406207a;
        m0Var.c(i17, k0Var);
        if (!zVar.a()) {
            int a17 = k0Var.a(j18);
            return c(zVar.f308960a, j18, a17 == -1 ? Long.MIN_VALUE : k0Var.f406133f[a17]);
        }
        int i18 = zVar.f308961b;
        int i19 = zVar.f308962c;
        if (i19 < k0Var.f406135h[i18]) {
            return b(zVar.f308960a, i18, i19, j17);
        }
        return null;
    }

    public final m8.v b(int i17, int i18, int i19, long j17) {
        d9.z zVar = new d9.z(i17, i18, i19);
        boolean e17 = e(zVar, Long.MIN_VALUE);
        boolean f17 = f(zVar, e17);
        m8.m0 m0Var = this.f406209c;
        m8.k0 k0Var = this.f406207a;
        long[] jArr = m0Var.d(i17, k0Var, false).f406137j[i18];
        return new m8.v(zVar, i19 == k0Var.f406136i[i18] ? k0Var.f406138k : 0L, Long.MIN_VALUE, j17, i19 >= jArr.length ? -9223372036854775807L : jArr[i19], e17, f17);
    }

    public final m8.v c(int i17, long j17, long j18) {
        d9.z zVar = new d9.z(i17, -1, -1);
        boolean e17 = e(zVar, j18);
        boolean f17 = f(zVar, e17);
        m8.m0 m0Var = this.f406209c;
        m8.k0 k0Var = this.f406207a;
        m0Var.c(i17, k0Var);
        return new m8.v(zVar, j17, j18, -9223372036854775807L, j18 == Long.MIN_VALUE ? k0Var.f406131d : j18, e17, f17);
    }

    public final m8.v d(m8.v vVar, d9.z zVar) {
        long j17;
        long j18;
        long j19 = vVar.f406201b;
        long j27 = vVar.f406202c;
        boolean e17 = e(zVar, j27);
        boolean f17 = f(zVar, e17);
        m8.m0 m0Var = this.f406209c;
        int i17 = zVar.f308960a;
        m8.k0 k0Var = this.f406207a;
        m0Var.c(i17, k0Var);
        if (zVar.a()) {
            long[] jArr = k0Var.f406137j[zVar.f308961b];
            int length = jArr.length;
            int i18 = zVar.f308962c;
            j18 = i18 >= length ? -9223372036854775807L : jArr[i18];
        } else {
            if (j27 != Long.MIN_VALUE) {
                j17 = j27;
                return new m8.v(zVar, j19, j27, vVar.f406203d, j17, e17, f17);
            }
            j18 = k0Var.f406131d;
        }
        j17 = j18;
        return new m8.v(zVar, j19, j27, vVar.f406203d, j17, e17, f17);
    }

    public final boolean e(d9.z zVar, long j17) {
        boolean z17;
        m8.m0 m0Var = this.f406209c;
        int i17 = zVar.f308960a;
        m8.k0 k0Var = this.f406207a;
        long[] jArr = m0Var.d(i17, k0Var, false).f406133f;
        int length = jArr == null ? 0 : jArr.length;
        if (length == 0) {
            return true;
        }
        int i18 = length - 1;
        boolean a17 = zVar.a();
        if (k0Var.f406133f[i18] != Long.MIN_VALUE) {
            return !a17 && j17 == Long.MIN_VALUE;
        }
        int i19 = k0Var.f406134g[i18];
        if (i19 == -1) {
            return false;
        }
        if (a17 && zVar.f308961b == i18) {
            if (zVar.f308962c == i19 - 1) {
                z17 = true;
                return !z17 || (!a17 && k0Var.f406136i[i18] == i19);
            }
        }
        z17 = false;
        if (z17) {
        }
    }

    public final boolean f(d9.z zVar, boolean z17) {
        m8.m0 m0Var = this.f406209c;
        int i17 = zVar.f308960a;
        m8.k0 k0Var = this.f406207a;
        int i18 = m0Var.d(i17, k0Var, false).f406130c;
        m8.m0 m0Var2 = this.f406209c;
        m8.l0 l0Var = this.f406208b;
        if (m0Var2.g(i18, l0Var).f406157b) {
            return false;
        }
        return (this.f406209c.b(zVar.f308960a, k0Var, l0Var, this.f406210d) == -1) && z17;
    }

    public d9.z g(int i17, long j17) {
        m8.m0 m0Var = this.f406209c;
        m8.k0 k0Var = this.f406207a;
        m0Var.c(i17, k0Var);
        int b17 = k0Var.b(j17);
        return b17 == -1 ? new d9.z(i17, -1, -1) : new d9.z(i17, b17, k0Var.f406136i[b17]);
    }
}

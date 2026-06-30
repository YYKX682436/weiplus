package d9;

/* loaded from: classes15.dex */
public final class j0 extends m8.m0 {

    /* renamed from: h, reason: collision with root package name */
    public static final java.lang.Object f308890h = new java.lang.Object();

    /* renamed from: b, reason: collision with root package name */
    public final long f308891b;

    /* renamed from: c, reason: collision with root package name */
    public final long f308892c;

    /* renamed from: d, reason: collision with root package name */
    public final long f308893d;

    /* renamed from: e, reason: collision with root package name */
    public final long f308894e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f308895f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f308896g;

    public j0(long j17, long j18, long j19, long j27, long j28, long j29, boolean z17, boolean z18) {
        this.f308891b = j19;
        this.f308892c = j27;
        this.f308893d = j28;
        this.f308894e = j29;
        this.f308895f = z17;
        this.f308896g = z18;
    }

    @Override // m8.m0
    public int a(java.lang.Object obj) {
        return f308890h.equals(obj) ? 0 : -1;
    }

    @Override // m8.m0
    public m8.k0 d(int i17, m8.k0 k0Var, boolean z17) {
        t9.a.c(i17, 0, 1);
        java.lang.Object obj = z17 ? f308890h : null;
        long j17 = -this.f308893d;
        k0Var.f406128a = obj;
        k0Var.f406129b = obj;
        k0Var.f406130c = 0;
        k0Var.f406131d = this.f308891b;
        k0Var.f406132e = j17;
        k0Var.f406133f = null;
        k0Var.f406134g = null;
        k0Var.f406135h = null;
        k0Var.f406136i = null;
        k0Var.f406137j = null;
        k0Var.f406138k = -9223372036854775807L;
        return k0Var;
    }

    @Override // m8.m0
    public int e() {
        return 1;
    }

    @Override // m8.m0
    public m8.l0 h(int i17, m8.l0 l0Var, boolean z17, long j17) {
        t9.a.c(i17, 0, 1);
        java.lang.Object obj = z17 ? f308890h : null;
        long j18 = this.f308892c;
        long j19 = this.f308894e;
        boolean z18 = this.f308896g;
        if (z18) {
            j19 += j17;
            if (j19 > j18) {
                j19 = -9223372036854775807L;
            }
        }
        l0Var.f406156a = obj;
        l0Var.getClass();
        l0Var.f406157b = z18;
        l0Var.f406160e = j19;
        l0Var.f406161f = j18;
        l0Var.f406158c = 0;
        l0Var.f406159d = 0;
        l0Var.f406162g = this.f308893d;
        return l0Var;
    }

    @Override // m8.m0
    public int i() {
        return 1;
    }
}

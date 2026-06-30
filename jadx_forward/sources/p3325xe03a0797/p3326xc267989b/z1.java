package p3325xe03a0797.p3326xc267989b;

/* loaded from: classes14.dex */
public abstract class z1 implements java.lang.Runnable, java.lang.Comparable, p3325xe03a0797.p3326xc267989b.s1, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0 {

    /* renamed from: _heap */
    private volatile java.lang.Object f72756x56b86cb;

    /* renamed from: d, reason: collision with root package name */
    public long f392240d;

    /* renamed from: e, reason: collision with root package name */
    public int f392241e = -1;

    public z1(long j17) {
        this.f392240d = j17;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        long j17 = this.f392240d - ((p3325xe03a0797.p3326xc267989b.z1) obj).f392240d;
        if (j17 > 0) {
            return 1;
        }
        return j17 < 0 ? -1 : 0;
    }

    @Override // p3325xe03a0797.p3326xc267989b.s1
    /* renamed from: dispose */
    public final synchronized void mo144008x63a5261f() {
        java.lang.Object obj = this.f72756x56b86cb;
        p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.l0 l0Var = p3325xe03a0797.p3326xc267989b.d2.f391692a;
        if (obj == l0Var) {
            return;
        }
        p3325xe03a0797.p3326xc267989b.a2 a2Var = obj instanceof p3325xe03a0797.p3326xc267989b.a2 ? (p3325xe03a0797.p3326xc267989b.a2) obj : null;
        if (a2Var != null) {
            synchronized (a2Var) {
                if (h() != null) {
                    a2Var.c(this.f392241e);
                }
            }
        }
        this.f72756x56b86cb = l0Var;
    }

    public p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.s0 h() {
        java.lang.Object obj = this.f72756x56b86cb;
        if (obj instanceof p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.s0) {
            return (p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.s0) obj;
        }
        return null;
    }

    public final synchronized int i(long j17, p3325xe03a0797.p3326xc267989b.a2 a2Var, p3325xe03a0797.p3326xc267989b.b2 b2Var) {
        if (this.f72756x56b86cb == p3325xe03a0797.p3326xc267989b.d2.f391692a) {
            return 2;
        }
        synchronized (a2Var) {
            try {
                p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.t0[] t0VarArr = a2Var.f392057a;
                p3325xe03a0797.p3326xc267989b.z1 z1Var = (p3325xe03a0797.p3326xc267989b.z1) (t0VarArr != null ? t0VarArr[0] : null);
                if (p3325xe03a0797.p3326xc267989b.b2.T(b2Var)) {
                    return 1;
                }
                if (z1Var == null) {
                    a2Var.f391667b = j17;
                } else {
                    long j18 = z1Var.f392240d;
                    if (j18 - j17 < 0) {
                        j17 = j18;
                    }
                    if (j17 - a2Var.f391667b > 0) {
                        a2Var.f391667b = j17;
                    }
                }
                long j19 = this.f392240d;
                long j27 = a2Var.f391667b;
                if (j19 - j27 < 0) {
                    this.f392240d = j27;
                }
                a2Var.a(this);
                return 0;
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }

    public void j(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.s0 s0Var) {
        if (!(this.f72756x56b86cb != p3325xe03a0797.p3326xc267989b.d2.f391692a)) {
            throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
        }
        this.f72756x56b86cb = s0Var;
    }

    /* renamed from: toString */
    public java.lang.String mo144128x9616526c() {
        return "Delayed[nanos=" + this.f392240d + ']';
    }
}

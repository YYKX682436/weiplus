package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030;

/* loaded from: classes12.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public long f149146a;

    /* renamed from: b, reason: collision with root package name */
    public long f149147b;

    /* renamed from: c, reason: collision with root package name */
    public long f149148c;

    /* renamed from: d, reason: collision with root package name */
    public long f149149d;

    /* renamed from: e, reason: collision with root package name */
    public long f149150e;

    public n3(long j17, long j18, long j19, long j27, long j28, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        j19 = (i17 & 4) != 0 ? 0L : j19;
        j27 = (i17 & 8) != 0 ? 0L : j27;
        j28 = (i17 & 16) != 0 ? 0L : j28;
        this.f149146a = j17;
        this.f149147b = j18;
        this.f149148c = j19;
        this.f149149d = j27;
        this.f149150e = j28;
    }

    /* renamed from: equals */
    public boolean m45199xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.n3)) {
            return false;
        }
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.n3 n3Var = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.n3) obj;
        return this.f149146a == n3Var.f149146a && this.f149147b == n3Var.f149147b && this.f149148c == n3Var.f149148c && this.f149149d == n3Var.f149149d && this.f149150e == n3Var.f149150e;
    }

    /* renamed from: hashCode */
    public int m45200x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f149146a) * 31) + java.lang.Long.hashCode(this.f149147b)) * 31) + java.lang.Long.hashCode(this.f149148c)) * 31) + java.lang.Long.hashCode(this.f149149d)) * 31) + java.lang.Long.hashCode(this.f149150e);
    }

    /* renamed from: toString */
    public java.lang.String m45201x9616526c() {
        return "ProcStats(sysMs=" + this.f149146a + ", usrMs=" + this.f149147b + ", startCount=" + this.f149148c + ", exitCount=" + this.f149149d + ", cpuTimeMs=" + this.f149150e + ')';
    }
}

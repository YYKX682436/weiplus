package com.tencent.mm.feature.performance;

/* loaded from: classes12.dex */
public final class n3 {

    /* renamed from: a, reason: collision with root package name */
    public long f67613a;

    /* renamed from: b, reason: collision with root package name */
    public long f67614b;

    /* renamed from: c, reason: collision with root package name */
    public long f67615c;

    /* renamed from: d, reason: collision with root package name */
    public long f67616d;

    /* renamed from: e, reason: collision with root package name */
    public long f67617e;

    public n3(long j17, long j18, long j19, long j27, long j28, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        j19 = (i17 & 4) != 0 ? 0L : j19;
        j27 = (i17 & 8) != 0 ? 0L : j27;
        j28 = (i17 & 16) != 0 ? 0L : j28;
        this.f67613a = j17;
        this.f67614b = j18;
        this.f67615c = j19;
        this.f67616d = j27;
        this.f67617e = j28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.feature.performance.n3)) {
            return false;
        }
        com.tencent.mm.feature.performance.n3 n3Var = (com.tencent.mm.feature.performance.n3) obj;
        return this.f67613a == n3Var.f67613a && this.f67614b == n3Var.f67614b && this.f67615c == n3Var.f67615c && this.f67616d == n3Var.f67616d && this.f67617e == n3Var.f67617e;
    }

    public int hashCode() {
        return (((((((java.lang.Long.hashCode(this.f67613a) * 31) + java.lang.Long.hashCode(this.f67614b)) * 31) + java.lang.Long.hashCode(this.f67615c)) * 31) + java.lang.Long.hashCode(this.f67616d)) * 31) + java.lang.Long.hashCode(this.f67617e);
    }

    public java.lang.String toString() {
        return "ProcStats(sysMs=" + this.f67613a + ", usrMs=" + this.f67614b + ", startCount=" + this.f67615c + ", exitCount=" + this.f67616d + ", cpuTimeMs=" + this.f67617e + ')';
    }
}

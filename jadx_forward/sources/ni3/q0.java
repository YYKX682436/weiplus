package ni3;

/* loaded from: classes10.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f419234a;

    /* renamed from: b, reason: collision with root package name */
    public long f419235b;

    public q0(long j17, long j18, long j19, long j27, long j28) {
        this.f419234a = j17;
        this.f419235b = j28;
    }

    /* renamed from: equals */
    public boolean m149668xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.q0)) {
            return false;
        }
        ni3.q0 q0Var = (ni3.q0) obj;
        return this.f419234a == q0Var.f419234a && this.f419235b == q0Var.f419235b;
    }

    /* renamed from: hashCode */
    public int m149669x8cdac1b() {
        return (((((((java.lang.Long.hashCode(this.f419234a) * 31) + java.lang.Long.hashCode(-1L)) * 31) + java.lang.Long.hashCode(-1L)) * 31) + java.lang.Long.hashCode(-1L)) * 31) + java.lang.Long.hashCode(this.f419235b);
    }

    /* renamed from: toString */
    public java.lang.String m149670x9616526c() {
        return "FeedLifeTimeMs(toLocalTime=" + this.f419234a + ", toStreamTime=-1, toPreloadTime=-1, toPreRenderTime=-1, toReportTime=" + this.f419235b + ')';
    }
}

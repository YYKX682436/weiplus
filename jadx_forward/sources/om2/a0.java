package om2;

/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f427802a;

    /* renamed from: b, reason: collision with root package name */
    public final long f427803b;

    public a0(long j17, long j18) {
        this.f427802a = j17;
        this.f427803b = j18;
    }

    /* renamed from: equals */
    public boolean m151649xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.a0)) {
            return false;
        }
        om2.a0 a0Var = (om2.a0) obj;
        return this.f427802a == a0Var.f427802a && this.f427803b == a0Var.f427803b;
    }

    /* renamed from: hashCode */
    public int m151650x8cdac1b() {
        return (java.lang.Long.hashCode(this.f427802a) * 31) + java.lang.Long.hashCode(this.f427803b);
    }

    /* renamed from: toString */
    public java.lang.String m151651x9616526c() {
        return "SeekState(startTime=" + this.f427802a + ", endTime=" + this.f427803b + ')';
    }
}

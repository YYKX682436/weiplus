package ni3;

/* loaded from: classes9.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public long f419269a;

    /* renamed from: b, reason: collision with root package name */
    public int f419270b;

    public t0(long j17, int i17) {
        this.f419269a = j17;
        this.f419270b = i17;
    }

    /* renamed from: equals */
    public boolean m149680xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.t0)) {
            return false;
        }
        ni3.t0 t0Var = (ni3.t0) obj;
        return this.f419269a == t0Var.f419269a && this.f419270b == t0Var.f419270b;
    }

    /* renamed from: hashCode */
    public int m149681x8cdac1b() {
        return (java.lang.Long.hashCode(this.f419269a) * 31) + java.lang.Integer.hashCode(this.f419270b);
    }

    /* renamed from: toString */
    public java.lang.String m149682x9616526c() {
        return "LoadParams(loadSize=" + this.f419269a + ", loadPercent=" + this.f419270b + ')';
    }
}

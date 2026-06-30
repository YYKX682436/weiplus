package ni3;

/* loaded from: classes10.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f419171a;

    /* renamed from: b, reason: collision with root package name */
    public long f419172b;

    /* renamed from: c, reason: collision with root package name */
    public long f419173c;

    /* renamed from: d, reason: collision with root package name */
    public int f419174d;

    public n0(int i17, long j17, long j18, int i18) {
        this.f419171a = i17;
        this.f419172b = j17;
        this.f419173c = j18;
        this.f419174d = i18;
    }

    /* renamed from: equals */
    public boolean m149656xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3.n0)) {
            return false;
        }
        ni3.n0 n0Var = (ni3.n0) obj;
        return this.f419171a == n0Var.f419171a && this.f419172b == n0Var.f419172b && this.f419173c == n0Var.f419173c && this.f419174d == n0Var.f419174d;
    }

    /* renamed from: hashCode */
    public int m149657x8cdac1b() {
        return (((((java.lang.Integer.hashCode(this.f419171a) * 31) + java.lang.Long.hashCode(this.f419172b)) * 31) + java.lang.Long.hashCode(this.f419173c)) * 31) + java.lang.Integer.hashCode(this.f419174d);
    }

    /* renamed from: toString */
    public java.lang.String m149658x9616526c() {
        return "CgiActionInfo(tabType=" + this.f419171a + ", startTimeMs=" + this.f419172b + ", endTimeMs=" + this.f419173c + ", respItemSize=" + this.f419174d + ')';
    }
}

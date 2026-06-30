package yg;

/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f543594a;

    /* renamed from: b, reason: collision with root package name */
    public final long f543595b;

    /* renamed from: c, reason: collision with root package name */
    public final long f543596c;

    public g0(long j17, long j18, long j19) {
        this.f543594a = j17;
        this.f543595b = j18;
        this.f543596c = j19;
    }

    /* renamed from: equals */
    public boolean m177001xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg.g0)) {
            return false;
        }
        yg.g0 g0Var = (yg.g0) obj;
        return this.f543594a == g0Var.f543594a && this.f543595b == g0Var.f543595b && this.f543596c == g0Var.f543596c;
    }

    /* renamed from: hashCode */
    public int m177002x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f543594a) * 31) + java.lang.Long.hashCode(this.f543595b)) * 31) + java.lang.Long.hashCode(this.f543596c);
    }

    /* renamed from: toString */
    public java.lang.String m177003x9616526c() {
        return "V8RawPointer(isolatePtr=" + this.f543594a + ", contextPtr=" + this.f543595b + ", uvLoopPtr=" + this.f543596c + ')';
    }
}

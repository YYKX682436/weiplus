package bg2;

/* loaded from: classes2.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f101564a;

    /* renamed from: b, reason: collision with root package name */
    public final long f101565b;

    /* renamed from: c, reason: collision with root package name */
    public final long f101566c;

    public d5(long j17, long j18, long j19) {
        this.f101564a = j17;
        this.f101565b = j18;
        this.f101566c = j19;
    }

    /* renamed from: equals */
    public boolean m10397xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2.d5)) {
            return false;
        }
        bg2.d5 d5Var = (bg2.d5) obj;
        return this.f101564a == d5Var.f101564a && this.f101565b == d5Var.f101565b && this.f101566c == d5Var.f101566c;
    }

    /* renamed from: hashCode */
    public int m10398x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f101564a) * 31) + java.lang.Long.hashCode(this.f101565b)) * 31) + java.lang.Long.hashCode(this.f101566c);
    }

    /* renamed from: toString */
    public java.lang.String m10399x9616526c() {
        return "Expt2(startDelay=" + this.f101564a + ", playDuration=" + this.f101565b + ", interval=" + this.f101566c + ')';
    }
}

package bg2;

/* loaded from: classes2.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f20031a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20032b;

    /* renamed from: c, reason: collision with root package name */
    public final long f20033c;

    public d5(long j17, long j18, long j19) {
        this.f20031a = j17;
        this.f20032b = j18;
        this.f20033c = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg2.d5)) {
            return false;
        }
        bg2.d5 d5Var = (bg2.d5) obj;
        return this.f20031a == d5Var.f20031a && this.f20032b == d5Var.f20032b && this.f20033c == d5Var.f20033c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f20031a) * 31) + java.lang.Long.hashCode(this.f20032b)) * 31) + java.lang.Long.hashCode(this.f20033c);
    }

    public java.lang.String toString() {
        return "Expt2(startDelay=" + this.f20031a + ", playDuration=" + this.f20032b + ", interval=" + this.f20033c + ')';
    }
}

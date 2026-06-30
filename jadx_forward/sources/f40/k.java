package f40;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public int f340967a;

    /* renamed from: b, reason: collision with root package name */
    public final long f340968b;

    /* renamed from: c, reason: collision with root package name */
    public final long f340969c;

    public k(int i17, long j17, long j18) {
        this.f340967a = i17;
        this.f340968b = j17;
        this.f340969c = j18;
    }

    /* renamed from: equals */
    public boolean m129015xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f40.k)) {
            return false;
        }
        f40.k kVar = (f40.k) obj;
        return this.f340967a == kVar.f340967a && this.f340968b == kVar.f340968b && this.f340969c == kVar.f340969c;
    }

    /* renamed from: hashCode */
    public int m129016x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f340967a) * 31) + java.lang.Long.hashCode(this.f340968b)) * 31) + java.lang.Long.hashCode(this.f340969c);
    }

    /* renamed from: toString */
    public java.lang.String m129017x9616526c() {
        return "RecordFileState(status=" + this.f340967a + ", offset=" + this.f340968b + ", totalLen=" + this.f340969c + ')';
    }
}

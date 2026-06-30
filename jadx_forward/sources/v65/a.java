package v65;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f515073a;

    /* renamed from: b, reason: collision with root package name */
    public final long f515074b;

    /* renamed from: c, reason: collision with root package name */
    public final long f515075c;

    public a(long j17, long j18, long j19) {
        this.f515073a = j17;
        this.f515074b = j18;
        this.f515075c = j19;
    }

    /* renamed from: equals */
    public boolean m171207xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v65.a)) {
            return false;
        }
        v65.a aVar = (v65.a) obj;
        return this.f515073a == aVar.f515073a && this.f515074b == aVar.f515074b && this.f515075c == aVar.f515075c;
    }

    /* renamed from: hashCode */
    public int m171208x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f515073a) * 31) + java.lang.Long.hashCode(this.f515074b)) * 31) + java.lang.Long.hashCode(this.f515075c);
    }

    /* renamed from: toString */
    public java.lang.String m171209x9616526c() {
        return "CheckCondition(startTime=" + this.f515073a + ", endTime=" + this.f515074b + ", interval=" + this.f515075c + ')';
    }
}

package uz3;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f513692a;

    /* renamed from: b, reason: collision with root package name */
    public long f513693b;

    public a(long j17, long j18) {
        this.f513692a = j17;
        this.f513693b = j18;
    }

    /* renamed from: equals */
    public boolean m170827xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz3.a)) {
            return false;
        }
        uz3.a aVar = (uz3.a) obj;
        return this.f513692a == aVar.f513692a && this.f513693b == aVar.f513693b;
    }

    /* renamed from: hashCode */
    public int m170828x8cdac1b() {
        return (java.lang.Long.hashCode(this.f513692a) * 31) + java.lang.Long.hashCode(this.f513693b);
    }

    /* renamed from: toString */
    public java.lang.String m170829x9616526c() {
        return "PerformanceRecord(startScanProduct=" + this.f513692a + ", endScanProduct=" + this.f513693b + ')';
    }
}

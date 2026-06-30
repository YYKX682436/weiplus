package uc5;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f508077a;

    /* renamed from: b, reason: collision with root package name */
    public final long f508078b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f508079c;

    public s(int i17, long j17, boolean z17) {
        this.f508077a = i17;
        this.f508078b = j17;
        this.f508079c = z17;
    }

    /* renamed from: equals */
    public boolean m167849xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.s)) {
            return false;
        }
        uc5.s sVar = (uc5.s) obj;
        return this.f508077a == sVar.f508077a && this.f508078b == sVar.f508078b && this.f508079c == sVar.f508079c;
    }

    /* renamed from: hashCode */
    public int m167850x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f508077a) * 31) + java.lang.Long.hashCode(this.f508078b)) * 31) + java.lang.Boolean.hashCode(this.f508079c);
    }

    /* renamed from: toString */
    public java.lang.String m167851x9616526c() {
        return "ScanResult(loadedCount=" + this.f508077a + ", lastScannedTime=" + this.f508078b + ", hasMore=" + this.f508079c + ')';
    }
}

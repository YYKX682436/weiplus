package cz2;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public int f306516a;

    /* renamed from: b, reason: collision with root package name */
    public long f306517b;

    public b(int i17, long j17) {
        this.f306516a = i17;
        this.f306517b = j17;
    }

    /* renamed from: equals */
    public boolean m123158xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz2.b)) {
            return false;
        }
        cz2.b bVar = (cz2.b) obj;
        return this.f306516a == bVar.f306516a && this.f306517b == bVar.f306517b;
    }

    /* renamed from: hashCode */
    public int m123159x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f306516a) * 31) + java.lang.Long.hashCode(this.f306517b);
    }

    /* renamed from: toString */
    public java.lang.String m123160x9616526c() {
        return "TimeLimit(count=" + this.f306516a + ", lastTryTime=" + this.f306517b + ')';
    }
}

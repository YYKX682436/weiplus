package s04;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f483501a;

    /* renamed from: b, reason: collision with root package name */
    public final int f483502b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f483503c;

    public a(long j17, int i17, boolean z17) {
        this.f483501a = j17;
        this.f483502b = i17;
        this.f483503c = z17;
    }

    /* renamed from: equals */
    public boolean m163506xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s04.a)) {
            return false;
        }
        s04.a aVar = (s04.a) obj;
        return this.f483501a == aVar.f483501a && this.f483502b == aVar.f483502b && this.f483503c == aVar.f483503c;
    }

    /* renamed from: hashCode */
    public int m163507x8cdac1b() {
        return (((java.lang.Long.hashCode(this.f483501a) * 31) + java.lang.Integer.hashCode(this.f483502b)) * 31) + java.lang.Boolean.hashCode(this.f483503c);
    }

    /* renamed from: toString */
    public java.lang.String m163508x9616526c() {
        return "RecoveryReportData(lastRecoveryTime=" + this.f483501a + ", lastRecoveryType=" + this.f483502b + ", hasRecoveryData=" + this.f483503c + ')';
    }
}

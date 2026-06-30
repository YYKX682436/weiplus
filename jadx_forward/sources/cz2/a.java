package cz2;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f306514a;

    /* renamed from: b, reason: collision with root package name */
    public final long f306515b;

    public a(int i17, long j17) {
        this.f306514a = i17;
        this.f306515b = j17;
    }

    /* renamed from: equals */
    public boolean m123155xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cz2.a)) {
            return false;
        }
        cz2.a aVar = (cz2.a) obj;
        return this.f306514a == aVar.f306514a && this.f306515b == aVar.f306515b;
    }

    /* renamed from: hashCode */
    public int m123156x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f306514a) * 31) + java.lang.Long.hashCode(this.f306515b);
    }

    /* renamed from: toString */
    public java.lang.String m123157x9616526c() {
        return "ServerLimit(count=" + this.f306514a + ", time=" + this.f306515b + ')';
    }
}

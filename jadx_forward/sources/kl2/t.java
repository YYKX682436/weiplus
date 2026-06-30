package kl2;

/* loaded from: classes3.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public final long f390347a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f390348b;

    public t(long j17, boolean z17) {
        this.f390347a = j17;
        this.f390348b = z17;
    }

    /* renamed from: equals */
    public boolean m143614xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl2.t)) {
            return false;
        }
        kl2.t tVar = (kl2.t) obj;
        return this.f390347a == tVar.f390347a && this.f390348b == tVar.f390348b;
    }

    /* renamed from: hashCode */
    public int m143615x8cdac1b() {
        return (java.lang.Long.hashCode(this.f390347a) * 31) + java.lang.Boolean.hashCode(this.f390348b);
    }

    /* renamed from: toString */
    public java.lang.String m143616x9616526c() {
        return "ItemData(content=" + this.f390347a + ", isSelect=" + this.f390348b + ')';
    }
}

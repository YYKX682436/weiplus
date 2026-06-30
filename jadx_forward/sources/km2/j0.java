package km2;

/* loaded from: classes3.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f390645a;

    /* renamed from: b, reason: collision with root package name */
    public final long f390646b;

    public j0(boolean z17, long j17) {
        this.f390645a = z17;
        this.f390646b = j17;
    }

    /* renamed from: equals */
    public boolean m143667xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.j0)) {
            return false;
        }
        km2.j0 j0Var = (km2.j0) obj;
        return this.f390645a == j0Var.f390645a && this.f390646b == j0Var.f390646b;
    }

    /* renamed from: hashCode */
    public int m143668x8cdac1b() {
        return (java.lang.Boolean.hashCode(this.f390645a) * 31) + java.lang.Long.hashCode(this.f390646b);
    }

    /* renamed from: toString */
    public java.lang.String m143669x9616526c() {
        return "NextConfig(continuePolling=" + this.f390645a + ", delayTimeMs=" + this.f390646b + ')';
    }
}

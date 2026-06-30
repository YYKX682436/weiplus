package mm2;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f410718a;

    /* renamed from: b, reason: collision with root package name */
    public final long f410719b;

    public k(long j17, long j18) {
        this.f410718a = j17;
        this.f410719b = j18;
    }

    /* renamed from: equals */
    public boolean m147978xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.k)) {
            return false;
        }
        mm2.k kVar = (mm2.k) obj;
        return this.f410718a == kVar.f410718a && this.f410719b == kVar.f410719b;
    }

    /* renamed from: hashCode */
    public int m147979x8cdac1b() {
        return (java.lang.Long.hashCode(this.f410718a) * 31) + java.lang.Long.hashCode(this.f410719b);
    }

    /* renamed from: toString */
    public java.lang.String m147980x9616526c() {
        return "LivingAdVideoProgress(progressMs=" + this.f410718a + ", durationMs=" + this.f410719b + ')';
    }
}

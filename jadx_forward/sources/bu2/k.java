package bu2;

/* loaded from: classes2.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f106071a;

    /* renamed from: b, reason: collision with root package name */
    public final long f106072b;

    public k(long j17, long j18) {
        this.f106071a = j17;
        this.f106072b = j18;
    }

    /* renamed from: equals */
    public boolean m11298xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu2.k)) {
            return false;
        }
        bu2.k kVar = (bu2.k) obj;
        return this.f106071a == kVar.f106071a && this.f106072b == kVar.f106072b;
    }

    /* renamed from: hashCode */
    public int m11299x8cdac1b() {
        return (java.lang.Long.hashCode(this.f106071a) * 31) + java.lang.Long.hashCode(this.f106072b);
    }

    /* renamed from: toString */
    public java.lang.String m11300x9616526c() {
        return "CacheKey(feedId=" + this.f106071a + ", refCommentId=" + this.f106072b + ')';
    }
}

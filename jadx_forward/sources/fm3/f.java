package fm3;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f345579a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f345580b;

    public f(long j17, java.lang.String nonceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        this.f345579a = j17;
        this.f345580b = nonceId;
    }

    /* renamed from: equals */
    public boolean m129770xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.f)) {
            return false;
        }
        fm3.f fVar = (fm3.f) obj;
        return this.f345579a == fVar.f345579a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345580b, fVar.f345580b);
    }

    /* renamed from: hashCode */
    public int m129771x8cdac1b() {
        return (java.lang.Long.hashCode(this.f345579a) * 31) + this.f345580b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m129772x9616526c() {
        return "FinderFeedDetailCacheKey(feedId=" + this.f345579a + ", nonceId=" + this.f345580b + ')';
    }
}

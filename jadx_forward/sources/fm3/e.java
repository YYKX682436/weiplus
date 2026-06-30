package fm3;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final r45.h51 f345576a;

    /* renamed from: b, reason: collision with root package name */
    public final long f345577b;

    public e(r45.h51 response, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f345576a = response;
        this.f345577b = j17;
    }

    /* renamed from: equals */
    public boolean m129766xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm3.e)) {
            return false;
        }
        fm3.e eVar = (fm3.e) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f345576a, eVar.f345576a) && this.f345577b == eVar.f345577b;
    }

    /* renamed from: hashCode */
    public int m129767x8cdac1b() {
        return (this.f345576a.hashCode() * 31) + java.lang.Long.hashCode(this.f345577b);
    }

    /* renamed from: toString */
    public java.lang.String m129768x9616526c() {
        return "FinderFeedDetailCache(response=" + this.f345576a + ", timestamp=" + this.f345577b + ')';
    }
}

package et1;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 f338097a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 f338098b;

    public b(com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 digestStr, com.p314xaae8f345.mm.p2493x1bc889d6.C19772x1c2cd081 digestUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digestStr, "digestStr");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(digestUser, "digestUser");
        this.f338097a = digestStr;
        this.f338098b = digestUser;
    }

    /* renamed from: equals */
    public boolean m128174xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof et1.b)) {
            return false;
        }
        et1.b bVar = (et1.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338097a, bVar.f338097a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f338098b, bVar.f338098b);
    }

    /* renamed from: hashCode */
    public int m128175x8cdac1b() {
        return (this.f338097a.hashCode() * 31) + this.f338098b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m128176x9616526c() {
        return "DigestData(digestStr=" + this.f338097a + ", digestUser=" + this.f338098b + ')';
    }
}

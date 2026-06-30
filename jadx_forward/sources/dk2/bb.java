package dk2;

/* loaded from: classes12.dex */
public final class bb implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f314781d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f314782e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f314783f;

    /* renamed from: g, reason: collision with root package name */
    public int f314784g;

    /* renamed from: h, reason: collision with root package name */
    public long f314785h;

    /* renamed from: i, reason: collision with root package name */
    public az2.j f314786i;

    public bb(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        this.f314781d = i17;
        this.f314782e = req;
        this.f314784g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_polling_minimal_duration, 5);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        dk2.bb other = (dk2.bb) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f314785h, other.f314785h);
    }

    /* renamed from: toString */
    public java.lang.String m124547x9616526c() {
        return "Command(cmdId=" + this.f314781d + ", disabled=" + this.f314783f + ", req=" + this.f314782e + ", intervalSec=" + this.f314784g + ", requestTime=" + this.f314785h + ", requestingCgi=" + this.f314786i + ')';
    }
}

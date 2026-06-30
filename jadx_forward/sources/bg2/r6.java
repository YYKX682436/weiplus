package bg2;

/* loaded from: classes12.dex */
public final class r6 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final int f102002d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f102003e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f102004f;

    /* renamed from: g, reason: collision with root package name */
    public int f102005g;

    /* renamed from: h, reason: collision with root package name */
    public long f102006h;

    /* renamed from: i, reason: collision with root package name */
    public az2.j f102007i;

    public r6(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        this.f102002d = i17;
        this.f102003e = req;
        this.f102005g = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_finder_live_polling_minimal_duration, 5);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        bg2.r6 other = (bg2.r6) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f102006h, other.f102006h);
    }

    /* renamed from: toString */
    public java.lang.String m10423x9616526c() {
        return "Command(cmdId=" + this.f102002d + ", disabled=" + this.f102004f + ", req=" + this.f102003e + ", intervalSec=" + this.f102005g + ", requestTime=" + this.f102006h + ", requestingCgi=" + this.f102007i + ')';
    }
}

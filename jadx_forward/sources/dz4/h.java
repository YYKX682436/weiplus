package dz4;

/* loaded from: classes11.dex */
public final class h extends dz4.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f326801m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f326802n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f326803o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f326804p;

    /* renamed from: q, reason: collision with root package name */
    public final int f326805q;

    /* renamed from: r, reason: collision with root package name */
    public final long f326806r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String snsFeedLocalId, java.lang.String snsServerId, java.lang.String snsNoteCoverPath, java.lang.String xml, int i17, long j17) {
        super(i17, false, xml, j17, 0, 0, false, 0, null, null, null, null, 4080, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsFeedLocalId, "snsFeedLocalId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsServerId, "snsServerId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(snsNoteCoverPath, "snsNoteCoverPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(xml, "xml");
        this.f326801m = snsFeedLocalId;
        this.f326802n = snsServerId;
        this.f326803o = snsNoteCoverPath;
        this.f326804p = xml;
        this.f326805q = i17;
        this.f326806r = j17;
    }

    /* renamed from: equals */
    public boolean m126501xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz4.h)) {
            return false;
        }
        dz4.h hVar = (dz4.h) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326801m, hVar.f326801m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326802n, hVar.f326802n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326803o, hVar.f326803o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f326804p, hVar.f326804p) && this.f326805q == hVar.f326805q && this.f326806r == hVar.f326806r;
    }

    /* renamed from: hashCode */
    public int m126502x8cdac1b() {
        return (((((((((this.f326801m.hashCode() * 31) + this.f326802n.hashCode()) * 31) + this.f326803o.hashCode()) * 31) + this.f326804p.hashCode()) * 31) + java.lang.Integer.hashCode(this.f326805q)) * 31) + java.lang.Long.hashCode(this.f326806r);
    }

    /* renamed from: toString */
    public java.lang.String m126503x9616526c() {
        return "Sns(snsFeedLocalId=" + this.f326801m + ", snsServerId=" + this.f326802n + ", snsNoteCoverPath=" + this.f326803o + ", xml=" + this.f326804p + ", scene=" + this.f326805q + ", noteLocalId=" + this.f326806r + ')';
    }
}

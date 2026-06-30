package km2;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f390609a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f390610b;

    /* renamed from: c, reason: collision with root package name */
    public final long f390611c;

    public c(java.lang.String sessionId, java.lang.String vrRoomId, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vrRoomId, "vrRoomId");
        this.f390609a = sessionId;
        this.f390610b = vrRoomId;
        this.f390611c = j17;
    }

    /* renamed from: equals */
    public boolean m143650xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.c)) {
            return false;
        }
        km2.c cVar = (km2.c) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390609a, cVar.f390609a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390610b, cVar.f390610b) && this.f390611c == cVar.f390611c;
    }

    /* renamed from: hashCode */
    public int m143651x8cdac1b() {
        return (((this.f390609a.hashCode() * 31) + this.f390610b.hashCode()) * 31) + java.lang.Long.hashCode(this.f390611c);
    }

    /* renamed from: toString */
    public java.lang.String m143652x9616526c() {
        return "AnchorMicPkData(sessionId=" + this.f390609a + ", vrRoomId=" + this.f390610b + ", vrRoomIdVersion=" + this.f390611c + ')';
    }
}

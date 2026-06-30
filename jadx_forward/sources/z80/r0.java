package z80;

/* loaded from: classes2.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f552199a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f552200b;

    /* renamed from: c, reason: collision with root package name */
    public final int f552201c;

    public r0(java.lang.String weAppId, java.lang.String weAppUrl, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppId, "weAppId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weAppUrl, "weAppUrl");
        this.f552199a = weAppId;
        this.f552200b = weAppUrl;
        this.f552201c = i17;
    }

    /* renamed from: equals */
    public boolean m178547xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.r0)) {
            return false;
        }
        z80.r0 r0Var = (z80.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552199a, r0Var.f552199a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f552200b, r0Var.f552200b) && this.f552201c == r0Var.f552201c;
    }

    /* renamed from: hashCode */
    public int m178548x8cdac1b() {
        return (((this.f552199a.hashCode() * 31) + this.f552200b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f552201c);
    }

    /* renamed from: toString */
    public java.lang.String m178549x9616526c() {
        return "POIJumpData(weAppId=" + this.f552199a + ", weAppUrl=" + this.f552200b + ", weAppScene=" + this.f552201c + ')';
    }
}

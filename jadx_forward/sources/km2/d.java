package km2;

/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r45.lw1 f390616a;

    /* renamed from: b, reason: collision with root package name */
    public final int f390617b;

    public d(r45.lw1 info, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f390616a = info;
        this.f390617b = i17;
    }

    /* renamed from: equals */
    public boolean m143653xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.d)) {
            return false;
        }
        km2.d dVar = (km2.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390616a, dVar.f390616a) && this.f390617b == dVar.f390617b;
    }

    /* renamed from: hashCode */
    public int m143654x8cdac1b() {
        return (this.f390616a.hashCode() * 31) + java.lang.Integer.hashCode(this.f390617b);
    }

    /* renamed from: toString */
    public java.lang.String m143655x9616526c() {
        return "CgiCover(info=" + this.f390616a + ", updateTime=" + this.f390617b + ')';
    }
}

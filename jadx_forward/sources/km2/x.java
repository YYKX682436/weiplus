package km2;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final long f390757a;

    /* renamed from: b, reason: collision with root package name */
    public final km2.m f390758b;

    public x(long j17, km2.m live) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(live, "live");
        this.f390757a = j17;
        this.f390758b = live;
    }

    /* renamed from: equals */
    public boolean m143693xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.x)) {
            return false;
        }
        km2.x xVar = (km2.x) obj;
        return this.f390757a == xVar.f390757a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f390758b, xVar.f390758b);
    }

    /* renamed from: hashCode */
    public int m143694x8cdac1b() {
        return (java.lang.Long.hashCode(this.f390757a) * 31) + this.f390758b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m143695x9616526c() {
        return "PreInHistory(comeInTime=" + this.f390757a + ", live=" + this.f390758b + ')';
    }
}

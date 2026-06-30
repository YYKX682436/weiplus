package it0;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f376023a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f376024b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f376025c;

    public d(int i17, java.lang.String lens, java.lang.String supportLevel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lens, "lens");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(supportLevel, "supportLevel");
        this.f376023a = i17;
        this.f376024b = lens;
        this.f376025c = supportLevel;
    }

    /* renamed from: equals */
    public boolean m139830xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it0.d)) {
            return false;
        }
        it0.d dVar = (it0.d) obj;
        return this.f376023a == dVar.f376023a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f376024b, dVar.f376024b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f376025c, dVar.f376025c);
    }

    /* renamed from: hashCode */
    public int m139831x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f376023a) * 31) + this.f376024b.hashCode()) * 31) + this.f376025c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m139832x9616526c() {
        return "CameraInfo(id=" + this.f376023a + ", lens=" + this.f376024b + ", supportLevel=" + this.f376025c + ')';
    }
}

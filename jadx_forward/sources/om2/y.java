package om2;

/* loaded from: classes10.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427922a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427923b;

    /* renamed from: c, reason: collision with root package name */
    public final my5.a f427924c;

    public y(java.lang.String version, int i17, my5.a qrc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(version, "version");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(qrc, "qrc");
        this.f427922a = version;
        this.f427923b = i17;
        this.f427924c = qrc;
    }

    /* renamed from: equals */
    public boolean m151691xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om2.y)) {
            return false;
        }
        om2.y yVar = (om2.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427922a, yVar.f427922a) && this.f427923b == yVar.f427923b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f427924c, yVar.f427924c);
    }

    /* renamed from: hashCode */
    public int m151692x8cdac1b() {
        return (((this.f427922a.hashCode() * 31) + java.lang.Integer.hashCode(this.f427923b)) * 31) + this.f427924c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m151693x9616526c() {
        return "version " + this.f427922a + " compressType: " + this.f427923b + " qrcSize: " + this.f427924c.b();
    }
}

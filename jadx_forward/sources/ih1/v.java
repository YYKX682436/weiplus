package ih1;

/* loaded from: classes7.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f373075a;

    /* renamed from: b, reason: collision with root package name */
    public final iq0.e f373076b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f373077c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f373078d;

    public v(java.lang.String bizName, iq0.e rootConfig, java.lang.String frameSetName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootConfig, "rootConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(frameSetName, "frameSetName");
        this.f373075a = bizName;
        this.f373076b = rootConfig;
        this.f373077c = frameSetName;
        this.f373078d = z17;
    }

    /* renamed from: equals */
    public boolean m136621xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ih1.v)) {
            return false;
        }
        ih1.v vVar = (ih1.v) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373075a, vVar.f373075a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373076b, vVar.f373076b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f373077c, vVar.f373077c) && this.f373078d == vVar.f373078d;
    }

    /* renamed from: hashCode */
    public int m136622x8cdac1b() {
        return (((((this.f373075a.hashCode() * 31) + this.f373076b.hashCode()) * 31) + this.f373077c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f373078d);
    }

    /* renamed from: toString */
    public java.lang.String m136623x9616526c() {
        return "ReportItem(bizName=" + this.f373075a + ", rootConfig=" + this.f373076b + ", frameSetName=" + this.f373077c + ", isVisible=" + this.f373078d + ')';
    }
}

package tf2;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ps0.a f500429a;

    /* renamed from: b, reason: collision with root package name */
    public final p05.y0 f500430b;

    public b(ps0.a process, p05.y0 effect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(process, "process");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(effect, "effect");
        this.f500429a = process;
        this.f500430b = effect;
    }

    /* renamed from: equals */
    public boolean m166421xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tf2.b)) {
            return false;
        }
        tf2.b bVar = (tf2.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500429a, bVar.f500429a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f500430b, bVar.f500430b);
    }

    /* renamed from: hashCode */
    public int m166422x8cdac1b() {
        return (this.f500429a.hashCode() * 31) + this.f500430b.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166423x9616526c() {
        return "WeVisionInstance(process=" + this.f500429a + ", effect=" + this.f500430b + ')';
    }
}

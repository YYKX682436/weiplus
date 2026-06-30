package tb5;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f498589a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f498590b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f498591c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f498592d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f498593e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f498594f;

    public j(java.util.ArrayList fpsList, java.util.ArrayList refreshList, java.util.ArrayList sensitivityList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fpsList, "fpsList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreshList, "refreshList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sensitivityList, "sensitivityList");
        this.f498589a = fpsList;
        this.f498590b = refreshList;
        this.f498591c = sensitivityList;
        this.f498592d = jz5.h.b(new tb5.g(this));
        this.f498593e = jz5.h.b(new tb5.h(this));
        this.f498594f = jz5.h.b(new tb5.i(this));
    }

    /* renamed from: equals */
    public boolean m166125xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tb5.j)) {
            return false;
        }
        tb5.j jVar = (tb5.j) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498589a, jVar.f498589a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498590b, jVar.f498590b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f498591c, jVar.f498591c);
    }

    /* renamed from: hashCode */
    public int m166126x8cdac1b() {
        return (((this.f498589a.hashCode() * 31) + this.f498590b.hashCode()) * 31) + this.f498591c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m166127x9616526c() {
        return "scrollFpsInfo{ avgFps:" + ((java.lang.Number) ((jz5.n) this.f498592d).mo141623x754a37bb()).doubleValue() + " avgRefresh:" + ((java.lang.Number) ((jz5.n) this.f498593e).mo141623x754a37bb()).doubleValue() + " avgSensitivity:" + ((java.lang.Number) ((jz5.n) this.f498594f).mo141623x754a37bb()).doubleValue() + '}';
    }
}

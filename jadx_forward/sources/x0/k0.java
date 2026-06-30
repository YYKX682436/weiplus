package x0;

/* loaded from: classes14.dex */
public final class k0 extends x0.a1 {

    /* renamed from: c, reason: collision with root package name */
    public p0.f f532434c;

    /* renamed from: d, reason: collision with root package name */
    public int f532435d;

    public k0(p0.f map) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(map, "map");
        this.f532434c = map;
    }

    @Override // x0.a1
    public void a(x0.a1 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        x0.k0 k0Var = (x0.k0) value;
        synchronized (x0.m0.f532445a) {
            this.f532434c = k0Var.f532434c;
            this.f532435d = k0Var.f532435d;
        }
    }

    @Override // x0.a1
    public x0.a1 b() {
        return new x0.k0(this.f532434c);
    }

    public final void c(p0.f fVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<set-?>");
        this.f532434c = fVar;
    }
}

package x0;

/* loaded from: classes14.dex */
public final class f0 extends x0.a1 {

    /* renamed from: c, reason: collision with root package name */
    public p0.e f532420c;

    /* renamed from: d, reason: collision with root package name */
    public int f532421d;

    public f0(p0.e list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        this.f532420c = list;
    }

    @Override // x0.a1
    public void a(x0.a1 value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        synchronized (x0.j0.f532432a) {
            this.f532420c = ((x0.f0) value).f532420c;
            this.f532421d = ((x0.f0) value).f532421d;
        }
    }

    @Override // x0.a1
    public x0.a1 b() {
        return new x0.f0(this.f532420c);
    }

    public final void c(p0.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<set-?>");
        this.f532420c = eVar;
    }
}

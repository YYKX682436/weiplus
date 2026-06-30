package f26;

/* loaded from: classes16.dex */
public final class a0 extends f26.q2 {

    /* renamed from: b, reason: collision with root package name */
    public final f26.q2 f340654b;

    /* renamed from: c, reason: collision with root package name */
    public final f26.q2 f340655c;

    public a0(f26.q2 q2Var, f26.q2 q2Var2, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f340654b = q2Var;
        this.f340655c = q2Var2;
    }

    @Override // f26.q2
    public boolean a() {
        return this.f340654b.a() || this.f340655c.a();
    }

    @Override // f26.q2
    public boolean b() {
        return this.f340654b.b() || this.f340655c.b();
    }

    @Override // f26.q2
    public p06.k c(p06.k annotations) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotations, "annotations");
        return this.f340655c.c(this.f340654b.c(annotations));
    }

    @Override // f26.q2
    public f26.l2 d(f26.o0 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        f26.l2 d17 = this.f340654b.d(key);
        return d17 == null ? this.f340655c.d(key) : d17;
    }

    @Override // f26.q2
    public f26.o0 f(f26.o0 topLevelType, f26.d3 position) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topLevelType, "topLevelType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(position, "position");
        return this.f340655c.f(this.f340654b.f(topLevelType, position), position);
    }
}

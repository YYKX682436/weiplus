package f26;

/* loaded from: classes16.dex */
public final class i0 extends f26.q2 {

    /* renamed from: b, reason: collision with root package name */
    public final o06.e2[] f340706b;

    /* renamed from: c, reason: collision with root package name */
    public final f26.l2[] f340707c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f340708d;

    public i0(o06.e2[] parameters, f26.l2[] arguments, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameters, "parameters");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arguments, "arguments");
        this.f340706b = parameters;
        this.f340707c = arguments;
        this.f340708d = z17;
    }

    @Override // f26.q2
    public boolean b() {
        return this.f340708d;
    }

    @Override // f26.q2
    public f26.l2 d(f26.o0 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        o06.j i17 = key.w0().i();
        o06.e2 e2Var = i17 instanceof o06.e2 ? (o06.e2) i17 : null;
        if (e2Var == null) {
            return null;
        }
        int mo150355x7498cf1c = e2Var.mo150355x7498cf1c();
        o06.e2[] e2VarArr = this.f340706b;
        if (mo150355x7498cf1c >= e2VarArr.length || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(e2VarArr[mo150355x7498cf1c].g(), e2Var.g())) {
            return null;
        }
        return this.f340707c[mo150355x7498cf1c];
    }

    @Override // f26.q2
    public boolean e() {
        return this.f340707c.length == 0;
    }
}

package f26;

/* loaded from: classes16.dex */
public abstract class e0 extends f26.c3 implements i26.g {

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f340686e;

    /* renamed from: f, reason: collision with root package name */
    public final f26.z0 f340687f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(f26.z0 lowerBound, f26.z0 upperBound) {
        super(null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lowerBound, "lowerBound");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(upperBound, "upperBound");
        this.f340686e = lowerBound;
        this.f340687f = upperBound;
    }

    public abstract f26.z0 D0();

    public abstract java.lang.String E0(q16.s sVar, q16.c0 c0Var);

    @Override // f26.o0
    public y16.s V() {
        return D0().V();
    }

    /* renamed from: toString */
    public java.lang.String mo128948x9616526c() {
        return q16.s.f441315c.v(this);
    }

    @Override // f26.o0
    public java.util.List u0() {
        return D0().u0();
    }

    @Override // f26.o0
    public f26.r1 v0() {
        return D0().v0();
    }

    @Override // f26.o0
    public f26.c2 w0() {
        return D0().w0();
    }

    @Override // f26.o0
    public boolean x0() {
        return D0().x0();
    }
}

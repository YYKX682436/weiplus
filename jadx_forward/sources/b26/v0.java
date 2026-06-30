package b26;

/* loaded from: classes15.dex */
public final class v0 extends b26.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final i16.o f99062d;

    /* renamed from: e, reason: collision with root package name */
    public final b26.v0 f99063e;

    /* renamed from: f, reason: collision with root package name */
    public final n16.b f99064f;

    /* renamed from: g, reason: collision with root package name */
    public final i16.n f99065g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f99066h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i16.o classProto, k16.g nameResolver, k16.k typeTable, o06.x1 x1Var, b26.v0 v0Var) {
        super(nameResolver, typeTable, x1Var, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classProto, "classProto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        this.f99062d = classProto;
        this.f99063e = v0Var;
        this.f99064f = b26.t0.a(nameResolver, classProto.f369176h);
        i16.n nVar = (i16.n) k16.f.f384971f.c(classProto.f369175g);
        this.f99065g = nVar == null ? i16.n.CLASS : nVar;
        java.lang.Boolean c17 = k16.f.f384972g.c(classProto.f369175g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        this.f99066h = c17.booleanValue();
    }

    @Override // b26.x0
    public n16.c a() {
        n16.c b17 = this.f99064f.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "asSingleFqName(...)");
        return b17;
    }
}

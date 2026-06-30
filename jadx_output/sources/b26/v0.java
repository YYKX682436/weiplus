package b26;

/* loaded from: classes15.dex */
public final class v0 extends b26.x0 {

    /* renamed from: d, reason: collision with root package name */
    public final i16.o f17529d;

    /* renamed from: e, reason: collision with root package name */
    public final b26.v0 f17530e;

    /* renamed from: f, reason: collision with root package name */
    public final n16.b f17531f;

    /* renamed from: g, reason: collision with root package name */
    public final i16.n f17532g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f17533h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(i16.o classProto, k16.g nameResolver, k16.k typeTable, o06.x1 x1Var, b26.v0 v0Var) {
        super(nameResolver, typeTable, x1Var, null);
        kotlin.jvm.internal.o.g(classProto, "classProto");
        kotlin.jvm.internal.o.g(nameResolver, "nameResolver");
        kotlin.jvm.internal.o.g(typeTable, "typeTable");
        this.f17529d = classProto;
        this.f17530e = v0Var;
        this.f17531f = b26.t0.a(nameResolver, classProto.f287643h);
        i16.n nVar = (i16.n) k16.f.f303438f.c(classProto.f287642g);
        this.f17532g = nVar == null ? i16.n.CLASS : nVar;
        java.lang.Boolean c17 = k16.f.f303439g.c(classProto.f287642g);
        kotlin.jvm.internal.o.f(c17, "get(...)");
        this.f17533h = c17.booleanValue();
    }

    @Override // b26.x0
    public n16.c a() {
        n16.c b17 = this.f17531f.b();
        kotlin.jvm.internal.o.f(b17, "asSingleFqName(...)");
        return b17;
    }
}

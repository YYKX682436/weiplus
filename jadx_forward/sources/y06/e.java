package y06;

/* loaded from: classes16.dex */
public class e implements p06.c, z06.j {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f540199e = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(y06.e.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};

    /* renamed from: a, reason: collision with root package name */
    public final n16.c f540200a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.x1 f540201b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.x f540202c;

    /* renamed from: d, reason: collision with root package name */
    public final e16.b f540203d;

    public e(a16.l c17, e16.a aVar, n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        this.f540200a = fqName;
        a16.d dVar = c17.f82182a;
        this.f540201b = aVar != null ? ((t06.m) dVar.f82157j).a(aVar) : o06.x1.f423537a;
        this.f540202c = ((e26.u) dVar.f82148a).b(new y06.d(c17, this));
        this.f540203d = aVar != null ? (e16.b) kz5.n0.Y(((u06.j) aVar).c()) : null;
    }

    @Override // p06.c
    public n16.c a() {
        return this.f540200a;
    }

    @Override // z06.j
    public boolean b() {
        return false;
    }

    @Override // p06.c
    public java.util.Map c() {
        return kz5.q0.f395534d;
    }

    @Override // p06.c
    /* renamed from: getSource */
    public o06.x1 mo9608x2fa78b11() {
        return this.f540201b;
    }

    @Override // p06.c
    /* renamed from: getType */
    public f26.o0 mo9609xfb85f7b0() {
        return (f26.z0) e26.b0.a(this.f540202c, this, f540199e[0]);
    }
}

package b16;

/* loaded from: classes16.dex */
public final class k implements p06.c, z06.j {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f98730h = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b16.k.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b16.k.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b16.k.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f98731a;

    /* renamed from: b, reason: collision with root package name */
    public final e16.a f98732b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.y f98733c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f98734d;

    /* renamed from: e, reason: collision with root package name */
    public final d16.a f98735e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.x f98736f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f98737g;

    public k(a16.l c17, e16.a javaAnnotation, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(javaAnnotation, "javaAnnotation");
        this.f98731a = c17;
        this.f98732b = javaAnnotation;
        a16.d dVar = c17.f82182a;
        this.f98733c = ((e26.u) dVar.f82148a).e(new b16.i(this));
        b16.j jVar = new b16.j(this);
        e26.c0 c0Var = dVar.f82148a;
        this.f98734d = ((e26.u) c0Var).b(jVar);
        this.f98735e = ((t06.m) dVar.f82157j).a(javaAnnotation);
        this.f98736f = ((e26.u) c0Var).b(new b16.h(this));
        this.f98737g = z17;
    }

    @Override // p06.c
    public n16.c a() {
        e26.y yVar = this.f98733c;
        f06.v p17 = f98730h[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        return (n16.c) ((e26.m) yVar).mo152xb9724478();
    }

    @Override // z06.j
    public boolean b() {
        return false;
    }

    @Override // p06.c
    public java.util.Map c() {
        return (java.util.Map) e26.b0.a(this.f98736f, this, f98730h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t16.g d(e16.b bVar) {
        t16.g xVar;
        f26.o0 h17;
        if (bVar instanceof e16.o) {
            return t16.i.f496148a.b(((u06.e0) ((e16.o) bVar)).f505031b, null);
        }
        if (bVar instanceof e16.m) {
            u06.c0 c0Var = (u06.c0) ((e16.m) bVar);
            java.lang.Class<?> cls = c0Var.f505026b.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cls);
            return new t16.k(u06.i.a(cls), n16.g.k(c0Var.f505026b.name()));
        }
        boolean z17 = bVar instanceof e16.e;
        a16.l lVar = this.f98731a;
        if (z17) {
            e16.b bVar2 = (e16.e) bVar;
            n16.g gVar = ((u06.k) bVar2).f505045a;
            if (gVar == null) {
                gVar = x06.p0.f532818b;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            java.util.List a17 = ((u06.n) bVar2).a();
            f26.z0 z0Var = (f26.z0) e26.b0.a(this.f98734d, this, f98730h[1]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(z0Var, "<get-type>(...)");
            if (f26.s0.a(z0Var)) {
                return null;
            }
            o06.g d17 = v16.f.d(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            o06.p b17 = y06.c.b(gVar, d17);
            if (b17 == null || (h17 = ((r06.t1) b17).mo132802xfb85f7b0()) == null) {
                h17 = lVar.f82182a.f82162o.h().h(f26.d3.f340676f, h26.m.c(h26.l.f359886J, new java.lang.String[0]));
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(a17, 10));
            java.util.Iterator it = ((java.util.ArrayList) a17).iterator();
            while (it.hasNext()) {
                t16.g d18 = d((e16.b) it.next());
                if (d18 == null) {
                    d18 = new t16.z();
                }
                arrayList.add(d18);
            }
            xVar = new t16.d0(arrayList, h17);
        } else {
            if (bVar instanceof e16.c) {
                return new t16.a(new b16.k(lVar, new u06.j(((u06.l) ((e16.c) bVar)).f505046b), false));
            }
            if (!(bVar instanceof e16.h)) {
                return null;
            }
            java.lang.Class type = ((u06.y) ((e16.h) bVar)).f505067b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
            f26.o0 e17 = lVar.f82186e.e(type.isPrimitive() ? new u06.i0(type) : ((type instanceof java.lang.reflect.GenericArrayType) || type.isArray()) ? new u06.o(type) : type instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) type) : new u06.z(type), c16.b.a(f26.x2.f340769e, false, false, null, 7, null));
            if (f26.s0.a(e17)) {
                return null;
            }
            f26.o0 o0Var = e17;
            int i17 = 0;
            while (l06.o.z(o0Var)) {
                o0Var = ((f26.l2) kz5.n0.z0(o0Var.u0())).mo128949xfb85f7b0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o0Var, "getType(...)");
                i17++;
            }
            o06.j i18 = o0Var.w0().i();
            if (i18 instanceof o06.g) {
                n16.b f17 = v16.f.f(i18);
                if (f17 == null) {
                    return new t16.x(new t16.u(e17));
                }
                xVar = new t16.x(f17, i17);
            } else {
                if (!(i18 instanceof o06.e2)) {
                    return null;
                }
                xVar = new t16.x(n16.b.l(l06.w.f396451b.h()), 0);
            }
        }
        return xVar;
    }

    @Override // p06.c
    /* renamed from: getSource */
    public o06.x1 mo9608x2fa78b11() {
        return this.f98735e;
    }

    @Override // p06.c
    /* renamed from: getType */
    public f26.o0 mo9609xfb85f7b0() {
        return (f26.z0) e26.b0.a(this.f98734d, this, f98730h[1]);
    }

    /* renamed from: toString */
    public java.lang.String m9610x9616526c() {
        return q16.s.r(q16.s.f441313a, this, null, 2, null);
    }
}

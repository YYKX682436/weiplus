package b16;

/* loaded from: classes16.dex */
public final class k implements p06.c, z06.j {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f17197h = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.k.class), "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.k.class), "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.k.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f17198a;

    /* renamed from: b, reason: collision with root package name */
    public final e16.a f17199b;

    /* renamed from: c, reason: collision with root package name */
    public final e26.y f17200c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f17201d;

    /* renamed from: e, reason: collision with root package name */
    public final d16.a f17202e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.x f17203f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f17204g;

    public k(a16.l c17, e16.a javaAnnotation, boolean z17) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(javaAnnotation, "javaAnnotation");
        this.f17198a = c17;
        this.f17199b = javaAnnotation;
        a16.d dVar = c17.f649a;
        this.f17200c = ((e26.u) dVar.f615a).e(new b16.i(this));
        b16.j jVar = new b16.j(this);
        e26.c0 c0Var = dVar.f615a;
        this.f17201d = ((e26.u) c0Var).b(jVar);
        this.f17202e = ((t06.m) dVar.f624j).a(javaAnnotation);
        this.f17203f = ((e26.u) c0Var).b(new b16.h(this));
        this.f17204g = z17;
    }

    @Override // p06.c
    public n16.c a() {
        e26.y yVar = this.f17200c;
        f06.v p17 = f17197h[0];
        kotlin.jvm.internal.o.g(yVar, "<this>");
        kotlin.jvm.internal.o.g(p17, "p");
        return (n16.c) ((e26.m) yVar).invoke();
    }

    @Override // z06.j
    public boolean b() {
        return false;
    }

    @Override // p06.c
    public java.util.Map c() {
        return (java.util.Map) e26.b0.a(this.f17203f, this, f17197h[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final t16.g d(e16.b bVar) {
        t16.g xVar;
        f26.o0 h17;
        if (bVar instanceof e16.o) {
            return t16.i.f414615a.b(((u06.e0) ((e16.o) bVar)).f423498b, null);
        }
        if (bVar instanceof e16.m) {
            u06.c0 c0Var = (u06.c0) ((e16.m) bVar);
            java.lang.Class<?> cls = c0Var.f423493b.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            kotlin.jvm.internal.o.d(cls);
            return new t16.k(u06.i.a(cls), n16.g.k(c0Var.f423493b.name()));
        }
        boolean z17 = bVar instanceof e16.e;
        a16.l lVar = this.f17198a;
        if (z17) {
            e16.b bVar2 = (e16.e) bVar;
            n16.g gVar = ((u06.k) bVar2).f423512a;
            if (gVar == null) {
                gVar = x06.p0.f451285b;
            }
            kotlin.jvm.internal.o.d(gVar);
            java.util.List a17 = ((u06.n) bVar2).a();
            f26.z0 z0Var = (f26.z0) e26.b0.a(this.f17201d, this, f17197h[1]);
            kotlin.jvm.internal.o.f(z0Var, "<get-type>(...)");
            if (f26.s0.a(z0Var)) {
                return null;
            }
            o06.g d17 = v16.f.d(this);
            kotlin.jvm.internal.o.d(d17);
            o06.p b17 = y06.c.b(gVar, d17);
            if (b17 == null || (h17 = ((r06.t1) b17).getType()) == null) {
                h17 = lVar.f649a.f629o.h().h(f26.d3.f259143f, h26.m.c(h26.l.f278353J, new java.lang.String[0]));
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
                return new t16.a(new b16.k(lVar, new u06.j(((u06.l) ((e16.c) bVar)).f423513b), false));
            }
            if (!(bVar instanceof e16.h)) {
                return null;
            }
            java.lang.Class type = ((u06.y) ((e16.h) bVar)).f423534b;
            kotlin.jvm.internal.o.g(type, "type");
            f26.o0 e17 = lVar.f653e.e(type.isPrimitive() ? new u06.i0(type) : ((type instanceof java.lang.reflect.GenericArrayType) || type.isArray()) ? new u06.o(type) : type instanceof java.lang.reflect.WildcardType ? new u06.n0((java.lang.reflect.WildcardType) type) : new u06.z(type), c16.b.a(f26.x2.f259236e, false, false, null, 7, null));
            if (f26.s0.a(e17)) {
                return null;
            }
            f26.o0 o0Var = e17;
            int i17 = 0;
            while (l06.o.z(o0Var)) {
                o0Var = ((f26.l2) kz5.n0.z0(o0Var.u0())).getType();
                kotlin.jvm.internal.o.f(o0Var, "getType(...)");
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
                xVar = new t16.x(n16.b.l(l06.w.f314918b.h()), 0);
            }
        }
        return xVar;
    }

    @Override // p06.c
    public o06.x1 getSource() {
        return this.f17202e;
    }

    @Override // p06.c
    public f26.o0 getType() {
        return (f26.z0) e26.b0.a(this.f17201d, this, f17197h[1]);
    }

    public java.lang.String toString() {
        return q16.s.r(q16.s.f359780a, this, null, 2, null);
    }
}

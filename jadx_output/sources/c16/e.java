package c16;

/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f37959a;

    /* renamed from: b, reason: collision with root package name */
    public final a16.r f37960b;

    /* renamed from: c, reason: collision with root package name */
    public final c16.g f37961c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.k2 f37962d;

    public e(a16.l c17, a16.r typeParameterResolver) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(typeParameterResolver, "typeParameterResolver");
        this.f37959a = c17;
        this.f37960b = typeParameterResolver;
        c16.g gVar = new c16.g();
        this.f37961c = gVar;
        this.f37962d = new f26.k2(gVar, null, 2, null);
    }

    public static final h26.j d(e16.j jVar) {
        return h26.m.c(h26.l.f278354f, ((u06.z) jVar).f423535a.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:173:0x0146, code lost:
    
        if (r2 != false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01f6, code lost:
    
        if ((!r0.isEmpty()) != false) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x01a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x028e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f26.z0 a(e16.j r29, c16.a r30, f26.z0 r31) {
        /*
            Method dump skipped, instructions count: 1137
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c16.e.a(e16.j, c16.a, f26.z0):f26.z0");
    }

    public final f26.c2 b(e16.j jVar) {
        u06.z zVar = (u06.z) jVar;
        zVar.getClass();
        throw new java.lang.UnsupportedOperationException("Type not found: " + zVar.f423535a);
    }

    public final f26.o0 c(e16.f arrayType, c16.a attr, boolean z17) {
        kotlin.jvm.internal.o.g(arrayType, "arrayType");
        kotlin.jvm.internal.o.g(attr, "attr");
        e16.u uVar = ((u06.o) arrayType).f423523b;
        l06.r rVar = null;
        e16.s sVar = uVar instanceof e16.s ? (e16.s) uVar : null;
        if (sVar != null) {
            java.lang.Class cls = java.lang.Void.TYPE;
            java.lang.Class cls2 = ((u06.i0) sVar).f423508a;
            if (!kotlin.jvm.internal.o.b(cls2, cls)) {
                rVar = w16.e.b(cls2.getName()).i();
            }
        }
        a16.l lVar = this.f37959a;
        a16.h hVar = new a16.h(lVar, arrayType, true);
        boolean z18 = attr.f37947d;
        a16.d dVar = lVar.f649a;
        if (rVar == null) {
            f26.o0 e17 = e(uVar, c16.b.a(f26.x2.f259236e, z18, false, null, 6, null));
            if (z18) {
                return dVar.f629o.h().i(z17 ? f26.d3.f259145h : f26.d3.f259143f, e17, hVar);
            }
            return f26.r0.a(dVar.f629o.h().i(f26.d3.f259143f, e17, hVar), dVar.f629o.h().i(f26.d3.f259145h, e17, hVar).A0(true));
        }
        f26.z0 r17 = dVar.f629o.h().r(rVar);
        kotlin.jvm.internal.o.d(r17);
        f26.o0 k17 = j26.c.k(r17, new p06.r(r17.getAnnotations(), hVar));
        kotlin.jvm.internal.o.e(k17, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        f26.z0 z0Var = (f26.z0) k17;
        return z18 ? z0Var : f26.r0.a(z0Var, z0Var.A0(true));
    }

    public final f26.o0 e(e16.u uVar, c16.a attr) {
        f26.z0 a17;
        kotlin.jvm.internal.o.g(attr, "attr");
        boolean z17 = uVar instanceof e16.s;
        a16.l lVar = this.f37959a;
        if (z17) {
            java.lang.Class cls = java.lang.Void.TYPE;
            java.lang.Class cls2 = ((u06.i0) ((e16.s) uVar)).f423508a;
            l06.r i17 = kotlin.jvm.internal.o.b(cls2, cls) ? null : w16.e.b(cls2.getName()).i();
            f26.z0 t17 = i17 != null ? lVar.f649a.f629o.h().t(i17) : lVar.f649a.f629o.h().x();
            kotlin.jvm.internal.o.d(t17);
            return t17;
        }
        boolean z18 = false;
        if (uVar instanceof e16.j) {
            e16.j jVar = (e16.j) uVar;
            if (!attr.f37947d) {
                if (attr.f37944a != f26.x2.f259235d) {
                    z18 = true;
                }
            }
            u06.z zVar = (u06.z) jVar;
            boolean e17 = zVar.e();
            if (!e17 && !z18) {
                f26.z0 a18 = a(zVar, attr, null);
                return a18 != null ? a18 : d(zVar);
            }
            f26.z0 a19 = a(zVar, attr.b(c16.c.f37952f), null);
            if (a19 != null && (a17 = a(zVar, attr.b(c16.c.f37951e), a19)) != null) {
                return e17 ? new c16.k(a19, a17) : f26.r0.a(a19, a17);
            }
            return d(zVar);
        }
        if (uVar instanceof e16.f) {
            return c((e16.f) uVar, attr, false);
        }
        if (uVar instanceof e16.y) {
            e16.u d17 = ((u06.n0) ((e16.y) uVar)).d();
            if (d17 != null) {
                return e(d17, attr);
            }
            f26.z0 n17 = lVar.f649a.f629o.h().n();
            kotlin.jvm.internal.o.f(n17, "getDefaultBound(...)");
            return n17;
        }
        if (uVar == null) {
            f26.z0 n18 = lVar.f649a.f629o.h().n();
            kotlin.jvm.internal.o.f(n18, "getDefaultBound(...)");
            return n18;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type: " + uVar);
    }
}

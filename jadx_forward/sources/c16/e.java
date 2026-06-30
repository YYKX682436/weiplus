package c16;

/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final a16.l f119492a;

    /* renamed from: b, reason: collision with root package name */
    public final a16.r f119493b;

    /* renamed from: c, reason: collision with root package name */
    public final c16.g f119494c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.k2 f119495d;

    public e(a16.l c17, a16.r typeParameterResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeParameterResolver, "typeParameterResolver");
        this.f119492a = c17;
        this.f119493b = typeParameterResolver;
        c16.g gVar = new c16.g();
        this.f119494c = gVar;
        this.f119495d = new f26.k2(gVar, null, 2, null);
    }

    public static final h26.j d(e16.j jVar) {
        return h26.m.c(h26.l.f359887f, ((u06.z) jVar).f505068a.toString());
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
        throw new java.lang.UnsupportedOperationException("Type not found: " + zVar.f505068a);
    }

    public final f26.o0 c(e16.f arrayType, c16.a attr, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(arrayType, "arrayType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attr, "attr");
        e16.u uVar = ((u06.o) arrayType).f505056b;
        l06.r rVar = null;
        e16.s sVar = uVar instanceof e16.s ? (e16.s) uVar : null;
        if (sVar != null) {
            java.lang.Class cls = java.lang.Void.TYPE;
            java.lang.Class cls2 = ((u06.i0) sVar).f505041a;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls)) {
                rVar = w16.e.b(cls2.getName()).i();
            }
        }
        a16.l lVar = this.f119492a;
        a16.h hVar = new a16.h(lVar, arrayType, true);
        boolean z18 = attr.f119480d;
        a16.d dVar = lVar.f82182a;
        if (rVar == null) {
            f26.o0 e17 = e(uVar, c16.b.a(f26.x2.f340769e, z18, false, null, 6, null));
            if (z18) {
                return dVar.f82162o.h().i(z17 ? f26.d3.f340678h : f26.d3.f340676f, e17, hVar);
            }
            return f26.r0.a(dVar.f82162o.h().i(f26.d3.f340676f, e17, hVar), dVar.f82162o.h().i(f26.d3.f340678h, e17, hVar).A0(true));
        }
        f26.z0 r17 = dVar.f82162o.h().r(rVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r17);
        f26.o0 k17 = j26.c.k(r17, new p06.r(r17.mo9601xa083c1ee(), hVar));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(k17, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        f26.z0 z0Var = (f26.z0) k17;
        return z18 ? z0Var : f26.r0.a(z0Var, z0Var.A0(true));
    }

    public final f26.o0 e(e16.u uVar, c16.a attr) {
        f26.z0 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attr, "attr");
        boolean z17 = uVar instanceof e16.s;
        a16.l lVar = this.f119492a;
        if (z17) {
            java.lang.Class cls = java.lang.Void.TYPE;
            java.lang.Class cls2 = ((u06.i0) ((e16.s) uVar)).f505041a;
            l06.r i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cls2, cls) ? null : w16.e.b(cls2.getName()).i();
            f26.z0 t17 = i17 != null ? lVar.f82182a.f82162o.h().t(i17) : lVar.f82182a.f82162o.h().x();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t17);
            return t17;
        }
        boolean z18 = false;
        if (uVar instanceof e16.j) {
            e16.j jVar = (e16.j) uVar;
            if (!attr.f119480d) {
                if (attr.f119477a != f26.x2.f340768d) {
                    z18 = true;
                }
            }
            u06.z zVar = (u06.z) jVar;
            boolean e17 = zVar.e();
            if (!e17 && !z18) {
                f26.z0 a18 = a(zVar, attr, null);
                return a18 != null ? a18 : d(zVar);
            }
            f26.z0 a19 = a(zVar, attr.b(c16.c.f119485f), null);
            if (a19 != null && (a17 = a(zVar, attr.b(c16.c.f119484e), a19)) != null) {
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
            f26.z0 n17 = lVar.f82182a.f82162o.h().n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "getDefaultBound(...)");
            return n17;
        }
        if (uVar == null) {
            f26.z0 n18 = lVar.f82182a.f82162o.h().n();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n18, "getDefaultBound(...)");
            return n18;
        }
        throw new java.lang.UnsupportedOperationException("Unsupported type: " + uVar);
    }
}

package g16;

/* loaded from: classes15.dex */
public abstract class l implements b26.h {

    /* renamed from: b, reason: collision with root package name */
    public static final g16.i f349168b = new g16.i(null);

    /* renamed from: a, reason: collision with root package name */
    public final g16.k0 f349169a;

    public l(g16.k0 kotlinClassFinder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinClassFinder, "kotlinClassFinder");
        this.f349169a = kotlinClassFinder;
    }

    public static /* synthetic */ java.util.List m(g16.l lVar, b26.x0 x0Var, g16.u0 u0Var, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19, int i17, java.lang.Object obj) {
        if (obj == null) {
            return lVar.l(x0Var, u0Var, (i17 & 4) != 0 ? false : z17, (i17 & 8) != 0 ? false : z18, (i17 & 16) != 0 ? null : bool, (i17 & 32) != 0 ? false : z19);
        }
        throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findClassAndLoadMemberAnnotations");
    }

    public static /* synthetic */ g16.u0 o(g16.l lVar, p16.h0 h0Var, k16.g gVar, k16.k kVar, b26.c cVar, boolean z17, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getCallableSignature");
        }
        if ((i17 & 16) != 0) {
            z17 = false;
        }
        return lVar.n(h0Var, gVar, kVar, cVar, z17);
    }

    @Override // b26.h
    public java.util.List a(b26.x0 container, i16.u0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        return s(container, proto, g16.j.f349164f);
    }

    @Override // b26.h
    public java.util.List b(b26.x0 container, p16.h0 proto, b26.c kind) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        if (kind == b26.c.PROPERTY) {
            return s(container, (i16.u0) proto, g16.j.f349162d);
        }
        g16.u0 o17 = o(this, proto, container.f99070a, container.f99071b, kind, false, 16, null);
        return o17 == null ? kz5.p0.f395529d : m(this, container, o17, false, false, null, false, 60, null);
    }

    @Override // b26.h
    public java.util.List c(b26.x0 container, p16.h0 proto, b26.c kind) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        g16.u0 o17 = o(this, proto, container.f99070a, container.f99071b, kind, false, 16, null);
        if (o17 == null) {
            return kz5.p0.f395529d;
        }
        return m(this, container, new g16.u0(o17.f349200a + "@0", null), false, false, null, false, 60, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        r1 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0068, code lost:
    
        if (r12 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x007c, code lost:
    
        if (r12.f99066h != false) goto L45;
     */
    @Override // b26.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d(b26.x0 r11, p16.h0 r12, b26.c r13, int r14, i16.y1 r15) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g16.l.d(b26.x0, p16.h0, b26.c, int, i16.y1):java.util.List");
    }

    @Override // b26.h
    public java.util.List e(i16.s1 proto, k16.g nameResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        java.lang.Object f17 = proto.f(l16.r.f396632h);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getExtension(...)");
        java.lang.Iterable<i16.k> iterable = (java.lang.Iterable) f17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        for (i16.k kVar : iterable) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            arrayList.add(((g16.t) this).f349197f.a(kVar, nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List f(b26.v0 container) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        o06.x1 x1Var = container.f99072c;
        g16.s0 s0Var = x1Var instanceof g16.s0 ? (g16.s0) x1Var : null;
        g16.q0 q0Var = s0Var != null ? s0Var.f349194b : null;
        if (q0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(1);
            t06.c.f496066a.b(((t06.g) q0Var).f496069a, new g16.k(this, arrayList));
            return arrayList;
        }
        throw new java.lang.IllegalStateException(("Class for loading annotations is not found: " + container.a()).toString());
    }

    @Override // b26.h
    public java.util.List h(b26.x0 container, i16.u0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        return s(container, proto, g16.j.f349163e);
    }

    @Override // b26.h
    public java.util.List j(i16.l1 proto, k16.g nameResolver) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        java.lang.Object f17 = proto.f(l16.r.f396630f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "getExtension(...)");
        java.lang.Iterable<i16.k> iterable = (java.lang.Iterable) f17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(iterable, 10));
        for (i16.k kVar : iterable) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(kVar);
            arrayList.add(((g16.t) this).f349197f.a(kVar, nameResolver));
        }
        return arrayList;
    }

    @Override // b26.h
    public java.util.List k(b26.x0 container, i16.c0 proto) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        java.lang.String name = container.f99070a.mo141776x2fec8307(proto.f368911g);
        java.lang.String c17 = ((b26.v0) container).f99064f.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "asString(...)");
        java.lang.String desc = m16.b.b(c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        return m(this, container, new g16.u0(name + '#' + desc, null), false, false, null, false, 60, null);
    }

    public final java.util.List l(b26.x0 x0Var, g16.u0 u0Var, boolean z17, boolean z18, java.lang.Boolean bool, boolean z19) {
        java.util.List list;
        g16.q0 a17 = f349168b.a(x0Var, z17, z18, bool, z19, this.f349169a, ((g16.t) this).f349198g);
        if (a17 == null) {
            if (x0Var instanceof b26.v0) {
                o06.x1 x1Var = ((b26.v0) x0Var).f99072c;
                g16.s0 s0Var = x1Var instanceof g16.s0 ? (g16.s0) x1Var : null;
                if (s0Var != null) {
                    a17 = s0Var.f349194b;
                }
            }
            a17 = null;
        }
        kz5.p0 p0Var = kz5.p0.f395529d;
        return (a17 == null || (list = (java.util.List) ((g16.n) ((e26.r) ((g16.g) this).f349159c).mo146xb9724478(a17)).f349170a.get(u0Var)) == null) ? p0Var : list;
    }

    public final g16.u0 n(p16.h0 proto, k16.g nameResolver, k16.k typeTable, b26.c kind, boolean z17) {
        g16.u0 u0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(proto, "proto");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameResolver, "nameResolver");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeTable, "typeTable");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kind, "kind");
        boolean z18 = proto instanceof i16.r;
        g16.t0 t0Var = g16.u0.f349199b;
        if (z18) {
            m16.e a17 = m16.j.f404432a.a((i16.r) proto, nameResolver, typeTable);
            if (a17 == null) {
                return null;
            }
            return t0Var.a(a17);
        }
        if (proto instanceof i16.j0) {
            m16.e c17 = m16.j.f404432a.c((i16.j0) proto, nameResolver, typeTable);
            if (c17 == null) {
                return null;
            }
            return t0Var.a(c17);
        }
        if (!(proto instanceof i16.u0)) {
            return null;
        }
        p16.u propertySignature = l16.r.f396628d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(propertySignature, "propertySignature");
        l16.j jVar = (l16.j) k16.i.a((p16.s) proto, propertySignature);
        if (jVar == null) {
            return null;
        }
        int ordinal = kind.ordinal();
        if (ordinal == 1) {
            return g16.m.a((i16.u0) proto, nameResolver, typeTable, true, true, z17);
        }
        if (ordinal == 2) {
            if (!((jVar.f396580e & 4) == 4)) {
                return null;
            }
            l16.g gVar = jVar.f396583h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "getGetter(...)");
            java.lang.String name = nameResolver.mo141776x2fec8307(gVar.f396567f);
            java.lang.String desc = nameResolver.mo141776x2fec8307(gVar.f396568g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
            u0Var = new g16.u0(name.concat(desc), null);
        } else {
            if (ordinal != 3) {
                return null;
            }
            if (!((jVar.f396580e & 8) == 8)) {
                return null;
            }
            l16.g gVar2 = jVar.f396584i;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "getSetter(...)");
            java.lang.String name2 = nameResolver.mo141776x2fec8307(gVar2.f396567f);
            java.lang.String desc2 = nameResolver.mo141776x2fec8307(gVar2.f396568g);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name2, "name");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc2, "desc");
            u0Var = new g16.u0(name2.concat(desc2), null);
        }
        return u0Var;
    }

    public final boolean p(n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        if (classId.g() == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(classId.j().h(), "Container")) {
            return false;
        }
        g16.q0 a17 = g16.l0.a(this.f349169a, classId, ((g16.t) this).f349198g);
        if (a17 == null) {
            return false;
        }
        java.util.Set set = k06.a.f384693a;
        java.lang.Class klass = ((t06.g) a17).f496069a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(klass, "klass");
        java.lang.annotation.Annotation[] declaredAnnotations = klass.getDeclaredAnnotations();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredAnnotations, "getDeclaredAnnotations(...)");
        boolean z17 = false;
        for (java.lang.annotation.Annotation annotation : declaredAnnotations) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
            n16.b a18 = u06.i.a(xz5.a.b(xz5.a.a(annotation)));
            new t06.b(annotation);
            n16.c cVar = x06.o0.f532815a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a18, x06.o0.f532816b)) {
                z17 = true;
            }
        }
        return z17;
    }

    public abstract g16.m0 q(n16.b bVar, o06.x1 x1Var, java.util.List list);

    public final g16.m0 r(n16.b annotationClassId, o06.x1 source, java.util.List result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotationClassId, "annotationClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.Set set = k06.a.f384693a;
        if (k06.a.f384693a.contains(annotationClassId)) {
            return null;
        }
        return q(annotationClassId, source, result);
    }

    public final java.util.List s(b26.x0 x0Var, i16.u0 u0Var, g16.j jVar) {
        java.lang.Boolean c17 = k16.f.B.c(u0Var.f369296g);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "get(...)");
        boolean booleanValue = c17.booleanValue();
        boolean d17 = m16.j.d(u0Var);
        g16.j jVar2 = g16.j.f349162d;
        kz5.p0 p0Var = kz5.p0.f395529d;
        if (jVar == jVar2) {
            g16.u0 b17 = g16.m.b(u0Var, x0Var.f99070a, x0Var.f99071b, false, true, false, 40, null);
            return b17 == null ? p0Var : m(this, x0Var, b17, true, false, java.lang.Boolean.valueOf(booleanValue), d17, 8, null);
        }
        g16.u0 b18 = g16.m.b(u0Var, x0Var.f99070a, x0Var.f99071b, true, false, false, 48, null);
        if (b18 == null) {
            return p0Var;
        }
        return r26.n0.D(b18.f349200a, "$delegate", false, 2, null) != (jVar == g16.j.f349164f) ? p0Var : l(x0Var, b18, true, true, java.lang.Boolean.valueOf(booleanValue), d17);
    }
}

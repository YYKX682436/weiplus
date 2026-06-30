package b16;

/* loaded from: classes16.dex */
public abstract class f1 extends y16.t {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f98695m = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b16.f1.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b16.f1.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(b16.f1.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    public final a16.l f98696b;

    /* renamed from: c, reason: collision with root package name */
    public final b16.f1 f98697c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f98698d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f98699e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.v f98700f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.w f98701g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.v f98702h;

    /* renamed from: i, reason: collision with root package name */
    public final e26.x f98703i;

    /* renamed from: j, reason: collision with root package name */
    public final e26.x f98704j;

    /* renamed from: k, reason: collision with root package name */
    public final e26.x f98705k;

    /* renamed from: l, reason: collision with root package name */
    public final e26.v f98706l;

    public f1(a16.l c17, b16.f1 f1Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        this.f98696b = c17;
        this.f98697c = f1Var;
        a16.d dVar = c17.f82182a;
        e26.c0 c0Var = dVar.f82148a;
        b16.t0 t0Var = new b16.t0(this);
        kz5.p0 p0Var = kz5.p0.f395529d;
        e26.u uVar = (e26.u) c0Var;
        uVar.getClass();
        this.f98698d = new e26.e(uVar, uVar, t0Var, p0Var);
        b16.x0 x0Var = new b16.x0(this);
        e26.c0 c0Var2 = dVar.f82148a;
        this.f98699e = ((e26.u) c0Var2).b(x0Var);
        this.f98700f = ((e26.u) c0Var2).c(new b16.w0(this));
        this.f98701g = ((e26.u) c0Var2).d(new b16.v0(this));
        this.f98702h = ((e26.u) c0Var2).c(new b16.z0(this));
        this.f98703i = ((e26.u) c0Var2).b(new b16.y0(this));
        this.f98704j = ((e26.u) c0Var2).b(new b16.b1(this));
        this.f98705k = ((e26.u) c0Var2).b(new b16.u0(this));
        this.f98706l = ((e26.u) c0Var2).c(new b16.a1(this));
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        return (java.util.Set) e26.b0.a(this.f98703i, this, f98695m[0]);
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return !a().contains(name) ? kz5.p0.f395529d : (java.util.Collection) ((e26.r) this.f98702h).mo146xb9724478(name);
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return !g().contains(name) ? kz5.p0.f395529d : (java.util.Collection) ((e26.r) this.f98706l).mo146xb9724478(name);
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        return (java.util.Set) e26.b0.a(this.f98705k, this, f98695m[2]);
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return (java.util.Collection) ((e26.o) this.f98698d).mo152xb9724478();
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        return (java.util.Set) e26.b0.a(this.f98704j, this, f98695m[1]);
    }

    public abstract java.util.Set h(y16.i iVar, yz5.l lVar);

    public abstract java.util.Set i(y16.i iVar, yz5.l lVar);

    public void j(java.util.Collection result, n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
    }

    public abstract b16.d k();

    /* JADX WARN: Multi-variable type inference failed */
    public final f26.o0 l(e16.q method, a16.l c17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        java.lang.Class<?> declaringClass = ((u06.f0) method).c().getDeclaringClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaringClass, "getDeclaringClass(...)");
        c16.a a17 = c16.b.a(f26.x2.f340769e, declaringClass.isAnnotation(), false, null, 6, null);
        return c17.f82186e.e(((u06.g0) method).g(), a17);
    }

    public abstract void m(java.util.Collection collection, n16.g gVar);

    public abstract void n(n16.g gVar, java.util.Collection collection);

    public abstract java.util.Set o(y16.i iVar, yz5.l lVar);

    public abstract o06.r1 p();

    public abstract o06.m q();

    public boolean r(z06.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hVar, "<this>");
        return true;
    }

    public abstract b16.r0 s(e16.q qVar, java.util.List list, f26.o0 o0Var, java.util.List list2);

    /* JADX WARN: Multi-variable type inference failed */
    public final z06.h t(e16.q method) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        a16.l lVar = this.f98696b;
        u06.f0 f0Var = (u06.f0) method;
        z06.h I0 = z06.h.I0(q(), a16.i.a(lVar, method), f0Var.d(), ((t06.m) lVar.f82182a.f82157j).a(method), ((b16.d) ((e26.o) this.f98699e).mo152xb9724478()).e(f0Var.d()) != null && ((java.util.ArrayList) ((u06.g0) method).h()).isEmpty());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<this>");
        a16.l lVar2 = new a16.l(lVar.f82182a, new a16.n(lVar, I0, method, 0), lVar.f82184c);
        u06.g0 g0Var = (u06.g0) method;
        java.util.List mo126782xb121b9ba = g0Var.mo126782xb121b9ba();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(mo126782xb121b9ba, 10));
        java.util.Iterator it = ((java.util.ArrayList) mo126782xb121b9ba).iterator();
        while (it.hasNext()) {
            o06.e2 a17 = lVar2.f82183b.a((e16.v) it.next());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
            arrayList.add(a17);
        }
        b16.s0 u17 = u(lVar2, I0, g0Var.h());
        f26.o0 l17 = l(method, lVar2);
        java.util.List list = u17.f98784a;
        b16.r0 s17 = s(method, arrayList, l17, list);
        f26.o0 o0Var = s17.f98778b;
        I0.H0(o0Var != null ? r16.h.h(I0, o0Var, p06.i.f432298a) : null, p(), kz5.p0.f395529d, s17.f98780d, s17.f98779c, s17.f98777a, o06.t0.f423517d.a(false, java.lang.reflect.Modifier.isAbstract(f0Var.c().getModifiers()), !java.lang.reflect.Modifier.isFinal(f0Var.c().getModifiers())), x06.h1.a(f0Var.f()), s17.f98778b != null ? kz5.b1.e(new jz5.l(z06.h.M, kz5.n0.X(list))) : kz5.q0.f395534d);
        I0.J0(s17.f98781e, u17.f98785b);
        if (!(!s17.f98782f.isEmpty())) {
            return I0;
        }
        ((y06.s) lVar2.f82182a.f82152e).getClass();
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }

    /* renamed from: toString */
    public java.lang.String mo9593x9616526c() {
        return "Lazy scope for " + q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b16.s0 u(a16.l c17, o06.n0 function, java.util.List jValueParameters) {
        jz5.l lVar;
        boolean z17;
        n16.g gVar;
        n16.g k17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jValueParameters, "jValueParameters");
        java.lang.Iterable Z0 = kz5.n0.Z0(jValueParameters);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(Z0, 10));
        java.util.Iterator it = ((kz5.v0) Z0).iterator();
        boolean z18 = false;
        while (true) {
            kz5.w0 w0Var = (kz5.w0) it;
            if (!w0Var.hasNext()) {
                return new b16.s0(kz5.n0.S0(arrayList), z18);
            }
            kz5.u0 u0Var = (kz5.u0) w0Var.next();
            int i17 = u0Var.f395548a;
            e16.x xVar = (e16.x) u0Var.f395549b;
            p06.k a17 = a16.i.a(c17, xVar);
            c16.a a18 = c16.b.a(f26.x2.f340769e, false, false, null, 7, null);
            u06.m0 m0Var = (u06.m0) xVar;
            e16.u uVar = m0Var.f505048a;
            boolean z19 = m0Var.f505051d;
            c16.e eVar = c17.f82186e;
            a16.d dVar = c17.f82182a;
            if (z19) {
                e16.f fVar = uVar instanceof e16.f ? (e16.f) uVar : null;
                if (fVar == null) {
                    throw new java.lang.AssertionError("Vararg parameter should be an array: " + xVar);
                }
                f26.o0 c18 = eVar.c(fVar, a18, true);
                lVar = new jz5.l(c18, dVar.f82162o.h().g(c18));
            } else {
                lVar = new jz5.l(eVar.e(uVar, a18), null);
            }
            f26.o0 o0Var = (f26.o0) lVar.f384366d;
            f26.o0 o0Var2 = (f26.o0) lVar.f384367e;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r06.v) function).mo132800xfb82e301().h(), "equals") && jValueParameters.size() == 1 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.f82162o.h().p(), o0Var)) {
                k17 = n16.g.k("other");
            } else {
                java.lang.String str = m0Var.f505050c;
                n16.g j17 = str != null ? n16.g.j(str) : null;
                if (j17 == null) {
                    z18 = true;
                }
                if (j17 == null) {
                    k17 = n16.g.k("p" + i17);
                } else {
                    z17 = z18;
                    gVar = j17;
                    arrayList.add(new r06.s1(function, null, i17, a17, gVar, o0Var, false, false, false, o0Var2, ((t06.m) dVar.f82157j).a(xVar)));
                    z18 = z17;
                }
            }
            z17 = z18;
            gVar = k17;
            arrayList.add(new r06.s1(function, null, i17, a17, gVar, o0Var, false, false, false, o0Var2, ((t06.m) dVar.f82157j).a(xVar)));
            z18 = z17;
        }
    }
}

package b16;

/* loaded from: classes16.dex */
public abstract class f1 extends y16.t {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f17162m = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.f1.class), "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.f1.class), "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;")), kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.f1.class), "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    public final a16.l f17163b;

    /* renamed from: c, reason: collision with root package name */
    public final b16.f1 f17164c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f17165d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f17166e;

    /* renamed from: f, reason: collision with root package name */
    public final e26.v f17167f;

    /* renamed from: g, reason: collision with root package name */
    public final e26.w f17168g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.v f17169h;

    /* renamed from: i, reason: collision with root package name */
    public final e26.x f17170i;

    /* renamed from: j, reason: collision with root package name */
    public final e26.x f17171j;

    /* renamed from: k, reason: collision with root package name */
    public final e26.x f17172k;

    /* renamed from: l, reason: collision with root package name */
    public final e26.v f17173l;

    public f1(a16.l c17, b16.f1 f1Var) {
        kotlin.jvm.internal.o.g(c17, "c");
        this.f17163b = c17;
        this.f17164c = f1Var;
        a16.d dVar = c17.f649a;
        e26.c0 c0Var = dVar.f615a;
        b16.t0 t0Var = new b16.t0(this);
        kz5.p0 p0Var = kz5.p0.f313996d;
        e26.u uVar = (e26.u) c0Var;
        uVar.getClass();
        this.f17165d = new e26.e(uVar, uVar, t0Var, p0Var);
        b16.x0 x0Var = new b16.x0(this);
        e26.c0 c0Var2 = dVar.f615a;
        this.f17166e = ((e26.u) c0Var2).b(x0Var);
        this.f17167f = ((e26.u) c0Var2).c(new b16.w0(this));
        this.f17168g = ((e26.u) c0Var2).d(new b16.v0(this));
        this.f17169h = ((e26.u) c0Var2).c(new b16.z0(this));
        this.f17170i = ((e26.u) c0Var2).b(new b16.y0(this));
        this.f17171j = ((e26.u) c0Var2).b(new b16.b1(this));
        this.f17172k = ((e26.u) c0Var2).b(new b16.u0(this));
        this.f17173l = ((e26.u) c0Var2).c(new b16.a1(this));
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        return (java.util.Set) e26.b0.a(this.f17170i, this, f17162m[0]);
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return !a().contains(name) ? kz5.p0.f313996d : (java.util.Collection) ((e26.r) this.f17169h).invoke(name);
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return !g().contains(name) ? kz5.p0.f313996d : (java.util.Collection) ((e26.r) this.f17173l).invoke(name);
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        return (java.util.Set) e26.b0.a(this.f17172k, this, f17162m[2]);
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        return (java.util.Collection) ((e26.o) this.f17165d).invoke();
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        return (java.util.Set) e26.b0.a(this.f17171j, this, f17162m[1]);
    }

    public abstract java.util.Set h(y16.i iVar, yz5.l lVar);

    public abstract java.util.Set i(y16.i iVar, yz5.l lVar);

    public void j(java.util.Collection result, n16.g name) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(name, "name");
    }

    public abstract b16.d k();

    /* JADX WARN: Multi-variable type inference failed */
    public final f26.o0 l(e16.q method, a16.l c17) {
        kotlin.jvm.internal.o.g(method, "method");
        kotlin.jvm.internal.o.g(c17, "c");
        java.lang.Class<?> declaringClass = ((u06.f0) method).c().getDeclaringClass();
        kotlin.jvm.internal.o.f(declaringClass, "getDeclaringClass(...)");
        c16.a a17 = c16.b.a(f26.x2.f259236e, declaringClass.isAnnotation(), false, null, 6, null);
        return c17.f653e.e(((u06.g0) method).g(), a17);
    }

    public abstract void m(java.util.Collection collection, n16.g gVar);

    public abstract void n(n16.g gVar, java.util.Collection collection);

    public abstract java.util.Set o(y16.i iVar, yz5.l lVar);

    public abstract o06.r1 p();

    public abstract o06.m q();

    public boolean r(z06.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        return true;
    }

    public abstract b16.r0 s(e16.q qVar, java.util.List list, f26.o0 o0Var, java.util.List list2);

    /* JADX WARN: Multi-variable type inference failed */
    public final z06.h t(e16.q method) {
        kotlin.jvm.internal.o.g(method, "method");
        a16.l lVar = this.f17163b;
        u06.f0 f0Var = (u06.f0) method;
        z06.h I0 = z06.h.I0(q(), a16.i.a(lVar, method), f0Var.d(), ((t06.m) lVar.f649a.f624j).a(method), ((b16.d) ((e26.o) this.f17166e).invoke()).e(f0Var.d()) != null && ((java.util.ArrayList) ((u06.g0) method).h()).isEmpty());
        kotlin.jvm.internal.o.g(lVar, "<this>");
        a16.l lVar2 = new a16.l(lVar.f649a, new a16.n(lVar, I0, method, 0), lVar.f651c);
        u06.g0 g0Var = (u06.g0) method;
        java.util.List typeParameters = g0Var.getTypeParameters();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(typeParameters, 10));
        java.util.Iterator it = ((java.util.ArrayList) typeParameters).iterator();
        while (it.hasNext()) {
            o06.e2 a17 = lVar2.f650b.a((e16.v) it.next());
            kotlin.jvm.internal.o.d(a17);
            arrayList.add(a17);
        }
        b16.s0 u17 = u(lVar2, I0, g0Var.h());
        f26.o0 l17 = l(method, lVar2);
        java.util.List list = u17.f17251a;
        b16.r0 s17 = s(method, arrayList, l17, list);
        f26.o0 o0Var = s17.f17245b;
        I0.H0(o0Var != null ? r16.h.h(I0, o0Var, p06.i.f350765a) : null, p(), kz5.p0.f313996d, s17.f17247d, s17.f17246c, s17.f17244a, o06.t0.f341984d.a(false, java.lang.reflect.Modifier.isAbstract(f0Var.c().getModifiers()), !java.lang.reflect.Modifier.isFinal(f0Var.c().getModifiers())), x06.h1.a(f0Var.f()), s17.f17245b != null ? kz5.b1.e(new jz5.l(z06.h.M, kz5.n0.X(list))) : kz5.q0.f314001d);
        I0.J0(s17.f17248e, u17.f17252b);
        if (!(!s17.f17249f.isEmpty())) {
            return I0;
        }
        ((y06.s) lVar2.f649a.f619e).getClass();
        throw new java.lang.UnsupportedOperationException("Should not be called");
    }

    public java.lang.String toString() {
        return "Lazy scope for " + q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b16.s0 u(a16.l c17, o06.n0 function, java.util.List jValueParameters) {
        jz5.l lVar;
        boolean z17;
        n16.g gVar;
        n16.g k17;
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(function, "function");
        kotlin.jvm.internal.o.g(jValueParameters, "jValueParameters");
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
            int i17 = u0Var.f314015a;
            e16.x xVar = (e16.x) u0Var.f314016b;
            p06.k a17 = a16.i.a(c17, xVar);
            c16.a a18 = c16.b.a(f26.x2.f259236e, false, false, null, 7, null);
            u06.m0 m0Var = (u06.m0) xVar;
            e16.u uVar = m0Var.f423515a;
            boolean z19 = m0Var.f423518d;
            c16.e eVar = c17.f653e;
            a16.d dVar = c17.f649a;
            if (z19) {
                e16.f fVar = uVar instanceof e16.f ? (e16.f) uVar : null;
                if (fVar == null) {
                    throw new java.lang.AssertionError("Vararg parameter should be an array: " + xVar);
                }
                f26.o0 c18 = eVar.c(fVar, a18, true);
                lVar = new jz5.l(c18, dVar.f629o.h().g(c18));
            } else {
                lVar = new jz5.l(eVar.e(uVar, a18), null);
            }
            f26.o0 o0Var = (f26.o0) lVar.f302833d;
            f26.o0 o0Var2 = (f26.o0) lVar.f302834e;
            if (kotlin.jvm.internal.o.b(((r06.v) function).getName().h(), "equals") && jValueParameters.size() == 1 && kotlin.jvm.internal.o.b(dVar.f629o.h().p(), o0Var)) {
                k17 = n16.g.k("other");
            } else {
                java.lang.String str = m0Var.f423517c;
                n16.g j17 = str != null ? n16.g.j(str) : null;
                if (j17 == null) {
                    z18 = true;
                }
                if (j17 == null) {
                    k17 = n16.g.k("p" + i17);
                } else {
                    z17 = z18;
                    gVar = j17;
                    arrayList.add(new r06.s1(function, null, i17, a17, gVar, o0Var, false, false, false, o0Var2, ((t06.m) dVar.f624j).a(xVar)));
                    z18 = z17;
                }
            }
            z17 = z18;
            gVar = k17;
            arrayList.add(new r06.s1(function, null, i17, a17, gVar, o0Var, false, false, false, o0Var2, ((t06.m) dVar.f624j).a(xVar)));
            z18 = z17;
        }
    }
}

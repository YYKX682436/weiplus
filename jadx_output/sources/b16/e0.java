package b16;

/* loaded from: classes16.dex */
public final class e0 extends b16.f1 {

    /* renamed from: n, reason: collision with root package name */
    public final o06.g f17151n;

    /* renamed from: o, reason: collision with root package name */
    public final e16.g f17152o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f17153p;

    /* renamed from: q, reason: collision with root package name */
    public final e26.x f17154q;

    /* renamed from: r, reason: collision with root package name */
    public final e26.x f17155r;

    /* renamed from: s, reason: collision with root package name */
    public final e26.x f17156s;

    /* renamed from: t, reason: collision with root package name */
    public final e26.x f17157t;

    /* renamed from: u, reason: collision with root package name */
    public final e26.w f17158u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(a16.l c17, o06.g ownerDescriptor, e16.g jClass, boolean z17, b16.e0 e0Var) {
        super(c17, e0Var);
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(ownerDescriptor, "ownerDescriptor");
        kotlin.jvm.internal.o.g(jClass, "jClass");
        this.f17151n = ownerDescriptor;
        this.f17152o = jClass;
        this.f17153p = z17;
        a16.d dVar = c17.f649a;
        this.f17154q = ((e26.u) dVar.f615a).b(new b16.x(this, c17));
        this.f17155r = ((e26.u) dVar.f615a).b(new b16.b0(this));
        this.f17156s = ((e26.u) dVar.f615a).b(new b16.z(c17, this));
        this.f17157t = ((e26.u) dVar.f615a).b(new b16.y(this));
        this.f17158u = ((e26.u) dVar.f615a).d(new b16.d0(this, c17));
    }

    public static final java.util.Collection v(b16.e0 e0Var, n16.g gVar) {
        java.util.Collection b17 = ((b16.d) ((e26.o) e0Var.f17166e).invoke()).b(gVar);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add(e0Var.t((e16.q) it.next()));
        }
        return arrayList;
    }

    public static final java.util.Collection w(b16.e0 e0Var, n16.g gVar) {
        java.util.Set K = e0Var.K(gVar);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : K) {
            o06.v1 v1Var = (o06.v1) obj;
            kotlin.jvm.internal.o.g(v1Var, "<this>");
            boolean z17 = true;
            if (!(x06.a1.b(v1Var) != null) && x06.j.a(v1Var) == null) {
                z17 = false;
            }
            if (!z17) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A(java.util.Set set, java.util.Collection collection, java.util.Set set2, yz5.l lVar) {
        o06.v1 v1Var;
        r06.h1 h1Var;
        r06.g1 g1Var;
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            o06.o1 o1Var = (o06.o1) it.next();
            z06.d dVar = null;
            if (E(o1Var, lVar)) {
                o06.v1 I = I(o1Var, lVar);
                kotlin.jvm.internal.o.d(I);
                if (o1Var.v()) {
                    v1Var = J(o1Var, lVar);
                    kotlin.jvm.internal.o.d(v1Var);
                } else {
                    v1Var = null;
                }
                if (v1Var != null) {
                    ((r06.j0) v1Var).f();
                    ((r06.j0) I).f();
                }
                z06.d dVar2 = new z06.d(this.f17151n, I, v1Var, o1Var);
                f26.o0 o0Var = ((r06.j0) I).f368460m;
                kotlin.jvm.internal.o.d(o0Var);
                kz5.p0 p0Var = kz5.p0.f313996d;
                dVar2.A0(o0Var, p0Var, p(), null, p0Var);
                r06.g1 i17 = r16.h.i(dVar2, ((p06.b) I).getAnnotations(), false, false, false, ((r06.w) I).getSource());
                i17.f368389r = I;
                i17.w0(dVar2.getType());
                if (v1Var != null) {
                    r06.j0 j0Var = (r06.j0) v1Var;
                    java.util.List W = j0Var.W();
                    kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
                    p06.a aVar = (o06.l2) kz5.n0.Z(W);
                    if (aVar == null) {
                        throw new java.lang.AssertionError("No parameter found for " + v1Var);
                    }
                    h1Var = r16.h.j(dVar2, ((p06.b) v1Var).getAnnotations(), ((p06.b) aVar).getAnnotations(), false, false, false, j0Var.getVisibility(), ((r06.w) v1Var).getSource());
                    h1Var.f368389r = v1Var;
                    g1Var = i17;
                } else {
                    h1Var = null;
                    g1Var = i17;
                }
                dVar2.y0(g1Var, h1Var, null, null);
                dVar = dVar2;
            }
            if (dVar != null) {
                collection.add(dVar);
                if (set2 != null) {
                    set2.add(o1Var);
                    return;
                }
                return;
            }
        }
    }

    public final java.util.Collection B() {
        boolean z17 = this.f17153p;
        o06.g classDescriptor = this.f17151n;
        if (z17) {
            java.util.Collection a17 = classDescriptor.g().a();
            kotlin.jvm.internal.o.f(a17, "getSupertypes(...)");
            return a17;
        }
        ((g26.k) ((g26.v) this.f17163b.f649a.f635u).f268015c).getClass();
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        java.util.Collection a18 = classDescriptor.g().a();
        kotlin.jvm.internal.o.f(a18, "getSupertypes(...)");
        return a18;
    }

    public final o06.v1 C(o06.v1 v1Var, o06.b bVar, java.util.Collection collection) {
        java.util.Collection collection2 = collection;
        boolean z17 = true;
        if (!(collection2 instanceof java.util.Collection) || !collection2.isEmpty()) {
            java.util.Iterator it = collection2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                o06.b bVar2 = (o06.v1) it.next();
                if (!kotlin.jvm.internal.o.b(v1Var, bVar2) && ((r06.j0) bVar2).I == null && F(bVar2, bVar)) {
                    z17 = false;
                    break;
                }
            }
        }
        if (z17) {
            return v1Var;
        }
        o06.n0 build = v1Var.O().b().build();
        kotlin.jvm.internal.o.d(build);
        return (o06.v1) build;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final o06.v1 D(o06.v1 r6) {
        /*
            r5 = this;
            r0 = r6
            r06.j0 r0 = (r06.j0) r0
            java.util.List r0 = r0.W()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.o.f(r0, r1)
            java.lang.Object r0 = kz5.n0.k0(r0)
            o06.l2 r0 = (o06.l2) r0
            r2 = 0
            if (r0 == 0) goto L85
            r3 = r0
            r06.t1 r3 = (r06.t1) r3
            f26.o0 r3 = r3.getType()
            f26.c2 r3 = r3.w0()
            o06.j r3 = r3.i()
            if (r3 == 0) goto L39
            n16.e r3 = v16.f.h(r3)
            boolean r4 = r3.e()
            if (r4 == 0) goto L31
            goto L32
        L31:
            r3 = r2
        L32:
            if (r3 == 0) goto L39
            n16.c r3 = r3.h()
            goto L3a
        L39:
            r3 = r2
        L3a:
            n16.c r4 = l06.x.f314952g
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            if (r3 == 0) goto L43
            goto L44
        L43:
            r0 = r2
        L44:
            if (r0 != 0) goto L47
            goto L85
        L47:
            o06.m0 r2 = r6.O()
            r06.j0 r6 = (r06.j0) r6
            java.util.List r6 = r6.W()
            kotlin.jvm.internal.o.f(r6, r1)
            r1 = 1
            java.util.List r6 = kz5.n0.S(r6, r1)
            o06.m0 r6 = r2.i(r6)
            r06.t1 r0 = (r06.t1) r0
            f26.o0 r0 = r0.getType()
            java.util.List r0 = r0.u0()
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            f26.l2 r0 = (f26.l2) r0
            f26.o0 r0 = r0.getType()
            o06.m0 r6 = r6.m(r0)
            o06.n0 r6 = r6.build()
            o06.v1 r6 = (o06.v1) r6
            r0 = r6
            r06.j1 r0 = (r06.j1) r0
            if (r0 != 0) goto L82
            goto L84
        L82:
            r0.B = r1
        L84:
            return r6
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.e0.D(o06.v1):o06.v1");
    }

    public final boolean E(o06.o1 o1Var, yz5.l lVar) {
        if (b16.e.a(o1Var)) {
            return false;
        }
        o06.r0 I = I(o1Var, lVar);
        o06.r0 J2 = J(o1Var, lVar);
        if (I == null) {
            return false;
        }
        if (o1Var.v()) {
            return J2 != null && ((r06.j0) J2).f() == ((r06.j0) I).f();
        }
        return true;
    }

    public final boolean F(o06.b bVar, o06.b bVar2) {
        r16.v c17 = r16.x.f368679d.n(bVar2, bVar, true).c();
        kotlin.jvm.internal.o.f(c17, "getResult(...)");
        return c17 == r16.v.OVERRIDABLE && !x06.f0.f451234a.a(bVar2, bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean G(o06.v1 v1Var, o06.n0 n0Var) {
        int i17 = x06.g.f451241m;
        kotlin.jvm.internal.o.g(v1Var, "<this>");
        if (kotlin.jvm.internal.o.b(((r06.v) v1Var).getName().h(), "removeAt") && kotlin.jvm.internal.o.b(g16.w0.b(v1Var), x06.g1.f451249h.f451210e)) {
            n0Var = n0Var.a();
        }
        kotlin.jvm.internal.o.d(n0Var);
        return F(n0Var, v1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o06.v1 H(o06.o1 o1Var, java.lang.String str, yz5.l lVar) {
        o06.v1 v1Var;
        boolean b17;
        java.util.Iterator it = ((java.lang.Iterable) lVar.invoke(n16.g.k(str))).iterator();
        do {
            v1Var = null;
            if (!it.hasNext()) {
                break;
            }
            o06.v1 v1Var2 = (o06.v1) it.next();
            if (((r06.j0) v1Var2).W().size() == 0) {
                g26.g gVar = g26.g.f267991a;
                f26.o0 o0Var = ((r06.j0) v1Var2).f368460m;
                if (o0Var == null) {
                    b17 = false;
                } else {
                    b17 = ((g26.v) gVar).b(o0Var, o1Var.getType());
                }
                if (b17) {
                    v1Var = v1Var2;
                }
            }
        } while (v1Var == null);
        return v1Var;
    }

    public final o06.v1 I(o06.o1 o1Var, yz5.l lVar) {
        o06.p1 c17 = o1Var.c();
        java.lang.String str = null;
        o06.p1 p1Var = c17 != null ? (o06.p1) x06.a1.b(c17) : null;
        if (p1Var != null) {
            l06.o.A(p1Var);
            o06.d b17 = v16.f.b(v16.f.l(p1Var), false, x06.m.f451275d, 1, null);
            if (b17 != null) {
                java.util.Map map = x06.k.f451266a;
                n16.g gVar = (n16.g) x06.k.f451266a.get(v16.f.g(b17));
                if (gVar != null) {
                    str = gVar.h();
                }
            }
        }
        if (str != null && !x06.a1.d(this.f17151n, p1Var)) {
            return H(o1Var, str, lVar);
        }
        java.lang.String h17 = o1Var.getName().h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        return H(o1Var, x06.o0.a(h17), lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final o06.v1 J(o06.o1 o1Var, yz5.l lVar) {
        o06.v1 v1Var;
        f26.o0 o0Var;
        java.lang.String h17 = o1Var.getName().h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        java.util.Iterator it = ((java.lang.Iterable) lVar.invoke(n16.g.k(x06.o0.b(h17)))).iterator();
        do {
            v1Var = null;
            if (!it.hasNext()) {
                break;
            }
            o06.v1 v1Var2 = (o06.v1) it.next();
            r06.j0 j0Var = (r06.j0) v1Var2;
            if (j0Var.W().size() == 1 && (o0Var = j0Var.f368460m) != null) {
                n16.g gVar = l06.o.f314888e;
                if (l06.o.E(o0Var, l06.w.f314924e)) {
                    g26.g gVar2 = g26.g.f267991a;
                    java.util.List W = j0Var.W();
                    kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
                    if (((g26.v) gVar2).a(((r06.t1) ((o06.l2) kz5.n0.z0(W))).getType(), o1Var.getType())) {
                        v1Var = v1Var2;
                    }
                }
            }
        } while (v1Var == null);
        return v1Var;
    }

    public final java.util.Set K(n16.g gVar) {
        java.util.Collection B = B();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = B.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().b(gVar, w06.d.f441950h));
        }
        return linkedHashSet;
    }

    public final java.util.Set L(n16.g gVar) {
        java.util.Collection B = B();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = B.iterator();
        while (it.hasNext()) {
            java.util.Collection c17 = ((f26.o0) it.next()).V().c(gVar, w06.d.f441950h);
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(c17, 10));
            java.util.Iterator it6 = c17.iterator();
            while (it6.hasNext()) {
                arrayList2.add((o06.o1) it6.next());
            }
            kz5.h0.u(arrayList, arrayList2);
        }
        return kz5.n0.X0(arrayList);
    }

    public final boolean M(o06.v1 v1Var, o06.n0 n0Var) {
        java.lang.String a17 = g16.w0.a(v1Var, false, false, 2, null);
        o06.n0 a18 = n0Var.a();
        kotlin.jvm.internal.o.f(a18, "getOriginal(...)");
        return kotlin.jvm.internal.o.b(a17, g16.w0.a(a18, false, false, 2, null)) && !F(v1Var, n0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
    
        if (r26.i0.y(r3, "set", false) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[LOOP:1: B:20:0x00aa->B:125:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean N(o06.v1 r15) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.e0.N(o06.v1):boolean");
    }

    public void O(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(this.f17163b.f649a.f628n, "<this>");
        o06.g scopeOwner = this.f17151n;
        kotlin.jvm.internal.o.g(scopeOwner, "scopeOwner");
    }

    @Override // b16.f1, y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        O(name, location);
        return super.b(name, location);
    }

    @Override // b16.f1, y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        O(name, location);
        return super.c(name, location);
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        e26.w wVar;
        o06.g gVar;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        O(name, location);
        b16.e0 e0Var = (b16.e0) this.f17164c;
        return (e0Var == null || (wVar = e0Var.f17158u) == null || (gVar = (o06.g) ((e26.q) wVar).invoke(name)) == null) ? (o06.j) ((e26.q) this.f17158u).invoke(name) : gVar;
    }

    @Override // b16.f1
    public java.util.Set h(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        return kz5.q1.i((java.util.Set) ((e26.o) this.f17155r).invoke(), ((java.util.Map) ((e26.o) this.f17157t).invoke()).keySet());
    }

    @Override // b16.f1
    public java.util.Set i(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        o06.g gVar = this.f17151n;
        java.util.Collection a17 = gVar.g().a();
        kotlin.jvm.internal.o.f(a17, "getSupertypes(...)");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().a());
        }
        e26.o oVar = (e26.o) this.f17166e;
        linkedHashSet.addAll(((b16.d) oVar.invoke()).a());
        linkedHashSet.addAll(((b16.d) oVar.invoke()).d());
        linkedHashSet.addAll(h(kindFilter, lVar));
        a16.l lVar2 = this.f17163b;
        linkedHashSet.addAll(((w16.a) lVar2.f649a.f638x).e(lVar2, gVar));
        return linkedHashSet;
    }

    @Override // b16.f1
    public void j(java.util.Collection result, n16.g name) {
        boolean z17;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(name, "name");
        boolean j17 = ((u06.x) this.f17152o).j();
        o06.g gVar = this.f17151n;
        a16.l lVar = this.f17163b;
        if (j17) {
            e26.o oVar = (e26.o) this.f17166e;
            if (((b16.d) oVar.invoke()).e(name) != null) {
                java.util.Collection collection = result;
                if (!collection.isEmpty()) {
                    java.util.Iterator it = collection.iterator();
                    while (it.hasNext()) {
                        if (((r06.j0) ((o06.v1) it.next())).W().isEmpty()) {
                            z17 = false;
                            break;
                        }
                    }
                }
                z17 = true;
                if (z17) {
                    e16.d e17 = ((b16.d) oVar.invoke()).e(name);
                    kotlin.jvm.internal.o.d(e17);
                    p06.k a17 = a16.i.a(lVar, e17);
                    n16.g d17 = ((u06.f0) e17).d();
                    a16.d dVar = lVar.f649a;
                    z06.h I0 = z06.h.I0(gVar, a17, d17, ((t06.m) dVar.f624j).a(e17), true);
                    f26.o0 e18 = lVar.f653e.e(((u06.j0) e17).g(), c16.b.a(f26.x2.f259236e, false, false, null, 6, null));
                    o06.r1 p17 = p();
                    kz5.p0 p0Var = kz5.p0.f313996d;
                    I0.H0(null, p17, p0Var, p0Var, p0Var, e18, o06.t0.f341984d.a(false, false, true), o06.f0.f341945e, null);
                    I0.J0(false, false);
                    ((y06.m) dVar.f621g).getClass();
                    result.add(I0);
                }
            }
        }
        ((w16.a) lVar.f649a.f638x).b(lVar, gVar, name, result);
    }

    @Override // b16.f1
    public b16.d k() {
        return new b16.b(this.f17152o, b16.s.f17250d);
    }

    @Override // b16.f1
    public void m(java.util.Collection result, n16.g name) {
        boolean z17;
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(name, "name");
        java.util.Set K = K(name);
        x06.c1 c1Var = x06.g1.f451242a;
        if (!((java.util.ArrayList) x06.g1.f451252k).contains(name) && !x06.j.f451264m.b(name)) {
            if (!K.isEmpty()) {
                java.util.Iterator it = K.iterator();
                while (it.hasNext()) {
                    if (((o06.n0) it.next()).isSuspend()) {
                        z17 = false;
                        break;
                    }
                }
            }
            z17 = true;
            if (z17) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : K) {
                    if (N((o06.v1) obj)) {
                        arrayList.add(obj);
                    }
                }
                y(result, name, arrayList, false);
                return;
            }
        }
        java.util.Collection a17 = o26.u.f342614f.a();
        java.util.Collection d17 = y06.c.d(name, K, kz5.p0.f313996d, this.f17151n, b26.c0.f17422a, ((g26.v) this.f17163b.f649a.f635u).f268017e);
        z(name, result, d17, result, new b16.t(this));
        z(name, result, d17, a17, new b16.u(this));
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : K) {
            if (N((o06.v1) obj2)) {
                arrayList2.add(obj2);
            }
        }
        y(result, name, kz5.n0.t0(arrayList2, a17), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // b16.f1
    public void n(n16.g name, java.util.Collection result) {
        e16.q qVar;
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(result, "result");
        boolean h17 = ((u06.x) this.f17152o).h();
        a16.l lVar = this.f17163b;
        if (h17 && (qVar = (e16.q) kz5.n0.A0(((b16.d) ((e26.o) this.f17166e).invoke()).b(name))) != 0) {
            u06.f0 f0Var = (u06.f0) qVar;
            z06.i B0 = z06.i.B0(this.f17151n, a16.i.a(lVar, qVar), o06.t0.f341985e, x06.h1.a(f0Var.f()), false, f0Var.d(), ((t06.m) lVar.f649a.f624j).a(qVar), false);
            r06.g1 c17 = r16.h.c(B0, p06.i.f350765a);
            B0.y0(c17, null, null, null);
            kotlin.jvm.internal.o.g(lVar, "<this>");
            f26.o0 l17 = l(qVar, new a16.l(lVar.f649a, new a16.n(lVar, B0, qVar, 0), lVar.f651c));
            kz5.p0 p0Var = kz5.p0.f313996d;
            B0.A0(l17, p0Var, p(), null, p0Var);
            c17.w0(l17);
            result.add(B0);
        }
        java.util.Set L = L(name);
        if (L.isEmpty()) {
            return;
        }
        o26.s sVar = o26.u.f342614f;
        java.util.Set a17 = sVar.a();
        java.util.Collection a18 = sVar.a();
        A(L, result, a17, new b16.v(this));
        A(kz5.q1.g(L, a17), a18, null, new b16.w(this));
        java.util.Set i17 = kz5.q1.i(L, a18);
        o06.g gVar = this.f17151n;
        a16.d dVar = lVar.f649a;
        result.addAll(y06.c.d(name, i17, result, gVar, dVar.f620f, ((g26.v) dVar.f635u).f268017e));
    }

    @Override // b16.f1
    public java.util.Set o(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        if (((u06.x) this.f17152o).h()) {
            return a();
        }
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(((b16.d) ((e26.o) this.f17166e).invoke()).f());
        java.util.Collection a17 = this.f17151n.g().a();
        kotlin.jvm.internal.o.f(a17, "getSupertypes(...)");
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().g());
        }
        return linkedHashSet;
    }

    @Override // b16.f1
    public o06.r1 p() {
        o06.g gVar = this.f17151n;
        if (gVar != null) {
            int i17 = r16.i.f368658a;
            return gVar.R();
        }
        r16.i.a(0);
        throw null;
    }

    @Override // b16.f1
    public o06.m q() {
        return this.f17151n;
    }

    @Override // b16.f1
    public boolean r(z06.h hVar) {
        kotlin.jvm.internal.o.g(hVar, "<this>");
        if (((u06.x) this.f17152o).h()) {
            return false;
        }
        return N(hVar);
    }

    @Override // b16.f1
    public b16.r0 s(e16.q method, java.util.List methodTypeParameters, f26.o0 returnType, java.util.List valueParameters) {
        kotlin.jvm.internal.o.g(method, "method");
        kotlin.jvm.internal.o.g(methodTypeParameters, "methodTypeParameters");
        kotlin.jvm.internal.o.g(returnType, "returnType");
        kotlin.jvm.internal.o.g(valueParameters, "valueParameters");
        ((y06.s) this.f17163b.f649a.f619e).getClass();
        if (this.f17151n == null) {
            y06.s.a(1);
            throw null;
        }
        java.util.List emptyList = java.util.Collections.emptyList();
        if (emptyList != null) {
            return new b16.r0(returnType, null, valueParameters, methodTypeParameters, false, emptyList);
        }
        y06.t.a(3);
        throw null;
    }

    @Override // b16.f1
    public java.lang.String toString() {
        return "Lazy Java member scope for " + ((u06.x) this.f17152o).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x(java.util.List list, o06.l lVar, int i17, e16.q qVar, f26.o0 o0Var, f26.o0 o0Var2) {
        int i18 = p06.k.Z0;
        p06.k kVar = p06.i.f350765a;
        n16.g d17 = ((u06.f0) qVar).d();
        f26.o0 h17 = f26.z2.h(o0Var);
        kotlin.jvm.internal.o.f(h17, "makeNotNullable(...)");
        java.lang.Object defaultValue = ((u06.g0) qVar).f423502a.getDefaultValue();
        list.add(new r06.s1(lVar, null, i17, kVar, d17, h17, (defaultValue != null ? u06.i.e(defaultValue.getClass()) ? new u06.c0(null, (java.lang.Enum) defaultValue) : defaultValue instanceof java.lang.annotation.Annotation ? new u06.l(null, (java.lang.annotation.Annotation) defaultValue) : defaultValue instanceof java.lang.Object[] ? new u06.n(null, (java.lang.Object[]) defaultValue) : defaultValue instanceof java.lang.Class ? new u06.y(null, (java.lang.Class) defaultValue) : new u06.e0(null, defaultValue) : null) != null, false, false, o0Var2 != null ? f26.z2.h(o0Var2) : null, ((t06.m) this.f17163b.f649a.f624j).a(qVar)));
    }

    public final void y(java.util.Collection collection, n16.g gVar, java.util.Collection collection2, boolean z17) {
        o06.g gVar2 = this.f17151n;
        a16.d dVar = this.f17163b.f649a;
        java.util.Collection<o06.v1> d17 = y06.c.d(gVar, collection2, collection, gVar2, dVar.f620f, ((g26.v) dVar.f635u).f268017e);
        if (!z17) {
            collection.addAll(d17);
            return;
        }
        java.util.List t07 = kz5.n0.t0(collection, d17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(d17, 10));
        for (o06.v1 v1Var : d17) {
            o06.v1 v1Var2 = (o06.v1) x06.a1.c(v1Var);
            if (v1Var2 == null) {
                kotlin.jvm.internal.o.d(v1Var);
            } else {
                kotlin.jvm.internal.o.d(v1Var);
                v1Var = C(v1Var, v1Var2, t07);
            }
            arrayList.add(v1Var);
        }
        collection.addAll(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x013b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(n16.g r11, java.util.Collection r12, java.util.Collection r13, java.util.Collection r14, yz5.l r15) {
        /*
            Method dump skipped, instructions count: 321
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.e0.z(n16.g, java.util.Collection, java.util.Collection, java.util.Collection, yz5.l):void");
    }
}

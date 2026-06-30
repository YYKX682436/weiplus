package b16;

/* loaded from: classes16.dex */
public final class m1 extends b16.n1 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f17215p = 0;

    /* renamed from: n, reason: collision with root package name */
    public final e16.g f17216n;

    /* renamed from: o, reason: collision with root package name */
    public final z06.c f17217o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a16.l c17, e16.g jClass, z06.c ownerDescriptor) {
        super(c17);
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(jClass, "jClass");
        kotlin.jvm.internal.o.g(ownerDescriptor, "ownerDescriptor");
        this.f17216n = jClass;
        this.f17217o = ownerDescriptor;
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return null;
    }

    @Override // b16.f1
    public java.util.Set h(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        return kz5.r0.f314002d;
    }

    @Override // b16.f1
    public java.util.Set i(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        java.util.Set W0 = kz5.n0.W0(((b16.d) ((e26.o) this.f17166e).invoke()).a());
        z06.c cVar = this.f17217o;
        b16.m1 b17 = z06.k.b(cVar);
        java.util.Set a17 = b17 != null ? b17.a() : null;
        if (a17 == null) {
            a17 = kz5.r0.f314002d;
        }
        W0.addAll(a17);
        if (((u06.x) this.f17216n).i()) {
            W0.addAll(kz5.c0.i(l06.x.f314948c, l06.x.f314946a));
        }
        a16.l lVar2 = this.f17163b;
        W0.addAll(((w16.a) lVar2.f649a.f638x).g(lVar2, cVar));
        return W0;
    }

    @Override // b16.f1
    public void j(java.util.Collection result, n16.g name) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(name, "name");
        a16.l lVar = this.f17163b;
        ((w16.a) lVar.f649a.f638x).d(lVar, this.f17217o, name, result);
    }

    @Override // b16.f1
    public b16.d k() {
        return new b16.b(this.f17216n, b16.h1.f17183d);
    }

    @Override // b16.f1
    public void m(java.util.Collection result, n16.g name) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(name, "name");
        z06.c cVar = this.f17217o;
        b16.m1 b17 = z06.k.b(cVar);
        java.util.Collection X0 = b17 == null ? kz5.r0.f314002d : kz5.n0.X0(b17.b(name, w06.d.f441950h));
        z06.c cVar2 = this.f17217o;
        a16.d dVar = this.f17163b.f649a;
        result.addAll(y06.c.e(name, X0, result, cVar2, dVar.f620f, ((g26.v) dVar.f635u).f268017e));
        if (((u06.x) this.f17216n).i()) {
            if (kotlin.jvm.internal.o.b(name, l06.x.f314948c)) {
                o06.v1 f17 = r16.h.f(cVar);
                kotlin.jvm.internal.o.f(f17, "createEnumValueOfMethod(...)");
                result.add(f17);
            } else if (kotlin.jvm.internal.o.b(name, l06.x.f314946a)) {
                o06.v1 g17 = r16.h.g(cVar);
                kotlin.jvm.internal.o.f(g17, "createEnumValuesMethod(...)");
                result.add(g17);
            }
        }
    }

    @Override // b16.n1, b16.f1
    public void n(n16.g name, java.util.Collection result) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(result, "result");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        b16.i1 i1Var = new b16.i1(name);
        z06.c cVar = this.f17217o;
        o26.h.b(kz5.b0.c(cVar), b16.g1.f17180a, new b16.l1(cVar, linkedHashSet, i1Var));
        boolean z17 = !result.isEmpty();
        a16.l lVar = this.f17163b;
        if (z17) {
            z06.c cVar2 = this.f17217o;
            a16.d dVar = lVar.f649a;
            result.addAll(y06.c.e(name, linkedHashSet, result, cVar2, dVar.f620f, ((g26.v) dVar.f635u).f268017e));
        } else {
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            for (java.lang.Object obj : linkedHashSet) {
                o06.o1 v17 = v((o06.o1) obj);
                java.lang.Object obj2 = linkedHashMap.get(v17);
                if (obj2 == null) {
                    obj2 = new java.util.ArrayList();
                    linkedHashMap.put(v17, obj2);
                }
                ((java.util.List) obj2).add(obj);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                java.util.Collection collection = (java.util.Collection) ((java.util.Map.Entry) it.next()).getValue();
                z06.c cVar3 = this.f17217o;
                a16.d dVar2 = lVar.f649a;
                kz5.h0.u(arrayList, y06.c.e(name, collection, result, cVar3, dVar2.f620f, ((g26.v) dVar2.f635u).f268017e));
            }
            result.addAll(arrayList);
        }
        if (((u06.x) this.f17216n).i() && kotlin.jvm.internal.o.b(name, l06.x.f314947b)) {
            o26.a.a(result, r16.h.e(cVar));
        }
    }

    @Override // b16.f1
    public java.util.Set o(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        java.util.Set W0 = kz5.n0.W0(((b16.d) ((e26.o) this.f17166e).invoke()).f());
        b16.j1 j1Var = b16.j1.f17196d;
        z06.c cVar = this.f17217o;
        o26.h.b(kz5.b0.c(cVar), b16.g1.f17180a, new b16.l1(cVar, W0, j1Var));
        if (((u06.x) this.f17216n).i()) {
            W0.add(l06.x.f314947b);
        }
        return W0;
    }

    @Override // b16.f1
    public o06.m q() {
        return this.f17217o;
    }

    public final o06.o1 v(o06.o1 o1Var) {
        o06.c j17 = o1Var.j();
        j17.getClass();
        if (j17 != o06.c.FAKE_OVERRIDE) {
            return o1Var;
        }
        java.util.Collection i17 = o1Var.i();
        kotlin.jvm.internal.o.f(i17, "getOverriddenDescriptors(...)");
        java.util.Collection<o06.o1> collection = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (o06.o1 o1Var2 : collection) {
            kotlin.jvm.internal.o.d(o1Var2);
            arrayList.add(v(o1Var2));
        }
        return (o06.o1) kz5.n0.z0(kz5.n0.Q(arrayList));
    }
}

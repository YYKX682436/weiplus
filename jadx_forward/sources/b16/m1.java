package b16;

/* loaded from: classes16.dex */
public final class m1 extends b16.n1 {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f98748p = 0;

    /* renamed from: n, reason: collision with root package name */
    public final e16.g f98749n;

    /* renamed from: o, reason: collision with root package name */
    public final z06.c f98750o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(a16.l c17, e16.g jClass, z06.c ownerDescriptor) {
        super(c17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jClass, "jClass");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ownerDescriptor, "ownerDescriptor");
        this.f98749n = jClass;
        this.f98750o = ownerDescriptor;
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return null;
    }

    @Override // b16.f1
    public java.util.Set h(y16.i kindFilter, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        return kz5.r0.f395535d;
    }

    @Override // b16.f1
    public java.util.Set i(y16.i kindFilter, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        java.util.Set W0 = kz5.n0.W0(((b16.d) ((e26.o) this.f98699e).mo152xb9724478()).a());
        z06.c cVar = this.f98750o;
        b16.m1 b17 = z06.k.b(cVar);
        java.util.Set a17 = b17 != null ? b17.a() : null;
        if (a17 == null) {
            a17 = kz5.r0.f395535d;
        }
        W0.addAll(a17);
        if (((u06.x) this.f98749n).i()) {
            W0.addAll(kz5.c0.i(l06.x.f396481c, l06.x.f396479a));
        }
        a16.l lVar2 = this.f98696b;
        W0.addAll(((w16.a) lVar2.f82182a.f82171x).g(lVar2, cVar));
        return W0;
    }

    @Override // b16.f1
    public void j(java.util.Collection result, n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        a16.l lVar = this.f98696b;
        ((w16.a) lVar.f82182a.f82171x).d(lVar, this.f98750o, name, result);
    }

    @Override // b16.f1
    public b16.d k() {
        return new b16.b(this.f98749n, b16.h1.f98716d);
    }

    @Override // b16.f1
    public void m(java.util.Collection result, n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        z06.c cVar = this.f98750o;
        b16.m1 b17 = z06.k.b(cVar);
        java.util.Collection X0 = b17 == null ? kz5.r0.f395535d : kz5.n0.X0(b17.b(name, w06.d.f523483h));
        z06.c cVar2 = this.f98750o;
        a16.d dVar = this.f98696b.f82182a;
        result.addAll(y06.c.e(name, X0, result, cVar2, dVar.f82153f, ((g26.v) dVar.f82168u).f349550e));
        if (((u06.x) this.f98749n).i()) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, l06.x.f396481c)) {
                o06.v1 f17 = r16.h.f(cVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(f17, "createEnumValueOfMethod(...)");
                result.add(f17);
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, l06.x.f396479a)) {
                o06.v1 g17 = r16.h.g(cVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "createEnumValuesMethod(...)");
                result.add(g17);
            }
        }
    }

    @Override // b16.n1, b16.f1
    public void n(n16.g name, java.util.Collection result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        b16.i1 i1Var = new b16.i1(name);
        z06.c cVar = this.f98750o;
        o26.h.b(kz5.b0.c(cVar), b16.g1.f98713a, new b16.l1(cVar, linkedHashSet, i1Var));
        boolean z17 = !result.isEmpty();
        a16.l lVar = this.f98696b;
        if (z17) {
            z06.c cVar2 = this.f98750o;
            a16.d dVar = lVar.f82182a;
            result.addAll(y06.c.e(name, linkedHashSet, result, cVar2, dVar.f82153f, ((g26.v) dVar.f82168u).f349550e));
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
                z06.c cVar3 = this.f98750o;
                a16.d dVar2 = lVar.f82182a;
                kz5.h0.u(arrayList, y06.c.e(name, collection, result, cVar3, dVar2.f82153f, ((g26.v) dVar2.f82168u).f349550e));
            }
            result.addAll(arrayList);
        }
        if (((u06.x) this.f98749n).i() && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, l06.x.f396480b)) {
            o26.a.a(result, r16.h.e(cVar));
        }
    }

    @Override // b16.f1
    public java.util.Set o(y16.i kindFilter, yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        java.util.Set W0 = kz5.n0.W0(((b16.d) ((e26.o) this.f98699e).mo152xb9724478()).f());
        b16.j1 j1Var = b16.j1.f98729d;
        z06.c cVar = this.f98750o;
        o26.h.b(kz5.b0.c(cVar), b16.g1.f98713a, new b16.l1(cVar, W0, j1Var));
        if (((u06.x) this.f98749n).i()) {
            W0.add(l06.x.f396480b);
        }
        return W0;
    }

    @Override // b16.f1
    public o06.m q() {
        return this.f98750o;
    }

    public final o06.o1 v(o06.o1 o1Var) {
        o06.c j17 = o1Var.j();
        j17.getClass();
        if (j17 != o06.c.FAKE_OVERRIDE) {
            return o1Var;
        }
        java.util.Collection i17 = o1Var.i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i17, "getOverriddenDescriptors(...)");
        java.util.Collection<o06.o1> collection = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(collection, 10));
        for (o06.o1 o1Var2 : collection) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(o1Var2);
            arrayList.add(v(o1Var2));
        }
        return (o06.o1) kz5.n0.z0(kz5.n0.Q(arrayList));
    }
}

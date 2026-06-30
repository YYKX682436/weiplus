package y16;

/* loaded from: classes16.dex */
public final class c0 implements y16.s {

    /* renamed from: b, reason: collision with root package name */
    public final y16.s f540462b;

    /* renamed from: c, reason: collision with root package name */
    public final f26.v2 f540463c;

    /* renamed from: d, reason: collision with root package name */
    public java.util.Map f540464d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f540465e;

    public c0(y16.s workerScope, f26.v2 givenSubstitutor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workerScope, "workerScope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(givenSubstitutor, "givenSubstitutor");
        this.f540462b = workerScope;
        jz5.h.b(new y16.b0(givenSubstitutor));
        f26.q2 g17 = givenSubstitutor.g();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(g17, "getSubstitution(...)");
        this.f540463c = f26.v2.e(s16.f.b(g17, false, 1, null));
        this.f540465e = jz5.h.b(new y16.a0(this));
    }

    @Override // y16.s
    public java.util.Set a() {
        return this.f540462b.a();
    }

    @Override // y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return h(this.f540462b.b(name, location));
    }

    @Override // y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return h(this.f540462b.c(name, location));
    }

    @Override // y16.s
    public java.util.Set d() {
        return this.f540462b.d();
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        o06.j e17 = this.f540462b.e(name, location);
        if (e17 != null) {
            return (o06.j) i(e17);
        }
        return null;
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return (java.util.Collection) ((jz5.n) this.f540465e).mo141623x754a37bb();
    }

    @Override // y16.s
    public java.util.Set g() {
        return this.f540462b.g();
    }

    public final java.util.Collection h(java.util.Collection collection) {
        if (this.f540463c.h() || collection.isEmpty()) {
            return collection;
        }
        int size = collection.size();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(size >= 3 ? size + (size / 3) + 1 : 3);
        java.util.Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(i((o06.m) it.next()));
        }
        return linkedHashSet;
    }

    public final o06.m i(o06.m mVar) {
        f26.v2 v2Var = this.f540463c;
        if (v2Var.h()) {
            return mVar;
        }
        if (this.f540464d == null) {
            this.f540464d = new java.util.HashMap();
        }
        java.util.Map map = this.f540464d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        java.lang.Object obj = map.get(mVar);
        if (obj == null) {
            if (!(mVar instanceof o06.a2)) {
                throw new java.lang.IllegalStateException(("Unknown descriptor in scope: " + mVar).toString());
            }
            obj = ((o06.a2) mVar).d(v2Var);
            if (obj == null) {
                throw new java.lang.AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + mVar + " substitution fails");
            }
            map.put(mVar, obj);
        }
        return (o06.m) obj;
    }
}

package b16;

/* loaded from: classes16.dex */
public final class q0 extends b16.n1 {

    /* renamed from: n, reason: collision with root package name */
    public final e16.r f17227n;

    /* renamed from: o, reason: collision with root package name */
    public final b16.i0 f17228o;

    /* renamed from: p, reason: collision with root package name */
    public final e26.y f17229p;

    /* renamed from: q, reason: collision with root package name */
    public final e26.w f17230q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(a16.l c17, e16.r jPackage, b16.i0 ownerDescriptor) {
        super(c17);
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(jPackage, "jPackage");
        kotlin.jvm.internal.o.g(ownerDescriptor, "ownerDescriptor");
        this.f17227n = jPackage;
        this.f17228o = ownerDescriptor;
        a16.d dVar = c17.f649a;
        this.f17229p = ((e26.u) dVar.f615a).e(new b16.p0(c17, this));
        this.f17230q = ((e26.u) dVar.f615a).d(new b16.o0(this, c17));
    }

    @Override // b16.f1, y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return kz5.p0.f313996d;
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        return v(name, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002d A[SYNTHETIC] */
    @Override // b16.f1, y16.t, y16.w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.Collection f(y16.i r5, yz5.l r6) {
        /*
            r4 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.o.g(r6, r0)
            y16.h r0 = y16.i.f458943c
            int r0 = y16.i.f458952l
            int r1 = y16.i.f458945e
            r0 = r0 | r1
            boolean r5 = r5.a(r0)
            if (r5 != 0) goto L1a
            kz5.p0 r5 = kz5.p0.f313996d
            goto L5f
        L1a:
            e26.x r5 = r4.f17165d
            e26.o r5 = (e26.o) r5
            java.lang.Object r5 = r5.invoke()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L2d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            r2 = r1
            o06.m r2 = (o06.m) r2
            boolean r3 = r2 instanceof o06.g
            if (r3 == 0) goto L57
            o06.g r2 = (o06.g) r2
            n16.g r2 = r2.getName()
            java.lang.String r3 = "getName(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            java.lang.Object r2 = r6.invoke(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L57
            r2 = 1
            goto L58
        L57:
            r2 = 0
        L58:
            if (r2 == 0) goto L2d
            r0.add(r1)
            goto L2d
        L5e:
            r5 = r0
        L5f:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b16.q0.f(y16.i, yz5.l):java.util.Collection");
    }

    @Override // b16.f1
    public java.util.Set h(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        y16.h hVar = y16.i.f458943c;
        if (!kindFilter.a(y16.i.f458945e)) {
            return kz5.r0.f314002d;
        }
        java.util.Set set = (java.util.Set) ((e26.m) this.f17229p).invoke();
        if (set != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                hashSet.add(n16.g.k((java.lang.String) it.next()));
            }
            return hashSet;
        }
        if (lVar == null) {
            int i17 = o26.l.f342604a;
        }
        ((u06.h0) this.f17227n).getClass();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        kz5.o0 o0Var = kz5.o0.f313993d;
        while (o0Var.hasNext()) {
            e16.g gVar = (e16.g) o0Var.next();
            gVar.getClass();
            e16.z[] zVarArr = e16.z.f246452d;
            linkedHashSet.add(((u06.x) gVar).f());
        }
        return linkedHashSet;
    }

    @Override // b16.f1
    public java.util.Set i(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        return kz5.r0.f314002d;
    }

    @Override // b16.f1
    public b16.d k() {
        return b16.c.f17141a;
    }

    @Override // b16.f1
    public void m(java.util.Collection result, n16.g name) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(name, "name");
    }

    @Override // b16.f1
    public java.util.Set o(y16.i kindFilter, yz5.l lVar) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        return kz5.r0.f314002d;
    }

    @Override // b16.f1
    public o06.m q() {
        return this.f17228o;
    }

    public final o06.g v(n16.g name, e16.g gVar) {
        n16.g gVar2 = n16.i.f334173a;
        kotlin.jvm.internal.o.g(name, "name");
        java.lang.String h17 = name.h();
        kotlin.jvm.internal.o.f(h17, "asString(...)");
        if (!((h17.length() > 0) && !name.f334170e)) {
            return null;
        }
        java.util.Set set = (java.util.Set) ((e26.m) this.f17229p).invoke();
        if (gVar != null || set == null || set.contains(name.h())) {
            return (o06.g) ((e26.q) this.f17230q).invoke(new b16.j0(name, gVar));
        }
        return null;
    }
}

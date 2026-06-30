package d26;

/* loaded from: classes16.dex */
public final class h extends d26.l0 {

    /* renamed from: g, reason: collision with root package name */
    public final g26.l f307528g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.x f307529h;

    /* renamed from: i, reason: collision with root package name */
    public final e26.x f307530i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ d26.x f307531j;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(d26.x r8, g26.l r9) {
        /*
            r7 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r0)
            r7.f307531j = r8
            b26.t r2 = r8.f307593r
            i16.o r0 = r8.f307586h
            java.util.List r3 = r0.f369188w
            java.lang.String r1 = "getFunctionList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r1)
            java.util.List r4 = r0.f369189x
            java.lang.String r1 = "getPropertyList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r1)
            java.util.List r5 = r0.f369190y
            java.lang.String r1 = "getTypeAliasList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r1)
            java.util.List r0 = r0.f369182q
            java.lang.String r1 = "getNestedClassNameList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            b26.t r8 = r8.f307593r
            k16.g r8 = r8.f99049b
            java.util.ArrayList r1 = new java.util.ArrayList
            r6 = 10
            int r6 = kz5.d0.q(r0, r6)
            r1.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
        L3a:
            boolean r6 = r0.hasNext()
            if (r6 == 0) goto L52
            java.lang.Object r6 = r0.next()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            n16.g r6 = b26.t0.b(r8, r6)
            r1.add(r6)
            goto L3a
        L52:
            d26.d r6 = new d26.d
            r6.<init>(r1)
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.f307528g = r9
            b26.t r8 = r7.f307554b
            b26.q r8 = r8.f99048a
            e26.c0 r8 = r8.f99016a
            d26.e r9 = new d26.e
            r9.<init>(r7)
            e26.u r8 = (e26.u) r8
            e26.x r8 = r8.b(r9)
            r7.f307529h = r8
            b26.t r8 = r7.f307554b
            b26.q r8 = r8.f99048a
            e26.c0 r8 = r8.f99016a
            d26.g r9 = new d26.g
            r9.<init>(r7)
            e26.u r8 = (e26.u) r8
            e26.x r8 = r8.b(r9)
            r7.f307530i = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.h.<init>(d26.x, g26.l):void");
    }

    @Override // d26.l0, y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        s(name, location);
        return super.b(name, location);
    }

    @Override // d26.l0, y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        s(name, location);
        return super.c(name, location);
    }

    @Override // d26.l0, y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        o06.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        s(name, location);
        d26.n nVar = this.f307531j.f307597v;
        return (nVar == null || (gVar = (o06.g) ((e26.q) nVar.f307563b).mo146xb9724478(name)) == null) ? super.e(name, location) : gVar;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        return (java.util.Collection) ((e26.o) this.f307529h).mo152xb9724478();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r1v3, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.ArrayList] */
    @Override // d26.l0
    public void h(java.util.Collection result, yz5.l nameFilter) {
        ?? r17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        d26.n nVar = this.f307531j.f307597v;
        if (nVar != null) {
            java.util.Set<n16.g> keySet = ((java.util.LinkedHashMap) nVar.f307562a).keySet();
            r17 = new java.util.ArrayList();
            for (n16.g name : keySet) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
                o06.g gVar = (o06.g) ((e26.q) nVar.f307563b).mo146xb9724478(name);
                if (gVar != null) {
                    r17.add(gVar);
                }
            }
        } else {
            r17 = 0;
        }
        if (r17 == 0) {
            r17 = kz5.p0.f395529d;
        }
        result.addAll(r17);
    }

    @Override // d26.l0
    public void j(n16.g name, java.util.List functions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functions, "functions");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.Collection) ((e26.o) this.f307530i).mo152xb9724478()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((f26.o0) it.next()).V().b(name, w06.d.f523481f));
        }
        b26.t tVar = this.f307554b;
        functions.addAll(tVar.f99048a.f99029n.d(name, this.f307531j));
        ((g26.v) tVar.f99048a.f99032q).f349550e.h(name, arrayList, new java.util.ArrayList(functions), this.f307531j, new d26.f(functions));
    }

    @Override // d26.l0
    public void k(n16.g name, java.util.List descriptors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptors, "descriptors");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.Collection) ((e26.o) this.f307530i).mo152xb9724478()).iterator();
        while (it.hasNext()) {
            arrayList.addAll(((f26.o0) it.next()).V().c(name, w06.d.f523481f));
        }
        ((g26.v) this.f307554b.f99048a.f99032q).f349550e.h(name, arrayList, new java.util.ArrayList(descriptors), this.f307531j, new d26.f(descriptors));
    }

    @Override // d26.l0
    public n16.b l(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return this.f307531j.f307589n.d(name);
    }

    @Override // d26.l0
    public java.util.Set n() {
        java.util.List a17 = this.f307531j.f307595t.a();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            java.util.Set d17 = ((f26.o0) it.next()).V().d();
            if (d17 == null) {
                return null;
            }
            kz5.h0.u(linkedHashSet, d17);
        }
        return linkedHashSet;
    }

    @Override // d26.l0
    public java.util.Set o() {
        d26.x xVar = this.f307531j;
        java.util.List a17 = xVar.f307595t.a();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().a());
        }
        linkedHashSet.addAll(this.f307554b.f99048a.f99029n.a(xVar));
        return linkedHashSet;
    }

    @Override // d26.l0
    public java.util.Set p() {
        java.util.List a17 = this.f307531j.f307595t.a();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.Iterator it = a17.iterator();
        while (it.hasNext()) {
            kz5.h0.u(linkedHashSet, ((f26.o0) it.next()).V().g());
        }
        return linkedHashSet;
    }

    @Override // d26.l0
    public boolean r(o06.v1 function) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        return this.f307554b.f99048a.f99030o.c(this.f307531j, function);
    }

    public void s(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(this.f307554b.f99048a.f99024i, "<this>");
        d26.x scopeOwner = this.f307531j;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scopeOwner, "scopeOwner");
    }
}

package y16;

/* loaded from: classes16.dex */
public final class m extends y16.t {

    /* renamed from: b, reason: collision with root package name */
    public final y16.s f540501b;

    public m(y16.s workerScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(workerScope, "workerScope");
        this.f540501b = workerScope;
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        return this.f540501b.a();
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        return this.f540501b.d();
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        o06.j e17 = this.f540501b.e(name, location);
        if (e17 == null) {
            return null;
        }
        o06.g gVar = e17 instanceof o06.g ? (o06.g) e17 : null;
        if (gVar != null) {
            return gVar;
        }
        if (e17 instanceof o06.d2) {
            return (o06.d2) e17;
        }
        return null;
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        int i17 = y16.i.f540485l & kindFilter.f540494b;
        y16.i iVar = i17 == 0 ? null : new y16.i(i17, kindFilter.f540493a);
        if (iVar == null) {
            return kz5.p0.f395529d;
        }
        java.util.Collection f17 = this.f540501b.f(iVar, nameFilter);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : f17) {
            if (obj instanceof o06.k) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        return this.f540501b.g();
    }

    /* renamed from: toString */
    public java.lang.String m176401x9616526c() {
        return "Classes from " + this.f540501b;
    }
}

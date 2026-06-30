package y16;

/* loaded from: classes16.dex */
public final class h0 extends y16.a {

    /* renamed from: c, reason: collision with root package name */
    public static final y16.d0 f540474c = new y16.d0(null);

    /* renamed from: b, reason: collision with root package name */
    public final y16.s f540475b;

    public h0(java.lang.String str, y16.s sVar, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this.f540475b = sVar;
    }

    @Override // y16.a, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return r16.b0.a(super.b(name, location), y16.f0.f540470d);
    }

    @Override // y16.a, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return r16.b0.a(super.c(name, location), y16.g0.f540473d);
    }

    @Override // y16.a, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        java.util.Collection f17 = super.f(kindFilter, nameFilter);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : f17) {
            if (((o06.m) obj) instanceof o06.b) {
                arrayList.add(obj);
            } else {
                arrayList2.add(obj);
            }
        }
        return kz5.n0.t0(r16.b0.a(arrayList, y16.e0.f540469d), arrayList2);
    }

    @Override // y16.a
    public y16.s i() {
        return this.f540475b;
    }
}

package d26;

/* loaded from: classes16.dex */
public abstract class l0 extends y16.t {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f307553f = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d26.l0.class), "classNames", "getClassNames$deserialization()Ljava/util/Set;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(d26.l0.class), "classifierNamesLazy", "getClassifierNamesLazy()Ljava/util/Set;"))};

    /* renamed from: b, reason: collision with root package name */
    public final b26.t f307554b;

    /* renamed from: c, reason: collision with root package name */
    public final d26.b0 f307555c;

    /* renamed from: d, reason: collision with root package name */
    public final e26.x f307556d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.y f307557e;

    public l0(b26.t c17, java.util.List functionList, java.util.List propertyList, java.util.List typeAliasList, yz5.a classNames) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(c17, "c");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionList, "functionList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(propertyList, "propertyList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(typeAliasList, "typeAliasList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classNames, "classNames");
        this.f307554b = c17;
        b26.q qVar = c17.f99048a;
        qVar.f99018c.getClass();
        this.f307555c = new d26.i0(this, functionList, propertyList, typeAliasList);
        this.f307556d = ((e26.u) qVar.f99016a).b(new d26.j0(classNames));
        this.f307557e = ((e26.u) qVar.f99016a).e(new d26.k0(this));
    }

    @Override // y16.t, y16.s
    public java.util.Set a() {
        d26.i0 i0Var = (d26.i0) this.f307555c;
        return (java.util.Set) e26.b0.a(i0Var.f307542g, i0Var, d26.i0.f307535j[0]);
    }

    @Override // y16.t, y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return ((d26.i0) this.f307555c).a(name, location);
    }

    @Override // y16.t, y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        return ((d26.i0) this.f307555c).b(name, location);
    }

    @Override // y16.t, y16.s
    public java.util.Set d() {
        e26.y yVar = this.f307557e;
        f06.v p17 = f307553f[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p17, "p");
        return (java.util.Set) ((e26.m) yVar).mo152xb9724478();
    }

    @Override // y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        if (q(name)) {
            return this.f307554b.f99048a.b(l(name));
        }
        d26.i0 i0Var = (d26.i0) this.f307555c;
        if (!((java.util.LinkedHashMap) i0Var.f307538c).keySet().contains(name)) {
            return null;
        }
        i0Var.getClass();
        return (o06.d2) ((e26.q) i0Var.f307541f).mo146xb9724478(name);
    }

    @Override // y16.t, y16.s
    public java.util.Set g() {
        d26.i0 i0Var = (d26.i0) this.f307555c;
        return (java.util.Set) e26.b0.a(i0Var.f307543h, i0Var, d26.i0.f307535j[1]);
    }

    public abstract void h(java.util.Collection collection, yz5.l lVar);

    public final java.util.Collection i(y16.i kindFilter, yz5.l nameFilter, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        java.util.ArrayList arrayList = new java.util.ArrayList(0);
        if (kindFilter.a(y16.i.f540479f)) {
            h(arrayList, nameFilter);
        }
        d26.i0 i0Var = (d26.i0) this.f307555c;
        i0Var.getClass();
        boolean a17 = kindFilter.a(y16.i.f540483j);
        r16.n nVar = r16.n.f450201d;
        if (a17) {
            java.util.Set<n16.g> set = (java.util.Set) e26.b0.a(i0Var.f307543h, i0Var, d26.i0.f307535j[1]);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            for (n16.g gVar : set) {
                if (((java.lang.Boolean) nameFilter.mo146xb9724478(gVar)).booleanValue()) {
                    arrayList2.addAll(i0Var.b(gVar, location));
                }
            }
            kz5.g0.t(arrayList2, nVar);
            arrayList.addAll(arrayList2);
        }
        if (kindFilter.a(y16.i.f540482i)) {
            java.util.Set<n16.g> set2 = (java.util.Set) e26.b0.a(i0Var.f307542g, i0Var, d26.i0.f307535j[0]);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            for (n16.g gVar2 : set2) {
                if (((java.lang.Boolean) nameFilter.mo146xb9724478(gVar2)).booleanValue()) {
                    arrayList3.addAll(i0Var.a(gVar2, location));
                }
            }
            kz5.g0.t(arrayList3, nVar);
            arrayList.addAll(arrayList3);
        }
        if (kindFilter.a(y16.i.f540485l)) {
            for (n16.g gVar3 : m()) {
                if (((java.lang.Boolean) nameFilter.mo146xb9724478(gVar3)).booleanValue()) {
                    o26.a.a(arrayList, this.f307554b.f99048a.b(l(gVar3)));
                }
            }
        }
        if (kindFilter.a(y16.i.f540480g)) {
            for (java.lang.Object name : ((java.util.LinkedHashMap) i0Var.f307538c).keySet()) {
                if (((java.lang.Boolean) nameFilter.mo146xb9724478(name)).booleanValue()) {
                    i0Var.getClass();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
                    o26.a.a(arrayList, (o06.d2) ((e26.q) i0Var.f307541f).mo146xb9724478(name));
                }
            }
        }
        return o26.a.b(arrayList);
    }

    public void j(n16.g name, java.util.List functions) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functions, "functions");
    }

    public void k(n16.g name, java.util.List descriptors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(descriptors, "descriptors");
    }

    public abstract n16.b l(n16.g gVar);

    public final java.util.Set m() {
        return (java.util.Set) e26.b0.a(this.f307556d, this, f307553f[0]);
    }

    public abstract java.util.Set n();

    public abstract java.util.Set o();

    public abstract java.util.Set p();

    public boolean q(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return m().contains(name);
    }

    public boolean r(o06.v1 function) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(function, "function");
        return true;
    }
}

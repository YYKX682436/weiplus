package b16;

/* loaded from: classes16.dex */
public final class g implements y16.s {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f17174f = {kotlin.jvm.internal.i0.e(new kotlin.jvm.internal.a0(kotlin.jvm.internal.i0.a(b16.g.class), "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};

    /* renamed from: b, reason: collision with root package name */
    public final a16.l f17175b;

    /* renamed from: c, reason: collision with root package name */
    public final b16.i0 f17176c;

    /* renamed from: d, reason: collision with root package name */
    public final b16.q0 f17177d;

    /* renamed from: e, reason: collision with root package name */
    public final e26.x f17178e;

    public g(a16.l c17, e16.r jPackage, b16.i0 packageFragment) {
        kotlin.jvm.internal.o.g(c17, "c");
        kotlin.jvm.internal.o.g(jPackage, "jPackage");
        kotlin.jvm.internal.o.g(packageFragment, "packageFragment");
        this.f17175b = c17;
        this.f17176c = packageFragment;
        this.f17177d = new b16.q0(c17, jPackage, packageFragment);
        this.f17178e = ((e26.u) c17.f649a.f615a).b(new b16.f(this));
    }

    @Override // y16.s
    public java.util.Set a() {
        y16.s[] h17 = h();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (y16.s sVar : h17) {
            kz5.h0.u(linkedHashSet, sVar.a());
        }
        linkedHashSet.addAll(this.f17177d.a());
        return linkedHashSet;
    }

    @Override // y16.s
    public java.util.Collection b(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        i(name, location);
        y16.s[] h17 = h();
        java.util.Collection b17 = this.f17177d.b(name, location);
        for (y16.s sVar : h17) {
            b17 = n26.a.a(b17, sVar.b(name, location));
        }
        return b17 == null ? kz5.r0.f314002d : b17;
    }

    @Override // y16.s
    public java.util.Collection c(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        i(name, location);
        y16.s[] h17 = h();
        java.util.Collection c17 = this.f17177d.c(name, location);
        for (y16.s sVar : h17) {
            c17 = n26.a.a(c17, sVar.c(name, location));
        }
        return c17 == null ? kz5.r0.f314002d : c17;
    }

    @Override // y16.s
    public java.util.Set d() {
        java.util.Set a17 = y16.u.a(kz5.z.B(h()));
        if (a17 == null) {
            return null;
        }
        a17.addAll(this.f17177d.d());
        return a17;
    }

    @Override // y16.w
    public o06.j e(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        i(name, location);
        b16.q0 q0Var = this.f17177d;
        q0Var.getClass();
        o06.j jVar = null;
        o06.g v17 = q0Var.v(name, null);
        if (v17 != null) {
            return v17;
        }
        for (y16.s sVar : h()) {
            o06.j e17 = sVar.e(name, location);
            if (e17 != null) {
                if (!(e17 instanceof o06.k) || !((o06.k) e17).l0()) {
                    return e17;
                }
                if (jVar == null) {
                    jVar = e17;
                }
            }
        }
        return jVar;
    }

    @Override // y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        kotlin.jvm.internal.o.g(kindFilter, "kindFilter");
        kotlin.jvm.internal.o.g(nameFilter, "nameFilter");
        y16.s[] h17 = h();
        java.util.Collection f17 = this.f17177d.f(kindFilter, nameFilter);
        for (y16.s sVar : h17) {
            f17 = n26.a.a(f17, sVar.f(kindFilter, nameFilter));
        }
        return f17 == null ? kz5.r0.f314002d : f17;
    }

    @Override // y16.s
    public java.util.Set g() {
        y16.s[] h17 = h();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        for (y16.s sVar : h17) {
            kz5.h0.u(linkedHashSet, sVar.g());
        }
        linkedHashSet.addAll(this.f17177d.g());
        return linkedHashSet;
    }

    public final y16.s[] h() {
        return (y16.s[]) e26.b0.a(this.f17178e, this, f17174f[0]);
    }

    public void i(n16.g name, w06.a location) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(location, "location");
        v06.a.a(this.f17175b.f649a.f628n, location, this.f17176c, name);
    }

    public java.lang.String toString() {
        return "scope for " + this.f17176c;
    }
}

package o06;

/* loaded from: classes16.dex */
public final class z0 extends r06.s {

    /* renamed from: n, reason: collision with root package name */
    public final boolean f423543n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f423544o;

    /* renamed from: p, reason: collision with root package name */
    public final f26.q f423545p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(e26.c0 storageManager, o06.m container, n16.g name, boolean z17, int i17) {
        super(storageManager, container, name, o06.x1.f423537a, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(container, "container");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        this.f423543n = z17;
        e06.k m17 = e06.p.m(0, i17);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(m17, 10));
        java.util.Iterator it = m17.iterator();
        while (it.hasNext()) {
            int b17 = ((kz5.x0) it).b();
            int i18 = p06.k.Z0;
            arrayList.add(r06.p1.x0(this, p06.i.f432298a, false, f26.d3.f340676f, n16.g.k(p012xc85e97e9.p085x39fce629.p086x62f6fe4.C1098xe10e35e9.f2960xe17f46c3 + b17), b17, storageManager));
        }
        this.f423544o = arrayList;
        this.f423545p = new f26.q(this, o06.i2.b(this), kz5.o1.c(v16.f.j(this).h().f()), storageManager);
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return y16.r.f540506b;
    }

    @Override // o06.g
    public java.util.Collection S() {
        return kz5.r0.f395535d;
    }

    @Override // o06.g
    public java.util.Collection T() {
        return kz5.p0.f395529d;
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return o06.t0.f423518e;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f423545p;
    }

    @Override // o06.g
    public boolean g0() {
        return false;
    }

    @Override // p06.a
    /* renamed from: getAnnotations */
    public p06.k mo9601xa083c1ee() {
        int i17 = p06.k.Z0;
        return p06.i.f432298a;
    }

    @Override // o06.g, o06.q, o06.r0
    /* renamed from: getVisibility */
    public o06.g0 mo9617x61f71b08() {
        o06.g0 PUBLIC = o06.f0.f423478e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(PUBLIC, "PUBLIC");
        return PUBLIC;
    }

    @Override // o06.g
    public boolean h0() {
        return false;
    }

    @Override // r06.s, o06.r0
    /* renamed from: isExternal */
    public boolean mo123388x64310b15() {
        return false;
    }

    @Override // o06.g
    /* renamed from: isInline */
    public boolean mo9618xe19a9463() {
        return false;
    }

    @Override // o06.g
    public o06.h j() {
        return o06.h.f423493d;
    }

    @Override // o06.g
    public boolean k0() {
        return false;
    }

    @Override // o06.r0
    public boolean l0() {
        return false;
    }

    @Override // o06.g, o06.k
    public java.util.List m() {
        return this.f423544o;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ y16.s m0() {
        return y16.r.f540506b;
    }

    @Override // o06.k
    public boolean p() {
        return this.f423543n;
    }

    @Override // o06.g
    public o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m150399x9616526c() {
        return "class " + mo132800xfb82e301() + " (not found)";
    }
}

package m06;

/* loaded from: classes16.dex */
public final class c extends r06.e {

    /* renamed from: r, reason: collision with root package name */
    public static final n16.b f404125r = new n16.b(l06.x.f396489k, n16.g.k("Function"));

    /* renamed from: s, reason: collision with root package name */
    public static final n16.b f404126s = new n16.b(l06.x.f396487i, n16.g.k("KFunction"));

    /* renamed from: h, reason: collision with root package name */
    public final e26.c0 f404127h;

    /* renamed from: i, reason: collision with root package name */
    public final o06.d1 f404128i;

    /* renamed from: m, reason: collision with root package name */
    public final m06.m f404129m;

    /* renamed from: n, reason: collision with root package name */
    public final int f404130n;

    /* renamed from: o, reason: collision with root package name */
    public final m06.b f404131o;

    /* renamed from: p, reason: collision with root package name */
    public final m06.f f404132p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f404133q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e26.c0 storageManager, o06.d1 containingDeclaration, m06.m functionTypeKind, int i17) {
        super(storageManager, functionTypeKind.a(i17));
        p06.k kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containingDeclaration, "containingDeclaration");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionTypeKind, "functionTypeKind");
        this.f404127h = storageManager;
        this.f404128i = containingDeclaration;
        this.f404129m = functionTypeKind;
        this.f404130n = i17;
        this.f404131o = new m06.b(this);
        this.f404132p = new m06.f(storageManager, this);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        e06.k kVar2 = new e06.k(1, i17);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(kVar2, 10));
        kz5.x0 it = kVar2.iterator();
        while (true) {
            boolean z17 = ((e06.j) it).f327747f;
            kVar = p06.i.f432298a;
            if (!z17) {
                break;
            }
            int b17 = it.b();
            arrayList.add(r06.p1.x0(this, kVar, false, f26.d3.f340677g, n16.g.k("P" + b17), arrayList.size(), this.f404127h));
            arrayList2.add(jz5.f0.f384359a);
        }
        arrayList.add(r06.p1.x0(this, kVar, false, f26.d3.f340678h, n16.g.k("R"), arrayList.size(), this.f404127h));
        this.f404133q = kz5.n0.S0(arrayList);
        m06.d dVar = m06.e.f404134d;
        m06.m functionTypeKind2 = this.f404129m;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionTypeKind2, "functionTypeKind");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(functionTypeKind2, m06.i.f404136c) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(functionTypeKind2, m06.l.f404139c) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(functionTypeKind2, m06.j.f404137c)) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(functionTypeKind2, m06.k.f404138c);
    }

    @Override // r06.s0
    public y16.s P(g26.l kotlinTypeRefiner) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this.f404132p;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ java.util.Collection S() {
        return kz5.p0.f395529d;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ java.util.Collection T() {
        return kz5.p0.f395529d;
    }

    @Override // o06.g
    public o06.j2 d0() {
        return null;
    }

    @Override // o06.m
    public o06.m e() {
        return this.f404128i;
    }

    @Override // o06.r0
    public boolean e0() {
        return false;
    }

    @Override // o06.g, o06.r0
    public o06.t0 f() {
        return o06.t0.f423521h;
    }

    @Override // o06.j
    public f26.c2 g() {
        return this.f404131o;
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

    @Override // o06.p
    /* renamed from: getSource */
    public o06.x1 mo9602x2fa78b11() {
        return o06.x1.f423537a;
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

    @Override // o06.r0
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
        return o06.h.f423494e;
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
        return this.f404133q;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ y16.s m0() {
        return y16.r.f540506b;
    }

    @Override // o06.k
    public boolean p() {
        return false;
    }

    @Override // o06.g
    public /* bridge */ /* synthetic */ o06.f s() {
        return null;
    }

    @Override // o06.g
    public boolean t0() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m146598x9616526c() {
        java.lang.String h17 = mo132800xfb82e301().h();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(h17, "asString(...)");
        return h17;
    }
}

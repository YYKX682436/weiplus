package r06;

/* loaded from: classes15.dex */
public final class x0 extends r06.v implements o06.v0 {

    /* renamed from: f, reason: collision with root package name */
    public final e26.c0 f450081f;

    /* renamed from: g, reason: collision with root package name */
    public final l06.o f450082g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Map f450083h;

    /* renamed from: i, reason: collision with root package name */
    public final r06.c1 f450084i;

    /* renamed from: m, reason: collision with root package name */
    public r06.t0 f450085m;

    /* renamed from: n, reason: collision with root package name */
    public o06.e1 f450086n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f450087o;

    /* renamed from: p, reason: collision with root package name */
    public final e26.v f450088p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f450089q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(n16.g moduleName, e26.c0 storageManager, l06.o builtIns, o16.a aVar, java.util.Map capabilities, n16.g gVar, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        super(p06.i.f432298a, moduleName);
        capabilities = (i17 & 16) != 0 ? kz5.q0.f395534d : capabilities;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builtIns, "builtIns");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(capabilities, "capabilities");
        int i18 = p06.k.Z0;
        this.f450081f = storageManager;
        this.f450082g = builtIns;
        if (!moduleName.f415703e) {
            throw new java.lang.IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f450083h = capabilities;
        r06.c1.f449909a.getClass();
        r06.c1 c1Var = (r06.c1) I(r06.a1.f449903b);
        this.f450084i = c1Var == null ? r06.b1.f449906b : c1Var;
        this.f450087o = true;
        this.f450088p = ((e26.u) storageManager).c(new r06.w0(this));
        this.f450089q = jz5.h.b(new r06.v0(this));
    }

    @Override // o06.v0
    public java.lang.Object I(o06.u0 capability) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(capability, "capability");
        java.lang.Object obj = this.f450083h.get(capability);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    @Override // o06.v0
    public java.util.List K() {
        r06.t0 t0Var = this.f450085m;
        if (t0Var != null) {
            return ((r06.u0) t0Var).f450072c;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Dependencies of module ");
        java.lang.String str = mo132800xfb82e301().f415702d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        sb6.append(str);
        sb6.append(" were not set");
        throw new java.lang.AssertionError(sb6.toString());
    }

    @Override // o06.v0
    public o06.k1 Q(n16.c fqName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        j0();
        return (o06.k1) ((e26.r) this.f450088p).mo146xb9724478(fqName);
    }

    @Override // o06.v0
    public boolean b0(o06.v0 targetModule) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetModule, "targetModule");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this, targetModule)) {
            return true;
        }
        r06.t0 t0Var = this.f450085m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(t0Var);
        return kz5.n0.O(((r06.u0) t0Var).f450071b, targetModule) || K().contains(targetModule) || targetModule.K().contains(this);
    }

    @Override // o06.m
    public o06.m e() {
        return null;
    }

    @Override // o06.v0
    public l06.o h() {
        return this.f450082g;
    }

    public void j0() {
        if (this.f450087o) {
            return;
        }
        o06.u0 u0Var = o06.q0.f423512a;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(I(o06.q0.f423512a));
        throw new o06.p0("Accessing invalid module descriptor " + this);
    }

    @Override // o06.v0
    public java.util.Collection l(n16.c fqName, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        j0();
        j0();
        return ((r06.u) ((jz5.n) this.f450089q).mo141623x754a37bb()).l(fqName, nameFilter);
    }

    @Override // r06.v
    /* renamed from: toString */
    public java.lang.String mo9603x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(r06.v.P(this));
        if (!this.f450087o) {
            sb6.append(" !isValid");
        }
        sb6.append(" packageFragmentProvider: ");
        o06.e1 e1Var = this.f450086n;
        sb6.append(e1Var != null ? e1Var.getClass().getSimpleName() : null);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        return visitor.d(this, obj);
    }
}

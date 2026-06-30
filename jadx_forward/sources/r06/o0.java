package r06;

/* loaded from: classes15.dex */
public class o0 extends r06.v implements o06.k1 {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f450027n = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(r06.o0.class), "fragments", "getFragments()Ljava/util/List;")), p3321xbce91901.jvm.p3324x21ffc6bd.i0.e(new p3321xbce91901.jvm.p3324x21ffc6bd.a0(p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(r06.o0.class), "empty", "getEmpty()Z"))};

    /* renamed from: f, reason: collision with root package name */
    public final r06.x0 f450028f;

    /* renamed from: g, reason: collision with root package name */
    public final n16.c f450029g;

    /* renamed from: h, reason: collision with root package name */
    public final e26.x f450030h;

    /* renamed from: i, reason: collision with root package name */
    public final e26.x f450031i;

    /* renamed from: m, reason: collision with root package name */
    public final y16.s f450032m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(r06.x0 module, n16.c fqName, e26.c0 storageManager) {
        super(p06.i.f432298a, fqName.g());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        int i17 = p06.k.Z0;
        this.f450028f = module;
        this.f450029g = fqName;
        e26.u uVar = (e26.u) storageManager;
        this.f450030h = uVar.b(new r06.m0(this));
        this.f450031i = uVar.b(new r06.l0(this));
        this.f450032m = new y16.o(storageManager, new r06.n0(this));
    }

    @Override // o06.m
    public o06.m e() {
        n16.c cVar = this.f450029g;
        if (cVar.d()) {
            return null;
        }
        n16.c e17 = cVar.e();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "parent(...)");
        return this.f450028f.Q(e17);
    }

    /* renamed from: equals */
    public boolean m161257xb2c87fbf(java.lang.Object obj) {
        o06.k1 k1Var = obj instanceof o06.k1 ? (o06.k1) obj : null;
        if (k1Var == null) {
            return false;
        }
        r06.o0 o0Var = (r06.o0) k1Var;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f450029g, o0Var.f450029g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f450028f, o0Var.f450028f);
    }

    /* renamed from: hashCode */
    public int m161258x8cdac1b() {
        return (this.f450028f.hashCode() * 31) + this.f450029g.m148885x8cdac1b();
    }

    @Override // o06.m
    public java.lang.Object w(o06.o visitor, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(visitor, "visitor");
        return visitor.j(this, obj);
    }
}

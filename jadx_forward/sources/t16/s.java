package t16;

/* loaded from: classes15.dex */
public final class s implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final long f496155a;

    /* renamed from: b, reason: collision with root package name */
    public final o06.v0 f496156b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f496157c;

    /* renamed from: d, reason: collision with root package name */
    public final f26.z0 f496158d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f496159e;

    public s(long j17, o06.v0 v0Var, java.util.Set set, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        f26.r1.f340747e.getClass();
        this.f496158d = f26.r0.b(f26.r1.f340748f, this, false);
        this.f496159e = jz5.h.b(new t16.q(this));
        this.f496155a = j17;
        this.f496156b = v0Var;
        this.f496157c = set;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        return (java.util.List) this.f496159e.mo141623x754a37bb();
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        return kz5.p0.f395529d;
    }

    @Override // f26.c2
    public l06.o h() {
        return this.f496156b.h();
    }

    @Override // f26.c2
    public o06.j i() {
        return null;
    }

    @Override // f26.c2
    public boolean j() {
        return false;
    }

    /* renamed from: toString */
    public java.lang.String m165636x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("IntegerLiteralType");
        sb6.append("[" + kz5.n0.g0(this.f496157c, ",", null, null, 0, null, t16.r.f496154d, 30, null) + ']');
        return sb6.toString();
    }
}

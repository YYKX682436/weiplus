package r06;

/* loaded from: classes16.dex */
public final class k implements f26.c2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r06.l f450007a;

    public k(r06.l lVar) {
        this.f450007a = lVar;
    }

    @Override // f26.c2
    public java.util.Collection a() {
        java.util.Collection a17 = ((d26.p0) this.f450007a).v0().w0().a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getSupertypes(...)");
        return a17;
    }

    @Override // f26.c2
    /* renamed from: getParameters */
    public java.util.List mo9613x99879e0() {
        java.util.List list = ((d26.p0) this.f450007a).f307576v;
        if (list != null) {
            return list;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("typeConstructorParameters");
        throw null;
    }

    @Override // f26.c2
    public l06.o h() {
        return v16.f.e(this.f450007a);
    }

    @Override // f26.c2
    public o06.j i() {
        return this.f450007a;
    }

    @Override // f26.c2
    public boolean j() {
        return true;
    }

    /* renamed from: toString */
    public java.lang.String m161253x9616526c() {
        return "[typealias " + this.f450007a.mo132800xfb82e301().h() + ']';
    }
}

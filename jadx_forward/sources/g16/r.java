package g16;

/* loaded from: classes15.dex */
public abstract class r implements g16.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.t f349186a;

    public r(g16.t tVar) {
        this.f349186a = tVar;
    }

    @Override // g16.m0
    public void b(n16.g gVar, java.lang.Object obj) {
        g(gVar, g16.t.u(this.f349186a, gVar, obj));
    }

    @Override // g16.m0
    public void c(n16.g gVar, n16.b enumClassId, n16.g enumEntryName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumClassId, "enumClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumEntryName, "enumEntryName");
        g(gVar, new t16.k(enumClassId, enumEntryName));
    }

    @Override // g16.m0
    public g16.n0 d(n16.g gVar) {
        return new g16.q(this.f349186a, gVar, this);
    }

    @Override // g16.m0
    public g16.m0 e(n16.g gVar, n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        return new g16.o(this.f349186a.q(classId, o06.x1.f423537a, arrayList), this, gVar, arrayList);
    }

    @Override // g16.m0
    public void f(n16.g gVar, t16.f value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        g(gVar, new t16.x(value));
    }

    public abstract void g(n16.g gVar, t16.g gVar2);
}

package g16;

/* loaded from: classes15.dex */
public final class p implements g16.m0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g16.m0 f349178a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g16.m0 f349179b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.q f349180c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f349181d;

    public p(g16.m0 m0Var, g16.q qVar, java.util.ArrayList arrayList) {
        this.f349179b = m0Var;
        this.f349180c = qVar;
        this.f349181d = arrayList;
        this.f349178a = m0Var;
    }

    @Override // g16.m0
    public void a() {
        this.f349179b.a();
        this.f349180c.f349182a.add(new t16.a((p06.c) kz5.n0.z0(this.f349181d)));
    }

    @Override // g16.m0
    public void b(n16.g gVar, java.lang.Object obj) {
        this.f349178a.b(gVar, obj);
    }

    @Override // g16.m0
    public void c(n16.g gVar, n16.b enumClassId, n16.g enumEntryName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumClassId, "enumClassId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enumEntryName, "enumEntryName");
        this.f349178a.c(gVar, enumClassId, enumEntryName);
    }

    @Override // g16.m0
    public g16.n0 d(n16.g gVar) {
        return this.f349178a.d(gVar);
    }

    @Override // g16.m0
    public g16.m0 e(n16.g gVar, n16.b classId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        return this.f349178a.e(gVar, classId);
    }

    @Override // g16.m0
    public void f(n16.g gVar, t16.f value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        this.f349178a.f(gVar, value);
    }
}

package g16;

/* loaded from: classes15.dex */
public abstract class c implements g16.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final g16.u0 f349129a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f349130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g16.d f349131c;

    public c(g16.d dVar, g16.u0 signature) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        this.f349131c = dVar;
        this.f349129a = signature;
        this.f349130b = new java.util.ArrayList();
    }

    @Override // g16.o0
    public void a() {
        java.util.ArrayList arrayList = this.f349130b;
        if (!arrayList.isEmpty()) {
            this.f349131c.f349135b.put(this.f349129a, arrayList);
        }
    }

    @Override // g16.o0
    public g16.m0 b(n16.b classId, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return this.f349131c.f349134a.r(classId, source, this.f349130b);
    }
}

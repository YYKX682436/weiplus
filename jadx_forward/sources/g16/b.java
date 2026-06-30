package g16;

/* loaded from: classes15.dex */
public final class b extends g16.c implements g16.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g16.d f349125d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g16.d dVar, g16.u0 signature) {
        super(dVar, signature);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        this.f349125d = dVar;
    }

    public g16.m0 c(int i17, n16.b classId, o06.x1 source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(classId, "classId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        g16.u0 signature = this.f349129a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(signature, "signature");
        g16.u0 u0Var = new g16.u0(signature.f349200a + '@' + i17, null);
        g16.d dVar = this.f349125d;
        java.util.List list = (java.util.List) dVar.f349135b.get(u0Var);
        if (list == null) {
            list = new java.util.ArrayList();
            dVar.f349135b.put(u0Var, list);
        }
        return dVar.f349134a.r(classId, source, list);
    }
}

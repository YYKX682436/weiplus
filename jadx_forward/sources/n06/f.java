package n06;

/* loaded from: classes15.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final n06.f f415510d = new n06.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        o06.v0 module = (o06.v0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(module, "module");
        r06.o0 o0Var = (r06.o0) module.Q(n06.i.f415515f);
        java.util.List list = (java.util.List) e26.b0.a(o0Var.f450030h, o0Var, r06.o0.f450027n[0]);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (obj2 instanceof l06.d) {
                arrayList.add(obj2);
            }
        }
        return (l06.d) kz5.n0.X(arrayList);
    }
}

package a2;

/* loaded from: classes14.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.q0 f82335d = new a2.q0();

    public q0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        int i17 = e1.y.f327854l;
        w0.x xVar = a2.f1.f82242n;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        e1.y yVar = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool) || obj == null) ? null : (e1.y) ((w0.a0) xVar).a(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        long j17 = yVar.f327855a;
        java.lang.Object obj2 = list.get(1);
        int i18 = d1.e.f307159e;
        d1.e eVar = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, bool) || obj2 == null) ? null : (d1.e) ((w0.a0) a2.f1.f82244p).a(obj2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
        long j18 = eVar.f307160a;
        java.lang.Object obj3 = list.get(2);
        java.lang.Float f17 = obj3 != null ? (java.lang.Float) obj3 : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f17);
        return new e1.z0(j17, j18, f17.floatValue(), null);
    }
}

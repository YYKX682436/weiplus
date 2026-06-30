package a2;

/* loaded from: classes14.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.q0 f802d = new a2.q0();

    public q0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        int i17 = e1.y.f246321l;
        w0.x xVar = a2.f1.f709n;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        e1.y yVar = (kotlin.jvm.internal.o.b(obj, bool) || obj == null) ? null : (e1.y) ((w0.a0) xVar).a(obj);
        kotlin.jvm.internal.o.d(yVar);
        long j17 = yVar.f246322a;
        java.lang.Object obj2 = list.get(1);
        int i18 = d1.e.f225626e;
        d1.e eVar = (kotlin.jvm.internal.o.b(obj2, bool) || obj2 == null) ? null : (d1.e) ((w0.a0) a2.f1.f711p).a(obj2);
        kotlin.jvm.internal.o.d(eVar);
        long j18 = eVar.f225627a;
        java.lang.Object obj3 = list.get(2);
        java.lang.Float f17 = obj3 != null ? (java.lang.Float) obj3 : null;
        kotlin.jvm.internal.o.d(f17);
        return new e1.z0(j17, j18, f17.floatValue(), null);
    }
}

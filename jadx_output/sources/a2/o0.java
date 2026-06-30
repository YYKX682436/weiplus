package a2;

/* loaded from: classes14.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.o0 f788d = new a2.o0();

    public o0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        l2.f fVar = obj != null ? (l2.f) obj : null;
        java.lang.Object obj2 = list.get(1);
        l2.h hVar = obj2 != null ? (l2.h) obj2 : null;
        java.lang.Object obj3 = list.get(2);
        p2.v[] vVarArr = p2.t.f351400b;
        w0.x xVar = a2.f1.f710o;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p2.t tVar = (kotlin.jvm.internal.o.b(obj3, bool) || obj3 == null) ? null : (p2.t) ((w0.a0) xVar).a(obj3);
        kotlin.jvm.internal.o.d(tVar);
        long j17 = tVar.f351402a;
        java.lang.Object obj4 = list.get(3);
        l2.n nVar = l2.n.f315128c;
        return new a2.p(fVar, hVar, j17, (kotlin.jvm.internal.o.b(obj4, bool) || obj4 == null) ? null : (l2.n) ((w0.a0) a2.f1.f704i).a(obj4), null, null, null);
    }
}

package a2;

/* loaded from: classes14.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.o0 f82321d = new a2.o0();

    public o0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        l2.f fVar = obj != null ? (l2.f) obj : null;
        java.lang.Object obj2 = list.get(1);
        l2.h hVar = obj2 != null ? (l2.h) obj2 : null;
        java.lang.Object obj3 = list.get(2);
        p2.v[] vVarArr = p2.t.f432933b;
        w0.x xVar = a2.f1.f82243o;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p2.t tVar = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj3, bool) || obj3 == null) ? null : (p2.t) ((w0.a0) xVar).a(obj3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        long j17 = tVar.f432935a;
        java.lang.Object obj4 = list.get(3);
        l2.n nVar = l2.n.f396661c;
        return new a2.p(fVar, hVar, j17, (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj4, bool) || obj4 == null) ? null : (l2.n) ((w0.a0) a2.f1.f82237i).a(obj4), null, null, null);
    }
}

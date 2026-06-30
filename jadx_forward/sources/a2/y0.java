package a2;

/* loaded from: classes14.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.y0 f82355d = new a2.y0();

    public y0() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        p2.v[] vVarArr = p2.t.f432933b;
        w0.x xVar = a2.f1.f82243o;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p2.t tVar = null;
        p2.t tVar2 = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, bool) || obj == null) ? null : (p2.t) ((w0.a0) xVar).a(obj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar2);
        long j17 = tVar2.f432935a;
        java.lang.Object obj2 = list.get(1);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, bool) && obj2 != null) {
            tVar = (p2.t) ((w0.a0) xVar).a(obj2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(tVar);
        return new l2.n(j17, tVar.f432935a, null);
    }
}

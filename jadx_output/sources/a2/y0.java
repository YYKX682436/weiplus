package a2;

/* loaded from: classes14.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final a2.y0 f822d = new a2.y0();

    public y0() {
        super(1);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object it) {
        kotlin.jvm.internal.o.g(it, "it");
        java.util.List list = (java.util.List) it;
        java.lang.Object obj = list.get(0);
        p2.v[] vVarArr = p2.t.f351400b;
        w0.x xVar = a2.f1.f710o;
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        p2.t tVar = null;
        p2.t tVar2 = (kotlin.jvm.internal.o.b(obj, bool) || obj == null) ? null : (p2.t) ((w0.a0) xVar).a(obj);
        kotlin.jvm.internal.o.d(tVar2);
        long j17 = tVar2.f351402a;
        java.lang.Object obj2 = list.get(1);
        if (!kotlin.jvm.internal.o.b(obj2, bool) && obj2 != null) {
            tVar = (p2.t) ((w0.a0) xVar).a(obj2);
        }
        kotlin.jvm.internal.o.d(tVar);
        return new l2.n(j17, tVar.f351402a, null);
    }
}

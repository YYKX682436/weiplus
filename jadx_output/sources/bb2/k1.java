package bb2;

/* loaded from: classes10.dex */
public final class k1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18904d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(bb2.w1 w1Var) {
        super(2);
        this.f18904d = w1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        java.util.Map reportMap = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(reportMap, "reportMap");
        bb2.w1 w1Var = this.f18904d;
        kotlinx.coroutines.l.d(w1Var.f19055t, null, null, new bb2.d1(w1Var, longValue, reportMap, null), 3, null);
        return jz5.f0.f302826a;
    }
}

package bb2;

/* loaded from: classes10.dex */
public final class i1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f18885d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(bb2.w1 w1Var) {
        super(3);
        this.f18885d = w1Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String content = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        long longValue = ((java.lang.Number) obj3).longValue();
        kotlin.jvm.internal.o.g(content, "content");
        bb2.w1 w1Var = this.f18885d;
        bb2.w1.k(w1Var, content, w1Var.f19046k, intValue, longValue, 0L, 0L, false, 112, null);
        return jz5.f0.f302826a;
    }
}

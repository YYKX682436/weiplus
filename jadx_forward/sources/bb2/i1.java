package bb2;

/* loaded from: classes10.dex */
public final class i1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(bb2.w1 w1Var) {
        super(3);
        this.f100418d = w1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String content = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        long longValue = ((java.lang.Number) obj3).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        bb2.w1 w1Var = this.f100418d;
        bb2.w1.k(w1Var, content, w1Var.f100579k, intValue, longValue, 0L, 0L, false, 112, null);
        return jz5.f0.f384359a;
    }
}

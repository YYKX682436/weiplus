package cp4;

/* loaded from: classes5.dex */
public final class o extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cp4.r f302585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(cp4.r rVar) {
        super(2);
        this.f302585d = rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.util.ArrayList result = (java.util.ArrayList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        cp4.r rVar = this.f302585d;
        rVar.f302592g.m68236x76500a7f(false);
        java.util.List list = rVar.f302601s;
        ((java.util.ArrayList) list.get(intValue)).clear();
        ((java.util.ArrayList) list.get(intValue)).addAll(result);
        rVar.G(intValue);
        ju3.d0.k(rVar.f546865d, ju3.c0.f383446x1, null, 2, null);
        return jz5.f0.f384359a;
    }
}

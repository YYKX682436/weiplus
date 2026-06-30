package w23;

/* loaded from: classes8.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 f524140d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1723xc515088e.C15638x5a203cd0 c15638x5a203cd0) {
        super(2);
        this.f524140d = c15638x5a203cd0;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.util.LinkedList data = (java.util.LinkedList) obj;
        long longValue = ((java.lang.Number) obj2).longValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.regex.Pattern pattern = pm0.v.f438335a;
        pm0.v.T(km5.u.d(), new w23.g(data, longValue, this.f524140d));
        return jz5.f0.f384359a;
    }
}

package uv0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uv0.u f512871d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uv0.u uVar) {
        super(2);
        this.f512871d = uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        vv0.k filter = (vv0.k) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        uv0.u.L(this.f512871d, intValue, filter);
        return jz5.f0.f384359a;
    }
}

package dk2;

/* loaded from: classes3.dex */
public final class g6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gk2.e f315038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.xf f315039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ dk2.k6 f315040f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.t f315041g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g6(gk2.e eVar, dk2.xf xfVar, dk2.k6 k6Var, yz5.t tVar) {
        super(7);
        this.f315038d = eVar;
        this.f315039e = xfVar;
        this.f315040f = k6Var;
        this.f315041g = tVar;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.String verifyUrl = (java.lang.String) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        int intValue2 = ((java.lang.Number) obj5).intValue();
        java.lang.String errMsg = (java.lang.String) obj6;
        r45.l01 resp = (r45.l01) obj7;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(verifyUrl, "verifyUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        pm0.v.X(new dk2.f6(booleanValue, intValue2, booleanValue2, verifyUrl, this.f315038d, this.f315039e, this.f315040f, resp, this.f315041g, intValue, errMsg));
        return jz5.f0.f384359a;
    }
}

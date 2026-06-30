package dk2;

/* loaded from: classes3.dex */
public final class x1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315828d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315829e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f315830f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1(dk2.r4 r4Var, int i17, yz5.q qVar) {
        super(2);
        this.f315828d = r4Var;
        this.f315829e = i17;
        this.f315830f = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = this.f315828d.f315542d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doLoadMoreGiftByGroup onProcessComplete groupId:");
        int i17 = this.f315829e;
        sb6.append(i17);
        sb6.append(", cgiErrType:");
        sb6.append(intValue);
        sb6.append(", cgiErrCode:");
        sb6.append(intValue2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        yz5.q qVar = this.f315830f;
        if (intValue == 0 && intValue2 == 0) {
            dk2.vc vcVar = (dk2.vc) dk2.ef.O.get(java.lang.Integer.valueOf(i17));
            if (qVar != null) {
                qVar.mo147xb9724478(java.lang.Boolean.TRUE, java.lang.Integer.valueOf(intValue2), java.lang.Boolean.valueOf(vcVar != null ? vcVar.f315779a : false));
            }
        } else if (qVar != null) {
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            qVar.mo147xb9724478(bool, java.lang.Integer.valueOf(intValue2), bool);
        }
        return jz5.f0.f384359a;
    }
}

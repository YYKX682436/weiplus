package nl4;

/* loaded from: classes11.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nl4.r f419741d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(nl4.r rVar) {
        super(3);
        this.f419741d = rVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        nl4.r rVar = this.f419741d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(rVar.f419775l, "TingFinderPlayerCore-Trace onTPPlayError, errorCode:" + intValue + ", errorType:" + intValue2);
        java.lang.String str = "errorType:" + intValue2 + "|errorCode:" + intValue;
        ll4.a aVar = rVar.f419764a;
        if (aVar != null) {
            ((kl4.n) aVar).b(12, str);
        }
        return jz5.f0.f384359a;
    }
}

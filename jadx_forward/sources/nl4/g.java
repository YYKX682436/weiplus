package nl4;

/* loaded from: classes11.dex */
public final /* synthetic */ class g extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.p {
    public g(java.lang.Object obj) {
        super(2, obj, nl4.r.class, "onStateChange", "onStateChange(II)V", 0);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ll4.a aVar;
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        nl4.r rVar = (nl4.r) this.f72685xcfcbe9ef;
        rVar.getClass();
        int i17 = 4;
        if (intValue2 == 4) {
            i17 = 2;
        } else if (intValue2 == 5) {
            i17 = 3;
        } else if (intValue2 == 6) {
            i17 = 5;
        } else if (intValue2 != 7) {
            i17 = (intValue2 == 9 && !rVar.f419768e) ? 11 : -1;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f419775l, "onStateChange curState:" + intValue2 + ", preState:" + intValue + ", event:" + i17);
        if (i17 > 0 && (aVar = rVar.f419764a) != null) {
            ll4.a.a(aVar, i17, null, 2, null);
        }
        return jz5.f0.f384359a;
    }
}

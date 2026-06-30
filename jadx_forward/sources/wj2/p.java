package wj2;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wj2.w f528244d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(wj2.w wVar) {
        super(4);
        this.f528244d = wVar;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        r45.py1 resp = (r45.py1) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        wj2.w wVar = this.f528244d;
        if (intValue == 0 && intValue2 == 0) {
            pm0.v.X(new wj2.o(resp, wVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.m145853xb5886c64(), "doHighLightLikeLive errType:" + intValue + " errCode:" + intValue2 + " errMsg:" + str);
        return jz5.f0.f384359a;
    }
}

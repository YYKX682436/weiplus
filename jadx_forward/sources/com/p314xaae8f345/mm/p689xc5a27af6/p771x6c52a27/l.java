package com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27;

/* loaded from: classes13.dex */
public class l implements com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mh0.o f149386a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149387b;

    public l(com.p314xaae8f345.mm.p689xc5a27af6.p771x6c52a27.m mVar, mh0.o oVar, java.lang.String str) {
        this.f149386a = oVar;
        this.f149387b = str;
    }

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
    /* renamed from: MidasPayCallBack */
    public void mo41389xe81ffc73(com.p314xaae8f345.p592x631407a.api.C4728x8ec3caec c4728x8ec3caec) {
        mh0.o oVar = this.f149386a;
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayMidasFeatureService", "midasDirectPay callBack is null");
        } else if (c4728x8ec3caec == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxPayMidasFeatureService", "midasDirectPay MidasPayCallBack apMidasResponse is null");
            oVar.a(-2, "apMidasResponse is null");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayMidasFeatureService", "midasDirectPay callBack resultCode:%s resultMsg:%s req payinfo:%s ", java.lang.Integer.valueOf(c4728x8ec3caec.f20116xdde293aa), c4728x8ec3caec.f20118x938b9624, this.f149387b);
            oVar.a(c4728x8ec3caec.f20116xdde293aa, c4728x8ec3caec.f20118x938b9624);
        }
    }

    @Override // com.p314xaae8f345.p592x631407a.api.InterfaceC4731xabd5a6ab
    /* renamed from: MidasPayNeedLogin */
    public void mo41390x9af5fe25() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPayMidasFeatureService", "Midas pay need login");
    }
}

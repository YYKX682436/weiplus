package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class m2 implements js4.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f267886a;

    public m2(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f267886a = rVar;
    }

    @Override // js4.o
    public void a(int i17, int i18, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWCCoinBalance", "[WeCoin] getWeCoinBalance onFailed,errorType:" + i17 + ",errorCode:" + i18 + ",msg:" + str);
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267886a;
        if (rVar != null) {
            rVar.a(null);
        }
    }

    @Override // js4.o
    /* renamed from: onSuccess */
    public void mo14245xe05b4124(java.lang.Object obj) {
        r45.fs3 data = (r45.fs3) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetWCCoinBalance", "[WeCoin] getWeCoinBalance onSuccess,data:" + data.f456118d);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("responseKey", data.mo14344x5f01b1f6());
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f267886a;
        if (rVar != null) {
            rVar.a(bundle);
        }
    }
}

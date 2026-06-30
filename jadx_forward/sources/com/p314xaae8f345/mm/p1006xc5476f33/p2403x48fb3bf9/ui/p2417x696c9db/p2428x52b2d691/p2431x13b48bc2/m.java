package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2;

/* loaded from: classes9.dex */
public final class m implements h45.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f268171a;

    public m(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f268171a = rVar;
    }

    @Override // h45.n
    /* renamed from: onSessionId */
    public final void mo28746x22647b32(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId: ".concat(str));
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f268171a;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.p2431x13b48bc2.C19477x154d53db(str));
        }
    }
}

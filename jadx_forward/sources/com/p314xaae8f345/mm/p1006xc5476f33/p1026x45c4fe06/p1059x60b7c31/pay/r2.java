package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay;

/* loaded from: classes9.dex */
public final class r2 implements h45.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p794xb0fa9b5e.r f164195a;

    public r2(com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        this.f164195a = rVar;
    }

    @Override // h45.n
    /* renamed from: onSessionId */
    public final void mo28746x22647b32(java.lang.String str) {
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReportCrossPlatformPay", "onSessionId: ".concat(str));
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f164195a;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.C12207x154d53db(str));
        }
    }
}

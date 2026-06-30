package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

/* renamed from: com.tencent.kinda.framework.jsapi.KindaJSInvokeListener */
/* loaded from: classes16.dex */
public class C3171xae6e2422 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    private static final java.lang.String TAG = "MicroMsg.KindaJSInvokeListener";

    /* renamed from: com.tencent.kinda.framework.jsapi.KindaJSInvokeListener$JSHandler */
    /* loaded from: classes16.dex */
    public interface JSHandler {
        /* renamed from: handle */
        void mo25563xb7026e28(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec);

        /* renamed from: handleJsApi */
        java.lang.String mo25564x57dc3ec9();

        /* renamed from: handleType */
        int mo25565x76771d82();
    }

    public C3171xae6e2422() {
        super(0);
    }

    /* renamed from: createHandler */
    private com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler m25569xaf327aae(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        if (c5666x53d8f9ec.f135990g.f88299c.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bb.f33891x24728b)) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3179xd856635c();
        }
        am.gi giVar = c5666x53d8f9ec.f135990g;
        if (giVar.f88299c.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.y6.f35021x24728b)) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3190xa3d0d7d7();
        }
        if (giVar.f88299c.equals("requestPayAuthen")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3188x5f224397();
        }
        if (giVar.f88299c.equals("fastBindCardGetResult")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3166x81de2c60();
        }
        if (giVar.f88299c.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za.f35037x24728b)) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3178xeccbb673();
        }
        if (giVar.f88299c.equals("requestKidsPayRechargePayment")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3180x302ced97();
        }
        if (giVar.f88299c.equals("requestSnsPayment")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3183x1d09234d();
        }
        if (giVar.f88299c.equals(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34667x24728b)) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3176x376c227();
        }
        if (giVar.f88299c.equals("notifyWCPayResult")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3177xebb01eba();
        }
        if (giVar.f88299c.equals("navigateBackToSourceAppForWXPay")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3173xdbec250();
        }
        if (giVar.f88299c.equals("getHKCashier")) {
            return new com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3167x338b6f37();
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback, reason: merged with bridge method [inline-methods] */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        am.gi giVar = c5666x53d8f9ec.f135990g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "handle jsapi callback: %s, %s", giVar.f88299c, java.lang.Integer.valueOf(giVar.f88297a));
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler m25569xaf327aae = m25569xaf327aae(c5666x53d8f9ec);
        if (m25569xaf327aae == null) {
            return false;
        }
        m25569xaf327aae.mo25563xb7026e28(c5666x53d8f9ec);
        return false;
    }
}

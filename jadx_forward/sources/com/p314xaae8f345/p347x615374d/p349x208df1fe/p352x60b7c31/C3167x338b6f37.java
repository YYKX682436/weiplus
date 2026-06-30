package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/GetHKCashierJSHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "TAG", "Ljava/lang/String;", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler */
/* loaded from: classes16.dex */
public final class C3167x338b6f37 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler {
    private final java.lang.String TAG = "MicroMsg.GetHKCashierJSHandler";

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handle */
    public void mo25563xb7026e28(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        java.lang.String str;
        am.gi giVar;
        android.os.Bundle bundle;
        am.gi giVar2;
        android.os.Bundle bundle2;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04 c3235x6da79b04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04();
        c3235x6da79b04.m25879xa7687c07(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler$handle$1
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaCloseWebViewImpl */
            public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaEndWithResult */
            public void mo24860x91578571(java.lang.String str2, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                java.lang.String str3;
                am.gi giVar3;
                java.lang.Runnable runnable;
                java.lang.String str4;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec2;
                am.hi hiVar;
                android.os.Bundle bundle3;
                am.hi hiVar2;
                android.os.Bundle bundle4;
                am.hi hiVar3;
                str3 = com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3167x338b6f37.this.TAG;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "callback: %s", str2);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec3 = c5666x53d8f9ec;
                if (((c5666x53d8f9ec3 == null || (hiVar3 = c5666x53d8f9ec3.f135991h) == null) ? null : hiVar3.f88368a) == null) {
                    am.hi hiVar4 = c5666x53d8f9ec3 != null ? c5666x53d8f9ec3.f135991h : null;
                    if (hiVar4 != null) {
                        hiVar4.f88368a = new android.os.Bundle();
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec4 = c5666x53d8f9ec;
                if (c5666x53d8f9ec4 != null && (hiVar2 = c5666x53d8f9ec4.f135991h) != null && (bundle4 = hiVar2.f88368a) != null) {
                    bundle4.putString("ret", str2);
                }
                if (hashMap != null && (str4 = hashMap.get("err_desc")) != null && (c5666x53d8f9ec2 = c5666x53d8f9ec) != null && (hiVar = c5666x53d8f9ec2.f135991h) != null && (bundle3 = hiVar.f88368a) != null) {
                    bundle3.putString("err_desc", str4);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec5 = c5666x53d8f9ec;
                if (c5666x53d8f9ec5 == null || (giVar3 = c5666x53d8f9ec5.f135990g) == null || (runnable = giVar3.f88300d) == null) {
                    return;
                }
                runnable.run();
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaGetType */
            public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
                return com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB;
            }
        });
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27558x91a36ce2("JSEvent", c3235x6da79b04);
        if (c5666x53d8f9ec != null && (giVar2 = c5666x53d8f9ec.f135990g) != null && (bundle2 = giVar2.f88298b) != null) {
            m27539xaf65a0fc.mo27566xe4673800("appId", bundle2.getString("appId"));
            m27539xaf65a0fc.mo27566xe4673800("nonce_str", bundle2.getString("nonce_str"));
            m27539xaf65a0fc.mo27566xe4673800("timeStamp", bundle2.getString("timeStamp"));
            m27539xaf65a0fc.mo27566xe4673800("package", bundle2.getString("package"));
            m27539xaf65a0fc.mo27566xe4673800("signType", bundle2.getString("signType"));
            m27539xaf65a0fc.mo27566xe4673800("paySign", bundle2.getString("paySign"));
            m27539xaf65a0fc.mo27566xe4673800("jsapiFunc", bundle2.getString("jsapiName"));
            m27539xaf65a0fc.mo27557xc5c55e60("sourceType", bundle2.getInt("sourceType"));
            m27539xaf65a0fc.mo27566xe4673800("stepInURL", bundle2.getString("stepInURL"));
        }
        java.lang.String str2 = this.TAG;
        if (c5666x53d8f9ec == null || (giVar = c5666x53d8f9ec.f135990g) == null || (bundle = giVar.f88298b) == null || (str = bundle.toString()) == null) {
            str = "empty";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "start call hkJsapiGetHKCashierUseCase, data is  : ".concat(str));
        ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("hkJsapiGetHKCashierUseCase", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.jsapi.GetHKCashierJSHandler$handle$2
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public final void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleJsApi */
    public java.lang.String mo25564x57dc3ec9() {
        return "getHKCashier";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleType */
    public int mo25565x76771d82() {
        return 0;
    }
}

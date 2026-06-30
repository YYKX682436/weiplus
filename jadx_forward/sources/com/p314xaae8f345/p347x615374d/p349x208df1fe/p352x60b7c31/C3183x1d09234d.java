package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/RequestSnsPaymentHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "<init>", "()V", "Companion", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler */
/* loaded from: classes16.dex */
public final class C3183x1d09234d implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler {
    private static final java.lang.String TAG = "MicroMsg.RequestSnsPayment";

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handle */
    public void mo25563xb7026e28(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        am.gi giVar;
        am.gi giVar2;
        android.os.Bundle bundle;
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04 c3235x6da79b04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04();
        c3235x6da79b04.m25879xa7687c07(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$1
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaCloseWebViewImpl */
            public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 completion) {
                am.hi hiVar;
                android.os.Bundle bundle2;
                am.hi hiVar2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec2 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                if (((c5666x53d8f9ec2 == null || (hiVar2 = c5666x53d8f9ec2.f135991h) == null) ? null : hiVar2.f88368a) == null) {
                    am.hi hiVar3 = c5666x53d8f9ec2 != null ? c5666x53d8f9ec2.f135991h : null;
                    if (hiVar3 != null) {
                        hiVar3.f88368a = new android.os.Bundle();
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec3 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                if (c5666x53d8f9ec3 == null || (hiVar = c5666x53d8f9ec3.f135991h) == null || (bundle2 = hiVar.f88368a) == null) {
                    return;
                }
                bundle2.putInt("closeWindow", 1);
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaEndWithResult */
            public void mo24860x91578571(java.lang.String result, java.util.HashMap<java.lang.String, java.lang.String> extraInfo) {
                am.gi giVar3;
                java.lang.Runnable runnable;
                am.hi hiVar;
                android.os.Bundle bundle2;
                am.hi hiVar2;
                android.os.Bundle bundle3;
                am.hi hiVar3;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RequestSnsPayment", "callback: %s", result);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec2 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                if (((c5666x53d8f9ec2 == null || (hiVar3 = c5666x53d8f9ec2.f135991h) == null) ? null : hiVar3.f88368a) == null) {
                    am.hi hiVar4 = c5666x53d8f9ec2 != null ? c5666x53d8f9ec2.f135991h : null;
                    if (hiVar4 != null) {
                        hiVar4.f88368a = new android.os.Bundle();
                    }
                }
                for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : extraInfo.entrySet()) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec3 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                    if (c5666x53d8f9ec3 != null && (hiVar2 = c5666x53d8f9ec3.f135991h) != null && (bundle3 = hiVar2.f88368a) != null) {
                        bundle3.putString(entry.getKey(), entry.getValue());
                    }
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec4 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                if (c5666x53d8f9ec4 != null && (hiVar = c5666x53d8f9ec4.f135991h) != null && (bundle2 = hiVar.f88368a) != null) {
                    bundle2.putString("ret", result);
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec5 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                if (c5666x53d8f9ec5 == null || (giVar3 = c5666x53d8f9ec5.f135990g) == null || (runnable = giVar3.f88300d) == null) {
                    return;
                }
                runnable.run();
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaGetType */
            public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
                am.gi giVar3;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec2 = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this;
                boolean z17 = false;
                if (c5666x53d8f9ec2 != null && (giVar3 = c5666x53d8f9ec2.f135990g) != null && giVar3.f88297a == 1) {
                    z17 = true;
                }
                return z17 ? com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB : com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.TINYAPP;
            }
        });
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27558x91a36ce2("JSEvent", c3235x6da79b04);
        if (c5666x53d8f9ec != null && (giVar2 = c5666x53d8f9ec.f135990g) != null && (bundle = giVar2.f88298b) != null) {
            m27539xaf65a0fc.mo27557xc5c55e60("payScene", bundle.getInt("payScene", 2));
            m27539xaf65a0fc.mo27566xe4673800("appId", bundle.getString("appId"));
            m27539xaf65a0fc.mo27566xe4673800("timeStamp", bundle.getString("timeStamp"));
            m27539xaf65a0fc.mo27566xe4673800("nonceStr", bundle.getString("nonceStr"));
            m27539xaf65a0fc.mo27566xe4673800("package", bundle.getString("package"));
            m27539xaf65a0fc.mo27566xe4673800("signType", bundle.getString("signType"));
            m27539xaf65a0fc.mo27566xe4673800("paySign", bundle.getString("paySign"));
            m27539xaf65a0fc.mo27566xe4673800("prepayId", bundle.getString("prepayId"));
            m27539xaf65a0fc.mo27566xe4673800("partnerId", bundle.getString("partnerId"));
            m27539xaf65a0fc.mo27566xe4673800("bindSerial", bundle.getString("bindSerial"));
            m27539xaf65a0fc.mo27566xe4673800("bankType", bundle.getString("bankType"));
            m27539xaf65a0fc.mo27566xe4673800("paymentDeskModalTitle", bundle.getString("paymentDeskModalTitle"));
        }
        java.util.Objects.toString((c5666x53d8f9ec == null || (giVar = c5666x53d8f9ec.f135990g) == null) ? null : giVar.f88298b);
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27496xef221a95("snsJsapiPay", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.jsapi.RequestSnsPaymentHandler$handle$2
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public final void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleJsApi */
    public java.lang.String mo25564x57dc3ec9() {
        return "requestSnsPayment";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleType */
    public int mo25565x76771d82() {
        return 0;
    }
}

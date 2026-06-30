package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0012\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/NotifyDcpPaymentCallbackHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.jsapi.NotifyDcpPaymentCallbackHandler */
/* loaded from: classes16.dex */
public final class C3176x376c227 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler {
    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handle */
    public void mo25563xb7026e28(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        if (c5666x53d8f9ec == null) {
            return;
        }
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27566xe4673800("notifyType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34667x24728b);
        m27539xaf65a0fc.mo27566xe4673800("jsApiName", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34667x24728b);
        am.gi giVar = c5666x53d8f9ec.f135990g;
        m27539xaf65a0fc.mo27566xe4673800("dcp_token", giVar.f88298b.getString("dcp_token", ""));
        m27539xaf65a0fc.mo27566xe4673800("ret_status", giVar.f88298b.getString("ret_status"));
        ((h45.q) i95.n0.c(h45.q.class)).mo24783x40cf7c9f(m27539xaf65a0fc);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleJsApi */
    public java.lang.String mo25564x57dc3ec9() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.z.f34667x24728b;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleType */
    public int mo25565x76771d82() {
        return 0;
    }
}

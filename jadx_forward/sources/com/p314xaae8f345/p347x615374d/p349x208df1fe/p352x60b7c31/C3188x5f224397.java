package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\"\u0010\f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/tencent/kinda/framework/jsapi/requestPayAuthenJsHandler;", "Lcom/tencent/kinda/framework/jsapi/KindaJSInvokeListener$JSHandler;", "", "handleType", "", "handleJsApi", "Lcom/tencent/mm/autogen/events/KindaJSInvokeEvent;", "event", "Ljz5/f0;", "handle", "TAG", "Ljava/lang/String;", "type", "I", "getType", "()I", "setType", "(I)V", "<init>", "()V", "kinda-framework-lib_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.kinda.framework.jsapi.requestPayAuthenJsHandler */
/* loaded from: classes16.dex */
public final class C3188x5f224397 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler {
    private final java.lang.String TAG = "MicroMsg.requestPayAuthenJsHandler";
    private int type;

    public final int getType() {
        return this.type;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handle */
    public void mo25563xb7026e28(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04 c3235x6da79b04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04();
        c3235x6da79b04.m25879xa7687c07(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.requestPayAuthenJsHandler$handle$1
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaCloseWebViewImpl */
            public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 completion) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
                am.hi hiVar = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this.f135991h;
                if (hiVar.f88368a == null) {
                    hiVar.f88368a = new android.os.Bundle();
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this.f135991h.f88368a.putInt("closeWindow", 1);
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaEndWithResult */
            public void mo24860x91578571(java.lang.String result, java.util.HashMap<java.lang.String, java.lang.String> extraInfo) {
                java.lang.String str;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraInfo, "extraInfo");
                str = this.TAG;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "callback: %s", result);
                am.hi hiVar = com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this.f135991h;
                if (hiVar.f88368a == null) {
                    hiVar.f88368a = new android.os.Bundle();
                }
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this.f135991h.f88368a.putString("ret", result);
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this.f135990g.f88300d.run();
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaGetType */
            public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
                return com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec.this.f135990g.f88297a == 1 ? com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.TINYAPP : com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB;
            }
        });
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27558x91a36ce2("jsEvent", c3235x6da79b04);
        am.gi giVar = event.f135990g;
        m27539xaf65a0fc.mo27566xe4673800("notifyType", giVar.f88298b.getString("notifyType"));
        m27539xaf65a0fc.mo27566xe4673800("appId", giVar.f88298b.getString("appId"));
        m27539xaf65a0fc.mo27566xe4673800("nonceStr", giVar.f88298b.getString("nonceStr"));
        m27539xaf65a0fc.mo27566xe4673800("timeStamp", giVar.f88298b.getString("timeStamp"));
        m27539xaf65a0fc.mo27566xe4673800("package", giVar.f88298b.getString("package"));
        m27539xaf65a0fc.mo27566xe4673800("paySign", giVar.f88298b.getString("paySign"));
        m27539xaf65a0fc.mo27566xe4673800("signType", giVar.f88298b.getString("signType"));
        int i17 = giVar.f88297a;
        if (i17 == 1) {
            m27539xaf65a0fc.mo27557xc5c55e60("jsApiScene", 1);
        } else if (i17 == 0) {
            m27539xaf65a0fc.mo27557xc5c55e60("jsApiScene", 2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.TAG, "data: %s", giVar.f88298b.toString());
        ((h45.q) i95.n0.c(h45.q.class)).mo24783x40cf7c9f(m27539xaf65a0fc);
        am.hi hiVar = event.f135991h;
        if (hiVar.f88368a == null) {
            hiVar.f88368a = new android.os.Bundle();
        }
        hiVar.f88368a.putString("ret", "fail");
        giVar.f88300d.run();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleJsApi */
    public java.lang.String mo25564x57dc3ec9() {
        return "requestPayAuthen";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleType */
    public int mo25565x76771d82() {
        return this.type;
    }

    /* renamed from: setType */
    public final void m25593x7650bebc(int i17) {
        this.type = i17;
    }
}

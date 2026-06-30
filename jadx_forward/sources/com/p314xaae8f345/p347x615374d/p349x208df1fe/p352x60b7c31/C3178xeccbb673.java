package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

/* renamed from: com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler */
/* loaded from: classes16.dex */
public class C3178xeccbb673 implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler {
    private static final java.lang.String TAG = "MicroMsg.PhoneBindCardEntryHandler";

    /* renamed from: type */
    public int f12226x368f3a;

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handle */
    public void mo25563xb7026e28(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04 c3235x6da79b04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04();
        c3235x6da79b04.m25879xa7687c07(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler.1
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaCloseWebViewImpl */
            public void mo24859x14baf22e(boolean z17, com.p314xaae8f345.p347x615374d.gen.AbstractC3623x3b485619 abstractC3623x3b485619) {
                am.hi hiVar = c5666x53d8f9ec.f135991h;
                if (hiVar.f88368a == null) {
                    hiVar.f88368a = new android.os.Bundle();
                }
                c5666x53d8f9ec.f135991h.f88368a.putInt("closeWindow", 1);
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaEndWithResult */
            public void mo24860x91578571(java.lang.String str, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3178xeccbb673.TAG, "callback: %s", str);
                am.hi hiVar = c5666x53d8f9ec.f135991h;
                if (hiVar.f88368a == null) {
                    hiVar.f88368a = new android.os.Bundle();
                }
                c5666x53d8f9ec.f135991h.f88368a.putString("ret", str);
                c5666x53d8f9ec.f135990g.f88300d.run();
            }

            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3473x4b2b0426
            /* renamed from: kindaGetType */
            public com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e mo24861xe667f7a3() {
                return c5666x53d8f9ec.f135990g.f88297a == 1 ? com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB : com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.TINYAPP;
            }
        });
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27558x91a36ce2("jsEvent", c3235x6da79b04);
        m27539xaf65a0fc.mo27566xe4673800("notifyType", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za.f35037x24728b);
        m27539xaf65a0fc.mo27566xe4673800(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c5666x53d8f9ec.f135990g.f88298b.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd));
        am.gi giVar = c5666x53d8f9ec.f135990g;
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", giVar.f88298b.getString("nonce_str"));
        m27539xaf65a0fc.mo27566xe4673800("timeStamp", giVar.f88298b.getString("timeStamp"));
        m27539xaf65a0fc.mo27566xe4673800("package", giVar.f88298b.getString("package"));
        m27539xaf65a0fc.mo27566xe4673800("paySign", giVar.f88298b.getString("paySign"));
        m27539xaf65a0fc.mo27566xe4673800("signType", giVar.f88298b.getString("signType"));
        m27539xaf65a0fc.mo27566xe4673800("jsApiName", giVar.f88299c);
        m27539xaf65a0fc.mo27557xc5c55e60("bind_card_entrance_scene", 3);
        int i17 = giVar.f88297a;
        if (i17 == 1) {
            m27539xaf65a0fc.mo27557xc5c55e60("jsApiScene", 1);
        } else if (i17 == 0) {
            m27539xaf65a0fc.mo27557xc5c55e60("jsApiScene", 2);
        }
        giVar.f88298b.toString();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p351x2e3af2.C3164xe2c9cfb4.m25546x447cf9ac().mo27496xef221a95("fastbindcard", m27539xaf65a0fc, new com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c() { // from class: com.tencent.kinda.framework.jsapi.PhoneBindCardEntryHandler.2
            @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3614x9e78e9c
            /* renamed from: call */
            public void mo24857x2e7a5e(com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e abstractC3411xcfaed72e) {
            }
        });
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleJsApi */
    public java.lang.String mo25564x57dc3ec9() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.za.f35037x24728b;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleType */
    public int mo25565x76771d82() {
        return this.f12226x368f3a;
    }
}

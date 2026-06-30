package com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31;

/* renamed from: com.tencent.kinda.framework.jsapi.PhoneBindCardVerifySmsJSHandler */
/* loaded from: classes16.dex */
public class C3179xd856635c implements com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler {

    /* renamed from: LiteAppNotifyName */
    public static final java.lang.String f12230x8d996447 = "JSAPIPhoneBindCardVerifySmsLiteAppNotifyEvent";
    private static final java.lang.String TAG = "MicroMsg.PhoneBindCardVerifySmsJSHandler";

    /* renamed from: type */
    public int f12231x368f3a;

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handle */
    public void mo25563xb7026e28(final com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5666x53d8f9ec c5666x53d8f9ec) {
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04 c3235x6da79b04 = new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04();
        c3235x6da79b04.m25879xa7687c07(new com.p314xaae8f345.p347x615374d.p349x208df1fe.p354xc04ba66c.p356x316220.C3235x6da79b04.KindaJsEventDelegate() { // from class: com.tencent.kinda.framework.jsapi.PhoneBindCardVerifySmsJSHandler.1
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
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PhoneBindCardVerifySmsJSHandler", "callback: %s", str);
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
                return c5666x53d8f9ec.f135990g.f88297a == 1 ? com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.TINYAPP : com.p314xaae8f345.p347x615374d.gen.EnumC3560xcac27c5e.WEB;
            }
        });
        com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
        m27539xaf65a0fc.mo27558x91a36ce2("jsEvent", c3235x6da79b04);
        m27539xaf65a0fc.mo27566xe4673800("notifyType", "fastBindCard");
        m27539xaf65a0fc.mo27566xe4673800(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, c5666x53d8f9ec.f135990g.f88298b.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd));
        am.gi giVar = c5666x53d8f9ec.f135990g;
        m27539xaf65a0fc.mo27566xe4673800("nonce_str", giVar.f88298b.getString("nonce_str"));
        m27539xaf65a0fc.mo27566xe4673800("timeStamp", giVar.f88298b.getString("timeStamp"));
        m27539xaf65a0fc.mo27566xe4673800("package", giVar.f88298b.getString("package"));
        m27539xaf65a0fc.mo27566xe4673800("paySign", giVar.f88298b.getString("paySign"));
        m27539xaf65a0fc.mo27566xe4673800("signType", giVar.f88298b.getString("signType"));
        m27539xaf65a0fc.mo27566xe4673800("sessionid", giVar.f88298b.getString("sessionid"));
        m27539xaf65a0fc.mo27566xe4673800("jsApiName", giVar.f88299c);
        int i17 = giVar.f88297a;
        if (i17 == 1) {
            m27539xaf65a0fc.mo27557xc5c55e60("jsApiScene", 1);
        } else if (i17 == 0) {
            m27539xaf65a0fc.mo27557xc5c55e60("jsApiScene", 2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "data: %s", giVar.f88298b.toString());
        ((h45.q) i95.n0.c(h45.q.class)).mo24783x40cf7c9f(m27539xaf65a0fc);
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("jsApiName", giVar.f88299c);
        hashMap.put("notifyType", "fastBindCard");
        hashMap.put(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd, giVar.f88298b.getString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13298xf9601dcd));
        hashMap.put("sessionid", giVar.f88298b.getString("sessionid"));
        hashMap.put("nonce_str", giVar.f88298b.getString("nonce_str"));
        hashMap.put("timeStamp", giVar.f88298b.getString("timeStamp"));
        hashMap.put("package", giVar.f88298b.getString("package"));
        hashMap.put("paySign", giVar.f88298b.getString("paySign"));
        hashMap.put("signType", giVar.f88298b.getString("signType"));
        int i18 = giVar.f88297a;
        if (i18 == 1) {
            hashMap.put("jsApiScene", "1");
        } else if (i18 == 0) {
            hashMap.put("jsApiScene", "2");
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3186xc28f4bba.f12240x4fbc8495.m25589x4f5d743f(c5666x53d8f9ec, f12230x8d996447, hashMap);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleJsApi */
    public java.lang.String mo25564x57dc3ec9() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.bb.f33891x24728b;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.p352x60b7c31.C3171xae6e2422.JSHandler
    /* renamed from: handleType */
    public int mo25565x76771d82() {
        return this.f12231x368f3a;
    }
}

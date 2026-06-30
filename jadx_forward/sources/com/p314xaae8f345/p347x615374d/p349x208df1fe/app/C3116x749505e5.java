package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KOfflinePayServiceImpl */
/* loaded from: classes9.dex */
public class C3116x749505e5 implements com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25 {
    private static final java.lang.String TAG = "KOfflinePayServiceImpl";

    /* renamed from: KindaOfflinePayCertCsrType_RSA */
    private int f11918x95ef21c7 = 1;

    /* renamed from: KindaOfflinePayCertCsrType_SM */
    private int f11919xba8395d3 = 2;

    /* renamed from: isTsmModeEnable */
    private boolean m25003x2153d06a() {
        return mo25014x944de85a() == this.f11919xba8395d3;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: cleanCftToken */
    public void mo25004x8d83a971(java.lang.String str) {
        if (m25003x2153d06a()) {
            ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24677x1736ba34(str);
        } else {
            com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().a(str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: decryptByCftCert */
    public java.lang.String mo25005x77db5ed1(java.lang.String str, java.lang.String str2) {
        if (m25003x2153d06a()) {
            return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24678x10f1a9ae(str, str2);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CertUtilWx", "call cert decrypt %s, %s", str, str2);
        return com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121773x5bf1598d(str, str2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: deleteCftCert */
    public boolean mo25006x1d654a0a(java.lang.String str) {
        if (m25003x2153d06a()) {
            return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24679xb67b94e7(str);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121771xb437c611(str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getCertCAVersion */
    public java.lang.String mo25007xa8838140() {
        if (mo25015x47a71544() == this.f11919xba8395d3) {
            return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24683x81b3793e();
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getCertid */
    public java.lang.String mo25008x13cbc135() {
        return to3.c0.Ai().Ni(196617);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getCftCSR */
    public java.lang.String mo25009x13da06c7(java.lang.String str) {
        if (mo25015x47a71544() == this.f11919xba8395d3) {
            return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24682x31906c4a(str);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g c17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c();
        synchronized (c17) {
            c17.f295431a = false;
        }
        return com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().b(str, com.p314xaae8f345.mm.p2802xd031a825.b.a().f() ? 1 : 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getCftCertSign */
    public java.lang.String mo25010xca63545c(java.lang.String str, java.lang.String str2) {
        if (m25003x2153d06a()) {
            return ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24684x76ee8b9(str, str2);
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        return com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121777xc5c0ef96(str, str2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getCftToken */
    public java.lang.String mo25011x8670257e(java.lang.String str) {
        if (m25003x2153d06a()) {
            java.lang.String mo24686x10233641 = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24686x10233641(str);
            if (yo3.m.j(mo24686x10233641)) {
                return mo24686x10233641;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tsm token is null or not numeric");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 77L, 1L, false);
            return null;
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
        java.lang.String m121782x75346043 = com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121782x75346043(str);
        if (yo3.m.j(m121782x75346043)) {
            return m121782x75346043;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "rsa token is null or not numeric");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 76L, 1L, false);
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getCodever */
    public int mo25012x75f0f260() {
        java.lang.String str = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, "") + "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getDeviceid */
    public java.lang.String mo25013xbdf72b67() {
        return to3.c0.Ai().Ni(196628);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getKindaOfflinePayCertType */
    public int mo25014x944de85a() {
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getKindaOfflinePayCsrCertType */
    public int mo25015x47a71544() {
        return gm0.j1.u().c().r(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_CSRCERTYPE_INT_SYNC, 0);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getLastSelectedCardBankType */
    public java.lang.String mo25016xb047c22d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f17;
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, "");
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (f17 = vr4.f1.wi().Ai().f(str)) == null) ? "" : f17.f69223x58802fcb;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getLastSelectedCardBindSerial */
    public java.lang.String mo25017xea6a1968() {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getLastTokenUpdateTs */
    public long mo25018xc6dfd295() {
        try {
            return java.lang.Long.valueOf(to3.c0.Ai().Ni(196632)).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getOfflinePayAckKey */
    public java.lang.String mo25019x8b5adcb1() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, "");
        if (m17 != null) {
            return (java.lang.String) m17;
        }
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getOfflinePayHasSuccess */
    public boolean mo25020xfa45a624() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clicfg_android_disable_offlinepay_first_secure_tips is true");
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getRegetTokenNum */
    public int mo25021x36de287a() {
        return to3.c0.Bi();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getRemainCftTokenNum */
    public int mo25022x751ddf9c(java.lang.String str) {
        return m25003x2153d06a() ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24680xccfec8c2(str) : to3.c0.Ai().Ui().d(true);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getSignUserId */
    public java.lang.String mo25023x9966ae59() {
        return m25003x2153d06a() ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24685xcce3e71b() : "";
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getTokenPin */
    public java.lang.String mo25024x3a0f4e52() {
        return m25003x2153d06a() ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24681x7ba780b5() : to3.c0.Ai().Ni(196647);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: getTokenUpdateInterval */
    public int mo25025x309da3d1() {
        return yo3.m.g();
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: importCftCert */
    public boolean mo25026xcf9b8ed0(java.lang.String str, java.lang.String str2) {
        return m25003x2153d06a() ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24687x68b1d9ad(str, str2) : com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().e(str, str2);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: isCertExists */
    public boolean mo25027x2ff53c6a(java.lang.String str) {
        boolean g17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        if (m25003x2153d06a()) {
            g17 = ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24688xd2802d8f(str);
            if (!g17) {
                com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().getClass();
                com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
                com.p3249xcbb51f6b.ndk.C28012xd7d7a066.m121756x9cf0d20b().m121771xb437c611(str);
                to3.c0.Ai().Vi(196617, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "certid exists, but cert not exist in tsm, remove cert from rsa");
            }
        } else {
            g17 = com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().g(str);
            if (!g17) {
                ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24679xb67b94e7(str);
                to3.c0.Ai().Vi(196617, "");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "certid exists, but cert not exist in rsa, remove cert from tsm");
            }
        }
        return g17;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: removeCertid */
    public void mo25028xb1010fe3() {
        to3.c0.Ai().Vi(196617, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setCertid */
    public boolean mo25029x700f541(java.lang.String str) {
        if (lj.f.f(str)) {
            return false;
        }
        to3.c0.Ai().Vi(196617, str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setCftTokenCode */
    public boolean mo25030x152e5397(java.lang.String str, java.lang.String str2) {
        boolean mo24689x79954ada = m25003x2153d06a() ? ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24689x79954ada(str, str2) : com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.g.c().h(str2, str, false);
        if (mo24689x79954ada) {
            yo3.m.u(2);
        }
        return mo24689x79954ada;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setCodever */
    public boolean mo25031xe9623fd4(int i17) {
        java.lang.String str = i17 + "";
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setDeviceid */
    public boolean mo25032xb8af8c73(java.lang.String str) {
        if (lj.f.f(str)) {
            return false;
        }
        to3.c0.Ai().Vi(196628, str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setKindaOfflinePayCertType */
    public boolean mo25033xaa7dcdce(int i17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setKindaOfflinePayCsrCertType */
    public boolean mo25034x3765cb50(int i17) {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_CSRCERTYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setLastSelectedCardBindSerial */
    public void mo25035xda28cf74(java.lang.String str, java.lang.String str2) {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setLastTokenUpdateTs */
    public void mo25036xa275df09(long j17) {
        to3.c0.Ai().Vi(196632, java.lang.String.valueOf(j17));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setOfflinePayAckKey */
    public void mo25037x2f5771bd(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, str);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setOfflinePayHasSuccess */
    public void mo25038x7498d530() {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setOfflineStateClose */
    public void mo25039x678e19e8() {
        to3.c0.Ai().Vi(196630, "0");
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setOfflineStateOpen */
    public void mo25040x35cac5a() {
        if (m25003x2153d06a()) {
            to3.c0.Ai().Vi(196630, "0");
        } else {
            to3.c0.Ai().Vi(196630, "1");
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setRegetTokenNum */
    public void mo25041xc9b48eee(int i17) {
        yo3.m.r(i17);
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setTokenPin */
    public boolean mo25042x34c7af5e(java.lang.String str) {
        if (lj.f.f(str)) {
            return false;
        }
        to3.c0.Ai().Vi(196647, str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: setTokenUpdateInterval */
    public void mo25043x7ee26345(int i17) {
        to3.c0.Ai().Vi(196649, java.lang.String.valueOf(i17));
    }

    @Override // com.p314xaae8f345.p347x615374d.gen.InterfaceC3487xca5dca25
    /* renamed from: updateCert */
    public void mo25044xee54aa8d(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        if (!m25003x2153d06a() || arrayList.size() <= 0) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        arrayList.toArray(strArr);
        ((com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e) i95.n0.c(com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e.class)).mo24690x6985c409(str, strArr);
    }
}

package com.p314xaae8f345.p347x615374d.p349x208df1fe;

@j95.b
/* renamed from: com.tencent.kinda.framework.OfflinePayTsmServices */
/* loaded from: classes9.dex */
public class C3087x2a2ea727 extends i95.w implements com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e {
    private static final java.lang.String TAG = "OfflinePayTsmService";

    /* renamed from: mInitFlag */
    private boolean f11469x34f77829 = false;

    /* renamed from: getTsmCertDeviceId */
    private java.lang.String m24673x9fa0170d() {
        java.lang.String g17 = wo.w0.g(false);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) ? wo.w0.k() : g17;
    }

    /* renamed from: getTsmCertRootPath */
    private java.lang.String m24674x538f4523() {
        java.lang.String str;
        gm0.j1.i();
        if (java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_TSMCERT_V2PATH_BOOLEAN_SYNC, false)).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "use v2 path");
            str = "/tsmCertV2";
        } else {
            str = "/tsmCert";
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getParentFile().getAbsolutePath() + str;
    }

    /* renamed from: getTsmCertUserId */
    private java.lang.String m24675xeb4d6a42() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r());
    }

    /* renamed from: initTsmCertIfNeed */
    private void m24676x7e2837d5() {
        if (this.f11469x34f77829) {
            return;
        }
        java.lang.String m24674x538f4523 = m24674x538f4523();
        java.lang.String m24673x9fa0170d = m24673x9fa0170d();
        java.lang.String m24675xeb4d6a42 = m24675xeb4d6a42();
        com.p3249xcbb51f6b.ndk.C28021x955d8ea1 m121904x9cf0d20b = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b();
        if (!m121904x9cf0d20b.m121925x316510(m24674x538f4523, m24673x9fa0170d, "OfflinePayTsm", m24675xeb4d6a42)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tsmCert init fail, errcode is %s", java.lang.Integer.valueOf(m121904x9cf0d20b.m121916x75feee5c()));
            gm0.j1.i();
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_KINDAOFFLINE_TSMCERT_V2PATH_BOOLEAN_SYNC;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c17.o(u3Var, false));
            if (valueOf.booleanValue()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 144L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 143L, 1L, false);
            }
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_offline_initcert_v2path, false) || valueOf.booleanValue()) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "use v2 path to init cert");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            boolean m121925x316510 = m121904x9cf0d20b.m121925x316510(m24674x538f4523(), m24673x9fa0170d, "OfflinePayTsm", m24675xeb4d6a42);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert init with V2RootPath , v2ret is %s", java.lang.Boolean.valueOf(m121925x316510));
            if (!m121925x316510) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert init with V2RootPath , error code is %d", java.lang.Integer.valueOf(m121904x9cf0d20b.m121916x75feee5c()));
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 144L, 1L, false);
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "tsmCert init succ");
        this.f11469x34f77829 = true;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: cleanTsmToken */
    public void mo24677x1736ba34(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        m24676x7e2837d5();
        if (com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121912xd3b4fbac(str)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clean tsm token fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 154L, 1L, false);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: decryptByTsmCert */
    public java.lang.String mo24678x10f1a9ae(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        m24676x7e2837d5();
        byte[] m121906xcd1676c9 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121906xcd1676c9(str, str2.getBytes());
        if (m121906xcd1676c9 != null) {
            return new java.lang.String(m121906xcd1676c9);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert decrypt fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: deleteTsmCert */
    public boolean mo24679xb67b94e7(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        m24676x7e2837d5();
        boolean m121911xb437c611 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121911xb437c611(str);
        if (!m121911xb437c611) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "delete tsm cert fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 155L, 1L, false);
        }
        return m121911xb437c611;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getRemainTsmTokenCount */
    public int mo24680xccfec8c2(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return 0;
        }
        m24676x7e2837d5();
        return com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121918xf2c0b28c(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getTokenPrefix */
    public java.lang.String mo24681x7ba780b5() {
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getTsmCSR */
    public java.lang.String mo24682x31906c4a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            str = m24675xeb4d6a42();
        }
        m24676x7e2837d5();
        java.lang.String m121926x31a01534 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121926x31a01534("WeChatPay", str);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m121926x31a01534)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "make csr return nil, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 157L, 1L, false);
        }
        return m121926x31a01534;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getTsmCertCAVersion */
    public java.lang.String mo24683x81b3793e() {
        m24676x7e2837d5();
        return com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121914xcddecb20() + "";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getTsmCertSign */
    public java.lang.String mo24684x76ee8b9(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return null;
        }
        m24676x7e2837d5();
        byte[] m121908xd3fc2a01 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121908xd3fc2a01(str, str2.getBytes(), m24675xeb4d6a42().getBytes());
        if (m121908xd3fc2a01 != null) {
            return android.util.Base64.encodeToString(m121908xd3fc2a01, 2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert sign fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 153L, 1L, false);
        return null;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getTsmSignUserId */
    public java.lang.String mo24685xcce3e71b() {
        return m24675xeb4d6a42();
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: getTsmToken */
    public java.lang.String mo24686x10233641(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        m24676x7e2837d5();
        return com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121917x75346043(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: importTsmCert */
    public boolean mo24687x68b1d9ad(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return false;
        }
        m24676x7e2837d5();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wcpay_offline_tsm_verify, false);
        boolean m121924x7ea51769 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121924x7ea51769(str, str2, fj6);
        if (!m121924x7ea51769) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "import cert fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
            if (fj6) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 159L, 1L, false);
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 158L, 1L, false);
            }
        }
        return m121924x7ea51769;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: isOfflinePayCertExists */
    public boolean mo24688xd2802d8f(java.lang.String str) {
        boolean m121922x2982b3de;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        m24676x7e2837d5();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_offline_cert_check_privatekey, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "check cert private key");
            m121922x2982b3de = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121923x2982b3de(str, true);
        } else {
            m121922x2982b3de = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121922x2982b3de(str);
        }
        if (m121922x2982b3de) {
            long[] m121915x3786736f = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121915x3786736f(str);
            if (m121915x3786736f.length > 1) {
                long j17 = m121915x3786736f[1];
                java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.a() / 1000);
                if (j17 < valueOf.longValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert expiretime is %ld, small than current time %ld, need delete", java.lang.Long.valueOf(j17), valueOf);
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                    g0Var.mo68477x336bdfd8(1105L, 150L, 1L, false);
                    if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wcpay_offline_tsm_expire_delete_disable, false)) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert expire, delete");
                        g0Var.mo68477x336bdfd8(1105L, 151L, 1L, false);
                        mo24679xb67b94e7(str);
                        return false;
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "delete block abtest is open");
                    g0Var.mo68477x336bdfd8(1105L, 152L, 1L, false);
                }
            }
        }
        return m121922x2982b3de;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: setTsmTokenCode */
    public boolean mo24689x79954ada(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        m24676x7e2837d5();
        boolean m121927x53c27ab7 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121927x53c27ab7(str2, str);
        if (!m121927x53c27ab7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "set token fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 156L, 1L, false);
        }
        return m121927x53c27ab7;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3110x8650de7e
    /* renamed from: updateTsmCert */
    public void mo24690x6985c409(java.lang.String str, java.lang.String[] strArr) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || strArr == null || strArr.length == 0) {
            return;
        }
        m24676x7e2837d5();
        int P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(str, 0);
        int m121914xcddecb20 = com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121914xcddecb20();
        if (P <= 0 || P <= m121914xcddecb20) {
            return;
        }
        if (com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121929xab8655cb(P, strArr)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "update ca cert succ");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "update ca cert fail, errorcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28021x955d8ea1.m121904x9cf0d20b().m121916x75feee5c()));
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(1105L, 160L, 1L, false);
        }
    }
}

package com.p314xaae8f345.p347x615374d.p349x208df1fe;

@j95.b
/* renamed from: com.tencent.kinda.framework.HKOfflinePayServices */
/* loaded from: classes9.dex */
public class C3085xa6dfc5a6 extends i95.w implements com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f {
    private static final java.lang.String TAG = "HKOfflinePayServices";

    /* renamed from: mInitFlag */
    private boolean f11462x34f77829 = false;

    /* renamed from: getHKCertDeviceId */
    private java.lang.String m24637x907b65ce() {
        java.lang.String g17 = wo.w0.g(false);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) ? wo.w0.k() : g17;
    }

    /* renamed from: getHKCertRootPath */
    private java.lang.String m24638x446a93e4() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getFilesDir().getParentFile().getAbsolutePath() + "/hkcert";
    }

    /* renamed from: getHKCertUserId */
    private java.lang.String m24639x607f7543() {
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.a(c01.z1.r());
    }

    /* renamed from: initHKCertIfNeed */
    private void m24640xcc8e890a() {
        if (this.f11462x34f77829) {
            return;
        }
        if (!com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121895x316510(m24638x446a93e4(), m24637x907b65ce(), "WeChatPayHK", m24639x607f7543())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "hkcert init fail, errcode is %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "hkcert init succ");
            this.f11462x34f77829 = true;
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: decryptByAes */
    public byte[] mo24641x4673a76b(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return com.p3249xcbb51f6b.ndk.C28013x36bca45.m121789x3d6f0146(bArr, bArr2, bArr3);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: decryptByCftCert */
    public java.lang.String mo24642x77db5ed1(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return "";
        }
        m24640xcc8e890a();
        byte[] m121882xcd1676c9 = com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121882xcd1676c9(str, android.util.Base64.decode(str2, 0));
        if (m121882xcd1676c9 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert decrypt fail, plain data is null, cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
            return "";
        }
        java.lang.String str3 = new java.lang.String(m121882xcd1676c9);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert decrypt fail, plain to string null, cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        }
        return str3;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: deleteCftCert */
    public boolean mo24643x1d654a0a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        m24640xcc8e890a();
        if (com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121887xb437c611(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clear cert succ, certid is : %s", str);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "clear cert fail, certid is : %s, errcode is : %s", str, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: encryptByAes */
    public byte[] mo24644x8a2f9593(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return com.p3249xcbb51f6b.ndk.C28013x36bca45.m121790x6820596e(bArr, bArr2, bArr3);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: genAlgoToken */
    public java.lang.String mo24645x518155f6(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19) {
        m24640xcc8e890a();
        java.lang.String m121888xb39fcb0 = com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121888xb39fcb0(str, i17, i18, bArr, j17, j18, j19, i19);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m121888xb39fcb0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "gen code fail, errcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        }
        return m121888xb39fcb0;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getCertid */
    public java.lang.String mo24646x13cbc135() {
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getCftCSR */
    public java.lang.String mo24647x13da06c7(java.lang.String str) {
        m24640xcc8e890a();
        java.lang.String m121889xb58832cc = com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121889xb58832cc(1);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m121889xb58832cc)) {
            return m121889xb58832cc;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "get rsa2048 csr fail, errcode is : %s", java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        return "";
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getCftCertSign */
    public java.lang.String mo24648xca63545c(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return "";
        }
        m24640xcc8e890a();
        byte[] m121884xd3fc2a01 = com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121884xd3fc2a01(str, str2.getBytes());
        if (m121884xd3fc2a01 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert sign fail, sign is null,cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
            return "";
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(m121884xd3fc2a01, 0);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(encodeToString)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "cert sign fail, base64 encode sign fail, cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        }
        return encodeToString;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getDeviceid */
    public java.lang.String mo24649xbdf72b67() {
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_DEVICEID_STRING_SYNC, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getLastSelectedCVItemId */
    public java.lang.String mo24650x5cb46ca8() {
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getLastSelectedCardBindSerial */
    public java.lang.String mo24651xea6a1968() {
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: getOfflinePayAckKey */
    public java.lang.String mo24652x8b5adcb1() {
        return (java.lang.String) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_PAYACKKEY_STRING_SYNC, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: importCftCert */
    public boolean mo24653xcf9b8ed0(java.lang.String str, java.lang.String str2) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        m24640xcc8e890a();
        if (com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121894x7ea51769(str, str2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "import cert succ, certid is : %s", str);
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "import cert fail, certid is : %s, errcode is : %s", str, java.lang.Integer.valueOf(com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121890x74627852()));
        return false;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: isCertExists */
    public boolean mo24654x2ff53c6a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        m24640xcc8e890a();
        return com.p3249xcbb51f6b.ndk.C28018xc26e53ca.m121893x2982b3de(str);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: openHKFacingReceiveView */
    public void mo24655x59e952a1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "open hk facing receive activity");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 2);
        j45.l.j(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), "collect", ".ui.CollectHKMainUI", intent, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: openHalfPageWebViewImpl */
    public void mo24656x724a3c6d(java.lang.String str, final com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d6123) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1 n1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.n1();
        n1Var.f268951a = 0.9f;
        n1Var.f268954d = false;
        n1Var.f268955e = false;
        n1Var.f268956f = -1;
        java.lang.Object wi6 = ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), str, null, n1Var);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m1) wi6).show();
        ((hg5.d) wi6).f362939o = new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.kinda.framework.HKOfflinePayServices.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.p347x615374d.p349x208df1fe.C3085xa6dfc5a6.TAG, "close half page webview dialog");
                com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d61232 = abstractC3618x898d6123;
                if (abstractC3618x898d61232 != null) {
                    abstractC3618x898d61232.mo28431x2e7a5e(true);
                }
            }
        };
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: openScanQrCodeView */
    public void mo24657x9e63f2ba() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "open scan qrcode activity");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 8);
        intent.putExtra("key_scan_report_enter_scene", 3);
        j45.l.j(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3369x2d6489c2.get(), "scanner", ".ui.BaseScanUI", intent, null);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: removeCertId */
    public void mo24658xb1010c03() {
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, "");
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: setCertid */
    public boolean mo24659x700f541(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: setDeviceid */
    public boolean mo24660xb8af8c73(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return false;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_DEVICEID_STRING_SYNC, str);
        return true;
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: setLastSelectedCVItemId */
    public void mo24661xd7079bb4(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, "");
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: setLastSelectedCardBindSerial */
    public void mo24662xda28cf74(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, "");
        } else {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, str);
        }
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: setOfflinePayAckKey */
    public void mo24663x2f5771bd(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_HKOFFLINE_PAYACKKEY_STRING_SYNC, str);
    }

    @Override // com.p314xaae8f345.p347x615374d.p349x208df1fe.api.InterfaceC3109x3e7dc76f
    /* renamed from: sha256Hex */
    public java.lang.String mo24664x31cb5f74(byte[] bArr) {
        return new com.p3249xcbb51f6b.ndk.C28020x74fa7f2d().m121902x984bccbe(bArr);
    }
}

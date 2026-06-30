package com.tencent.kinda.framework;

@j95.b
/* loaded from: classes9.dex */
public class HKOfflinePayServices extends i95.w implements com.tencent.kinda.framework.api.IHKOfflinePayServices {
    private static final java.lang.String TAG = "HKOfflinePayServices";
    private boolean mInitFlag = false;

    private java.lang.String getHKCertDeviceId() {
        java.lang.String g17 = wo.w0.g(false);
        return com.tencent.mm.sdk.platformtools.t8.K0(g17) ? wo.w0.k() : g17;
    }

    private java.lang.String getHKCertRootPath() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getParentFile().getAbsolutePath() + "/hkcert";
    }

    private java.lang.String getHKCertUserId() {
        return com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r());
    }

    private void initHKCertIfNeed() {
        if (this.mInitFlag) {
            return;
        }
        if (!com.tenpay.ndk.HkWxCertUtil.init(getHKCertRootPath(), getHKCertDeviceId(), "WeChatPayHK", getHKCertUserId())) {
            com.tencent.mars.xlog.Log.i(TAG, "hkcert init fail, errcode is %s", java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "hkcert init succ");
            this.mInitFlag = true;
        }
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public byte[] decryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return com.tenpay.ndk.Encrypt.aesDecryptCBC(bArr, bArr2, bArr3);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String decryptByCftCert(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return "";
        }
        initHKCertIfNeed();
        byte[] certDecrypt = com.tenpay.ndk.HkWxCertUtil.certDecrypt(str, android.util.Base64.decode(str2, 0));
        if (certDecrypt == null) {
            com.tencent.mars.xlog.Log.i(TAG, "cert decrypt fail, plain data is null, cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
            return "";
        }
        java.lang.String str3 = new java.lang.String(certDecrypt);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.i(TAG, "cert decrypt fail, plain to string null, cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        }
        return str3;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public boolean deleteCftCert(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        initHKCertIfNeed();
        if (com.tenpay.ndk.HkWxCertUtil.clearCert(str)) {
            com.tencent.mars.xlog.Log.i(TAG, "clear cert succ, certid is : %s", str);
            return true;
        }
        com.tencent.mars.xlog.Log.i(TAG, "clear cert fail, certid is : %s, errcode is : %s", str, java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        return false;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public byte[] encryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return com.tenpay.ndk.Encrypt.aesEncryptCBC(bArr, bArr2, bArr3);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String genAlgoToken(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19) {
        initHKCertIfNeed();
        java.lang.String algoToken = com.tenpay.ndk.HkWxCertUtil.getAlgoToken(str, i17, i18, bArr, j17, j18, j19, i19);
        if (com.tencent.mm.sdk.platformtools.t8.K0(algoToken)) {
            com.tencent.mars.xlog.Log.i(TAG, "gen code fail, errcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        }
        return algoToken;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getCertid() {
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getCftCSR(java.lang.String str) {
        initHKCertIfNeed();
        java.lang.String csr = com.tenpay.ndk.HkWxCertUtil.getCsr(1);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(csr)) {
            return csr;
        }
        com.tencent.mars.xlog.Log.i(TAG, "get rsa2048 csr fail, errcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        return "";
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getCftCertSign(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return "";
        }
        initHKCertIfNeed();
        byte[] certSign = com.tenpay.ndk.HkWxCertUtil.certSign(str, str2.getBytes());
        if (certSign == null) {
            com.tencent.mars.xlog.Log.i(TAG, "cert sign fail, sign is null,cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
            return "";
        }
        java.lang.String encodeToString = android.util.Base64.encodeToString(certSign, 0);
        if (com.tencent.mm.sdk.platformtools.t8.K0(encodeToString)) {
            com.tencent.mars.xlog.Log.i(TAG, "cert sign fail, base64 encode sign fail, cerid : %s, errcode : %s", str, java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        }
        return encodeToString;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getDeviceid() {
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_DEVICEID_STRING_SYNC, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getLastSelectedCVItemId() {
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getLastSelectedCardBindSerial() {
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String getOfflinePayAckKey() {
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_PAYACKKEY_STRING_SYNC, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public boolean importCftCert(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        initHKCertIfNeed();
        if (com.tenpay.ndk.HkWxCertUtil.importCert(str, str2)) {
            com.tencent.mars.xlog.Log.i(TAG, "import cert succ, certid is : %s", str);
            return true;
        }
        com.tencent.mars.xlog.Log.i(TAG, "import cert fail, certid is : %s, errcode is : %s", str, java.lang.Integer.valueOf(com.tenpay.ndk.HkWxCertUtil.getError()));
        return false;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public boolean isCertExists(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        initHKCertIfNeed();
        return com.tenpay.ndk.HkWxCertUtil.hasCert(str);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void openHKFacingReceiveView() {
        com.tencent.mars.xlog.Log.i(TAG, "open hk facing receive activity");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_from_scene", 2);
        j45.l.j(com.tencent.kinda.framework.widget.tools.KindaContext.get(), "collect", ".ui.CollectHKMainUI", intent, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void openHalfPageWebViewImpl(java.lang.String str, final com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.n1 n1Var = new com.tencent.mm.plugin.webview.ui.tools.widget.n1();
        n1Var.f187418a = 0.9f;
        n1Var.f187421d = false;
        n1Var.f187422e = false;
        n1Var.f187423f = -1;
        java.lang.Object wi6 = ((yg0.s2) ((zg0.u2) i95.n0.c(zg0.u2.class))).wi(com.tencent.kinda.framework.widget.tools.KindaContext.get(), str, null, n1Var);
        ((com.tencent.mm.plugin.webview.ui.tools.widget.m1) wi6).show();
        ((hg5.d) wi6).f281406o = new android.content.DialogInterface.OnDismissListener() { // from class: com.tencent.kinda.framework.HKOfflinePayServices.1
            @Override // android.content.DialogInterface.OnDismissListener
            public void onDismiss(android.content.DialogInterface dialogInterface) {
                com.tencent.mars.xlog.Log.i(com.tencent.kinda.framework.HKOfflinePayServices.TAG, "close half page webview dialog");
                com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback2 = voidBoolCallback;
                if (voidBoolCallback2 != null) {
                    voidBoolCallback2.call(true);
                }
            }
        };
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void openScanQrCodeView() {
        com.tencent.mars.xlog.Log.i(TAG, "open scan qrcode activity");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("BaseScanUI_select_scan_mode", 8);
        intent.putExtra("key_scan_report_enter_scene", 3);
        j45.l.j(com.tencent.kinda.framework.widget.tools.KindaContext.get(), "scanner", ".ui.BaseScanUI", intent, null);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void removeCertId() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, "");
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public boolean setCertid(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_CERTID_STRING_SYNC, str);
        return true;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public boolean setDeviceid(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_DEVICEID_STRING_SYNC, str);
        return true;
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void setLastSelectedCVItemId(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, "");
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_LASTSELECTEDCVID_STRING_SYNC, str);
        }
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void setLastSelectedCardBindSerial(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, "");
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_LASTSELECTEDBINDSERIAL_STRING_SYNC, str);
        }
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public void setOfflinePayAckKey(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_HKOFFLINE_PAYACKKEY_STRING_SYNC, str);
    }

    @Override // com.tencent.kinda.framework.api.IHKOfflinePayServices
    public java.lang.String sha256Hex(byte[] bArr) {
        return new com.tenpay.ndk.MessageDigestUtil().getSHA256Hex(bArr);
    }
}

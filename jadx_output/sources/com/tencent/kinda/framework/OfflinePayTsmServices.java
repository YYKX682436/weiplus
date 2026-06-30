package com.tencent.kinda.framework;

@j95.b
/* loaded from: classes9.dex */
public class OfflinePayTsmServices extends i95.w implements com.tencent.kinda.framework.api.IOfflinePayTsmServices {
    private static final java.lang.String TAG = "OfflinePayTsmService";
    private boolean mInitFlag = false;

    private java.lang.String getTsmCertDeviceId() {
        java.lang.String g17 = wo.w0.g(false);
        return com.tencent.mm.sdk.platformtools.t8.K0(g17) ? wo.w0.k() : g17;
    }

    private java.lang.String getTsmCertRootPath() {
        java.lang.String str;
        gm0.j1.i();
        if (java.lang.Boolean.valueOf(gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_TSMCERT_V2PATH_BOOLEAN_SYNC, false)).booleanValue()) {
            com.tencent.mars.xlog.Log.i(TAG, "use v2 path");
            str = "/tsmCertV2";
        } else {
            str = "/tsmCert";
        }
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getFilesDir().getParentFile().getAbsolutePath() + str;
    }

    private java.lang.String getTsmCertUserId() {
        return com.tencent.mm.sdk.platformtools.w2.a(c01.z1.r());
    }

    private void initTsmCertIfNeed() {
        if (this.mInitFlag) {
            return;
        }
        java.lang.String tsmCertRootPath = getTsmCertRootPath();
        java.lang.String tsmCertDeviceId = getTsmCertDeviceId();
        java.lang.String tsmCertUserId = getTsmCertUserId();
        com.tenpay.ndk.WxSmCertUtil wxSmCertUtil = com.tenpay.ndk.WxSmCertUtil.getInstance();
        if (!wxSmCertUtil.init(tsmCertRootPath, tsmCertDeviceId, "OfflinePayTsm", tsmCertUserId)) {
            com.tencent.mars.xlog.Log.i(TAG, "tsmCert init fail, errcode is %s", java.lang.Integer.valueOf(wxSmCertUtil.getLastError()));
            gm0.j1.i();
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_TSMCERT_V2PATH_BOOLEAN_SYNC;
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c17.o(u3Var, false));
            if (valueOf.booleanValue()) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 144L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 143L, 1L, false);
            }
            if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_offline_initcert_v2path, false) || valueOf.booleanValue()) {
                return;
            }
            com.tencent.mars.xlog.Log.i(TAG, "use v2 path to init cert");
            gm0.j1.i();
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.TRUE);
            boolean init = wxSmCertUtil.init(getTsmCertRootPath(), tsmCertDeviceId, "OfflinePayTsm", tsmCertUserId);
            com.tencent.mars.xlog.Log.i(TAG, "cert init with V2RootPath , v2ret is %s", java.lang.Boolean.valueOf(init));
            if (!init) {
                com.tencent.mars.xlog.Log.i(TAG, "cert init with V2RootPath , error code is %d", java.lang.Integer.valueOf(wxSmCertUtil.getLastError()));
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 144L, 1L, false);
                return;
            }
        }
        com.tencent.mars.xlog.Log.i(TAG, "tsmCert init succ");
        this.mInitFlag = true;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public void cleanTsmToken(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return;
        }
        initTsmCertIfNeed();
        if (com.tenpay.ndk.WxSmCertUtil.getInstance().clearToken(str)) {
            return;
        }
        com.tencent.mars.xlog.Log.i(TAG, "clean tsm token fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 154L, 1L, false);
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String decryptByTsmCert(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        initTsmCertIfNeed();
        byte[] certDecrypt = com.tenpay.ndk.WxSmCertUtil.getInstance().certDecrypt(str, str2.getBytes());
        if (certDecrypt != null) {
            return new java.lang.String(certDecrypt);
        }
        com.tencent.mars.xlog.Log.i(TAG, "cert decrypt fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
        return null;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public boolean deleteTsmCert(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean clearCert = com.tenpay.ndk.WxSmCertUtil.getInstance().clearCert(str);
        if (!clearCert) {
            com.tencent.mars.xlog.Log.i(TAG, "delete tsm cert fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 155L, 1L, false);
        }
        return clearCert;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public int getRemainTsmTokenCount(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        initTsmCertIfNeed();
        return com.tenpay.ndk.WxSmCertUtil.getInstance().getTokenCount(str);
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String getTokenPrefix() {
        return null;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String getTsmCSR(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            str = getTsmCertUserId();
        }
        initTsmCertIfNeed();
        java.lang.String makeCsr = com.tenpay.ndk.WxSmCertUtil.getInstance().makeCsr("WeChatPay", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(makeCsr)) {
            com.tencent.mars.xlog.Log.i(TAG, "make csr return nil, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 157L, 1L, false);
        }
        return makeCsr;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String getTsmCertCAVersion() {
        initTsmCertIfNeed();
        return com.tenpay.ndk.WxSmCertUtil.getInstance().getCaCertVersion() + "";
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String getTsmCertSign(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return null;
        }
        initTsmCertIfNeed();
        byte[] certSign = com.tenpay.ndk.WxSmCertUtil.getInstance().certSign(str, str2.getBytes(), getTsmCertUserId().getBytes());
        if (certSign != null) {
            return android.util.Base64.encodeToString(certSign, 2);
        }
        com.tencent.mars.xlog.Log.i(TAG, "cert sign fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 153L, 1L, false);
        return null;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String getTsmSignUserId() {
        return getTsmCertUserId();
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public java.lang.String getTsmToken(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        initTsmCertIfNeed();
        return com.tenpay.ndk.WxSmCertUtil.getInstance().getToken(str);
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public boolean importTsmCert(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wcpay_offline_tsm_verify, false);
        boolean importCert = com.tenpay.ndk.WxSmCertUtil.getInstance().importCert(str, str2, fj6);
        if (!importCert) {
            com.tencent.mars.xlog.Log.i(TAG, "import cert fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
            if (fj6) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 159L, 1L, false);
            } else {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 158L, 1L, false);
            }
        }
        return importCert;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public boolean isOfflinePayCertExists(java.lang.String str) {
        boolean hasCert;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        initTsmCertIfNeed();
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.c0.clicfg_android_offline_cert_check_privatekey, true)) {
            com.tencent.mars.xlog.Log.i(TAG, "check cert private key");
            hasCert = com.tenpay.ndk.WxSmCertUtil.getInstance().hasCert(str, true);
        } else {
            hasCert = com.tenpay.ndk.WxSmCertUtil.getInstance().hasCert(str);
        }
        if (hasCert) {
            long[] certValidTime = com.tenpay.ndk.WxSmCertUtil.getInstance().getCertValidTime(str);
            if (certValidTime.length > 1) {
                long j17 = certValidTime[1];
                java.lang.Long valueOf = java.lang.Long.valueOf(c01.id.a() / 1000);
                if (j17 < valueOf.longValue()) {
                    com.tencent.mars.xlog.Log.i(TAG, "cert expiretime is %ld, small than current time %ld, need delete", java.lang.Long.valueOf(j17), valueOf);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    g0Var.idkeyStat(1105L, 150L, 1L, false);
                    if (!((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_android_wcpay_offline_tsm_expire_delete_disable, false)) {
                        com.tencent.mars.xlog.Log.i(TAG, "cert expire, delete");
                        g0Var.idkeyStat(1105L, 151L, 1L, false);
                        deleteTsmCert(str);
                        return false;
                    }
                    com.tencent.mars.xlog.Log.i(TAG, "delete block abtest is open");
                    g0Var.idkeyStat(1105L, 152L, 1L, false);
                }
            }
        }
        return hasCert;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public boolean setTsmTokenCode(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        initTsmCertIfNeed();
        boolean token = com.tenpay.ndk.WxSmCertUtil.getInstance().setToken(str2, str);
        if (!token) {
            com.tencent.mars.xlog.Log.i(TAG, "set token fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 156L, 1L, false);
        }
        return token;
    }

    @Override // com.tencent.kinda.framework.api.IOfflinePayTsmServices
    public void updateTsmCert(java.lang.String str, java.lang.String[] strArr) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || strArr == null || strArr.length == 0) {
            return;
        }
        initTsmCertIfNeed();
        int P = com.tencent.mm.sdk.platformtools.t8.P(str, 0);
        int caCertVersion = com.tenpay.ndk.WxSmCertUtil.getInstance().getCaCertVersion();
        if (P <= 0 || P <= caCertVersion) {
            return;
        }
        if (com.tenpay.ndk.WxSmCertUtil.getInstance().updateCaCert(P, strArr)) {
            com.tencent.mars.xlog.Log.i(TAG, "update ca cert succ");
        } else {
            com.tencent.mars.xlog.Log.i(TAG, "update ca cert fail, errorcode is : %s", java.lang.Integer.valueOf(com.tenpay.ndk.WxSmCertUtil.getInstance().getLastError()));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 160L, 1L, false);
        }
    }
}

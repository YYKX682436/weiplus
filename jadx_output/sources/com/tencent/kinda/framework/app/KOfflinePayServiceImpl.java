package com.tencent.kinda.framework.app;

/* loaded from: classes9.dex */
public class KOfflinePayServiceImpl implements com.tencent.kinda.gen.KOfflinePayService {
    private static final java.lang.String TAG = "KOfflinePayServiceImpl";
    private int KindaOfflinePayCertCsrType_RSA = 1;
    private int KindaOfflinePayCertCsrType_SM = 2;

    private boolean isTsmModeEnable() {
        return getKindaOfflinePayCertType() == this.KindaOfflinePayCertCsrType_SM;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void cleanCftToken(java.lang.String str) {
        if (isTsmModeEnable()) {
            ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).cleanTsmToken(str);
        } else {
            com.tencent.mm.wallet_core.model.g.c().a(str);
        }
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String decryptByCftCert(java.lang.String str, java.lang.String str2) {
        if (isTsmModeEnable()) {
            return ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).decryptByTsmCert(str, str2);
        }
        com.tencent.mm.wallet_core.model.g.c().getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.CertUtilWx", "call cert decrypt %s, %s", str, str2);
        return com.tenpay.ndk.CertUtil.getInstance().decrypt(str, str2);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean deleteCftCert(java.lang.String str) {
        if (isTsmModeEnable()) {
            return ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).deleteTsmCert(str);
        }
        com.tencent.mm.wallet_core.model.g.c().getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        com.tenpay.ndk.CertUtil.getInstance().clearCert(str);
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getCertCAVersion() {
        if (getKindaOfflinePayCsrCertType() == this.KindaOfflinePayCertCsrType_SM) {
            return ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getTsmCertCAVersion();
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getCertid() {
        return to3.c0.Ai().Ni(196617);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getCftCSR(java.lang.String str) {
        if (getKindaOfflinePayCsrCertType() == this.KindaOfflinePayCertCsrType_SM) {
            return ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getTsmCSR(str);
        }
        com.tencent.mm.wallet_core.model.g c17 = com.tencent.mm.wallet_core.model.g.c();
        synchronized (c17) {
            c17.f213898a = false;
        }
        return com.tencent.mm.wallet_core.model.g.c().b(str, com.tencent.mm.wallet_core.b.a().f() ? 1 : 0);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getCftCertSign(java.lang.String str, java.lang.String str2) {
        if (isTsmModeEnable()) {
            return ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getTsmCertSign(str, str2);
        }
        com.tencent.mm.wallet_core.model.g.c().getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        return com.tenpay.ndk.CertUtil.getInstance().genUserSig(str, str2);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getCftToken(java.lang.String str) {
        if (isTsmModeEnable()) {
            java.lang.String tsmToken = ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getTsmToken(str);
            if (yo3.m.j(tsmToken)) {
                return tsmToken;
            }
            com.tencent.mars.xlog.Log.i(TAG, "tsm token is null or not numeric");
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 77L, 1L, false);
            return null;
        }
        com.tencent.mm.wallet_core.model.g.c().getClass();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        com.tencent.mm.sdk.platformtools.z3.b(true);
        java.lang.String token = com.tenpay.ndk.CertUtil.getInstance().getToken(str);
        if (yo3.m.j(token)) {
            return token;
        }
        com.tencent.mars.xlog.Log.i(TAG, "rsa token is null or not numeric");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1105L, 76L, 1L, false);
        return null;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public int getCodever() {
        java.lang.String str = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, "") + "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return 0;
        }
        return com.tencent.mm.sdk.platformtools.t8.P(str, 0);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getDeviceid() {
        return to3.c0.Ai().Ni(196628);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public int getKindaOfflinePayCertType() {
        return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, 0);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public int getKindaOfflinePayCsrCertType() {
        return gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_CSRCERTYPE_INT_SYNC, 0);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getLastSelectedCardBankType() {
        com.tencent.mm.plugin.wallet_core.model.Bankcard f17;
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        java.lang.String str = (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, "");
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || (f17 = vr4.f1.wi().Ai().f(str)) == null) ? "" : f17.field_bankcardType;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getLastSelectedCardBindSerial() {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        return (java.lang.String) gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, "");
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public long getLastTokenUpdateTs() {
        try {
            return java.lang.Long.valueOf(to3.c0.Ai().Ni(196632)).longValue();
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getOfflinePayAckKey() {
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, "");
        if (m17 != null) {
            return (java.lang.String) m17;
        }
        return null;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean getOfflinePayHasSuccess() {
        com.tencent.mars.xlog.Log.i(TAG, "clicfg_android_disable_offlinepay_first_secure_tips is true");
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public int getRegetTokenNum() {
        return to3.c0.Bi();
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public int getRemainCftTokenNum(java.lang.String str) {
        return isTsmModeEnable() ? ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getRemainTsmTokenCount(str) : to3.c0.Ai().Ui().d(true);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getSignUserId() {
        return isTsmModeEnable() ? ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getTsmSignUserId() : "";
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public java.lang.String getTokenPin() {
        return isTsmModeEnable() ? ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).getTokenPrefix() : to3.c0.Ai().Ni(196647);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public int getTokenUpdateInterval() {
        return yo3.m.g();
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean importCftCert(java.lang.String str, java.lang.String str2) {
        return isTsmModeEnable() ? ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).importTsmCert(str, str2) : com.tencent.mm.wallet_core.model.g.c().e(str, str2);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean isCertExists(java.lang.String str) {
        boolean g17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        if (isTsmModeEnable()) {
            g17 = ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).isOfflinePayCertExists(str);
            if (!g17) {
                com.tencent.mm.wallet_core.model.g.c().getClass();
                com.tencent.mm.sdk.platformtools.z3.b(true);
                com.tenpay.ndk.CertUtil.getInstance().clearCert(str);
                to3.c0.Ai().Vi(196617, "");
                com.tencent.mars.xlog.Log.i(TAG, "certid exists, but cert not exist in tsm, remove cert from rsa");
            }
        } else {
            g17 = com.tencent.mm.wallet_core.model.g.c().g(str);
            if (!g17) {
                ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).deleteTsmCert(str);
                to3.c0.Ai().Vi(196617, "");
                com.tencent.mars.xlog.Log.i(TAG, "certid exists, but cert not exist in rsa, remove cert from tsm");
            }
        }
        return g17;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void removeCertid() {
        to3.c0.Ai().Vi(196617, "");
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setCertid(java.lang.String str) {
        if (lj.f.f(str)) {
            return false;
        }
        to3.c0.Ai().Vi(196617, str);
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setCftTokenCode(java.lang.String str, java.lang.String str2) {
        boolean tsmTokenCode = isTsmModeEnable() ? ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).setTsmTokenCode(str, str2) : com.tencent.mm.wallet_core.model.g.c().h(str2, str, false);
        if (tsmTokenCode) {
            yo3.m.u(2);
        }
        return tsmTokenCode;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setCodever(int i17) {
        java.lang.String str = i17 + "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_CODE_VER_STRING, str);
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setDeviceid(java.lang.String str) {
        if (lj.f.f(str)) {
            return false;
        }
        to3.c0.Ai().Vi(196628, str);
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setKindaOfflinePayCertType(int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_CERTTYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setKindaOfflinePayCsrCertType(int i17) {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_KINDAOFFLINE_CSRCERTYPE_INT_SYNC, java.lang.Integer.valueOf(i17));
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setLastSelectedCardBindSerial(java.lang.String str, java.lang.String str2) {
        ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().getClass();
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_OFFLINE_ONLINE_BIND_SERIAL_STRING_SYNC, str);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setLastTokenUpdateTs(long j17) {
        to3.c0.Ai().Vi(196632, java.lang.String.valueOf(j17));
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setOfflinePayAckKey(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.BUSINESS_OFFLINE_GETMSG_ACK_KEY_STRING, str);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setOfflinePayHasSuccess() {
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_ADDRESS_HAS_SHOW_WALLETOFFLINE2_DIALOG_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setOfflineStateClose() {
        to3.c0.Ai().Vi(196630, "0");
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setOfflineStateOpen() {
        if (isTsmModeEnable()) {
            to3.c0.Ai().Vi(196630, "0");
        } else {
            to3.c0.Ai().Vi(196630, "1");
        }
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setRegetTokenNum(int i17) {
        yo3.m.r(i17);
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public boolean setTokenPin(java.lang.String str) {
        if (lj.f.f(str)) {
            return false;
        }
        to3.c0.Ai().Vi(196647, str);
        return true;
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void setTokenUpdateInterval(int i17) {
        to3.c0.Ai().Vi(196649, java.lang.String.valueOf(i17));
    }

    @Override // com.tencent.kinda.gen.KOfflinePayService
    public void updateCert(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList) {
        if (!isTsmModeEnable() || arrayList.size() <= 0) {
            return;
        }
        java.lang.String[] strArr = new java.lang.String[arrayList.size()];
        arrayList.toArray(strArr);
        ((com.tencent.kinda.framework.api.IOfflinePayTsmServices) i95.n0.c(com.tencent.kinda.framework.api.IOfflinePayTsmServices.class)).updateTsmCert(str, strArr);
    }
}

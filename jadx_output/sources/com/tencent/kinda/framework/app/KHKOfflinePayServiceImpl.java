package com.tencent.kinda.framework.app;

/* loaded from: classes16.dex */
public class KHKOfflinePayServiceImpl implements com.tencent.kinda.gen.KHKOfflinePayService {
    private static final java.lang.String TAG = "KHKOfflinePayServiceImpl";

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public byte[] decryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).decryptByAes(bArr, bArr2, bArr3);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String decryptByCftCert(java.lang.String str, java.lang.String str2) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).decryptByCftCert(str, str2);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public boolean deleteCftCert(java.lang.String str) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).deleteCftCert(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public byte[] encryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).encryptByAes(bArr, bArr2, bArr3);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String genAlgoToken(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).genAlgoToken(str, i17, i18, bArr, j17, j18, j19, i19);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getCertid() {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getCertid();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getCftCSR(java.lang.String str) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getCftCSR(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getCftCertSign(java.lang.String str, java.lang.String str2) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getCftCertSign(str, str2);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getDeviceid() {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getDeviceid();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getLastSelectedCVItemId() {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getLastSelectedCVItemId();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getLastSelectedCardBindSerial() {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getLastSelectedCardBindSerial();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String getOfflinePayAckKey() {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).getOfflinePayAckKey();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public boolean importCftCert(java.lang.String str, java.lang.String str2) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).importCftCert(str, str2);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public boolean isCertExists(java.lang.String str) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).isCertExists(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void openHKFacingReceiveView() {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).openHKFacingReceiveView();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void openHalfPageWebViewImpl(java.lang.String str, com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback) {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).openHalfPageWebViewImpl(str, voidBoolCallback);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void openScanQrCodeView() {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).openScanQrCodeView();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void removeCertid() {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).removeCertId();
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public boolean setCertid(java.lang.String str) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).setCertid(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public boolean setDeviceid(java.lang.String str) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).setDeviceid(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void setLastSelectedCVItemId(java.lang.String str) {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).setLastSelectedCVItemId(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void setLastSelectedCardBindSerial(java.lang.String str) {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).setLastSelectedCardBindSerial(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public void setOfflinePayAckKey(java.lang.String str) {
        ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).setOfflinePayAckKey(str);
    }

    @Override // com.tencent.kinda.gen.KHKOfflinePayService
    public java.lang.String sha256Hex(byte[] bArr) {
        return ((com.tencent.kinda.framework.api.IHKOfflinePayServices) i95.n0.c(com.tencent.kinda.framework.api.IHKOfflinePayServices.class)).sha256Hex(bArr);
    }
}

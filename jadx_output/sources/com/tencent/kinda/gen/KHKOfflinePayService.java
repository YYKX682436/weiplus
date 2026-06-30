package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KHKOfflinePayService {
    byte[] decryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3);

    java.lang.String decryptByCftCert(java.lang.String str, java.lang.String str2);

    boolean deleteCftCert(java.lang.String str);

    byte[] encryptByAes(byte[] bArr, byte[] bArr2, byte[] bArr3);

    java.lang.String genAlgoToken(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19);

    java.lang.String getCertid();

    java.lang.String getCftCSR(java.lang.String str);

    java.lang.String getCftCertSign(java.lang.String str, java.lang.String str2);

    java.lang.String getDeviceid();

    java.lang.String getLastSelectedCVItemId();

    java.lang.String getLastSelectedCardBindSerial();

    java.lang.String getOfflinePayAckKey();

    boolean importCftCert(java.lang.String str, java.lang.String str2);

    boolean isCertExists(java.lang.String str);

    void openHKFacingReceiveView();

    void openHalfPageWebViewImpl(java.lang.String str, com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback);

    void openScanQrCodeView();

    void removeCertid();

    boolean setCertid(java.lang.String str);

    boolean setDeviceid(java.lang.String str);

    void setLastSelectedCVItemId(java.lang.String str);

    void setLastSelectedCardBindSerial(java.lang.String str);

    void setOfflinePayAckKey(java.lang.String str);

    java.lang.String sha256Hex(byte[] bArr);
}

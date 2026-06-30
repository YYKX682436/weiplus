package com.p314xaae8f345.p347x615374d.p349x208df1fe.api;

/* renamed from: com.tencent.kinda.framework.api.IHKOfflinePayServices */
/* loaded from: classes16.dex */
public interface InterfaceC3109x3e7dc76f extends i95.m {
    /* renamed from: decryptByAes */
    byte[] mo24641x4673a76b(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: decryptByCftCert */
    java.lang.String mo24642x77db5ed1(java.lang.String str, java.lang.String str2);

    /* renamed from: deleteCftCert */
    boolean mo24643x1d654a0a(java.lang.String str);

    /* renamed from: encryptByAes */
    byte[] mo24644x8a2f9593(byte[] bArr, byte[] bArr2, byte[] bArr3);

    /* renamed from: genAlgoToken */
    java.lang.String mo24645x518155f6(java.lang.String str, int i17, int i18, byte[] bArr, long j17, long j18, long j19, int i19);

    /* renamed from: getCertid */
    java.lang.String mo24646x13cbc135();

    /* renamed from: getCftCSR */
    java.lang.String mo24647x13da06c7(java.lang.String str);

    /* renamed from: getCftCertSign */
    java.lang.String mo24648xca63545c(java.lang.String str, java.lang.String str2);

    /* renamed from: getDeviceid */
    java.lang.String mo24649xbdf72b67();

    /* renamed from: getLastSelectedCVItemId */
    java.lang.String mo24650x5cb46ca8();

    /* renamed from: getLastSelectedCardBindSerial */
    java.lang.String mo24651xea6a1968();

    /* renamed from: getOfflinePayAckKey */
    java.lang.String mo24652x8b5adcb1();

    /* renamed from: importCftCert */
    boolean mo24653xcf9b8ed0(java.lang.String str, java.lang.String str2);

    /* renamed from: isCertExists */
    boolean mo24654x2ff53c6a(java.lang.String str);

    /* renamed from: openHKFacingReceiveView */
    void mo24655x59e952a1();

    /* renamed from: openHalfPageWebViewImpl */
    void mo24656x724a3c6d(java.lang.String str, com.p314xaae8f345.p347x615374d.gen.AbstractC3618x898d6123 abstractC3618x898d6123);

    /* renamed from: openScanQrCodeView */
    void mo24657x9e63f2ba();

    /* renamed from: removeCertId */
    void mo24658xb1010c03();

    /* renamed from: setCertid */
    boolean mo24659x700f541(java.lang.String str);

    /* renamed from: setDeviceid */
    boolean mo24660xb8af8c73(java.lang.String str);

    /* renamed from: setLastSelectedCVItemId */
    void mo24661xd7079bb4(java.lang.String str);

    /* renamed from: setLastSelectedCardBindSerial */
    void mo24662xda28cf74(java.lang.String str);

    /* renamed from: setOfflinePayAckKey */
    void mo24663x2f5771bd(java.lang.String str);

    /* renamed from: sha256Hex */
    java.lang.String mo24664x31cb5f74(byte[] bArr);
}

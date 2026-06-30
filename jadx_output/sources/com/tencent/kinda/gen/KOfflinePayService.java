package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KOfflinePayService {
    void cleanCftToken(java.lang.String str);

    java.lang.String decryptByCftCert(java.lang.String str, java.lang.String str2);

    boolean deleteCftCert(java.lang.String str);

    java.lang.String getCertCAVersion();

    java.lang.String getCertid();

    java.lang.String getCftCSR(java.lang.String str);

    java.lang.String getCftCertSign(java.lang.String str, java.lang.String str2);

    java.lang.String getCftToken(java.lang.String str);

    int getCodever();

    java.lang.String getDeviceid();

    int getKindaOfflinePayCertType();

    int getKindaOfflinePayCsrCertType();

    java.lang.String getLastSelectedCardBankType();

    java.lang.String getLastSelectedCardBindSerial();

    long getLastTokenUpdateTs();

    java.lang.String getOfflinePayAckKey();

    boolean getOfflinePayHasSuccess();

    int getRegetTokenNum();

    int getRemainCftTokenNum(java.lang.String str);

    java.lang.String getSignUserId();

    java.lang.String getTokenPin();

    int getTokenUpdateInterval();

    boolean importCftCert(java.lang.String str, java.lang.String str2);

    boolean isCertExists(java.lang.String str);

    void removeCertid();

    boolean setCertid(java.lang.String str);

    boolean setCftTokenCode(java.lang.String str, java.lang.String str2);

    boolean setCodever(int i17);

    boolean setDeviceid(java.lang.String str);

    boolean setKindaOfflinePayCertType(int i17);

    boolean setKindaOfflinePayCsrCertType(int i17);

    void setLastSelectedCardBindSerial(java.lang.String str, java.lang.String str2);

    void setLastTokenUpdateTs(long j17);

    void setOfflinePayAckKey(java.lang.String str);

    void setOfflinePayHasSuccess();

    void setOfflineStateClose();

    void setOfflineStateOpen();

    void setRegetTokenNum(int i17);

    boolean setTokenPin(java.lang.String str);

    void setTokenUpdateInterval(int i17);

    void updateCert(java.lang.String str, java.util.ArrayList<java.lang.String> arrayList);
}

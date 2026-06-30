package com.tencent.kinda.framework.api;

/* loaded from: classes9.dex */
public interface IOfflinePayTsmServices extends i95.m {
    void cleanTsmToken(java.lang.String str);

    java.lang.String decryptByTsmCert(java.lang.String str, java.lang.String str2);

    boolean deleteTsmCert(java.lang.String str);

    int getRemainTsmTokenCount(java.lang.String str);

    java.lang.String getTokenPrefix();

    java.lang.String getTsmCSR(java.lang.String str);

    java.lang.String getTsmCertCAVersion();

    java.lang.String getTsmCertSign(java.lang.String str, java.lang.String str2);

    java.lang.String getTsmSignUserId();

    java.lang.String getTsmToken(java.lang.String str);

    boolean importTsmCert(java.lang.String str, java.lang.String str2);

    boolean isOfflinePayCertExists(java.lang.String str);

    boolean setTsmTokenCode(java.lang.String str, java.lang.String str2);

    void updateTsmCert(java.lang.String str, java.lang.String[] strArr);
}

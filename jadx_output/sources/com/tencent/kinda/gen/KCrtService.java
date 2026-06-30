package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KCrtService {
    void delCert();

    java.lang.String getCrtNo();

    boolean hasCrt();

    boolean isCrtExist(java.lang.String str);

    java.lang.String sign(java.lang.String str, byte[] bArr);

    void startDeleteDigitalCrtImpl(java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    void startGenDigitalCrtImpl(com.tencent.kinda.gen.KGenDigitalCrtReq kGenDigitalCrtReq, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    java.lang.String updateCurrentDeviceCertNoWithInfo(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);
}

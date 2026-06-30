package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KUserService {
    java.lang.String city();

    long localBalance();

    java.lang.String province();

    void updateBalance(long j17);

    void updateLqtBalance(long j17);

    void updateUserInfo(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);
}

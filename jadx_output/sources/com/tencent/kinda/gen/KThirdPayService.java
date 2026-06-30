package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KThirdPayService {
    boolean isDcepAppInstalled();

    boolean isSupportApplePay();

    boolean isSupportNFC();

    boolean isYunShanFuAppInstalled();

    void startDcepPayImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void startYunShanFuPayImpl(java.lang.String str, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);
}

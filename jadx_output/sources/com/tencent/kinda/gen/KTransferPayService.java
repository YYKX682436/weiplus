package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KTransferPayService {
    void startTransferCheckAmountImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidI64Callback voidI64Callback);

    void startTransferCheckSurnameImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    void stopTransferCheckAmount();
}

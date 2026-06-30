package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KHKFingerPrintService {
    void authenticateImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    com.tencent.kinda.gen.KRect getFingerPosition();

    com.tencent.kinda.gen.FingerType getFingerType();

    void releaseService();

    void showBioAuthViewImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidStringStringStringCallback voidStringStringStringCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3);

    void showFaceIdAuthDialogImpl(java.lang.String str, com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    com.tencent.kinda.gen.BioType supportBioType();
}

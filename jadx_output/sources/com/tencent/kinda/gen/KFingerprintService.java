package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KFingerprintService {
    void authenticateImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback, com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    void changeAuthKey(boolean z17, boolean z18, java.lang.String str);

    com.tencent.kinda.gen.KRect getFingerPosition();

    com.tencent.kinda.gen.FingerType getFingerType();

    boolean isNeedChangeAuthKey();

    void reGenFpRsaKeyImpl(boolean z17, int i17, java.lang.String str, com.tencent.kinda.gen.VoidStringStringCallback voidStringStringCallback, com.tencent.kinda.gen.VoidCallback voidCallback);

    void releaseService();

    void setNeedChangeAuthKey(boolean z17);

    void showBioAuthViewImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidStringBinaryCallback voidStringBinaryCallback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2, com.tencent.kinda.gen.VoidCallback voidCallback3);

    void showFaceIdAuthDialogImpl(java.lang.String str, com.tencent.kinda.gen.VoidBinaryI32Callback voidBinaryI32Callback, com.tencent.kinda.gen.VoidCallback voidCallback, com.tencent.kinda.gen.VoidCallback voidCallback2);

    com.tencent.kinda.gen.BioType supportBioType();

    void tryInitBiometricImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void userCancel();
}

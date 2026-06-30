package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KWalletLockService {
    boolean addNewBioAuthFid(java.lang.String str);

    void callPatternLockOpImpl(int i17, java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void callPatternLockRegisterImpl(java.lang.String str, java.lang.String str2, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void checkIfPatternLockVerifyLocalImpl(com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    java.lang.String getOhosSortCpuid();

    java.lang.String getOhosSortUid();

    long getPatternLockBlockTimeInterval();

    int getPatternLockVerifyErrorCount();

    boolean isAndroidDeviceUsingFaceID();

    boolean isDeviceEnrolledBioData();

    boolean isDeviceSupportUseTouchLock();

    boolean isOhosDeviceUsingFaceID();

    boolean isPatternLockBlock();

    boolean isPatternLockOpenLocal();

    boolean isTouchLockOpenLocal();

    boolean isiOSDeviceUsingFaceID();

    void prepareAndroidTouchLockAuthImpl(java.lang.String str, boolean z17, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void releaseTouchLockService();

    void requestWalletLockBioAuthImpl(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i18, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void setPatternLockBlock();

    void setPatternLockOpen(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void setPatternLockVerifyErrorCount(int i17);

    void setTouchLockClose(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void setTouchLockOpen(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void setWalletlockClose();

    void showTouchLockAuthViewImpl(com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);
}

package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KWCPayService {
    void addOfflinePayShortcut();

    void checkWalletLockOpenStatusImpl(com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void clearFreezeBalanceMsg();

    void getBannerInfoImpl(int i17, com.tencent.kinda.gen.VoidITransmitKvDataNoticeItemCallback voidITransmitKvDataNoticeItemCallback);

    void getCardListAndUsrVerifiedInfoImpl(com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    java.lang.String getFiltedTruthName(java.lang.String str);

    com.tencent.kinda.gen.FreezeBalanceMsg getFreezeBalanceMsg();

    boolean isBalanceMasked();

    boolean isNeedWalletLock();

    boolean isOfflinePayShortcutPinned();

    boolean isSetWalletLock();

    void openHongbaoDetailUIPageImpl(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void openHongbaoSelectExclusiveMemberPageImpl(java.lang.String str, com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    void openTransferToPhoneLiteapp();

    void refreshHongbaoDetailUIPage(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void setBalanceMasked(boolean z17);

    void startUseCaseImpl(java.lang.String str, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);
}

package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KPaySettingsService {
    void commitHbRefundWayTypeChange();

    void commitTransferDelayTypeChange();

    com.tencent.kinda.gen.KHbRefundWayType getHbRefundWayType();

    boolean getReddotStatus(java.lang.String str);

    com.tencent.kinda.gen.KTransferDelayType getTransferDelayType();

    int getTransferPhoneGrantFlag();

    com.tencent.kinda.gen.KXMLPayRedDot getUnexpiredXMLReddot(java.lang.String str);

    void handlePushBioPaySettingPageImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    boolean isBioPayTypeEnabled(com.tencent.kinda.gen.KBioPayType kBioPayType);

    void logGeneralUserAction(int i17);

    void markReddotConsumed(java.lang.String str);

    void markXMLReddotConsumed(java.lang.String str);

    void setBioPayTypeEnabledImpl(com.tencent.kinda.gen.KBioPayType kBioPayType, boolean z17, com.tencent.kinda.gen.ITransmitKvData iTransmitKvData, com.tencent.kinda.gen.VoidITransmitKvDataCallback voidITransmitKvDataCallback);

    void setHbRefundWayType(com.tencent.kinda.gen.KHbRefundWayType kHbRefundWayType);

    void setTransferDelayType(com.tencent.kinda.gen.KTransferDelayType kTransferDelayType);

    void setTransferPhoneGrantFlag(int i17);

    java.util.ArrayList<com.tencent.kinda.gen.KBioPayType> supportedBioPayTypes();
}

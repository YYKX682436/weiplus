package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface IPlatformUtil {
    void accessibilityAnnounce(com.tencent.kinda.gen.KView kView, java.lang.String str);

    void accessibilityFocus(com.tencent.kinda.gen.KView kView);

    int androidAPILevel();

    com.tencent.kinda.gen.AndroidDpiLevel androidDpiLevel();

    byte[] base64Decode(java.lang.String str);

    java.lang.String base64DecodeString(java.lang.String str);

    java.lang.String base64Encode(byte[] bArr);

    void beginIgnoringInteractionEvents();

    java.lang.String currentLanguageCode();

    com.tencent.kinda.gen.Platform currentPlatform();

    boolean delSecurityStore(java.lang.String str);

    float dynamicFontSize(float f17);

    float dynamicSize(float f17);

    float dynamicSizeByFontLevel(float f17, int i17);

    void endIgnoringInteractionEvents();

    byte[] faceDataDecrypt(byte[] bArr, byte[] bArr2);

    byte[] faceDataEncrypt(byte[] bArr, byte[] bArr2);

    java.lang.String genUUID();

    int getAccessibilityIsTouchExplorationEnabled();

    java.util.ArrayList<java.lang.String> getAccessibilityServiceList();

    java.lang.String getAndroidRepairConfig(java.lang.String str);

    float getBottomSafeAreaHeight();

    com.tencent.kinda.gen.LocationInfoStruct getCachedLocationInfo();

    com.tencent.kinda.gen.LocationInfoStruct getCachedLocationInfoForCashier();

    int getClientVersion();

    java.lang.String getDeviceInfoForYuanBaoAd();

    boolean getExptBoolValue(java.lang.String str);

    java.lang.String getExptStringValue(java.lang.String str);

    int getFontLevel();

    float getIphoneSafeAreaBottomHeight();

    boolean getIsAccessibilityServiceRunning();

    int getLQTVersion();

    float getLoigcalResolutionHeight();

    float getLoigcalResolutionWidth();

    java.lang.String getMemoryKVString(java.lang.String str);

    float getNavigationBarHeight();

    float getPadSplitHeight();

    float getPadSplitWidth();

    java.lang.String getPhoneOsVersion();

    java.lang.String getPhonePlatform();

    java.lang.String getPlatformString(java.lang.String str);

    float getPx(float f17);

    int getRedDotStatus(java.lang.String str);

    java.lang.String getRedDotWording(java.lang.String str);

    float getScaleByFontLevel(int i17);

    float getScreenBrightness();

    float getScreenDensity();

    float getStatusBarHeight();

    float getTextWidth(java.lang.String str, float f17);

    void getUserLocationImpl(com.tencent.kinda.gen.VoidF32F32BoolCallback voidF32F32BoolCallback);

    float getViewScale();

    boolean getYuanBaoInstalledState();

    boolean getYuanBaoIsForOldUser();

    void handleAdFeedbackCloseWithAid(java.lang.String str);

    void handleAdOpenWithAid(java.lang.String str);

    com.tencent.kinda.gen.IOSDevice iOSDevice();

    java.lang.String iOSVersion();

    java.lang.String insertZeroWidthJoiner(java.lang.String str);

    boolean isAccessibilityServiceSafe();

    boolean isCareModeOn();

    boolean isDarkModeOn();

    boolean isFlutterOnTop();

    boolean isForAndroidTest();

    boolean isLocationAuthorized();

    boolean isNetworkConnected();

    boolean isPad();

    boolean isScreenCaptured();

    void launchFlutter(boolean z17);

    byte[] loadSecurityStore(java.lang.String str);

    void makesureLonglink();

    java.lang.String md5(java.lang.String str);

    java.lang.String md5Data(byte[] bArr);

    void openNativeScanView();

    void openTinyApp(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void playVibration();

    void preloadLiteApp(java.lang.String str, java.lang.String str2);

    void publishPayLiteAppGlobalEvent(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void releasePreloadLiteApp(java.lang.String str, java.lang.String str2);

    void reportAdWithAidAndType(java.lang.String str);

    void reportDidTakeScreenshot(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    java.lang.String resolveLanguageStringForGlobal(java.lang.String str);

    java.lang.String resolveURLStringForGlobal(java.lang.String str);

    void saveAdInfoWithPosId(int i17, java.lang.String str);

    boolean saveSecurityStore(java.lang.String str, byte[] bArr);

    void setIdleTimerDisable(boolean z17);

    void setLanguageChangeCallbackImpl(com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    void setPaySafeAccessibilityServiceListCache(java.util.ArrayList<java.lang.Integer> arrayList, java.util.ArrayList<java.lang.String> arrayList2);

    void setRedDotStatus(java.lang.String str, boolean z17);

    void setReportLocationState(boolean z17, boolean z18);

    void setScreenBrightness(float f17);

    void setStatusBarHidden(boolean z17, boolean z18);

    java.lang.String sha256(byte[] bArr, boolean z17);

    boolean shouldReportCellInfo();

    boolean shouldReportLocation();

    boolean shouldReportWifiSsid();

    boolean supportSecurityStore();

    void triggerPrefetchMallIndexWeApp(java.util.ArrayList<java.lang.String> arrayList);

    void updateWalletRegion(int i17);
}

package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface IUIPagePlatformFuncDelegate {
    void addReportInfo(com.tencent.kinda.gen.ViewReportStruct viewReportStruct);

    void beginIgnoringInteractionEvents();

    void closeUI(boolean z17);

    void endEditing();

    void endIgnoringInteractionEvents();

    java.lang.String getTitle();

    void refreshNavigationBar();

    void setBackBtnVisible(boolean z17);

    void setBackgroundColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setKeyBoardShowCallbackImpl(com.tencent.kinda.gen.VoidBoolI32Callback voidBoolI32Callback);

    void setScreenBrightness(float f17);

    void setScreenKeepOn(boolean z17);

    void setSubTitle(java.lang.String str);

    void setSubTitleDefaultColor();

    void setSubTitleVisibility(com.tencent.kinda.gen.Visible visible);

    void setTitle(java.lang.String str);

    void setTopLeftBackBtnCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setTopLeftBtnTitleAndCallbackImpl(java.lang.String str, com.tencent.kinda.gen.VoidCallback voidCallback);

    void setTopRightBtnBgIsGreen(boolean z17);

    void setTopRightBtnDone();

    void setTopRightBtnImage(java.lang.String str);

    void setTopRightBtnTitle(java.lang.String str, java.lang.String str2);

    void setTopRightCallbackImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setTopRightFull(boolean z17);

    void setWindowSoftInputAdjustMode(com.tencent.kinda.gen.AndroidWindowAdjustMode androidWindowAdjustMode);

    void startLoading(java.lang.String str, boolean z17);

    void stopLoading();

    void triggerReport(com.tencent.kinda.gen.ReportEvent reportEvent, java.lang.String str);
}

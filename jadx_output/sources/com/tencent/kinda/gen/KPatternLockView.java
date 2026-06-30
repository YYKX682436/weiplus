package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KPatternLockView extends com.tencent.kinda.gen.KView {
    int getViewHeight();

    int getViewWidth();

    void onVerifyPatternFail();

    void onVerifyPatternOK();

    void resetPatternView();

    void setEnableInput(boolean z17);

    void setEndWithPatternCallback(com.tencent.kinda.gen.KPatternLockViewEndWithPatternCallback kPatternLockViewEndWithPatternCallback);

    void setOnInputInvalidPatternCallback(com.tencent.kinda.gen.KPatternLockViewOnInputInvalidPatternCallback kPatternLockViewOnInputInvalidPatternCallback);
}

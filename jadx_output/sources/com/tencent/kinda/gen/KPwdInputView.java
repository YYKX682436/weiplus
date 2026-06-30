package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KPwdInputView extends com.tencent.kinda.gen.KView {
    boolean getAutoRemarkKeyBoradType();

    boolean getChearInput();

    boolean getFocus();

    java.lang.String getHashData();

    boolean getKeyboardDisabled();

    com.tencent.kinda.gen.PwdEncryptMode getPwdEncryptMode();

    java.lang.String getPwdNonce();

    com.tencent.kinda.gen.PwdViewStyle getPwdStyle();

    long getPwdTimestamp();

    long getTextLength();

    void setAutoRemarkKeyBoradType(boolean z17);

    void setChearInput(boolean z17);

    void setEncryptSoftSaltAndVersion(java.lang.String str, int i17);

    void setFocus(boolean z17);

    void setFocusModalListener(com.tencent.kinda.gen.IUIModal iUIModal);

    void setFocusUIPageListener(com.tencent.kinda.gen.IUIPage iUIPage);

    void setHashData(java.lang.String str);

    void setKeepKeyboardOnClearFocus(boolean z17);

    void setKeyboardDisabled(boolean z17);

    void setOnEndEnterPasswordCallback(com.tencent.kinda.gen.KPwdInputViewOnEndEnterPasswordCallback kPwdInputViewOnEndEnterPasswordCallback);

    void setOnPasswordChangeCallback(com.tencent.kinda.gen.KPwdInputViewOnPasswordChangeCallback kPwdInputViewOnPasswordChangeCallback);

    void setPwdEncryptMode(com.tencent.kinda.gen.PwdEncryptMode pwdEncryptMode);

    void setPwdNonce(java.lang.String str);

    void setPwdStyle(com.tencent.kinda.gen.PwdViewStyle pwdViewStyle);

    void setPwdTimestamp(long j17);

    void setTextLength(long j17);

    com.tencent.kinda.gen.Sm2HashType sm2HashType();
}

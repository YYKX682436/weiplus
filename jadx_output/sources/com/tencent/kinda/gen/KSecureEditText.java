package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KSecureEditText extends com.tencent.kinda.gen.KView {
    com.tencent.kinda.gen.ClearButtonMode getClearButtonMode();

    java.lang.String getDefaultValue();

    boolean getEnabled();

    com.tencent.kinda.gen.SecureCtrlEncryptType getEncryptType();

    boolean getFocus();

    java.lang.String getHint();

    boolean getIsCommonText();

    com.tencent.kinda.gen.KeyboardType getKeyboardType();

    int getMaxLength();

    java.lang.String getText();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    com.tencent.kinda.gen.DynamicColor getTintColor();

    boolean isCardFromatValid(int i17);

    void setClearButtonMode(com.tencent.kinda.gen.ClearButtonMode clearButtonMode);

    void setDefaultValue(java.lang.String str);

    void setEnabled(boolean z17);

    void setEncryptType(com.tencent.kinda.gen.SecureCtrlEncryptType secureCtrlEncryptType);

    void setFocus(boolean z17);

    void setHint(java.lang.String str);

    void setIsCommonText(boolean z17);

    void setKeyboardType(com.tencent.kinda.gen.KeyboardType keyboardType);

    void setMaxLength(int i17);

    void setOnTextChangedCallback(com.tencent.kinda.gen.KSecureEditTextOnTextChangedCallback kSecureEditTextOnTextChangedCallback);

    void setText(java.lang.String str);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextSize(float f17);

    void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);
}

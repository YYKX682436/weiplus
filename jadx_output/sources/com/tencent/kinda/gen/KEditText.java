package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KEditText extends com.tencent.kinda.gen.KView {
    void enableConfirmBtn(boolean z17);

    java.lang.String encryptWith3Des();

    com.tencent.kinda.gen.ClearButtonMode getClearButtonMode();

    com.tencent.kinda.gen.DynamicColor getConfirmButtonColor();

    java.lang.String getConfirmButtonText();

    com.tencent.kinda.gen.DynamicColor getCursorColor();

    boolean getEnabled();

    java.lang.String getFixedHeaderText();

    boolean getFocus();

    java.lang.String getHint();

    com.tencent.kinda.gen.DynamicColor getHintColor();

    float getHintTextSize();

    boolean getIsSingleLine();

    com.tencent.kinda.gen.KeyboardType getKeyboardType();

    int getMaxLength();

    int getMoneyRestrictionIntegerLimit();

    int getMoneyShowBit();

    com.tencent.kinda.gen.EditTextRestrictType getRestrictType();

    int getSelection();

    boolean getShowFloatButton();

    boolean getShowInputDot();

    boolean getStayFocusWhenEnter();

    java.lang.String getText();

    com.tencent.kinda.gen.TextAlign getTextAlign();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    java.lang.String getTextFont();

    float getTextSize();

    com.tencent.kinda.gen.DynamicColor getTintColor();

    void setClearButtonMode(com.tencent.kinda.gen.ClearButtonMode clearButtonMode);

    void setConfirmButtonColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setConfirmButtonText(java.lang.String str);

    void setCursorColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setEnabled(boolean z17);

    void setFixedHeaderText(java.lang.String str);

    void setFocus(boolean z17);

    void setHint(java.lang.String str);

    void setHintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setHintTextSize(float f17);

    void setIsSingleLine(boolean z17);

    void setKeyboardType(com.tencent.kinda.gen.KeyboardType keyboardType);

    void setMaxLength(int i17);

    void setMoneyRestrictionIntegerLimit(int i17);

    void setMoneyShowBit(int i17);

    void setNeedForceDismissFloatButton();

    void setOnEditorActionCallback(com.tencent.kinda.gen.KEditTextOnEditorActionCallback kEditTextOnEditorActionCallback);

    void setOnFocusChangeCallback(com.tencent.kinda.gen.KEditTextOnFocusChangeCallback kEditTextOnFocusChangeCallback);

    void setOnTextBeginChangeCallback(com.tencent.kinda.gen.KEditTextOnTextBeginChangeCallback kEditTextOnTextBeginChangeCallback);

    void setOnTextChangedCallback(com.tencent.kinda.gen.KEditTextOnTextChangedCallback kEditTextOnTextChangedCallback);

    void setOnTextEndEditingCallback(com.tencent.kinda.gen.KEditTextOnTextEndEditingCallback kEditTextOnTextEndEditingCallback);

    void setRestrictType(com.tencent.kinda.gen.EditTextRestrictType editTextRestrictType);

    void setSelection(int i17);

    void setShowFloatButton(boolean z17);

    void setShowInputDot(boolean z17);

    void setStayFocusWhenEnter(boolean z17);

    void setText(java.lang.String str);

    void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextFont(java.lang.String str);

    void setTextSize(float f17);

    void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setupToolBarView(com.tencent.kinda.gen.KView kView);

    void showMoneyBitView();
}

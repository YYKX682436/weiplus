package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KCardNumberEditView extends com.tencent.kinda.gen.KView {
    boolean getFocus();

    java.lang.String getHint();

    com.tencent.kinda.gen.DynamicColor getHintColor();

    int getInputTextLength();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    java.lang.String getValue();

    boolean isBankCardNumber();

    void setFocus(boolean z17);

    void setHint(java.lang.String str);

    void setHintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setOnTextChangedCallback(com.tencent.kinda.gen.KCardNumberEditViewOnTextChangedCallback kCardNumberEditViewOnTextChangedCallback);

    void setOnTextEndEditingCallback(com.tencent.kinda.gen.KCardNumberEditViewOnTextEndEditingCallback kCardNumberEditViewOnTextEndEditingCallback);

    void setText(java.lang.String str);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);
}

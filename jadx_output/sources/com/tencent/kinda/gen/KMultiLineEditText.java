package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KMultiLineEditText extends com.tencent.kinda.gen.KView {
    boolean getEnabled();

    boolean getFocus();

    java.lang.String getHint();

    com.tencent.kinda.gen.DynamicColor getHintColor();

    int getMaxLength();

    java.lang.String getText();

    com.tencent.kinda.gen.TextAlign getTextAlign();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    java.lang.String getTextFont();

    float getTextSize();

    void setEnabled(boolean z17);

    void setFocus(boolean z17);

    void setHint(java.lang.String str);

    void setHintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setMaxLength(int i17);

    void setOnFocusChangedImpl(com.tencent.kinda.gen.VoidBoolCallback voidBoolCallback);

    void setOnTextChangedImpl(com.tencent.kinda.gen.VoidStringCallback voidStringCallback);

    void setOnTextEndEditingImpl(com.tencent.kinda.gen.VoidCallback voidCallback);

    void setText(java.lang.String str);

    void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextFont(java.lang.String str);

    void setTextSize(float f17);
}

package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KBankEditView extends com.tencent.kinda.gen.KView {
    boolean getFocus();

    com.tencent.kinda.gen.FontStyle getFontStyle();

    java.lang.String getSelectedBankType();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    float getTextSize();

    void openBankSelectView();

    void setData(com.tencent.kinda.gen.ITransmitKvData iTransmitKvData);

    void setFocus(boolean z17);

    void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle);

    void setOnSeletBankCallback(com.tencent.kinda.gen.KBankEditViewOnSeletBankCallback kBankEditViewOnSeletBankCallback);

    void setSelected(java.lang.String str);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextSize(float f17);
}

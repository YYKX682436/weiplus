package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KOpenIMInfoView extends com.tencent.kinda.gen.KView {
    java.lang.String getBusinessNameText();

    java.lang.String getFormatText();

    java.lang.String getNickNameText();

    com.tencent.kinda.gen.TextAlign getTextAlign();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    float getTextSize();

    java.lang.String getTrueNameText();

    void setBusinessNameText(java.lang.String str);

    void setFormatText(java.lang.String str);

    void setNickNameText(java.lang.String str);

    void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextSize(float f17);

    void setTrueNameText(java.lang.String str);

    void updateContent();
}

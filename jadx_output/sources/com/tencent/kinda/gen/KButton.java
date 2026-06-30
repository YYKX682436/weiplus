package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KButton extends com.tencent.kinda.gen.KView {
    com.tencent.kinda.gen.DynamicColor getDisableColor();

    com.tencent.kinda.gen.DynamicColor getDisableTextColor();

    com.tencent.kinda.gen.KImage getDisabledImage();

    boolean getEnable();

    long getExpandHitHeight();

    long getExpandHitWidth();

    com.tencent.kinda.gen.FontStyle getFontStyle();

    long getHorizontalPadding();

    com.tencent.kinda.gen.DynamicColor getNormalColor();

    com.tencent.kinda.gen.KImage getNormalImage();

    com.tencent.kinda.gen.KImage getPressedImage();

    com.tencent.kinda.gen.KImage getSelectedImage();

    java.lang.String getText();

    com.tencent.kinda.gen.DynamicColor getTextNormalColor();

    float getTextSize();

    long getVerticalPadding();

    void setDisableColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setDisableTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setDisabledImage(com.tencent.kinda.gen.KImage kImage);

    void setEnable(boolean z17);

    void setExpandHitHeight(long j17);

    void setExpandHitWidth(long j17);

    void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle);

    void setHorizontalPadding(long j17);

    void setNormalColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setNormalImage(com.tencent.kinda.gen.KImage kImage);

    void setPressedImage(com.tencent.kinda.gen.KImage kImage);

    void setSelectedImage(com.tencent.kinda.gen.KImage kImage);

    void setText(java.lang.String str);

    void setTextNormalColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextSize(float f17);

    void setVerticalPadding(long j17);
}

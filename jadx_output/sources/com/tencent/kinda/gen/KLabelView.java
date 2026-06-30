package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KLabelView extends com.tencent.kinda.gen.KView {
    boolean getAdjustsFontSizeToFitWidth();

    com.tencent.kinda.gen.BaselineAdjustmentAlign getBaselineAdjustment();

    com.tencent.kinda.gen.Ellipsize getEllipsize();

    com.tencent.kinda.gen.FontStyle getFontStyle();

    float getLineSpacingFactor();

    int getLines();

    int getMaxLength();

    java.lang.String getText();

    com.tencent.kinda.gen.TextAlign getTextAlign();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    java.lang.String getTextFont();

    float getTextSize();

    void setAdjustsFontSizeToFitWidth(boolean z17);

    void setBaselineAdjustment(com.tencent.kinda.gen.BaselineAdjustmentAlign baselineAdjustmentAlign);

    void setEllipsize(com.tencent.kinda.gen.Ellipsize ellipsize);

    void setFontStyle(com.tencent.kinda.gen.FontStyle fontStyle);

    void setLineSpacingFactor(float f17);

    void setLines(int i17);

    void setMaxLength(int i17);

    void setText(java.lang.String str);

    void setTextAlign(com.tencent.kinda.gen.TextAlign textAlign);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextFont(java.lang.String str);

    void setTextSize(float f17);
}

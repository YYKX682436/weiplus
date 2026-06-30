package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KMoneyLoadingView extends com.tencent.kinda.gen.KView {
    float getAnimationDuration();

    java.lang.String getCurrencySymbol();

    com.tencent.kinda.gen.DynamicColor getTextColor();

    float getTextSize();

    void setAnimationDuration(float f17);

    void setCurrencySymbol(java.lang.String str);

    void setFont(java.lang.String str);

    void setGravity(com.tencent.kinda.gen.Gravity gravity);

    void setMoney(long j17, boolean z17);

    void setTextColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTextSize(float f17);

    void setTextSizeNotScaleable(float f17, boolean z17);

    void startLoading();

    void stopLoading();

    void updateTextAlignment(com.tencent.kinda.gen.TextAlign textAlign);
}

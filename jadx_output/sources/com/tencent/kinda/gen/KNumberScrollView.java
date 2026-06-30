package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KNumberScrollView extends com.tencent.kinda.gen.KView {
    int getScrollAnimationTimeInMs();

    int getScrollDataItemSize();

    com.tencent.kinda.gen.DynamicColor getScrollNumberFontColor();

    int getScrollNumberFontSize();

    com.tencent.kinda.gen.FontStyle getScrollNumberFontWeight();

    java.lang.String getScrollNumberString();

    void refreshNumberScroll(java.lang.String str);

    void setScrollAnimationTimeInMs(int i17);

    void setScrollDataItemSize(int i17);

    void setScrollNumberFontColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setScrollNumberFontSize(int i17);

    void setScrollNumberFontWeight(com.tencent.kinda.gen.FontStyle fontStyle);

    void setScrollNumberString(java.lang.String str);
}

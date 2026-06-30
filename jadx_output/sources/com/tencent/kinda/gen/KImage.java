package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KImage {
    float getHeight();

    boolean getSupportDynamicSize();

    java.lang.String getUrl();

    float getWidth();

    void setDarkModeUrl(java.lang.String str);

    void setEmoticonContent(java.lang.String str, int i17, int i18, boolean z17);

    void setSupportDynamicSize(boolean z17);

    void setSvgUrl(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setSvgUrl(java.lang.String str, com.tencent.kinda.gen.DynamicColor dynamicColor, com.tencent.kinda.gen.KSize kSize);

    void setUrl(java.lang.String str);

    void stretchImage(float f17, float f18);
}

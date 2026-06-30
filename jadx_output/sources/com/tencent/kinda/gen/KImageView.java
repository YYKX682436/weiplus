package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KImageView extends com.tencent.kinda.gen.KView {
    java.lang.String getDarkModeUrl();

    java.lang.String getDefaultUrl();

    com.tencent.kinda.gen.KImage getImage();

    byte[] getImageData();

    com.tencent.kinda.gen.ScaleType getScaleType();

    com.tencent.kinda.gen.DynamicColor getTintColor();

    java.lang.String getUrl();

    void setDarkModeUrl(java.lang.String str);

    void setDefaultUrl(java.lang.String str);

    void setImage(com.tencent.kinda.gen.KImage kImage);

    void setImageData(byte[] bArr);

    void setScaleType(com.tencent.kinda.gen.ScaleType scaleType);

    void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setUrl(java.lang.String str);
}

package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KSwitchView extends com.tencent.kinda.gen.KView {
    boolean getEnabled();

    com.tencent.kinda.gen.KImage getOffImage();

    boolean getOn();

    com.tencent.kinda.gen.KImage getOnImage();

    com.tencent.kinda.gen.DynamicColor getOnTintColor();

    com.tencent.kinda.gen.DynamicColor getThumbTintColor();

    com.tencent.kinda.gen.DynamicColor getTintColor();

    void setEnabled(boolean z17);

    void setOffImage(com.tencent.kinda.gen.KImage kImage);

    void setOn(boolean z17);

    void setOnChangeSwitchCallback(com.tencent.kinda.gen.KSwitchViewOnChangeSwitchCallback kSwitchViewOnChangeSwitchCallback);

    void setOnImage(com.tencent.kinda.gen.KImage kImage);

    void setOnTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setThumbTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setTintColor(com.tencent.kinda.gen.DynamicColor dynamicColor);
}

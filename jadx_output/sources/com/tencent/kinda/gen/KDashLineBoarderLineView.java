package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KDashLineBoarderLineView extends com.tencent.kinda.gen.KViewLayout {
    @Override // com.tencent.kinda.gen.KView
    float getCornerRadius();

    com.tencent.kinda.gen.DynamicColor getDashColor();

    float getDashWidth();

    @Override // com.tencent.kinda.gen.KView
    void setCornerRadius(float f17);

    void setDashColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setDashWidth(float f17);
}

package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KViewLayout extends com.tencent.kinda.gen.KView {
    void addView(com.tencent.kinda.gen.KView kView);

    void addView(com.tencent.kinda.gen.KView kView, int i17);

    com.tencent.kinda.gen.Align getAlignContent();

    com.tencent.kinda.gen.Align getAlignItems();

    com.tencent.kinda.gen.FlexDirection getFlexDirection();

    com.tencent.kinda.gen.Wrap getFlexWrap();

    com.tencent.kinda.gen.Justify getJustifyContent();

    void removeAllViews();

    void removeView(com.tencent.kinda.gen.KView kView);

    void setAlignContent(com.tencent.kinda.gen.Align align);

    void setAlignItems(com.tencent.kinda.gen.Align align);

    void setClip(boolean z17);

    void setFlexDirection(com.tencent.kinda.gen.FlexDirection flexDirection);

    void setFlexWrap(com.tencent.kinda.gen.Wrap wrap);

    void setFocusableInTouchMode(boolean z17);

    void setJustifyContent(com.tencent.kinda.gen.Justify justify);

    void setOhosRenderGroup(boolean z17);
}

package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public interface KScrollView extends com.tencent.kinda.gen.KViewLayout {
    com.tencent.kinda.gen.KPoint getContentOffset();

    boolean getScrollToDimissKeyboardEnabled();

    boolean getScrollWhenViewSizeEnough();

    boolean getShowScrollBar();

    void scrollTo(com.tencent.kinda.gen.KView kView, float f17, float f18, boolean z17);

    void setContent(com.tencent.kinda.gen.KView kView);

    void setContentInsect(float f17, float f18, float f19, float f27);

    void setContentOffset(com.tencent.kinda.gen.KPoint kPoint);

    void setContentOffset(com.tencent.kinda.gen.KPoint kPoint, boolean z17);

    void setOnScrollCallback(com.tencent.kinda.gen.KScrollViewOnScrollCallback kScrollViewOnScrollCallback);

    void setScrollToDimissKeyboardEnabled(boolean z17);

    void setScrollWhenViewSizeEnough(boolean z17);

    void setShowScrollBar(boolean z17);
}

package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public interface KView {
    void accessibilityClickFrom(com.tencent.kinda.gen.KView kView);

    void accessibilityStatesType(com.tencent.kinda.gen.StatesType statesType);

    void accessibilityTraitsType(com.tencent.kinda.gen.TraitsType traitsType);

    void addBlurEffect(int i17);

    void autoHeight();

    void autoWidth();

    com.tencent.kinda.gen.KPoint convertPointToScreen(com.tencent.kinda.gen.KPoint kPoint);

    com.tencent.kinda.gen.KPoint convertPointToView(com.tencent.kinda.gen.KPoint kPoint, com.tencent.kinda.gen.KView kView);

    void expandHitSize(float f17, float f18);

    float getAbsoluteOriginXInScreen();

    float getAbsoluteOriginXInScreenDP();

    float getAbsoluteOriginYInScreen();

    float getAbsoluteOriginYInScreenDP();

    java.lang.String getAccessibilityString();

    boolean getAccessible();

    com.tencent.kinda.gen.Align getAlignSelf();

    float getAlpha();

    float getAspectRatio();

    com.tencent.kinda.gen.DynamicColor getBackgroundColor();

    com.tencent.kinda.gen.DynamicColor getBorderColor();

    com.tencent.kinda.gen.DynamicColor getBorderPressedColor();

    float getBorderWidth();

    float getBottom();

    float getBottomLeftCornerRadius();

    float getBottomPercent();

    float getBottomRightCornerRadius();

    boolean getClickable();

    float getCornerRadius();

    boolean getDisableHighlightDarkMode();

    boolean getEnableHighLight();

    float getFlexBasis();

    float getFlexGrow();

    float getFlexShrink();

    float getFrameOriginX();

    float getFrameOriginY();

    float getHeight();

    float getHeightPercent();

    boolean getIsRefreshing();

    float getLeft();

    float getLeftPercent();

    float getMarginBottom();

    float getMarginBottomPercent();

    float getMarginLeft();

    float getMarginLeftPercent();

    float getMarginRight();

    float getMarginRightPercent();

    float getMarginTop();

    float getMarginTopPercent();

    float getMaxHeight();

    float getMaxWidth();

    float getMinHeight();

    float getMinWidth();

    float getPaddingBottom();

    float getPaddingBottomPercent();

    float getPaddingLeft();

    float getPaddingLeftPercent();

    float getPaddingRight();

    float getPaddingRightPercent();

    float getPaddingTop();

    float getPaddingTopPercent();

    com.tencent.kinda.gen.PositionType getPositionType();

    java.lang.String getReportId();

    float getRight();

    float getRightPercent();

    float getRotation();

    float getScaleX();

    float getScaleY();

    boolean getSecure();

    com.tencent.kinda.gen.DynamicColor getShadowColor();

    float getShadowOffset();

    float getShadowRadius();

    boolean getSupportDynamicSize();

    float getTop();

    float getTopLeftCornerRadius();

    float getTopPercent();

    float getTopRightCornerRadius();

    float getTranslateX();

    float getTranslateY();

    java.lang.String getViewId();

    com.tencent.kinda.gen.Visible getVisible();

    float getWidth();

    float getWidthPercent();

    void initWithPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate);

    void removeBlurEffect();

    void requestFrameImpl(com.tencent.kinda.gen.VoidKRectCallback voidKRectCallback);

    void requestLayout();

    void setAccessibilityString(java.lang.String str);

    void setAccessible(boolean z17);

    void setAlignSelf(com.tencent.kinda.gen.Align align);

    void setAlpha(float f17);

    void setAspectRatio(float f17);

    void setBackgroundColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setBorderColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setBorderPressedColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setBorderWidth(float f17);

    void setBottom(float f17);

    void setBottomLeftCornerRadius(float f17);

    void setBottomPercent(float f17);

    void setBottomRightCornerRadius(float f17);

    void setClickable(boolean z17);

    void setCornerRadius(float f17);

    void setDisableHighlightDarkMode(boolean z17);

    void setEnableHighLight(boolean z17);

    void setFlexBasis(float f17);

    void setFlexGrow(float f17);

    void setFlexShrink(float f17);

    void setFrameImpl(com.tencent.kinda.gen.KRect kRect, com.tencent.kinda.gen.VoidCallback voidCallback);

    void setHeight(float f17);

    void setHeightPercent(float f17);

    void setIsRefreshing(boolean z17);

    void setLeft(float f17);

    void setLeftPercent(float f17);

    void setMarginBottom(float f17);

    void setMarginBottomPercent(float f17);

    void setMarginLeft(float f17);

    void setMarginLeftPercent(float f17);

    void setMarginRight(float f17);

    void setMarginRightPercent(float f17);

    void setMarginTop(float f17);

    void setMarginTopPercent(float f17);

    void setMaxHeight(float f17);

    void setMaxWidth(float f17);

    void setMinHeight(float f17);

    void setMinWidth(float f17);

    void setOnClickCallback(com.tencent.kinda.gen.KViewOnClickCallback kViewOnClickCallback);

    void setOnLongClickCallback(com.tencent.kinda.gen.KViewOnLongClickCallback kViewOnLongClickCallback);

    void setOnTouchCallback(com.tencent.kinda.gen.KViewOnTouchCallback kViewOnTouchCallback);

    void setPaddingBottom(float f17);

    void setPaddingBottomPercent(float f17);

    void setPaddingLeft(float f17);

    void setPaddingLeftPercent(float f17);

    void setPaddingRight(float f17);

    void setPaddingRightPercent(float f17);

    void setPaddingTop(float f17);

    void setPaddingTopPercent(float f17);

    void setPositionType(com.tencent.kinda.gen.PositionType positionType);

    void setReportId(java.lang.String str);

    void setRight(float f17);

    void setRightPercent(float f17);

    void setRotation(float f17);

    void setScaleX(float f17);

    void setScaleY(float f17);

    void setSecure(boolean z17);

    void setShadowColor(com.tencent.kinda.gen.DynamicColor dynamicColor);

    void setShadowOffset(float f17);

    void setShadowRadius(float f17);

    void setSupportDynamicSize(boolean z17);

    void setTop(float f17);

    void setTopLeftCornerRadius(float f17);

    void setTopPercent(float f17);

    void setTopRightCornerRadius(float f17);

    void setTranslateX(float f17);

    void setTranslateY(float f17);

    void setViewId(java.lang.String str);

    void setVisible(com.tencent.kinda.gen.Visible visible);

    void setWidth(float f17);

    void setWidthPercent(float f17);
}

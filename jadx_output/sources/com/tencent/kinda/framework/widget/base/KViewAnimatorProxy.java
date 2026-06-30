package com.tencent.kinda.framework.widget.base;

/* loaded from: classes15.dex */
public class KViewAnimatorProxy implements com.tencent.kinda.gen.KView {
    private com.tencent.kinda.gen.KView mKView;

    public KViewAnimatorProxy(com.tencent.kinda.gen.KView kView) {
        this.mKView = kView;
    }

    @Override // com.tencent.kinda.gen.KView
    public void accessibilityClickFrom(com.tencent.kinda.gen.KView kView) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void accessibilityStatesType(com.tencent.kinda.gen.StatesType statesType) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void accessibilityTraitsType(com.tencent.kinda.gen.TraitsType traitsType) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void addBlurEffect(int i17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void autoHeight() {
    }

    @Override // com.tencent.kinda.gen.KView
    public void autoWidth() {
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.KPoint convertPointToScreen(com.tencent.kinda.gen.KPoint kPoint) {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.KPoint convertPointToView(com.tencent.kinda.gen.KPoint kPoint, com.tencent.kinda.gen.KView kView) {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public void expandHitSize(float f17, float f18) {
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginXInScreen() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginXInScreenDP() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginYInScreen() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAbsoluteOriginYInScreenDP() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public java.lang.String getAccessibilityString() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getAccessible() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.Align getAlignSelf() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAlpha() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getAspectRatio() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getBackgroundColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getBorderColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getBorderPressedColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBorderWidth() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottom() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottomLeftCornerRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottomPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getBottomRightCornerRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getClickable() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getCornerRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getDisableHighlightDarkMode() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getEnableHighLight() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFlexBasis() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFlexGrow() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFlexShrink() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFrameOriginX() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getFrameOriginY() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getHeight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getHeightPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getIsRefreshing() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getLeft() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getLeftPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginBottom() {
        return this.mKView.getMarginBottom();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginBottomPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginLeft() {
        return this.mKView.getMarginLeft();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginLeftPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginRight() {
        return this.mKView.getMarginRight();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginRightPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginTop() {
        return this.mKView.getMarginTop();
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMarginTopPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMaxHeight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMaxWidth() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMinHeight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getMinWidth() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingBottom() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingBottomPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingLeft() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingLeftPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingRight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingRightPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingTop() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getPaddingTopPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.PositionType getPositionType() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public java.lang.String getReportId() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getRight() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getRightPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getRotation() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getScaleX() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getScaleY() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getSecure() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.DynamicColor getShadowColor() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getShadowOffset() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getShadowRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public boolean getSupportDynamicSize() {
        return false;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTop() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTopLeftCornerRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTopPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTopRightCornerRadius() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTranslateX() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getTranslateY() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public java.lang.String getViewId() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public com.tencent.kinda.gen.Visible getVisible() {
        return null;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getWidth() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public float getWidthPercent() {
        return 0.0f;
    }

    @Override // com.tencent.kinda.gen.KView
    public void initWithPlatformDelegate(com.tencent.kinda.gen.IUIPagePlatformDelegate iUIPagePlatformDelegate) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void removeBlurEffect() {
    }

    @Override // com.tencent.kinda.gen.KView
    public void requestFrameImpl(com.tencent.kinda.gen.VoidKRectCallback voidKRectCallback) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void requestLayout() {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAccessibilityString(java.lang.String str) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAccessible(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAlignSelf(com.tencent.kinda.gen.Align align) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAlpha(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "alpha", kView.getAlpha(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setAspectRatio(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBackgroundColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
        android.animation.ValueAnimator ofArgb = android.animation.ValueAnimator.ofArgb((int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(this.mKView.getBackgroundColor()), (int) com.tencent.kinda.framework.widget.tools.ColorUtil.getColorByMode(dynamicColor));
        ofArgb.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: com.tencent.kinda.framework.widget.base.KViewAnimatorProxy.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                long intValue = ((java.lang.Integer) valueAnimator.getAnimatedValue()).intValue();
                com.tencent.kinda.framework.widget.base.KViewAnimatorProxy.this.mKView.setBackgroundColor(new com.tencent.kinda.gen.DynamicColor(intValue, 0L));
                java.util.Objects.toString(com.tencent.kinda.framework.widget.base.KViewAnimatorProxy.this.mKView);
                java.lang.Long.toHexString(com.tencent.kinda.framework.widget.tools.ColorUtil.absColor(intValue));
            }
        });
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofArgb);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBorderColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBorderPressedColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBorderWidth(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottom(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "bottom", kView.getBottom(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottomLeftCornerRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottomPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setBottomRightCornerRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setClickable(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setCornerRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setDisableHighlightDarkMode(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setEnableHighLight(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFlexBasis(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFlexGrow(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFlexShrink(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setFrameImpl(com.tencent.kinda.gen.KRect kRect, com.tencent.kinda.gen.VoidCallback voidCallback) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setHeight(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "height", kView.getHeight(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setHeightPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setIsRefreshing(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setLeft(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "left", kView.getLeft(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setLeftPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginBottom(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "marginBottom", kView.getMarginBottom(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginBottomPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginLeft(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "marginLeft", kView.getMarginLeft(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginLeftPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginRight(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "marginRight", kView.getMarginRight(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginRightPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginTop(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "marginTop", kView.getMarginTop(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMarginTopPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMaxHeight(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMaxWidth(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMinHeight(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setMinWidth(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setOnClickCallback(com.tencent.kinda.gen.KViewOnClickCallback kViewOnClickCallback) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setOnLongClickCallback(com.tencent.kinda.gen.KViewOnLongClickCallback kViewOnLongClickCallback) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setOnTouchCallback(com.tencent.kinda.gen.KViewOnTouchCallback kViewOnTouchCallback) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingBottom(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingBottomPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingLeft(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingLeftPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingRight(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingRightPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingTop(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPaddingTopPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setPositionType(com.tencent.kinda.gen.PositionType positionType) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setReportId(java.lang.String str) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setRight(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "right", kView.getRight(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setRightPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setRotation(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "rotation", kView.getRotation(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setScaleX(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "scaleX", kView.getScaleX(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setScaleY(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "scaleY", kView.getScaleY(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setSecure(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setShadowColor(com.tencent.kinda.gen.DynamicColor dynamicColor) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setShadowOffset(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setShadowRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setSupportDynamicSize(boolean z17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTop(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "top", kView.getTop(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTopLeftCornerRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTopPercent(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTopRightCornerRadius(float f17) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTranslateX(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "translateX", kView.getTranslateX(), f17);
        android.view.animation.Interpolator animateInterpolator = com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateInterpolator();
        if (animateInterpolator != null) {
            ofFloat.setInterpolator(animateInterpolator);
        }
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setTranslateY(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "translateY", kView.getTranslateY(), f17);
        android.view.animation.Interpolator animateInterpolator = com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateInterpolator();
        if (animateInterpolator != null) {
            ofFloat.setInterpolator(animateInterpolator);
        }
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setViewId(java.lang.String str) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setVisible(com.tencent.kinda.gen.Visible visible) {
    }

    @Override // com.tencent.kinda.gen.KView
    public void setWidth(float f17) {
        com.tencent.kinda.gen.KView kView = this.mKView;
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(kView, "width", kView.getWidth(), f17);
        ofFloat.setDuration(com.tencent.kinda.framework.animate.KindaGlobalAnimator.animateDuration());
        com.tencent.kinda.framework.animate.KindaGlobalAnimator.addAnimator(ofFloat);
    }

    @Override // com.tencent.kinda.gen.KView
    public void setWidthPercent(float f17) {
    }
}

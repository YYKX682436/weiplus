package com.facebook.yoga;

/* loaded from: classes15.dex */
public abstract class YogaNode {
    public abstract void addChildAt(com.facebook.yoga.YogaNode yogaNode, int i17);

    public abstract void calculateLayout(float f17, float f18);

    public abstract com.facebook.yoga.YogaNode cloneWithChildren();

    public abstract com.facebook.yoga.YogaNode cloneWithoutChildren();

    public abstract void copyStyle(com.facebook.yoga.YogaNode yogaNode);

    public abstract void dirty();

    public abstract com.facebook.yoga.YogaAlign getAlignContent();

    public abstract com.facebook.yoga.YogaAlign getAlignItems();

    public abstract com.facebook.yoga.YogaAlign getAlignSelf();

    public abstract float getAspectRatio();

    public abstract float getBorder(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract com.facebook.yoga.YogaNode getChildAt(int i17);

    public abstract int getChildCount();

    public abstract java.lang.Object getData();

    public abstract com.facebook.yoga.YogaDisplay getDisplay();

    public abstract float getFlex();

    public abstract com.facebook.yoga.YogaValue getFlexBasis();

    public abstract com.facebook.yoga.YogaFlexDirection getFlexDirection();

    public abstract float getFlexGrow();

    public abstract float getFlexShrink();

    public abstract com.facebook.yoga.YogaValue getHeight();

    public abstract com.facebook.yoga.YogaJustify getJustifyContent();

    public abstract float getLayoutBorder(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract com.facebook.yoga.YogaDirection getLayoutDirection();

    public abstract float getLayoutHeight();

    public abstract float getLayoutMargin(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract float getLayoutPadding(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract float getLayoutWidth();

    public abstract float getLayoutX();

    public abstract float getLayoutY();

    public abstract com.facebook.yoga.YogaValue getMargin(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract com.facebook.yoga.YogaValue getMaxHeight();

    public abstract com.facebook.yoga.YogaValue getMaxWidth();

    public abstract com.facebook.yoga.YogaValue getMinHeight();

    public abstract com.facebook.yoga.YogaValue getMinWidth();

    public abstract com.facebook.yoga.YogaOverflow getOverflow();

    public abstract com.facebook.yoga.YogaNode getOwner();

    public abstract com.facebook.yoga.YogaValue getPadding(com.facebook.yoga.YogaEdge yogaEdge);

    @java.lang.Deprecated
    public abstract com.facebook.yoga.YogaNode getParent();

    public abstract com.facebook.yoga.YogaValue getPosition(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract com.facebook.yoga.YogaPositionType getPositionType();

    public abstract com.facebook.yoga.YogaDirection getStyleDirection();

    public abstract com.facebook.yoga.YogaValue getWidth();

    public abstract com.facebook.yoga.YogaWrap getWrap();

    public abstract boolean hasNewLayout();

    public abstract int indexOf(com.facebook.yoga.YogaNode yogaNode);

    public abstract boolean isBaselineDefined();

    public abstract boolean isDirty();

    public abstract boolean isMeasureDefined();

    public abstract boolean isReferenceBaseline();

    public abstract void markLayoutSeen();

    public abstract void print();

    public abstract com.facebook.yoga.YogaNode removeChildAt(int i17);

    public abstract void reset();

    public abstract void setAlignContent(com.facebook.yoga.YogaAlign yogaAlign);

    public abstract void setAlignItems(com.facebook.yoga.YogaAlign yogaAlign);

    public abstract void setAlignSelf(com.facebook.yoga.YogaAlign yogaAlign);

    public abstract void setAspectRatio(float f17);

    public abstract void setBaselineFunction(com.facebook.yoga.YogaBaselineFunction yogaBaselineFunction);

    public abstract void setBorder(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setData(java.lang.Object obj);

    public abstract void setDirection(com.facebook.yoga.YogaDirection yogaDirection);

    public abstract void setDisplay(com.facebook.yoga.YogaDisplay yogaDisplay);

    public abstract void setFlex(float f17);

    public abstract void setFlexBasis(float f17);

    public abstract void setFlexBasisAuto();

    public abstract void setFlexBasisPercent(float f17);

    public abstract void setFlexDirection(com.facebook.yoga.YogaFlexDirection yogaFlexDirection);

    public abstract void setFlexGrow(float f17);

    public abstract void setFlexShrink(float f17);

    public abstract void setHeight(float f17);

    public abstract void setHeightAuto();

    public abstract void setHeightPercent(float f17);

    public abstract void setIsReferenceBaseline(boolean z17);

    public abstract void setJustifyContent(com.facebook.yoga.YogaJustify yogaJustify);

    public abstract void setMargin(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setMarginAuto(com.facebook.yoga.YogaEdge yogaEdge);

    public abstract void setMarginPercent(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setMaxHeight(float f17);

    public abstract void setMaxHeightPercent(float f17);

    public abstract void setMaxWidth(float f17);

    public abstract void setMaxWidthPercent(float f17);

    public abstract void setMeasureFunction(com.facebook.yoga.YogaMeasureFunction yogaMeasureFunction);

    public abstract void setMinHeight(float f17);

    public abstract void setMinHeightPercent(float f17);

    public abstract void setMinWidth(float f17);

    public abstract void setMinWidthPercent(float f17);

    public abstract void setOverflow(com.facebook.yoga.YogaOverflow yogaOverflow);

    public abstract void setPadding(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setPaddingPercent(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setPosition(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setPositionPercent(com.facebook.yoga.YogaEdge yogaEdge, float f17);

    public abstract void setPositionType(com.facebook.yoga.YogaPositionType yogaPositionType);

    public abstract void setWidth(float f17);

    public abstract void setWidthAuto();

    public abstract void setWidthPercent(float f17);

    public abstract void setWrap(com.facebook.yoga.YogaWrap yogaWrap);
}

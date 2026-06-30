package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public abstract class IYogaNode {

    /* loaded from: classes15.dex */
    public static final class CppProxy extends com.tencent.kinda.gen.IYogaNode {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        private final java.util.concurrent.atomic.AtomicBoolean destroyed = new java.util.concurrent.atomic.AtomicBoolean(false);
        private final long nativeRef;

        private CppProxy(long j17) {
            if (j17 == 0) {
                throw new java.lang.RuntimeException("nativeRef is zero");
            }
            this.nativeRef = j17;
        }

        private native void nativeDestroy(long j17);

        private native void native_addChild(long j17, com.tencent.kinda.gen.IYogaNode iYogaNode);

        private native void native_addChildAt(long j17, com.tencent.kinda.gen.IYogaNode iYogaNode, int i17);

        private native void native_calculateLayout(long j17, float f17, float f18);

        private native void native_dirty(long j17);

        private native com.tencent.kinda.gen.Align native_getAlignContent(long j17);

        private native com.tencent.kinda.gen.Align native_getAlignItems(long j17);

        private native com.tencent.kinda.gen.Align native_getAlignSelf(long j17);

        private native float native_getAspectRatio(long j17);

        private native float native_getBorder(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native int native_getChildCount(long j17);

        private native float native_getFlexBasis(long j17);

        private native com.tencent.kinda.gen.FlexDirection native_getFlexDirection(long j17);

        private native float native_getFlexGrow(long j17);

        private native float native_getFlexShrink(long j17);

        private native float native_getHeight(long j17);

        private native com.tencent.kinda.gen.Justify native_getJustifyContent(long j17);

        private native float native_getLayoutBorder(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native float native_getLayoutHeight(long j17);

        private native float native_getLayoutMargin(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native float native_getLayoutPadding(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native float native_getLayoutWidth(long j17);

        private native float native_getLayoutX(long j17);

        private native float native_getLayoutY(long j17);

        private native float native_getMargin(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native float native_getMaxHeight(long j17);

        private native float native_getMaxWidth(long j17);

        private native float native_getMinHeight(long j17);

        private native float native_getMinWidth(long j17);

        private native float native_getPadding(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native float native_getPosition(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native com.tencent.kinda.gen.PositionType native_getPositionType(long j17);

        private native float native_getWidth(long j17);

        private native com.tencent.kinda.gen.Wrap native_getWrap(long j17);

        private native boolean native_hasNewLayout(long j17);

        private native boolean native_isDirty(long j17);

        private native float native_isMeasureDefined(long j17);

        private native boolean native_isNull(long j17);

        private native void native_markLayoutSeen(long j17);

        private native void native_printNode(long j17, int i17, int i18);

        private native void native_removeAllChildren(long j17);

        private native boolean native_removeChild(long j17, com.tencent.kinda.gen.IYogaNode iYogaNode);

        private native void native_reset(long j17);

        private native void native_setAlignContent(long j17, com.tencent.kinda.gen.Align align);

        private native void native_setAlignItems(long j17, com.tencent.kinda.gen.Align align);

        private native void native_setAlignSelf(long j17, com.tencent.kinda.gen.Align align);

        private native void native_setAspectRatio(long j17, float f17);

        private native void native_setBorder(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setDisplay(long j17, boolean z17);

        private native void native_setFlexBasis(long j17, float f17);

        private native void native_setFlexBasisAuto(long j17);

        private native void native_setFlexDirection(long j17, com.tencent.kinda.gen.FlexDirection flexDirection);

        private native void native_setFlexGrow(long j17, float f17);

        private native void native_setFlexShrink(long j17, float f17);

        private native void native_setHeight(long j17, float f17);

        private native void native_setHeightAuto(long j17);

        private native void native_setHeightPercent(long j17, float f17);

        private native void native_setJustifyContent(long j17, com.tencent.kinda.gen.Justify justify);

        private native void native_setMargin(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setMarginAuto(long j17, com.tencent.kinda.gen.EdgeType edgeType);

        private native void native_setMarginPercent(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setMaxHeight(long j17, float f17);

        private native void native_setMaxHeightPercent(long j17, float f17);

        private native void native_setMaxWidth(long j17, float f17);

        private native void native_setMaxWidthPercent(long j17, float f17);

        private native void native_setMeasureFunction(long j17, com.tencent.kinda.gen.YogaMeasureCallback yogaMeasureCallback);

        private native void native_setMinHeight(long j17, float f17);

        private native void native_setMinHeightPercent(long j17, float f17);

        private native void native_setMinWidth(long j17, float f17);

        private native void native_setMinWidthPercent(long j17, float f17);

        private native void native_setPadding(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setPaddingPercent(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setPosition(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setPositionPercent(long j17, com.tencent.kinda.gen.EdgeType edgeType, float f17);

        private native void native_setPositionType(long j17, com.tencent.kinda.gen.PositionType positionType);

        private native void native_setScaleFactor(long j17, float f17);

        private native void native_setWidth(long j17, float f17);

        private native void native_setWidthAuto(long j17);

        private native void native_setWidthPercent(long j17, float f17);

        private native void native_setWrap(long j17, com.tencent.kinda.gen.Wrap wrap);

        @Override // com.tencent.kinda.gen.IYogaNode
        public void addChild(com.tencent.kinda.gen.IYogaNode iYogaNode) {
            native_addChild(this.nativeRef, iYogaNode);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void addChildAt(com.tencent.kinda.gen.IYogaNode iYogaNode, int i17) {
            native_addChildAt(this.nativeRef, iYogaNode, i17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void calculateLayout(float f17, float f18) {
            native_calculateLayout(this.nativeRef, f17, f18);
        }

        public void destroy() {
            if (this.destroyed.getAndSet(true)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void dirty() {
            native_dirty(this.nativeRef);
        }

        public void finalize() {
            destroy();
            super.finalize();
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.Align getAlignContent() {
            return native_getAlignContent(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.Align getAlignItems() {
            return native_getAlignItems(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.Align getAlignSelf() {
            return native_getAlignSelf(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getAspectRatio() {
            return native_getAspectRatio(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getBorder(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getBorder(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public int getChildCount() {
            return native_getChildCount(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getFlexBasis() {
            return native_getFlexBasis(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.FlexDirection getFlexDirection() {
            return native_getFlexDirection(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getFlexGrow() {
            return native_getFlexGrow(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getFlexShrink() {
            return native_getFlexShrink(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getHeight() {
            return native_getHeight(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.Justify getJustifyContent() {
            return native_getJustifyContent(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutBorder(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getLayoutBorder(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutHeight() {
            return native_getLayoutHeight(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutMargin(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getLayoutMargin(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutPadding(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getLayoutPadding(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutWidth() {
            return native_getLayoutWidth(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutX() {
            return native_getLayoutX(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getLayoutY() {
            return native_getLayoutY(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getMargin(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getMargin(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getMaxHeight() {
            return native_getMaxHeight(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getMaxWidth() {
            return native_getMaxWidth(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getMinHeight() {
            return native_getMinHeight(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getMinWidth() {
            return native_getMinWidth(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getPadding(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getPadding(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getPosition(com.tencent.kinda.gen.EdgeType edgeType) {
            return native_getPosition(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.PositionType getPositionType() {
            return native_getPositionType(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float getWidth() {
            return native_getWidth(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public com.tencent.kinda.gen.Wrap getWrap() {
            return native_getWrap(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public boolean hasNewLayout() {
            return native_hasNewLayout(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public boolean isDirty() {
            return native_isDirty(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public float isMeasureDefined() {
            return native_isMeasureDefined(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public boolean isNull() {
            return native_isNull(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void markLayoutSeen() {
            native_markLayoutSeen(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void printNode(int i17, int i18) {
            native_printNode(this.nativeRef, i17, i18);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void removeAllChildren() {
            native_removeAllChildren(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public boolean removeChild(com.tencent.kinda.gen.IYogaNode iYogaNode) {
            return native_removeChild(this.nativeRef, iYogaNode);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void reset() {
            native_reset(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setAlignContent(com.tencent.kinda.gen.Align align) {
            native_setAlignContent(this.nativeRef, align);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setAlignItems(com.tencent.kinda.gen.Align align) {
            native_setAlignItems(this.nativeRef, align);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setAlignSelf(com.tencent.kinda.gen.Align align) {
            native_setAlignSelf(this.nativeRef, align);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setAspectRatio(float f17) {
            native_setAspectRatio(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setBorder(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setBorder(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setDisplay(boolean z17) {
            native_setDisplay(this.nativeRef, z17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setFlexBasis(float f17) {
            native_setFlexBasis(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setFlexBasisAuto() {
            native_setFlexBasisAuto(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setFlexDirection(com.tencent.kinda.gen.FlexDirection flexDirection) {
            native_setFlexDirection(this.nativeRef, flexDirection);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setFlexGrow(float f17) {
            native_setFlexGrow(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setFlexShrink(float f17) {
            native_setFlexShrink(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setHeight(float f17) {
            native_setHeight(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setHeightAuto() {
            native_setHeightAuto(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setHeightPercent(float f17) {
            native_setHeightPercent(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setJustifyContent(com.tencent.kinda.gen.Justify justify) {
            native_setJustifyContent(this.nativeRef, justify);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMargin(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setMargin(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMarginAuto(com.tencent.kinda.gen.EdgeType edgeType) {
            native_setMarginAuto(this.nativeRef, edgeType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMarginPercent(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setMarginPercent(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMaxHeight(float f17) {
            native_setMaxHeight(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMaxHeightPercent(float f17) {
            native_setMaxHeightPercent(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMaxWidth(float f17) {
            native_setMaxWidth(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMaxWidthPercent(float f17) {
            native_setMaxWidthPercent(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMeasureFunction(com.tencent.kinda.gen.YogaMeasureCallback yogaMeasureCallback) {
            native_setMeasureFunction(this.nativeRef, yogaMeasureCallback);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMinHeight(float f17) {
            native_setMinHeight(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMinHeightPercent(float f17) {
            native_setMinHeightPercent(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMinWidth(float f17) {
            native_setMinWidth(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setMinWidthPercent(float f17) {
            native_setMinWidthPercent(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setPadding(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setPadding(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setPaddingPercent(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setPaddingPercent(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setPosition(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setPosition(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setPositionPercent(com.tencent.kinda.gen.EdgeType edgeType, float f17) {
            native_setPositionPercent(this.nativeRef, edgeType, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setPositionType(com.tencent.kinda.gen.PositionType positionType) {
            native_setPositionType(this.nativeRef, positionType);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setScaleFactor(float f17) {
            native_setScaleFactor(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setWidth(float f17) {
            native_setWidth(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setWidthAuto() {
            native_setWidthAuto(this.nativeRef);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setWidthPercent(float f17) {
            native_setWidthPercent(this.nativeRef, f17);
        }

        @Override // com.tencent.kinda.gen.IYogaNode
        public void setWrap(com.tencent.kinda.gen.Wrap wrap) {
            native_setWrap(this.nativeRef, wrap);
        }
    }

    public static native com.tencent.kinda.gen.IYogaNode create();

    public abstract void addChild(com.tencent.kinda.gen.IYogaNode iYogaNode);

    public abstract void addChildAt(com.tencent.kinda.gen.IYogaNode iYogaNode, int i17);

    public abstract void calculateLayout(float f17, float f18);

    public abstract void dirty();

    public abstract com.tencent.kinda.gen.Align getAlignContent();

    public abstract com.tencent.kinda.gen.Align getAlignItems();

    public abstract com.tencent.kinda.gen.Align getAlignSelf();

    public abstract float getAspectRatio();

    public abstract float getBorder(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract int getChildCount();

    public abstract float getFlexBasis();

    public abstract com.tencent.kinda.gen.FlexDirection getFlexDirection();

    public abstract float getFlexGrow();

    public abstract float getFlexShrink();

    public abstract float getHeight();

    public abstract com.tencent.kinda.gen.Justify getJustifyContent();

    public abstract float getLayoutBorder(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract float getLayoutHeight();

    public abstract float getLayoutMargin(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract float getLayoutPadding(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract float getLayoutWidth();

    public abstract float getLayoutX();

    public abstract float getLayoutY();

    public abstract float getMargin(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract float getMaxHeight();

    public abstract float getMaxWidth();

    public abstract float getMinHeight();

    public abstract float getMinWidth();

    public abstract float getPadding(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract float getPosition(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract com.tencent.kinda.gen.PositionType getPositionType();

    public abstract float getWidth();

    public abstract com.tencent.kinda.gen.Wrap getWrap();

    public abstract boolean hasNewLayout();

    public abstract boolean isDirty();

    public abstract float isMeasureDefined();

    public abstract boolean isNull();

    public abstract void markLayoutSeen();

    public abstract void printNode(int i17, int i18);

    public abstract void removeAllChildren();

    public abstract boolean removeChild(com.tencent.kinda.gen.IYogaNode iYogaNode);

    public abstract void reset();

    public abstract void setAlignContent(com.tencent.kinda.gen.Align align);

    public abstract void setAlignItems(com.tencent.kinda.gen.Align align);

    public abstract void setAlignSelf(com.tencent.kinda.gen.Align align);

    public abstract void setAspectRatio(float f17);

    public abstract void setBorder(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setDisplay(boolean z17);

    public abstract void setFlexBasis(float f17);

    public abstract void setFlexBasisAuto();

    public abstract void setFlexDirection(com.tencent.kinda.gen.FlexDirection flexDirection);

    public abstract void setFlexGrow(float f17);

    public abstract void setFlexShrink(float f17);

    public abstract void setHeight(float f17);

    public abstract void setHeightAuto();

    public abstract void setHeightPercent(float f17);

    public abstract void setJustifyContent(com.tencent.kinda.gen.Justify justify);

    public abstract void setMargin(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setMarginAuto(com.tencent.kinda.gen.EdgeType edgeType);

    public abstract void setMarginPercent(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setMaxHeight(float f17);

    public abstract void setMaxHeightPercent(float f17);

    public abstract void setMaxWidth(float f17);

    public abstract void setMaxWidthPercent(float f17);

    public abstract void setMeasureFunction(com.tencent.kinda.gen.YogaMeasureCallback yogaMeasureCallback);

    public abstract void setMinHeight(float f17);

    public abstract void setMinHeightPercent(float f17);

    public abstract void setMinWidth(float f17);

    public abstract void setMinWidthPercent(float f17);

    public abstract void setPadding(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setPaddingPercent(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setPosition(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setPositionPercent(com.tencent.kinda.gen.EdgeType edgeType, float f17);

    public abstract void setPositionType(com.tencent.kinda.gen.PositionType positionType);

    public abstract void setScaleFactor(float f17);

    public abstract void setWidth(float f17);

    public abstract void setWidthAuto();

    public abstract void setWidthPercent(float f17);

    public abstract void setWrap(com.tencent.kinda.gen.Wrap wrap);
}

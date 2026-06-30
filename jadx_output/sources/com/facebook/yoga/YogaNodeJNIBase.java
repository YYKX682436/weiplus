package com.facebook.yoga;

/* loaded from: classes15.dex */
public abstract class YogaNodeJNIBase extends com.facebook.yoga.YogaNode implements java.lang.Cloneable {
    private static final byte BORDER = 4;
    private static final byte DOES_LEGACY_STRETCH_BEHAVIOUR = 8;
    private static final byte HAS_NEW_LAYOUT = 16;
    private static final byte LAYOUT_BORDER_START_INDEX = 14;
    private static final byte LAYOUT_DIRECTION_INDEX = 5;
    private static final byte LAYOUT_EDGE_SET_FLAG_INDEX = 0;
    private static final byte LAYOUT_HEIGHT_INDEX = 2;
    private static final byte LAYOUT_LEFT_INDEX = 3;
    private static final byte LAYOUT_MARGIN_START_INDEX = 6;
    private static final byte LAYOUT_PADDING_START_INDEX = 10;
    private static final byte LAYOUT_TOP_INDEX = 4;
    private static final byte LAYOUT_WIDTH_INDEX = 1;
    private static final byte MARGIN = 1;
    private static final byte PADDING = 2;
    private float[] arr;
    private com.facebook.yoga.YogaBaselineFunction mBaselineFunction;
    private java.util.List<com.facebook.yoga.YogaNodeJNIBase> mChildren;
    private java.lang.Object mData;
    private boolean mHasNewLayout;
    private int mLayoutDirection;
    private com.facebook.yoga.YogaMeasureFunction mMeasureFunction;
    protected long mNativePointer;
    private com.facebook.yoga.YogaNodeJNIBase mOwner;

    /* renamed from: com.facebook.yoga.YogaNodeJNIBase$1, reason: invalid class name */
    /* loaded from: classes15.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$yoga$YogaEdge;

        static {
            int[] iArr = new int[com.facebook.yoga.YogaEdge.values().length];
            $SwitchMap$com$facebook$yoga$YogaEdge = iArr;
            try {
                iArr[com.facebook.yoga.YogaEdge.LEFT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[com.facebook.yoga.YogaEdge.TOP.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[com.facebook.yoga.YogaEdge.RIGHT.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[com.facebook.yoga.YogaEdge.BOTTOM.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[com.facebook.yoga.YogaEdge.START.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$yoga$YogaEdge[com.facebook.yoga.YogaEdge.END.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
        }
    }

    private YogaNodeJNIBase(long j17) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        if (j17 != 0) {
            this.mNativePointer = j17;
            return;
        }
        throw new java.lang.IllegalStateException("Failed to allocate native memory");
    }

    private void clearChildren() {
        this.mChildren = null;
        com.facebook.yoga.YogaNative.jni_YGNodeClearChildrenJNI(this.mNativePointer);
    }

    private final long replaceChild(com.facebook.yoga.YogaNodeJNIBase yogaNodeJNIBase, int i17) {
        java.util.List<com.facebook.yoga.YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            throw new java.lang.IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i17);
        this.mChildren.add(i17, yogaNodeJNIBase);
        yogaNodeJNIBase.mOwner = this;
        return yogaNodeJNIBase.mNativePointer;
    }

    private static com.facebook.yoga.YogaValue valueFromLong(long j17) {
        return new com.facebook.yoga.YogaValue(java.lang.Float.intBitsToFloat((int) j17), (int) (j17 >> 32));
    }

    @Override // com.facebook.yoga.YogaNode
    public void addChildAt(com.facebook.yoga.YogaNode yogaNode, int i17) {
        com.facebook.yoga.YogaNodeJNIBase yogaNodeJNIBase = (com.facebook.yoga.YogaNodeJNIBase) yogaNode;
        if (yogaNodeJNIBase.mOwner != null) {
            throw new java.lang.IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if (this.mChildren == null) {
            this.mChildren = new java.util.ArrayList(4);
        }
        this.mChildren.add(i17, yogaNodeJNIBase);
        yogaNodeJNIBase.mOwner = this;
        com.facebook.yoga.YogaNative.jni_YGNodeInsertChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i17);
    }

    public final float baseline(float f17, float f18) {
        return this.mBaselineFunction.baseline(this, f17, f18);
    }

    @Override // com.facebook.yoga.YogaNode
    public void calculateLayout(float f17, float f18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(this);
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            java.util.List<com.facebook.yoga.YogaNodeJNIBase> list = ((com.facebook.yoga.YogaNodeJNIBase) arrayList.get(i17)).mChildren;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        com.facebook.yoga.YogaNodeJNIBase[] yogaNodeJNIBaseArr = (com.facebook.yoga.YogaNodeJNIBase[]) arrayList.toArray(new com.facebook.yoga.YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i18 = 0; i18 < yogaNodeJNIBaseArr.length; i18++) {
            jArr[i18] = yogaNodeJNIBaseArr[i18].mNativePointer;
        }
        com.facebook.yoga.YogaNative.jni_YGNodeCalculateLayoutJNI(this.mNativePointer, f17, f18, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.YogaNode
    public void copyStyle(com.facebook.yoga.YogaNode yogaNode) {
        com.facebook.yoga.YogaNative.jni_YGNodeCopyStyleJNI(this.mNativePointer, ((com.facebook.yoga.YogaNodeJNIBase) yogaNode).mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void dirty() {
        com.facebook.yoga.YogaNative.jni_YGNodeMarkDirtyJNI(this.mNativePointer);
    }

    public void dirtyAllDescendants() {
        com.facebook.yoga.YogaNative.jni_YGNodeMarkDirtyAndPropogateToDescendantsJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaAlign getAlignContent() {
        return com.facebook.yoga.YogaAlign.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetAlignContentJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaAlign getAlignItems() {
        return com.facebook.yoga.YogaAlign.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetAlignItemsJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaAlign getAlignSelf() {
        return com.facebook.yoga.YogaAlign.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetAlignSelfJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getAspectRatio() {
        return com.facebook.yoga.YogaNative.jni_YGNodeStyleGetAspectRatioJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getBorder(com.facebook.yoga.YogaEdge yogaEdge) {
        return com.facebook.yoga.YogaNative.jni_YGNodeStyleGetBorderJNI(this.mNativePointer, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public int getChildCount() {
        java.util.List<com.facebook.yoga.YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.facebook.yoga.YogaNode
    public java.lang.Object getData() {
        return this.mData;
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaDisplay getDisplay() {
        return com.facebook.yoga.YogaDisplay.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetDisplayJNI(this.mNativePointer));
    }

    public boolean getDoesLegacyStretchFlagAffectsLayout() {
        float[] fArr = this.arr;
        return fArr != null && (((int) fArr[0]) & 8) == 8;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlex() {
        return com.facebook.yoga.YogaNative.jni_YGNodeStyleGetFlexJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getFlexBasis() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetFlexBasisJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaFlexDirection getFlexDirection() {
        return com.facebook.yoga.YogaFlexDirection.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetFlexDirectionJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlexGrow() {
        return com.facebook.yoga.YogaNative.jni_YGNodeStyleGetFlexGrowJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getFlexShrink() {
        return com.facebook.yoga.YogaNative.jni_YGNodeStyleGetFlexShrinkJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getHeight() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetHeightJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaJustify getJustifyContent() {
        return com.facebook.yoga.YogaJustify.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetJustifyContentJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutBorder(com.facebook.yoga.YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f17 = fArr[0];
        if ((((int) f17) & 4) != 4) {
            return 0.0f;
        }
        int i17 = (14 - ((((int) f17) & 1) == 1 ? 0 : 4)) - ((((int) f17) & 2) != 2 ? 4 : 0);
        switch (com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[i17];
            case 2:
                return this.arr[i17 + 1];
            case 3:
                return this.arr[i17 + 2];
            case 4:
                return this.arr[i17 + 3];
            case 5:
                return getLayoutDirection() == com.facebook.yoga.YogaDirection.RTL ? this.arr[i17 + 2] : this.arr[i17];
            case 6:
                return getLayoutDirection() == com.facebook.yoga.YogaDirection.RTL ? this.arr[i17] : this.arr[i17 + 2];
            default:
                throw new java.lang.IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaDirection getLayoutDirection() {
        float[] fArr = this.arr;
        return com.facebook.yoga.YogaDirection.fromInt(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutHeight() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutMargin(com.facebook.yoga.YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        switch (com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[6];
            case 2:
                return this.arr[7];
            case 3:
                return this.arr[8];
            case 4:
                return this.arr[9];
            case 5:
                return getLayoutDirection() == com.facebook.yoga.YogaDirection.RTL ? this.arr[8] : this.arr[6];
            case 6:
                return getLayoutDirection() == com.facebook.yoga.YogaDirection.RTL ? this.arr[6] : this.arr[8];
            default:
                throw new java.lang.IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutPadding(com.facebook.yoga.YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f17 = fArr[0];
        if ((((int) f17) & 2) != 2) {
            return 0.0f;
        }
        int i17 = 10 - ((((int) f17) & 1) != 1 ? 4 : 0);
        switch (com.facebook.yoga.YogaNodeJNIBase.AnonymousClass1.$SwitchMap$com$facebook$yoga$YogaEdge[yogaEdge.ordinal()]) {
            case 1:
                return this.arr[i17];
            case 2:
                return this.arr[i17 + 1];
            case 3:
                return this.arr[i17 + 2];
            case 4:
                return this.arr[i17 + 3];
            case 5:
                return getLayoutDirection() == com.facebook.yoga.YogaDirection.RTL ? this.arr[i17 + 2] : this.arr[i17];
            case 6:
                return getLayoutDirection() == com.facebook.yoga.YogaDirection.RTL ? this.arr[i17] : this.arr[i17 + 2];
            default:
                throw new java.lang.IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutWidth() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutX() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public float getLayoutY() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getMargin(com.facebook.yoga.YogaEdge yogaEdge) {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetMarginJNI(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getMaxHeight() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetMaxHeightJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getMaxWidth() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetMaxWidthJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getMinHeight() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetMinHeightJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getMinWidth() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetMinWidthJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaOverflow getOverflow() {
        return com.facebook.yoga.YogaOverflow.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetOverflowJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getPadding(com.facebook.yoga.YogaEdge yogaEdge) {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetPaddingJNI(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getPosition(com.facebook.yoga.YogaEdge yogaEdge) {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetPositionJNI(this.mNativePointer, yogaEdge.intValue()));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaPositionType getPositionType() {
        return com.facebook.yoga.YogaPositionType.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetPositionTypeJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaDirection getStyleDirection() {
        return com.facebook.yoga.YogaDirection.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetDirectionJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaValue getWidth() {
        return valueFromLong(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetWidthJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaWrap getWrap() {
        return com.facebook.yoga.YogaWrap.fromInt(com.facebook.yoga.YogaNative.jni_YGNodeStyleGetFlexWrapJNI(this.mNativePointer));
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean hasNewLayout() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.mHasNewLayout;
    }

    @Override // com.facebook.yoga.YogaNode
    public int indexOf(com.facebook.yoga.YogaNode yogaNode) {
        java.util.List<com.facebook.yoga.YogaNodeJNIBase> list = this.mChildren;
        if (list == null) {
            return -1;
        }
        return list.indexOf(yogaNode);
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isBaselineDefined() {
        return this.mBaselineFunction != null;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isDirty() {
        return com.facebook.yoga.YogaNative.jni_YGNodeIsDirtyJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isMeasureDefined() {
        return this.mMeasureFunction != null;
    }

    @Override // com.facebook.yoga.YogaNode
    public boolean isReferenceBaseline() {
        return com.facebook.yoga.YogaNative.jni_YGNodeIsReferenceBaselineJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void markLayoutSeen() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.mHasNewLayout = false;
    }

    public final long measure(float f17, int i17, float f18, int i18) {
        if (isMeasureDefined()) {
            return this.mMeasureFunction.measure(this, f17, com.facebook.yoga.YogaMeasureMode.fromInt(i17), f18, com.facebook.yoga.YogaMeasureMode.fromInt(i18));
        }
        throw new java.lang.RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.YogaNode
    public void print() {
        com.facebook.yoga.YogaNative.jni_YGNodePrintJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void reset() {
        this.mMeasureFunction = null;
        this.mBaselineFunction = null;
        this.mData = null;
        this.arr = null;
        this.mHasNewLayout = true;
        this.mLayoutDirection = 0;
        com.facebook.yoga.YogaNative.jni_YGNodeResetJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignContent(com.facebook.yoga.YogaAlign yogaAlign) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignItems(com.facebook.yoga.YogaAlign yogaAlign) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAlignSelf(com.facebook.yoga.YogaAlign yogaAlign) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.mNativePointer, yogaAlign.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setAspectRatio(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setBaselineFunction(com.facebook.yoga.YogaBaselineFunction yogaBaselineFunction) {
        this.mBaselineFunction = yogaBaselineFunction;
        com.facebook.yoga.YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.mNativePointer, yogaBaselineFunction != null);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setBorder(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetBorderJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setData(java.lang.Object obj) {
        this.mData = obj;
    }

    @Override // com.facebook.yoga.YogaNode
    public void setDirection(com.facebook.yoga.YogaDirection yogaDirection) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetDirectionJNI(this.mNativePointer, yogaDirection.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setDisplay(com.facebook.yoga.YogaDisplay yogaDisplay) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetDisplayJNI(this.mNativePointer, yogaDisplay.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlex(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasis(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasisAuto() {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexBasisPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexDirection(com.facebook.yoga.YogaFlexDirection yogaFlexDirection) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.mNativePointer, yogaFlexDirection.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexGrow(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setFlexShrink(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeight(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetHeightJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeightAuto() {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setHeightPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setIsReferenceBaseline(boolean z17) {
        com.facebook.yoga.YogaNative.jni_YGNodeSetIsReferenceBaselineJNI(this.mNativePointer, z17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setJustifyContent(com.facebook.yoga.YogaJustify yogaJustify) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.mNativePointer, yogaJustify.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMargin(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMarginJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMarginAuto(com.facebook.yoga.YogaEdge yogaEdge) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.mNativePointer, yogaEdge.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMarginPercent(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxHeight(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxHeightPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxWidth(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMaxWidthPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMeasureFunction(com.facebook.yoga.YogaMeasureFunction yogaMeasureFunction) {
        this.mMeasureFunction = yogaMeasureFunction;
        com.facebook.yoga.YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.mNativePointer, yogaMeasureFunction != null);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinHeight(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinHeightPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinWidth(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setMinWidthPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setOverflow(com.facebook.yoga.YogaOverflow yogaOverflow) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetOverflowJNI(this.mNativePointer, yogaOverflow.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPadding(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPaddingPercent(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPosition(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPositionJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPositionPercent(com.facebook.yoga.YogaEdge yogaEdge, float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.mNativePointer, yogaEdge.intValue(), f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setPositionType(com.facebook.yoga.YogaPositionType yogaPositionType) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.mNativePointer, yogaPositionType.intValue());
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidth(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetWidthJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidthAuto() {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.mNativePointer);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWidthPercent(float f17) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.mNativePointer, f17);
    }

    @Override // com.facebook.yoga.YogaNode
    public void setWrap(com.facebook.yoga.YogaWrap yogaWrap) {
        com.facebook.yoga.YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.mNativePointer, yogaWrap.intValue());
    }

    public void swapChildAt(com.facebook.yoga.YogaNode yogaNode, int i17) {
        com.facebook.yoga.YogaNodeJNIBase yogaNodeJNIBase = (com.facebook.yoga.YogaNodeJNIBase) yogaNode;
        this.mChildren.remove(i17);
        this.mChildren.add(i17, yogaNodeJNIBase);
        yogaNodeJNIBase.mOwner = this;
        com.facebook.yoga.YogaNative.jni_YGNodeSwapChildJNI(this.mNativePointer, yogaNodeJNIBase.mNativePointer, i17);
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaNodeJNIBase cloneWithChildren() {
        try {
            com.facebook.yoga.YogaNodeJNIBase yogaNodeJNIBase = (com.facebook.yoga.YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = com.facebook.yoga.YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            for (int i17 = 0; i17 < yogaNodeJNIBase.getChildCount(); i17++) {
                yogaNodeJNIBase.swapChildAt(yogaNodeJNIBase.getChildAt(i17).cloneWithChildren(), i17);
            }
            return yogaNodeJNIBase;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaNodeJNIBase cloneWithoutChildren() {
        try {
            com.facebook.yoga.YogaNodeJNIBase yogaNodeJNIBase = (com.facebook.yoga.YogaNodeJNIBase) super.clone();
            long jni_YGNodeCloneJNI = com.facebook.yoga.YogaNative.jni_YGNodeCloneJNI(this.mNativePointer);
            yogaNodeJNIBase.mOwner = null;
            yogaNodeJNIBase.mNativePointer = jni_YGNodeCloneJNI;
            yogaNodeJNIBase.clearChildren();
            return yogaNodeJNIBase;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaNodeJNIBase getChildAt(int i17) {
        java.util.List<com.facebook.yoga.YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            return list.get(i17);
        }
        throw new java.lang.IllegalStateException("YogaNode does not have children");
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaNodeJNIBase getOwner() {
        return this.mOwner;
    }

    @Override // com.facebook.yoga.YogaNode
    @java.lang.Deprecated
    public com.facebook.yoga.YogaNodeJNIBase getParent() {
        return getOwner();
    }

    @Override // com.facebook.yoga.YogaNode
    public com.facebook.yoga.YogaNodeJNIBase removeChildAt(int i17) {
        java.util.List<com.facebook.yoga.YogaNodeJNIBase> list = this.mChildren;
        if (list != null) {
            com.facebook.yoga.YogaNodeJNIBase remove = list.remove(i17);
            remove.mOwner = null;
            com.facebook.yoga.YogaNative.jni_YGNodeRemoveChildJNI(this.mNativePointer, remove.mNativePointer);
            return remove;
        }
        throw new java.lang.IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    public YogaNodeJNIBase() {
        this(com.facebook.yoga.YogaNative.jni_YGNodeNewJNI());
    }

    public YogaNodeJNIBase(com.facebook.yoga.YogaConfig yogaConfig) {
        this(com.facebook.yoga.YogaNative.jni_YGNodeNewWithConfigJNI(((com.facebook.yoga.YogaConfigJNIBase) yogaConfig).mNativePointer));
    }
}

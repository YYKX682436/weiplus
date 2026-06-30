package com.facebook.yoga;

/* loaded from: classes15.dex */
public class YogaNative {
    public static native void jni_YGConfigFreeJNI(long j17);

    public static native long jni_YGConfigNewJNI();

    public static native void jni_YGConfigSetExperimentalFeatureEnabledJNI(long j17, int i17, boolean z17);

    public static native void jni_YGConfigSetLoggerJNI(long j17, com.facebook.yoga.YogaLogger yogaLogger);

    public static native void jni_YGConfigSetPointScaleFactorJNI(long j17, float f17);

    public static native void jni_YGConfigSetPrintTreeFlagJNI(long j17, boolean z17);

    public static native void jni_YGConfigSetShouldDiffLayoutWithoutLegacyStretchBehaviourJNI(long j17, boolean z17);

    public static native void jni_YGConfigSetUseLegacyStretchBehaviourJNI(long j17, boolean z17);

    public static native void jni_YGConfigSetUseWebDefaultsJNI(long j17, boolean z17);

    public static native void jni_YGNodeCalculateLayoutJNI(long j17, float f17, float f18, long[] jArr, com.facebook.yoga.YogaNodeJNIBase[] yogaNodeJNIBaseArr);

    public static native void jni_YGNodeClearChildrenJNI(long j17);

    public static native long jni_YGNodeCloneJNI(long j17);

    public static native void jni_YGNodeCopyStyleJNI(long j17, long j18);

    public static native void jni_YGNodeFreeJNI(long j17);

    public static native void jni_YGNodeInsertChildJNI(long j17, long j18, int i17);

    public static native boolean jni_YGNodeIsDirtyJNI(long j17);

    public static native boolean jni_YGNodeIsReferenceBaselineJNI(long j17);

    public static native void jni_YGNodeMarkDirtyAndPropogateToDescendantsJNI(long j17);

    public static native void jni_YGNodeMarkDirtyJNI(long j17);

    public static native long jni_YGNodeNewJNI();

    public static native long jni_YGNodeNewWithConfigJNI(long j17);

    public static native void jni_YGNodePrintJNI(long j17);

    public static native void jni_YGNodeRemoveChildJNI(long j17, long j18);

    public static native void jni_YGNodeResetJNI(long j17);

    public static native void jni_YGNodeSetHasBaselineFuncJNI(long j17, boolean z17);

    public static native void jni_YGNodeSetHasMeasureFuncJNI(long j17, boolean z17);

    public static native void jni_YGNodeSetIsReferenceBaselineJNI(long j17, boolean z17);

    public static native void jni_YGNodeSetStyleInputsJNI(long j17, float[] fArr, int i17);

    public static native int jni_YGNodeStyleGetAlignContentJNI(long j17);

    public static native int jni_YGNodeStyleGetAlignItemsJNI(long j17);

    public static native int jni_YGNodeStyleGetAlignSelfJNI(long j17);

    public static native float jni_YGNodeStyleGetAspectRatioJNI(long j17);

    public static native float jni_YGNodeStyleGetBorderJNI(long j17, int i17);

    public static native int jni_YGNodeStyleGetDirectionJNI(long j17);

    public static native int jni_YGNodeStyleGetDisplayJNI(long j17);

    public static native long jni_YGNodeStyleGetFlexBasisJNI(long j17);

    public static native int jni_YGNodeStyleGetFlexDirectionJNI(long j17);

    public static native float jni_YGNodeStyleGetFlexGrowJNI(long j17);

    public static native float jni_YGNodeStyleGetFlexJNI(long j17);

    public static native float jni_YGNodeStyleGetFlexShrinkJNI(long j17);

    public static native int jni_YGNodeStyleGetFlexWrapJNI(long j17);

    public static native long jni_YGNodeStyleGetHeightJNI(long j17);

    public static native int jni_YGNodeStyleGetJustifyContentJNI(long j17);

    public static native long jni_YGNodeStyleGetMarginJNI(long j17, int i17);

    public static native long jni_YGNodeStyleGetMaxHeightJNI(long j17);

    public static native long jni_YGNodeStyleGetMaxWidthJNI(long j17);

    public static native long jni_YGNodeStyleGetMinHeightJNI(long j17);

    public static native long jni_YGNodeStyleGetMinWidthJNI(long j17);

    public static native int jni_YGNodeStyleGetOverflowJNI(long j17);

    public static native long jni_YGNodeStyleGetPaddingJNI(long j17, int i17);

    public static native long jni_YGNodeStyleGetPositionJNI(long j17, int i17);

    public static native int jni_YGNodeStyleGetPositionTypeJNI(long j17);

    public static native long jni_YGNodeStyleGetWidthJNI(long j17);

    public static native void jni_YGNodeStyleSetAlignContentJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetAlignItemsJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetAlignSelfJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetAspectRatioJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetBorderJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetDirectionJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetDisplayJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetFlexBasisAutoJNI(long j17);

    public static native void jni_YGNodeStyleSetFlexBasisJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetFlexBasisPercentJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetFlexDirectionJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetFlexGrowJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetFlexJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetFlexShrinkJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetFlexWrapJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetHeightAutoJNI(long j17);

    public static native void jni_YGNodeStyleSetHeightJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetHeightPercentJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetJustifyContentJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetMarginAutoJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetMarginJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetMarginPercentJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetMaxHeightJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMaxHeightPercentJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMaxWidthJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMaxWidthPercentJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMinHeightJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMinHeightPercentJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMinWidthJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetMinWidthPercentJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetOverflowJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetPaddingJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetPaddingPercentJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetPositionJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetPositionPercentJNI(long j17, int i17, float f17);

    public static native void jni_YGNodeStyleSetPositionTypeJNI(long j17, int i17);

    public static native void jni_YGNodeStyleSetWidthAutoJNI(long j17);

    public static native void jni_YGNodeStyleSetWidthJNI(long j17, float f17);

    public static native void jni_YGNodeStyleSetWidthPercentJNI(long j17, float f17);

    public static native void jni_YGNodeSwapChildJNI(long j17, long j18, int i17);
}

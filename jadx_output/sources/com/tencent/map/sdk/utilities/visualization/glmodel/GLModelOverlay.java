package com.tencent.map.sdk.utilities.visualization.glmodel;

/* loaded from: classes13.dex */
public interface GLModelOverlay extends com.tencent.tencentmap.mapsdk.maps.model.IAnimatorModel, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay {
    int getCurrentMaterialVariant();

    java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo> getMaterialVariants();

    java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.AnimationInfo> getSkeletonAnimationProperties();

    boolean getUnlit();

    void playSkeletonAnimation(int i17, float f17, boolean z17);

    void resetMonoColor();

    void setMaterialVariant(int i17);

    void setMonoColor(com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams monoColorParams);

    void setUnlit(boolean z17);

    void stopSkeletonAnimation();
}

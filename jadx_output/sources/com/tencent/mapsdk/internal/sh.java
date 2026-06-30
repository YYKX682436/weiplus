package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public final class sh {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction>> f51358a = new java.util.TreeMap<>(java.lang.String.CASE_INSENSITIVE_ORDER);

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f51359b = new java.util.concurrent.atomic.AtomicInteger(0);

    private sh() {
    }

    public static void a() {
        if (f51359b.getAndIncrement() == 0) {
            java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction>> treeMap = f51358a;
            treeMap.put("setPosition", com.tencent.map.lib.models.CommandFunctionModelClass.SetPositionCommand.class);
            treeMap.put("getPosition", com.tencent.map.lib.models.CommandFunctionModelClass.GetPositionCommand.class);
            treeMap.put("enableClick", com.tencent.map.lib.models.CommandFunctionModelClass.EnableClickCommand.class);
            treeMap.put("getClickEnabled", com.tencent.map.lib.models.CommandFunctionModelClass.GetClickEnabledCommand.class);
            treeMap.put("setVisible", com.tencent.map.lib.models.CommandFunctionModelClass.SetVisibleCommand.class);
            treeMap.put("getVisible", com.tencent.map.lib.models.CommandFunctionModelClass.GetVisibleCommand.class);
            treeMap.put("playSkeletonAnimation", com.tencent.map.lib.models.CommandFunctionModelClass.PlaySkeletonAnimationCommand.class);
            treeMap.put("stopSkeletonAnimation", com.tencent.map.lib.models.CommandFunctionModelClass.StopSkeletonAnimationCommand.class);
            treeMap.put("getSkeletonAnimationInfo", com.tencent.map.lib.models.CommandFunctionModelClass.GetSkeletonAnimationInfoCommand.class);
            treeMap.put("startTranslateAnimation", com.tencent.map.lib.models.CommandFunctionModelClass.StartTranslateAnimationCommand.class);
            treeMap.put("getType", com.tencent.map.lib.models.CommandFunctionModelClass.GetTypeCommand.class);
            treeMap.put("setScale", com.tencent.map.lib.models.CommandFunctionModelClass.SetScaleCommand.class);
            treeMap.put("getScale", com.tencent.map.lib.models.CommandFunctionModelClass.GetScaleCommand.class);
            treeMap.put("setRotation", com.tencent.map.lib.models.CommandFunctionModelClass.SetRotationCommand.class);
            treeMap.put("getRotation", com.tencent.map.lib.models.CommandFunctionModelClass.GetRotationCommand.class);
            treeMap.put("setPixelBound", com.tencent.map.lib.models.CommandFunctionModelClass.SetPixelBoundCommand.class);
            treeMap.put("setExposure", com.tencent.map.lib.models.CommandFunctionModelClass.SetExposureCommand.class);
            treeMap.put("getExposure", com.tencent.map.lib.models.CommandFunctionModelClass.GetExposureCommand.class);
            treeMap.put("setZoomLevelRange", com.tencent.map.lib.models.CommandFunctionModelClass.SetZoomLevelRangeCommand.class);
            treeMap.put("getMaterialVariantsInfo", com.tencent.map.lib.models.CommandFunctionModelClass.GetMaterialVariantsCommand.class);
            treeMap.put("getCurrentMaterialVariant", com.tencent.map.lib.models.CommandFunctionModelClass.GetCurrentMaterialVariantCommand.class);
            treeMap.put("setMaterialVariant", com.tencent.map.lib.models.CommandFunctionModelClass.SetMaterialVariantCommand.class);
            treeMap.put("setMonoColor", com.tencent.map.lib.models.CommandFunctionModelClass.SetMonoColorCommand.class);
            treeMap.put("resetMonoColor", com.tencent.map.lib.models.CommandFunctionModelClass.ResetColorCommand.class);
            treeMap.put("enableUnlit", com.tencent.map.lib.models.CommandFunctionModelClass.EnableUnlitCommand.class);
            treeMap.put("getUnlitEnabled", com.tencent.map.lib.models.CommandFunctionModelClass.GetUnlitEnabledCommand.class);
            treeMap.put("setAmbientLight", com.tencent.map.lib.models.CommandFunctionModelClass.SetAmbientLightCommand.class);
            treeMap.put("setSpotOrDirectionalLight", com.tencent.map.lib.models.CommandFunctionModelClass.SetSpotOrDirectionalLightCommand.class);
        }
    }

    public static void b() {
        if (f51359b.decrementAndGet() == 0) {
            f51358a.clear();
        }
    }

    private static void c() {
        java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction>> treeMap = f51358a;
        treeMap.put("setPosition", com.tencent.map.lib.models.CommandFunctionModelClass.SetPositionCommand.class);
        treeMap.put("getPosition", com.tencent.map.lib.models.CommandFunctionModelClass.GetPositionCommand.class);
        treeMap.put("enableClick", com.tencent.map.lib.models.CommandFunctionModelClass.EnableClickCommand.class);
        treeMap.put("getClickEnabled", com.tencent.map.lib.models.CommandFunctionModelClass.GetClickEnabledCommand.class);
        treeMap.put("setVisible", com.tencent.map.lib.models.CommandFunctionModelClass.SetVisibleCommand.class);
        treeMap.put("getVisible", com.tencent.map.lib.models.CommandFunctionModelClass.GetVisibleCommand.class);
        treeMap.put("playSkeletonAnimation", com.tencent.map.lib.models.CommandFunctionModelClass.PlaySkeletonAnimationCommand.class);
        treeMap.put("stopSkeletonAnimation", com.tencent.map.lib.models.CommandFunctionModelClass.StopSkeletonAnimationCommand.class);
        treeMap.put("getSkeletonAnimationInfo", com.tencent.map.lib.models.CommandFunctionModelClass.GetSkeletonAnimationInfoCommand.class);
        treeMap.put("startTranslateAnimation", com.tencent.map.lib.models.CommandFunctionModelClass.StartTranslateAnimationCommand.class);
        treeMap.put("getType", com.tencent.map.lib.models.CommandFunctionModelClass.GetTypeCommand.class);
        treeMap.put("setScale", com.tencent.map.lib.models.CommandFunctionModelClass.SetScaleCommand.class);
        treeMap.put("getScale", com.tencent.map.lib.models.CommandFunctionModelClass.GetScaleCommand.class);
        treeMap.put("setRotation", com.tencent.map.lib.models.CommandFunctionModelClass.SetRotationCommand.class);
        treeMap.put("getRotation", com.tencent.map.lib.models.CommandFunctionModelClass.GetRotationCommand.class);
        treeMap.put("setPixelBound", com.tencent.map.lib.models.CommandFunctionModelClass.SetPixelBoundCommand.class);
        treeMap.put("setExposure", com.tencent.map.lib.models.CommandFunctionModelClass.SetExposureCommand.class);
        treeMap.put("getExposure", com.tencent.map.lib.models.CommandFunctionModelClass.GetExposureCommand.class);
        treeMap.put("setZoomLevelRange", com.tencent.map.lib.models.CommandFunctionModelClass.SetZoomLevelRangeCommand.class);
        treeMap.put("getMaterialVariantsInfo", com.tencent.map.lib.models.CommandFunctionModelClass.GetMaterialVariantsCommand.class);
        treeMap.put("getCurrentMaterialVariant", com.tencent.map.lib.models.CommandFunctionModelClass.GetCurrentMaterialVariantCommand.class);
        treeMap.put("setMaterialVariant", com.tencent.map.lib.models.CommandFunctionModelClass.SetMaterialVariantCommand.class);
        treeMap.put("setMonoColor", com.tencent.map.lib.models.CommandFunctionModelClass.SetMonoColorCommand.class);
        treeMap.put("resetMonoColor", com.tencent.map.lib.models.CommandFunctionModelClass.ResetColorCommand.class);
        treeMap.put("enableUnlit", com.tencent.map.lib.models.CommandFunctionModelClass.EnableUnlitCommand.class);
        treeMap.put("getUnlitEnabled", com.tencent.map.lib.models.CommandFunctionModelClass.GetUnlitEnabledCommand.class);
        treeMap.put("setAmbientLight", com.tencent.map.lib.models.CommandFunctionModelClass.SetAmbientLightCommand.class);
        treeMap.put("setSpotOrDirectionalLight", com.tencent.map.lib.models.CommandFunctionModelClass.SetSpotOrDirectionalLightCommand.class);
    }

    private static void d() {
        f51358a.clear();
    }

    public static com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a(java.lang.String str) {
        return (com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction) com.tencent.map.tools.json.JsonUtils.parseToModel(str, com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction.class, new java.lang.Object[0]);
    }

    public static com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction a(java.lang.String str, java.lang.String str2) {
        java.lang.String trim = str2.trim();
        java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction>> treeMap = f51358a;
        if (treeMap.containsKey(trim)) {
            return (com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction) com.tencent.map.tools.json.JsonUtils.parseToModel(str, treeMap.get(trim), new java.lang.Object[0]);
        }
        return new com.tencent.map.lib.models.CommandFunctionModelClass.ErrorCommandFunction();
    }

    public static java.lang.String a(com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus returnStatus) {
        return com.tencent.map.tools.json.JsonUtils.modelToJsonString(returnStatus);
    }
}

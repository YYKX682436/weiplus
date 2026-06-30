package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class sh {

    /* renamed from: a, reason: collision with root package name */
    private static final java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction>> f132891a = new java.util.TreeMap<>(java.lang.String.CASE_INSENSITIVE_ORDER);

    /* renamed from: b, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicInteger f132892b = new java.util.concurrent.atomic.AtomicInteger(0);

    private sh() {
    }

    public static void a() {
        if (f132892b.getAndIncrement() == 0) {
            java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction>> treeMap = f132891a;
            treeMap.put("setPosition", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPositionCommand.class);
            treeMap.put("getPosition", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetPositionCommand.class);
            treeMap.put("enableClick", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableClickCommand.class);
            treeMap.put("getClickEnabled", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetClickEnabledCommand.class);
            treeMap.put("setVisible", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetVisibleCommand.class);
            treeMap.put("getVisible", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetVisibleCommand.class);
            treeMap.put("playSkeletonAnimation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.PlaySkeletonAnimationCommand.class);
            treeMap.put("stopSkeletonAnimation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.StopSkeletonAnimationCommand.class);
            treeMap.put("getSkeletonAnimationInfo", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetSkeletonAnimationInfoCommand.class);
            treeMap.put("startTranslateAnimation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.StartTranslateAnimationCommand.class);
            treeMap.put("getType", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetTypeCommand.class);
            treeMap.put("setScale", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetScaleCommand.class);
            treeMap.put("getScale", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetScaleCommand.class);
            treeMap.put("setRotation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetRotationCommand.class);
            treeMap.put("getRotation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetRotationCommand.class);
            treeMap.put("setPixelBound", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPixelBoundCommand.class);
            treeMap.put("setExposure", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetExposureCommand.class);
            treeMap.put("getExposure", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetExposureCommand.class);
            treeMap.put("setZoomLevelRange", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetZoomLevelRangeCommand.class);
            treeMap.put("getMaterialVariantsInfo", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetMaterialVariantsCommand.class);
            treeMap.put("getCurrentMaterialVariant", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetCurrentMaterialVariantCommand.class);
            treeMap.put("setMaterialVariant", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetMaterialVariantCommand.class);
            treeMap.put("setMonoColor", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetMonoColorCommand.class);
            treeMap.put("resetMonoColor", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.ResetColorCommand.class);
            treeMap.put("enableUnlit", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableUnlitCommand.class);
            treeMap.put("getUnlitEnabled", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetUnlitEnabledCommand.class);
            treeMap.put("setAmbientLight", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetAmbientLightCommand.class);
            treeMap.put("setSpotOrDirectionalLight", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetSpotOrDirectionalLightCommand.class);
        }
    }

    public static void b() {
        if (f132892b.decrementAndGet() == 0) {
            f132891a.clear();
        }
    }

    private static void c() {
        java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction>> treeMap = f132891a;
        treeMap.put("setPosition", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPositionCommand.class);
        treeMap.put("getPosition", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetPositionCommand.class);
        treeMap.put("enableClick", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableClickCommand.class);
        treeMap.put("getClickEnabled", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetClickEnabledCommand.class);
        treeMap.put("setVisible", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetVisibleCommand.class);
        treeMap.put("getVisible", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetVisibleCommand.class);
        treeMap.put("playSkeletonAnimation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.PlaySkeletonAnimationCommand.class);
        treeMap.put("stopSkeletonAnimation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.StopSkeletonAnimationCommand.class);
        treeMap.put("getSkeletonAnimationInfo", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetSkeletonAnimationInfoCommand.class);
        treeMap.put("startTranslateAnimation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.StartTranslateAnimationCommand.class);
        treeMap.put("getType", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetTypeCommand.class);
        treeMap.put("setScale", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetScaleCommand.class);
        treeMap.put("getScale", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetScaleCommand.class);
        treeMap.put("setRotation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetRotationCommand.class);
        treeMap.put("getRotation", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetRotationCommand.class);
        treeMap.put("setPixelBound", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetPixelBoundCommand.class);
        treeMap.put("setExposure", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetExposureCommand.class);
        treeMap.put("getExposure", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetExposureCommand.class);
        treeMap.put("setZoomLevelRange", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetZoomLevelRangeCommand.class);
        treeMap.put("getMaterialVariantsInfo", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetMaterialVariantsCommand.class);
        treeMap.put("getCurrentMaterialVariant", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetCurrentMaterialVariantCommand.class);
        treeMap.put("setMaterialVariant", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetMaterialVariantCommand.class);
        treeMap.put("setMonoColor", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetMonoColorCommand.class);
        treeMap.put("resetMonoColor", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.ResetColorCommand.class);
        treeMap.put("enableUnlit", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.EnableUnlitCommand.class);
        treeMap.put("getUnlitEnabled", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.GetUnlitEnabledCommand.class);
        treeMap.put("setAmbientLight", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetAmbientLightCommand.class);
        treeMap.put("setSpotOrDirectionalLight", com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.SetSpotOrDirectionalLightCommand.class);
    }

    private static void d() {
        f132891a.clear();
    }

    public static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a(java.lang.String str) {
        return (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(str, com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction.class, new java.lang.Object[0]);
    }

    public static com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction a(java.lang.String str, java.lang.String str2) {
        java.lang.String trim = str2.trim();
        java.util.TreeMap<java.lang.String, java.lang.Class<? extends com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction>> treeMap = f132891a;
        if (treeMap.containsKey(trim)) {
            return (com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.BaseCommandFunction) com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35881x450f6f3b(str, treeMap.get(trim), new java.lang.Object[0]);
        }
        return new com.p314xaae8f345.map.lib.p496xc04b6a6a.C4241x18bf9052.ErrorCommandFunction();
    }

    public static java.lang.String a(com.p314xaae8f345.map.lib.p496xc04b6a6a.C4258xcc41788d.ReturnStatus returnStatus) {
        return com.p314xaae8f345.map.p511x696c9db.p512x31ece8.C4320x365c2489.m35875xa34611bd(returnStatus);
    }
}

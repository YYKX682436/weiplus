package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class CommandFunctionModelClass {

    /* loaded from: classes13.dex */
    public static class BaseCommandFunction extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "function")
        public java.lang.String commandFunction;
    }

    /* loaded from: classes13.dex */
    public static class EnableClickCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.EnableClickParams params;
    }

    /* loaded from: classes13.dex */
    public static class EnableUnlitCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.EnableUnlitParams params;
    }

    /* loaded from: classes13.dex */
    public static class ErrorCommandFunction extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetClickEnabledCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetCurrentMaterialVariantCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetExposureCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetMaterialVariantsCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetPositionCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetRotationCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetScaleCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetSkeletonAnimationInfoCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetTypeCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetUnlitEnabledCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class GetVisibleCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class PlaySkeletonAnimationCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.PlaySkeletonAnimationParams params;
    }

    /* loaded from: classes13.dex */
    public static class ResetColorCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }

    /* loaded from: classes13.dex */
    public static class SetAmbientLightCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.AmbientLightParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetExposureCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.ExposureParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetMaterialVariantCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantIndexParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetMonoColorCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetPixelBoundCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.PixelBoundParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetPositionCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.PositionParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetRotationCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.RotationParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetScaleCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.ScaleParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetSpotOrDirectionalLightCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.SpotOrDirectionalLightParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetVisibleCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.VisibleParams params;
    }

    /* loaded from: classes13.dex */
    public static class SetZoomLevelRangeCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.ZoomLevelRangeParams params;
    }

    /* loaded from: classes13.dex */
    public static class StartTranslateAnimationCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {

        @com.tencent.map.tools.json.annotation.Json(name = "params")
        public com.tencent.map.lib.models.CommonParamsModelClass.StartTranslateAnimationParams params;
    }

    /* loaded from: classes13.dex */
    public static class StopSkeletonAnimationCommand extends com.tencent.map.lib.models.CommandFunctionModelClass.BaseCommandFunction {
    }
}

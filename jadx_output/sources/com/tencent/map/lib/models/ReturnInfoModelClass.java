package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class ReturnInfoModelClass {

    /* loaded from: classes13.dex */
    public static class BaseBooleanReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public boolean value;

        public BaseBooleanReturnInfo(boolean z17) {
            this.status = ya.b.SUCCESS;
            this.value = z17;
        }
    }

    /* loaded from: classes13.dex */
    public static class BaseFloatReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public float value;

        public BaseFloatReturnInfo(float f17) {
            this.status = ya.b.SUCCESS;
            this.value = f17;
        }
    }

    /* loaded from: classes13.dex */
    public static class BaseIntReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public int value;

        public BaseIntReturnInfo(int i17) {
            this.status = ya.b.SUCCESS;
            this.value = i17;
        }
    }

    /* loaded from: classes13.dex */
    public static class BaseStringReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public java.lang.String value;

        public BaseStringReturnInfo(java.lang.String str) {
            this.status = ya.b.SUCCESS;
            this.value = str;
        }
    }

    /* loaded from: classes13.dex */
    public static class ErrorReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public int errorCode;
        public java.lang.String errorMsg;

        /* loaded from: classes13.dex */
        public enum ErrorMsg {
            success(0, com.tencent.mm.plugin.lite.LiteAppCenter.FRAMEWORK_TYPE_NONE),
            jsonparse(1, "json parse error"),
            unsupported(2, "unsupported function"),
            internal(3, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR),
            invalidparam(4, "invalid param error");

            private int errorCode;
            private java.lang.String errorMsg;

            ErrorMsg(int i17, java.lang.String str) {
                this.errorCode = i17;
                this.errorMsg = str;
            }

            public final com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg bindErrorMsg(java.lang.String str) {
                this.errorMsg += com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LOG + str;
                return this;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getErrorMsg() {
                return this.errorMsg;
            }
        }

        public ErrorReturnInfo(com.tencent.map.lib.models.ReturnInfoModelClass.ErrorReturnInfo.ErrorMsg errorMsg) {
            this.status = com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED;
            this.errorCode = errorMsg.getErrorCode();
            this.errorMsg = errorMsg.getErrorMsg();
        }
    }

    /* loaded from: classes13.dex */
    public static class MaterialVariantsReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantsInfoParams value;

        public MaterialVariantsReturnInfo(java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo> list) {
            com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantsInfoParams materialVariantsInfoParams = new com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantsInfoParams();
            this.value = materialVariantsInfoParams;
            materialVariantsInfoParams.materialVariantInfoList = list;
        }
    }

    /* loaded from: classes13.dex */
    public static class PositionReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public com.tencent.map.lib.models.CommonParamsModelClass.PositionParams value;

        public PositionReturnInfo(com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng) {
            com.tencent.map.lib.models.CommonParamsModelClass.PositionParams positionParams = new com.tencent.map.lib.models.CommonParamsModelClass.PositionParams();
            this.value = positionParams;
            positionParams.lat = latLng.latitude;
            positionParams.lng = latLng.longitude;
            positionParams.altitude = latLng.altitude;
        }
    }

    /* loaded from: classes13.dex */
    public static class ReturnStatus extends com.tencent.map.tools.json.JsonComposer {
        public java.lang.String status = ya.b.SUCCESS;
    }

    /* loaded from: classes13.dex */
    public static class RotationReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public com.tencent.map.lib.models.CommonParamsModelClass.RotationParams value;

        public RotationReturnInfo(float f17, float f18, float f19) {
            com.tencent.map.lib.models.CommonParamsModelClass.RotationParams rotationParams = new com.tencent.map.lib.models.CommonParamsModelClass.RotationParams();
            this.value = rotationParams;
            rotationParams.rotationX = f17;
            rotationParams.rotationY = f18;
            rotationParams.rotationZ = f19;
        }
    }

    /* loaded from: classes13.dex */
    public static class SkeletonAnimationReturnInfo extends com.tencent.map.lib.models.ReturnInfoModelClass.ReturnStatus {
        public com.tencent.map.lib.models.CommonParamsModelClass.SkeletonAnimationParams value;

        public SkeletonAnimationReturnInfo(java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.AnimationInfo> list) {
            com.tencent.map.lib.models.CommonParamsModelClass.SkeletonAnimationParams skeletonAnimationParams = new com.tencent.map.lib.models.CommonParamsModelClass.SkeletonAnimationParams();
            this.value = skeletonAnimationParams;
            skeletonAnimationParams.animationInfoList = list == null ? new java.util.ArrayList<>() : list;
        }
    }
}

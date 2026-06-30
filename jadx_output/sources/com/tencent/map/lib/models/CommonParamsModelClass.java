package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class CommonParamsModelClass {

    /* loaded from: classes13.dex */
    public static class AmbientLightParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "color")
        public com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams color;

        @com.tencent.map.tools.json.annotation.Json(name = "intensity")
        public float intensity;
    }

    /* loaded from: classes13.dex */
    public static class AnimationInfo extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "duration")
        float duration;

        @com.tencent.map.tools.json.annotation.Json(name = ya.b.INDEX)
        int index;

        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        java.lang.String name;

        public AnimationInfo(int i17, java.lang.String str, float f17) {
            this.index = i17;
            this.name = str;
            this.duration = f17;
        }
    }

    /* loaded from: classes13.dex */
    public static class DirectionalParams extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: x, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "x")
        public float f48668x;

        /* renamed from: y, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "y")
        public float f48669y;

        /* renamed from: z, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "z")
        public float f48670z;
    }

    /* loaded from: classes13.dex */
    public static class EnableClickParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "enabled")
        public boolean enabled;
    }

    /* loaded from: classes13.dex */
    public static class EnableUnlitParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "enabled")
        public boolean enabled;
    }

    /* loaded from: classes13.dex */
    public static class ExposureParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "exposure")
        public float exposure;
    }

    /* loaded from: classes13.dex */
    public static class MaterialVariantIndexParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = ya.b.INDEX)
        public int variantIndex;
    }

    /* loaded from: classes13.dex */
    public static class MaterialVariantInfo extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        public java.lang.String variantName;
    }

    /* loaded from: classes13.dex */
    public static class MaterialVariantsInfoParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "materialVariantsInfo")
        public java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.MaterialVariantInfo> materialVariantInfoList;
    }

    /* loaded from: classes13.dex */
    public static class MonoColorParams extends com.tencent.map.tools.json.JsonComposer {

        /* renamed from: b, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "b")
        public float f48671b;

        /* renamed from: g, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "g")
        public float f48672g;

        /* renamed from: r, reason: collision with root package name */
        @com.tencent.map.tools.json.annotation.Json(name = "r")
        public float f48673r;
    }

    /* loaded from: classes13.dex */
    public static class PixelBoundParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "height")
        public int height;

        @com.tencent.map.tools.json.annotation.Json(name = "width")
        public int width;
    }

    /* loaded from: classes13.dex */
    public static class PlaySkeletonAnimationParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = ya.b.INDEX)
        public int index;

        @com.tencent.map.tools.json.annotation.Json(name = "repeat")
        public boolean repeat;

        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_NETWORK_SPEED)
        public float speed;
    }

    /* loaded from: classes13.dex */
    public static class PositionParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "altitude")
        public double altitude;

        @com.tencent.map.tools.json.annotation.Json(name = "lat")
        public double lat;

        @com.tencent.map.tools.json.annotation.Json(name = "lng")
        public double lng;
    }

    /* loaded from: classes13.dex */
    public static class RotationParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "rotationX")
        public float rotationX;

        @com.tencent.map.tools.json.annotation.Json(name = "rotationY")
        public float rotationY;

        @com.tencent.map.tools.json.annotation.Json(name = "rotationZ")
        public float rotationZ;
    }

    /* loaded from: classes13.dex */
    public static class ScaleParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "scale")
        public float scale;
    }

    /* loaded from: classes13.dex */
    public static class SkeletonAnimationParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "animationInfo")
        java.util.List<com.tencent.map.lib.models.CommonParamsModelClass.AnimationInfo> animationInfoList;
    }

    /* loaded from: classes13.dex */
    public static class SpotOrDirectionalLightParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "color")
        public com.tencent.map.lib.models.CommonParamsModelClass.MonoColorParams color;

        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.map.geolocation.sapp.TencentLocation.EXTRA_DIRECTION)
        public com.tencent.map.lib.models.CommonParamsModelClass.DirectionalParams direction;

        @com.tencent.map.tools.json.annotation.Json(name = "intensity")
        public float intensity;

        @com.tencent.map.tools.json.annotation.Json(name = "type")
        public int type;
    }

    /* loaded from: classes13.dex */
    public static class StartTranslateAnimationParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "duration")
        public float duration;

        @com.tencent.map.tools.json.annotation.Json(name = "initRotation")
        public float initRotation;

        @com.tencent.map.tools.json.annotation.Json(name = "needRotate")
        public boolean needRotate;

        @com.tencent.map.tools.json.annotation.Json(deserializer = com.tencent.tencentmap.mapsdk.maps.model.LatLngListDeserializer.class, name = "positions")
        public java.util.List<com.tencent.tencentmap.mapsdk.maps.model.LatLng> positions;
    }

    /* loaded from: classes13.dex */
    public static class VisibleParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "isVisible")
        public boolean isVisible;
    }

    /* loaded from: classes13.dex */
    public static class ZoomLevelRangeParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "maxLevel")
        public int maxLevel;

        @com.tencent.map.tools.json.annotation.Json(name = "minLevel")
        public int minLevel;
    }
}

package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class EventParamsModelClass {

    /* loaded from: classes13.dex */
    public static class ClickEventParams extends com.tencent.map.lib.models.EventParamsModelClass.EventParams {

        @com.tencent.map.tools.json.annotation.Json(name = "clickedPosition")
        public float[] clickedPosition;

        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.live.TXLivePluginDef.ParamKey.CALL_MANAGER_ID_KEY)
        public java.lang.String identifier;

        @com.tencent.map.tools.json.annotation.Json(name = com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME)
        public java.lang.String name;

        public ClickEventParams(java.lang.String str, com.tencent.tencentmap.mapsdk.maps.model.LatLng latLng, java.lang.String str2, java.lang.String str3) {
            this.eventType = com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.EventType.ON_CLICK;
            this.layerId = str;
            this.clickedPosition = r3;
            float[] fArr = {(float) latLng.getLatitude()};
            this.clickedPosition[1] = (float) latLng.getLongitude();
            this.identifier = str2;
            this.name = str3;
        }
    }

    /* loaded from: classes13.dex */
    public static class EventParams extends com.tencent.map.tools.json.JsonComposer {

        @com.tencent.map.tools.json.annotation.Json(name = "eventType")
        public java.lang.String eventType;

        @com.tencent.map.tools.json.annotation.Json(name = "layerId")
        public java.lang.String layerId;
    }

    /* loaded from: classes13.dex */
    public static class LoadFinishEventParams extends com.tencent.map.lib.models.EventParamsModelClass.EventParams {
        public int errorCode;
        public java.lang.String errorMsg;

        /* loaded from: classes13.dex */
        public enum LoadFinishInfo {
            ok(0, ""),
            errNetwork(1, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_NETWORK),
            errAuth(2, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_AUTH),
            errDataDecode(3, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_DATA_DECODE),
            errDataAvailable(4, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_DATA_AVAILABLE),
            errInternal(20, com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR);

            private int errorCode;
            private java.lang.String errorMsg;

            LoadFinishInfo(int i17, java.lang.String str) {
                this.errorCode = i17;
                this.errorMsg = str;
            }

            public static com.tencent.map.lib.models.EventParamsModelClass.LoadFinishEventParams.LoadFinishInfo getById(int i17) {
                for (com.tencent.map.lib.models.EventParamsModelClass.LoadFinishEventParams.LoadFinishInfo loadFinishInfo : values()) {
                    if (loadFinishInfo.checkStatus(i17)) {
                        return loadFinishInfo;
                    }
                }
                return ok;
            }

            public final boolean checkStatus(int i17) {
                return this.errorCode == i17;
            }

            public final int getErrorCode() {
                return this.errorCode;
            }

            public final java.lang.String getErrorMsg() {
                return this.errorMsg;
            }
        }

        public LoadFinishEventParams(java.lang.String str, com.tencent.map.lib.models.EventParamsModelClass.LoadFinishEventParams.LoadFinishInfo loadFinishInfo) {
            this.eventType = com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.EventType.ON_LAYER_LOAD_FINISH;
            this.layerId = str;
            this.errorCode = loadFinishInfo.errorCode;
            this.errorMsg = loadFinishInfo.errorMsg;
        }
    }

    /* loaded from: classes13.dex */
    public static class TranslateAnimationCompleteEventParams extends com.tencent.map.lib.models.EventParamsModelClass.EventParams {
        public TranslateAnimationCompleteEventParams(java.lang.String str) {
            this.eventType = com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.EventType.ON_TRANSLATEANIMATION_COMPLETE;
            this.layerId = str;
        }
    }
}

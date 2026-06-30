package com.tencent.map.sdk.comps.vis;

/* loaded from: classes13.dex */
public interface VisualLayer extends com.tencent.tencentmap.mapsdk.maps.interfaces.Alphable, com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.interfaces.Removable, com.tencent.tencentmap.mapsdk.maps.interfaces.Visible, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay {

    /* loaded from: classes13.dex */
    public interface OnLayerStatusChangedListener {

        /* loaded from: classes13.dex */
        public @interface EventType {
            public static final java.lang.String ON_CLICK = "onClickEvent";
            public static final java.lang.String ON_LAYER_LOAD_FINISH = "onLayerLoadFinishEvent";
            public static final java.lang.String ON_TRANSLATEANIMATION_COMPLETE = "onTranslateAnimationCompleteEvent";
        }

        /* loaded from: classes13.dex */
        public @interface LayerStatus {
            public static final int ERR_AUTH = 2;
            public static final int ERR_DATA_AVAILABLE = 4;
            public static final int ERR_DATA_DECODE = 3;
            public static final int ERR_INTERNAL_ERROR = 20;
            public static final int ERR_NETWORK = 1;
            public static final int OK = 0;
        }

        /* loaded from: classes13.dex */
        public @interface LayerStatusMsg {
            public static final java.lang.String MSG_ERR_AUTH = "authentication error";
            public static final java.lang.String MSG_ERR_DATA_AVAILABLE = "data check available error";
            public static final java.lang.String MSG_ERR_DATA_DECODE = "data protocol decode error";
            public static final java.lang.String MSG_ERR_INTERNAL_ERROR = "internal error";
            public static final java.lang.String MSG_ERR_NETWORK = "network error";
            public static final java.lang.String MSG_OK = "";
        }

        boolean onEvent(com.tencent.map.sdk.comps.vis.VisualLayer visualLayer, java.lang.String str, java.lang.String str2);

        void onLayerLoadFinish(int i17);
    }

    void addLayerStatusChangedListener(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener);

    void clearCache();

    com.tencent.map.sdk.comps.vis.VisualLayer copy();

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    void enableClick(boolean z17);

    java.lang.String executeCommand(com.tencent.tencentmap.mapsdk.maps.TencentMap tencentMap, java.lang.String str);

    @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    boolean isClickEnabled();

    void removeLayerStatusChangedListener(com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener onLayerStatusChangedListener);

    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Levelable, com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay
    void setLevel(int i17);

    void setTimeInterval(int i17);
}

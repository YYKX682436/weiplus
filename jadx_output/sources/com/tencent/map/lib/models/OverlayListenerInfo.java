package com.tencent.map.lib.models;

/* loaded from: classes13.dex */
public class OverlayListenerInfo {
    private com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener innerListener = new com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener() { // from class: com.tencent.map.lib.models.OverlayListenerInfo.1
        @Override // com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener
        public final void onVectorOverlayLoaded(final boolean z17) {
            new android.os.Handler(android.os.Looper.getMainLooper()).post(new java.lang.Runnable() { // from class: com.tencent.map.lib.models.OverlayListenerInfo.1.1
                @Override // java.lang.Runnable
                public final void run() {
                    com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener = com.tencent.map.lib.models.OverlayListenerInfo.this.outterVectorOverlayLoadListener;
                    if (onVectorOverlayLoadListener != null) {
                        onVectorOverlayLoadListener.onVectorOverlayLoaded(z17);
                        com.tencent.mapsdk.core.utils.log.LogUtil.b(com.tencent.mapsdk.internal.kx.f50224y, "TMS vetorOverlay loaded status: " + z17);
                    }
                }
            });
        }
    };
    protected com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener outterVectorOverlayClickListener;
    protected com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener outterVectorOverlayLoadListener;

    public com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener getOutterVectorOverlayClickListener() {
        return this.outterVectorOverlayClickListener;
    }

    public void setOutterVectorOverlayClickListener(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayClickListener onVectorOverlayClickListener) {
        this.outterVectorOverlayClickListener = onVectorOverlayClickListener;
    }

    public void setOutterVectorOverlayLoadListener(com.tencent.tencentmap.mapsdk.maps.model.VectorOverlay.OnVectorOverlayLoadListener onVectorOverlayLoadListener) {
        this.outterVectorOverlayLoadListener = onVectorOverlayLoadListener;
    }
}

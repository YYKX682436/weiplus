package com.tencent.map.sdk.comps.vis;

/* loaded from: classes13.dex */
public class VisualLayerOptionsBuilder implements com.tencent.tencentmap.mapsdk.maps.interfaces.Builder<com.tencent.map.sdk.comps.vis.VisualLayerOptions> {
    protected final com.tencent.map.sdk.comps.vis.VisualLayerOptions mLayerOptions;

    public VisualLayerOptionsBuilder(com.tencent.map.sdk.comps.vis.VisualLayerOptions visualLayerOptions) {
        this.mLayerOptions = visualLayerOptions;
    }

    public com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder setAlpha(float f17) {
        this.mLayerOptions.mAlpha = f17;
        return this;
    }

    public com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder setClickEnable(boolean z17) {
        this.mLayerOptions.mClickEnabled = z17;
        return this;
    }

    public com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder setLevel(int i17) {
        this.mLayerOptions.mLevel = i17;
        return this;
    }

    public com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder setTimeInterval(int i17) {
        this.mLayerOptions.mTimeInternal = i17;
        return this;
    }

    public com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder setZIndex(int i17) {
        this.mLayerOptions.mZIndex = i17;
        return this;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Builder
    public com.tencent.map.sdk.comps.vis.VisualLayerOptions build() {
        return this.mLayerOptions;
    }
}

package com.tencent.map.sdk.comps.vis;

/* loaded from: classes13.dex */
public class VisualLayerOptions implements com.tencent.tencentmap.mapsdk.maps.interfaces.Options<com.tencent.map.sdk.comps.vis.VisualLayerOptions, com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder> {
    java.lang.String mLayerId;
    int mZIndex;
    int mLevel = 1;
    int mTimeInternal = 0;
    float mAlpha = 1.0f;
    boolean mIsVisible = true;
    boolean mClickEnabled = false;

    public VisualLayerOptions(java.lang.String str) {
        this.mLayerId = str;
    }

    public float getAlpha() {
        return this.mAlpha;
    }

    public java.lang.String getLayerId() {
        return this.mLayerId;
    }

    public int getLevel() {
        return this.mLevel;
    }

    public int getTimeInterval() {
        return this.mTimeInternal;
    }

    public int getZIndex() {
        return this.mZIndex;
    }

    public boolean isClickEnabled() {
        return this.mClickEnabled;
    }

    public boolean isVisible() {
        return this.mIsVisible;
    }

    public java.lang.String toString() {
        return "VisualLayerOptions{mLayerId='" + this.mLayerId + "', mLevel=" + this.mLevel + ", mZIndex=" + this.mZIndex + ", mTimeInternal=" + this.mTimeInternal + ", mAlpha=" + this.mAlpha + ", mIsVisible=" + this.mIsVisible + ", mClickEnabled=" + this.mClickEnabled + '}';
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.tencentmap.mapsdk.maps.interfaces.Options
    public com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder newBuilder() {
        return new com.tencent.map.sdk.comps.vis.VisualLayerOptionsBuilder(this);
    }
}

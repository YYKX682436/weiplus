package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
class ZoomStateImpl implements androidx.camera.core.ZoomState {
    private float mLinearZoom;
    private final float mMaxZoomRatio;
    private final float mMinZoomRatio;
    private float mZoomRatio;

    public ZoomStateImpl(float f17, float f18) {
        this.mMaxZoomRatio = f17;
        this.mMinZoomRatio = f18;
    }

    private float getPercentageByRatio(float f17) {
        float f18 = this.mMaxZoomRatio;
        float f19 = this.mMinZoomRatio;
        if (f18 == f19) {
            return 0.0f;
        }
        if (f17 == f18) {
            return 1.0f;
        }
        if (f17 == f19) {
            return 0.0f;
        }
        float f27 = 1.0f / f19;
        return ((1.0f / f17) - f27) / ((1.0f / f18) - f27);
    }

    private float getRatioByPercentage(float f17) {
        if (f17 == 1.0f) {
            return this.mMaxZoomRatio;
        }
        if (f17 == 0.0f) {
            return this.mMinZoomRatio;
        }
        float f18 = this.mMaxZoomRatio;
        float f19 = this.mMinZoomRatio;
        double d17 = 1.0f / f19;
        double d18 = 1.0d / (d17 + (((1.0f / f18) - d17) * f17));
        double d19 = f19;
        double d27 = f18;
        if (d18 < d19) {
            d18 = d19;
        } else if (d18 > d27) {
            d18 = d27;
        }
        return (float) d18;
    }

    @Override // androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.mLinearZoom;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.mMaxZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.mMinZoomRatio;
    }

    @Override // androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.mZoomRatio;
    }

    public void setLinearZoom(float f17) {
        if (f17 <= 1.0f && f17 >= 0.0f) {
            this.mLinearZoom = f17;
            this.mZoomRatio = getRatioByPercentage(f17);
        } else {
            throw new java.lang.IllegalArgumentException("Requested linearZoom " + f17 + " is not within valid range [0..1]");
        }
    }

    public void setZoomRatio(float f17) {
        if (f17 <= this.mMaxZoomRatio && f17 >= this.mMinZoomRatio) {
            this.mZoomRatio = f17;
            this.mLinearZoom = getPercentageByRatio(f17);
            return;
        }
        throw new java.lang.IllegalArgumentException("Requested zoomRatio " + f17 + " is not within valid range [" + this.mMinZoomRatio + " , " + this.mMaxZoomRatio + "]");
    }
}

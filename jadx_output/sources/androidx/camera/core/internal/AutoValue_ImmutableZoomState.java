package androidx.camera.core.internal;

/* loaded from: classes14.dex */
final class AutoValue_ImmutableZoomState extends androidx.camera.core.internal.ImmutableZoomState {
    private final float linearZoom;
    private final float maxZoomRatio;
    private final float minZoomRatio;
    private final float zoomRatio;

    public AutoValue_ImmutableZoomState(float f17, float f18, float f19, float f27) {
        this.zoomRatio = f17;
        this.maxZoomRatio = f18;
        this.minZoomRatio = f19;
        this.linearZoom = f27;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.internal.ImmutableZoomState)) {
            return false;
        }
        androidx.camera.core.internal.ImmutableZoomState immutableZoomState = (androidx.camera.core.internal.ImmutableZoomState) obj;
        return java.lang.Float.floatToIntBits(this.zoomRatio) == java.lang.Float.floatToIntBits(immutableZoomState.getZoomRatio()) && java.lang.Float.floatToIntBits(this.maxZoomRatio) == java.lang.Float.floatToIntBits(immutableZoomState.getMaxZoomRatio()) && java.lang.Float.floatToIntBits(this.minZoomRatio) == java.lang.Float.floatToIntBits(immutableZoomState.getMinZoomRatio()) && java.lang.Float.floatToIntBits(this.linearZoom) == java.lang.Float.floatToIntBits(immutableZoomState.getLinearZoom());
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getLinearZoom() {
        return this.linearZoom;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // androidx.camera.core.internal.ImmutableZoomState, androidx.camera.core.ZoomState
    public float getZoomRatio() {
        return this.zoomRatio;
    }

    public int hashCode() {
        return ((((((java.lang.Float.floatToIntBits(this.zoomRatio) ^ 1000003) * 1000003) ^ java.lang.Float.floatToIntBits(this.maxZoomRatio)) * 1000003) ^ java.lang.Float.floatToIntBits(this.minZoomRatio)) * 1000003) ^ java.lang.Float.floatToIntBits(this.linearZoom);
    }

    public java.lang.String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.zoomRatio + ", maxZoomRatio=" + this.maxZoomRatio + ", minZoomRatio=" + this.minZoomRatio + ", linearZoom=" + this.linearZoom + "}";
    }
}

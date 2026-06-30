package androidx.camera.core.internal;

/* loaded from: classes14.dex */
public abstract class ImmutableZoomState implements androidx.camera.core.ZoomState {
    public static androidx.camera.core.ZoomState create(float f17, float f18, float f19, float f27) {
        return new androidx.camera.core.internal.AutoValue_ImmutableZoomState(f17, f18, f19, f27);
    }

    @Override // androidx.camera.core.ZoomState
    public abstract float getLinearZoom();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMaxZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getMinZoomRatio();

    @Override // androidx.camera.core.ZoomState
    public abstract float getZoomRatio();

    public static androidx.camera.core.ZoomState create(androidx.camera.core.ZoomState zoomState) {
        return new androidx.camera.core.internal.AutoValue_ImmutableZoomState(zoomState.getZoomRatio(), zoomState.getMaxZoomRatio(), zoomState.getMinZoomRatio(), zoomState.getLinearZoom());
    }
}

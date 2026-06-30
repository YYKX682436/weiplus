package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class CropRegionZoomImpl implements androidx.camera.camera2.internal.ZoomControl.ZoomImpl {
    public static final float MIN_DIGITAL_ZOOM = 1.0f;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private android.graphics.Rect mCurrentCropRect = null;
    private android.graphics.Rect mPendingZoomCropRegion = null;
    private t2.k mPendingZoomRatioCompleter;

    public CropRegionZoomImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
    }

    private static android.graphics.Rect getCropRectByRatio(android.graphics.Rect rect, float f17) {
        float width = rect.width() / f17;
        float height = rect.height() / f17;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new android.graphics.Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    private android.graphics.Rect getSensorRect() {
        android.graphics.Rect rect = (android.graphics.Rect) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        android.graphics.Rect rect = this.mCurrentCropRect;
        if (rect != null) {
            builder.setCaptureRequestOptionWithPriority(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect, androidx.camera.core.impl.Config.OptionPriority.REQUIRED);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public android.graphics.Rect getCropSensorRegion() {
        android.graphics.Rect rect = this.mCurrentCropRect;
        return rect != null ? rect : getSensorRect();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        java.lang.Float f17 = (java.lang.Float) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f17 == null) {
            return 1.0f;
        }
        return f17.floatValue() < getMinZoom() ? getMinZoom() : f17.floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return 1.0f;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            android.hardware.camera2.CaptureRequest request = totalCaptureResult.getRequest();
            android.graphics.Rect rect = request == null ? null : (android.graphics.Rect) request.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION);
            android.graphics.Rect rect2 = this.mPendingZoomCropRegion;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.mPendingZoomRatioCompleter.a(null);
            this.mPendingZoomRatioCompleter = null;
            this.mPendingZoomCropRegion = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mPendingZoomCropRegion = null;
        this.mCurrentCropRect = null;
        t2.k kVar = this.mPendingZoomRatioCompleter;
        if (kVar != null) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float f17, t2.k kVar) {
        this.mCurrentCropRect = getCropRectByRatio(getSensorRect(), f17);
        t2.k kVar2 = this.mPendingZoomRatioCompleter;
        if (kVar2 != null) {
            kVar2.b(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomCropRegion = this.mCurrentCropRect;
        this.mPendingZoomRatioCompleter = kVar;
    }
}

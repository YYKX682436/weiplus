package androidx.camera.camera2.internal;

/* loaded from: classes14.dex */
final class AndroidRZoomImpl implements androidx.camera.camera2.internal.ZoomControl.ZoomImpl {
    public static final float DEFAULT_ZOOM_RATIO = 1.0f;
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat mCameraCharacteristics;
    private float mCurrentZoomRatio = 1.0f;
    private float mPendingZoomRatio = 1.0f;
    private t2.k mPendingZoomRatioCompleter;
    private boolean mShouldOverrideZoom;
    private final android.util.Range<java.lang.Float> mZoomRatioRange;

    public AndroidRZoomImpl(androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat cameraCharacteristicsCompat) {
        this.mShouldOverrideZoom = false;
        this.mCameraCharacteristics = cameraCharacteristicsCompat;
        this.mZoomRatioRange = (android.util.Range) cameraCharacteristicsCompat.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.mShouldOverrideZoom = cameraCharacteristicsCompat.isZoomOverrideAvailable();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void addRequestOption(androidx.camera.camera2.impl.Camera2ImplConfig.Builder builder) {
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO;
        java.lang.Float valueOf = java.lang.Float.valueOf(this.mCurrentZoomRatio);
        androidx.camera.core.impl.Config.OptionPriority optionPriority = androidx.camera.core.impl.Config.OptionPriority.REQUIRED;
        builder.setCaptureRequestOptionWithPriority(key, valueOf, optionPriority);
        if (this.mShouldOverrideZoom) {
            androidx.camera.camera2.internal.compat.params.CaptureRequestParameterCompat.setSettingsOverrideZoom(builder, optionPriority);
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public android.graphics.Rect getCropSensorRegion() {
        android.graphics.Rect rect = (android.graphics.Rect) this.mCameraCharacteristics.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMaxZoom() {
        return this.mZoomRatioRange.getUpper().floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public float getMinZoom() {
        return this.mZoomRatioRange.getLower().floatValue();
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void onCaptureResult(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (this.mPendingZoomRatioCompleter != null) {
            android.hardware.camera2.CaptureRequest request = totalCaptureResult.getRequest();
            java.lang.Float f17 = request == null ? null : (java.lang.Float) request.get(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f17 == null) {
                return;
            }
            if (this.mPendingZoomRatio == f17.floatValue()) {
                this.mPendingZoomRatioCompleter.a(null);
                this.mPendingZoomRatioCompleter = null;
            }
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void resetZoom() {
        this.mCurrentZoomRatio = 1.0f;
        t2.k kVar = this.mPendingZoomRatioCompleter;
        if (kVar != null) {
            kVar.b(new androidx.camera.core.CameraControl.OperationCanceledException("Camera is not active."));
            this.mPendingZoomRatioCompleter = null;
        }
    }

    @Override // androidx.camera.camera2.internal.ZoomControl.ZoomImpl
    public void setZoomRatio(float f17, t2.k kVar) {
        this.mCurrentZoomRatio = f17;
        t2.k kVar2 = this.mPendingZoomRatioCompleter;
        if (kVar2 != null) {
            kVar2.b(new androidx.camera.core.CameraControl.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.mPendingZoomRatio = this.mCurrentZoomRatio;
        this.mPendingZoomRatioCompleter = kVar;
    }
}

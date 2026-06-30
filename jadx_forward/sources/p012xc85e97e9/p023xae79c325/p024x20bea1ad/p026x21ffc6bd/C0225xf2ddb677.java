package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.CropRegionZoomImpl */
/* loaded from: classes14.dex */
final class C0225xf2ddb677 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl {

    /* renamed from: MIN_DIGITAL_ZOOM */
    public static final float f400x6059b6a7 = 1.0f;

    /* renamed from: mCameraCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f401x43bc1de6;

    /* renamed from: mCurrentCropRect */
    private android.graphics.Rect f402xd4558900 = null;

    /* renamed from: mPendingZoomCropRegion */
    private android.graphics.Rect f403x30553ce1 = null;

    /* renamed from: mPendingZoomRatioCompleter */
    private t2.k f404xe0e2574b;

    public C0225xf2ddb677(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f401x43bc1de6 = c0322x11ef9595;
    }

    /* renamed from: getCropRectByRatio */
    private static android.graphics.Rect m3376xf2c90c8a(android.graphics.Rect rect, float f17) {
        float width = rect.width() / f17;
        float height = rect.height() / f17;
        float width2 = (rect.width() - width) / 2.0f;
        float height2 = (rect.height() - height) / 2.0f;
        return new android.graphics.Rect((int) width2, (int) height2, (int) (width2 + width), (int) (height2 + height));
    }

    /* renamed from: getSensorRect */
    private android.graphics.Rect m3377x54436cb4() {
        android.graphics.Rect rect = (android.graphics.Rect) this.f401x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: addRequestOption */
    public void mo2894x48d884c3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        android.graphics.Rect rect = this.f402xd4558900;
        if (rect != null) {
            builder.m2893x3c7bf26a(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION, rect, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: getCropSensorRegion */
    public android.graphics.Rect mo2895x29695174() {
        android.graphics.Rect rect = this.f402xd4558900;
        return rect != null ? rect : m3377x54436cb4();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: getMaxZoom */
    public float mo2896x70202721() {
        java.lang.Float f17 = (java.lang.Float) this.f401x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f17 == null) {
            return 1.0f;
        }
        return f17.floatValue() < mo2897x7d3a010f() ? mo2897x7d3a010f() : f17.floatValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: getMinZoom */
    public float mo2897x7d3a010f() {
        return 1.0f;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: onCaptureResult */
    public void mo2898xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (this.f404xe0e2574b != null) {
            android.hardware.camera2.CaptureRequest request = totalCaptureResult.getRequest();
            android.graphics.Rect rect = request == null ? null : (android.graphics.Rect) request.get(android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION);
            android.graphics.Rect rect2 = this.f403x30553ce1;
            if (rect2 == null || !rect2.equals(rect)) {
                return;
            }
            this.f404xe0e2574b.a(null);
            this.f404xe0e2574b = null;
            this.f403x30553ce1 = null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: resetZoom */
    public void mo2899x78a375c2() {
        this.f403x30553ce1 = null;
        this.f402xd4558900 = null;
        t2.k kVar = this.f404xe0e2574b;
        if (kVar != null) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
            this.f404xe0e2574b = null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: setZoomRatio */
    public void mo2900xbd85d9b6(float f17, t2.k kVar) {
        this.f402xd4558900 = m3376xf2c90c8a(m3377x54436cb4(), f17);
        t2.k kVar2 = this.f404xe0e2574b;
        if (kVar2 != null) {
            kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f403x30553ce1 = this.f402xd4558900;
        this.f404xe0e2574b = kVar;
    }
}

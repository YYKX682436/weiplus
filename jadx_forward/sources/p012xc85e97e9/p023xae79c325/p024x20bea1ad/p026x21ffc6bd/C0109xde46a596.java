package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.AndroidRZoomImpl */
/* loaded from: classes14.dex */
final class C0109xde46a596 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl {

    /* renamed from: DEFAULT_ZOOM_RATIO */
    public static final float f115x493f715d = 1.0f;

    /* renamed from: mCameraCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f116x43bc1de6;

    /* renamed from: mCurrentZoomRatio */
    private float f117xcbbded0c = 1.0f;

    /* renamed from: mPendingZoomRatio */
    private float f118xc6d9e2ae = 1.0f;

    /* renamed from: mPendingZoomRatioCompleter */
    private t2.k f119xe0e2574b;

    /* renamed from: mShouldOverrideZoom */
    private boolean f120x73e2be5f;

    /* renamed from: mZoomRatioRange */
    private final android.util.Range<java.lang.Float> f121xc4a1e5f2;

    public C0109xde46a596(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        this.f120x73e2be5f = false;
        this.f116x43bc1de6 = c0322x11ef9595;
        this.f121xc4a1e5f2 = (android.util.Range) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE);
        this.f120x73e2be5f = c0322x11ef9595.m3735xb28ff1c0();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: addRequestOption */
    public void mo2894x48d884c3(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder) {
        android.hardware.camera2.CaptureRequest.Key key = android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO;
        java.lang.Float valueOf = java.lang.Float.valueOf(this.f117xcbbded0c);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED;
        builder.m2893x3c7bf26a(key, valueOf, optionPriority);
        if (this.f120x73e2be5f) {
            p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0343xf076b0c2.m3794x2d13cd04(builder, optionPriority);
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: getCropSensorRegion */
    public android.graphics.Rect mo2895x29695174() {
        android.graphics.Rect rect = (android.graphics.Rect) this.f116x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        rect.getClass();
        return rect;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: getMaxZoom */
    public float mo2896x70202721() {
        return this.f121xc4a1e5f2.getUpper().floatValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: getMinZoom */
    public float mo2897x7d3a010f() {
        return this.f121xc4a1e5f2.getLower().floatValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: onCaptureResult */
    public void mo2898xa5745364(android.hardware.camera2.TotalCaptureResult totalCaptureResult) {
        if (this.f119xe0e2574b != null) {
            android.hardware.camera2.CaptureRequest request = totalCaptureResult.getRequest();
            java.lang.Float f17 = request == null ? null : (java.lang.Float) request.get(android.hardware.camera2.CaptureRequest.CONTROL_ZOOM_RATIO);
            if (f17 == null) {
                return;
            }
            if (this.f118xc6d9e2ae == f17.floatValue()) {
                this.f119xe0e2574b.a(null);
                this.f119xe0e2574b = null;
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: resetZoom */
    public void mo2899x78a375c2() {
        this.f117xcbbded0c = 1.0f;
        t2.k kVar = this.f119xe0e2574b;
        if (kVar != null) {
            kVar.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("Camera is not active."));
            this.f119xe0e2574b = null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0287x64bb1dea.ZoomImpl
    /* renamed from: setZoomRatio */
    public void mo2900xbd85d9b6(float f17, t2.k kVar) {
        this.f117xcbbded0c = f17;
        t2.k kVar2 = this.f119xe0e2574b;
        if (kVar2 != null) {
            kVar2.b(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658.OperationCanceledException("There is a new zoomRatio being set"));
        }
        this.f118xc6d9e2ae = this.f117xcbbded0c;
        this.f119xe0e2574b = kVar;
    }
}

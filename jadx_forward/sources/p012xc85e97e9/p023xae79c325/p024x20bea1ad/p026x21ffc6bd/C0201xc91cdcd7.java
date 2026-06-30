package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2PhysicalCameraInfoImpl */
/* loaded from: classes14.dex */
public class C0201xc91cdcd7 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 {

    /* renamed from: mCamera2CameraInfo */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0 f339xd9f61213 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0(this);

    /* renamed from: mCameraCharacteristicsCompat */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f340x9aefb908;

    /* renamed from: mCameraId */
    private final java.lang.String f341x1c133ead;

    public C0201xc91cdcd7(java.lang.String str, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0332x1ad8324a c0332x1ad8324a) {
        this.f341x1c133ead = str;
        this.f340x9aefb908 = c0332x1ad8324a.m3757xc2a5207f(str);
    }

    /* renamed from: getCamera2CameraInfo */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p033x74b5abbd.C0446x27d8cae0 m3279x9049124a() {
        return this.f339xd9f61213;
    }

    /* renamed from: getCameraCharacteristicsCompat */
    public p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 m3280xc2a5207f() {
        return this.f340x9aefb908;
    }

    /* renamed from: getCameraId */
    public java.lang.String m3281x72efd496() {
        return this.f341x1c133ead;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getCameraSelector */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 mo3282xed62f31a() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getCameraState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3163x53e98736() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getExposureState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa mo3165xd68c2014() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getImplementationType */
    public java.lang.String mo3166xb8d8e802() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getIntrinsicZoomRatio */
    public float mo3167x8e79fe69() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getLensFacing */
    public int mo3168x5f62de6e() {
        java.lang.Integer num = (java.lang.Integer) this.f340x9aefb908.get(android.hardware.camera2.CameraCharacteristics.LENS_FACING);
        m3.h.b(num != null, "Unable to get the lens facing of the camera.");
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0252xf2a95aba.m3480x37bd5d32(num.intValue());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getPhysicalCameraInfos */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo3170x521734d3() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    /* renamed from: getSensorOrientation */
    public int m3283x86811900() {
        java.lang.Integer num = (java.lang.Integer) this.f340x9aefb908.get(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
        num.getClass();
        return num.intValue();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSensorRotationDegrees */
    public int mo3172x3b4734f9() {
        return mo3173x3b4734f9(0);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSupportedFrameRateRanges */
    public java.util.Set<android.util.Range<java.lang.Integer>> mo3175x2d0d240b() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getTorchState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3181x56c2d5eb() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getZoomState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3182x61488dc8() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: hasFlashUnit */
    public boolean mo3183x7ae1a01a() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isFocusMeteringSupported */
    public boolean mo3184xfda814c7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isLogicalMultiCameraSupported */
    public boolean mo3185x2594f6af() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isPrivateReprocessingSupported */
    public boolean mo3187x90c5da4f() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isZslSupported */
    public boolean mo3189xe543bbe5() {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: querySupportedDynamicRanges */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3191x9cf834cf(java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> set) {
        throw new java.lang.UnsupportedOperationException("Physical camera doesn't support this function");
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getSensorRotationDegrees */
    public int mo3173x3b4734f9(int i17) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5807x61e284d7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(i17), m3283x86811900(), 1 == mo3168x5f62de6e());
    }
}

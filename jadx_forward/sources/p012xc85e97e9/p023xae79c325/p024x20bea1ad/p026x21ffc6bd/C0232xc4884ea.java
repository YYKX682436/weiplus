package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.ExposureStateImpl */
/* loaded from: classes14.dex */
class C0232xc4884ea implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa {

    /* renamed from: mCameraCharacteristics */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 f424x43bc1de6;

    /* renamed from: mExposureCompensation */
    private int f425x35c71f0e;

    /* renamed from: mLock */
    private final java.lang.Object f426x6243b38 = new java.lang.Object();

    public C0232xc4884ea(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595, int i17) {
        this.f424x43bc1de6 = c0322x11ef9595;
        this.f425x35c71f0e = i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
    /* renamed from: getExposureCompensationIndex */
    public int mo3407xdef72b9b() {
        int i17;
        synchronized (this.f426x6243b38) {
            i17 = this.f425x35c71f0e;
        }
        return i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
    /* renamed from: getExposureCompensationRange */
    public android.util.Range<java.lang.Integer> mo3408xdf703c06() {
        return (android.util.Range) this.f424x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
    /* renamed from: getExposureCompensationStep */
    public android.util.Rational mo3409x17ba06e3() {
        return !mo3410xa89a0da3() ? android.util.Rational.ZERO : (android.util.Rational) this.f424x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
    /* renamed from: isExposureCompensationSupported */
    public boolean mo3410xa89a0da3() {
        android.util.Range range = (android.util.Range) this.f424x43bc1de6.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE);
        return (range == null || ((java.lang.Integer) range.getLower()).intValue() == 0 || ((java.lang.Integer) range.getUpper()).intValue() == 0) ? false : true;
    }

    /* renamed from: setExposureCompensationIndex */
    public void m3411x28c3840f(int i17) {
        synchronized (this.f426x6243b38) {
            this.f425x35c71f0e = i17;
        }
    }
}

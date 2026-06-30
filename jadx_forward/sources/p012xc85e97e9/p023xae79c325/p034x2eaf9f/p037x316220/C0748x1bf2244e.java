package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.RestrictedCameraInfo */
/* loaded from: classes14.dex */
public class C0748x1bf2244e extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70 {

    /* renamed from: CAMERA_OPERATION_AE_REGION */
    public static final int f1731x2658d25d = 3;

    /* renamed from: CAMERA_OPERATION_AF_REGION */
    public static final int f1732x8e39ff3c = 2;

    /* renamed from: CAMERA_OPERATION_AUTO_FOCUS */
    public static final int f1733xfffb40fa = 1;

    /* renamed from: CAMERA_OPERATION_AWB_REGION */
    public static final int f1734x12d20699 = 4;

    /* renamed from: CAMERA_OPERATION_EXPOSURE_COMPENSATION */
    public static final int f1735xecc0ea80 = 7;

    /* renamed from: CAMERA_OPERATION_EXTENSION_STRENGTH */
    public static final int f1736x55c7133 = 8;

    /* renamed from: CAMERA_OPERATION_FLASH */
    public static final int f1737xca1511be = 5;

    /* renamed from: CAMERA_OPERATION_TORCH */
    public static final int f1738xcadbf5ca = 6;

    /* renamed from: CAMERA_OPERATION_ZOOM */
    public static final int f1739x92f10c25 = 0;

    /* renamed from: mCameraConfig */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 f1740x445b9bd4;

    /* renamed from: mCameraInfo */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 f1741x643e79c0;

    /* renamed from: mIsCaptureProcessProgressSupported */
    private boolean f1742x14170241;

    /* renamed from: mIsPostviewSupported */
    private boolean f1743x274f4932;

    /* renamed from: mSessionProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc f1744x6e733d29;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: androidx.camera.core.impl.RestrictedCameraInfo$CameraOperation */
    /* loaded from: classes6.dex */
    public @interface CameraOperation {
    }

    public C0748x1bf2244e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 interfaceC0665xb691d6e7) {
        super(interfaceC0675x66574570);
        this.f1743x274f4932 = false;
        this.f1742x14170241 = false;
        this.f1741x643e79c0 = interfaceC0675x66574570;
        this.f1740x445b9bd4 = interfaceC0665xb691d6e7;
        this.f1744x6e733d29 = interfaceC0665xb691d6e7.m5260xf033da12(null);
        m5584xd84ee2a7(interfaceC0665xb691d6e7.m5264x3cb33adf());
        m5583xce9e6af6(interfaceC0665xb691d6e7.m5263xc888012e());
    }

    /* renamed from: getCameraConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 m5581xdb9153d() {
        return this.f1740x445b9bd4;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getExposureState */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa mo3165xd68c2014() {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1744x6e733d29, 7) ? new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa() { // from class: androidx.camera.core.impl.RestrictedCameraInfo.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
            /* renamed from: getExposureCompensationIndex */
            public int mo3407xdef72b9b() {
                return 0;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
            /* renamed from: getExposureCompensationRange */
            public android.util.Range<java.lang.Integer> mo3408xdf703c06() {
                return new android.util.Range<>(0, 0);
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
            /* renamed from: getExposureCompensationStep */
            public android.util.Rational mo3409x17ba06e3() {
                return android.util.Rational.ZERO;
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0500x48cb93aa
            /* renamed from: isExposureCompensationSupported */
            public boolean mo3410xa89a0da3() {
                return false;
            }
        } : this.f1741x643e79c0.mo3165xd68c2014();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: getImplementation */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo5286x52ed78a8() {
        return this.f1741x643e79c0;
    }

    /* renamed from: getSessionProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc m5582xf033da12() {
        return this.f1744x6e733d29;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getTorchState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3181x56c2d5eb() {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1744x6e733d29, 6) ? new p012xc85e97e9.p093xedfae76a.j0(0) : this.f1741x643e79c0.mo3181x56c2d5eb();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getZoomState */
    public p012xc85e97e9.p093xedfae76a.g0 mo3182x61488dc8() {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1744x6e733d29, 0) ? new p012xc85e97e9.p093xedfae76a.j0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.AbstractC0834x3738713c.m6099xaf65a0fc(1.0f, 1.0f, 1.0f, 0.0f)) : this.f1741x643e79c0.mo3182x61488dc8();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: hasFlashUnit */
    public boolean mo3183x7ae1a01a() {
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1744x6e733d29, 5)) {
            return this.f1741x643e79c0.mo3183x7ae1a01a();
        }
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: isCaptureProcessProgressSupported */
    public boolean mo5287xc888012e() {
        return this.f1742x14170241;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0710x4aa00c70, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: isFocusMeteringSupported */
    public boolean mo3184xfda814c7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 m5933x46a35f88 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5933x46a35f88(this.f1744x6e733d29, c0502x5ba1de27);
        if (m5933x46a35f88 == null) {
            return false;
        }
        return this.f1741x643e79c0.mo3184xfda814c7(m5933x46a35f88);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570
    /* renamed from: isPostviewSupported */
    public boolean mo5288x3cb33adf() {
        return this.f1743x274f4932;
    }

    /* renamed from: setCaptureProcessProgressSupported */
    public void m5583xce9e6af6(boolean z17) {
        this.f1742x14170241 = z17;
    }

    /* renamed from: setPostviewSupported */
    public void m5584xd84ee2a7(boolean z17) {
        this.f1743x274f4932 = z17;
    }
}

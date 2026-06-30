package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.CameraCaptureResultImageInfo */
/* loaded from: classes14.dex */
public final class C0830x9b01aa8b implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 {

    /* renamed from: mCameraCaptureResult */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be f2056x8069ee31;

    public C0830x9b01aa8b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be) {
        this.f2056x8069ee31 = interfaceC0663xe081a7be;
    }

    /* renamed from: getCameraCaptureResult */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be m6049xedfdbca8() {
        return this.f2056x8069ee31;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getRotationDegrees */
    public int mo4209x2a7ffb93() {
        return 0;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getSensorToBufferTransformMatrix */
    public android.graphics.Matrix mo4210xa4435162() {
        return new android.graphics.Matrix();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getTagBundle */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c mo4211x4aa7b206() {
        return this.f2056x8069ee31.mo2935x4aa7b206();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getTimestamp */
    public long mo4212x2b69a60() {
        return this.f2056x8069ee31.mo2936x2b69a60();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: populateExifData */
    public void mo4612xd74657e4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder builder) {
        this.f2056x8069ee31.mo2937xd74657e4(builder);
    }
}

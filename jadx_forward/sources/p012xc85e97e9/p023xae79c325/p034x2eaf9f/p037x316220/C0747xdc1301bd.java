package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.RestrictedCameraControl */
/* loaded from: classes14.dex */
public class C0747xdc1301bd extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b {

    /* renamed from: mCameraControl */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 f1729x471e5f0b;

    /* renamed from: mSessionProcessor */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc f1730x6e733d29;

    public C0747xdc1301bd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 interfaceC0669xec29d935, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc interfaceC0752x161fb6bc) {
        super(interfaceC0669xec29d935);
        this.f1729x471e5f0b = interfaceC0669xec29d935;
        this.f1730x6e733d29 = interfaceC0752x161fb6bc;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: cancelFocusAndMetering */
    public wa.a mo2958x7e6e0552() {
        return this.f1729x471e5f0b.mo2958x7e6e0552();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: enableTorch */
    public wa.a mo2962xaa38b839(boolean z17) {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1730x6e733d29, 6) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("Torch is not supported")) : this.f1729x471e5f0b.mo2962xaa38b839(z17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935
    /* renamed from: getImplementation */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0669xec29d935 mo5278x52ed78a8() {
        return this.f1729x471e5f0b;
    }

    /* renamed from: getSessionProcessor */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc m5580xf033da12() {
        return this.f1730x6e733d29;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: setExposureCompensationIndex */
    public wa.a mo2994x28c3840f(int i17) {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1730x6e733d29, 7) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("ExposureCompensation is not supported")) : this.f1729x471e5f0b.mo2994x28c3840f(i17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: setLinearZoom */
    public wa.a mo2996x2900129a(float f17) {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1730x6e733d29, 0) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("Zoom is not supported")) : this.f1729x471e5f0b.mo2996x2900129a(f17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: setZoomRatio */
    public wa.a mo3000xbd85d9b6(float f17) {
        return !p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5934x27c3d5d1(this.f1730x6e733d29, 0) ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("Zoom is not supported")) : this.f1729x471e5f0b.mo3000xbd85d9b6(f17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0709xfbcb8e5b, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658
    /* renamed from: startFocusAndMetering */
    public wa.a mo3002xaea5cb3a(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 m5933x46a35f88 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0797xfdd65cde.m5933x46a35f88(this.f1730x6e733d29, c0502x5ba1de27);
        return m5933x46a35f88 == null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalStateException("FocusMetering is not supported")) : this.f1729x471e5f0b.mo3002xaea5cb3a(m5933x46a35f88);
    }
}

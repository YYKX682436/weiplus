package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.ImageCaptureOptionUnpacker */
/* loaded from: classes14.dex */
final class C0251x53a5865f extends p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0164x656bcd4d {

    /* renamed from: INSTANCE */
    static final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0251x53a5865f f456x4fbc8495 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0251x53a5865f(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0417x16d56175());

    /* renamed from: mImageCapturePixelHDRPlus */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0417x16d56175 f457x5f662ae2;

    private C0251x53a5865f(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p031xe2513c1e.C0417x16d56175 c0417x16d56175) {
        this.f457x5f662ae2 = c0417x16d56175;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0164x656bcd4d, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.OptionUnpacker
    /* renamed from: unpack */
    public void mo3201xcde97c32(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59<?> interfaceC0768x83509b59, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder) {
        super.mo3201xcde97c32(interfaceC0768x83509b59, builder);
        if (!(interfaceC0768x83509b59 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad)) {
            throw new java.lang.IllegalArgumentException("config is not ImageCaptureConfig");
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad c0713xaaf0b8ad = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad) interfaceC0768x83509b59;
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder builder2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p025x316220.C0108x2f5802ef.Builder();
        if (c0713xaaf0b8ad.m5469x3a9b30f()) {
            this.f457x5f662ae2.m4082x7d1f5bbc(c0713xaaf0b8ad.m5455xe389a8d3(), builder2);
        }
        builder.m5347x2f697c6b(builder2.mo2888x59bc66e());
    }
}

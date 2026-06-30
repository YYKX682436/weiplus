package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd;

/* renamed from: androidx.camera.camera2.internal.Camera2UseCaseConfigFactory */
/* loaded from: classes14.dex */
public final class C0204x99a7587e implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771 {

    /* renamed from: mDisplayInfoManager */
    final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d f352xee58804a;

    public C0204x99a7587e(android.content.Context context) {
        this.f352xee58804a = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0226x5ccce11d.m3381x9cf0d20b(context);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771
    /* renamed from: getConfig */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3297x1456a638(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType captureType, int i17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5524xaf65a0fc = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0750xb915958.Builder();
        builder.m5631x5d0f9056(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0276xb19b2116.m3631xeb8ca9b6(captureType, i17));
        m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1831x26a4ea13, builder.m5619x59bc66e());
        m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1834x50776329, p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0203x2dfa7c9d.f351x4fbc8495);
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder builder2 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0690x88f65a08.Builder();
        builder2.m5366x5d0f9056(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0276xb19b2116.m3630x73862266(captureType, i17));
        m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1830x55dfff63, builder2.m5350x59bc66e());
        m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1828x70d747d9, captureType == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.IMAGE_CAPTURE ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0251x53a5865f.f456x4fbc8495 : p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.C0164x656bcd4d.f284x4fbc8495);
        if (captureType == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.PREVIEW) {
            m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1692xe906b791, this.f352xee58804a.m3385x8cdf5ab3());
        }
        m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1698xe496c6a2, java.lang.Integer.valueOf(this.f352xee58804a.m3384xf8884673(true).getRotation()));
        if (captureType == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.VIDEO_CAPTURE || captureType == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType.STREAM_SHARING) {
            m5524xaf65a0fc.mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.f1838x83019c92, java.lang.Boolean.TRUE);
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(m5524xaf65a0fc);
    }
}

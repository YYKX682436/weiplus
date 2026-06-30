package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd;

/* renamed from: androidx.camera.extensions.internal.ImageCaptureConfigProvider */
/* loaded from: classes14.dex */
public class C0995xe5f625be implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad> {

    /* renamed from: mVendorExtender */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf f2434x3dedb87c;

    public C0995xe5f625be(p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf) {
        this.f2434x3dedb87c = interfaceC0999xfb817acf;
    }

    /* renamed from: updateBuilderConfig */
    public void m6707xddbc4474(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder builder, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf) {
        builder.mo4466x9b56433b(interfaceC0999xfb817acf.mo6666x801660f8());
        builder.mo4456xcfdff38c(true);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0693xcbf65773
    /* renamed from: getConfig, reason: avoid collision after fix types in other method */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0713xaaf0b8ad mo4473x1456a638() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0517x4e63dd8b.Builder();
        m6707xddbc4474(builder, this.f2434x3dedb87c);
        return builder.mo4446x111127c3();
    }
}

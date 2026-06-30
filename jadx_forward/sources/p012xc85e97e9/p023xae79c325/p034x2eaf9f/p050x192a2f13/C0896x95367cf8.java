package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p050x192a2f13;

/* renamed from: androidx.camera.core.processing.ImageProcessorRequest */
/* loaded from: classes14.dex */
public class C0896x95367cf8 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Request {

    /* renamed from: mImageProxy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 f2157x855eca20;

    /* renamed from: mOutputFormat */
    private final int f2158x795a9165;

    public C0896x95367cf8(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, int i17) {
        this.f2157x855eca20 = interfaceC0536x1ffeadf3;
        this.f2158x795a9165 = i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Request
    /* renamed from: getInputImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4642x3fae67a7() {
        return this.f2157x855eca20;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0535x5f86e597.Request
    /* renamed from: getOutputFormat */
    public int mo4643x42b80ace() {
        return this.f2158x795a9165;
    }
}

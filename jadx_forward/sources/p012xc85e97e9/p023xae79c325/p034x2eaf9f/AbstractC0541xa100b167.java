package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.ImmutableImageInfo */
/* loaded from: classes14.dex */
public abstract class AbstractC0541xa100b167 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 {
    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 m4658xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c c0760xc2ac609c, long j17, int i17, android.graphics.Matrix matrix) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0459x1c431fe4(c0760xc2ac609c, j17, i17, matrix);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getRotationDegrees */
    public abstract int mo4209x2a7ffb93();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getSensorToBufferTransformMatrix */
    public abstract android.graphics.Matrix mo4210xa4435162();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getTagBundle */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0760xc2ac609c mo4211x4aa7b206();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: getTimestamp */
    public abstract long mo4212x2b69a60();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89
    /* renamed from: populateExifData */
    public void mo4612xd74657e4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0787x848778fa.Builder builder) {
        builder.m5906x2a5dc739(mo4209x2a7ffb93());
    }
}

package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.SingleImageProxyBundle */
/* loaded from: classes14.dex */
public final class C0754xbd16e8bd implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0718xed574855 {

    /* renamed from: mCaptureId */
    private final int f1778x1ed26114;

    /* renamed from: mImageProxy */
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 f1779x855eca20;

    public C0754xbd16e8bd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, java.lang.String str) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0531x43157c89 mo4173xcb10cdf3 = interfaceC0536x1ffeadf3.mo4173xcb10cdf3();
        if (mo4173xcb10cdf3 != null) {
            java.lang.Integer num = (java.lang.Integer) mo4173xcb10cdf3.mo4211x4aa7b206().m5703xb5887064(str);
            if (num != null) {
                this.f1778x1ed26114 = num.intValue();
                this.f1779x855eca20 = interfaceC0536x1ffeadf3;
                return;
            }
            throw new java.lang.IllegalArgumentException("ImageProxy has no associated tag");
        }
        throw new java.lang.IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    /* renamed from: close */
    public void m5662x5a5ddf8() {
        this.f1779x855eca20.close();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0718xed574855
    /* renamed from: getCaptureIds */
    public java.util.List<java.lang.Integer> mo5497xcd888188() {
        return java.util.Collections.singletonList(java.lang.Integer.valueOf(this.f1778x1ed26114));
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0718xed574855
    /* renamed from: getImageProxy */
    public wa.a mo5498x976d89c9(int i17) {
        return i17 != this.f1778x1ed26114 ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6011xd75b36b1(new java.lang.IllegalArgumentException("Capture id does not exist in the bundle")) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6013x95a8e8d4(this.f1779x855eca20);
    }

    public C0754xbd16e8bd(p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3, int i17) {
        this.f1778x1ed26114 = i17;
        this.f1779x855eca20 = interfaceC0536x1ffeadf3;
    }
}

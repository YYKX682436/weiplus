package p012xc85e97e9.p023xae79c325.p055x94266c14;

/* renamed from: androidx.camera.extensions.ExtensionCameraFilter */
/* loaded from: classes14.dex */
final class C0976xb72e24bc implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d {
    private final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 mId;

    /* renamed from: mVendorExtender */
    private final p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf f2379x3dedb87c;

    public C0976xb72e24bc(java.lang.String str, p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.InterfaceC0999xfb817acf interfaceC0999xfb817acf) {
        this.mId = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9.m5439xaf65a0fc(str);
        this.f2379x3dedb87c = interfaceC0999xfb817acf;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d
    /* renamed from: filter */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo4272xb408cb78(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 : list) {
            m3.h.b(interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570, "The camera info doesn't contain internal implementation.");
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 interfaceC0675x66574570 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93;
            if (this.f2379x3dedb87c.mo6674x5f77814(interfaceC0675x66574570.mo3161x72efd496(), p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.C0993x4a94d8dd.m6705xc80a217f(interfaceC0675x66574570))) {
                arrayList.add(interfaceC0472xfede5d93);
            }
        }
        return arrayList;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d
    /* renamed from: getIdentifier */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0711x165a88c9 mo4273x8dc9649f() {
        return this.mId;
    }
}

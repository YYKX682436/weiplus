package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.camera.core.ImageAnalysisBlockingAnalyzer */
/* loaded from: classes14.dex */
public final class C0513xbb04f352 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f {
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f
    /* renamed from: acquireImage */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 mo4482xf0e56e25(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0719xa3f4ef30 interfaceC0719xa3f4ef30) {
        return interfaceC0719xa3f4ef30.mo4184x825b5df2();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f
    /* renamed from: clearCache */
    public void mo4485xd2bef135() {
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0510x4c133a3f
    /* renamed from: onValidImageAvailable */
    public void mo4487xab9c626b(final p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0536x1ffeadf3 interfaceC0536x1ffeadf3) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.C0815x4534c2f0.m6007xbba9cc06(m4483xfecb6f(interfaceC0536x1ffeadf3), new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48<java.lang.Void>() { // from class: androidx.camera.core.ImageAnalysisBlockingAnalyzer.1
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onFailure */
            public void mo3120xee232ab(java.lang.Throwable th6) {
                interfaceC0536x1ffeadf3.close();
            }

            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p044xe1fc2b10.InterfaceC0813x8ed66b48
            /* renamed from: onSuccess, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public void mo3121xe05b4124(java.lang.Void r17) {
            }
        }, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.p043x79c5f8d3.C0804x61de418d.m5978x5ebfffdc());
    }
}

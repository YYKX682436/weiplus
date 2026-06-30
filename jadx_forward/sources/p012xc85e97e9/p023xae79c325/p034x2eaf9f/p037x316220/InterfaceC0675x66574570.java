package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.CameraInfoInternal */
/* loaded from: classes14.dex */
public interface InterfaceC0675x66574570 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getCameraSelector$0 */
    /* synthetic */ default java.util.List m5285x970968c9(java.util.List list) {
        java.lang.String mo3161x72efd496 = mo3161x72efd496();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93) it.next();
            m3.h.a(interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570);
            if (((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570) interfaceC0472xfede5d93).mo3161x72efd496().equals(mo3161x72efd496)) {
                return java.util.Collections.singletonList(interfaceC0472xfede5d93);
            }
        }
        throw new java.lang.IllegalStateException("Unable to find camera with id " + mo3161x72efd496 + " from list of available cameras.");
    }

    /* renamed from: addSessionCaptureCallback */
    void mo3156x4c7d2236(java.util.concurrent.Executor executor, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6);

    /* renamed from: getCameraCharacteristics */
    java.lang.Object mo3158x9b962a9d();

    /* renamed from: getCameraId */
    java.lang.String mo3161x72efd496();

    /* renamed from: getCameraQuirks */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0744x90dabc95 mo3162x25ef6270();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93
    /* renamed from: getCameraSelector */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244 mo3282xed62f31a() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0475xc311f244.Builder().m4286x2d4fae3e(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d() { // from class: androidx.camera.core.impl.CameraInfoInternal$$a
            @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d
            /* renamed from: filter */
            public final java.util.List mo4272xb408cb78(java.util.List list) {
                java.util.List m5285x970968c9;
                m5285x970968c9 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570.this.m5285x970968c9(list);
                return m5285x970968c9;
            }
        }).m4286x2d4fae3e(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0721xf927fdb5(mo3168x5f62de6e())).m4287x59bc66e();
    }

    /* renamed from: getEncoderProfilesProvider */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0706x20a07517 mo3164x36d40501();

    /* renamed from: getImplementation */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570 mo5286x52ed78a8() {
        return this;
    }

    /* renamed from: getPhysicalCameraCharacteristics */
    java.lang.Object mo3169x89bd6c06(java.lang.String str);

    /* renamed from: getSupportedDynamicRanges */
    java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3174x41312cdd();

    /* renamed from: getSupportedHighResolutions */
    java.util.List<android.util.Size> mo3177x8984b12d(int i17);

    /* renamed from: getSupportedOutputFormats */
    java.util.Set<java.lang.Integer> mo3178x7cdcf003();

    /* renamed from: getSupportedResolutions */
    java.util.List<android.util.Size> mo3179x2103142f(int i17);

    /* renamed from: getTimebase */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.EnumC0761x880e8f3e mo3180xe6894();

    /* renamed from: isCaptureProcessProgressSupported */
    default boolean mo5287xc888012e() {
        return false;
    }

    /* renamed from: isPostviewSupported */
    default boolean mo5288x3cb33adf() {
        return false;
    }

    /* renamed from: isPreviewStabilizationSupported */
    boolean mo3186x3e16b66d();

    /* renamed from: isVideoStabilizationSupported */
    boolean mo3188xfc625460();

    /* renamed from: removeSessionCaptureCallback */
    void mo3192x2d0845d9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0659xd0769ba6 abstractC0659xd0769ba6);
}

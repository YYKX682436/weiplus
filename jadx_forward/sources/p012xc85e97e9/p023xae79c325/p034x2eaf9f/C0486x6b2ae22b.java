package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.CaptureBundles */
/* loaded from: classes13.dex */
public final class C0486x6b2ae22b {

    /* renamed from: androidx.camera.core.CaptureBundles$CaptureBundleImpl */
    /* loaded from: classes13.dex */
    public static final class CaptureBundleImpl implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 {

        /* renamed from: mCaptureStageList */
        final java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> f926x69f82aa3;

        public CaptureBundleImpl(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> list) {
            if (list == null || list.isEmpty()) {
                throw new java.lang.IllegalArgumentException("Cannot set an empty CaptureStage list.");
            }
            this.f926x69f82aa3 = java.util.Collections.unmodifiableList(new java.util.ArrayList(list));
        }

        @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748
        /* renamed from: getCaptureStages */
        public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> mo4360x32450065() {
            return this.f926x69f82aa3;
        }
    }

    private C0486x6b2ae22b() {
    }

    /* renamed from: createCaptureBundle */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m4358xb8a6dfcc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78... interfaceC0691x36dafb78Arr) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0486x6b2ae22b.CaptureBundleImpl(java.util.Arrays.asList(interfaceC0691x36dafb78Arr));
    }

    /* renamed from: singleDefaultCaptureBundle */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m4359x55d6e70f() {
        return m4358xb8a6dfcc(new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78.DefaultCaptureStage());
    }

    /* renamed from: createCaptureBundle */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0689x87960748 m4357xb8a6dfcc(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0691x36dafb78> list) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0486x6b2ae22b.CaptureBundleImpl(list);
    }
}

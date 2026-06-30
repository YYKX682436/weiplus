package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.DynamicRangesCompatBaseImpl */
/* loaded from: classes14.dex */
class C0347xbadef568 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl {

    /* renamed from: COMPAT_INSTANCE */
    static final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 f651xa816e0b2 = new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0347xbadef568());

    /* renamed from: SDR_ONLY */
    private static final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> f652x4c767d0a = java.util.Collections.singleton(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR);

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: getDynamicRangeCaptureRequestConstraints */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3804x5b8d41b9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        m3.h.b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR.m4384xb2c87fbf(c0491x2bb48c5e), "DynamicRange is not supported: " + c0491x2bb48c5e);
        return f652x4c767d0a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: getSupportedDynamicRanges */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3805x41312cdd() {
        return f652x4c767d0a;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: isExtraLatencyPresent */
    public boolean mo3806x37b99483(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        m3.h.b(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.SDR.m4384xb2c87fbf(c0491x2bb48c5e), "DynamicRange is not supported: " + c0491x2bb48c5e);
        return false;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: unwrap */
    public android.hardware.camera2.params.DynamicRangeProfiles mo3807xcdecea63() {
        return null;
    }
}

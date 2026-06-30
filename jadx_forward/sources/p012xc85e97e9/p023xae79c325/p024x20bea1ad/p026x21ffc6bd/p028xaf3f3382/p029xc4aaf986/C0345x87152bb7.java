package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.DynamicRangesCompat */
/* loaded from: classes14.dex */
public final class C0345x87152bb7 {

    /* renamed from: mImpl */
    private final p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl f649x622d82d;

    /* renamed from: androidx.camera.camera2.internal.compat.params.DynamicRangesCompat$DynamicRangeProfilesCompatImpl */
    /* loaded from: classes14.dex */
    public interface DynamicRangeProfilesCompatImpl {
        /* renamed from: getDynamicRangeCaptureRequestConstraints */
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3804x5b8d41b9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e);

        /* renamed from: getSupportedDynamicRanges */
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3805x41312cdd();

        /* renamed from: isExtraLatencyPresent */
        boolean mo3806x37b99483(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e);

        /* renamed from: unwrap */
        android.hardware.camera2.params.DynamicRangeProfiles mo3807xcdecea63();
    }

    public C0345x87152bb7(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl dynamicRangeProfilesCompatImpl) {
        this.f649x622d82d = dynamicRangeProfilesCompatImpl;
    }

    /* renamed from: fromCameraCharacteristics */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 m3798x532ddec9(p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0322x11ef9595 c0322x11ef9595) {
        p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 m3799xab905d5c = android.os.Build.VERSION.SDK_INT >= 33 ? m3799xab905d5c((android.hardware.camera2.params.DynamicRangeProfiles) c0322x11ef9595.get(android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES)) : null;
        return m3799xab905d5c == null ? p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0347xbadef568.f651xa816e0b2 : m3799xab905d5c;
    }

    /* renamed from: toDynamicRangesCompat */
    public static p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7 m3799xab905d5c(android.hardware.camera2.params.DynamicRangeProfiles dynamicRangeProfiles) {
        if (dynamicRangeProfiles == null) {
            return null;
        }
        m3.h.e(android.os.Build.VERSION.SDK_INT >= 33, "DynamicRangeProfiles can only be converted to DynamicRangesCompat on API 33 or higher.");
        return new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7(new p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0346xbb55dd43(dynamicRangeProfiles));
    }

    /* renamed from: getDynamicRangeCaptureRequestConstraints */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3800x5b8d41b9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return this.f649x622d82d.mo3804x5b8d41b9(c0491x2bb48c5e);
    }

    /* renamed from: getSupportedDynamicRanges */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3801x41312cdd() {
        return this.f649x622d82d.mo3805x41312cdd();
    }

    /* renamed from: isExtraLatencyPresent */
    public boolean m3802x37b99483(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return this.f649x622d82d.mo3806x37b99483(c0491x2bb48c5e);
    }

    /* renamed from: toDynamicRangeProfiles */
    public android.hardware.camera2.params.DynamicRangeProfiles m3803x48916163() {
        m3.h.e(android.os.Build.VERSION.SDK_INT >= 33, "DynamicRangesCompat can only be converted to DynamicRangeProfiles on API 33 or higher.");
        return this.f649x622d82d.mo3807xcdecea63();
    }
}

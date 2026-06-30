package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986;

/* renamed from: androidx.camera.camera2.internal.compat.params.DynamicRangesCompatApi33Impl */
/* loaded from: classes14.dex */
class C0346xbb55dd43 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl {

    /* renamed from: mDynamicRangeProfiles */
    private final android.hardware.camera2.params.DynamicRangeProfiles f650x3ac6e655;

    public C0346xbb55dd43(java.lang.Object obj) {
        this.f650x3ac6e655 = (android.hardware.camera2.params.DynamicRangeProfiles) obj;
    }

    /* renamed from: dynamicRangeToFirstSupportedProfile */
    private java.lang.Long m3808xce3eea12(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0344x583fb2df.m3796xce3eea12(c0491x2bb48c5e, this.f650x3ac6e655);
    }

    /* renamed from: profileSetToDynamicRangeSet */
    private static java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> m3809x644da250(java.util.Set<java.lang.Long> set) {
        if (set.isEmpty()) {
            return java.util.Collections.emptySet();
        }
        java.util.HashSet hashSet = new java.util.HashSet(set.size());
        java.util.Iterator<java.lang.Long> it = set.iterator();
        while (it.hasNext()) {
            hashSet.add(m3810x8e0e7462(it.next().longValue()));
        }
        return java.util.Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: profileToDynamicRange */
    private static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3810x8e0e7462(long j17) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m3797x8e0e7462 = p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0344x583fb2df.m3797x8e0e7462(j17);
        m3.h.d(m3797x8e0e7462, "Dynamic range profile cannot be converted to a DynamicRange object: " + j17);
        return m3797x8e0e7462;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: getDynamicRangeCaptureRequestConstraints */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3804x5b8d41b9(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        java.lang.Long m3808xce3eea12 = m3808xce3eea12(c0491x2bb48c5e);
        m3.h.b(m3808xce3eea12 != null, "DynamicRange is not supported: " + c0491x2bb48c5e);
        return m3809x644da250(this.f650x3ac6e655.getProfileCaptureRequestConstraints(m3808xce3eea12.longValue()));
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: getSupportedDynamicRanges */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> mo3805x41312cdd() {
        return m3809x644da250(this.f650x3ac6e655.getSupportedProfiles());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: isExtraLatencyPresent */
    public boolean mo3806x37b99483(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e) {
        java.lang.Long m3808xce3eea12 = m3808xce3eea12(c0491x2bb48c5e);
        m3.h.b(m3808xce3eea12 != null, "DynamicRange is not supported: " + c0491x2bb48c5e);
        return this.f650x3ac6e655.isExtraLatencyPresent(m3808xce3eea12.longValue());
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.p029xc4aaf986.C0345x87152bb7.DynamicRangeProfilesCompatImpl
    /* renamed from: unwrap */
    public android.hardware.camera2.params.DynamicRangeProfiles mo3807xcdecea63() {
        return this.f650x3ac6e655;
    }
}

package p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382;

/* renamed from: androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl */
/* loaded from: classes14.dex */
class C0342xe6932819 implements p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl {
    private static final java.lang.String TAG = "StreamConfigurationMapCompatBaseImpl";

    /* renamed from: mStreamConfigurationMap */
    final android.hardware.camera2.params.StreamConfigurationMap f645xe68a8cf3;

    /* renamed from: androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl$Api23Impl */
    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        /* renamed from: getHighResolutionOutputSizes */
        public static android.util.Size[] m3792xd229248d(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i17) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i17);
        }
    }

    public C0342xe6932819(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        this.f645xe68a8cf3 = streamConfigurationMap;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl
    /* renamed from: getHighResolutionOutputSizes */
    public android.util.Size[] mo3787xd229248d(int i17) {
        return p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0342xe6932819.Api23Impl.m3792xd229248d(this.f645xe68a8cf3, i17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl
    /* renamed from: getOutputFormats */
    public int[] mo3788x14494f65() {
        try {
            return this.f645xe68a8cf3.getOutputFormats();
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e17) {
            p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.w(TAG, "Failed to get output formats from StreamConfigurationMap", e17);
            return null;
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl
    /* renamed from: getOutputSizes */
    public android.util.Size[] mo3789xa804d6db(int i17) {
        if (i17 == 34) {
            return this.f645xe68a8cf3.getOutputSizes(android.graphics.SurfaceTexture.class);
        }
        return this.f645xe68a8cf3.getOutputSizes(i17);
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl
    /* renamed from: unwrap */
    public android.hardware.camera2.params.StreamConfigurationMap mo3791xcdecea63() {
        return this.f645xe68a8cf3;
    }

    @Override // p012xc85e97e9.p023xae79c325.p024x20bea1ad.p026x21ffc6bd.p028xaf3f3382.C0340x579b9f68.StreamConfigurationMapCompatImpl
    /* renamed from: getOutputSizes */
    public <T> android.util.Size[] mo3790xa804d6db(java.lang.Class<T> cls) {
        return this.f645xe68a8cf3.getOutputSizes(cls);
    }
}

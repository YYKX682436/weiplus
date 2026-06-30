package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
class StreamConfigurationMapCompatBaseImpl implements androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl {
    private static final java.lang.String TAG = "StreamConfigurationMapCompatBaseImpl";
    final android.hardware.camera2.params.StreamConfigurationMap mStreamConfigurationMap;

    /* loaded from: classes14.dex */
    public static class Api23Impl {
        private Api23Impl() {
        }

        public static android.util.Size[] getHighResolutionOutputSizes(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, int i17) {
            return streamConfigurationMap.getHighResolutionOutputSizes(i17);
        }
    }

    public StreamConfigurationMapCompatBaseImpl(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap) {
        this.mStreamConfigurationMap = streamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getHighResolutionOutputSizes(int i17) {
        return androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatBaseImpl.Api23Impl.getHighResolutionOutputSizes(this.mStreamConfigurationMap, i17);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public int[] getOutputFormats() {
        try {
            return this.mStreamConfigurationMap.getOutputFormats();
        } catch (java.lang.IllegalArgumentException | java.lang.NullPointerException e17) {
            androidx.camera.core.Logger.w(TAG, "Failed to get output formats from StreamConfigurationMap", e17);
            return null;
        }
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.util.Size[] getOutputSizes(int i17) {
        if (i17 == 34) {
            return this.mStreamConfigurationMap.getOutputSizes(android.graphics.SurfaceTexture.class);
        }
        return this.mStreamConfigurationMap.getOutputSizes(i17);
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public android.hardware.camera2.params.StreamConfigurationMap unwrap() {
        return this.mStreamConfigurationMap;
    }

    @Override // androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl
    public <T> android.util.Size[] getOutputSizes(java.lang.Class<T> cls) {
        return this.mStreamConfigurationMap.getOutputSizes(cls);
    }
}

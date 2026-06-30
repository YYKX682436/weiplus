package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public class StreamConfigurationMapCompat {
    private static final java.lang.String TAG = "StreamConfigurationMapCompat";
    private final androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.StreamConfigurationMapCompatImpl mImpl;
    private final androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector mOutputSizesCorrector;
    private final java.util.Map<java.lang.Integer, android.util.Size[]> mCachedFormatOutputSizes = new java.util.HashMap();
    private final java.util.Map<java.lang.Integer, android.util.Size[]> mCachedFormatHighResolutionOutputSizes = new java.util.HashMap();
    private final java.util.Map<java.lang.Class<?>, android.util.Size[]> mCachedClassOutputSizes = new java.util.HashMap();

    /* loaded from: classes14.dex */
    public interface StreamConfigurationMapCompatImpl {
        android.util.Size[] getHighResolutionOutputSizes(int i17);

        int[] getOutputFormats();

        android.util.Size[] getOutputSizes(int i17);

        <T> android.util.Size[] getOutputSizes(java.lang.Class<T> cls);

        android.hardware.camera2.params.StreamConfigurationMap unwrap();
    }

    private StreamConfigurationMapCompat(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector outputSizesCorrector) {
        this.mImpl = new androidx.camera.camera2.internal.compat.StreamConfigurationMapCompatApi23Impl(streamConfigurationMap);
        this.mOutputSizesCorrector = outputSizesCorrector;
    }

    public static androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat toStreamConfigurationMapCompat(android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap, androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector outputSizesCorrector) {
        return new androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat(streamConfigurationMap, outputSizesCorrector);
    }

    public android.util.Size[] getHighResolutionOutputSizes(int i17) {
        if (this.mCachedFormatHighResolutionOutputSizes.containsKey(java.lang.Integer.valueOf(i17))) {
            if (this.mCachedFormatHighResolutionOutputSizes.get(java.lang.Integer.valueOf(i17)) == null) {
                return null;
            }
            return (android.util.Size[]) this.mCachedFormatHighResolutionOutputSizes.get(java.lang.Integer.valueOf(i17)).clone();
        }
        android.util.Size[] highResolutionOutputSizes = this.mImpl.getHighResolutionOutputSizes(i17);
        if (highResolutionOutputSizes != null && highResolutionOutputSizes.length > 0) {
            highResolutionOutputSizes = this.mOutputSizesCorrector.applyQuirks(highResolutionOutputSizes, i17);
        }
        this.mCachedFormatHighResolutionOutputSizes.put(java.lang.Integer.valueOf(i17), highResolutionOutputSizes);
        if (highResolutionOutputSizes != null) {
            return (android.util.Size[]) highResolutionOutputSizes.clone();
        }
        return null;
    }

    public int[] getOutputFormats() {
        int[] outputFormats = this.mImpl.getOutputFormats();
        if (outputFormats == null) {
            return null;
        }
        return (int[]) outputFormats.clone();
    }

    public android.util.Size[] getOutputSizes(int i17) {
        if (this.mCachedFormatOutputSizes.containsKey(java.lang.Integer.valueOf(i17))) {
            if (this.mCachedFormatOutputSizes.get(java.lang.Integer.valueOf(i17)) == null) {
                return null;
            }
            return (android.util.Size[]) this.mCachedFormatOutputSizes.get(java.lang.Integer.valueOf(i17)).clone();
        }
        android.util.Size[] outputSizes = this.mImpl.getOutputSizes(i17);
        if (outputSizes != null && outputSizes.length != 0) {
            android.util.Size[] applyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, i17);
            this.mCachedFormatOutputSizes.put(java.lang.Integer.valueOf(i17), applyQuirks);
            return (android.util.Size[]) applyQuirks.clone();
        }
        androidx.camera.core.Logger.w(TAG, "Retrieved output sizes array is null or empty for format " + i17);
        return outputSizes;
    }

    public android.hardware.camera2.params.StreamConfigurationMap toStreamConfigurationMap() {
        return this.mImpl.unwrap();
    }

    public <T> android.util.Size[] getOutputSizes(java.lang.Class<T> cls) {
        if (this.mCachedClassOutputSizes.containsKey(cls)) {
            if (this.mCachedClassOutputSizes.get(cls) == null) {
                return null;
            }
            return (android.util.Size[]) this.mCachedClassOutputSizes.get(cls).clone();
        }
        android.util.Size[] outputSizes = this.mImpl.getOutputSizes(cls);
        if (outputSizes != null && outputSizes.length != 0) {
            android.util.Size[] applyQuirks = this.mOutputSizesCorrector.applyQuirks(outputSizes, cls);
            this.mCachedClassOutputSizes.put(cls, applyQuirks);
            return (android.util.Size[]) applyQuirks.clone();
        }
        androidx.camera.core.Logger.w(TAG, "Retrieved output sizes array is null or empty for class " + cls);
        return outputSizes;
    }
}

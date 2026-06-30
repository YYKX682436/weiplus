package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public abstract class AttachedSurfaceInfo {
    public static androidx.camera.core.impl.AttachedSurfaceInfo create(androidx.camera.core.impl.SurfaceConfig surfaceConfig, int i17, android.util.Size size, androidx.camera.core.DynamicRange dynamicRange, java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> list, androidx.camera.core.impl.Config config, android.util.Range<java.lang.Integer> range) {
        return new androidx.camera.core.impl.AutoValue_AttachedSurfaceInfo(surfaceConfig, i17, size, dynamicRange, list, config, range);
    }

    public abstract java.util.List<androidx.camera.core.impl.UseCaseConfigFactory.CaptureType> getCaptureTypes();

    public abstract androidx.camera.core.DynamicRange getDynamicRange();

    public abstract int getImageFormat();

    public abstract androidx.camera.core.impl.Config getImplementationOptions();

    public abstract android.util.Size getSize();

    public abstract androidx.camera.core.impl.SurfaceConfig getSurfaceConfig();

    public abstract android.util.Range<java.lang.Integer> getTargetFrameRate();

    public androidx.camera.core.impl.StreamSpec toStreamSpec(androidx.camera.core.impl.Config config) {
        androidx.camera.core.impl.StreamSpec.Builder implementationOptions = androidx.camera.core.impl.StreamSpec.builder(getSize()).setDynamicRange(getDynamicRange()).setImplementationOptions(config);
        if (getTargetFrameRate() != null) {
            implementationOptions.setExpectedFrameRateRange(getTargetFrameRate());
        }
        return implementationOptions.build();
    }
}

package androidx.camera.core;

/* loaded from: classes14.dex */
public abstract class ImmutableImageInfo implements androidx.camera.core.ImageInfo {
    public static androidx.camera.core.ImageInfo create(androidx.camera.core.impl.TagBundle tagBundle, long j17, int i17, android.graphics.Matrix matrix) {
        return new androidx.camera.core.AutoValue_ImmutableImageInfo(tagBundle, j17, i17, matrix);
    }

    @Override // androidx.camera.core.ImageInfo
    public abstract int getRotationDegrees();

    @Override // androidx.camera.core.ImageInfo
    public abstract android.graphics.Matrix getSensorToBufferTransformMatrix();

    @Override // androidx.camera.core.ImageInfo
    public abstract androidx.camera.core.impl.TagBundle getTagBundle();

    @Override // androidx.camera.core.ImageInfo
    public abstract long getTimestamp();

    @Override // androidx.camera.core.ImageInfo
    public void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder) {
        builder.setOrientationDegrees(getRotationDegrees());
    }
}

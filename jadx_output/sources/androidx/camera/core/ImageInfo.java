package androidx.camera.core;

/* loaded from: classes14.dex */
public interface ImageInfo {
    int getRotationDegrees();

    default android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return new android.graphics.Matrix();
    }

    androidx.camera.core.impl.TagBundle getTagBundle();

    long getTimestamp();

    void populateExifData(androidx.camera.core.impl.utils.ExifData.Builder builder);
}

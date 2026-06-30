package androidx.camera.extensions.internal.sessionprocessor;

/* loaded from: classes14.dex */
public abstract class ImageReaderOutputConfig implements androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig {
    public static androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig create(int i17, int i18, java.lang.String str, java.util.List<androidx.camera.extensions.internal.sessionprocessor.Camera2OutputConfig> list, android.util.Size size, int i19, int i27) {
        return new androidx.camera.extensions.internal.sessionprocessor.AutoValue_ImageReaderOutputConfig(i17, i18, str, list, size, i19, i27);
    }

    public abstract int getImageFormat();

    public abstract int getMaxImages();

    public abstract android.util.Size getSize();

    public static androidx.camera.extensions.internal.sessionprocessor.ImageReaderOutputConfig create(int i17, android.util.Size size, int i18, int i19) {
        return new androidx.camera.extensions.internal.sessionprocessor.AutoValue_ImageReaderOutputConfig(i17, -1, null, java.util.Collections.emptyList(), size, i18, i19);
    }
}

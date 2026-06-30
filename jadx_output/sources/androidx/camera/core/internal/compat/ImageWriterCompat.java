package androidx.camera.core.internal.compat;

/* loaded from: classes14.dex */
public final class ImageWriterCompat {
    private ImageWriterCompat() {
    }

    public static void close(android.media.ImageWriter imageWriter) {
        androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.close(imageWriter);
    }

    public static android.media.Image dequeueInputImage(android.media.ImageWriter imageWriter) {
        return androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.dequeueInputImage(imageWriter);
    }

    public static android.media.ImageWriter newInstance(android.view.Surface surface, int i17, int i18) {
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 29) {
            return androidx.camera.core.internal.compat.ImageWriterCompatApi29Impl.newInstance(surface, i17, i18);
        }
        if (i19 >= 26) {
            return androidx.camera.core.internal.compat.ImageWriterCompatApi26Impl.newInstance(surface, i17, i18);
        }
        throw new java.lang.RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i19 + ". Version 26 or higher required.");
    }

    public static void queueInputImage(android.media.ImageWriter imageWriter, android.media.Image image) {
        androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.queueInputImage(imageWriter, image);
    }

    public static android.media.ImageWriter newInstance(android.view.Surface surface, int i17) {
        return androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl.newInstance(surface, i17);
    }
}

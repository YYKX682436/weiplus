package androidx.camera.core.internal.compat;

/* loaded from: classes14.dex */
final class ImageWriterCompatApi23Impl {
    private ImageWriterCompatApi23Impl() {
    }

    public static void close(android.media.ImageWriter imageWriter) {
        imageWriter.close();
    }

    public static android.media.Image dequeueInputImage(android.media.ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    public static android.media.ImageWriter newInstance(android.view.Surface surface, int i17) {
        return android.media.ImageWriter.newInstance(surface, i17);
    }

    public static void queueInputImage(android.media.ImageWriter imageWriter, android.media.Image image) {
        imageWriter.queueInputImage(image);
    }
}

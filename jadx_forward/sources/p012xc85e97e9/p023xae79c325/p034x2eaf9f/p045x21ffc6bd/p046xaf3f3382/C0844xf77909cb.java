package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382;

/* renamed from: androidx.camera.core.internal.compat.ImageWriterCompatApi23Impl */
/* loaded from: classes14.dex */
final class C0844xf77909cb {
    private C0844xf77909cb() {
    }

    /* renamed from: close */
    public static void m6156x5a5ddf8(android.media.ImageWriter imageWriter) {
        imageWriter.close();
    }

    /* renamed from: dequeueInputImage */
    public static android.media.Image m6157x897a8501(android.media.ImageWriter imageWriter) {
        return imageWriter.dequeueInputImage();
    }

    /* renamed from: newInstance */
    public static android.media.ImageWriter m6158x6bff0255(android.view.Surface surface, int i17) {
        return android.media.ImageWriter.newInstance(surface, i17);
    }

    /* renamed from: queueInputImage */
    public static void m6159x89343a2(android.media.ImageWriter imageWriter, android.media.Image image) {
        imageWriter.queueInputImage(image);
    }
}

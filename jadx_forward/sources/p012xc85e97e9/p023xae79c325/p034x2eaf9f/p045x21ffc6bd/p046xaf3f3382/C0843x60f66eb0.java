package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382;

/* renamed from: androidx.camera.core.internal.compat.ImageWriterCompat */
/* loaded from: classes14.dex */
public final class C0843x60f66eb0 {
    private C0843x60f66eb0() {
    }

    /* renamed from: close */
    public static void m6151x5a5ddf8(android.media.ImageWriter imageWriter) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0844xf77909cb.m6156x5a5ddf8(imageWriter);
    }

    /* renamed from: dequeueInputImage */
    public static android.media.Image m6152x897a8501(android.media.ImageWriter imageWriter) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0844xf77909cb.m6157x897a8501(imageWriter);
    }

    /* renamed from: newInstance */
    public static android.media.ImageWriter m6154x6bff0255(android.view.Surface surface, int i17, int i18) {
        int i19 = android.os.Build.VERSION.SDK_INT;
        if (i19 >= 29) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0846xf7cd96d1.m6162x6bff0255(surface, i17, i18);
        }
        if (i19 >= 26) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0845xf7a3504e.m6161x6bff0255(surface, i17, i18);
        }
        throw new java.lang.RuntimeException("Unable to call newInstance(Surface, int, int) on API " + i19 + ". Version 26 or higher required.");
    }

    /* renamed from: queueInputImage */
    public static void m6155x89343a2(android.media.ImageWriter imageWriter, android.media.Image image) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0844xf77909cb.m6159x89343a2(imageWriter, image);
    }

    /* renamed from: newInstance */
    public static android.media.ImageWriter m6153x6bff0255(android.view.Surface surface, int i17) {
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p046xaf3f3382.C0844xf77909cb.m6158x6bff0255(surface, i17);
    }
}

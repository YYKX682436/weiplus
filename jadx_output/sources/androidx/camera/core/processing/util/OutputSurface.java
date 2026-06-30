package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
public abstract class OutputSurface {
    public static androidx.camera.core.processing.util.OutputSurface of(android.opengl.EGLSurface eGLSurface, int i17, int i18) {
        return new androidx.camera.core.processing.util.AutoValue_OutputSurface(eGLSurface, i17, i18);
    }

    public abstract android.opengl.EGLSurface getEglSurface();

    public abstract int getHeight();

    public abstract int getWidth();
}

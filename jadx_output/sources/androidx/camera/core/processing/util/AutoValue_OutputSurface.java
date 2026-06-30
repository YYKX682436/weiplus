package androidx.camera.core.processing.util;

/* loaded from: classes14.dex */
final class AutoValue_OutputSurface extends androidx.camera.core.processing.util.OutputSurface {
    private final android.opengl.EGLSurface eglSurface;
    private final int height;
    private final int width;

    public AutoValue_OutputSurface(android.opengl.EGLSurface eGLSurface, int i17, int i18) {
        if (eGLSurface == null) {
            throw new java.lang.NullPointerException("Null eglSurface");
        }
        this.eglSurface = eGLSurface;
        this.width = i17;
        this.height = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.util.OutputSurface)) {
            return false;
        }
        androidx.camera.core.processing.util.OutputSurface outputSurface = (androidx.camera.core.processing.util.OutputSurface) obj;
        return this.eglSurface.equals(outputSurface.getEglSurface()) && this.width == outputSurface.getWidth() && this.height == outputSurface.getHeight();
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public android.opengl.EGLSurface getEglSurface() {
        return this.eglSurface;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getHeight() {
        return this.height;
    }

    @Override // androidx.camera.core.processing.util.OutputSurface
    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return ((((this.eglSurface.hashCode() ^ 1000003) * 1000003) ^ this.width) * 1000003) ^ this.height;
    }

    public java.lang.String toString() {
        return "OutputSurface{eglSurface=" + this.eglSurface + ", width=" + this.width + ", height=" + this.height + "}";
    }
}

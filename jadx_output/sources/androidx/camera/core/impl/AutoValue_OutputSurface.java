package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_OutputSurface extends androidx.camera.core.impl.OutputSurface {
    private final int imageFormat;
    private final android.util.Size size;
    private final android.view.Surface surface;

    public AutoValue_OutputSurface(android.view.Surface surface, android.util.Size size, int i17) {
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.surface = surface;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.size = size;
        this.imageFormat = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.OutputSurface)) {
            return false;
        }
        androidx.camera.core.impl.OutputSurface outputSurface = (androidx.camera.core.impl.OutputSurface) obj;
        return this.surface.equals(outputSurface.getSurface()) && this.size.equals(outputSurface.getSize()) && this.imageFormat == outputSurface.getImageFormat();
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public int getImageFormat() {
        return this.imageFormat;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public android.util.Size getSize() {
        return this.size;
    }

    @Override // androidx.camera.core.impl.OutputSurface
    public android.view.Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((((this.surface.hashCode() ^ 1000003) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.imageFormat;
    }

    public java.lang.String toString() {
        return "OutputSurface{surface=" + this.surface + ", size=" + this.size + ", imageFormat=" + this.imageFormat + "}";
    }
}

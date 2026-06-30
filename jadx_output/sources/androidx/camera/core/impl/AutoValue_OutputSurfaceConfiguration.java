package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_OutputSurfaceConfiguration extends androidx.camera.core.impl.OutputSurfaceConfiguration {
    private final androidx.camera.core.impl.OutputSurface imageAnalysisOutputSurface;
    private final androidx.camera.core.impl.OutputSurface imageCaptureOutputSurface;
    private final androidx.camera.core.impl.OutputSurface postviewOutputSurface;
    private final androidx.camera.core.impl.OutputSurface previewOutputSurface;

    public AutoValue_OutputSurfaceConfiguration(androidx.camera.core.impl.OutputSurface outputSurface, androidx.camera.core.impl.OutputSurface outputSurface2, androidx.camera.core.impl.OutputSurface outputSurface3, androidx.camera.core.impl.OutputSurface outputSurface4) {
        if (outputSurface == null) {
            throw new java.lang.NullPointerException("Null previewOutputSurface");
        }
        this.previewOutputSurface = outputSurface;
        if (outputSurface2 == null) {
            throw new java.lang.NullPointerException("Null imageCaptureOutputSurface");
        }
        this.imageCaptureOutputSurface = outputSurface2;
        this.imageAnalysisOutputSurface = outputSurface3;
        this.postviewOutputSurface = outputSurface4;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.impl.OutputSurface outputSurface;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.OutputSurfaceConfiguration)) {
            return false;
        }
        androidx.camera.core.impl.OutputSurfaceConfiguration outputSurfaceConfiguration = (androidx.camera.core.impl.OutputSurfaceConfiguration) obj;
        if (this.previewOutputSurface.equals(outputSurfaceConfiguration.getPreviewOutputSurface()) && this.imageCaptureOutputSurface.equals(outputSurfaceConfiguration.getImageCaptureOutputSurface()) && ((outputSurface = this.imageAnalysisOutputSurface) != null ? outputSurface.equals(outputSurfaceConfiguration.getImageAnalysisOutputSurface()) : outputSurfaceConfiguration.getImageAnalysisOutputSurface() == null)) {
            androidx.camera.core.impl.OutputSurface outputSurface2 = this.postviewOutputSurface;
            if (outputSurface2 == null) {
                if (outputSurfaceConfiguration.getPostviewOutputSurface() == null) {
                    return true;
                }
            } else if (outputSurface2.equals(outputSurfaceConfiguration.getPostviewOutputSurface())) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public androidx.camera.core.impl.OutputSurface getImageAnalysisOutputSurface() {
        return this.imageAnalysisOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public androidx.camera.core.impl.OutputSurface getImageCaptureOutputSurface() {
        return this.imageCaptureOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public androidx.camera.core.impl.OutputSurface getPostviewOutputSurface() {
        return this.postviewOutputSurface;
    }

    @Override // androidx.camera.core.impl.OutputSurfaceConfiguration
    public androidx.camera.core.impl.OutputSurface getPreviewOutputSurface() {
        return this.previewOutputSurface;
    }

    public int hashCode() {
        int hashCode = (((this.previewOutputSurface.hashCode() ^ 1000003) * 1000003) ^ this.imageCaptureOutputSurface.hashCode()) * 1000003;
        androidx.camera.core.impl.OutputSurface outputSurface = this.imageAnalysisOutputSurface;
        int hashCode2 = (hashCode ^ (outputSurface == null ? 0 : outputSurface.hashCode())) * 1000003;
        androidx.camera.core.impl.OutputSurface outputSurface2 = this.postviewOutputSurface;
        return hashCode2 ^ (outputSurface2 != null ? outputSurface2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OutputSurfaceConfiguration{previewOutputSurface=" + this.previewOutputSurface + ", imageCaptureOutputSurface=" + this.imageCaptureOutputSurface + ", imageAnalysisOutputSurface=" + this.imageAnalysisOutputSurface + ", postviewOutputSurface=" + this.postviewOutputSurface + "}";
    }
}

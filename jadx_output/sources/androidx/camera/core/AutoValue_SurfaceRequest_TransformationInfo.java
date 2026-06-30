package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_SurfaceRequest_TransformationInfo extends androidx.camera.core.SurfaceRequest.TransformationInfo {
    private final android.graphics.Rect getCropRect;
    private final int getRotationDegrees;
    private final android.graphics.Matrix getSensorToBufferTransform;
    private final int getTargetRotation;
    private final boolean hasCameraTransform;
    private final boolean isMirroring;

    public AutoValue_SurfaceRequest_TransformationInfo(android.graphics.Rect rect, int i17, int i18, boolean z17, android.graphics.Matrix matrix, boolean z18) {
        if (rect == null) {
            throw new java.lang.NullPointerException("Null getCropRect");
        }
        this.getCropRect = rect;
        this.getRotationDegrees = i17;
        this.getTargetRotation = i18;
        this.hasCameraTransform = z17;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null getSensorToBufferTransform");
        }
        this.getSensorToBufferTransform = matrix;
        this.isMirroring = z18;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceRequest.TransformationInfo)) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.TransformationInfo transformationInfo = (androidx.camera.core.SurfaceRequest.TransformationInfo) obj;
        return this.getCropRect.equals(transformationInfo.getCropRect()) && this.getRotationDegrees == transformationInfo.getRotationDegrees() && this.getTargetRotation == transformationInfo.getTargetRotation() && this.hasCameraTransform == transformationInfo.hasCameraTransform() && this.getSensorToBufferTransform.equals(transformationInfo.getSensorToBufferTransform()) && this.isMirroring == transformationInfo.isMirroring();
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public android.graphics.Rect getCropRect() {
        return this.getCropRect;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getRotationDegrees() {
        return this.getRotationDegrees;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public android.graphics.Matrix getSensorToBufferTransform() {
        return this.getSensorToBufferTransform;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public int getTargetRotation() {
        return this.getTargetRotation;
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean hasCameraTransform() {
        return this.hasCameraTransform;
    }

    public int hashCode() {
        return ((((((((((this.getCropRect.hashCode() ^ 1000003) * 1000003) ^ this.getRotationDegrees) * 1000003) ^ this.getTargetRotation) * 1000003) ^ (this.hasCameraTransform ? 1231 : 1237)) * 1000003) ^ this.getSensorToBufferTransform.hashCode()) * 1000003) ^ (this.isMirroring ? 1231 : 1237);
    }

    @Override // androidx.camera.core.SurfaceRequest.TransformationInfo
    public boolean isMirroring() {
        return this.isMirroring;
    }

    public java.lang.String toString() {
        return "TransformationInfo{getCropRect=" + this.getCropRect + ", getRotationDegrees=" + this.getRotationDegrees + ", getTargetRotation=" + this.getTargetRotation + ", hasCameraTransform=" + this.hasCameraTransform + ", getSensorToBufferTransform=" + this.getSensorToBufferTransform + ", isMirroring=" + this.isMirroring + "}";
    }
}

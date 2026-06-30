package androidx.camera.core;

/* loaded from: classes14.dex */
final class AutoValue_SurfaceOutput_CameraInputInfo extends androidx.camera.core.SurfaceOutput.CameraInputInfo {
    private final androidx.camera.core.impl.CameraInternal cameraInternal;
    private final android.graphics.Rect inputCropRect;
    private final android.util.Size inputSize;
    private final boolean mirroring;
    private final int rotationDegrees;

    public AutoValue_SurfaceOutput_CameraInputInfo(android.util.Size size, android.graphics.Rect rect, androidx.camera.core.impl.CameraInternal cameraInternal, int i17, boolean z17) {
        if (size == null) {
            throw new java.lang.NullPointerException("Null inputSize");
        }
        this.inputSize = size;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null inputCropRect");
        }
        this.inputCropRect = rect;
        this.cameraInternal = cameraInternal;
        this.rotationDegrees = i17;
        this.mirroring = z17;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.impl.CameraInternal cameraInternal;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceOutput.CameraInputInfo)) {
            return false;
        }
        androidx.camera.core.SurfaceOutput.CameraInputInfo cameraInputInfo = (androidx.camera.core.SurfaceOutput.CameraInputInfo) obj;
        return this.inputSize.equals(cameraInputInfo.getInputSize()) && this.inputCropRect.equals(cameraInputInfo.getInputCropRect()) && ((cameraInternal = this.cameraInternal) != null ? cameraInternal.equals(cameraInputInfo.getCameraInternal()) : cameraInputInfo.getCameraInternal() == null) && this.rotationDegrees == cameraInputInfo.getRotationDegrees() && this.mirroring == cameraInputInfo.getMirroring();
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public androidx.camera.core.impl.CameraInternal getCameraInternal() {
        return this.cameraInternal;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public android.graphics.Rect getInputCropRect() {
        return this.inputCropRect;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public android.util.Size getInputSize() {
        return this.inputSize;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public boolean getMirroring() {
        return this.mirroring;
    }

    @Override // androidx.camera.core.SurfaceOutput.CameraInputInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        int hashCode = (((this.inputSize.hashCode() ^ 1000003) * 1000003) ^ this.inputCropRect.hashCode()) * 1000003;
        androidx.camera.core.impl.CameraInternal cameraInternal = this.cameraInternal;
        return ((((hashCode ^ (cameraInternal == null ? 0 : cameraInternal.hashCode())) * 1000003) ^ this.rotationDegrees) * 1000003) ^ (this.mirroring ? 1231 : 1237);
    }

    public java.lang.String toString() {
        return "CameraInputInfo{inputSize=" + this.inputSize + ", inputCropRect=" + this.inputCropRect + ", cameraInternal=" + this.cameraInternal + ", rotationDegrees=" + this.rotationDegrees + ", mirroring=" + this.mirroring + "}";
    }
}

package androidx.camera.core.impl;

/* loaded from: classes14.dex */
final class AutoValue_CameraThreadConfig extends androidx.camera.core.impl.CameraThreadConfig {
    private final java.util.concurrent.Executor cameraExecutor;
    private final android.os.Handler schedulerHandler;

    public AutoValue_CameraThreadConfig(java.util.concurrent.Executor executor, android.os.Handler handler) {
        if (executor == null) {
            throw new java.lang.NullPointerException("Null cameraExecutor");
        }
        this.cameraExecutor = executor;
        if (handler == null) {
            throw new java.lang.NullPointerException("Null schedulerHandler");
        }
        this.schedulerHandler = handler;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.CameraThreadConfig)) {
            return false;
        }
        androidx.camera.core.impl.CameraThreadConfig cameraThreadConfig = (androidx.camera.core.impl.CameraThreadConfig) obj;
        return this.cameraExecutor.equals(cameraThreadConfig.getCameraExecutor()) && this.schedulerHandler.equals(cameraThreadConfig.getSchedulerHandler());
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public java.util.concurrent.Executor getCameraExecutor() {
        return this.cameraExecutor;
    }

    @Override // androidx.camera.core.impl.CameraThreadConfig
    public android.os.Handler getSchedulerHandler() {
        return this.schedulerHandler;
    }

    public int hashCode() {
        return ((this.cameraExecutor.hashCode() ^ 1000003) * 1000003) ^ this.schedulerHandler.hashCode();
    }

    public java.lang.String toString() {
        return "CameraThreadConfig{cameraExecutor=" + this.cameraExecutor + ", schedulerHandler=" + this.schedulerHandler + "}";
    }
}

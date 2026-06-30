package androidx.camera.core;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_SurfaceRequest_Result extends androidx.camera.core.SurfaceRequest.Result {
    private final int resultCode;
    private final android.view.Surface surface;

    public AutoValue_SurfaceRequest_Result(int i17, android.view.Surface surface) {
        this.resultCode = i17;
        if (surface == null) {
            throw new java.lang.NullPointerException("Null surface");
        }
        this.surface = surface;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.SurfaceRequest.Result)) {
            return false;
        }
        androidx.camera.core.SurfaceRequest.Result result = (androidx.camera.core.SurfaceRequest.Result) obj;
        return this.resultCode == result.getResultCode() && this.surface.equals(result.getSurface());
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public int getResultCode() {
        return this.resultCode;
    }

    @Override // androidx.camera.core.SurfaceRequest.Result
    public android.view.Surface getSurface() {
        return this.surface;
    }

    public int hashCode() {
        return ((this.resultCode ^ 1000003) * 1000003) ^ this.surface.hashCode();
    }

    public java.lang.String toString() {
        return "Result{resultCode=" + this.resultCode + ", surface=" + this.surface + "}";
    }
}

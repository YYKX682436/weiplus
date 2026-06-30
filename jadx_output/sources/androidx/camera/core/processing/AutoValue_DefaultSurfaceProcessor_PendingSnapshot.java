package androidx.camera.core.processing;

/* loaded from: classes14.dex */
final class AutoValue_DefaultSurfaceProcessor_PendingSnapshot extends androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot {
    private final t2.k completer;
    private final int jpegQuality;
    private final int rotationDegrees;

    public AutoValue_DefaultSurfaceProcessor_PendingSnapshot(int i17, int i18, t2.k kVar) {
        this.jpegQuality = i17;
        this.rotationDegrees = i18;
        if (kVar == null) {
            throw new java.lang.NullPointerException("Null completer");
        }
        this.completer = kVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot)) {
            return false;
        }
        androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot pendingSnapshot = (androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot) obj;
        return this.jpegQuality == pendingSnapshot.getJpegQuality() && this.rotationDegrees == pendingSnapshot.getRotationDegrees() && this.completer.equals(pendingSnapshot.getCompleter());
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public t2.k getCompleter() {
        return this.completer;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public int getJpegQuality() {
        return this.jpegQuality;
    }

    @Override // androidx.camera.core.processing.DefaultSurfaceProcessor.PendingSnapshot
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    public int hashCode() {
        return ((((this.jpegQuality ^ 1000003) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.completer.hashCode();
    }

    public java.lang.String toString() {
        return "PendingSnapshot{jpegQuality=" + this.jpegQuality + ", rotationDegrees=" + this.rotationDegrees + ", completer=" + this.completer + "}";
    }
}

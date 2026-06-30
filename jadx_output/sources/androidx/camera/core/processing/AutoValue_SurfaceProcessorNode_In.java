package androidx.camera.core.processing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_SurfaceProcessorNode_In extends androidx.camera.core.processing.SurfaceProcessorNode.In {
    private final java.util.List<androidx.camera.core.processing.util.OutConfig> outConfigs;
    private final androidx.camera.core.processing.SurfaceEdge surfaceEdge;

    public AutoValue_SurfaceProcessorNode_In(androidx.camera.core.processing.SurfaceEdge surfaceEdge, java.util.List<androidx.camera.core.processing.util.OutConfig> list) {
        if (surfaceEdge == null) {
            throw new java.lang.NullPointerException("Null surfaceEdge");
        }
        this.surfaceEdge = surfaceEdge;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.SurfaceProcessorNode.In)) {
            return false;
        }
        androidx.camera.core.processing.SurfaceProcessorNode.In in6 = (androidx.camera.core.processing.SurfaceProcessorNode.In) obj;
        return this.surfaceEdge.equals(in6.getSurfaceEdge()) && this.outConfigs.equals(in6.getOutConfigs());
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    public java.util.List<androidx.camera.core.processing.util.OutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.SurfaceProcessorNode.In
    public androidx.camera.core.processing.SurfaceEdge getSurfaceEdge() {
        return this.surfaceEdge;
    }

    public int hashCode() {
        return ((this.surfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.outConfigs.hashCode();
    }

    public java.lang.String toString() {
        return "In{surfaceEdge=" + this.surfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }
}

package androidx.camera.core.processing.concurrent;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_DualSurfaceProcessorNode_In extends androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In {
    private final java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> outConfigs;
    private final androidx.camera.core.processing.SurfaceEdge primarySurfaceEdge;
    private final androidx.camera.core.processing.SurfaceEdge secondarySurfaceEdge;

    public AutoValue_DualSurfaceProcessorNode_In(androidx.camera.core.processing.SurfaceEdge surfaceEdge, androidx.camera.core.processing.SurfaceEdge surfaceEdge2, java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> list) {
        if (surfaceEdge == null) {
            throw new java.lang.NullPointerException("Null primarySurfaceEdge");
        }
        this.primarySurfaceEdge = surfaceEdge;
        if (surfaceEdge2 == null) {
            throw new java.lang.NullPointerException("Null secondarySurfaceEdge");
        }
        this.secondarySurfaceEdge = surfaceEdge2;
        if (list == null) {
            throw new java.lang.NullPointerException("Null outConfigs");
        }
        this.outConfigs = list;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In)) {
            return false;
        }
        androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In in6 = (androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In) obj;
        return this.primarySurfaceEdge.equals(in6.getPrimarySurfaceEdge()) && this.secondarySurfaceEdge.equals(in6.getSecondarySurfaceEdge()) && this.outConfigs.equals(in6.getOutConfigs());
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public java.util.List<androidx.camera.core.processing.concurrent.DualOutConfig> getOutConfigs() {
        return this.outConfigs;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public androidx.camera.core.processing.SurfaceEdge getPrimarySurfaceEdge() {
        return this.primarySurfaceEdge;
    }

    @Override // androidx.camera.core.processing.concurrent.DualSurfaceProcessorNode.In
    public androidx.camera.core.processing.SurfaceEdge getSecondarySurfaceEdge() {
        return this.secondarySurfaceEdge;
    }

    public int hashCode() {
        return ((((this.primarySurfaceEdge.hashCode() ^ 1000003) * 1000003) ^ this.secondarySurfaceEdge.hashCode()) * 1000003) ^ this.outConfigs.hashCode();
    }

    public java.lang.String toString() {
        return "In{primarySurfaceEdge=" + this.primarySurfaceEdge + ", secondarySurfaceEdge=" + this.secondarySurfaceEdge + ", outConfigs=" + this.outConfigs + "}";
    }
}

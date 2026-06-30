package androidx.camera.core.imagecapture;

/* loaded from: classes14.dex */
final class AutoValue_ProcessingNode_In extends androidx.camera.core.imagecapture.ProcessingNode.In {
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> edge;
    private final int inputFormat;
    private final int outputFormat;
    private final androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> postviewEdge;

    public AutoValue_ProcessingNode_In(androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> edge, androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> edge2, int i17, int i18) {
        if (edge == null) {
            throw new java.lang.NullPointerException("Null edge");
        }
        this.edge = edge;
        if (edge2 == null) {
            throw new java.lang.NullPointerException("Null postviewEdge");
        }
        this.postviewEdge = edge2;
        this.inputFormat = i17;
        this.outputFormat = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.imagecapture.ProcessingNode.In)) {
            return false;
        }
        androidx.camera.core.imagecapture.ProcessingNode.In in6 = (androidx.camera.core.imagecapture.ProcessingNode.In) obj;
        return this.edge.equals(in6.getEdge()) && this.postviewEdge.equals(in6.getPostviewEdge()) && this.inputFormat == in6.getInputFormat() && this.outputFormat == in6.getOutputFormat();
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getEdge() {
        return this.edge;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public int getInputFormat() {
        return this.inputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public int getOutputFormat() {
        return this.outputFormat;
    }

    @Override // androidx.camera.core.imagecapture.ProcessingNode.In
    public androidx.camera.core.processing.Edge<androidx.camera.core.imagecapture.ProcessingNode.InputPacket> getPostviewEdge() {
        return this.postviewEdge;
    }

    public int hashCode() {
        return ((((((this.edge.hashCode() ^ 1000003) * 1000003) ^ this.postviewEdge.hashCode()) * 1000003) ^ this.inputFormat) * 1000003) ^ this.outputFormat;
    }

    public java.lang.String toString() {
        return "In{edge=" + this.edge + ", postviewEdge=" + this.postviewEdge + ", inputFormat=" + this.inputFormat + ", outputFormat=" + this.outputFormat + "}";
    }
}

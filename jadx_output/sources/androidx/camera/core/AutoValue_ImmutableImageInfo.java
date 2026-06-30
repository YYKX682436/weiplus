package androidx.camera.core;

/* loaded from: classes14.dex */
final class AutoValue_ImmutableImageInfo extends androidx.camera.core.ImmutableImageInfo {
    private final int rotationDegrees;
    private final android.graphics.Matrix sensorToBufferTransformMatrix;
    private final androidx.camera.core.impl.TagBundle tagBundle;
    private final long timestamp;

    public AutoValue_ImmutableImageInfo(androidx.camera.core.impl.TagBundle tagBundle, long j17, int i17, android.graphics.Matrix matrix) {
        if (tagBundle == null) {
            throw new java.lang.NullPointerException("Null tagBundle");
        }
        this.tagBundle = tagBundle;
        this.timestamp = j17;
        this.rotationDegrees = i17;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransformMatrix");
        }
        this.sensorToBufferTransformMatrix = matrix;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.ImmutableImageInfo)) {
            return false;
        }
        androidx.camera.core.ImmutableImageInfo immutableImageInfo = (androidx.camera.core.ImmutableImageInfo) obj;
        return this.tagBundle.equals(immutableImageInfo.getTagBundle()) && this.timestamp == immutableImageInfo.getTimestamp() && this.rotationDegrees == immutableImageInfo.getRotationDegrees() && this.sensorToBufferTransformMatrix.equals(immutableImageInfo.getSensorToBufferTransformMatrix());
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public android.graphics.Matrix getSensorToBufferTransformMatrix() {
        return this.sensorToBufferTransformMatrix;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public androidx.camera.core.impl.TagBundle getTagBundle() {
        return this.tagBundle;
    }

    @Override // androidx.camera.core.ImmutableImageInfo, androidx.camera.core.ImageInfo
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        int hashCode = (this.tagBundle.hashCode() ^ 1000003) * 1000003;
        long j17 = this.timestamp;
        return ((((hashCode ^ ((int) (j17 ^ (j17 >>> 32)))) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransformMatrix.hashCode();
    }

    public java.lang.String toString() {
        return "ImmutableImageInfo{tagBundle=" + this.tagBundle + ", timestamp=" + this.timestamp + ", rotationDegrees=" + this.rotationDegrees + ", sensorToBufferTransformMatrix=" + this.sensorToBufferTransformMatrix + "}";
    }
}

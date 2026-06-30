package androidx.camera.core.processing;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes14.dex */
public final class AutoValue_Packet<T> extends androidx.camera.core.processing.Packet<T> {
    private final androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult;
    private final android.graphics.Rect cropRect;
    private final T data;
    private final androidx.camera.core.impl.utils.Exif exif;
    private final int format;
    private final int rotationDegrees;
    private final android.graphics.Matrix sensorToBufferTransform;
    private final android.util.Size size;

    public AutoValue_Packet(T t17, androidx.camera.core.impl.utils.Exif exif, int i17, android.util.Size size, android.graphics.Rect rect, int i18, android.graphics.Matrix matrix, androidx.camera.core.impl.CameraCaptureResult cameraCaptureResult) {
        if (t17 == null) {
            throw new java.lang.NullPointerException("Null data");
        }
        this.data = t17;
        this.exif = exif;
        this.format = i17;
        if (size == null) {
            throw new java.lang.NullPointerException("Null size");
        }
        this.size = size;
        if (rect == null) {
            throw new java.lang.NullPointerException("Null cropRect");
        }
        this.cropRect = rect;
        this.rotationDegrees = i18;
        if (matrix == null) {
            throw new java.lang.NullPointerException("Null sensorToBufferTransform");
        }
        this.sensorToBufferTransform = matrix;
        if (cameraCaptureResult == null) {
            throw new java.lang.NullPointerException("Null cameraCaptureResult");
        }
        this.cameraCaptureResult = cameraCaptureResult;
    }

    public boolean equals(java.lang.Object obj) {
        androidx.camera.core.impl.utils.Exif exif;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.processing.Packet)) {
            return false;
        }
        androidx.camera.core.processing.Packet packet = (androidx.camera.core.processing.Packet) obj;
        return this.data.equals(packet.getData()) && ((exif = this.exif) != null ? exif.equals(packet.getExif()) : packet.getExif() == null) && this.format == packet.getFormat() && this.size.equals(packet.getSize()) && this.cropRect.equals(packet.getCropRect()) && this.rotationDegrees == packet.getRotationDegrees() && this.sensorToBufferTransform.equals(packet.getSensorToBufferTransform()) && this.cameraCaptureResult.equals(packet.getCameraCaptureResult());
    }

    @Override // androidx.camera.core.processing.Packet
    public androidx.camera.core.impl.CameraCaptureResult getCameraCaptureResult() {
        return this.cameraCaptureResult;
    }

    @Override // androidx.camera.core.processing.Packet
    public android.graphics.Rect getCropRect() {
        return this.cropRect;
    }

    @Override // androidx.camera.core.processing.Packet
    public T getData() {
        return this.data;
    }

    @Override // androidx.camera.core.processing.Packet
    public androidx.camera.core.impl.utils.Exif getExif() {
        return this.exif;
    }

    @Override // androidx.camera.core.processing.Packet
    public int getFormat() {
        return this.format;
    }

    @Override // androidx.camera.core.processing.Packet
    public int getRotationDegrees() {
        return this.rotationDegrees;
    }

    @Override // androidx.camera.core.processing.Packet
    public android.graphics.Matrix getSensorToBufferTransform() {
        return this.sensorToBufferTransform;
    }

    @Override // androidx.camera.core.processing.Packet
    public android.util.Size getSize() {
        return this.size;
    }

    public int hashCode() {
        int hashCode = (this.data.hashCode() ^ 1000003) * 1000003;
        androidx.camera.core.impl.utils.Exif exif = this.exif;
        return ((((((((((((hashCode ^ (exif == null ? 0 : exif.hashCode())) * 1000003) ^ this.format) * 1000003) ^ this.size.hashCode()) * 1000003) ^ this.cropRect.hashCode()) * 1000003) ^ this.rotationDegrees) * 1000003) ^ this.sensorToBufferTransform.hashCode()) * 1000003) ^ this.cameraCaptureResult.hashCode();
    }

    public java.lang.String toString() {
        return "Packet{data=" + this.data + ", exif=" + this.exif + ", format=" + this.format + ", size=" + this.size + ", cropRect=" + this.cropRect + ", rotationDegrees=" + this.rotationDegrees + ", sensorToBufferTransform=" + this.sensorToBufferTransform + ", cameraCaptureResult=" + this.cameraCaptureResult + "}";
    }
}

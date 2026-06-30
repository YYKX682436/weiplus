package androidx.camera.camera2.internal;

/* loaded from: classes16.dex */
final class AutoValue_CameraDeviceId extends androidx.camera.camera2.internal.CameraDeviceId {
    private final java.lang.String brand;
    private final java.lang.String cameraId;
    private final java.lang.String device;
    private final java.lang.String model;

    public AutoValue_CameraDeviceId(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null brand");
        }
        this.brand = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null device");
        }
        this.device = str2;
        if (str3 == null) {
            throw new java.lang.NullPointerException("Null model");
        }
        this.model = str3;
        if (str4 == null) {
            throw new java.lang.NullPointerException("Null cameraId");
        }
        this.cameraId = str4;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.camera2.internal.CameraDeviceId)) {
            return false;
        }
        androidx.camera.camera2.internal.CameraDeviceId cameraDeviceId = (androidx.camera.camera2.internal.CameraDeviceId) obj;
        return this.brand.equals(cameraDeviceId.getBrand()) && this.device.equals(cameraDeviceId.getDevice()) && this.model.equals(cameraDeviceId.getModel()) && this.cameraId.equals(cameraDeviceId.getCameraId());
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getBrand() {
        return this.brand;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getCameraId() {
        return this.cameraId;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getDevice() {
        return this.device;
    }

    @Override // androidx.camera.camera2.internal.CameraDeviceId
    public java.lang.String getModel() {
        return this.model;
    }

    public int hashCode() {
        return ((((((this.brand.hashCode() ^ 1000003) * 1000003) ^ this.device.hashCode()) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.cameraId.hashCode();
    }

    public java.lang.String toString() {
        return "CameraDeviceId{brand=" + this.brand + ", device=" + this.device + ", model=" + this.model + ", cameraId=" + this.cameraId + "}";
    }
}

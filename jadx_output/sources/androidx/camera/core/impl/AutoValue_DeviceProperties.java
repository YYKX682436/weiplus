package androidx.camera.core.impl;

/* loaded from: classes16.dex */
final class AutoValue_DeviceProperties extends androidx.camera.core.impl.DeviceProperties {
    private final java.lang.String manufacturer;
    private final java.lang.String model;
    private final int sdkVersion;

    public AutoValue_DeviceProperties(java.lang.String str, java.lang.String str2, int i17) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null manufacturer");
        }
        this.manufacturer = str;
        if (str2 == null) {
            throw new java.lang.NullPointerException("Null model");
        }
        this.model = str2;
        this.sdkVersion = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof androidx.camera.core.impl.DeviceProperties)) {
            return false;
        }
        androidx.camera.core.impl.DeviceProperties deviceProperties = (androidx.camera.core.impl.DeviceProperties) obj;
        return this.manufacturer.equals(deviceProperties.manufacturer()) && this.model.equals(deviceProperties.model()) && this.sdkVersion == deviceProperties.sdkVersion();
    }

    public int hashCode() {
        return ((((this.manufacturer.hashCode() ^ 1000003) * 1000003) ^ this.model.hashCode()) * 1000003) ^ this.sdkVersion;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public java.lang.String manufacturer() {
        return this.manufacturer;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public java.lang.String model() {
        return this.model;
    }

    @Override // androidx.camera.core.impl.DeviceProperties
    public int sdkVersion() {
        return this.sdkVersion;
    }

    public java.lang.String toString() {
        return "DeviceProperties{manufacturer=" + this.manufacturer + ", model=" + this.model + ", sdkVersion=" + this.sdkVersion + "}";
    }
}

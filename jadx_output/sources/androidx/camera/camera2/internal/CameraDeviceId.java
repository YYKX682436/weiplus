package androidx.camera.camera2.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public abstract class CameraDeviceId {
    public static androidx.camera.camera2.internal.CameraDeviceId create(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return new androidx.camera.camera2.internal.AutoValue_CameraDeviceId(str.toLowerCase(), str2.toLowerCase(), str3.toLowerCase(), str4.toLowerCase());
    }

    public abstract java.lang.String getBrand();

    public abstract java.lang.String getCameraId();

    public abstract java.lang.String getDevice();

    public abstract java.lang.String getModel();
}

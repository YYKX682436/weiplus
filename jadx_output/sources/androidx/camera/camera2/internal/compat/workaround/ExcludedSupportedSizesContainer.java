package androidx.camera.camera2.internal.compat.workaround;

/* loaded from: classes13.dex */
public class ExcludedSupportedSizesContainer {
    private final java.lang.String mCameraId;

    public ExcludedSupportedSizesContainer(java.lang.String str) {
        this.mCameraId = str;
    }

    public java.util.List<android.util.Size> get(int i17) {
        androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class);
        if (excludedSupportedSizesQuirk == null) {
            return new java.util.ArrayList();
        }
        return excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, i17);
    }

    public java.util.List<android.util.Size> get(java.lang.Class<?> cls) {
        androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk excludedSupportedSizesQuirk = (androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk) androidx.camera.camera2.internal.compat.quirk.DeviceQuirks.get(androidx.camera.camera2.internal.compat.quirk.ExcludedSupportedSizesQuirk.class);
        if (excludedSupportedSizesQuirk == null) {
            return new java.util.ArrayList();
        }
        return excludedSupportedSizesQuirk.getExcludedSizes(this.mCameraId, cls);
    }
}

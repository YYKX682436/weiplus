package androidx.camera.camera2.internal.compat;

/* loaded from: classes14.dex */
public class CameraCharacteristicsCompat {
    private final androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat.CameraCharacteristicsCompatImpl mCameraCharacteristicsImpl;
    private final java.lang.String mCameraId;
    private final java.util.Map<android.hardware.camera2.CameraCharacteristics.Key<?>, java.lang.Object> mValuesCache = new java.util.HashMap();
    private androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat mStreamConfigurationMapCompat = null;

    /* loaded from: classes14.dex */
    public interface CameraCharacteristicsCompatImpl {
        <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key);

        java.util.Set<java.lang.String> getPhysicalCameraIds();

        android.hardware.camera2.CameraCharacteristics unwrap();
    }

    private CameraCharacteristicsCompat(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mCameraCharacteristicsImpl = new androidx.camera.camera2.internal.compat.CameraCharacteristicsApi28Impl(cameraCharacteristics);
        } else {
            this.mCameraCharacteristicsImpl = new androidx.camera.camera2.internal.compat.CameraCharacteristicsBaseImpl(cameraCharacteristics);
        }
        this.mCameraId = str;
    }

    private boolean isKeyNonCacheable(android.hardware.camera2.CameraCharacteristics.Key<?> key) {
        return key.equals(android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public static androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat toCameraCharacteristicsCompat(android.hardware.camera2.CameraCharacteristics cameraCharacteristics, java.lang.String str) {
        return new androidx.camera.camera2.internal.compat.CameraCharacteristicsCompat(cameraCharacteristics, str);
    }

    public <T> T get(android.hardware.camera2.CameraCharacteristics.Key<T> key) {
        if (isKeyNonCacheable(key)) {
            return (T) this.mCameraCharacteristicsImpl.get(key);
        }
        synchronized (this) {
            T t17 = (T) this.mValuesCache.get(key);
            if (t17 != null) {
                return t17;
            }
            T t18 = (T) this.mCameraCharacteristicsImpl.get(key);
            if (t18 != null) {
                this.mValuesCache.put(key, t18);
            }
            return t18;
        }
    }

    public java.util.Set<java.lang.String> getPhysicalCameraIds() {
        return this.mCameraCharacteristicsImpl.getPhysicalCameraIds();
    }

    public androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat getStreamConfigurationMapCompat() {
        if (this.mStreamConfigurationMapCompat == null) {
            try {
                android.hardware.camera2.params.StreamConfigurationMap streamConfigurationMap = (android.hardware.camera2.params.StreamConfigurationMap) get(android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new java.lang.IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.mStreamConfigurationMapCompat = androidx.camera.camera2.internal.compat.StreamConfigurationMapCompat.toStreamConfigurationMapCompat(streamConfigurationMap, new androidx.camera.camera2.internal.compat.workaround.OutputSizesCorrector(this.mCameraId));
            } catch (java.lang.AssertionError | java.lang.NullPointerException e17) {
                throw new java.lang.IllegalArgumentException(e17.getMessage());
            }
        }
        return this.mStreamConfigurationMapCompat;
    }

    public boolean isZoomOverrideAvailable() {
        int[] iArr;
        if (android.os.Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.mCameraCharacteristicsImpl.get(android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i17 : iArr) {
                if (i17 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public android.hardware.camera2.CameraCharacteristics toCameraCharacteristics() {
        return this.mCameraCharacteristicsImpl.unwrap();
    }
}
